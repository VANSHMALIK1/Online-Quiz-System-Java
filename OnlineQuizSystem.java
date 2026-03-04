import java.util.*;

class Question {
    String question;
    String[] options;
    int correctAnswer;

    Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    boolean isCorrect(int answer) {
        return answer == correctAnswer;
    }
}

public class OnlineQuizSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "Which language is used for Android Development?",
                new String[]{"1. Python", "2. Java", "3. C++", "4. PHP"},
                2));

        questions.add(new Question(
                "Which keyword is used to inherit a class in Java?",
                new String[]{"1. implements", "2. extends", "3. import", "4. package"},
                2));

        questions.add(new Question(
                "Which database is commonly used with Java?",
                new String[]{"1. MySQL", "2. MongoDB", "3. Oracle", "4. All of these"},
                4));

        int score = 0;

        System.out.println("===== Welcome to Online Quiz System =====");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            System.out.println("\nQ" + (i + 1) + ": " + q.question);
            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (q.isCorrect(answer)) {
                System.out.println("Correct ✅");
                score++;
            } else {
                System.out.println("Wrong ❌");
            }
        }

        System.out.println("\n===== Quiz Finished =====");
        System.out.println("Your Score: " + score + "/" + questions.size());

        if (score >= 2) {
            System.out.println("Result: PASS 🎉");
        } else {
            System.out.println("Result: FAIL 😢");
        }

        sc.close();
    }
                }
