package guru.springframework.sfgdi;

import ch.qos.logback.core.net.ObjectWriter;
import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.exempleBeans.FakeData;
import guru.springframework.sfgdi.exempleBeans.FakeJmsData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =  SpringApplication.run(SfgDiApplication.class, args);
		/*
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("------ "+i18nController.getProfile()+" Profile");

		System.out.println(i18nController.sayHello());

		System.out.println("------ Primary");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
*/

		MyController myController = (MyController) ctx.getBean("myController");



		FakeData fakeData = (FakeData) ctx.getBean("fakeData");
		System.out.println(fakeData.toString());

		FakeJmsData fakeJmsData = (FakeJmsData) ctx.getBean("fakeJmsData");
		System.out.println(fakeJmsData.toString());

		/* System.out.println(myController.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());
		System.out.println(ctx.getBean(GetterInjectedController.class).SayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());
		 */
	}

}
