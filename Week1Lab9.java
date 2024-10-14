package week1lab9;

public class Week1Lab9 {

    public static void main(String[] args) {
        String name = "Khoo";
        int n1 = 2, n2 = 14;
        System.out.println("Welcome to Java Programming, " + name);
        int sum = n1 + n2;
        n1 = shit(n1);
        System.out.println(n1);
        System.out.println("The sum of 2 values is " + sum);
        //one of the numbers is float in an operation, will return float result
    }

    public static int shit(n1) {
        n1++;
        return n1;
    }
    
}
