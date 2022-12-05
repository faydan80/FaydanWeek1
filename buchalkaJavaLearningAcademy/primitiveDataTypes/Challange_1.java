package buchalkaJavaLearningAcademy.primitiveDataTypes;

public class Challange_1 {
    public static void main(String[] args) {

        byte myByte = 25;
        short myShort = 2450;
        int myInt = 55897;
        int mySum = myByte + myShort + myInt;
        long myLong = 50000 + (mySum * 10);
        long myNewLong = 50000 + (myByte + myShort + myInt) * 10;
        System.out.println("My new Long number is " + myNewLong);
        System.out.println("My Long number is " + myLong);

        float myMaxFloatNumber = Float.MAX_VALUE;
        float myMinFloatNumber = Float.MIN_VALUE;
        System.out.println("myMaxFloatNumber = " + myMaxFloatNumber);
        System.out.println("myMinFloatNumber = " + myMinFloatNumber);

        double myMinDoubleNumber = Double.MIN_VALUE;
        double myMaxDoubleNumber = Double.MAX_VALUE;
        System.out.println("myMinDoubleNumber = " + myMinDoubleNumber);
        System.out.println("myMaxDoubleNumber = " + myMaxDoubleNumber);

        int myChallengeIntValue = 5;
        double myNewCasting = myChallengeIntValue;
        //double myChallengeIntValue=(double) 5;
        System.out.println("myNewCasting = " + myNewCasting);

        double myDoubleChallenge = 5.25d;
        float myFloatChallengeValue = 8.26f;
//*************************************************************************************
        //double myDoubleChallenge = 5d; sonuç 5.0
        //float myFloatChallengeValue = 8f;sonuç 8.0
//**************************************************************************************
        //int myChallengeIntValue = 5/2; sonuç 2    int myChallengeIntValue = 5/3; sonuç 1
        //double myDoubleChallenge = 5d/2d; sonuç 2.5    double myDoubleChallenge = 5d/3d; sonuç 1.6
        //float myFloatChallengeValue = 8f/2f;sonuç 4.0
        //double myDoubleChallenge = 5.00/2.00; sonuç 2.5 noktalı sayı koyarsak rakamın sonuna "d" koymamıza gerek kalmaz

        double pounds=28.00;
        double onePound=0.45359237;
        double kilograms=pounds*onePound;
        System.out.println("28 Kilograms = " + kilograms);
        char myCorona='\u0049';
        System.out.println("myCorona = " + myCorona);

        String myString= "This is a String";
        System.out.println("myString = " + myString);
        myString=myString+"To the moon and back";
        System.out.println("myString = " + myString);

        //*************************************************************
        String mutlakaOgren="\u00A9 2022";
        System.out.println("mutlakaOgren = " + mutlakaOgren);

    }
}
