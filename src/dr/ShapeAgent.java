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
public class ShapeAgent extends Agent {
       // public static String shape="round";
        //public static String contrast="dark yellow";
        public static int shape =1;

        
        public static int shape_detec(int shape){
            if(shape<0.8){  //~round
                System.out.println("Shape of the detected patches are seems to be arbitary in shape");
                return shape;
            }
            else if(shape>=0.8){   //round
                System.out.println("Shape of the detected patches are seems to be round in shape");
                System.out.println("Let's move to the colour agent decisions");
                BrightnessAgent.color_detec(BrightnessAgent.contrast);
                return shape;
            }
            else{
                System.out.println("Complecated situation occured in shape identification");
                return 1;

            }
        
        }


@Override
    protected void setup(){
            int shape_detec = shape_detec(shape);
   /* if("round".equals(shape) && "red".equals(BrightnessAgent.contrast)){
            System.out.println("Shape Agent says those red colour patches seems to be round");
            
        }
         else if((!"round".equals(shape) && "light yellow".equals(BrightnessAgent.contrast))||("round".equals(shape) && "light yellow".equals(BrightnessAgent.contrast))){
            System.out.println("Shape Agent says those light colour patches seems to be round or arbitary in shape");

        }
        else if((!"round".equals(shape) && "dark yellow".equals(BrightnessAgent.contrast))||("round".equals(shape) && "dark yellow".equals(BrightnessAgent.contrast))){
            System.out.println("Shape Agent says those dark colour patches seems to be round or arbitary in shape");

        }
        else{
            System.out.println("Complecated situation appeared with shape agent");

        }*/
    doDelete();
    }
    
}
