package amirkhanovkuat;

public class HelloWorld {
    public static void main(String[] args) {

        // Переполнения при вычислениях
        byte a = 50;
        byte b = 100;
        System.out.println(a + b);
        System.out.println(a * b);
        short c = -32768;
        short d = 32767;
        System.out.println(c - 10);
        System.out.println(d + 10);

        // Вычисления комбинаций типов данных int и double
        int e = 10;
        double f = 5.5;
        System.out.println(e + f);
        System.out.println(e - f);
        System.out.println(e * f);
        System.out.println(e / f);
        System.out.println(e % f);

        // Логические операторы и Условные конструкции
        int q = 12;
        int p = 20;
        boolean qp = q < 15 && p > 15;

        if (qp == true) {
            System.out.println("Правда!");
        } else if (qp != true) {
            System.out.println("Лож!");
        }
    }
}
