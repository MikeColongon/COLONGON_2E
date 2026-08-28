import java.util.Scanner;


public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

    String name;
    int birthyear;
    String gender;

    System.out.print("Enter name: ");
    name = sc.nextLine();
    System.out.print("Enter birth year: ");
    birthyear = sc.nextInt();
    System.out.print("Enter gender: ");
    gender = sc.next();

    System.out.println("Hello "+name+"! Welcome to Java Proggraming!");
    System.out.println("You were born in "+birthyear+" and your gender is "+gender);
}

