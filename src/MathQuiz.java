import java.util.Scanner;

public class MathQuiz {
    int poprawne=0;

    boolean question1(){
        System.out.println("1. Jaki jest wynik mnożenia 3*5 ?");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt()==15){
            poprawne++;
            return true;
        } else {
            return false;
        }
    }

    boolean question2(){
        System.out.println("2. Jakie jest pole kwadratu o boku 12 ?");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt()==144){
            poprawne++;
            return true;
        } else {
            return false;
        }
    }

    boolean question3(){
        System.out.println("2. Jaki jest pierwiastek kwadratowy z liczby 15129 ?");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt()==123){
            poprawne++;
            return true;
        } else {
            return false;
        }
    }

}
