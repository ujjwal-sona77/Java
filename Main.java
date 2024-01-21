import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3= new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc1.nextInt();
        int number3 = sc2.nextInt();
        int number4 = sc3.nextInt();

        if (number1 > number2  && number1 > number3 && number1 > number4)
            System.out.println("Number 1" + number1 + "is greater from all numbers .");
        else if (number2 > number1 && number2 > number3 &&number2 > number4)
            System.out.println("Number 2" + number4 + "is greater form all numbers .");
        else if (number3 > number1 && number3 > number2 && number3 > number4)
            System.out.println("Number 3" + number3 + "is greater from all numbers .");
        else if (number4 > number1 && number4 > number2 && number4 > number3)
            System.out.println("Number 4" + number4 + "is greater from all number");
        else
            System.out.println("Number Error !");




    }
}