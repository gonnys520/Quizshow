package org.gonnys;

public class Main {

    public static void main(String[] args) {

        QuizService service = new QuizService();

        service.addQuiz(new Quiz("도라에몽의 나이는?", "65"));
        service.addQuiz(new Quiz("루피의 나이는?", "19"));
        service.addQuiz(new MultipleChoiceQuiz("4대문이 아닌 것은?", "D", new String[]{"A","B","C"}));
        service.addQuiz(new SubjectiveQuiz("빈센트 노래의 주인공은?", "빈센트반고흐", new String("고흐")));

    QuizUI ui = new QuizUI(service);
    ui.startShow();
    }
}
