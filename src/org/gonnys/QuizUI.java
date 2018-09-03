package org.gonnys;

import java.util.Scanner;

public class QuizUI {

    QuizService service;
    Scanner scanner;

    public QuizUI(QuizService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void startShow(){
        Quiz quiz = service.getNext(); // 다음 문제 줘
        System.out.println(quiz.getQuestion()); // 문제를 보여줘

        String userAnswer = scanner.nextLine(); // 답을 적어

        if (quiz.checkAnswer(userAnswer)){ //쓴 답이 정답인지 아닌지 확인
            System.out.println("정답입니다!");
        }else
            System.out.println("틀렸습니다.");

        startShow();
    }
}
