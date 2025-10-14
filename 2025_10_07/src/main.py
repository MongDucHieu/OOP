from product import ElectronicProduct, FoodProduct
from payment import CashPayment, CreditCardPayment, MomoPayment
from order import Order

def main():
    # Create some products
    p1 = ElectronicProduct("E01", "iPhone 15", 20000000, "123456789", 12)
    p2 = FoodProduct("F01", "Cookies", 50000, "12/2025")

    # Order 1 - cash
    order1 = Order("Nguyễn Văn A")
    order1.add_product(p1)
    order1.add_product(p2)
    order1.set_payment_method(CashPayment())
    order1.checkout()

    # Order 2 - credit card
    order2 = Order("Nguyễn Văn B")
    order2.add_product(p2)
    order2.set_payment_method(CreditCardPayment())
    order2.checkout()

    # Order 3 - momo
    order3 = Order("Nguyễn Văn C")
    order3.add_product(p1)
    order3.set_payment_method(MomoPayment())
    order3.checkout()

if __name__ == "__main__":
    main()
