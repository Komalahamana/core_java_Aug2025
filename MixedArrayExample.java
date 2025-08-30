package com.ksg.array;

public class MixedArrayExample {
	
	public static void main(String[] args) {
		
		Object[] mixedArray = new Object[6];
		
		mixedArray[0] = 100;            // Integer
        mixedArray[1] = 99.99;          // Double
        mixedArray[2] = 'A';            // Character
        mixedArray[3] = true;           // Boolean
        mixedArray[4] = "Hello World";  // String
        mixedArray[5] = 50.5f;          // Float
		
        for (Object element : mixedArray) {
            System.out.println(element + " (Type: " + element.getClass().getSimpleName() + ")");
        }
	}

}
