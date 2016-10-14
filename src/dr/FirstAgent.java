/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dr;

import jade.core.Agent;

/**
 *
 * @author Dell
 */
public class FirstAgent extends Agent {
    
    /**
     *
     */
    @Override
    protected void setup(){
    System.out.println("Hello Jade");
    System.out.println("I'm the first Agent.");
    doDelete();
    }
}
