package testNGFramework;

import org.testng.annotations.Test;

public class grouping {
	@Test(groups="odd")
	public void f1() {
		System.out.println("Printing F1");
	}
	@Test(groups="even")
	public void f2() {
		System.out.println("Printing F1");
	}
	@Test(groups="odd")
	public void f3() {
		System.out.println("Printing F1");
	}
	@Test(groups="even")
	public void f4() {
		System.out.println("Printing F1");
	}



}
