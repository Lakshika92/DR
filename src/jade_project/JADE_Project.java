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
public class JADE_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // TestAgent agent =new TestAgent();
        //ShapeAgent agent1 =new ShapeAgent();
        //SizeAgent agent1 =new SizeAgent();
        BrightnessAgent agent1 =new BrightnessAgent();

        agent1.start();
    }
    
}
