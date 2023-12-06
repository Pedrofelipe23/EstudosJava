package exercicio8;

import java.util.Date;

public class exercicio8 {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(),OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
