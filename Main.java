package in.sp.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ab.beans.Student;
 public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("in/ab/student/ApplicationContex.xml");
        Student std= (Student) context.getBean("StdId");
      std.display();
        
    }
}
