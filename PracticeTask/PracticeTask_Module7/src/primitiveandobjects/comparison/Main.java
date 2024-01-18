package primitiveandobjects.comparison;

import primitiveandobjects.product.Product;

public class Main {
    public static void main(String[] args) {

        //сравнение двух ссылок с помощью ==
        //ссылки будут разные, потому их не получится сравнить, даже если цены одинаковые
        Product product1 = new Product("Milk", 75);
        Product product2 = new Product("Milk", 75);
        if (product1 == product2) {
            System.out.println("Цены одинаковы");
        }

        //но если прировнять ссылку product3 к product1, то они будут у них будут одинаковые ссылки
        //значит их уже можно будет сравнить
        Product product3 = product1;
        if (product1 == product3) {
            System.out.println("Цены одинаковы");
        }

        System.out.println("-------------------------------");

        //сравнение примитивов с помощью ==
        //в данном слуае получится сравнить, так как примитивы хранят значения
        int milkPrice = 75;
        int iceCreamPrice = 75;
        if (milkPrice == iceCreamPrice) {
            System.out.println("Цены одинаковы");
        }
    }
}
