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
public class PrimeService_SecondTestClass extends TestCase
{
    //@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
	
    public PrimeService_SecondTestClass( String testName ){
        super( testName );
    }

    public static Test suite(){
        return new TestSuite( PrimeService_SecondTestClass.class );
    }

    public void testApp(){
        assertTrue( true );
    }
    
  public void FailingTest() {
	String message2 = "Test Sec2";
        Assert.assertEquals("Second Test", "Test Sec2", message2);
    }
}
