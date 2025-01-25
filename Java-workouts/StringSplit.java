package workouts;

public class StringSplit {

	public static void main(String[] args) {
//		 Scanner scan = new Scanner(System.in);
//	        String s = scan.nextLine();
		
		String s = "          ";
		int lengthOfarrray = s.trim().length();
	        // Write your code here.
		String wordString[] = s.trim().split("[\\s@&.?$+-,'!_]+");
		if(lengthOfarrray == 0) {
			lengthOfarrray = 0;
		}else {
			lengthOfarrray = wordString.length;
		}
		System.out.println(lengthOfarrray);
	        for(int i=0; i<wordString.length;i++){
	            System.out.println(wordString[i]);
	        }
	        

	}

}
