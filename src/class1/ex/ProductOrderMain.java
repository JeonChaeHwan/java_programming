package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;

        ProductOrder[] totalOrder = {dubu, kimchi, coke};

        int totalPrice = 0;
        for(int i = 0; i < totalOrder.length; i++){
            System.out.println("상품명: " + totalOrder[i].productName + ", 가격: " +
                    totalOrder[i].price + ", 수량: " + totalOrder[i].quantity);
            totalPrice += (totalOrder[i].price * totalOrder[i].quantity);
        }
        System.out.println("총 결제 금액: " + totalPrice);
    }
}
