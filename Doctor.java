import java.util.Scanner;
public class Doctor {

	String fio;
	int age;
	String phone;
	Dolznost dolzn;
	String kategory;

	public Doctor(){
		this.fio = "fio";
		this.age = -1;
		this.phone = "Error";
		this.dolzn = new Dolznost();
		this.kategory = "kategory";
	}

	public Doctor(String fio, int age, String phone, Dolznost dolzn, String kategory){
		this.fio = fio;
		this.age = age_check(age);
		this.phone = phone_check(phone);
		this.dolzn = dolzn;
		this.kategory = kategory;
	}

	public int age_check(int age){
		if (age > 0 && age < 120){
			return age;
		}
		else{ 
			System.out.print("������, ������� ���������� ������� (�� 1 �� 120)\n");
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
		System.out.print("��� ���������: ");
		this.fio = scanner.nextLine();
				
		while (age < 0){
			System.out.print("������� ���������: ");
			try {

				this.age = age_check(scanner.nextInt()); 
			}
			catch (Exception e){
				System.out.print("������. ������� ����� �����������.\n");				
				age = -1;
				scanner.nextLine();
			}
			
		}
		scanner.nextLine();
		while (phone == "Error"){
			System.out.print("������� ���������: ");
			this.phone = phone_check(scanner.nextLine()); 
		}

		this.dolzn.input();

		System.out.print("���������: ");
		this.kategory = scanner.nextLine();
	}

	public void output(){
		System.out.print("���: " + this.fio + ", �������: " + this.age + ", �������: " + this.phone + ", ���������: " + this.dolzn + ", ���������: " + this.kategory + "\n");
	}

}