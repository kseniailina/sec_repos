package ru.apache_maven;

//import static org.junit.Assert.assertTrue;

//import org.junit.Test;
import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Rigorous Test :-)
     */
    //@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
	
	public AppTest( String testName ){
        super( testName );
    }

    public static Test suite(){
        return new TestSuite( AppTest.class );
    }

    public void testApp(){
        assertTrue( true );
    }
    
    public void testAssert() {
	String message = new AppBean("Maven 2").sayHello();
        Assert.assertEquals("Test Hello Machine", "Hello Maven 2", message);
    }
    
    public void testAssert2() {
	String message2 = "Test Sec2";
        Assert.assertEquals("Second Test", "Test Sec2", message2);
    }
    
     public void testAssert3() {
	String message3 = "Test Sec3";
        Assert.assertEquals("Second Test", "Test Sec", message3);
    }
    
    public void testAssert4() {
	String message4 = "Test Sec4";
        Assert.assertEquals("Second Test", "Test Sec", message4);
    }
    
    public void testAssert5() {
	String message5 = "Test Sec5";
        Assert.assertEquals("Second Test", "Test Sec5", message5);
    }
}
