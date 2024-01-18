package primitiveandobjects.product;

public class Main {
    public static void main(String[] args) {

        //Объекты хранят ссылки, а не значения
        Product milk1 = new Product("Milk", 78);
        Product milk2 = milk1;
        milk1.setPrice(100);
        System.out.println(milk2);
        System.out.println("-------------------------------");

        //примитивы хранят значения, а не ссылки
        int milkPrice = 75;
        int iceCreamPrice = milkPrice;
        milkPrice = 100;
        System.out.println(iceCreamPrice);
    }
}
