from abc import ABC, abstractmethod

class PaymentMethod(ABC):
    @abstractmethod
    def pay(self, amount: float) -> None:
        pass

class CashPayment(PaymentMethod):
    def pay(self, amount: float) -> None:
        print(f"Thanh toán tiền mặt thành công. Tổng tiền: {amount:,.0f}đ")

class CreditCardPayment(PaymentMethod):
    def pay(self, amount: float) -> None:
        print(f"Thanh toán bằng thẻ tín dụng thành công. Tổng tiền: {amount:,.0f}đ")

class MomoPayment(PaymentMethod):
    def pay(self, amount: float) -> None:
        print(f"Thanh toán qua Momo thành công. Tổng tiền: {amount:,.0f}đ")
