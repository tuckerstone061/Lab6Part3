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
public class TestTakerUse implements TestTaker{
    @Override
    public void visit(TrueFalse truefalse) {
        System.out.println("Taking test: " + truefalse.getName());
        System.out.println("Number of Questions: " + truefalse.getNumQuestions());
        System.out.println("Number of True Answers: " + truefalse.getNumTrue());
    }
    
    @Override
    public void visit(MultipleChoice mc) {
        System.out.println("Taking test: " + mc.getName());
        System.out.println("Number of Questions: " + mc.getNumQuestions());
        System.out.println("Number of True Answers: " + mc.getAnswersPer());
    }
}
