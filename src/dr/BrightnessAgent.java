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
public class BrightnessAgent extends Agent{      
     // public static String contrast="dark yellow";
      public static int contrast=4;

    
    //function for colour agent classification part
    public static int color_detec(int contrast){
        if((1.12<contrast) && (3.12>contrast)){
            System.out.println("It has some red colour patches");
            return contrast;
        }
        else if((3.12<contrast) && (4.12>contrast)){
            System.out.println("It has some yellow colour patches");
            return contrast;

        }
        else{
            System.out.println("Complicated situation occured in colour identification");
            return 0;
        }
    
    }
    
    @Override
    protected void setup(){
          int color_detec = color_detec(contrast);
     /*if("red".equals(contrast) && "round".equals(ShapeAgent.shape)){
            System.out.println("Colour Agent says there are some red patches");
            

        }
        else if(("light yellow".equals(contrast) && "round".equals(ShapeAgent.shape)) || ("yellow".equals(contrast) && "round".equals(ShapeAgent.shape))){
            System.out.println("Colour Agent says there are some Light yellow patches");

        }
        else if(("dark yellow".equals(contrast) && "round".equals(ShapeAgent.shape)) || ("yellow".equals(contrast) && "round".equals(ShapeAgent.shape))){
            System.out.println("Colour Agent says there are some Dark yellow patches");

        }
        else{
            System.out.println("Complecated situation appeared with brightness agent");

        }*/
     doDelete();
    }
}
