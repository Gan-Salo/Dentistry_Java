import java.util.Scanner;
public class Usluga {

	String title;
	int cost;

	public Usluga(){
		this.title = "title";
		this.cost = -1;
	}

	public Usluga(String title, int cost){
		this.title = title;
		this.cost = cost_check(cost);
	}

	public int cost_check(int area){
		if (cost > 0 && cost < 10000000){
			return cost;
		}
		else{ 
			System.out.print("Ошибка, введите правильную стоимость услуги (от 1 до 10000000)\n");
			return -1;
		}	
	}

		public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Название услуги: ");
		this.title = scanner.nextLine();
		
		while (cost < 0){
			System.out.print("Стоимость услуги: ");
			try {

				this.cost = cost_check(scanner.nextInt()); 
			}
			catch (Exception e){
				System.out.print("Ошибка. Стоимость введёна неправильно.\n");				
				cost = -1;
				scanner.nextLine();
			}		
		}
	}

	public void output(){
		System.out.print("Название услуги: " + this.title + ", Стоимость: " + this.cost + "\n");
	}

	public void changetitle(String title){
		this.title = title;
	}

}