package weeklyQuiz02;
import weeklyQuiz02.Calculator;

public class OrderService {
    public static void main(String[] args) {
        Beauty beauty = new Beauty("lipstick", 11000, 0.5);
        Grocery grocery = new Grocery("yogurt", 12000, 3.4);
        LargeAppliance appliance = new LargeAppliance("earphone", 14000, 0.9);

        Product[] products = {beauty, grocery, appliance};
        Cart cart = new Cart(products);
        int deliveryCharge = Calculator.getDeliverCharge(cart.getTotalWeight(), cart.getTotalPrice());
        System.out.println("총 배송료: " + deliveryCharge);
    }
}
