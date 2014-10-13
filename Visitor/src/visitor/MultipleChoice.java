/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visitor;

/**
 *
 * @author tucker.stone061
 */
public class MultipleChoice implements Test {
    private int numberOfQuestions;
    private int answersPerQuestion;
    private String testName;
    
    public MultipleChoice(int numQuestions, int numAnswers, String name) {
        this.numberOfQuestions = numQuestions;
        this.answersPerQuestion = numAnswers;
        this.testName = name;
    }
    
    public int getNumQuestions() {
        return this.numberOfQuestions;
    }
    
    public int getAnswersPer() {
        return this.answersPerQuestion;
    }
    
    public String getName() {
        return this.testName;
    }
    
    @Override
    public void accept(TestTaker visitor) {
        visitor.visit(this);
    }
}