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
    public static String size="small";
    public static String contrast="red";


    public static void main(String[] args) {
        // TODO code application logic here

       // TestAgent agent =new TestAgent();
        ShapeAgent agent1 =new ShapeAgent();
       // SizeAgent agent2 =new SizeAgent();
        BrightnessAgent agent3 =new BrightnessAgent();
        CoordinatorAgent agent4 =new CoordinatorAgent();


     //   agent2.start();
        agent3.start();//colour agent will start
        agent1.start();//shape agent will start
        agent4.start();//coordinator agent will start


    }
    
}
