package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void test_launch()
	{
		System.out.println("this is before");
	}
	@After
	public void test_close()
	{
		System.out.println("this is after");
	}
}
