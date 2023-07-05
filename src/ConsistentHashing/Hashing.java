package ConsistentHashing;

import org.apache.commons.codec.digest.MurmurHash3;

public class Hashing {
	
	
	/**
     * Generates 32-bit hash from the byte array with a default seed.
     * This is a helper method that will produce the same result as:
     */
	public int getMurmur3Hash(String seed) {
		
		// if seed is null throw
		
		byte[] seedByte = seed.getBytes();
		int hash = MurmurHash3.hash32(seedByte);
		
		System.out.print("hash for seed "+seed+" is "+hash);
		
		return hash;
	}

}
