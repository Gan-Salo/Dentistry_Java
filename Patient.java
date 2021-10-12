import java.util.Scanner;
public class Patient {

	String fio;
	int age;
	String phone;


	public Patient(){
		this.fio = "fio";
		this.age = -1;
		this.phone = "Error";
	}

	public Patient(String fio, int age, String phone){
		this.fio = fio;
		this.age = age_check(age);
		this.phone = phone_check(phone);
	}

	public int age_check(int age){
		if (age > 0 && age < 120){
			return age;
		}
		else{ 
			System.out.print("Îøèáêà, ââåäèòå ïğàâèëüíûé âîçğàñò\n");
			return -1;
		}	
	}

	public String phone_check(String phone){
		
		//boolean result = phone.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");
		boolean result = phone.matches("(\\+*)\\d{11}");

		if(result){
    		return phone;
		}
		else{
    		return "Error";    
		}
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your fio: ");
		this.fio = scanner.nextLine();
				
		while (age < 0){
			System.out.print("Your age: ");
			try {

				this.age = age_check(scanner.nextInt()); 
			}
			catch (Exception e){
				System.out.print("Îøèáêà. Âîçğàñò ââåä¸í íåïğàâèëüíî.\n");				
				age = -1;
				scanner.nextLine();
			}
			
		}
		scanner.nextLine();
		while (phone == "Error"){
			System.out.print("Your phone: ");
			this.phone = phone_check(scanner.nextLine()); 
		}
	}

	public void output(){
		System.out.print("Fio: " + this.fio + ", Age: " + this.age + ", Phone: " + this.phone + "\n");
	}

}