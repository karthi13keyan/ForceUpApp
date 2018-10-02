package util;

import java.util.UUID;

public class GenericUtil {
	
	private GenericUtil() {
		
	}
	
	/**
	 * 
	 * Generates a RandomString for access key purposes.
	 */
	public static String generateRandomString() {
		return UUID.randomUUID().toString().replace("-", "");
	}

}
