package ConsistentHashing;

public class HashBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashRing ring = new HashRing();
		ring.addNode("aqqweqwe2qwe");
		ring.addNode("qweqe3qwem");
		ring.addNode("ddqweqwe23");
		ring.addNode("trtyhreerf");
		ring.addNode("vwerehsq");
		ring.addNode("z");

		ring.cacheUrl("asdasdawads");
		System.out.println(" ");
		for(Node n : ring.getAllNodes()) {
			System.out.println("urls on node "+n.Id+" are "+n.urls);
		}
		
		System.out.println(" ");
		ring.deleteNode("ddqweqwe23");
		System.out.println(" ");
		
		for(Node n : ring.getAllNodes()) {
			System.out.println("urls on node "+n.Id+" are "+n.urls);
		}

	}

}
