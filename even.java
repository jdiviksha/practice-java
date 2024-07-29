
//### 1. Print Even Numbers
//**Problem:**
//Write a Java program that prints all even numbers between 1 and 50.
//        **Hint:** Use a `for` loop to iterate from 1 to 50 and an `if` statement to check if a number is even.
public class even {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
//### 2. Sum of Multiples of 5
//        **Problem:**
//Write a Java program that calculates and prints the sum of all multiples of 5 between 1 and 100.
//        **Hint:** Use a `for` loop to iterate from 1 to 100 and an `if` statement to check if a number is a multiple of 5.
public class sum {
     public static void main(String[] args) {
         int sum = 0;
         for(int i=1;i<=100;i++){
             if(i/5){
                 sum+=i;
             }
             }
         System.out.println(sum);
         }
     }
//### 3. Print leap year
//**Problem:**
//Write a Java program that prints all leap year between 2001 and 2014.
//        **Hint:** Use a `for each` loop to iterate  and an `if` statement to check if a year is leap year.
public class leapyear {
    public static void main(String[] args) {
        int[] years = {2001, 2002, 2003, 2004, 2008, 2009, 2010, 2011, 2012,2013,2014};
        for(int year : years) {
            if (year % 4 == 0 || year % 400 == 0){
                System.out.println(year);
            }
        }
    }
}











