public class MathQuizTest {
    public static void main(String[] args) {
        MathQuiz mathQuiz = new MathQuiz();
        System.out.println("Rozwiąż 3 zadania matematyczne: ");
        boolean pytanie1 = mathQuiz.question1();
        boolean pytanie2 = mathQuiz.question2();
        boolean pytanie3 = mathQuiz.question3();
        System.out.printf("%nTwoje odpowiedzi%npytanie 1: %b%npytanie 2: %b%npytanie 3: %b%n%nTwój wynik to %d/3%n", pytanie1,
                pytanie2, pytanie3, mathQuiz.poprawne);
    }
}
