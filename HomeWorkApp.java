package HomeWork;
//Пункт 1 -создание класса
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //Пункт 2 -вывод значений в столбец
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Пункт 3 -суммирование с проверкой на отрицательный или положительный результат
    public static void checkSumSign() {
        int a = 10;
        int b = 20;
        int c = (a + b);
        if (c > 0) { // сравнение  что c больше нуля
            System.out.println("Сумма положительная");
        }
        else if(c < 0) { // сравнение  что c меньше нуля
            System.out.println("Сумма отрицательная");
        }

    }

    // Пункт 4 - светофор) при изменении значения меняется цвет
    private static void printColor() {
        int value = 0; //значение
        if (value <= 0) {  //если оно меньше или равно 0 - высвечивается красный
            System.out.println("Красный");
        }
        else if (value <= 100) {  //если оно 1 до 100 - высвечивается жёлтый
            System.out.println("Жёлтый");
        }
        else if (value > 101){  //если оно 101 и более - высвечивается зелёный
            System.out.println("Зелёный");
        }
    }

    //Пункт 5 - сравнение больше или меньше
    private static void compareNumbers() {
        int a = 100;
        int b = 100;
        if (a >= b) { //если a больше или равно b
            System.out.println("a >= b");
        }
        else if (a < b) { // если a меньше b
            System.out.println("a < b");
        }
    }
}

