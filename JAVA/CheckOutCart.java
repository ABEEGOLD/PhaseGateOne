import java.util.ArrayList;
import java.util.Scanner;
public class CheckOutCart{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
	ArrayList<String> itemBought = new ArrayList<>();
        ArrayList<Integer> numOfProduct = new ArrayList<>();
        ArrayList<Double> amountPerUnit = new ArrayList<>();



	System.out.print("Enter customer's name: ");
        String customerName = input.nextLine();

	System.out.print("Enter cashier's name: ");
        String cashierName = input.nextLine();

	double total = 0, VAT_RATE = 0.075;


while (true){
	System.out.println("What did the user buy?:");
	String userPurchased = input.nextLine();
	itemBought.add(userPurchased);

	System.out.println("Enter quantity:");
        int quantity = input.nextInt();
	numOfProduct.add(quantity);

	System.out.println("How much per unit?:");
	double UnitPerProduct = input.nextDouble();
	amountPerUnit.add(UnitPerProduct);
	
	total += quantity * UnitPerProduct;

	System.out.print("Add more items? (yes/no): ");
        input.nextLine(); 
        String response = input.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;

	    }

}	
	
	System.out.print("How much did the customer gave you?:");
	int amountGiven = input.nextInt();

	System.out.print("Enter discount percentage (e.g., 10 for 10%): ");
        double discountRate = input.nextDouble();
	discountRate = discountRate / 100;
        double discount = total * discountRate;
        double vat = total * VAT_RATE;
        double grandTotal = total - discount + vat;
	double totalBill = total + vat;
	double balanceGiven = amountGiven -= totalBill; 

	
System.out.println("SEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
		System.out.println("TEL: 03293828343");
		System.out.println("DATE : 18-AUGUST-24  8:48:11pms");
		System.out.println("Cashier: "+cashierName);
		System.out.println("Customer Name: "+customerName);
		System.out.println("\n=========================================================\n");
		System.out.printf("%22s%10s%10s%15s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.print("\n---------------------------------------------------------\n");

		
	for (int i = 0; i < itemBought.size(); i++) {
        	double totalItemPrice = numOfProduct.get(i) * amountPerUnit.get(i);
            	System.out.printf("%-20s %10d %10.2f %15.2f%n",itemBought.get(i), numOfProduct.get(i), amountPerUnit.get(i), totalItemPrice);
        }




System.out.println("---------------------------------------------------------");
        System.out.printf("Subtotal: %38.2f NGN%n", total);
        System.out.printf("Discount: %37.2f NGN%n", discount);
        System.out.printf("VAT (7.5%%): %36.2f NGN%n", vat);
        System.out.printf("Total Payable: %30.2f NGN%n", grandTotal);

	
	
System.out.println("=========================================================");
System.out.printf("Bill total: %38.2f NGN%n",totalBill);
System.out.printf("Amount paid: %30.2f NGN%n",grandTotal);
System.out.printf("Balance: %36.2f NGN%n",balanceGiven);



System.out.println("==========================================================");

System.out.println("THANK YOU FOR YOUR PATRONAGE!");

System.out.println("===========================================================");



	}	

}