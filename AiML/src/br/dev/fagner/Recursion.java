package br.dev.fagner;

public class Recursion {

	  // Non-Recursive Power method
	  int Power(int a, int n){
	    int result = 1;
	    for(int i=0; i<n;i++){
	      result *= a;
	    }
	    return result;
	  }


	  // Recursive Power method
	  int power(int a, int n){
	    System.out.println("a: " + a + " n: " + n);

	    if (n == 0){
	      return 1;
	    }
	    else {
	      return  a * power(a,n-1);
	    }
	  }

	  // Factorial method
	  public int factorial(int n){
	    System.out.println(n);

	    if (n == 1){
	      return 1;
	    }
	    return n * factorial(n-1);
	  }

	  // Fibonnaci method
	  public int Fibonacci(int x){
	    System.out.println(x);

	    if (x < 2){
	      return 1;
	    }
	    else {
	      return Fibonacci(x-1) + Fibonacci(x-2);
	    }
	  }

	}