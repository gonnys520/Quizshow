package org.gonnys;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleChoiceQuiz extends Quiz{

    String[] options;

    public MultipleChoiceQuiz(String text, String answer, String[] options) {
        super(text, answer);
        this.options = options;
    }

    @Override
    public String getQuestion() {
        return super.getQuestion() + "\n"+ Arrays.toString(options);
    }
}
