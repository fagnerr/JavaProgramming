package br.dev.fagner;



public class Main {

    public static void main(String[] args) {

        // Testing Recursive Class-------------------------------------------------------------------------------------
        Recursion recursive = new Recursion();

        // Recursive power method
        recursive.power(2,3);
        System.out.println("\n");

//        // Stack overFlow
//        recursive.power(39676,89765);

        // Factorial method
        recursive.factorial(3);
        System.out.println("\n");

        // Fibonacci method
        recursive.Fibonacci(3);
        // ------------------------------------------------------------------------------------------------------------


    }
}
