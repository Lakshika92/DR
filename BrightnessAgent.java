/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jade_project;

/**
 *
 * @author Dell
 */
public class BrightnessAgent extends masmt2.agent.MaSMTAgent {
    public static String contrast="red";
    int livecount;

    
    
    @Override
    public void active() {
     //  System.out.println("Active");

    }
    @Override
        public void live() {
        if(contrast=="red" && ShapeAgent.shape=="round"){
            System.out.println("Colour Agent says there are some red patches");
            livecount++;
            
            if(livecount>1){setLive(false);}

        }
        else if((contrast=="light yellow" && ShapeAgent.shape=="round") || (contrast=="yellow" && ShapeAgent.shape=="round")){
            System.out.println("Colour Agent says there are some Light yellow patches");

        }
        else if((contrast=="dark yellow" && ShapeAgent.shape=="round") || (contrast=="yellow" && ShapeAgent.shape=="round")){
            System.out.println("Colour Agent says there are some Dark yellow patches");

        }
        else{
            System.out.println("Complecated situation appeared");

        }
    }

    @Override
    public void end() {
     //  System.out.println("End");

    }

}
