package Alfa;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Shabat Shalom"); //ln после принта делает переходит на другую строку //
        System.out.print("Shabat"); // Принт без ln - остается на этой же строке //
        System.out.print("Shalom");
    }


// Java data types //
// byte (1 byte - Stores whole numbers from -128 to 127)
// short (2 bytes - Stores whole numbers from -32,768 to 32,767)
// int (4 bytes - Stores whole numbers from -2,147,483,648 to 2,147,483,647)
// long (8 bytes - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
// float (4 bytes - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits)
// double (8 bytes - Stores fractional numbers. Sufficient for storing 15 decimal digits)
// boolean (1 bit - Stores true or false values)
// char (2 bytes - Stores a single character/letter or ASCII values) //
// byte, short, int, long - Работают с целыми числами //
// float, double - Работают с плавающей точкой (1.5; 2.5; 3.3 и тд) //


    public static void wholenumbers() {
        byte oneByte = 1;
        short twoByte = 4;
        int muchByte = 55;
        long soMuchByte = 2400;
        float sixWithZero = 6.0f;
        double eightWithTwo = 8.2;
        boolean FalseOrTrus = true;
        char OneByteChar = 'A';


        System.out.println(oneByte);
        System.out.println(twoByte);
        System.out.print(muchByte);
        System.out.print(soMuchByte);
    }

    public static void TrueFalse (){

        int age = 25;

        if (age < 20) {
            System.out.println("Shop Closed");
        } else if (20 == age) {
            System.out.println("Check Passport");
        } else (age > 20) {
            System.out.println("Shop Opened");
        }
    }

















}

