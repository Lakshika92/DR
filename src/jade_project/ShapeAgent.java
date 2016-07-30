/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jade_project;

/**BrightnessAgent
 *
 * @author Dell
 */
public class ShapeAgent extends masmt2.agent.MaSMTAgent {


    
    public static String shape="round";
    int livecount;

    
    
    @Override
    public void active() {
       System.out.println("Active");

    }
    @Override
        public void live() {
        if(shape=="round" && BrightnessAgent.contrast=="red"){
            System.out.println("Microaneurysms appeared");
            livecount++;
            
            if(livecount>5){setLive(false);}

        }
        else if(shape!="round" && BrightnessAgent.contrast=="yellow"){
            System.out.println("Exudates appeared");

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
