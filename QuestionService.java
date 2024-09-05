package Project;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[2];
    String selection[] = new String[2];
    int i=0;

    public QuestionService() {
        questions[0] = new Question(1,"What is your favourite food?","Chocolate","Chicken","Ice Cream", "Banana","Ice Cream");
        questions[1] = new Question(2,"What is my favourite color?","White","Green","Blue","Yellow","White");

    }

    public void getScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String answer = selection[i];

            if (actualAnswer.toLowerCase().equals(answer.toLowerCase())) {
                score++;
            }

        }
        System.out.println("Your score is: "+ score);
    }

    public void playQuiz(){
        for(Question q : questions){
            System.out.println("Question no: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner scanner = new Scanner(System.in);
            selection[i] = scanner.nextLine();
            i++;




        }

    }




}
