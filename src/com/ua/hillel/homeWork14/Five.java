package com.ua.hillel.homeWork14;

public class Five implements NumberOfLinkedLine{
    final public String firstString =    "        ";
    final public String secondString =   " @@@@@@ ";
    final public String thirdString =    " @@     ";
    final public String fourthString =   " @@@@@  ";
    final public String fifthString =    "     @@ ";
    final public String sixthString =    " @@@@@  ";
    final public String seventhString =  "        ";


    @Override
    public void numberOfLinkedLine() {
        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(thirdString);
        System.out.println(fourthString);
        System.out.println(fifthString);
        System.out.println(sixthString);
        System.out.println(seventhString);
    }

    @Override
    public String getFirstString() {
        return firstString;
    }

    @Override
    public String getSecondString() {
        return secondString;
    }

    @Override
    public String getThirdString() {
        return thirdString;
    }

    @Override
    public String getFourthString() {
        return fourthString;
    }

    @Override
    public String getFifthString() {
        return fifthString;
    }

    @Override
    public String getSixthString() {
        return sixthString;
    }

    @Override
    public String getSeventhString() {
        return seventhString;
    }
}
