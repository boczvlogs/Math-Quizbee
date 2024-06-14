import java.util.Scanner;

public class CollegeMathQuiz {
    public static void main(String[] args) {
        // Questions and Answers Advance v1.0 for MSFT & Agoo INC.
        String[] questions = {
            "What is the derivative of sin(x)?",
            "What is the integral of 2x^2?",
            "What is the limit of (1 + 1/n)^n as n approaches infinity?",
            "What is the sum of the angles in a triangle?",
            "What is the value of e^0?",
            "What is the derivative of ln(x)?",
            "What is the integral of cos(x)?",
            "What is the derivative of e^x?",
            "What is the value of pi (π) rounded to two decimal places?",
            "What is the value of the natural logarithm of 1?",
            "What is the value of e rounded to 4 decimal places?",
            "What is the value of sin(pi/2)?",
            "What is the area of a circle with radius 5 units (πr^2)?",
        };
        
        String[] answers = {
            "cos(x)",
            "(2/3)x^3 + C",
            "e",
            "180 degrees",
            "1",
            "1/x",
            "sin(x) + C",
            "e^x",
            "3.14",
            "0",
            "2.7183",
            "1",
            "25π"
        };

        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Counter for correct answers
        int score = 0;

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();

            // Check if user's answer is correct
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + answers[i]);
            }
        }

        // Display final score
        System.out.println("Quiz completed! Your score is: " + score + "/" + questions.length);

        //Agoo INC 2023 V1.0 BETA

        // Close Scanner
        scanner.close();
    }
}
