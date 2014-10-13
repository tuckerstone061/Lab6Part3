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
public interface TestTaker {
    void visit(TrueFalse truefalse);
    void visit(MultipleChoice mc);
}
