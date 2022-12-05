package buchalkaJavaLearningAcademy.operators;

public class Challenge1 {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 15;

        boolean reminder = num1 % 5 == 0 && num2 % 5 == 0;// boolean değeri NOT operatörü aldğından birşey yazdımraz
        if (!reminder) {
            System.out.println("lets see what happens");

            //  boolean reminder=num1%5!=0&&num2%5!=0; /// yazdırır
            //   if (!reminder) {
            //      System.out.println("lets see what happens");


        }
        double a = 20.00d;
        double b = 80.00d;
        double result = (a + b) * 100.00;
        result = result % 40.00d;
        boolean myResult;
        myResult = result == 0;
        System.out.println("myResult = " + myResult);
        if (!myResult) {
            System.out.println("Got some reminder.");
        }
    }
}
