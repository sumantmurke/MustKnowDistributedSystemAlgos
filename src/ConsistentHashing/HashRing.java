package ConsistentHashing;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.TreeMap;

public class HashRing {

	NavigableMap<Integer, Node> nodeMap;
	Hashing hash;
	
	public HashRing() {
		this.nodeMap = new TreeMap<>();
		this.hash = new Hashing();
	}
	
	public void addNode(String name) {
		int hashValue = hash.getMurmur3Hash(name);
		Node node = new Node(hashValue, name);
		nodeMap.put(hashValue, node);	
	}
	
	public void deleteNode(String name) {
		int hashValue = hash.getMurmur3Hash(name);
		Node node = nodeMap.get(hashValue);
		
		HashSet<String> urls = new HashSet<String>(node.urls);
		nodeMap.remove(hashValue);
		
		for(String u : urls) {
			cacheUrl(u);
		}
		
	}
	
	public void cacheUrl(String url) {
		int hashValueOfUrl = hash.getMurmur3Hash(url);
		
		Node node = getNode(hashValueOfUrl);
		
		node.urls.add(url);
		System.out.println("Cached url "+url+ " in node "+node.Id);
	}
	
	private Node getNode(int key) {
		
		Integer nodeKey = nodeMap.higherKey(key);
		
		if(nodeKey == null) {
			nodeKey = nodeMap.firstKey();
		}
		
		return nodeMap.get(nodeKey);
		
	}
	
	public Collection<Node> getAllNodes(){
		return nodeMap.values();
	}

}
