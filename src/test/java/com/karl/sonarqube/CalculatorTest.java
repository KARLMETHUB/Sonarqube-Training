//package com.karl.sonarqube;
//
//
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import static org.junit.Assert.assertNotEquals;
//
//public class CalculatorTest {
//    private static Calculator calculator = null;
//    @BeforeClass
//    public static void initCalculator() {
//        System.out.println("Init calc");
//        calculator = new Calculator();
//    }
//    @Test
//    public void testAdd() {
//        System.out.println("do testAdd");
////        calculator = new Calculator();
//        int result = calculator.add(1, 2);
//        Assert.assertEquals(3,result);
//        assertNotEquals(8,result);
////        calculator = null;
//        System.out.println("done testAdd");
//    }
//    @Test
//    public void testMultiply(){
//        System.out.println("do testMultiply");
////        calculator = new Calculator();
//        int result = calculator.multiply(5, 2);
//        Assert.assertNotNull(calculator);
//        Assert.assertEquals(10,result);
//        assertNotEquals(8,result);
////        calculator = null;
//        System.out.println("done testMultiply");
//    }
//    @Test(expected = RuntimeException.class)
//    public void testDivideForException()  {
//        System.out.println("runtime exception...");
//        calculator.divide(10,5);
//    }
//    @AfterClass
//    public static void cleanUpCalculator() {
//        System.out.println("Cleanup calc");
//        calculator = null;
//    }
//}
//
