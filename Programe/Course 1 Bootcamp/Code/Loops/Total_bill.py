book1_price = 499.00
book2_price = 855.00
book3_price = 645.00

subtotal = book1_price + book2_price + book3_price
taxes = 0.12 * subtotal
delivery_charges = 250.00

total = subtotal + taxes + delivery_charges

print("Subtotal: Rs.", subtotal)
print("GST: Rs.", taxes)
print("Delivery Charges: Rs.", delivery_charges)
print("Total Amount: Rs.", total)