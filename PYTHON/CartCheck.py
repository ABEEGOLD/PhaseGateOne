
		
item_Bought = []
num_Of_Product = []
amount_Per_Unit = [] 


customer_Name = input("Enter customer's name:")
cashier_Name = input("Enter cashier's name:")

total = 0 
VAT_RATE = 0.075


while True:
	user_Purchased = input("What did the user buy?:")
	item_Bought.append(user_Purchased)

	quantity = input("Enter quantity:")
	num_Of_Product.append(quantity)

	unit_Per_Product = input("How much per unit?:")
	amount_Per_Unit.append(unit_Per_Product)
	
	total += int(quantity) * float(unit_Per_Product)

	response = input("Add more items? (yes/no): ")
	if response == "no":
                break



	
	
amount_Given = int(input("How much did the customer gave you?:"))
	  
discount_Rate = input("Enter discount percentage (e.g., 10 for 10%): ")
discount_Rate = float(discount_Rate) / 100
discount = total * discount_Rate
vat = total * VAT_RATE
grand_Total = total - discount + vat
total_Bill = total + vat
balance_Given = amount_Given - total_Bill 

	
print("SEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
print("TEL: 03293828343")
print("DATE : 18-AUGUST-24  8:48:11pms")
print("Cashier: "+cashier_Name)
print("Customer Name: "+customer_Name)
print("\n=========================================================\n")
print(f"{'ITEM':>22} {'QTY':>10} {'PRICE':>10} {'TOTAL(NGN)':>15}")
print("\n---------------------------------------------------------\n")

		
for i in range(len(item_Bought)):
	total_Item_Price = int(num_Of_Product[i]) * float(amount_Per_Unit[i])
	print(f"{item_Bought[i]:<20} {num_Of_Product[i]:>10} {amount_Per_Unit[i]:>20.2f} {total_Item_Price:>15.2f}")

       
print("---------------------------------------------------------")
print(f"{'Subtotal:':>20} {total:>15.2f} NGN")
print(f"{'Discount:':>20} {discount:>15.2f} NGN")
print(f"{'VAT (7.5%):':>20} {vat:>15.2f} NGN")
print(f"{'Total Payable:':>20} {grand_total:>15.2f} NGN")

	
	
print("=========================================================")
print(f"{'Bill total:':>20} {total_Bill:>15.2f} NGN")
print(f"{'Amount paid:':>20} {grand_Total:>15.2f} NGN")
print(f"{'Balance:':>20} {balance_Given:>15.2f} NGN")



print("==========================================================")

print("THANK YOU FOR YOUR PATRONAGE!")

print("===========================================================")



		

