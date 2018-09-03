package org.gonnys;
import java.util.ArrayList;


public class QuizService {

    ArrayList<Quiz> quizList;

    public QuizService(){
        this.quizList = new ArrayList<>();

    }

    public void addQuiz(Quiz quiz){
        this.quizList.add(quiz);
    }

    public  Quiz getNext(){
        return this.quizList.remove(0);
    }
}
