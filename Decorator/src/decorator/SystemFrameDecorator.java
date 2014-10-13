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
abstract class SystemFrameDecorator implements SystemFrame {
    
    protected SystemFrame special;
    
    public SystemFrameDecorator( SystemFrame specialFrame ) {
        this.special = specialFrame;
    }
    
    public String systemFrame() {
        return special.systemFrame();
    }
    
}
