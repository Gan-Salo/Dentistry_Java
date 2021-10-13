import java.util.Scanner;
public class Zapis {

	Usluga ulsuga;
	Doctor doctor;
	Patient patient;
	Cabinet cabinet;
	String date;

	public Zapis(){
		this.ulsuga = new Usluga();
		this.doctor = new Doctor();
		this.patient = new Patient();
		this.cabinet = new Cabinet();
		this.date = "12.12.2012";
	}

	public Zapis(Usluga usluga, Doctor doctor, Patient patient, Cabinet cabinet, String date){
		this.ulsuga = ulsuga;
		this.doctor = doctor;
		this.patient = patient;
		this.cabinet = cabinet;
		this.date = date;
	}


	public void input(){

		
		System.out.print("Дата приёма: ");
		this.date = scanner.nextLine();
	}

	public void output(){
		System.out.print("ФИО: " + this.fio + ", Возраст: " + this.age + ", Телефон: " + this.phone + ", Должность: " + this.dolzn + ", Категория: " + this.kategory + "\n");
	}

}