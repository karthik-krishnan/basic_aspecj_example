package in.karthiks.java.aspects.simple.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SimpleAspect {
	@Before("   call(void java.io.PrintStream.println(String)) " +
			"&& !within(in.karthiks.java.aspects.simple.aspect..*)")
	public void beforePrintlnCall() {
		System.out.println("About to make call to print Hello World");
	}

	@After("   call(void java.io.PrintStream.println(String)) " +
			"&& !within(in.karthiks.java.aspects.simple.aspect..*)")
	public void afterPrintlnCall() {
		System.out.println("Just made call to print Hello World");
	}
}
