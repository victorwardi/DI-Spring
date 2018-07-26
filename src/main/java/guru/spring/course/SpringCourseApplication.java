package guru.spring.course;

import guru.spring.course.controllers.ConstructorInjectedController;
import guru.spring.course.controllers.MyController;
import guru.spring.course.controllers.PropertyInjectedController;
import guru.spring.course.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCourseApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringCourseApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        myController.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}
