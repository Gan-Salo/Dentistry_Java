import java.util.Scanner;
public class Cabinet {

	int number;
	String otdelen;
	int area;

	public Cabinet(){
		this.number = -1;
		this.otdelen = "otd";
		this.area = -1;
	}

	public Cabinet(int number, String otdelen, int area){
		this.number = num_check(number);
		this.otdelen = otdelen;
		this.area = area_check(area);
	}

	public int num_check(int number){
		if (number > 0 && number < 1000){
			return number;
		}
		else{ 
			System.out.print("Îøèáêà, ââåäèòå ïğàâèëüíûé íîìåğ (îò 1 äî 1000)\n");
			return -1;
		}	
	}

	public int area_check(int area){
		if (area > 0 && area < 100000){
			return area;
		}
		else{ 
			System.out.print("Îøèáêà, ââåäèòå ïğàâèëüíóş ïëîùàäü (îò 1 äî 100000)\n");
			return -1;
		}	
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);
		
						
		while (number < 0){
			System.out.print("Íîìåğ êàáèíåòà: ");
			try {

				this.number = num_check(scanner.nextInt()); 
			}
			catch (Exception e){
				System.out.print("Îøèáêà. Íîìåğ êàáèíåòà ââåä¸í íåïğàâèëüíî.\n");				
				number = -1;
				scanner.nextLine();
			}		
		}

		scanner.nextLine();
		System.out.print("Îòäåëåíèå: ");
		this.otdelen = scanner.nextLine();
		

		while (area < 0){
			System.out.print("Ïëîùàäü êàáèíåòà ");
			try {

				this.area = area_check(scanner.nextInt()); 
			}
			catch (Exception e){
				System.out.print("Îøèáêà. Ïëîùàäü êàáèíåòà ââåä¸íà íåïğàâèëüíî.\n");				
				area = -1;
				scanner.nextLine();
			}		
		}

		scanner.nextLine();
	}

	public void output(){
		System.out.print("Íîìåğ êàáèíåòà: " + this.number + ", Îòäåëåíèå: " + this.otdelen + ", Ïëîùàäü êàáèíåòà: " + this.area + "\n");
	}

}