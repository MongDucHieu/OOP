from typing import List, Optional
from product import Product
from payment import PaymentMethod

class Order:
    def __init__(self, customer_name: str):
        self.customer_name = customer_name
        self.products: List[Product] = []
        self.payment_method: Optional[PaymentMethod] = None

    def add_product(self, product: Product) -> None:
        self.products.append(product)

    def get_total(self) -> float:
        return sum(p.price for p in self.products)

    def set_payment_method(self, payment_method: PaymentMethod) -> None:
        self.payment_method = payment_method

    def checkout(self) -> None:
        if not self.products:
            print("Đơn hàng rỗng!")
            return
        if not self.payment_method:
            print("Chưa chọn phương thức thanh toán!")
            return

        total = self.get_total()
        print(f"\nKhách hàng: {self.customer_name}")
        print("Danh sách sản phẩm:")
        for p in self.products:
            print(" -", p.get_info())
        print(f"Tổng tiền: {total:,.0f}đ")
        self.payment_method.pay(total)
