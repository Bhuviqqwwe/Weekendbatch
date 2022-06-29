package testNGFramework;

import org.testng.annotations.Test;

public class methodDependency {
	@Test
	public void f1() {
		System.out.println("Printing F1");
	}
	@Test(dependsOnMethods="f3")
	public void f2() {
		System.out.println("Printing F1");
	}
	@Test
	public void f3() {
		System.out.println("Printing F1");
	}
	@Test
	public void f4() {
		System.out.println("Printing F1");
	}

}
