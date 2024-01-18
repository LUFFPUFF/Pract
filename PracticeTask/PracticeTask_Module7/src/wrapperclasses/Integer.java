package wrapperclasses;

public class Integer {

    private static int MAX_AGE = 8;

    public static void main(String[] args) {
        //минимальное и максимально значение integer
        System.out.println(java.lang.Integer.MIN_VALUE);
        System.out.println(java.lang.Integer.MAX_VALUE);

        System.out.println("-------------------");
        java.lang.Integer katyaAge = 6;
        java.lang.Integer mishaAge = katyaAge;
        katyaAge = 7;

        System.out.println(mishaAge);
        System.out.println(katyaAge == mishaAge);

        System.out.println("-------------------");
        //возможность сравнивать с примитивами
        if (katyaAge < MAX_AGE) {
            System.out.println("Катя может играть в эту игру");
        }

        System.out.println("-------------------");
        //автоматическое преобразование в примитивы
        java.lang.Integer wight = 76;
        java.lang.Integer height = 85;
        System.out.println(calculateRectangleArea(wight, height));

    }

    private static int calculateRectangleArea(int wight, int height) {
        return wight * height;
    }
}
