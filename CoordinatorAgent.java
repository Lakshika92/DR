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
public class CoordinatorAgent extends masmt2.agent.MaSMTAgent{
        public static String contrast="red";
        int livecount;


    @Override
    public void active() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void live() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(ShapeAgent.shape=="round" && BrightnessAgent.contrast=="red"){
            System.out.println("So it can be microaneurysms");
            System.out.println("According to the final decision,it should be early stage of NPDR.\nBecause it had small red patches which called Microaneurysms");

            livecount++;
            
            if(livecount>1){setLive(false);}

        }
        else if((ShapeAgent.shape!="round" && BrightnessAgent.contrast=="light yellow")&& (ShapeAgent.shape=="round" && BrightnessAgent.contrast=="red")){
            System.out.println("So it can be soft exudates");
            System.out.println("According to the final decision,it should be moderate stage of NPDR.\nBecause it had light yellow patches which called soft exudates");


        }
        else if(ShapeAgent.shape!="round" && BrightnessAgent.contrast=="light yellow"){
            System.out.println("So it can be hard exudates");
            System.out.println("According to the final decision,it should be moderate stage of NPDR.\nBecause it had light yellow patches which called soft exudates");


        }
        else if(ShapeAgent.shape!="round" && BrightnessAgent.contrast=="dark yellow"){
            System.out.println("So it can be hard exudates");
            System.out.println("According to the final decision,it should be severe stage of NPDR.\nBecause it had dark yellow patches which called hard exudates");
        }
        else{ 
            System.out.println("Complecated situation appeared");

        }
    }
    

    @Override
    public void end() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
