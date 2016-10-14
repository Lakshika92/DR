/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dr;

//import java.io.FileInputStream;

/**
 *
 * @author Dell
 */
public class JADE_Project {
    public static String size="small";
    public static String contrast="red";
   // private static Object Workbook;


    public static void main(String[] args) {
        
        
        // TODO code application logic here

       // TestAgent agent =new TestAgent();
        ShapeAgent agent1 =new ShapeAgent();
       // SizeAgent agent2 =new SizeAgent();
        BrightnessAgent agent3 =new BrightnessAgent();
        CoordinatorAgent agent4 =new CoordinatorAgent();

        agent1.run();
        agent3.run();

    }
}
