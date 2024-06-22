import java.util.Collections;


public class Main {


    public static void main(String[] args) {
        // We got pizza with different topings , we can keep adding topings
        Pizza pizza = new JalepanoDecorator(new CheeseBurstDecorator(new BasePizza()));
        System.out.println(pizza.bake());
    }
}
