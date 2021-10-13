import java.util.Scanner;
public class Dolznost {

	String title;
	String podrazdel;

	public Dolznost(){
		this.title = "title";
		this.podrazdel = "test_pod";
	}

	public Dolznost(String title, String podrazdel){
		this.title = title;
		this.podrazdel = podrazdel;
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Название должности: ");
		this.title = scanner.nextLine();
		
		System.out.print("Подразделение: ");
		this.podrazdel = scanner.nextLine();
	}

	public void output(){
		System.out.print("Название должности: " + this.title + ", Подразделение: " + this.podrazdel + "\n");
	}

	public void changecost(String podrazdel){
		this.podrazdel = podrazdel;
	}

}