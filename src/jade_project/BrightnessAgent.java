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
       System.out.println("Active");

    }
    @Override
        public void live() {
        if(contrast=="red" && ShapeAgent.shape=="round"){
            System.out.println("Microaneurysms appeared according to the contrast level");
            livecount++;
            
            if(livecount>5){setLive(false);}

        }
        else if((contrast=="yellow" && ShapeAgent.shape=="round") || (contrast=="yellow" && ShapeAgent.shape=="round")){
            System.out.println("Exudates appeared according to the contrast level");

        }
        else{
            System.out.println("Complecated situation appeared");

        }
    }

    @Override
    public void end() {
       System.out.println("End");

    }

}
