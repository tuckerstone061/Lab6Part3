/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tucker.stone061
 */
public class DrawTest implements Test {
    //collection of Tests
    private List<Test> tests = new ArrayList<Test>();
     
    @Override
    public void draw(String type) {
        for(Test sh : tests)
        {
            sh.draw(type);
        }
    }
     
    //adding test to drawing
    public void add(Test s){
        this.tests.add(s);
    }
     
    //removing test from drawing
    public void remove(Test s){
        tests.remove(s);
    }
     
    //removing all the tests
    public void clear(){
        System.out.println("Clearing all the tests from drawing");
        this.tests.clear();
    }
}
