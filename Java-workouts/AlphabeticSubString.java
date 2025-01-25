package workouts;

public class AlphabeticSubString {

	public static void main(String[] args) {
		
		System.out.println(AlphabeticSubString.getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs", 30));;
	}
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int index = 0;
        int lengthOfs = s.length();
        String subString1 = "";
        while(lengthOfs > index && lengthOfs >= k){
            subString1 = s.substring(index, k);
            index = index + 1;
            k = k+1;
            if(largest.isEmpty()) {
            	largest = subString1;
            } else if(largest.compareTo(subString1) > 0){
            	largest = subString1;
            }
            
            if(smallest.isEmpty()) {
            	smallest = subString1;
            } else if(subString1.compareTo(smallest) > 0){
            	smallest = subString1;
            }
        }
        
        return smallest + "\n" + largest;
    }

}
