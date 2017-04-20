public class Binaries {
	private int[] bits = {128, 64, 32, 16, 8, 4, 2, 1};
	
	public int Binary(int number) {
		boolean binary;
		for (int b: number) {
			if ((String)number.charAt(b) != 1 || (String)number.charAt(b) != 0) {
				binary = false;
			} else {
				binary = true;
			}
		}
		
		if (!binary) {
			int decimal = number;
        		String binary = "";
         		while ( decimal > 0 ) {
         			for (int i = 0; i < bytes.length; i++) {
           				if (decimal < 256) {
             					if (decimal >= bits[i]) {
               						decimal -= bits[i];
                 					binary += "" + 1 + "";
             					} else {
                 					binary +="" + 0 + "";
             					}
           				} else {
               					decimal -= 255;
               					binary += "" + 11111111 + " ";
           				}
         			}
         			return binary;
       			}
		} else if (binary) {
			this((String)binary); //Passes to String version of Binary
		} else {
			System.out.println("Something went wrong. That's all we know. :(");
			return -1;
		}
	}
	
	public String Binary(String words) {
		boolean binary;
		
		for (String b: words) {
			if (words.charAt(b) != 1 || words.charAt(b) != 0) {
				binary = false;
			} else {
				binary = true;
			}
			
			if (!binary) {
				//Needs function to convert text to binary
				
			} else if (binary) {
				//Needs function to convert binary to text
				int step = 0;
				
				for (int i = 0; i < words.length/8; i++) {
					for (int j = 0 + (step * 8); j < (words.length/8)+(step*8); j++) {
						
					}
				}
			} else {
				return "Something went wrong. That's all we know. :(";
			}
		}
	}
}
