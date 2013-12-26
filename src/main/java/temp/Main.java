package temp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/aop-example.xml");
        Employee tester = context.getBean("tester", Employee.class);
        tester.doTheNeedful();
        tester.doTheNeedful();

        Employee devops = context.getBean("devops", Employee.class);
        devops.doTheNeedful();
    }
}
