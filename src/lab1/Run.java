/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Corbin
 */
public class Run {
    
        public static void main(String[] args) {
        // TODO code application logic here
           
            ProgrammingClasses course1 = new IntroJavaCourse();
            ProgrammingClasses course2 = new IntroToProgrammingCourse();
            
            course1.setCourseNumber("124432");
            
            System.out.println(course1.getCourseNumber());
            
            
    }
}
