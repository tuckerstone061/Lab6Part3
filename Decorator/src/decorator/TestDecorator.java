/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decorator;

/**
 *
 * @author tucker.stone061
 */
public class TestDecorator extends SystemFrameDecorator {

  public TestDecorator(SystemFrame specialFrame) {
    super(specialFrame);
  }

  public String systemFrame() {
    return special.systemFrame() + addTestPanel();
  }

  private String addTestPanel() {
    return " + test panel areas";
  }
}
