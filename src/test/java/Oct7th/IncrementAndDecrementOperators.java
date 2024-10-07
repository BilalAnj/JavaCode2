package Oct7th;

import java.util.Scanner;

public class IncrementAndDecrementOperators {
    //Scanner class is used to read the data from the console
    //It is present in the java.util package

    public static void main(String[] args) {
      System.out.println("Enter the number for which the operations needs to be performed");
//
//        //System.in --> Reads the data from the console
       Scanner s1=new Scanner(System.in);
//
       int a=s1.nextInt(); //.nextInt() is used to read the integer values
//
        System.out.println("The value of a is: "+a);
//
//        System.out.println("Enter the name: ");
//
//        String b=s1.next(); //.next() is used to read the string values
//
//        System.out.println("The name is: "+b);

    //Increment and Decrement Operations
    //++a --> Pre Increment
    //--a --> Pre Decrement

//int a=30;

   //     System.out.println(++a); //Value of a will be incremented by 1 and then it will be printed

      //  System.out.println(--a); //Value of a will be decremented by 1 and then it will be printed

    //a++ --> Post Increment --> Value of a will be printed and then it will be incremented by 1 internally
    //a-- --> Post Decrement --> Value of a will be printed and then it will be decremented by 1 internally

        //System.out.println(a++); //30(31)

        //System.out.println(a--); //31(30)

        //System.out.println("*****************************************************************************");

    //30(31) - 30 + 30(29) + 30
    //30-30+30+30
    //60
   // int b= a++ - --a + a-- + ++a;

       // System.out.println(b);

    //60 * 61 - 61 + 61 / 59
    //3600
    //int c=b++ * b++ - --b + b-- / --b;

        //System.out.println(c);

   // char d='h';
    //char e='o';

        //System.out.println(d-- + e-- + --e + ++d - e++ * ++e);
}
}

