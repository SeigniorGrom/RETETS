package Roma;

import org.testng.IMethodSelector;

import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Q"); //ln вывод в новую строку
        System.out.print("Privet "); //without ln без вывода в новую строку - слитно
        System.out.println("Huesos");
///////////////////////////////////////
        byte oneByte = 1;
        short twoByte = 2;
        int fourByte = 4;
        long eightByte = 8;

        float fourByteWithDot = 4.0f;
        double eightByteWithDot = 8.0;

        boolean oneByteFalseOrTrue = false;

        char oneByteCharter = 66;

        System.out.println(oneByte);
        System.out.println(twoByte);
        System.out.println(fourByte);
        System.out.println(eightByte);
        System.out.println(fourByteWithDot);
        System.out.println(eightByteWithDot);
        System.out.println(oneByteFalseOrTrue);
        System.out.println(oneByteCharter);
        //////////////////////////////////////////////////
        int one = 1; //инт название переменной = 1
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;

        System.out.println(one + five);
        // "+" "-" "/" "*" "%" "<" ">" "==" "<=" ">=" "!="
        //////////////////
        int age = 19;

        if (age < 18) {
            System.out.println("shop close");
        } else if (age == 18) {
            System.out.println("shop open, but check documents");
        } else {
            System.out.println("shop open");
        }
        ///////


//
//        public static void method() {
//            int a = 22;
//            int b = 33;
//            System.out.println("bb" + a + b);
//
//
//
//        }


        method();
        method();
        method();
        methodByThoParameter(11, 12);
        methodByThoParameter(15, 02);
        methodByThoParameter(87, 13);

        name();

        int id = getId();
        System.out.println(id);

        int sum = sum(21, 1);
        System.out.println(sum);

        System.out.println(getString());
    }

    public static void method() {
        int a = 22;
        int b = 33;
        System.out.println("bb" + a + b);

//        method(); <--попробуй активировать и запустить, после обычного теста. ВТФ?!
    }

    public static void methodByThoParameter(int c, int d) {
        System.out.println(c + d);

    }

    public static void name() {
        System.out.println("My name is Roma");
    }

    public static int getId() {
        return 21;
    }

    public static int sum(int first, int second) {
        return first + second;

    }

    public static String getString() {
        return "My name is QA AUTO";
    }
}
//YaMegaKrutoiChel
