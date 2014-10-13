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
public class TrueFalse implements Test {
    private int numberOfQuestions;
    private int numberTrueAnswers;
    private String testName;
    
    public TrueFalse(int numQuestions, int numTrue, String name) {
        this.numberOfQuestions = numQuestions;
        this.numberTrueAnswers = numTrue;
        this.testName = name;
    }
    
    public int getNumQuestions() {
        return this.numberOfQuestions;
    }
    
    public int getNumTrue() {
        return this.numberTrueAnswers;
    }
    
    public String getName() {
        return this.testName;
    }
    
    @Override
    public void accept(TestTaker visitor) {
        visitor.visit(this);
    }
}
