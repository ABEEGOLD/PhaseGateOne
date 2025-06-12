
import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	String cardNumber1 = "4688266418896625";
	String cardNumber2 = "5688266418896625";
	String cardNumber3 = "37688266418896625";
	String cardNumber4 = "6688266418896625";
		

	System.out.print("Hello, Enter card details to verify:");
	String cardValidate = input.nextLine();

	System.out.print("Credit card digit length is:"+ ValidateVisa(number));


	if(cardNumber.startsWith("4")){
		System.out.println("Check credit card type:"+cardNumber1 + "is Visa");
	}
	if(cardNumber.startsWith("5")){
		System.out.println("Check credit card type:"+cardNumber2 + "is MasterCard");
	}

	if(cardNumber.startsWith("37")){
		System.out.println("Check credit card type:"+cardNumber3 + "is AmericanExpress");
	}


	if(cardNumber.startsWith("6")){
		System.out.println("Check credit card type:"+cardNumber4 + "is discovers");
	


	


//System.out.println("Check credit card type:"+);
//System.out.println("credit card number is:"+ );
//System.out.println("Credit card digit length is:"));
	




	}


public static boolean ValidateVisa(String number){
	
	if(number != "4"){
		return false;	
	}		
	int sum = 0;
    boolean doubleSecondDigit = false;

    for (int i = number.length() - 1; i >= 0; i--) {
        int digit = Character.getNumericValue(number.charAt(i));
        if (doubleSecondDigit) {
            digit *= 2;
	}
            if (digit > 9){
		 digit -= 9;
        }
        sum += digit;
        doubleSecondDigit = !doubleSecondDigit;
   
	}return sum % 10 == 0;
				
			
	
		

}

//public static boolean 




}