public class Main {
	public static void main(String[] args) {
		

		Patient pat = new Patient();
		pat.input();
		pat.output();


		//String pat("fio222", 12, "+098338383");
		String test_phone = "+893393992122";

		boolean result = test_phone.matches("(\\+*)\\d{11}");

		if(result){
    		System.out.println("It is a phone number");
		}
		else{
    		System.out.println("It is not a phone number!");    
		}

	}
}
