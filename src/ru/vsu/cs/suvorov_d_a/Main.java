package ru.vsu.cs.suvorov_d_a;

class Main {
    public static void main(String[] args) {
        double y = findSumExpression();
        printAnswer(y);
    }

    private static double findSumExpression() {
        double sum = 0;
        int n = 33;
        while(n>0) {
            sum = Math.sqrt(3*(n--) + sum);
        }

        return sum;
    }

    private static void printAnswer(double sum) {
        System.out.println("Answer: y = " + sum);
    }
}