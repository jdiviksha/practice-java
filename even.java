
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
public class even {
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
//### 3. Prime Number Checker
//**Problem:**
//Write a Java program that checks if a given number is prime. A prime number is a number that is only divisible by 1 and itself.
//**Hint:** Use a `for` loop to iterate from 2 to the square root of the number and an `if` statement to check if it has any divisors other than 1 and itself.
import java.util.Scanner;
public class even{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("check: ");
        int number = scanner.nextInt();
        if (number <= 1 || number == 2){
            System.out.println("it is prime num:"+number);
        }
        else if (number % 2 == 0){
           System.out.println("it is  not prime num:"+number);
        }
        else{
            System.out.println("it is  prime num:"+number); 
            }
            int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {
                System.out.println("it is not prime num:"+number); 
            }
        }
    }
}
### 6. Find the Largest and Smallest Number
**Problem:**
Write a Java program that takes 5 integers from the user and finds the largest and smallest numbers among them.
**Hint:** Use a `for` loop to take 5 inputs and `if` statements to keep track of the largest and smallest numbers.
import java.util.Scanner;
public class ls{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int l=Integer.MIN_VALUE;
        int s=Integer.MAX_VALUE;
        System.out.println("Enter 5 num:");
        for (int i=0;i<5;i++){
            int num=scanner.nextInt();
            if(num>l){
                l=num;
            }
            if(num<s){
                s=num;
            }
        }
        System.out.println("Largest num:"+l);
        System.out.println("Smallest num:"+s);
    }
}
//### 7. Sum of Digits
//**Problem:**
//Write a Java program that takes an integer from the user and calculates the sum of its digits.
//**Hint:** Use a `while` loop to extract digits and an `if` statement to check the termination condition
import java.util.Scanner;
public class even{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter:");
        int number = scanner.nextInt(); 
        int sum = 0;
        int n = number;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("sum of digit" + sum);
        scanner.close();
    }
}
//### extra1. Print leap year
//**Problem:**
//Write a Java program that prints all leap year between 2001 and 2014.
//        **Hint:** Use a `for each` loop to iterate  and an `if` statement to check if a year is leap year.
public class even {
    public static void main(String[] args) {
        int[] years = {2001, 2002, 2003, 2004, 2008, 2009, 2010, 2011, 2012,2013,2014};
        for(int year : years) {
            if (year % 4 == 0 || year % 400 == 0){
                System.out.println(year);
            }
        }
    }
}
### extra 2. Find the Largest and Smallest Number
**Problem:**
Write a Java program that takes  integers from array and finds the largest and smallest numbers among them.
**Hint:** Use a `for` loop to take array elements and `if` statements to keep track of the largest and smallest numbers.
public class minmaxarr{
    public static void main(String[] args){
        int[] num={3,1,4,1,5,10,2,6,5,3,5};
            int min=num[0];
            int max=num[0];
            for (int i=1;i<num.length;i++){
                if (num[i]<min){
                    min=num[i];
                } 
                else if(num[i]>max){
                    max=num[i];
                }
            }
            System.out.println("Minvalue:"+min);
            System.out.println("Maxvalue:"+max);
        }
    }
### extra 3. Reverse the Number
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.close();
        while(num > 0){
            int rem=num % 10;
            if (rem>0){
                System.out.print(rem);
            }
            num/=10;
        }
    }
}
### extra 3. sqrt of the number
class HelloWorld{
    public static void main(String[] args){
        int n=10;
        for(int i=1;i<=n;i++) {
            System.out.print(i);
            System.out.print(i*i);
        }
    }
}
### extra 3. pattern model 1
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
### extra 3. 2D arrya practice 1
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int M=scanner.nextInt();
        int N=scanner.nextInt();
        int[][] matrix=new int[M][N];
        for(int i=0;i<M;i++) {
            for(int j=0;j<N;j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<M;i++) {
            if(i%2==0) {
                for(int j=0;j<N;j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else{
                for(int j=N-1;j>=0;j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
###extra string reverse
import java.util.Scanner;
public class stringRev{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string");
        String originalstring=scanner.nextLine();
        String reversedstring="";
        for (int i=originalstring.length()-1;i>=0;i--){
            reversedstring += originalstring.charAt(i);
        }
        System.out.println("reversed string:"+reversedstring);
    }
}
###extra placement 2
import java.util.Scanner;
public class Divisorcount{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        int aes=0;
        for (int i=m;i<=n;i++) {
            int count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==4){
                aes++;
            }
        }
        System.out.println(aes);
        scanner.close();
    }
}






