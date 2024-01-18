package wrapperclasses.youtube;

public class BroCode {
    public static void main(String[] args) {
        //Классы оболочки - предоставляют возможность использовать примитивы в ссылочной форме


        //primitive |  //wrapper
        //-----------------------
        //int           Integer
        //double        Double
        //float         Float
        //boolean       Boolean
        //char          Character
        // and more

        //autoboxing - автоматическое преобразование из примитива в ссылочный объект класса
        //Пример: int - Integer

        //Пример autoboxing:
        Boolean aBoolean = true;
        Character character = '@';
        Integer integer = 123;
        Double aDouble = 3.14;
        String string = "Bro";

        //преимущества:
        //содержание нескольких полезных методов, например max() и min(), который определят максимальное
        //и минимальное число в классе Integer

        //использование методов класса Integer
        System.out.println(Integer.max(4, 5));

        //Недостатки:
        //требуют больших вычислительных мощностей

        //unboxing - возможность обращаться с ссылочнами типами данных так, как они бы были
        //примитивными значениями (int, float, boolean and more.)

        if (aBoolean == true) {
            System.out.println("True");
        }

        //Преимущества и недостатки остаются теми же, если работа идет с миллионами вычислительными мощностями
        //то это потребует большей вычислительной мощности
        
    }
}
