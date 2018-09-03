package guru.spring.course;

import guru.spring.course.controllers.ConstructorInjectedController;
import guru.spring.course.controllers.MyController;
import guru.spring.course.controllers.PropertyInjectedController;
import guru.spring.course.controllers.SetterInjectedController;
import guru.spring.course.examples.FakeDataSource;
import guru.spring.course.examples.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCourseApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringCourseApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        FakeJMSBroker fakeJMSBroker = (FakeJMSBroker) ctx.getBean(FakeJMSBroker.class);

        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());

         System.out.println(fakeJMSBroker.getUserJMS());
        System.out.println(fakeJMSBroker.getPasswordJMS());
        System.out.println(fakeJMSBroker.getUrlJMS());




    }

}
