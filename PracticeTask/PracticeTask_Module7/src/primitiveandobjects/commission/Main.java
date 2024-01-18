package primitiveandobjects.commission;

import primitiveandobjects.product.Product;

public class Main {
    public static void main(String[] args) {

        //действия с объектами, где цена изменится
        Product product = new Product("Milk", 75);
        addCommissions(product);
        System.out.println(product);

        System.out.println("--------------------------------");

        //действия с примитивами, где milkPrice не изменится
        int milkPrice = 75;
        addCommissions(milkPrice);
        System.out.println("Milk - " + milkPrice);
    }

    //при данном приеме наша переменная milkPrice не изменится, так как хранит в себе
    //определенное значение, а именно 75
    private static void addCommissions(int price) {
        price += 10;
    }

    //при данном приеме наша переменная изменится, так как является объектом, который хранит в
    // себе ссылку, а в данном методе мы присваиваем новую ссылку, а именно на повышение цены
    private static void addCommissions(Product product) {
        product.setPrice(product.getPrice() + 10);
    }
}
