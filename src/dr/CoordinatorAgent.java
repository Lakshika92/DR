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
public class CoordinatorAgent extends Agent {
    
    public static void final_decision(int count){
        if(((1.12<BrightnessAgent.contrast) && (3.12>BrightnessAgent.contrast)) && ShapeAgent.shape >=0.8){
            if(CountAgent.count <2){
                System.out.println("According to the final decision,it should be early stage of NPDR.\nBecause it had small red patches which called Microaneurysms");

            }
            else{
                System.out.println("According to the final decision,it should be moderate stage of NPDR.\nBecause it had light yellow patches which called soft exudates");
            
            }
           
        }
        
        else if(((3.12<BrightnessAgent.contrast) && (4.12>BrightnessAgent.contrast)) && ShapeAgent.shape < 0.8){
            if(CountAgent.count >0){
                System.out.println("According to the final decision,it should be severe stage of NPDR.\nBecause it had dark yellow patches which called hard exudates");  
        }
        }
        else if(((3.12<BrightnessAgent.contrast) && (4.12>BrightnessAgent.contrast)) && ShapeAgent.shape >= 0.8){
            if(CountAgent.count >0){
                System.out.println("According to the final decision,it should be severe stage of NPDR.\nBecause it had dark yellow patches which called hard exudates");  
        }
        }
        else{
                System.out.println("Complecated situation occured in the DR classification");
        
        }
    }

     public static void Future_color_decision(int contrast){
        int new_contrast;
        new_contrast = (contrast*101)/100;  // if input value increased in 1%
        BrightnessAgent.color_detec(new_contrast);
        final_decision(CountAgent.count); //here total count value doesnt changed we only considerring if input changed by 1%
       //then waht happened?
    }
     
     public static void Future_shape_decision(int shape){
        int new_shape;
        new_shape = (shape*101)/100;  // if input value increased in 1%
        BrightnessAgent.color_detec(new_shape);
        ShapeAgent.shape_detec(new_shape);
        final_decision(CountAgent.count);
    }

    @Override
    protected void setup(){
        
        if((1.12<BrightnessAgent.contrast) && (4.12>BrightnessAgent.contrast)){
            BrightnessAgent.color_detec(BrightnessAgent.contrast);
            final_decision(CountAgent.count);
            System.out.println("\n If color value will increased by 1% then final decision will be \n");
            Future_color_decision(BrightnessAgent.contrast); 
          
        }
        else if((ShapeAgent.shape<0.8) && (3.12<BrightnessAgent.contrast) && (4.12>BrightnessAgent.contrast)){
            BrightnessAgent.color_detec(BrightnessAgent.contrast);
            ShapeAgent.shape_detec(ShapeAgent.shape);
            final_decision(CountAgent.count);
            System.out.println("\n If shape value will increased by 1% then final decision will be \n");
            Future_shape_decision(ShapeAgent.shape);

        }
        
        else if((ShapeAgent.shape>=0.8) && (1.12<BrightnessAgent.contrast) && (3.12>BrightnessAgent.contrast)){
            BrightnessAgent.color_detec(BrightnessAgent.contrast);
            ShapeAgent.shape_detec(ShapeAgent.shape);
            final_decision(CountAgent.count);
            System.out.println("\n If shape value will increased by 1% then final decision will be \n");
            Future_shape_decision(ShapeAgent.shape);
        }
        
        else{
            System.out.println("Complecated situation identify by co-ordinator agent");

        }
        //Identification of mild stage..........
    /*if("round".equals(ShapeAgent.shape) && "red".equals(BrightnessAgent.contrast)){
            System.out.println("So it can be microaneurysms");
            System.out.println("According to the final decision,it should be early stage of NPDR.\nBecause it had small red patches which called Microaneurysms");
            doDelete();

           
        }
            //Identification of moderate stage..........

         else if((!"round".equals(ShapeAgent.shape) && "light yellow".equals(BrightnessAgent.contrast))&& ("round".equals(ShapeAgent.shape) && "red".equals(BrightnessAgent.contrast))){
            System.out.println("So it can be soft exudates");
            System.out.println("According to the final decision,it should be moderate stage of NPDR.\nBecause it had light yellow patches which called soft exudates");
            doDelete();  


        }
        else if(!"round".equals(ShapeAgent.shape) && "light yellow".equals(BrightnessAgent.contrast)){
            System.out.println("So it can be hard exudates");
            System.out.println("According to the final decision,it should be moderate stage of NPDR.\nBecause it had light yellow patches which called soft exudates");
            doDelete();


        }
                //Identification of Severe stage..........

        else if(!"round".equals(ShapeAgent.shape) && "dark yellow".equals(BrightnessAgent.contrast)){
            System.out.println("So it can be hard exudates");
            System.out.println("According to the final decision,it should be severe stage of NPDR.\nBecause it had dark yellow patches which called hard exudates");
            doDelete();

        }
        else if("round".equals(ShapeAgent.shape) && "dark yellow".equals(BrightnessAgent.contrast)){
            System.out.println("So it can be hard exudates");
            System.out.println("According to the final decision,it should be severe stage of NPDR.\nBecause it had dark yellow patches which called hard exudates");
            doDelete();

        }
        else{ 
            System.out.println("Complicated situation appeared");
            doDelete();//terminate


        }
            
        if(((1.12<BrightnessAgent.contrast) && (3.12>BrightnessAgent.contrast)) && ShapeAgent.shape >=0.8){
            if(CountAgent.count <2){
                System.out.println("According to the final decision,it should be early stage of NPDR.\nBecause it had small red patches which called Microaneurysms");

            }
            else{
                System.out.println("According to the final decision,it should be moderate stage of NPDR.\nBecause it had light yellow patches which called soft exudates");
            
            }
           
        }
        
        else if(((3.12<BrightnessAgent.contrast) && (4.12>BrightnessAgent.contrast)) && ShapeAgent.shape < 0.8){
            if(CountAgent.count >0){
                System.out.println("According to the final decision,it should be severe stage of NPDR.\nBecause it had dark yellow patches which called hard exudates");  
        }
        }
        else if(((3.12<BrightnessAgent.contrast) && (4.12>BrightnessAgent.contrast)) && ShapeAgent.shape >= 0.8){
            if(CountAgent.count >0){
                System.out.println("According to the final decision,it should be severe stage of NPDR.\nBecause it had dark yellow patches which called hard exudates");  
        }
        }
        else{
                System.out.println("Complecated situation occured in the DR classification");
        
        }
        */
    //doDelete();
    }
}
 