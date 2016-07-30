/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jade_project;

/**
 *
 * @author Dell
 * but not sure sometimes size can be an agent or not
 */
public class SizeAgent extends masmt2.agent.MaSMTAgent{
    
    public static String size="small";
    int livecount;

    
    
    @Override
    public void active() {
       System.out.println("Active");

    }
    @Override
        public void live() {
        if(size=="small"){
            System.out.println("Microaneurysms appeared according to the size");
            livecount++;
            
            if(livecount>5){setLive(false);}

        }
        else if(size!="small" || size=="small" ){
            System.out.println("Exudates appeared according to the size");

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
