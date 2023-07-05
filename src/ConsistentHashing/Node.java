package ConsistentHashing;

import java.util.HashSet;

public class Node {
	
	int Id;
	String name;
	HashSet<String> urls;
	Node(int id, String name){
		this.Id = id;
		this.name = name;
		this.urls = new HashSet<String>();
	}
		
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public HashSet<String> getUrls(){
		return urls;
	}
	
	
	@Override
	public boolean equals(Object o) {
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
		
	}

}
