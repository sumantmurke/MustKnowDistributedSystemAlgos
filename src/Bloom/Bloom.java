package Bloom;

public class Bloom {
	
	
	int size;
	int[] filter;
	
	public Bloom(int size) {
		this.size = size;
		filter = new int[size];
	}
	
	public void addKey(String key) {
		
		int bloomIndex = hash(key);
		int bitIndex = bitIndex(key);
		
		
		
		byte mask = (byte) (1 << bitIndex);
		int currentVal = filter[bloomIndex];
		
		System.out.println("current value for key "+ key
				+" in the filter for index "+bloomIndex+ " with bitIndex "+ 
				bitIndex+" is "+currentVal);
		
		
		filter[bloomIndex]=(currentVal | mask);
		
		System.out.println(filter[bloomIndex]);
		System.out.println(" ");
		
		
	}
	
	public boolean isKey(String key) {
		
		int bloomIndex = hash(key);
		int bitIndex = bitIndex(key);
		
		byte mask = (byte) (1 << bitIndex);
		int currentVal = filter[bloomIndex];
        return (currentVal & mask) != 0;
        
	}

	public int hash(String key) {
		return key.hashCode()%this.size;
	}
	
	public int bitIndex(String key) {
		return key.hashCode()%8;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to bloom filter");
		System.out.println(" ");
		
		Bloom bloom = new Bloom(1);
		String[] presentInSet = {"a", "b", "c", "d", "e", "f"};
		
		for(String a : presentInSet) {
			bloom.addKey(a);
		}
		
		String[] needToCheck = {"i","j","k","h" };
		
		for(String a : needToCheck) {
			System.out.println("Key "+a+" present is "+bloom.isKey(a));
		}

	}

}
