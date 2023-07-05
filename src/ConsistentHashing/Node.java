package ConsistentHashing;

public class Node {
	
	int Id;
	String name;

	Node(int id, String name){
		this.Id = id;
		this.name = name;
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

}
