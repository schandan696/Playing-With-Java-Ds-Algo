import java.util.*;
class password_or_random_number_genrater {

	public static void main(String[] args) {
		System.out.println("========== Pres 1 to genrate OTP ==========");
		System.out.println("========== Pres 2 to genrate OTP ==========");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		if(N == 1)
			System.out.println(OTP(6));
		else
			System.out.println(password(10));
	}

	static char[] password (int len){
		System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");
        
        String Capital_c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_c = "abcdefghijklmnopqrstuvwxyz";
        String Number_c = "1234567890";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        String value = Capital_c + Small_c + Number_c + symbols;
      
        Random rndm = new Random();
        char[] password = new char[len];
        for(int i = 0; i < len; i++){
        	password[i] = value.charAt(rndm.nextInt(value.length()));
        }
      return password;  	
	}
	 static char[] OTP(int len)
	    {
	        System.out.println("Generating OTP using random() : ");
	        System.out.print("You OTP is : ");
	        String numbers = "0123456789";
	        Random rndm = new Random();
	        char[] otp = new char[len];
	        for (int i = 0; i < len; i++)
	        {
	            otp[i] = numbers.charAt(rndm.nextInt(numbers.length()));
	        }
	        return otp;
	    }
}
