package blake2;

import java.io.*;

public class Main {

	public static void main(String args[]) throws UnsupportedEncodingException {
		
		//System.out.println("Hello, World!");
		
		String input = "Hello, world";
		byte[] output = null;
		String outputText = null;
		
		BLAKE2b_Algorithm test = new BLAKE2b_Algorithm();
	
		output = test.CalculateHash(input.getBytes());
		outputText = test.bytesToHex(output);
		
		System.out.println(input);
		System.out.println(outputText);
		
		
		
	}
}
