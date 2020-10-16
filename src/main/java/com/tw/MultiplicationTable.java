package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        boolean isValid = checkIfValid(startNumber, endNumber);
        String multiplicationTable = generateMultiplicationTable(startNumber, endNumber);
        return isValid ? multiplicationTable : null;
    }

    public static boolean checkIfValid(int startNum, int endNum){
        boolean isNumberValid = checkNumberValidity(startNum, endNum);
        boolean isStartNumberInRange = checkIfInRange(startNum);
        boolean isEndNumberInRange = checkIfInRange(endNum);
        return isNumberValid && isStartNumberInRange && isEndNumberInRange;
    }


    public static boolean checkIfInRange(int number) {
        return number > 0 && number < 1000;
    }

    public static boolean checkNumberValidity(int startNum, int endNum) {
        return startNum<=endNum;
    }

    public static String generateMultiplicationTable(int startNum, int endNum) {
        String multiplicationTable = "";
        for (int i=startNum; i<=endNum; i++){
            multiplicationTable = (startNum + "*" + i + "=" + (startNum*i));
        }
        return multiplicationTable;
    }
}
