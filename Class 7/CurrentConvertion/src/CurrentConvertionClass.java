import java.util.Scanner;

public class CurrentConvertionClass {
	public static int selectedCurrency = 0;
	public static double CADValue = 0;
	public static double USDValue = 0;
	public static double REALValue = 0;
	
	public static void ShowCoins() {
		System.out.println("CAD: " + CADValue);
		System.out.println("USD: " + USDValue);
		System.out.println("REAL: " + REALValue);
		System.out.println("Thanks for using the system");
	}
	
	public static void SelectTheAmount(){
		System.out.println("Type the amount:");
		
		try {
			Scanner reader = new Scanner(System.in);
			
			Double n = reader.nextDouble(); 
			
			switch(selectedCurrency) {
			case 1:
				//CAD
				//to REAL * 3.75
				//to USD * 0.75
				CADValue = n;
				USDValue = n * 0.75;
				REALValue = n * 3.75;
				ShowCoins();
				break;
				
			case 2:
				//USD	
				//to CAD * 1.33
				//to REAL * 3.76
				CADValue = n * 1.33;
				USDValue = n;
				REALValue = n * 3.76;
				ShowCoins();
				break;
				
			case 3:
				//BR
				//to Canada * 0.35
				//to USD * 0.27
				CADValue = n * 0.35;
				USDValue = n * 0.27;
				REALValue = n;
				ShowCoins();
				break;
				
			
			}
		
		}catch(Exception e){
			System.out.println("You didnt insert a proper amount. Bye");
		}
	}
	
	public static boolean ValidateMenuSelected(int numberSelected) {
		if( ((numberSelected == 1 ) ||  (numberSelected == 2 ) || (numberSelected == 3 ))) {
			CurrentConvertionClass.selectedCurrency = numberSelected;
			return true;
			
		}
		else {
			return false;
		}
		
	}
	
	public static void LastTry() {
		try {
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Invalid choice, please choose 1, 2, or 3");

			reader = new Scanner(System.in);
			
			int n = reader.nextInt();
			
			//goes to the next step
			if(ValidateMenuSelected(n)) {
				SelectTheAmount();
			}else {
				System.out.println("Wrong, Bye");
			}
			}
			catch (Exception innerException) {
				System.out.println("Wrong, Bye");
			}
		
			
		
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.println("Select the currency:");
		System.out.println("1) CAD");
		System.out.println("2) USD");
		System.out.println("3) REAL");
		
		try {
			//1st scenario, if the user doesnt include number, it will show an error message
			int n = reader.nextInt(); 
			
			//goes to the next step
			if(ValidateMenuSelected(n)) {
				SelectTheAmount();
			}else {
				LastTry();
			}
			
			
		}catch (Exception e){
			LastTry();
		}
	
		
		
	}

}
