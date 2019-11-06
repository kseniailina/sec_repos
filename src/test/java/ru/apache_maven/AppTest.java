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
        Assert.assertEquals("Second Test", "Test Sec3", message3);
    }
    
    public void testAssert4() {
	String message4 = "Test Sec4";
        Assert.assertEquals("Second Test", "Test Sec4", message4);
    }
    
    public void testAssert5() {
	String message5 = "Test Sec5";
        Assert.assertEquals("Second Test", "Test Sec5", message5);
    }

    public void testAssert6() {
        String message6 = "Test Sec6";
        Assert.assertEquals("Second Test", "Test Sec6", message6);
    }
    public void testAssert7() {
        String message7 = "Test Sec7";
        Assert.assertEquals("Second Test", "Test Sec7", message7);
    }

    public void testAssert8() {
        String message8 = "Test Sec8";
        Assert.assertEquals("Second Test", "Test Sec8", message8);
    }

    public void testAssert9() {
        String message9 = "Test Sec9";
        Assert.assertEquals("Second Test", "Test Sec9", message9);
    }
    public void testAssert10() {
        String message10 = "Test Sec10";
        Assert.assertEquals("Second Test", "Test Sec10", message10);
    }

    public void testAssert11() {
        String message11 = "Test Sec11";
        Assert.assertEquals("Second Test", "Test Sec11", message11);
    }

    public void testAssert12() {
        String message12 = "Test Sec12";
        Assert.assertEquals("Second Test", "Test Sec12", message12);
    }
    public void testAssert13() {
        String message13 = "Test Sec13";
        Assert.assertEquals("Second Test", "Test Sec13", message13);
    }
    public void testAssert14() {
        String message14 = "Test Sec14";
        Assert.assertEquals("Second Test", "Test Sec14", message14);
    }
    public void testAssert15() {
        String message15 = "Test Sec15";
        Assert.assertEquals("Second Test", "Test Sec15", message15);
    }
    public void testAssert16() {
        String message16 = "Test Sec16";
        Assert.assertEquals("Second Test", "Test Sec16", message16);
    }
    public void testAssert17() {
        String message17 = "Test Sec17";
        Assert.assertEquals("Second Test", "Test Sec17", message17);
    }
    public void testAssert18() {
        String message18 = "Test Sec18";
        Assert.assertEquals("Second Test", "Test Sec18", message18);
    }
    public void testAssert19() {
        String message19 = "Test Sec19";
        Assert.assertEquals("Second Test", "Test Sec19", message19);
    }
    public void testAssert20() {
        String message20 = "Test Sec20";
        Assert.assertEquals("Second Test", "Test Sec20", message20);
    }
    public void testAssert21() {
        String message21 = "Test Sec21";
        Assert.assertEquals("Second Test", "Test Sec21", message21);
    }
    public void testAssert22() {
        String message22 = "Test Sec22";
        Assert.assertEquals("Second Test", "Test Sec2", message22);
    }
    public void testAssert23() {
    String message23 = "Test Sec23";
    Assert.assertEquals("Second Test", "Test Sec2", message23);
    }
    public void testAssert24() {
        String message24 = "Test Sec24";
        Assert.assertEquals("Second Test", "Test Sec2", message24);
    }
    public void testAssert25() {
        String message25 = "Test Sec25";
        Assert.assertEquals("Second Test", "Test Sec2", message25);
    }
    public void testAssert26() {
        String message26 = "Test Sec26";
        Assert.assertEquals("Second Test", "Test Sec26", message26);
    }
    public void testAssert27() {
        String message27 = "Test Sec27";
        Assert.assertEquals("Second Test", "Test Sec26", message27);
    }
    public void FailingTest() {
        String message27 = "Test Sec27";
        Assert.assertEquals("Second Test", "Test Sec2", message27);
    }
    public void ReturnFalseGivenValueOf3() {
        String message28 = "Test Sec28";
        Assert.assertEquals("Second Test", "Test Sec2", message28);
    }
}
