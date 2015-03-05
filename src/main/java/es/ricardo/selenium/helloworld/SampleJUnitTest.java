package es.ricardo.selenium.helloworld;

import org.junit.*;


public class SampleJUnitTest {
	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("Hello.. Im in before class method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Hello.. im in Before test method");
	}

	@Test
	public void testcaseOne() {
		System.out.println("Hello... Im in First test case");
	}

	@Test
	public void testcaseTwo() {
		System.out.println("Hello... Im in second test case");
	}

	@Test
	public void testsaseThree() {
		System.out.println("Hello... Im in third test case");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Hello.. im in After test method");
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("Hello.. Im in After class method");
	}
}
