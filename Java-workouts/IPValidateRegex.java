package workouts;

import java.util.Scanner;
import java.util.regex.Pattern;

//public class IPValidateRegex {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String ipAddress = sc.nextLine();
//		IPValidateRegex ivr = new IPValidateRegex();
//		System.out.println(ivr.IpValidation(ipAddress));
//		sc.close();
//	}
//
//	public boolean IpValidation(String s) {
//		validateIP vip = new validateIP();
//		return vip.validateIPAddress(s);
//	}
//
//	private class validateIP {
//		private boolean validateIPAddress(String IpAddress) {
//
//			boolean isValid = Pattern.matches("[0-9]{2,3}.[0-9]{2,3}.[0-9]{2,3}.[0-9]{2,3}", IpAddress);
//
//			return isValid;
//		}
//	}
//}



class IPValidateRegex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{
	
		String beginToEnd = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String pattern =  beginToEnd +"\\."+ beginToEnd +"\\."+ beginToEnd +"\\."+ beginToEnd;
}