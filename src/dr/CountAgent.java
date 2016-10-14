/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr;

import jade.core.Agent;

/**
 *
 * @author Lakshika
 */
public class CountAgent extends Agent{
    public static int count=5;
  //  public static String contrast="dark yellow";
    
    @Override
    protected void setup(){
    /* if("red".equals(contrast) && "round".equals(ShapeAgent.shape)){
            System.out.println("Detected "+count +" Microneurysms in input image");
            

        }
        else if(("light yellow".equals(contrast) && "round".equals(ShapeAgent.shape)) || ("yellow".equals(contrast) && "round".equals(ShapeAgent.shape))){
            System.out.println("Detected "+count +" exudates in input image");

        }
        else if(("dark yellow".equals(contrast) && "round".equals(ShapeAgent.shape)) || ("yellow".equals(contrast) && "round".equals(ShapeAgent.shape))){
            System.out.println("Detected "+count +" exudates in input image");

        }
        else{
            System.out.println("Complecated situation appeared with count agent");

        }*/
        
        if(((1.12<BrightnessAgent.contrast) && (3.12>BrightnessAgent.contrast)) && ShapeAgent.shape >=0.8){
            System.out.println("Detected "+count +" Microneurysms in input image");          
        }
        else if(((3.12<BrightnessAgent.contrast) && (4.12>BrightnessAgent.contrast)) && ShapeAgent.shape < 0.8){
            System.out.println("Detected "+count +" exudates in input image");          
        }
        else if(((3.12<BrightnessAgent.contrast) && (4.12>BrightnessAgent.contrast)) && ShapeAgent.shape >= 0.8){
            System.out.println("Detected "+count +" exudates in input image");          
        }
        else{
                System.out.println("Complecated situation occured in shape identification");
            }
     doDelete();
}
}
