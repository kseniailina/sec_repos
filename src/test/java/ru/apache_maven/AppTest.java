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
        Assert.assertEquals("Second Test", "Test Sec121", message12);
    }
    public void testAssert13() {
        String message13 = "Test Sec13";
        Assert.assertEquals("Second Test", "Test Sec13", message13);
    }
    public void testAssert14() {
        String message14 = "Test Sec14";
        Assert.assertEquals("Second Test", "Test Sec141", message14);
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
        Assert.assertEquals("Second Test", "Test Sec22", message22);
    }
    public void testAssert23() {
    String message23 = "Test Sec23";
    Assert.assertEquals("Second Test", "Test Sec23", message23);
    }
    public void testAssert24() {
        String message24 = "Test Sec24";
        Assert.assertEquals("Second Test", "Test Sec24", message24);
    }
    public void testAssert25() {
        String message25 = "Test Sec25";
        Assert.assertEquals("Second Test", "Test Sec25", message25);
    }
    public void testAssert26() {
        String message26 = "Test Sec26";
        Assert.assertEquals("Second Test", "Test Sec26", message26);
    }
    public void testAssert27() {
        String message27 = "Test Sec27";
        Assert.assertEquals("Second Test", "Test Sec27", message27);
    }
    public void testAssert28() {
        String message28 = "Test Sec28";
        Assert.assertEquals("Second Test", "Test Sec28", message28);
    }
    public void testAssert29() {
        String message29 = "Test Sec29";
        Assert.assertEquals("Second Test", "Test Sec28", message29);
    }
     public void testAssert30() {
        String message30 = "Test Sec30";
        Assert.assertEquals("Second Test", "Test Sec20", message30);
    }
    public void testAssert31() {
        String message31 = "Test Sec31";
        Assert.assertEquals("Second Test", "Test Sec21", message31);
    }
    public void testAssert32() {
        String message32 = "Test Sec32";
        Assert.assertEquals("Second Test", "Test Sec22", message32);
    }
    public void testAssert33() {
    String message33 = "Test Sec33";
    Assert.assertEquals("Second Test", "Test Sec23", message33);
    }
    public void testAssert34() {
        String message34 = "Test Sec34";
        Assert.assertEquals("Second Test", "Test Sec24", message34);
    }
    public void testAssert35() {
        String message35 = "Test Sec35";
        Assert.assertEquals("Second Test", "Test Sec25", message35);
    }
    public void testAssert36() {
        String message36 = "Test Sec36";
        Assert.assertEquals("Second Test", "Test Sec26", message36);
    }
    public void testAssert37() {
        String message37 = "Test Sec37";
        Assert.assertEquals("Second Test", "Test Sec27", message37);
    }
    public void testAssert38() {
        String message38 = "Test Sec38";
        Assert.assertEquals("Second Test", "Test Sec28", message38);
    }
    public void testAssert39() {
        String message39 = "Test Sec39";
        Assert.assertEquals("Second Test", "Test Sec28", message39);
    }
     public void testAssert40() {
        String message40 = "Test Sec40";
        Assert.assertEquals("Second Test", "Test Sec20", message40);
    }
    public void testAssert41() {
        String message41 = "Test Sec41";
        Assert.assertEquals("Second Test", "Test Sec21", message41);
    }
    public void testAssert42() {
        String message42 = "Test Sec42";
        Assert.assertEquals("Second Test", "Test Sec22", message42);
    }
    public void testAssert43() {
    String message43 = "Test Sec43";
    Assert.assertEquals("Second Test", "Test Sec23", message43);
    }
    public void testAssert44() {
        String message44 = "Test Sec44";
        Assert.assertEquals("Second Test", "Test Sec24", message44);
    }
    public void testAssert45() {
        String message45 = "Test Sec45";
        Assert.assertEquals("Second Test", "Test Sec25", message45);
    }
    public void testAssert46() {
        String message46 = "Test Sec46";
        Assert.assertEquals("Second Test", "Test Sec26", message46);
    }
    public void testAssert47() {
        String message47 = "Test Sec47";
        Assert.assertEquals("Second Test", "Test Sec27", message47);
    }
    public void testAssert48() {
        String message48 = "Test Sec48";
        Assert.assertEquals("Second Test", "Test Sec48", message48);
    }
    public void testAssert49() {
        String message49 = "Test Sec49";
        Assert.assertEquals("Second Test", "Test Sec49", message49);
    }
    public void FailingTest() {
        String message27 = "Test Sec27";
        Assert.assertEquals("Second Test", "Test Sec27", message27);
    }
    
    public void ReturnFalseGivenValueOf3() {
        String message28 = "Test Sec21";
        Assert.assertEquals("Second Test1", "Test Sec281", message28);
    }
    //
}
