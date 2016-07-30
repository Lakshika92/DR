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
public class TestAgent extends masmt2.agent.MaSMTAgent{

    int livecount;
    @Override
    public void active() {
        System.out.println("Active");
        livecount=0;
    }

    @Override
    public void live() {
        System.out.println("Live");
        livecount++;
        wait(100);
        
        if(livecount>10){
        setLive(false);
        //tell agent to die
        }
    }

    @Override
    public void end() {
       System.out.println("End");

    }
    
}
