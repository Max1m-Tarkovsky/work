package com.ua.hillel.homeWork14;

public class Print {
    static String printFirst =   "";
    static String printSecond =  "";
    static String printThird =   "";
    static String printFourth =  "";
    static String printFifth =   "";
    static String printSixth =   "";
    static String printSeventh = "";


    public static boolean transferToChar(String value) {
        char[] inCarArray = value.toCharArray();
        for (int i = 0; i < inCarArray.length; i++) {
            if (inCarArray[i] < 48 || inCarArray[i] > 57) {
                return false;
            }
        }
        return true;
    }

    public static void printNumbers(String value) {
        if (transferToChar(value)) {
            concat(value);
            System.out.println(printFirst);
            System.out.println(printSecond);
            System.out.println(printThird);
            System.out.println(printFourth);
            System.out.println(printFifth);
            System.out.println(printSixth);
            System.out.println(printSeventh);
            clear();
        } else {
            System.out.println("Unexpected value,it's  not number!Pleas Enter number ");
        }
    }

    public static void clear() {
        printFirst = "";
        printSecond = "";
        printThird = "";
        printFourth = "";
        printFifth = "";
        printSixth = "";
        printSeventh = "";
    }

    public static void concat(String numbers) {

        char[] intoChar = numbers.toCharArray();
        for (int i = 0; i < intoChar.length; i++) {
            NumberOfLinkedLine number = getNumber(intoChar[i]);
            printFirst += number.getFirstString();
            printSecond += number.getSecondString();
            printThird += number.getThirdString();
            printFourth += number.getFourthString();
            printFifth += number.getFifthString();
            printSixth += number.getSixthString();
            printSeventh += number.getSeventhString();
        }
    }


    public static NumberOfLinkedLine getNumber(char number) {
        if (number == '0')
            return new Zero();
        else if (number == '1')
            return new One();
        else if (number == '2')
            return new Two();
        else if (number == '3')
            return new Three();
        else if (number == '4')
            return new Four();
        else if (number == '5')
            return new Five();
        else if (number == '6')
            return new Six();
        else if (number == '7')
            return new Seven();
        else if (number == '8')
            return new Eight();
        else if (number == '9')
            return new Nine();
        else return new Unexpected();
    }
}
