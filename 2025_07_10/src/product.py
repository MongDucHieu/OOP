from abc import ABC, abstractmethod

class Product(ABC):
    def __init__(self, product_id: str, name: str, price: float):
        self.id = product_id
        self.name = name
        self.price = price

    @abstractmethod
    def get_info(self) -> str:
        pass

class ElectronicProduct(Product):
    def __init__(self, product_id: str, name: str, price: float, imei: str, warranty_months: int):
        super().__init__(product_id, name, price)
        self.imei = imei
        self.warranty_months = warranty_months

    def get_info(self) -> str:
        return f"[Electronic] {self.name} - IMEI: {self.imei}, Warranty: {self.warranty_months} months, Price: {self.price}đ"

class FoodProduct(Product):
    def __init__(self, product_id: str, name: str, price: float, expiry_date: str):
        super().__init__(product_id, name, price)
        self.expiry_date = expiry_date

    def get_info(self) -> str:
        return f"[Food] {self.name} - Expiry: {self.expiry_date}, Price: {self.price}đ"
