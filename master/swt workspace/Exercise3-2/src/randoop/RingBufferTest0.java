package randoop;

import junit.framework.*;

public class RingBufferTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test1");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test2");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test3");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test4");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      randoop.RingBuffer var1 = new randoop.RingBuffer((-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test5");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test6");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test7");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test8");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test9");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test10");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test11");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    int var2 = var1.size();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test12");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test13");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var15 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test14");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test15");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test16");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    java.util.Iterator var13 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test17");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test18");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test19");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test20");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    java.lang.Object var14 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test21");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test22");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    boolean var12 = var6.isEmpty();
    java.util.Iterator var13 = var6.iterator();
    java.util.Iterator var14 = var6.iterator();
    var1.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var1.dequeue();
    java.util.Iterator var17 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test23");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(10);
    boolean var4 = var3.isEmpty();
    boolean var5 = var3.isEmpty();
    java.util.Iterator var6 = var3.iterator();
    boolean var7 = var3.isEmpty();
    var3.enqueue((java.lang.Object)'#');
    boolean var10 = var3.isEmpty();
    var1.enqueue((java.lang.Object)var3);
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test24");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var13 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test25");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    var1.enqueue((java.lang.Object)100.0d);
    java.util.Iterator var16 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test26");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    randoop.RingBuffer var10 = new randoop.RingBuffer(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    var10.enqueue((java.lang.Object)100.0d);
    boolean var16 = var10.isEmpty();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    var10.enqueue((java.lang.Object)var18);
    boolean var22 = var18.isEmpty();
    java.util.Iterator var23 = var18.iterator();
    java.lang.Object var24 = var18.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue(var24);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '#'+ "'", var24.equals('#'));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test27");


    randoop.RingBuffer var1 = new randoop.RingBuffer(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test28");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test29");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test30");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test31");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test32");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    boolean var18 = var14.isEmpty();
    int var19 = var14.size();
    int var20 = var14.size();
    randoop.RingBuffer var22 = new randoop.RingBuffer(0);
    int var23 = var22.size();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    var14.enqueue((java.lang.Object)var25);
    int var27 = var14.size();
    randoop.RingBuffer var29 = new randoop.RingBuffer(1);
    int var30 = var29.size();
    var14.enqueue((java.lang.Object)var30);
    var1.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test33");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    java.lang.Object var11 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test34");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test35");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test36");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test37");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test38");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    var1.enqueue((java.lang.Object)var6);
    int var17 = var6.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test39");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(1);
    int var7 = var6.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    java.lang.Object var17 = var9.dequeue();
    java.util.Iterator var18 = var9.iterator();
    var6.enqueue((java.lang.Object)var9);
    java.lang.Object var20 = var6.dequeue();
    var1.enqueue(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test40");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test41");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test42");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test43");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test44");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test45");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    var1.enqueue((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test46");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    boolean var16 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test47");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    randoop.RingBuffer var5 = new randoop.RingBuffer(10);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    int var10 = var5.size();
    int var11 = var5.size();
    randoop.RingBuffer var13 = new randoop.RingBuffer(0);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var5.enqueue((java.lang.Object)var16);
    int var18 = var5.size();
    var1.enqueue((java.lang.Object)var5);
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    boolean var22 = var21.isEmpty();
    java.util.Iterator var23 = var21.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var23);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test48");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test49");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test50");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test51");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test52");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Iterator var9 = var6.iterator();
    boolean var10 = var6.isEmpty();
    var6.enqueue((java.lang.Object)'#');
    boolean var13 = var6.isEmpty();
    boolean var14 = var6.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var6);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test53");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    randoop.RingBuffer var3 = new randoop.RingBuffer(0);
    int var4 = var3.size();
    int var5 = var3.size();
    java.util.Iterator var6 = var3.iterator();
    boolean var7 = var3.isEmpty();
    var1.enqueue((java.lang.Object)var3);
    boolean var9 = var3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test54");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    int var15 = var1.size();
    randoop.RingBuffer var17 = new randoop.RingBuffer(1);
    boolean var18 = var17.isEmpty();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    java.util.Iterator var25 = var20.iterator();
    boolean var26 = var20.isEmpty();
    java.util.Iterator var27 = var20.iterator();
    java.util.Iterator var28 = var20.iterator();
    var17.enqueue((java.lang.Object)var20);
    var1.enqueue((java.lang.Object)var20);
    int var31 = var20.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test55");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    int var14 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var16 = var7.iterator();
    java.util.Iterator var17 = var7.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test56");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    java.util.Iterator var7 = var1.iterator();
    java.lang.Object var8 = var1.dequeue();
    randoop.RingBuffer var10 = new randoop.RingBuffer(2);
    int var11 = var10.size();
    var1.enqueue((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test57");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    var1.enqueue((java.lang.Object)3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test58");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test59");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    java.util.Iterator var12 = var11.iterator();
    var1.enqueue((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test60");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    randoop.RingBuffer var6 = new randoop.RingBuffer(1);
    int var7 = var6.size();
    boolean var8 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    java.util.Iterator var10 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test61");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    java.lang.Object var17 = var9.dequeue();
    java.util.Iterator var18 = var9.iterator();
    var1.enqueue((java.lang.Object)var18);
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)1.0d);
    boolean var24 = var21.isEmpty();
    int var25 = var21.size();
    var1.enqueue((java.lang.Object)var21);
    boolean var27 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test62");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    var1.enqueue((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test63");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test64");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    var1.enqueue((java.lang.Object)var11);
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    int var18 = var14.size();
    boolean var19 = var14.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    int var21 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 4);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test65");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test66");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    var11.enqueue((java.lang.Object)'#');
    boolean var14 = var11.isEmpty();
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    boolean var21 = var16.isEmpty();
    boolean var22 = var16.isEmpty();
    var11.enqueue((java.lang.Object)var16);
    java.util.Iterator var24 = var11.iterator();
    var1.enqueue((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test67");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var14 = var1.size();
    boolean var15 = var1.isEmpty();
    java.util.Iterator var16 = var1.iterator();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    var18.enqueue((java.lang.Object)100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)100.0d);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test68");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = var1.dequeue();
    randoop.RingBuffer var8 = new randoop.RingBuffer(0);
    int var9 = var8.size();
    java.util.Iterator var10 = var8.iterator();
    var1.enqueue((java.lang.Object)var10);
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + '#'+ "'", var6.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test69");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    randoop.RingBuffer var12 = new randoop.RingBuffer(10);
    var12.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var15 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    java.util.Iterator var17 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test70");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test71");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test72");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test73");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test74");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + false+ "'", var10.equals(false));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test75");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test76");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)1.0f);
    java.lang.Object var12 = var1.dequeue();
    java.lang.Object var13 = var1.dequeue();
    int var14 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '#'+ "'", var12.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 1.0f+ "'", var13.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test77");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test78");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    int var16 = var1.size();
    int var17 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test79");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var17 = var1.iterator();
    int var18 = var1.size();
    randoop.RingBuffer var20 = new randoop.RingBuffer(1);
    int var21 = var20.size();
    var1.enqueue((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test80");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test81");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test82");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test83");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    randoop.RingBuffer var3 = new randoop.RingBuffer(0);
    int var4 = var3.size();
    int var5 = var3.size();
    java.util.Iterator var6 = var3.iterator();
    boolean var7 = var3.isEmpty();
    var1.enqueue((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var3.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test84");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    int var18 = var15.size();
    java.util.Iterator var19 = var15.iterator();
    var7.enqueue((java.lang.Object)var15);
    randoop.RingBuffer var22 = new randoop.RingBuffer(1);
    java.util.Iterator var23 = var22.iterator();
    java.util.Iterator var24 = var22.iterator();
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    java.util.Iterator var29 = var26.iterator();
    boolean var30 = var26.isEmpty();
    int var31 = var26.size();
    int var32 = var26.size();
    randoop.RingBuffer var34 = new randoop.RingBuffer(0);
    int var35 = var34.size();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var26.enqueue((java.lang.Object)var37);
    int var39 = var26.size();
    var22.enqueue((java.lang.Object)var26);
    var15.enqueue((java.lang.Object)var22);
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var43 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test85");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    var1.enqueue((java.lang.Object)var15);
    java.lang.Object var17 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test86");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test87");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test88");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    java.util.Iterator var7 = var1.iterator();
    java.lang.Object var8 = var1.dequeue();
    java.lang.Object var9 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test89");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    int var16 = var1.size();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    int var21 = var18.size();
    randoop.RingBuffer var23 = new randoop.RingBuffer(1);
    int var24 = var23.size();
    boolean var25 = var23.isEmpty();
    var18.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var18);
    boolean var28 = var18.isEmpty();
    java.lang.Object var29 = var18.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test90");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    randoop.RingBuffer var10 = new randoop.RingBuffer(100);
    var1.enqueue((java.lang.Object)100);
    boolean var12 = var1.isEmpty();
    java.util.Iterator var13 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test91");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test92");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test93");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    var17.enqueue((java.lang.Object)false);
    int var24 = var17.size();
    boolean var25 = var17.isEmpty();
    int var26 = var17.size();
    java.util.Iterator var27 = var17.iterator();
    var6.enqueue((java.lang.Object)var27);
    randoop.RingBuffer var30 = new randoop.RingBuffer(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    java.util.Iterator var33 = var30.iterator();
    boolean var34 = var30.isEmpty();
    randoop.RingBuffer var36 = new randoop.RingBuffer(10);
    var36.enqueue((java.lang.Object)'#');
    java.util.Iterator var39 = var36.iterator();
    java.util.Iterator var40 = var36.iterator();
    var36.enqueue((java.lang.Object)false);
    int var43 = var36.size();
    var30.enqueue((java.lang.Object)var36);
    java.util.Iterator var45 = var36.iterator();
    var6.enqueue((java.lang.Object)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test94");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    var1.enqueue((java.lang.Object)true);
    java.util.Iterator var7 = var1.iterator();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    int var13 = var9.size();
    boolean var14 = var9.isEmpty();
    boolean var15 = var9.isEmpty();
    boolean var16 = var9.isEmpty();
    randoop.RingBuffer var18 = new randoop.RingBuffer(100);
    var9.enqueue((java.lang.Object)100);
    var1.enqueue((java.lang.Object)100);
    java.util.Iterator var21 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test95");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    randoop.RingBuffer var3 = new randoop.RingBuffer(0);
    int var4 = var3.size();
    int var5 = var3.size();
    java.util.Iterator var6 = var3.iterator();
    boolean var7 = var3.isEmpty();
    var1.enqueue((java.lang.Object)var3);
    java.util.Iterator var9 = var3.iterator();
    boolean var10 = var3.isEmpty();
    randoop.RingBuffer var12 = new randoop.RingBuffer(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    java.util.Iterator var17 = var12.iterator();
    boolean var18 = var12.isEmpty();
    java.util.Iterator var19 = var12.iterator();
    java.util.Iterator var20 = var12.iterator();
    var12.enqueue((java.lang.Object)1.0f);
    java.lang.Object var23 = var12.dequeue();
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    var25.enqueue((java.lang.Object)false);
    java.lang.Object var32 = var25.dequeue();
    java.lang.Object var33 = var25.dequeue();
    int var34 = var25.size();
    var12.enqueue((java.lang.Object)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.enqueue((java.lang.Object)var12);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '#'+ "'", var23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + '#'+ "'", var32.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + false+ "'", var33.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test96");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    boolean var23 = var22.isEmpty();
    java.util.Iterator var24 = var22.iterator();
    var20.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var20.iterator();
    java.util.Iterator var27 = var20.iterator();
    var1.enqueue((java.lang.Object)var27);
    randoop.RingBuffer var30 = new randoop.RingBuffer(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    java.util.Iterator var33 = var30.iterator();
    boolean var34 = var30.isEmpty();
    var1.enqueue((java.lang.Object)var34);
    java.util.Iterator var36 = var1.iterator();
    int var37 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 5);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test97");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)(byte)10);
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (byte)10+ "'", var8.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test98");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    randoop.RingBuffer var10 = new randoop.RingBuffer(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    java.util.Iterator var15 = var10.iterator();
    boolean var16 = var10.isEmpty();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    int var21 = var18.size();
    java.util.Iterator var22 = var18.iterator();
    var10.enqueue((java.lang.Object)var18);
    randoop.RingBuffer var25 = new randoop.RingBuffer(1);
    java.util.Iterator var26 = var25.iterator();
    java.util.Iterator var27 = var25.iterator();
    randoop.RingBuffer var29 = new randoop.RingBuffer(10);
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    java.util.Iterator var32 = var29.iterator();
    boolean var33 = var29.isEmpty();
    int var34 = var29.size();
    int var35 = var29.size();
    randoop.RingBuffer var37 = new randoop.RingBuffer(0);
    int var38 = var37.size();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    var29.enqueue((java.lang.Object)var40);
    int var42 = var29.size();
    var25.enqueue((java.lang.Object)var29);
    var18.enqueue((java.lang.Object)var25);
    var1.enqueue((java.lang.Object)var25);
    java.lang.Object var46 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test99");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    java.util.Iterator var17 = var16.iterator();
    java.util.Iterator var18 = var16.iterator();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    boolean var24 = var20.isEmpty();
    int var25 = var20.size();
    int var26 = var20.size();
    randoop.RingBuffer var28 = new randoop.RingBuffer(0);
    int var29 = var28.size();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var20.enqueue((java.lang.Object)var31);
    int var33 = var20.size();
    var16.enqueue((java.lang.Object)var20);
    var9.enqueue((java.lang.Object)var16);
    randoop.RingBuffer var37 = new randoop.RingBuffer(10);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    int var40 = var37.size();
    int var41 = var37.size();
    java.util.Iterator var42 = var37.iterator();
    int var43 = var37.size();
    var9.enqueue((java.lang.Object)var37);
    int var45 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 3);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test100");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    int var22 = var15.size();
    boolean var23 = var15.isEmpty();
    java.lang.Object var24 = var15.dequeue();
    java.lang.Object var25 = var15.dequeue();
    var1.enqueue(var25);
    java.util.Iterator var27 = var1.iterator();
    int var28 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '#'+ "'", var24.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + false+ "'", var25.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 3);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test101");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    java.lang.Object var5 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0d+ "'", var5.equals(1.0d));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test102");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(3);
    var1.enqueue((java.lang.Object)var3);
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test103");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    var16.enqueue((java.lang.Object)'#');
    boolean var19 = var16.isEmpty();
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    boolean var26 = var21.isEmpty();
    boolean var27 = var21.isEmpty();
    var16.enqueue((java.lang.Object)var21);
    var1.enqueue((java.lang.Object)var16);
    java.lang.Object var30 = var16.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + '#'+ "'", var30.equals('#'));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test104");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test105");


    randoop.RingBuffer var1 = new randoop.RingBuffer(5);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test106");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test107");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    int var2 = var1.size();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    java.lang.Object var11 = var4.dequeue();
    java.lang.Object var12 = var4.dequeue();
    java.util.Iterator var13 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    java.lang.Object var15 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + '#'+ "'", var11.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test108");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    randoop.RingBuffer var4 = new randoop.RingBuffer(1);
    boolean var5 = var4.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    java.util.Iterator var14 = var7.iterator();
    java.util.Iterator var15 = var7.iterator();
    var4.enqueue((java.lang.Object)var7);
    java.lang.Object var17 = var7.dequeue();
    int var18 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    java.util.Iterator var26 = var21.iterator();
    java.lang.Object var27 = var21.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue(var27);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test109");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    var16.enqueue((java.lang.Object)'#');
    boolean var19 = var16.isEmpty();
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    boolean var26 = var21.isEmpty();
    boolean var27 = var21.isEmpty();
    var16.enqueue((java.lang.Object)var21);
    var1.enqueue((java.lang.Object)var16);
    boolean var30 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test110");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    boolean var12 = var6.isEmpty();
    java.util.Iterator var13 = var6.iterator();
    java.util.Iterator var14 = var6.iterator();
    var1.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var1.dequeue();
    boolean var17 = var1.isEmpty();
    boolean var18 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var19 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test111");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test112");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    java.lang.Object var14 = var4.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var4.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test113");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var15 = var9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test114");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    int var18 = var15.size();
    java.util.Iterator var19 = var15.iterator();
    var7.enqueue((java.lang.Object)var15);
    randoop.RingBuffer var22 = new randoop.RingBuffer(1);
    java.util.Iterator var23 = var22.iterator();
    java.util.Iterator var24 = var22.iterator();
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    java.util.Iterator var29 = var26.iterator();
    boolean var30 = var26.isEmpty();
    int var31 = var26.size();
    int var32 = var26.size();
    randoop.RingBuffer var34 = new randoop.RingBuffer(0);
    int var35 = var34.size();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var26.enqueue((java.lang.Object)var37);
    int var39 = var26.size();
    var22.enqueue((java.lang.Object)var26);
    var15.enqueue((java.lang.Object)var22);
    var1.enqueue((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test115");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test116");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    randoop.RingBuffer var5 = new randoop.RingBuffer(10);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    int var10 = var5.size();
    int var11 = var5.size();
    randoop.RingBuffer var13 = new randoop.RingBuffer(0);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var5.enqueue((java.lang.Object)var16);
    int var18 = var5.size();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var20 = var5.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + true+ "'", var20.equals(true));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test117");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test118");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    randoop.RingBuffer var12 = new randoop.RingBuffer(10);
    var12.enqueue((java.lang.Object)'#');
    boolean var15 = var12.isEmpty();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    var12.enqueue((java.lang.Object)var17);
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    var26.enqueue((java.lang.Object)'#');
    java.util.Iterator var29 = var26.iterator();
    java.util.Iterator var30 = var26.iterator();
    var26.enqueue((java.lang.Object)false);
    int var33 = var26.size();
    boolean var34 = var26.isEmpty();
    java.lang.Object var35 = var26.dequeue();
    java.lang.Object var36 = var26.dequeue();
    var12.enqueue(var36);
    java.util.Iterator var38 = var12.iterator();
    java.util.Iterator var39 = var12.iterator();
    var1.enqueue((java.lang.Object)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + '#'+ "'", var35.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + false+ "'", var36.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test119");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    boolean var17 = var9.isEmpty();
    java.lang.Object var18 = var9.dequeue();
    var1.enqueue(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test120");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    randoop.RingBuffer var5 = new randoop.RingBuffer(10);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    int var10 = var5.size();
    int var11 = var5.size();
    randoop.RingBuffer var13 = new randoop.RingBuffer(0);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var5.enqueue((java.lang.Object)var16);
    int var18 = var5.size();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var20 = var5.iterator();
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    var22.enqueue((java.lang.Object)'#');
    java.util.Iterator var25 = var22.iterator();
    java.util.Iterator var26 = var22.iterator();
    java.util.Iterator var27 = var22.iterator();
    boolean var28 = var22.isEmpty();
    randoop.RingBuffer var30 = new randoop.RingBuffer(10);
    var30.enqueue((java.lang.Object)'#');
    int var33 = var30.size();
    java.util.Iterator var34 = var30.iterator();
    var22.enqueue((java.lang.Object)var30);
    java.lang.Object var36 = var22.dequeue();
    java.util.Iterator var37 = var22.iterator();
    var5.enqueue((java.lang.Object)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test121");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(1);
    boolean var5 = var4.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    java.util.Iterator var14 = var7.iterator();
    java.util.Iterator var15 = var7.iterator();
    var4.enqueue((java.lang.Object)var7);
    int var17 = var4.size();
    boolean var18 = var4.isEmpty();
    java.lang.Object var19 = var4.dequeue();
    var1.enqueue((java.lang.Object)var4);
    java.lang.Object var21 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test122");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)var9);
    boolean var13 = var9.isEmpty();
    java.util.Iterator var14 = var9.iterator();
    java.lang.Object var15 = var9.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var9.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test123");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    int var2 = var1.size();
    randoop.RingBuffer var4 = new randoop.RingBuffer(0);
    int var5 = var4.size();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    boolean var8 = var4.isEmpty();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)100.0f);
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test124");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test125");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    int var15 = var11.size();
    boolean var16 = var11.isEmpty();
    boolean var17 = var11.isEmpty();
    boolean var18 = var11.isEmpty();
    boolean var19 = var11.isEmpty();
    java.util.Iterator var20 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test126");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    randoop.RingBuffer var3 = new randoop.RingBuffer(0);
    int var4 = var3.size();
    int var5 = var3.size();
    java.util.Iterator var6 = var3.iterator();
    boolean var7 = var3.isEmpty();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var9 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test127");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test128");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(3);
    var1.enqueue((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test129");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    randoop.RingBuffer var3 = new randoop.RingBuffer(0);
    int var4 = var3.size();
    int var5 = var3.size();
    java.util.Iterator var6 = var3.iterator();
    boolean var7 = var3.isEmpty();
    var1.enqueue((java.lang.Object)var3);
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test130");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    randoop.RingBuffer var3 = new randoop.RingBuffer(10);
    boolean var4 = var3.isEmpty();
    boolean var5 = var3.isEmpty();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test131");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test132");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    int var2 = var1.size();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test133");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    boolean var18 = var14.isEmpty();
    int var19 = var14.size();
    int var20 = var14.size();
    randoop.RingBuffer var22 = new randoop.RingBuffer(0);
    int var23 = var22.size();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    var14.enqueue((java.lang.Object)var25);
    int var27 = var14.size();
    var1.enqueue((java.lang.Object)var27);
    java.util.Iterator var29 = var1.iterator();
    java.util.Iterator var30 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test134");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test135");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    boolean var9 = var8.isEmpty();
    java.util.Iterator var10 = var8.iterator();
    int var11 = var8.size();
    int var12 = var8.size();
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    java.util.Iterator var20 = var14.iterator();
    java.util.Iterator var21 = var14.iterator();
    var8.enqueue((java.lang.Object)var14);
    var1.enqueue((java.lang.Object)var14);
    boolean var24 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test136");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    int var2 = var1.size();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    java.lang.Object var11 = var4.dequeue();
    java.lang.Object var12 = var4.dequeue();
    java.util.Iterator var13 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    boolean var15 = var4.isEmpty();
    java.util.Iterator var16 = var4.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var4.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + '#'+ "'", var11.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test137");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    var16.enqueue((java.lang.Object)'#');
    boolean var19 = var16.isEmpty();
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    boolean var26 = var21.isEmpty();
    boolean var27 = var21.isEmpty();
    var16.enqueue((java.lang.Object)var21);
    var1.enqueue((java.lang.Object)var16);
    int var30 = var16.size();
    java.util.Iterator var31 = var16.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test138");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var14 = var4.size();
    java.lang.Object var15 = var4.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test139");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test140");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test141");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test142");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    java.lang.Object var14 = var4.dequeue();
    int var15 = var4.size();
    java.util.Iterator var16 = var4.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test143");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)1.0f);
    java.lang.Object var12 = var1.dequeue();
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    boolean var15 = var1.isEmpty();
    boolean var16 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '#'+ "'", var12.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test144");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    boolean var12 = var6.isEmpty();
    java.util.Iterator var13 = var6.iterator();
    java.util.Iterator var14 = var6.iterator();
    var1.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var1.dequeue();
    boolean var17 = var1.isEmpty();
    boolean var18 = var1.isEmpty();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    java.util.Iterator var25 = var20.iterator();
    boolean var26 = var20.isEmpty();
    java.util.Iterator var27 = var20.iterator();
    java.util.Iterator var28 = var20.iterator();
    boolean var29 = var20.isEmpty();
    var1.enqueue((java.lang.Object)var20);
    java.lang.Object var31 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test145");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test146");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    int var2 = var1.size();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    java.lang.Object var11 = var4.dequeue();
    java.lang.Object var12 = var4.dequeue();
    java.util.Iterator var13 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    boolean var15 = var4.isEmpty();
    int var16 = var4.size();
    java.util.Iterator var17 = var4.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + '#'+ "'", var11.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test147");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    randoop.RingBuffer var13 = new randoop.RingBuffer(10);
    boolean var14 = var13.isEmpty();
    java.util.Iterator var15 = var13.iterator();
    var11.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var11);
    int var18 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test148");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    randoop.RingBuffer var5 = new randoop.RingBuffer(1);
    boolean var6 = var5.isEmpty();
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    boolean var16 = var8.isEmpty();
    java.lang.Object var17 = var8.dequeue();
    java.lang.Object var18 = var8.dequeue();
    java.util.Iterator var19 = var8.iterator();
    var8.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var23 = new randoop.RingBuffer(10);
    var23.enqueue((java.lang.Object)'#');
    int var26 = var23.size();
    var23.enqueue((java.lang.Object)true);
    java.util.Iterator var29 = var23.iterator();
    java.util.Iterator var30 = var23.iterator();
    var8.enqueue((java.lang.Object)var30);
    var5.enqueue((java.lang.Object)var8);
    java.util.Iterator var33 = var8.iterator();
    java.lang.Object var34 = var8.dequeue();
    java.lang.Object var35 = var8.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + '4'+ "'", var34.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test149");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test150");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    randoop.RingBuffer var5 = new randoop.RingBuffer(10);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    int var10 = var5.size();
    int var11 = var5.size();
    randoop.RingBuffer var13 = new randoop.RingBuffer(0);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var5.enqueue((java.lang.Object)var16);
    int var18 = var5.size();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var20 = var1.iterator();
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    var22.enqueue((java.lang.Object)'#');
    java.util.Iterator var25 = var22.iterator();
    java.util.Iterator var26 = var22.iterator();
    var22.enqueue((java.lang.Object)false);
    int var29 = var22.size();
    boolean var30 = var22.isEmpty();
    java.lang.Object var31 = var22.dequeue();
    java.lang.Object var32 = var22.dequeue();
    boolean var33 = var22.isEmpty();
    randoop.RingBuffer var35 = new randoop.RingBuffer(10);
    var35.enqueue((java.lang.Object)'#');
    int var38 = var35.size();
    var35.enqueue((java.lang.Object)true);
    var22.enqueue((java.lang.Object)var35);
    randoop.RingBuffer var43 = new randoop.RingBuffer(10);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    java.util.Iterator var46 = var43.iterator();
    int var47 = var43.size();
    var43.enqueue((java.lang.Object)(byte)10);
    int var50 = var43.size();
    var35.enqueue((java.lang.Object)var43);
    java.lang.Object var52 = var43.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var43);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + '#'+ "'", var31.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + false+ "'", var32.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + (byte)10+ "'", var52.equals((byte)10));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test151");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    java.lang.Object var10 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + false+ "'", var10.equals(false));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test152");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    int var8 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test153");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    boolean var9 = var8.isEmpty();
    java.util.Iterator var10 = var8.iterator();
    int var11 = var8.size();
    int var12 = var8.size();
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    java.util.Iterator var20 = var14.iterator();
    java.util.Iterator var21 = var14.iterator();
    var8.enqueue((java.lang.Object)var14);
    var1.enqueue((java.lang.Object)var14);
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    var25.enqueue((java.lang.Object)false);
    int var32 = var25.size();
    boolean var33 = var25.isEmpty();
    java.lang.Object var34 = var25.dequeue();
    java.lang.Object var35 = var25.dequeue();
    java.util.Iterator var36 = var25.iterator();
    var25.enqueue((java.lang.Object)'4');
    java.util.Iterator var39 = var25.iterator();
    boolean var40 = var25.isEmpty();
    java.util.Iterator var41 = var25.iterator();
    var1.enqueue((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + '#'+ "'", var34.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + false+ "'", var35.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test154");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    java.lang.Object var9 = var1.dequeue();
    int var10 = var1.size();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var13 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 100L+ "'", var13.equals(100L));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test155");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    randoop.RingBuffer var4 = new randoop.RingBuffer(1);
    boolean var5 = var4.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    java.util.Iterator var14 = var7.iterator();
    java.util.Iterator var15 = var7.iterator();
    var4.enqueue((java.lang.Object)var7);
    java.lang.Object var17 = var7.dequeue();
    int var18 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    java.lang.Object var20 = var1.dequeue();
    boolean var21 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test156");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.lang.Object var9 = var1.dequeue();
    randoop.RingBuffer var11 = new randoop.RingBuffer(1);
    java.util.Iterator var12 = var11.iterator();
    boolean var13 = var11.isEmpty();
    int var14 = var11.size();
    boolean var15 = var11.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test157");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var17 = var1.iterator();
    int var18 = var1.size();
    java.lang.Object var19 = var1.dequeue();
    java.lang.Object var20 = var1.dequeue();
    int var21 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 100.0d+ "'", var20.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test158");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    randoop.RingBuffer var6 = new randoop.RingBuffer(1);
    int var7 = var6.size();
    boolean var8 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    int var10 = var6.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test159");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + false+ "'", var10.equals(false));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test160");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test161");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var17 = var1.iterator();
    int var18 = var1.size();
    java.lang.Object var19 = var1.dequeue();
    java.lang.Object var20 = var1.dequeue();
    boolean var21 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 100.0d+ "'", var20.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test162");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test163");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test164");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    var1.enqueue((java.lang.Object)(short)0);
    boolean var6 = var1.isEmpty();
    randoop.RingBuffer var8 = new randoop.RingBuffer(0);
    java.util.Iterator var9 = var8.iterator();
    var1.enqueue((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test165");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test166");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)1.0f);
    java.lang.Object var12 = var1.dequeue();
    boolean var13 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '#'+ "'", var12.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test167");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    java.util.Iterator var14 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test168");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    var1.enqueue((java.lang.Object)var6);
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var6.enqueue((java.lang.Object)var22);
    boolean var24 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test169");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    int var8 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test170");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test171");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test172");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test173");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.lang.Object var6 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + '#'+ "'", var6.equals('#'));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test174");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test175");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    int var16 = var1.size();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    int var21 = var18.size();
    randoop.RingBuffer var23 = new randoop.RingBuffer(1);
    int var24 = var23.size();
    boolean var25 = var23.isEmpty();
    var18.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var18);
    boolean var28 = var18.isEmpty();
    boolean var29 = var18.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test176");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test177");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    int var11 = var4.size();
    boolean var12 = var4.isEmpty();
    java.lang.Object var13 = var4.dequeue();
    java.lang.Object var14 = var4.dequeue();
    java.util.Iterator var15 = var4.iterator();
    var4.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var19 = new randoop.RingBuffer(10);
    var19.enqueue((java.lang.Object)'#');
    int var22 = var19.size();
    var19.enqueue((java.lang.Object)true);
    java.util.Iterator var25 = var19.iterator();
    java.util.Iterator var26 = var19.iterator();
    var4.enqueue((java.lang.Object)var26);
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var29 = var4.iterator();
    java.util.Iterator var30 = var4.iterator();
    randoop.RingBuffer var32 = new randoop.RingBuffer(10);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    boolean var37 = var32.isEmpty();
    boolean var38 = var32.isEmpty();
    boolean var39 = var32.isEmpty();
    java.util.Iterator var40 = var32.iterator();
    int var41 = var32.size();
    var4.enqueue((java.lang.Object)var41);
    java.util.Iterator var43 = var4.iterator();
    java.lang.Object var44 = var4.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + '#'+ "'", var13.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + '4'+ "'", var44.equals('4'));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test178");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)var14);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    java.util.Iterator var25 = var22.iterator();
    int var26 = var22.size();
    var22.enqueue((java.lang.Object)(byte)10);
    int var29 = var22.size();
    var14.enqueue((java.lang.Object)var22);
    java.util.Iterator var31 = var22.iterator();
    boolean var32 = var22.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test179");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)1.0f);
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test180");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    java.lang.Object var15 = var9.dequeue();
    int var16 = var9.size();
    boolean var17 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var9);
    java.lang.Object var19 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test181");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    randoop.RingBuffer var10 = new randoop.RingBuffer(100);
    var1.enqueue((java.lang.Object)100);
    int var12 = var1.size();
    int var13 = var1.size();
    java.lang.Object var14 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 100+ "'", var14.equals(100));

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test182");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var14 = var1.size();
    boolean var15 = var1.isEmpty();
    java.util.Iterator var16 = var1.iterator();
    java.lang.Object var17 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test183");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    var1.enqueue((java.lang.Object)var6);
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var6.enqueue((java.lang.Object)var22);
    java.lang.Object var24 = var6.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '#'+ "'", var24.equals('#'));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test184");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    java.util.Iterator var17 = var16.iterator();
    java.util.Iterator var18 = var16.iterator();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    boolean var24 = var20.isEmpty();
    int var25 = var20.size();
    int var26 = var20.size();
    randoop.RingBuffer var28 = new randoop.RingBuffer(0);
    int var29 = var28.size();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var20.enqueue((java.lang.Object)var31);
    int var33 = var20.size();
    var16.enqueue((java.lang.Object)var20);
    var9.enqueue((java.lang.Object)var16);
    java.lang.Object var36 = var9.dequeue();
    randoop.RingBuffer var38 = new randoop.RingBuffer(10);
    boolean var39 = var38.isEmpty();
    boolean var40 = var38.isEmpty();
    java.util.Iterator var41 = var38.iterator();
    boolean var42 = var38.isEmpty();
    randoop.RingBuffer var44 = new randoop.RingBuffer(10);
    var44.enqueue((java.lang.Object)'#');
    java.util.Iterator var47 = var44.iterator();
    java.util.Iterator var48 = var44.iterator();
    var44.enqueue((java.lang.Object)false);
    int var51 = var44.size();
    var38.enqueue((java.lang.Object)var44);
    java.util.Iterator var53 = var44.iterator();
    randoop.RingBuffer var55 = new randoop.RingBuffer(1);
    boolean var56 = var55.isEmpty();
    randoop.RingBuffer var58 = new randoop.RingBuffer(10);
    var58.enqueue((java.lang.Object)'#');
    java.util.Iterator var61 = var58.iterator();
    java.util.Iterator var62 = var58.iterator();
    java.util.Iterator var63 = var58.iterator();
    boolean var64 = var58.isEmpty();
    java.util.Iterator var65 = var58.iterator();
    java.util.Iterator var66 = var58.iterator();
    var55.enqueue((java.lang.Object)var58);
    var44.enqueue((java.lang.Object)var58);
    var9.enqueue((java.lang.Object)var58);
    java.lang.Object var70 = var9.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test185");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    int var22 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    java.util.Iterator var24 = var15.iterator();
    java.lang.Object var25 = var15.dequeue();
    java.util.Iterator var26 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    int var28 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test186");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    var1.enqueue((java.lang.Object)var11);
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    int var18 = var14.size();
    boolean var19 = var14.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    var22.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var25 = var22.iterator();
    var22.enqueue((java.lang.Object)(byte)1);
    boolean var28 = var22.isEmpty();
    java.util.Iterator var29 = var22.iterator();
    var1.enqueue((java.lang.Object)var22);
    int var31 = var1.size();
    boolean var32 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test187");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    int var11 = var4.size();
    boolean var12 = var4.isEmpty();
    java.lang.Object var13 = var4.dequeue();
    java.lang.Object var14 = var4.dequeue();
    java.util.Iterator var15 = var4.iterator();
    var4.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var19 = new randoop.RingBuffer(10);
    var19.enqueue((java.lang.Object)'#');
    int var22 = var19.size();
    var19.enqueue((java.lang.Object)true);
    java.util.Iterator var25 = var19.iterator();
    java.util.Iterator var26 = var19.iterator();
    var4.enqueue((java.lang.Object)var26);
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var29 = var4.iterator();
    java.util.Iterator var30 = var4.iterator();
    randoop.RingBuffer var32 = new randoop.RingBuffer(10);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    boolean var37 = var32.isEmpty();
    boolean var38 = var32.isEmpty();
    boolean var39 = var32.isEmpty();
    java.util.Iterator var40 = var32.iterator();
    int var41 = var32.size();
    var4.enqueue((java.lang.Object)var41);
    java.util.Iterator var43 = var4.iterator();
    java.util.Iterator var44 = var4.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + '#'+ "'", var13.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test188");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test189");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    randoop.RingBuffer var12 = new randoop.RingBuffer(10);
    var12.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var15 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    randoop.RingBuffer var18 = new randoop.RingBuffer(1);
    int var19 = var18.size();
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    var21.enqueue((java.lang.Object)false);
    java.lang.Object var28 = var21.dequeue();
    java.lang.Object var29 = var21.dequeue();
    java.util.Iterator var30 = var21.iterator();
    var18.enqueue((java.lang.Object)var21);
    boolean var32 = var21.isEmpty();
    java.util.Iterator var33 = var21.iterator();
    var1.enqueue((java.lang.Object)var33);
    java.util.Iterator var35 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + '#'+ "'", var28.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + false+ "'", var29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test190");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test191");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    int var22 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    java.util.Iterator var24 = var15.iterator();
    java.lang.Object var25 = var15.dequeue();
    java.util.Iterator var26 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    randoop.RingBuffer var29 = new randoop.RingBuffer(2);
    java.util.Iterator var30 = var29.iterator();
    var15.enqueue((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test192");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    randoop.RingBuffer var12 = new randoop.RingBuffer(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    boolean var17 = var12.isEmpty();
    var1.enqueue((java.lang.Object)var17);
    int var19 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test193");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    randoop.RingBuffer var5 = new randoop.RingBuffer(10);
    var5.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var8 = var5.iterator();
    int var9 = var5.size();
    int var10 = var5.size();
    var1.enqueue((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test194");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 1.0d+ "'", var10.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (byte)1+ "'", var11.equals((byte)1));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test195");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    boolean var13 = var9.isEmpty();
    java.util.Iterator var14 = var9.iterator();
    int var15 = var9.size();
    java.util.Iterator var16 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var18 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test196");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    int var18 = var15.size();
    java.util.Iterator var19 = var15.iterator();
    var7.enqueue((java.lang.Object)var15);
    randoop.RingBuffer var22 = new randoop.RingBuffer(1);
    java.util.Iterator var23 = var22.iterator();
    java.util.Iterator var24 = var22.iterator();
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    java.util.Iterator var29 = var26.iterator();
    boolean var30 = var26.isEmpty();
    int var31 = var26.size();
    int var32 = var26.size();
    randoop.RingBuffer var34 = new randoop.RingBuffer(0);
    int var35 = var34.size();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var26.enqueue((java.lang.Object)var37);
    int var39 = var26.size();
    var22.enqueue((java.lang.Object)var26);
    var15.enqueue((java.lang.Object)var22);
    var1.enqueue((java.lang.Object)var15);
    int var43 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test197");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    randoop.RingBuffer var10 = new randoop.RingBuffer(10);
    var10.enqueue((java.lang.Object)'#');
    boolean var13 = var10.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    boolean var20 = var15.isEmpty();
    boolean var21 = var15.isEmpty();
    var10.enqueue((java.lang.Object)var15);
    boolean var23 = var15.isEmpty();
    var1.enqueue((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test198");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test199");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    var1.enqueue((java.lang.Object)'4');
    java.util.Iterator var15 = var1.iterator();
    java.lang.Object var16 = var1.dequeue();
    java.util.Iterator var17 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '4'+ "'", var16.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test200");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test201");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test202");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test203");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    var7.enqueue((java.lang.Object)100.0d);
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    var14.enqueue((java.lang.Object)'#');
    java.util.Iterator var17 = var14.iterator();
    java.util.Iterator var18 = var14.iterator();
    var14.enqueue((java.lang.Object)false);
    int var21 = var14.size();
    var7.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var7.iterator();
    boolean var24 = var7.isEmpty();
    var1.enqueue((java.lang.Object)var24);
    int var26 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test204");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(1);
    boolean var5 = var4.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    java.util.Iterator var14 = var7.iterator();
    java.util.Iterator var15 = var7.iterator();
    var4.enqueue((java.lang.Object)var7);
    int var17 = var4.size();
    boolean var18 = var4.isEmpty();
    java.lang.Object var19 = var4.dequeue();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var21 = var4.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test205");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    randoop.RingBuffer var13 = new randoop.RingBuffer(10);
    var13.enqueue((java.lang.Object)'#');
    java.util.Iterator var16 = var13.iterator();
    java.util.Iterator var17 = var13.iterator();
    boolean var18 = var13.isEmpty();
    java.lang.Object var19 = var13.dequeue();
    java.util.Iterator var20 = var13.iterator();
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    var22.enqueue((java.lang.Object)'#');
    java.util.Iterator var25 = var22.iterator();
    java.util.Iterator var26 = var22.iterator();
    var22.enqueue((java.lang.Object)false);
    int var29 = var22.size();
    boolean var30 = var22.isEmpty();
    java.lang.Object var31 = var22.dequeue();
    java.lang.Object var32 = var22.dequeue();
    java.util.Iterator var33 = var22.iterator();
    var22.enqueue((java.lang.Object)'4');
    java.util.Iterator var36 = var22.iterator();
    var13.enqueue((java.lang.Object)var22);
    boolean var38 = var13.isEmpty();
    java.lang.Object var39 = var13.dequeue();
    var1.enqueue((java.lang.Object)var13);
    java.util.Iterator var41 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + '#'+ "'", var31.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + false+ "'", var32.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test206");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    java.lang.Object var15 = var8.dequeue();
    boolean var16 = var8.isEmpty();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    boolean var21 = var20.isEmpty();
    java.util.Iterator var22 = var20.iterator();
    var18.enqueue((java.lang.Object)var22);
    var8.enqueue((java.lang.Object)var18);
    var1.enqueue((java.lang.Object)var8);
    boolean var26 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test207");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test208");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    boolean var12 = var11.isEmpty();
    java.util.Iterator var13 = var11.iterator();
    int var14 = var11.size();
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    boolean var21 = var16.isEmpty();
    boolean var22 = var16.isEmpty();
    var11.enqueue((java.lang.Object)var22);
    java.lang.Object var24 = var11.dequeue();
    var1.enqueue(var24);
    boolean var26 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test209");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test210");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test211");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    var1.enqueue((java.lang.Object)var11);
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    int var18 = var14.size();
    boolean var19 = var14.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    var22.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var25 = var22.iterator();
    var22.enqueue((java.lang.Object)(byte)1);
    boolean var28 = var22.isEmpty();
    java.util.Iterator var29 = var22.iterator();
    var1.enqueue((java.lang.Object)var22);
    java.util.Iterator var31 = var22.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test212");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test213");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test214");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    var11.enqueue((java.lang.Object)'#');
    java.util.Iterator var14 = var11.iterator();
    var11.enqueue((java.lang.Object)100.0d);
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var18.enqueue((java.lang.Object)false);
    int var25 = var18.size();
    var11.enqueue((java.lang.Object)var25);
    java.util.Iterator var27 = var11.iterator();
    java.util.Iterator var28 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test215");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var14 = var1.size();
    boolean var15 = var1.isEmpty();
    boolean var16 = var1.isEmpty();
    java.lang.Object var17 = var1.dequeue();
    randoop.RingBuffer var19 = new randoop.RingBuffer(10);
    var19.enqueue((java.lang.Object)'#');
    boolean var22 = var19.isEmpty();
    boolean var23 = var19.isEmpty();
    java.util.Iterator var24 = var19.iterator();
    java.lang.Object var25 = var19.dequeue();
    boolean var26 = var19.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    boolean var28 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test216");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test217");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)var14);
    int var21 = var1.size();
    java.lang.Object var22 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test218");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    boolean var12 = var6.isEmpty();
    java.util.Iterator var13 = var6.iterator();
    java.util.Iterator var14 = var6.iterator();
    var1.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var1.dequeue();
    boolean var17 = var1.isEmpty();
    boolean var18 = var1.isEmpty();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    java.util.Iterator var25 = var20.iterator();
    boolean var26 = var20.isEmpty();
    java.util.Iterator var27 = var20.iterator();
    java.util.Iterator var28 = var20.iterator();
    boolean var29 = var20.isEmpty();
    var1.enqueue((java.lang.Object)var20);
    boolean var31 = var20.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test219");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    int var16 = var1.size();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    int var21 = var18.size();
    randoop.RingBuffer var23 = new randoop.RingBuffer(1);
    int var24 = var23.size();
    boolean var25 = var23.isEmpty();
    var18.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var18);
    boolean var28 = var18.isEmpty();
    java.util.Iterator var29 = var18.iterator();
    randoop.RingBuffer var31 = new randoop.RingBuffer(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    boolean var36 = var31.isEmpty();
    java.lang.Object var37 = var31.dequeue();
    java.util.Iterator var38 = var31.iterator();
    randoop.RingBuffer var40 = new randoop.RingBuffer(10);
    var40.enqueue((java.lang.Object)'#');
    java.util.Iterator var43 = var40.iterator();
    java.util.Iterator var44 = var40.iterator();
    var40.enqueue((java.lang.Object)false);
    int var47 = var40.size();
    boolean var48 = var40.isEmpty();
    java.lang.Object var49 = var40.dequeue();
    java.lang.Object var50 = var40.dequeue();
    java.util.Iterator var51 = var40.iterator();
    var40.enqueue((java.lang.Object)'4');
    java.util.Iterator var54 = var40.iterator();
    var31.enqueue((java.lang.Object)var40);
    boolean var56 = var31.isEmpty();
    java.lang.Object var57 = var31.dequeue();
    var18.enqueue((java.lang.Object)var31);
    java.util.Iterator var59 = var31.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + '#'+ "'", var37.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + '#'+ "'", var49.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + false+ "'", var50.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test220");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test221");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    randoop.RingBuffer var5 = new randoop.RingBuffer(10);
    var5.enqueue((java.lang.Object)'#');
    java.util.Iterator var8 = var5.iterator();
    java.util.Iterator var9 = var5.iterator();
    java.util.Iterator var10 = var5.iterator();
    java.lang.Object var11 = var5.dequeue();
    boolean var12 = var5.isEmpty();
    int var13 = var5.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var5);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + '#'+ "'", var11.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test222");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    java.util.Iterator var7 = var1.iterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test223");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    java.lang.Object var17 = var9.dequeue();
    java.util.Iterator var18 = var9.iterator();
    var1.enqueue((java.lang.Object)var18);
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)1.0d);
    boolean var24 = var21.isEmpty();
    int var25 = var21.size();
    var1.enqueue((java.lang.Object)var21);
    java.util.Iterator var27 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test224");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test225");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    java.lang.Object var9 = var1.dequeue();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    var11.enqueue((java.lang.Object)'#');
    java.util.Iterator var14 = var11.iterator();
    java.util.Iterator var15 = var11.iterator();
    var11.enqueue((java.lang.Object)false);
    int var18 = var11.size();
    boolean var19 = var11.isEmpty();
    java.lang.Object var20 = var11.dequeue();
    java.lang.Object var21 = var11.dequeue();
    boolean var22 = var11.isEmpty();
    var1.enqueue((java.lang.Object)var22);
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    randoop.RingBuffer var27 = new randoop.RingBuffer(10);
    boolean var28 = var27.isEmpty();
    java.util.Iterator var29 = var27.iterator();
    var25.enqueue((java.lang.Object)var29);
    java.util.Iterator var31 = var25.iterator();
    randoop.RingBuffer var33 = new randoop.RingBuffer(10);
    var33.enqueue((java.lang.Object)'#');
    java.util.Iterator var36 = var33.iterator();
    java.util.Iterator var37 = var33.iterator();
    java.util.Iterator var38 = var33.iterator();
    boolean var39 = var33.isEmpty();
    randoop.RingBuffer var41 = new randoop.RingBuffer(10);
    var41.enqueue((java.lang.Object)'#');
    int var44 = var41.size();
    java.util.Iterator var45 = var41.iterator();
    var33.enqueue((java.lang.Object)var41);
    int var47 = var33.size();
    int var48 = var33.size();
    randoop.RingBuffer var50 = new randoop.RingBuffer(10);
    boolean var51 = var50.isEmpty();
    boolean var52 = var50.isEmpty();
    int var53 = var50.size();
    randoop.RingBuffer var55 = new randoop.RingBuffer(1);
    int var56 = var55.size();
    boolean var57 = var55.isEmpty();
    var50.enqueue((java.lang.Object)var55);
    var33.enqueue((java.lang.Object)var50);
    boolean var60 = var50.isEmpty();
    java.util.Iterator var61 = var50.iterator();
    randoop.RingBuffer var63 = new randoop.RingBuffer(10);
    var63.enqueue((java.lang.Object)'#');
    java.util.Iterator var66 = var63.iterator();
    java.util.Iterator var67 = var63.iterator();
    boolean var68 = var63.isEmpty();
    java.lang.Object var69 = var63.dequeue();
    java.util.Iterator var70 = var63.iterator();
    randoop.RingBuffer var72 = new randoop.RingBuffer(10);
    var72.enqueue((java.lang.Object)'#');
    java.util.Iterator var75 = var72.iterator();
    java.util.Iterator var76 = var72.iterator();
    var72.enqueue((java.lang.Object)false);
    int var79 = var72.size();
    boolean var80 = var72.isEmpty();
    java.lang.Object var81 = var72.dequeue();
    java.lang.Object var82 = var72.dequeue();
    java.util.Iterator var83 = var72.iterator();
    var72.enqueue((java.lang.Object)'4');
    java.util.Iterator var86 = var72.iterator();
    var63.enqueue((java.lang.Object)var72);
    boolean var88 = var63.isEmpty();
    java.lang.Object var89 = var63.dequeue();
    var50.enqueue((java.lang.Object)var63);
    var25.enqueue((java.lang.Object)var63);
    var1.enqueue((java.lang.Object)var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + '#'+ "'", var20.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + false+ "'", var21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + '#'+ "'", var69.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + '#'+ "'", var81.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + false+ "'", var82.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test226");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test227");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test228");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test229");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    randoop.RingBuffer var5 = new randoop.RingBuffer(10);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    int var10 = var5.size();
    int var11 = var5.size();
    randoop.RingBuffer var13 = new randoop.RingBuffer(0);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var5.enqueue((java.lang.Object)var16);
    int var18 = var5.size();
    var1.enqueue((java.lang.Object)var5);
    boolean var20 = var1.isEmpty();
    java.lang.Object var21 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test230");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)var9);
    boolean var13 = var1.isEmpty();
    java.lang.Object var14 = var1.dequeue();
    java.lang.Object var15 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 100.0d+ "'", var15.equals(100.0d));

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test231");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    boolean var23 = var22.isEmpty();
    java.util.Iterator var24 = var22.iterator();
    var20.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var20.iterator();
    java.util.Iterator var27 = var20.iterator();
    var1.enqueue((java.lang.Object)var27);
    randoop.RingBuffer var30 = new randoop.RingBuffer(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    java.util.Iterator var33 = var30.iterator();
    boolean var34 = var30.isEmpty();
    var1.enqueue((java.lang.Object)var34);
    java.util.Iterator var36 = var1.iterator();
    randoop.RingBuffer var38 = new randoop.RingBuffer(10);
    boolean var39 = var38.isEmpty();
    boolean var40 = var38.isEmpty();
    boolean var41 = var38.isEmpty();
    int var42 = var38.size();
    boolean var43 = var38.isEmpty();
    boolean var44 = var38.isEmpty();
    var38.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var47 = var38.dequeue();
    randoop.RingBuffer var49 = new randoop.RingBuffer(10);
    boolean var50 = var49.isEmpty();
    boolean var51 = var49.isEmpty();
    boolean var52 = var49.isEmpty();
    int var53 = var49.size();
    boolean var54 = var49.isEmpty();
    boolean var55 = var49.isEmpty();
    boolean var56 = var49.isEmpty();
    java.util.Iterator var57 = var49.iterator();
    var38.enqueue((java.lang.Object)var49);
    var1.enqueue((java.lang.Object)var49);
    boolean var60 = var49.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + (-1.0d)+ "'", var47.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test232");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.lang.Object var15 = var1.dequeue();
    int var16 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test233");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    java.util.Iterator var4 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test234");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    java.util.Iterator var14 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test235");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test236");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    java.lang.Object var22 = var15.dequeue();
    java.lang.Object var23 = var15.dequeue();
    java.util.Iterator var24 = var15.iterator();
    var7.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var7.iterator();
    java.lang.Object var27 = var7.dequeue();
    var1.enqueue(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + '#'+ "'", var22.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + false+ "'", var23.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test237");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    var1.enqueue((java.lang.Object)var11);
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    int var18 = var14.size();
    boolean var19 = var14.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    var22.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var25 = var22.iterator();
    var22.enqueue((java.lang.Object)(byte)1);
    boolean var28 = var22.isEmpty();
    java.util.Iterator var29 = var22.iterator();
    var1.enqueue((java.lang.Object)var22);
    int var31 = var22.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test238");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    java.lang.Object var17 = var9.dequeue();
    java.util.Iterator var18 = var9.iterator();
    var1.enqueue((java.lang.Object)var18);
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)1.0d);
    boolean var24 = var21.isEmpty();
    int var25 = var21.size();
    var1.enqueue((java.lang.Object)var21);
    boolean var27 = var21.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test239");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test240");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    int var14 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var16 = var7.iterator();
    java.lang.Object var17 = var7.dequeue();
    randoop.RingBuffer var19 = new randoop.RingBuffer(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    var19.enqueue((java.lang.Object)100.0d);
    java.lang.Object var25 = var19.dequeue();
    java.util.Iterator var26 = var19.iterator();
    var7.enqueue((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test241");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    java.lang.Object var12 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test242");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = var1.dequeue();
    java.util.Iterator var7 = var1.iterator();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    boolean var14 = var9.isEmpty();
    java.lang.Object var15 = var9.dequeue();
    java.util.Iterator var16 = var9.iterator();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var18.enqueue((java.lang.Object)false);
    int var25 = var18.size();
    boolean var26 = var18.isEmpty();
    java.lang.Object var27 = var18.dequeue();
    java.lang.Object var28 = var18.dequeue();
    java.util.Iterator var29 = var18.iterator();
    var18.enqueue((java.lang.Object)'4');
    java.util.Iterator var32 = var18.iterator();
    var9.enqueue((java.lang.Object)var18);
    boolean var34 = var9.isEmpty();
    java.lang.Object var35 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var38 = new randoop.RingBuffer(1);
    java.util.Iterator var39 = var38.iterator();
    var1.enqueue((java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + '#'+ "'", var6.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + false+ "'", var28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test243");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    java.util.Iterator var17 = var16.iterator();
    java.util.Iterator var18 = var16.iterator();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    boolean var24 = var20.isEmpty();
    int var25 = var20.size();
    int var26 = var20.size();
    randoop.RingBuffer var28 = new randoop.RingBuffer(0);
    int var29 = var28.size();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var20.enqueue((java.lang.Object)var31);
    int var33 = var20.size();
    var16.enqueue((java.lang.Object)var20);
    var9.enqueue((java.lang.Object)var16);
    java.lang.Object var36 = var9.dequeue();
    boolean var37 = var9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test244");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    int var11 = var4.size();
    boolean var12 = var4.isEmpty();
    java.lang.Object var13 = var4.dequeue();
    java.lang.Object var14 = var4.dequeue();
    java.util.Iterator var15 = var4.iterator();
    var4.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var19 = new randoop.RingBuffer(10);
    var19.enqueue((java.lang.Object)'#');
    int var22 = var19.size();
    var19.enqueue((java.lang.Object)true);
    java.util.Iterator var25 = var19.iterator();
    java.util.Iterator var26 = var19.iterator();
    var4.enqueue((java.lang.Object)var26);
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var29 = var4.iterator();
    java.lang.Object var30 = var4.dequeue();
    java.lang.Object var31 = var4.dequeue();
    int var32 = var4.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + '#'+ "'", var13.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + '4'+ "'", var30.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test245");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    boolean var8 = var1.isEmpty();
    randoop.RingBuffer var10 = new randoop.RingBuffer(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    int var15 = var10.size();
    int var16 = var10.size();
    randoop.RingBuffer var18 = new randoop.RingBuffer(0);
    int var19 = var18.size();
    boolean var20 = var18.isEmpty();
    boolean var21 = var18.isEmpty();
    var10.enqueue((java.lang.Object)var21);
    int var23 = var10.size();
    int var24 = var10.size();
    var1.enqueue((java.lang.Object)var10);
    java.util.Iterator var26 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test246");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    java.lang.Object var15 = var9.dequeue();
    int var16 = var9.size();
    boolean var17 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var9);
    int var19 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test247");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test248");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var10 = var7.iterator();
    var7.enqueue((java.lang.Object)(byte)1);
    boolean var13 = var7.isEmpty();
    java.util.Iterator var14 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var16 = var7.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test249");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test250");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    randoop.RingBuffer var13 = new randoop.RingBuffer(10);
    var13.enqueue((java.lang.Object)'#');
    java.util.Iterator var16 = var13.iterator();
    java.util.Iterator var17 = var13.iterator();
    boolean var18 = var13.isEmpty();
    java.lang.Object var19 = var13.dequeue();
    java.util.Iterator var20 = var13.iterator();
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    var22.enqueue((java.lang.Object)'#');
    java.util.Iterator var25 = var22.iterator();
    java.util.Iterator var26 = var22.iterator();
    var22.enqueue((java.lang.Object)false);
    int var29 = var22.size();
    boolean var30 = var22.isEmpty();
    java.lang.Object var31 = var22.dequeue();
    java.lang.Object var32 = var22.dequeue();
    java.util.Iterator var33 = var22.iterator();
    var22.enqueue((java.lang.Object)'4');
    java.util.Iterator var36 = var22.iterator();
    var13.enqueue((java.lang.Object)var22);
    boolean var38 = var13.isEmpty();
    java.lang.Object var39 = var13.dequeue();
    var1.enqueue((java.lang.Object)var13);
    java.util.Iterator var41 = var13.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + '#'+ "'", var31.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + false+ "'", var32.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test251");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    boolean var12 = var8.isEmpty();
    var8.enqueue((java.lang.Object)'#');
    boolean var15 = var8.isEmpty();
    int var16 = var8.size();
    var1.enqueue((java.lang.Object)var16);
    randoop.RingBuffer var19 = new randoop.RingBuffer(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    java.util.Iterator var24 = var19.iterator();
    java.lang.Object var25 = var19.dequeue();
    boolean var26 = var19.isEmpty();
    randoop.RingBuffer var28 = new randoop.RingBuffer(10);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    java.util.Iterator var31 = var28.iterator();
    boolean var32 = var28.isEmpty();
    int var33 = var28.size();
    int var34 = var28.size();
    randoop.RingBuffer var36 = new randoop.RingBuffer(0);
    int var37 = var36.size();
    boolean var38 = var36.isEmpty();
    boolean var39 = var36.isEmpty();
    var28.enqueue((java.lang.Object)var39);
    int var41 = var28.size();
    int var42 = var28.size();
    var19.enqueue((java.lang.Object)var28);
    var1.enqueue((java.lang.Object)var28);
    java.util.Iterator var45 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test252");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)1.0f);
    java.lang.Object var12 = var1.dequeue();
    java.util.Iterator var13 = var1.iterator();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    boolean var18 = var15.isEmpty();
    boolean var19 = var15.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    boolean var21 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '#'+ "'", var12.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test253");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    var17.enqueue((java.lang.Object)false);
    int var24 = var17.size();
    boolean var25 = var17.isEmpty();
    int var26 = var17.size();
    java.util.Iterator var27 = var17.iterator();
    var6.enqueue((java.lang.Object)var27);
    java.lang.Object var29 = var6.dequeue();
    java.util.Iterator var30 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + '#'+ "'", var29.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test254");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    randoop.RingBuffer var10 = new randoop.RingBuffer(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    var10.enqueue((java.lang.Object)false);
    int var17 = var10.size();
    boolean var18 = var10.isEmpty();
    java.lang.Object var19 = var10.dequeue();
    java.lang.Object var20 = var10.dequeue();
    java.util.Iterator var21 = var10.iterator();
    var10.enqueue((java.lang.Object)'4');
    java.util.Iterator var24 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    int var26 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + false+ "'", var20.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test255");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)(byte)10);
    int var8 = var1.size();
    randoop.RingBuffer var10 = new randoop.RingBuffer(10);
    boolean var11 = var10.isEmpty();
    int var12 = var10.size();
    randoop.RingBuffer var14 = new randoop.RingBuffer(1);
    boolean var15 = var14.isEmpty();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    boolean var23 = var17.isEmpty();
    java.util.Iterator var24 = var17.iterator();
    java.util.Iterator var25 = var17.iterator();
    var14.enqueue((java.lang.Object)var17);
    int var27 = var14.size();
    boolean var28 = var14.isEmpty();
    java.lang.Object var29 = var14.dequeue();
    var10.enqueue(var29);
    var1.enqueue(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test256");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    randoop.RingBuffer var13 = new randoop.RingBuffer(10);
    boolean var14 = var13.isEmpty();
    java.util.Iterator var15 = var13.iterator();
    var11.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var18 = var1.iterator();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    int var23 = var20.size();
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    java.util.Iterator var30 = var25.iterator();
    boolean var31 = var25.isEmpty();
    java.util.Iterator var32 = var25.iterator();
    java.util.Iterator var33 = var25.iterator();
    var20.enqueue((java.lang.Object)var33);
    java.lang.Object var35 = var20.dequeue();
    boolean var36 = var20.isEmpty();
    randoop.RingBuffer var38 = new randoop.RingBuffer(10);
    var38.enqueue((java.lang.Object)'#');
    java.util.Iterator var41 = var38.iterator();
    java.util.Iterator var42 = var38.iterator();
    java.util.Iterator var43 = var38.iterator();
    boolean var44 = var38.isEmpty();
    randoop.RingBuffer var46 = new randoop.RingBuffer(10);
    var46.enqueue((java.lang.Object)'#');
    int var49 = var46.size();
    java.util.Iterator var50 = var46.iterator();
    var38.enqueue((java.lang.Object)var46);
    java.lang.Object var52 = var38.dequeue();
    java.util.Iterator var53 = var38.iterator();
    var20.enqueue((java.lang.Object)var53);
    var1.enqueue((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + '#'+ "'", var52.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test257");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    java.lang.Object var14 = var7.dequeue();
    java.lang.Object var15 = var7.dequeue();
    java.util.Iterator var16 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    int var18 = var7.size();
    boolean var19 = var7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test258");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    java.util.Iterator var17 = var16.iterator();
    java.util.Iterator var18 = var16.iterator();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    boolean var24 = var20.isEmpty();
    int var25 = var20.size();
    int var26 = var20.size();
    randoop.RingBuffer var28 = new randoop.RingBuffer(0);
    int var29 = var28.size();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var20.enqueue((java.lang.Object)var31);
    int var33 = var20.size();
    var16.enqueue((java.lang.Object)var20);
    var9.enqueue((java.lang.Object)var16);
    java.lang.Object var36 = var9.dequeue();
    int var37 = var9.size();
    java.util.Iterator var38 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test259");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    int var11 = var8.size();
    var8.enqueue((java.lang.Object)true);
    java.util.Iterator var14 = var8.iterator();
    java.util.Iterator var15 = var8.iterator();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    boolean var23 = var17.isEmpty();
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    var25.enqueue((java.lang.Object)false);
    java.lang.Object var32 = var25.dequeue();
    java.lang.Object var33 = var25.dequeue();
    java.util.Iterator var34 = var25.iterator();
    var17.enqueue((java.lang.Object)var34);
    java.util.Iterator var36 = var17.iterator();
    var8.enqueue((java.lang.Object)var36);
    randoop.RingBuffer var39 = new randoop.RingBuffer(1);
    var8.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)var8);
    randoop.RingBuffer var43 = new randoop.RingBuffer(4);
    var8.enqueue((java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + '#'+ "'", var32.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + false+ "'", var33.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test260");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    int var13 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test261");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    randoop.RingBuffer var10 = new randoop.RingBuffer(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    java.util.Iterator var15 = var10.iterator();
    boolean var16 = var10.isEmpty();
    java.util.Iterator var17 = var10.iterator();
    java.lang.Object var18 = var10.dequeue();
    boolean var19 = var10.isEmpty();
    int var20 = var10.size();
    var1.enqueue((java.lang.Object)var10);
    int var22 = var10.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + '#'+ "'", var18.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test262");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test263");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var14 = var6.isEmpty();
    boolean var15 = var6.isEmpty();
    java.util.Iterator var16 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test264");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    var1.enqueue((java.lang.Object)true);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test265");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    var1.enqueue((java.lang.Object)100.0d);
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    int var20 = var17.size();
    var17.enqueue((java.lang.Object)true);
    java.util.Iterator var23 = var17.iterator();
    var1.enqueue((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test266");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    var1.enqueue((java.lang.Object)1);
    randoop.RingBuffer var12 = new randoop.RingBuffer(10);
    var12.enqueue((java.lang.Object)'#');
    boolean var15 = var12.isEmpty();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    var12.enqueue((java.lang.Object)var17);
    var1.enqueue((java.lang.Object)var12);
    boolean var26 = var12.isEmpty();
    randoop.RingBuffer var28 = new randoop.RingBuffer(10);
    var28.enqueue((java.lang.Object)'#');
    java.util.Iterator var31 = var28.iterator();
    java.util.Iterator var32 = var28.iterator();
    java.util.Iterator var33 = var28.iterator();
    boolean var34 = var28.isEmpty();
    java.util.Iterator var35 = var28.iterator();
    java.lang.Object var36 = var28.dequeue();
    randoop.RingBuffer var38 = new randoop.RingBuffer(10);
    boolean var39 = var38.isEmpty();
    boolean var40 = var38.isEmpty();
    java.util.Iterator var41 = var38.iterator();
    int var42 = var38.size();
    var38.enqueue((java.lang.Object)(byte)10);
    boolean var45 = var38.isEmpty();
    var28.enqueue((java.lang.Object)var45);
    var12.enqueue((java.lang.Object)var45);
    randoop.RingBuffer var49 = new randoop.RingBuffer(10);
    var49.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var52 = var49.iterator();
    var49.enqueue((java.lang.Object)(byte)1);
    boolean var55 = var49.isEmpty();
    java.util.Iterator var56 = var49.iterator();
    var12.enqueue((java.lang.Object)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test267");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = var1.dequeue();
    java.util.Iterator var7 = var1.iterator();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    boolean var14 = var9.isEmpty();
    java.lang.Object var15 = var9.dequeue();
    java.util.Iterator var16 = var9.iterator();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var18.enqueue((java.lang.Object)false);
    int var25 = var18.size();
    boolean var26 = var18.isEmpty();
    java.lang.Object var27 = var18.dequeue();
    java.lang.Object var28 = var18.dequeue();
    java.util.Iterator var29 = var18.iterator();
    var18.enqueue((java.lang.Object)'4');
    java.util.Iterator var32 = var18.iterator();
    var9.enqueue((java.lang.Object)var18);
    boolean var34 = var9.isEmpty();
    java.lang.Object var35 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    int var37 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + '#'+ "'", var6.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + false+ "'", var28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test268");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    int var14 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var16 = var7.iterator();
    randoop.RingBuffer var18 = new randoop.RingBuffer(1);
    boolean var19 = var18.isEmpty();
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    java.util.Iterator var26 = var21.iterator();
    boolean var27 = var21.isEmpty();
    java.util.Iterator var28 = var21.iterator();
    java.util.Iterator var29 = var21.iterator();
    var18.enqueue((java.lang.Object)var21);
    var7.enqueue((java.lang.Object)var21);
    java.util.Iterator var32 = var21.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test269");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test270");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    randoop.RingBuffer var5 = new randoop.RingBuffer(10);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    boolean var8 = var5.isEmpty();
    int var9 = var5.size();
    boolean var10 = var5.isEmpty();
    int var11 = var5.size();
    var1.enqueue((java.lang.Object)var11);
    java.lang.Object var13 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 0+ "'", var13.equals(0));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test271");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test272");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    boolean var16 = var8.isEmpty();
    java.lang.Object var17 = var8.dequeue();
    java.lang.Object var18 = var8.dequeue();
    java.util.Iterator var19 = var8.iterator();
    var8.enqueue((java.lang.Object)'4');
    java.util.Iterator var22 = var8.iterator();
    java.lang.Object var23 = var8.dequeue();
    boolean var24 = var8.isEmpty();
    var1.enqueue((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '4'+ "'", var23.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test273");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    java.lang.Object var19 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test274");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    int var17 = var1.size();
    int var18 = var1.size();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    var20.enqueue((java.lang.Object)false);
    int var27 = var20.size();
    boolean var28 = var20.isEmpty();
    java.lang.Object var29 = var20.dequeue();
    java.lang.Object var30 = var20.dequeue();
    java.util.Iterator var31 = var20.iterator();
    var20.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var35 = new randoop.RingBuffer(10);
    var35.enqueue((java.lang.Object)'#');
    int var38 = var35.size();
    var35.enqueue((java.lang.Object)true);
    java.util.Iterator var41 = var35.iterator();
    java.util.Iterator var42 = var35.iterator();
    var20.enqueue((java.lang.Object)var42);
    java.lang.Object var44 = var20.dequeue();
    var1.enqueue(var44);
    int var46 = var1.size();
    boolean var47 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + '#'+ "'", var29.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + false+ "'", var30.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + '4'+ "'", var44.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test275");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.lang.Object var7 = var1.dequeue();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    var16.enqueue((java.lang.Object)1.0d);
    boolean var19 = var16.isEmpty();
    int var20 = var16.size();
    boolean var21 = var16.isEmpty();
    var1.enqueue((java.lang.Object)var16);
    java.lang.Object var23 = var1.dequeue();
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    boolean var26 = var25.isEmpty();
    int var27 = var25.size();
    randoop.RingBuffer var29 = new randoop.RingBuffer(1);
    boolean var30 = var29.isEmpty();
    randoop.RingBuffer var32 = new randoop.RingBuffer(10);
    var32.enqueue((java.lang.Object)'#');
    java.util.Iterator var35 = var32.iterator();
    java.util.Iterator var36 = var32.iterator();
    java.util.Iterator var37 = var32.iterator();
    boolean var38 = var32.isEmpty();
    java.util.Iterator var39 = var32.iterator();
    java.util.Iterator var40 = var32.iterator();
    var29.enqueue((java.lang.Object)var32);
    int var42 = var29.size();
    boolean var43 = var29.isEmpty();
    java.lang.Object var44 = var29.dequeue();
    var25.enqueue(var44);
    int var46 = var25.size();
    var1.enqueue((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test276");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(3);
    var1.enqueue((java.lang.Object)var3);
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test277");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test278");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    int var14 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    java.lang.Object var23 = var17.dequeue();
    java.util.Iterator var24 = var17.iterator();
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    java.util.Iterator var29 = var26.iterator();
    boolean var30 = var26.isEmpty();
    var17.enqueue((java.lang.Object)var30);
    var1.enqueue((java.lang.Object)var17);
    boolean var33 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '#'+ "'", var23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test279");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    int var18 = var15.size();
    java.util.Iterator var19 = var15.iterator();
    var7.enqueue((java.lang.Object)var15);
    randoop.RingBuffer var22 = new randoop.RingBuffer(1);
    java.util.Iterator var23 = var22.iterator();
    java.util.Iterator var24 = var22.iterator();
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    java.util.Iterator var29 = var26.iterator();
    boolean var30 = var26.isEmpty();
    int var31 = var26.size();
    int var32 = var26.size();
    randoop.RingBuffer var34 = new randoop.RingBuffer(0);
    int var35 = var34.size();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var26.enqueue((java.lang.Object)var37);
    int var39 = var26.size();
    var22.enqueue((java.lang.Object)var26);
    var15.enqueue((java.lang.Object)var22);
    var1.enqueue((java.lang.Object)var15);
    boolean var43 = var15.isEmpty();
    int var44 = var15.size();
    var15.enqueue((java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test280");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    int var17 = var1.size();
    boolean var18 = var1.isEmpty();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    var20.enqueue((java.lang.Object)false);
    java.lang.Object var27 = var20.dequeue();
    boolean var28 = var20.isEmpty();
    randoop.RingBuffer var30 = new randoop.RingBuffer(10);
    randoop.RingBuffer var32 = new randoop.RingBuffer(10);
    boolean var33 = var32.isEmpty();
    java.util.Iterator var34 = var32.iterator();
    var30.enqueue((java.lang.Object)var34);
    var20.enqueue((java.lang.Object)var30);
    java.util.Iterator var37 = var20.iterator();
    var1.enqueue((java.lang.Object)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test281");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)var9);
    int var13 = var1.size();
    java.util.Iterator var14 = var1.iterator();
    java.util.Iterator var15 = var1.iterator();
    int var16 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 3);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test282");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test283");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    int var17 = var16.size();
    var1.enqueue((java.lang.Object)var17);
    java.lang.Object var19 = var1.dequeue();
    java.lang.Object var20 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + true+ "'", var19.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 0+ "'", var20.equals(0));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test284");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    int var18 = var15.size();
    java.util.Iterator var19 = var15.iterator();
    var7.enqueue((java.lang.Object)var15);
    randoop.RingBuffer var22 = new randoop.RingBuffer(1);
    java.util.Iterator var23 = var22.iterator();
    java.util.Iterator var24 = var22.iterator();
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    java.util.Iterator var29 = var26.iterator();
    boolean var30 = var26.isEmpty();
    int var31 = var26.size();
    int var32 = var26.size();
    randoop.RingBuffer var34 = new randoop.RingBuffer(0);
    int var35 = var34.size();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var26.enqueue((java.lang.Object)var37);
    int var39 = var26.size();
    var22.enqueue((java.lang.Object)var26);
    var15.enqueue((java.lang.Object)var22);
    var1.enqueue((java.lang.Object)var15);
    int var43 = var15.size();
    randoop.RingBuffer var45 = new randoop.RingBuffer(10);
    var45.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var48 = var45.iterator();
    var45.enqueue((java.lang.Object)(byte)1);
    boolean var51 = var45.isEmpty();
    boolean var52 = var45.isEmpty();
    randoop.RingBuffer var54 = new randoop.RingBuffer(0);
    int var55 = var54.size();
    boolean var56 = var54.isEmpty();
    var45.enqueue((java.lang.Object)var54);
    int var58 = var45.size();
    var15.enqueue((java.lang.Object)var58);
    java.lang.Object var60 = var15.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + '#'+ "'", var60.equals('#'));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test285");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test286");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    java.lang.Object var17 = var9.dequeue();
    java.util.Iterator var18 = var9.iterator();
    var1.enqueue((java.lang.Object)var18);
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)1.0d);
    boolean var24 = var21.isEmpty();
    int var25 = var21.size();
    var1.enqueue((java.lang.Object)var21);
    java.lang.Object var27 = var21.dequeue();
    int var28 = var21.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 1.0d+ "'", var27.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test287");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    boolean var12 = var6.isEmpty();
    java.util.Iterator var13 = var6.iterator();
    java.util.Iterator var14 = var6.iterator();
    var1.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var1.dequeue();
    boolean var17 = var1.isEmpty();
    boolean var18 = var1.isEmpty();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    java.util.Iterator var25 = var20.iterator();
    boolean var26 = var20.isEmpty();
    java.util.Iterator var27 = var20.iterator();
    java.util.Iterator var28 = var20.iterator();
    boolean var29 = var20.isEmpty();
    var1.enqueue((java.lang.Object)var20);
    int var31 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test288");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var14 = var1.size();
    boolean var15 = var1.isEmpty();
    boolean var16 = var1.isEmpty();
    java.lang.Object var17 = var1.dequeue();
    randoop.RingBuffer var19 = new randoop.RingBuffer(10);
    var19.enqueue((java.lang.Object)'#');
    boolean var22 = var19.isEmpty();
    boolean var23 = var19.isEmpty();
    java.util.Iterator var24 = var19.iterator();
    java.lang.Object var25 = var19.dequeue();
    boolean var26 = var19.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    boolean var28 = var19.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test289");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    int var5 = var1.size();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    var7.enqueue((java.lang.Object)true);
    java.util.Iterator var13 = var7.iterator();
    java.util.Iterator var14 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    int var16 = var7.size();
    java.util.Iterator var17 = var7.iterator();
    boolean var18 = var7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test290");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    java.util.Iterator var19 = var16.iterator();
    boolean var20 = var16.isEmpty();
    var16.enqueue((java.lang.Object)'#');
    boolean var23 = var16.isEmpty();
    int var24 = var16.size();
    var9.enqueue((java.lang.Object)var24);
    randoop.RingBuffer var27 = new randoop.RingBuffer(10);
    var27.enqueue((java.lang.Object)'#');
    java.util.Iterator var30 = var27.iterator();
    java.util.Iterator var31 = var27.iterator();
    java.util.Iterator var32 = var27.iterator();
    java.lang.Object var33 = var27.dequeue();
    boolean var34 = var27.isEmpty();
    randoop.RingBuffer var36 = new randoop.RingBuffer(10);
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    java.util.Iterator var39 = var36.iterator();
    boolean var40 = var36.isEmpty();
    int var41 = var36.size();
    int var42 = var36.size();
    randoop.RingBuffer var44 = new randoop.RingBuffer(0);
    int var45 = var44.size();
    boolean var46 = var44.isEmpty();
    boolean var47 = var44.isEmpty();
    var36.enqueue((java.lang.Object)var47);
    int var49 = var36.size();
    int var50 = var36.size();
    var27.enqueue((java.lang.Object)var36);
    var9.enqueue((java.lang.Object)var36);
    randoop.RingBuffer var54 = new randoop.RingBuffer(0);
    int var55 = var54.size();
    boolean var56 = var54.isEmpty();
    java.util.Iterator var57 = var54.iterator();
    var9.enqueue((java.lang.Object)var57);
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var60 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + '#'+ "'", var33.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test291");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    int var5 = var1.size();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    var7.enqueue((java.lang.Object)true);
    java.util.Iterator var13 = var7.iterator();
    java.util.Iterator var14 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    var17.enqueue((java.lang.Object)100.0d);
    java.util.Iterator var23 = var17.iterator();
    java.util.Iterator var24 = var17.iterator();
    java.util.Iterator var25 = var17.iterator();
    var7.enqueue((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test292");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test293");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test294");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    java.util.Iterator var17 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test295");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    java.lang.Object var14 = var6.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test296");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    var1.enqueue((java.lang.Object)var6);
    java.util.Iterator var17 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test297");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    java.lang.Object var9 = var1.dequeue();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test298");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    boolean var13 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test299");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    int var17 = var16.size();
    var1.enqueue((java.lang.Object)var17);
    java.util.Iterator var19 = var1.iterator();
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    int var24 = var21.size();
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    var26.enqueue((java.lang.Object)'#');
    java.util.Iterator var29 = var26.iterator();
    java.util.Iterator var30 = var26.iterator();
    java.util.Iterator var31 = var26.iterator();
    boolean var32 = var26.isEmpty();
    java.util.Iterator var33 = var26.iterator();
    java.util.Iterator var34 = var26.iterator();
    var21.enqueue((java.lang.Object)var34);
    java.lang.Object var36 = var21.dequeue();
    boolean var37 = var21.isEmpty();
    boolean var38 = var21.isEmpty();
    randoop.RingBuffer var40 = new randoop.RingBuffer(10);
    var40.enqueue((java.lang.Object)'#');
    java.util.Iterator var43 = var40.iterator();
    java.util.Iterator var44 = var40.iterator();
    java.util.Iterator var45 = var40.iterator();
    boolean var46 = var40.isEmpty();
    java.util.Iterator var47 = var40.iterator();
    java.util.Iterator var48 = var40.iterator();
    boolean var49 = var40.isEmpty();
    var21.enqueue((java.lang.Object)var40);
    var1.enqueue((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test300");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    boolean var15 = var9.isEmpty();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    var17.enqueue((java.lang.Object)false);
    java.lang.Object var24 = var17.dequeue();
    java.lang.Object var25 = var17.dequeue();
    java.util.Iterator var26 = var17.iterator();
    var9.enqueue((java.lang.Object)var26);
    randoop.RingBuffer var29 = new randoop.RingBuffer(10);
    var29.enqueue((java.lang.Object)1.0d);
    boolean var32 = var29.isEmpty();
    int var33 = var29.size();
    var9.enqueue((java.lang.Object)var29);
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var36 = var1.iterator();
    boolean var37 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '#'+ "'", var24.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + false+ "'", var25.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test301");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    randoop.RingBuffer var13 = new randoop.RingBuffer(10);
    boolean var14 = var13.isEmpty();
    java.util.Iterator var15 = var13.iterator();
    var11.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var18 = var1.iterator();
    java.lang.Object var19 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + false+ "'", var19.equals(false));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test302");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + '#'+ "'", var13.equals('#'));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test303");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    int var16 = var1.size();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    int var21 = var18.size();
    randoop.RingBuffer var23 = new randoop.RingBuffer(1);
    int var24 = var23.size();
    boolean var25 = var23.isEmpty();
    var18.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var18);
    java.lang.Object var28 = var18.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test304");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();
    randoop.RingBuffer var13 = new randoop.RingBuffer(10);
    var13.enqueue((java.lang.Object)'#');
    java.util.Iterator var16 = var13.iterator();
    java.util.Iterator var17 = var13.iterator();
    var13.enqueue((java.lang.Object)false);
    java.lang.Object var20 = var13.dequeue();
    java.lang.Object var21 = var13.dequeue();
    int var22 = var13.size();
    var13.enqueue((java.lang.Object)100L);
    var1.enqueue((java.lang.Object)var13);
    java.lang.Object var26 = var13.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + '#'+ "'", var20.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + false+ "'", var21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 100L+ "'", var26.equals(100L));

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test305");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    boolean var18 = var14.isEmpty();
    int var19 = var14.size();
    int var20 = var14.size();
    randoop.RingBuffer var22 = new randoop.RingBuffer(0);
    int var23 = var22.size();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    var14.enqueue((java.lang.Object)var25);
    int var27 = var14.size();
    var1.enqueue((java.lang.Object)var27);
    boolean var29 = var1.isEmpty();
    int var30 = var1.size();
    java.util.Iterator var31 = var1.iterator();
    boolean var32 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test306");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)1.0f);
    java.lang.Object var12 = var1.dequeue();
    java.util.Iterator var13 = var1.iterator();
    int var14 = var1.size();
    java.util.Iterator var15 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '#'+ "'", var12.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test307");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    int var2 = var1.size();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    java.lang.Object var11 = var4.dequeue();
    java.lang.Object var12 = var4.dequeue();
    java.util.Iterator var13 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var15 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + '#'+ "'", var11.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test308");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    boolean var12 = var11.isEmpty();
    int var13 = var11.size();
    randoop.RingBuffer var15 = new randoop.RingBuffer(1);
    boolean var16 = var15.isEmpty();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    java.util.Iterator var23 = var18.iterator();
    boolean var24 = var18.isEmpty();
    java.util.Iterator var25 = var18.iterator();
    java.util.Iterator var26 = var18.iterator();
    var15.enqueue((java.lang.Object)var18);
    int var28 = var15.size();
    boolean var29 = var15.isEmpty();
    java.lang.Object var30 = var15.dequeue();
    var11.enqueue(var30);
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var33 = var1.iterator();
    java.util.Iterator var34 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test309");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    var1.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    boolean var17 = var16.isEmpty();
    randoop.RingBuffer var19 = new randoop.RingBuffer(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    var19.enqueue((java.lang.Object)false);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    java.lang.Object var28 = var19.dequeue();
    java.lang.Object var29 = var19.dequeue();
    java.util.Iterator var30 = var19.iterator();
    var19.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var34 = new randoop.RingBuffer(10);
    var34.enqueue((java.lang.Object)'#');
    int var37 = var34.size();
    var34.enqueue((java.lang.Object)true);
    java.util.Iterator var40 = var34.iterator();
    java.util.Iterator var41 = var34.iterator();
    var19.enqueue((java.lang.Object)var41);
    var16.enqueue((java.lang.Object)var19);
    java.util.Iterator var44 = var19.iterator();
    java.lang.Object var45 = var19.dequeue();
    java.util.Iterator var46 = var19.iterator();
    var1.enqueue((java.lang.Object)var19);
    boolean var48 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + '#'+ "'", var28.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + false+ "'", var29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '4'+ "'", var45.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test310");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    randoop.RingBuffer var5 = new randoop.RingBuffer(10);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    int var10 = var5.size();
    int var11 = var5.size();
    randoop.RingBuffer var13 = new randoop.RingBuffer(0);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var5.enqueue((java.lang.Object)var16);
    int var18 = var5.size();
    var1.enqueue((java.lang.Object)var5);
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    var21.enqueue((java.lang.Object)100.0d);
    java.util.Iterator var27 = var21.iterator();
    java.util.Iterator var28 = var21.iterator();
    java.util.Iterator var29 = var21.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var21);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test311");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)var14);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    java.util.Iterator var25 = var22.iterator();
    int var26 = var22.size();
    var22.enqueue((java.lang.Object)(byte)10);
    int var29 = var22.size();
    var14.enqueue((java.lang.Object)var22);
    java.lang.Object var31 = var22.dequeue();
    int var32 = var22.size();
    boolean var33 = var22.isEmpty();
    randoop.RingBuffer var35 = new randoop.RingBuffer(10);
    var35.enqueue((java.lang.Object)'#');
    java.util.Iterator var38 = var35.iterator();
    java.util.Iterator var39 = var35.iterator();
    var35.enqueue((java.lang.Object)false);
    java.lang.Object var42 = var35.dequeue();
    java.lang.Object var43 = var35.dequeue();
    randoop.RingBuffer var45 = new randoop.RingBuffer(10);
    var45.enqueue((java.lang.Object)'#');
    java.util.Iterator var48 = var45.iterator();
    java.util.Iterator var49 = var45.iterator();
    var45.enqueue((java.lang.Object)false);
    int var52 = var45.size();
    boolean var53 = var45.isEmpty();
    java.lang.Object var54 = var45.dequeue();
    java.lang.Object var55 = var45.dequeue();
    boolean var56 = var45.isEmpty();
    var35.enqueue((java.lang.Object)var56);
    java.util.Iterator var58 = var35.iterator();
    var22.enqueue((java.lang.Object)var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + (byte)10+ "'", var31.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + '#'+ "'", var42.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + false+ "'", var43.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + '#'+ "'", var54.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + false+ "'", var55.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test312");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    boolean var23 = var22.isEmpty();
    java.util.Iterator var24 = var22.iterator();
    var20.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var20.iterator();
    java.util.Iterator var27 = var20.iterator();
    var1.enqueue((java.lang.Object)var27);
    int var29 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 4);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test313");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    java.lang.Object var17 = var9.dequeue();
    java.util.Iterator var18 = var9.iterator();
    var1.enqueue((java.lang.Object)var18);
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '#'+ "'", var21.equals('#'));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test314");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    java.lang.Object var14 = var4.dequeue();
    java.util.Iterator var15 = var4.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test315");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test316");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    randoop.RingBuffer var5 = new randoop.RingBuffer(10);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    int var10 = var5.size();
    int var11 = var5.size();
    randoop.RingBuffer var13 = new randoop.RingBuffer(0);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var5.enqueue((java.lang.Object)var16);
    int var18 = var5.size();
    var1.enqueue((java.lang.Object)var5);
    randoop.RingBuffer var21 = new randoop.RingBuffer(100);
    var5.enqueue((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test317");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    randoop.RingBuffer var5 = new randoop.RingBuffer(10);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    int var10 = var5.size();
    int var11 = var5.size();
    randoop.RingBuffer var13 = new randoop.RingBuffer(0);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var5.enqueue((java.lang.Object)var16);
    int var18 = var5.size();
    var1.enqueue((java.lang.Object)var5);
    int var20 = var5.size();
    boolean var21 = var5.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test318");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    int var5 = var1.size();
    int var6 = var1.size();
    randoop.RingBuffer var8 = new randoop.RingBuffer(1);
    boolean var9 = var8.isEmpty();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    var11.enqueue((java.lang.Object)'#');
    java.util.Iterator var14 = var11.iterator();
    java.util.Iterator var15 = var11.iterator();
    java.util.Iterator var16 = var11.iterator();
    boolean var17 = var11.isEmpty();
    java.util.Iterator var18 = var11.iterator();
    java.util.Iterator var19 = var11.iterator();
    var8.enqueue((java.lang.Object)var11);
    int var21 = var8.size();
    boolean var22 = var8.isEmpty();
    java.util.Iterator var23 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var25 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test319");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)1.0f);
    java.lang.Object var12 = var1.dequeue();
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    randoop.RingBuffer var16 = new randoop.RingBuffer(0);
    int var17 = var16.size();
    int var18 = var16.size();
    java.util.Iterator var19 = var16.iterator();
    boolean var20 = var16.isEmpty();
    java.util.Iterator var21 = var16.iterator();
    var1.enqueue((java.lang.Object)var16);
    java.util.Iterator var23 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '#'+ "'", var12.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test320");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    int var12 = var7.size();
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    var14.enqueue((java.lang.Object)'#');
    java.util.Iterator var17 = var14.iterator();
    java.util.Iterator var18 = var14.iterator();
    var14.enqueue((java.lang.Object)false);
    int var21 = var14.size();
    boolean var22 = var14.isEmpty();
    java.lang.Object var23 = var14.dequeue();
    java.lang.Object var24 = var14.dequeue();
    boolean var25 = var14.isEmpty();
    randoop.RingBuffer var27 = new randoop.RingBuffer(10);
    var27.enqueue((java.lang.Object)'#');
    int var30 = var27.size();
    var27.enqueue((java.lang.Object)true);
    var14.enqueue((java.lang.Object)var27);
    randoop.RingBuffer var35 = new randoop.RingBuffer(10);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    java.util.Iterator var38 = var35.iterator();
    int var39 = var35.size();
    var35.enqueue((java.lang.Object)(byte)10);
    int var42 = var35.size();
    var27.enqueue((java.lang.Object)var35);
    java.util.Iterator var44 = var35.iterator();
    var7.enqueue((java.lang.Object)var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '#'+ "'", var23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test321");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    randoop.RingBuffer var5 = new randoop.RingBuffer(1);
    boolean var6 = var5.isEmpty();
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    java.util.Iterator var13 = var8.iterator();
    boolean var14 = var8.isEmpty();
    java.util.Iterator var15 = var8.iterator();
    java.util.Iterator var16 = var8.iterator();
    var5.enqueue((java.lang.Object)var8);
    java.lang.Object var18 = var8.dequeue();
    boolean var19 = var8.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + '#'+ "'", var18.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test322");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    java.lang.Object var17 = var9.dequeue();
    java.util.Iterator var18 = var9.iterator();
    var1.enqueue((java.lang.Object)var18);
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)1.0d);
    boolean var24 = var21.isEmpty();
    int var25 = var21.size();
    var1.enqueue((java.lang.Object)var21);
    int var27 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 3);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test323");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test324");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    var1.enqueue((java.lang.Object)var11);
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    int var18 = var14.size();
    boolean var19 = var14.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    var22.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var25 = var22.iterator();
    var22.enqueue((java.lang.Object)(byte)1);
    boolean var28 = var22.isEmpty();
    java.util.Iterator var29 = var22.iterator();
    var1.enqueue((java.lang.Object)var22);
    boolean var31 = var22.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test325");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    var1.enqueue((java.lang.Object)var15);
    randoop.RingBuffer var18 = new randoop.RingBuffer(0);
    int var19 = var18.size();
    boolean var20 = var18.isEmpty();
    boolean var21 = var18.isEmpty();
    boolean var22 = var18.isEmpty();
    java.util.Iterator var23 = var18.iterator();
    int var24 = var18.size();
    java.util.Iterator var25 = var18.iterator();
    var1.enqueue((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test326");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    int var22 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    java.util.Iterator var24 = var15.iterator();
    java.lang.Object var25 = var15.dequeue();
    java.util.Iterator var26 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var28 = var1.iterator();
    boolean var29 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test327");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var10 = var7.iterator();
    int var11 = var7.size();
    int var12 = var7.size();
    java.util.Iterator var13 = var7.iterator();
    var1.enqueue((java.lang.Object)var13);
    int var15 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test328");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var10 = var7.iterator();
    var7.enqueue((java.lang.Object)(byte)1);
    boolean var13 = var7.isEmpty();
    java.util.Iterator var14 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    java.lang.Object var16 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test329");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.lang.Object var5 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + '#'+ "'", var5.equals('#'));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test330");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var15 = var9.iterator();
    java.lang.Object var16 = var9.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test331");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    java.util.Iterator var17 = var16.iterator();
    java.util.Iterator var18 = var16.iterator();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    boolean var24 = var20.isEmpty();
    int var25 = var20.size();
    int var26 = var20.size();
    randoop.RingBuffer var28 = new randoop.RingBuffer(0);
    int var29 = var28.size();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var20.enqueue((java.lang.Object)var31);
    int var33 = var20.size();
    var16.enqueue((java.lang.Object)var20);
    var9.enqueue((java.lang.Object)var16);
    boolean var36 = var16.isEmpty();
    java.lang.Object var37 = var16.dequeue();
    boolean var38 = var16.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test332");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test333");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)1.0f);
    java.lang.Object var12 = var1.dequeue();
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    var14.enqueue((java.lang.Object)'#');
    java.util.Iterator var17 = var14.iterator();
    java.util.Iterator var18 = var14.iterator();
    var14.enqueue((java.lang.Object)false);
    java.lang.Object var21 = var14.dequeue();
    java.lang.Object var22 = var14.dequeue();
    int var23 = var14.size();
    var1.enqueue((java.lang.Object)var23);
    java.lang.Object var25 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '#'+ "'", var12.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '#'+ "'", var21.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + false+ "'", var22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + 1.0f+ "'", var25.equals(1.0f));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test334");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var10 = var7.iterator();
    var7.enqueue((java.lang.Object)(byte)1);
    boolean var13 = var7.isEmpty();
    java.util.Iterator var14 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    boolean var16 = var7.isEmpty();
    java.lang.Object var17 = var7.dequeue();
    java.lang.Object var18 = var7.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 1.0d+ "'", var17.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (byte)1+ "'", var18.equals((byte)1));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test335");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    randoop.RingBuffer var10 = new randoop.RingBuffer(0);
    int var11 = var10.size();
    boolean var12 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var10);
    int var14 = var1.size();
    var1.enqueue((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test336");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    var1.enqueue((java.lang.Object)100.0d);
    int var16 = var1.size();
    int var17 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test337");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    randoop.RingBuffer var6 = new randoop.RingBuffer(1);
    int var7 = var6.size();
    boolean var8 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();
    int var12 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test338");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)var14);
    java.lang.Object var21 = var14.dequeue();
    java.lang.Object var22 = var14.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '#'+ "'", var21.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + true+ "'", var22.equals(true));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test339");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    randoop.RingBuffer var10 = new randoop.RingBuffer(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    var10.enqueue((java.lang.Object)false);
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var18.enqueue((java.lang.Object)false);
    java.lang.Object var25 = var18.dequeue();
    int var26 = var18.size();
    var10.enqueue((java.lang.Object)var18);
    java.util.Iterator var28 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test340");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    var1.enqueue((java.lang.Object)'4');
    boolean var15 = var1.isEmpty();
    java.util.Iterator var16 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test341");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    boolean var12 = var6.isEmpty();
    java.util.Iterator var13 = var6.iterator();
    java.util.Iterator var14 = var6.iterator();
    var1.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var1.dequeue();
    int var17 = var1.size();
    int var18 = var1.size();
    randoop.RingBuffer var20 = new randoop.RingBuffer(1);
    boolean var21 = var20.isEmpty();
    randoop.RingBuffer var23 = new randoop.RingBuffer(10);
    var23.enqueue((java.lang.Object)'#');
    java.util.Iterator var26 = var23.iterator();
    java.util.Iterator var27 = var23.iterator();
    java.util.Iterator var28 = var23.iterator();
    boolean var29 = var23.isEmpty();
    java.util.Iterator var30 = var23.iterator();
    java.util.Iterator var31 = var23.iterator();
    var20.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var23);
    randoop.RingBuffer var35 = new randoop.RingBuffer(10);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    int var38 = var35.size();
    int var39 = var35.size();
    boolean var40 = var35.isEmpty();
    var23.enqueue((java.lang.Object)var35);
    randoop.RingBuffer var43 = new randoop.RingBuffer(10);
    var43.enqueue((java.lang.Object)'#');
    java.util.Iterator var46 = var43.iterator();
    java.util.Iterator var47 = var43.iterator();
    java.util.Iterator var48 = var43.iterator();
    java.lang.Object var49 = var43.dequeue();
    java.util.Iterator var50 = var43.iterator();
    int var51 = var43.size();
    randoop.RingBuffer var53 = new randoop.RingBuffer(10);
    var53.enqueue((java.lang.Object)'#');
    java.util.Iterator var56 = var53.iterator();
    java.util.Iterator var57 = var53.iterator();
    var53.enqueue((java.lang.Object)false);
    int var60 = var53.size();
    boolean var61 = var53.isEmpty();
    java.lang.Object var62 = var53.dequeue();
    java.lang.Object var63 = var53.dequeue();
    java.util.Iterator var64 = var53.iterator();
    var53.enqueue((java.lang.Object)'4');
    java.util.Iterator var67 = var53.iterator();
    boolean var68 = var53.isEmpty();
    java.util.Iterator var69 = var53.iterator();
    var43.enqueue((java.lang.Object)var53);
    var35.enqueue((java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + '#'+ "'", var49.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + '#'+ "'", var62.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + false+ "'", var63.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test342");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    var1.enqueue((java.lang.Object)'4');
    java.util.Iterator var15 = var1.iterator();
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    boolean var18 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test343");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    var1.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    var16.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var19 = var16.iterator();
    var16.enqueue((java.lang.Object)(byte)1);
    randoop.RingBuffer var23 = new randoop.RingBuffer(10);
    var23.enqueue((java.lang.Object)'#');
    java.util.Iterator var26 = var23.iterator();
    var16.enqueue((java.lang.Object)var26);
    int var28 = var16.size();
    randoop.RingBuffer var30 = new randoop.RingBuffer(10);
    var30.enqueue((java.lang.Object)'#');
    java.util.Iterator var33 = var30.iterator();
    java.util.Iterator var34 = var30.iterator();
    java.util.Iterator var35 = var30.iterator();
    boolean var36 = var30.isEmpty();
    java.util.Iterator var37 = var30.iterator();
    boolean var38 = var30.isEmpty();
    var16.enqueue((java.lang.Object)var30);
    java.util.Iterator var40 = var16.iterator();
    var1.enqueue((java.lang.Object)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test344");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var15 = var9.iterator();
    java.util.Iterator var16 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test345");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    var11.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var14 = var11.iterator();
    var11.enqueue((java.lang.Object)(byte)1);
    boolean var17 = var11.isEmpty();
    boolean var18 = var11.isEmpty();
    int var19 = var11.size();
    java.lang.Object var20 = var11.dequeue();
    var1.enqueue((java.lang.Object)var11);
    java.lang.Object var22 = var1.dequeue();
    boolean var23 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 1.0d+ "'", var20.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test346");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    var1.enqueue((java.lang.Object)var11);
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    int var18 = var14.size();
    boolean var19 = var14.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    var22.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var25 = var22.iterator();
    var22.enqueue((java.lang.Object)(byte)1);
    boolean var28 = var22.isEmpty();
    java.util.Iterator var29 = var22.iterator();
    var1.enqueue((java.lang.Object)var22);
    java.util.Iterator var31 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test347");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test348");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    int var18 = var15.size();
    java.util.Iterator var19 = var15.iterator();
    var7.enqueue((java.lang.Object)var15);
    randoop.RingBuffer var22 = new randoop.RingBuffer(1);
    java.util.Iterator var23 = var22.iterator();
    java.util.Iterator var24 = var22.iterator();
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    java.util.Iterator var29 = var26.iterator();
    boolean var30 = var26.isEmpty();
    int var31 = var26.size();
    int var32 = var26.size();
    randoop.RingBuffer var34 = new randoop.RingBuffer(0);
    int var35 = var34.size();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var26.enqueue((java.lang.Object)var37);
    int var39 = var26.size();
    var22.enqueue((java.lang.Object)var26);
    var15.enqueue((java.lang.Object)var22);
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var43 = var15.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test349");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    var1.enqueue((java.lang.Object)(short)0);
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.0d+ "'", var7.equals(1.0d));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test350");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    int var8 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test351");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    int var2 = var1.size();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    java.lang.Object var11 = var4.dequeue();
    java.lang.Object var12 = var4.dequeue();
    java.util.Iterator var13 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    boolean var19 = var18.isEmpty();
    java.util.Iterator var20 = var18.iterator();
    var16.enqueue((java.lang.Object)var20);
    java.util.Iterator var22 = var16.iterator();
    randoop.RingBuffer var24 = new randoop.RingBuffer(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    boolean var28 = var24.isEmpty();
    randoop.RingBuffer var30 = new randoop.RingBuffer(10);
    var30.enqueue((java.lang.Object)'#');
    java.util.Iterator var33 = var30.iterator();
    java.util.Iterator var34 = var30.iterator();
    var30.enqueue((java.lang.Object)false);
    int var37 = var30.size();
    var24.enqueue((java.lang.Object)var30);
    java.util.Iterator var39 = var30.iterator();
    java.lang.Object var40 = var30.dequeue();
    java.util.Iterator var41 = var30.iterator();
    var16.enqueue((java.lang.Object)var30);
    randoop.RingBuffer var44 = new randoop.RingBuffer(10);
    boolean var45 = var44.isEmpty();
    boolean var46 = var44.isEmpty();
    java.util.Iterator var47 = var44.iterator();
    boolean var48 = var44.isEmpty();
    var44.enqueue((java.lang.Object)'#');
    boolean var51 = var44.isEmpty();
    var30.enqueue((java.lang.Object)var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var30);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + '#'+ "'", var11.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + '#'+ "'", var40.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test352");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    randoop.RingBuffer var10 = new randoop.RingBuffer(0);
    int var11 = var10.size();
    boolean var12 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var10);
    java.util.Iterator var14 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test353");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();
    java.lang.Object var12 = var1.dequeue();
    java.util.Iterator var13 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test354");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test355");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    java.lang.Object var15 = var9.dequeue();
    int var16 = var9.size();
    boolean var17 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var9);
    boolean var19 = var9.isEmpty();
    int var20 = var9.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var21 = var9.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test356");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var14 = var6.isEmpty();
    java.util.Iterator var15 = var6.iterator();
    int var16 = var6.size();
    int var17 = var6.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test357");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    java.util.Iterator var17 = var16.iterator();
    java.util.Iterator var18 = var16.iterator();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    boolean var24 = var20.isEmpty();
    int var25 = var20.size();
    int var26 = var20.size();
    randoop.RingBuffer var28 = new randoop.RingBuffer(0);
    int var29 = var28.size();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var20.enqueue((java.lang.Object)var31);
    int var33 = var20.size();
    var16.enqueue((java.lang.Object)var20);
    var9.enqueue((java.lang.Object)var16);
    java.lang.Object var36 = var9.dequeue();
    randoop.RingBuffer var38 = new randoop.RingBuffer(10);
    boolean var39 = var38.isEmpty();
    boolean var40 = var38.isEmpty();
    java.util.Iterator var41 = var38.iterator();
    boolean var42 = var38.isEmpty();
    randoop.RingBuffer var44 = new randoop.RingBuffer(10);
    var44.enqueue((java.lang.Object)'#');
    java.util.Iterator var47 = var44.iterator();
    java.util.Iterator var48 = var44.iterator();
    var44.enqueue((java.lang.Object)false);
    int var51 = var44.size();
    var38.enqueue((java.lang.Object)var44);
    java.util.Iterator var53 = var44.iterator();
    randoop.RingBuffer var55 = new randoop.RingBuffer(1);
    boolean var56 = var55.isEmpty();
    randoop.RingBuffer var58 = new randoop.RingBuffer(10);
    var58.enqueue((java.lang.Object)'#');
    java.util.Iterator var61 = var58.iterator();
    java.util.Iterator var62 = var58.iterator();
    java.util.Iterator var63 = var58.iterator();
    boolean var64 = var58.isEmpty();
    java.util.Iterator var65 = var58.iterator();
    java.util.Iterator var66 = var58.iterator();
    var55.enqueue((java.lang.Object)var58);
    var44.enqueue((java.lang.Object)var58);
    var9.enqueue((java.lang.Object)var58);
    int var70 = var58.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test358");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    int var15 = var1.size();
    randoop.RingBuffer var17 = new randoop.RingBuffer(1);
    boolean var18 = var17.isEmpty();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    java.util.Iterator var25 = var20.iterator();
    boolean var26 = var20.isEmpty();
    java.util.Iterator var27 = var20.iterator();
    java.util.Iterator var28 = var20.iterator();
    var17.enqueue((java.lang.Object)var20);
    var1.enqueue((java.lang.Object)var20);
    java.lang.Object var31 = var20.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + '#'+ "'", var31.equals('#'));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test359");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test360");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    var1.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    var16.enqueue((java.lang.Object)'#');
    int var19 = var16.size();
    var16.enqueue((java.lang.Object)true);
    java.util.Iterator var22 = var16.iterator();
    java.util.Iterator var23 = var16.iterator();
    var1.enqueue((java.lang.Object)var23);
    java.util.Iterator var25 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test361");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    int var2 = var1.size();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    boolean var7 = var4.isEmpty();
    int var8 = var4.size();
    var1.enqueue((java.lang.Object)var8);
    int var10 = var1.size();
    java.lang.Object var11 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 1+ "'", var11.equals(1));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test362");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    int var17 = var1.size();
    int var18 = var1.size();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    var20.enqueue((java.lang.Object)false);
    int var27 = var20.size();
    boolean var28 = var20.isEmpty();
    java.lang.Object var29 = var20.dequeue();
    java.lang.Object var30 = var20.dequeue();
    java.util.Iterator var31 = var20.iterator();
    var20.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var35 = new randoop.RingBuffer(10);
    var35.enqueue((java.lang.Object)'#');
    int var38 = var35.size();
    var35.enqueue((java.lang.Object)true);
    java.util.Iterator var41 = var35.iterator();
    java.util.Iterator var42 = var35.iterator();
    var20.enqueue((java.lang.Object)var42);
    java.lang.Object var44 = var20.dequeue();
    var1.enqueue(var44);
    int var46 = var1.size();
    java.lang.Object var47 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + '#'+ "'", var29.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + false+ "'", var30.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + '4'+ "'", var44.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + '#'+ "'", var47.equals('#'));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test363");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    var14.enqueue((java.lang.Object)'#');
    java.util.Iterator var17 = var14.iterator();
    java.util.Iterator var18 = var14.iterator();
    var14.enqueue((java.lang.Object)false);
    java.lang.Object var21 = var14.dequeue();
    int var22 = var14.size();
    var6.enqueue((java.lang.Object)var14);
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    randoop.RingBuffer var27 = new randoop.RingBuffer(10);
    boolean var28 = var27.isEmpty();
    java.util.Iterator var29 = var27.iterator();
    var25.enqueue((java.lang.Object)var29);
    java.util.Iterator var31 = var25.iterator();
    java.util.Iterator var32 = var25.iterator();
    var6.enqueue((java.lang.Object)var32);
    boolean var34 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var34);
    randoop.RingBuffer var37 = new randoop.RingBuffer(10);
    var37.enqueue((java.lang.Object)'#');
    boolean var40 = var37.isEmpty();
    boolean var41 = var37.isEmpty();
    randoop.RingBuffer var43 = new randoop.RingBuffer(10);
    var43.enqueue((java.lang.Object)'#');
    int var46 = var43.size();
    var37.enqueue((java.lang.Object)var43);
    int var48 = var43.size();
    var1.enqueue((java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '#'+ "'", var21.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test364");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    var17.enqueue((java.lang.Object)false);
    int var24 = var17.size();
    boolean var25 = var17.isEmpty();
    int var26 = var17.size();
    java.util.Iterator var27 = var17.iterator();
    var6.enqueue((java.lang.Object)var27);
    int var29 = var6.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test365");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    boolean var12 = var8.isEmpty();
    var8.enqueue((java.lang.Object)'#');
    boolean var15 = var8.isEmpty();
    int var16 = var8.size();
    var1.enqueue((java.lang.Object)var16);
    randoop.RingBuffer var19 = new randoop.RingBuffer(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    java.util.Iterator var24 = var19.iterator();
    java.lang.Object var25 = var19.dequeue();
    boolean var26 = var19.isEmpty();
    randoop.RingBuffer var28 = new randoop.RingBuffer(10);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    java.util.Iterator var31 = var28.iterator();
    boolean var32 = var28.isEmpty();
    int var33 = var28.size();
    int var34 = var28.size();
    randoop.RingBuffer var36 = new randoop.RingBuffer(0);
    int var37 = var36.size();
    boolean var38 = var36.isEmpty();
    boolean var39 = var36.isEmpty();
    var28.enqueue((java.lang.Object)var39);
    int var41 = var28.size();
    int var42 = var28.size();
    var19.enqueue((java.lang.Object)var28);
    var1.enqueue((java.lang.Object)var28);
    java.lang.Object var45 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '#'+ "'", var45.equals('#'));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test366");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    java.lang.Object var14 = var1.dequeue();
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    java.util.Iterator var17 = var16.iterator();
    randoop.RingBuffer var19 = new randoop.RingBuffer(1);
    boolean var20 = var19.isEmpty();
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    var22.enqueue((java.lang.Object)'#');
    java.util.Iterator var25 = var22.iterator();
    java.util.Iterator var26 = var22.iterator();
    java.util.Iterator var27 = var22.iterator();
    boolean var28 = var22.isEmpty();
    java.util.Iterator var29 = var22.iterator();
    java.util.Iterator var30 = var22.iterator();
    var19.enqueue((java.lang.Object)var22);
    java.lang.Object var32 = var22.dequeue();
    int var33 = var22.size();
    var16.enqueue((java.lang.Object)var22);
    var1.enqueue((java.lang.Object)var22);
    java.lang.Object var36 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + '#'+ "'", var32.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test367");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test368");


    randoop.RingBuffer var1 = new randoop.RingBuffer(100);
    randoop.RingBuffer var3 = new randoop.RingBuffer(0);
    int var4 = var3.size();
    int var5 = var3.size();
    java.util.Iterator var6 = var3.iterator();
    boolean var7 = var3.isEmpty();
    var1.enqueue((java.lang.Object)var3);
    randoop.RingBuffer var10 = new randoop.RingBuffer(10);
    var10.enqueue((java.lang.Object)'#');
    int var13 = var10.size();
    java.util.Iterator var14 = var10.iterator();
    java.lang.Object var15 = var10.dequeue();
    java.util.Iterator var16 = var10.iterator();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    boolean var23 = var18.isEmpty();
    java.lang.Object var24 = var18.dequeue();
    java.util.Iterator var25 = var18.iterator();
    randoop.RingBuffer var27 = new randoop.RingBuffer(10);
    var27.enqueue((java.lang.Object)'#');
    java.util.Iterator var30 = var27.iterator();
    java.util.Iterator var31 = var27.iterator();
    var27.enqueue((java.lang.Object)false);
    int var34 = var27.size();
    boolean var35 = var27.isEmpty();
    java.lang.Object var36 = var27.dequeue();
    java.lang.Object var37 = var27.dequeue();
    java.util.Iterator var38 = var27.iterator();
    var27.enqueue((java.lang.Object)'4');
    java.util.Iterator var41 = var27.iterator();
    var18.enqueue((java.lang.Object)var27);
    boolean var43 = var18.isEmpty();
    java.lang.Object var44 = var18.dequeue();
    var10.enqueue((java.lang.Object)var18);
    var1.enqueue((java.lang.Object)var18);
    randoop.RingBuffer var48 = new randoop.RingBuffer(10);
    var48.enqueue((java.lang.Object)'#');
    java.util.Iterator var51 = var48.iterator();
    java.util.Iterator var52 = var48.iterator();
    java.util.Iterator var53 = var48.iterator();
    boolean var54 = var48.isEmpty();
    randoop.RingBuffer var56 = new randoop.RingBuffer(10);
    var56.enqueue((java.lang.Object)'#');
    java.util.Iterator var59 = var56.iterator();
    java.util.Iterator var60 = var56.iterator();
    var56.enqueue((java.lang.Object)false);
    java.lang.Object var63 = var56.dequeue();
    java.lang.Object var64 = var56.dequeue();
    java.util.Iterator var65 = var56.iterator();
    var48.enqueue((java.lang.Object)var65);
    randoop.RingBuffer var68 = new randoop.RingBuffer(10);
    var68.enqueue((java.lang.Object)1.0d);
    boolean var71 = var68.isEmpty();
    int var72 = var68.size();
    var48.enqueue((java.lang.Object)var68);
    var18.enqueue((java.lang.Object)var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '#'+ "'", var24.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + false+ "'", var37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + '#'+ "'", var63.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + false+ "'", var64.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 1);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test369");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    var1.enqueue((java.lang.Object)var6);
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var6.enqueue((java.lang.Object)var22);
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    var25.enqueue((java.lang.Object)1.0d);
    boolean var28 = var25.isEmpty();
    int var29 = var25.size();
    randoop.RingBuffer var31 = new randoop.RingBuffer(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    java.util.Iterator var36 = var31.iterator();
    boolean var37 = var31.isEmpty();
    randoop.RingBuffer var39 = new randoop.RingBuffer(10);
    var39.enqueue((java.lang.Object)'#');
    int var42 = var39.size();
    java.util.Iterator var43 = var39.iterator();
    var31.enqueue((java.lang.Object)var39);
    randoop.RingBuffer var46 = new randoop.RingBuffer(1);
    java.util.Iterator var47 = var46.iterator();
    java.util.Iterator var48 = var46.iterator();
    randoop.RingBuffer var50 = new randoop.RingBuffer(10);
    boolean var51 = var50.isEmpty();
    boolean var52 = var50.isEmpty();
    java.util.Iterator var53 = var50.iterator();
    boolean var54 = var50.isEmpty();
    int var55 = var50.size();
    int var56 = var50.size();
    randoop.RingBuffer var58 = new randoop.RingBuffer(0);
    int var59 = var58.size();
    boolean var60 = var58.isEmpty();
    boolean var61 = var58.isEmpty();
    var50.enqueue((java.lang.Object)var61);
    int var63 = var50.size();
    var46.enqueue((java.lang.Object)var50);
    var39.enqueue((java.lang.Object)var46);
    var25.enqueue((java.lang.Object)var39);
    boolean var67 = var39.isEmpty();
    int var68 = var39.size();
    var6.enqueue((java.lang.Object)var39);
    java.lang.Object var70 = var6.dequeue();
    boolean var71 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + '#'+ "'", var70.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test370");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    java.util.Iterator var11 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test371");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    var1.enqueue((java.lang.Object)var6);
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var6.enqueue((java.lang.Object)var22);
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    var25.enqueue((java.lang.Object)1.0d);
    boolean var28 = var25.isEmpty();
    int var29 = var25.size();
    randoop.RingBuffer var31 = new randoop.RingBuffer(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    java.util.Iterator var36 = var31.iterator();
    boolean var37 = var31.isEmpty();
    randoop.RingBuffer var39 = new randoop.RingBuffer(10);
    var39.enqueue((java.lang.Object)'#');
    int var42 = var39.size();
    java.util.Iterator var43 = var39.iterator();
    var31.enqueue((java.lang.Object)var39);
    randoop.RingBuffer var46 = new randoop.RingBuffer(1);
    java.util.Iterator var47 = var46.iterator();
    java.util.Iterator var48 = var46.iterator();
    randoop.RingBuffer var50 = new randoop.RingBuffer(10);
    boolean var51 = var50.isEmpty();
    boolean var52 = var50.isEmpty();
    java.util.Iterator var53 = var50.iterator();
    boolean var54 = var50.isEmpty();
    int var55 = var50.size();
    int var56 = var50.size();
    randoop.RingBuffer var58 = new randoop.RingBuffer(0);
    int var59 = var58.size();
    boolean var60 = var58.isEmpty();
    boolean var61 = var58.isEmpty();
    var50.enqueue((java.lang.Object)var61);
    int var63 = var50.size();
    var46.enqueue((java.lang.Object)var50);
    var39.enqueue((java.lang.Object)var46);
    var25.enqueue((java.lang.Object)var39);
    boolean var67 = var39.isEmpty();
    int var68 = var39.size();
    var6.enqueue((java.lang.Object)var39);
    java.lang.Object var70 = var39.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + '#'+ "'", var70.equals('#'));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test372");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    java.lang.Object var17 = var9.dequeue();
    java.util.Iterator var18 = var9.iterator();
    var1.enqueue((java.lang.Object)var18);
    int var20 = var1.size();
    java.util.Iterator var21 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test373");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    var17.enqueue((java.lang.Object)false);
    int var24 = var17.size();
    boolean var25 = var17.isEmpty();
    int var26 = var17.size();
    java.util.Iterator var27 = var17.iterator();
    var6.enqueue((java.lang.Object)var27);
    java.lang.Object var29 = var6.dequeue();
    java.lang.Object var30 = var6.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + '#'+ "'", var29.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test374");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    randoop.RingBuffer var5 = new randoop.RingBuffer(1);
    boolean var6 = var5.isEmpty();
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    java.util.Iterator var13 = var8.iterator();
    boolean var14 = var8.isEmpty();
    java.util.Iterator var15 = var8.iterator();
    java.util.Iterator var16 = var8.iterator();
    var5.enqueue((java.lang.Object)var8);
    int var18 = var5.size();
    boolean var19 = var5.isEmpty();
    java.lang.Object var20 = var5.dequeue();
    var1.enqueue(var20);
    java.lang.Object var22 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test375");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    randoop.RingBuffer var12 = new randoop.RingBuffer(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    boolean var17 = var12.isEmpty();
    java.lang.Object var18 = var12.dequeue();
    java.util.Iterator var19 = var12.iterator();
    var12.enqueue((java.lang.Object)1);
    randoop.RingBuffer var23 = new randoop.RingBuffer(10);
    var23.enqueue((java.lang.Object)'#');
    boolean var26 = var23.isEmpty();
    randoop.RingBuffer var28 = new randoop.RingBuffer(10);
    var28.enqueue((java.lang.Object)'#');
    java.util.Iterator var31 = var28.iterator();
    java.util.Iterator var32 = var28.iterator();
    boolean var33 = var28.isEmpty();
    boolean var34 = var28.isEmpty();
    var23.enqueue((java.lang.Object)var28);
    var12.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 1.0d+ "'", var10.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + '#'+ "'", var18.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test376");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    java.util.Iterator var2 = var1.iterator();
    randoop.RingBuffer var4 = new randoop.RingBuffer(1);
    java.util.Iterator var5 = var4.iterator();
    boolean var6 = var4.isEmpty();
    int var7 = var4.size();
    boolean var8 = var4.isEmpty();
    randoop.RingBuffer var10 = new randoop.RingBuffer(0);
    int var11 = var10.size();
    int var12 = var10.size();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    var4.enqueue((java.lang.Object)var14);
    var1.enqueue((java.lang.Object)var4);
    java.lang.Object var17 = var4.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var4.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + true+ "'", var17.equals(true));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test377");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    java.lang.Object var14 = var7.dequeue();
    java.lang.Object var15 = var7.dequeue();
    java.util.Iterator var16 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    int var18 = var7.size();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    java.util.Iterator var25 = var20.iterator();
    boolean var26 = var20.isEmpty();
    java.util.Iterator var27 = var20.iterator();
    java.lang.Object var28 = var20.dequeue();
    java.util.Iterator var29 = var20.iterator();
    java.util.Iterator var30 = var20.iterator();
    int var31 = var20.size();
    var7.enqueue((java.lang.Object)var20);
    int var33 = var20.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + '#'+ "'", var28.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test378");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    java.util.Iterator var2 = var1.iterator();
    randoop.RingBuffer var4 = new randoop.RingBuffer(1);
    java.util.Iterator var5 = var4.iterator();
    boolean var6 = var4.isEmpty();
    int var7 = var4.size();
    boolean var8 = var4.isEmpty();
    randoop.RingBuffer var10 = new randoop.RingBuffer(0);
    int var11 = var10.size();
    int var12 = var10.size();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    var4.enqueue((java.lang.Object)var14);
    var1.enqueue((java.lang.Object)var4);
    boolean var17 = var4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test379");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    boolean var13 = var9.isEmpty();
    java.util.Iterator var14 = var9.iterator();
    int var15 = var9.size();
    java.util.Iterator var16 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var18 = var1.iterator();
    boolean var19 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test380");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    var1.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    var16.enqueue((java.lang.Object)'#');
    int var19 = var16.size();
    var16.enqueue((java.lang.Object)true);
    java.util.Iterator var22 = var16.iterator();
    java.util.Iterator var23 = var16.iterator();
    var1.enqueue((java.lang.Object)var23);
    boolean var25 = var1.isEmpty();
    java.util.Iterator var26 = var1.iterator();
    java.util.Iterator var27 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test381");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    var11.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var14 = var11.iterator();
    var11.enqueue((java.lang.Object)(byte)1);
    boolean var17 = var11.isEmpty();
    boolean var18 = var11.isEmpty();
    int var19 = var11.size();
    java.lang.Object var20 = var11.dequeue();
    var1.enqueue((java.lang.Object)var11);
    java.lang.Object var22 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var23 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 1.0d+ "'", var20.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test382");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    boolean var16 = var6.isEmpty();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    boolean var21 = var18.isEmpty();
    randoop.RingBuffer var23 = new randoop.RingBuffer(10);
    var23.enqueue((java.lang.Object)'#');
    java.util.Iterator var26 = var23.iterator();
    java.util.Iterator var27 = var23.iterator();
    boolean var28 = var23.isEmpty();
    boolean var29 = var23.isEmpty();
    var18.enqueue((java.lang.Object)var23);
    java.lang.Object var31 = var18.dequeue();
    randoop.RingBuffer var33 = new randoop.RingBuffer(1);
    java.util.Iterator var34 = var33.iterator();
    randoop.RingBuffer var36 = new randoop.RingBuffer(1);
    boolean var37 = var36.isEmpty();
    randoop.RingBuffer var39 = new randoop.RingBuffer(10);
    var39.enqueue((java.lang.Object)'#');
    java.util.Iterator var42 = var39.iterator();
    java.util.Iterator var43 = var39.iterator();
    java.util.Iterator var44 = var39.iterator();
    boolean var45 = var39.isEmpty();
    java.util.Iterator var46 = var39.iterator();
    java.util.Iterator var47 = var39.iterator();
    var36.enqueue((java.lang.Object)var39);
    java.lang.Object var49 = var39.dequeue();
    int var50 = var39.size();
    var33.enqueue((java.lang.Object)var39);
    var18.enqueue((java.lang.Object)var39);
    java.util.Iterator var53 = var18.iterator();
    var6.enqueue((java.lang.Object)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + '#'+ "'", var31.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + '#'+ "'", var49.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test383");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    randoop.RingBuffer var8 = new randoop.RingBuffer(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    var1.enqueue((java.lang.Object)var15);
    int var17 = var1.size();
    boolean var18 = var1.isEmpty();
    boolean var19 = var1.isEmpty();
    java.lang.Object var20 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + '#'+ "'", var20.equals('#'));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test384");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    int var16 = var1.size();
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    int var21 = var18.size();
    randoop.RingBuffer var23 = new randoop.RingBuffer(1);
    int var24 = var23.size();
    boolean var25 = var23.isEmpty();
    var18.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var18);
    boolean var28 = var18.isEmpty();
    java.util.Iterator var29 = var18.iterator();
    randoop.RingBuffer var31 = new randoop.RingBuffer(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    boolean var36 = var31.isEmpty();
    java.lang.Object var37 = var31.dequeue();
    java.util.Iterator var38 = var31.iterator();
    randoop.RingBuffer var40 = new randoop.RingBuffer(10);
    var40.enqueue((java.lang.Object)'#');
    java.util.Iterator var43 = var40.iterator();
    java.util.Iterator var44 = var40.iterator();
    var40.enqueue((java.lang.Object)false);
    int var47 = var40.size();
    boolean var48 = var40.isEmpty();
    java.lang.Object var49 = var40.dequeue();
    java.lang.Object var50 = var40.dequeue();
    java.util.Iterator var51 = var40.iterator();
    var40.enqueue((java.lang.Object)'4');
    java.util.Iterator var54 = var40.iterator();
    var31.enqueue((java.lang.Object)var40);
    boolean var56 = var31.isEmpty();
    java.lang.Object var57 = var31.dequeue();
    var18.enqueue((java.lang.Object)var31);
    int var59 = var31.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var60 = var31.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + '#'+ "'", var37.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + '#'+ "'", var49.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + false+ "'", var50.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test385");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.lang.Object var7 = var1.dequeue();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var16 = new randoop.RingBuffer(10);
    var16.enqueue((java.lang.Object)1.0d);
    boolean var19 = var16.isEmpty();
    int var20 = var16.size();
    boolean var21 = var16.isEmpty();
    var1.enqueue((java.lang.Object)var16);
    java.util.Iterator var23 = var16.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test386");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    randoop.RingBuffer var13 = new randoop.RingBuffer(10);
    boolean var14 = var13.isEmpty();
    java.util.Iterator var15 = var13.iterator();
    var11.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var18 = var1.iterator();
    int var19 = var1.size();
    boolean var20 = var1.isEmpty();
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    var22.enqueue((java.lang.Object)'#');
    java.util.Iterator var25 = var22.iterator();
    java.util.Iterator var26 = var22.iterator();
    java.util.Iterator var27 = var22.iterator();
    boolean var28 = var22.isEmpty();
    java.util.Iterator var29 = var22.iterator();
    java.lang.Object var30 = var22.dequeue();
    boolean var31 = var22.isEmpty();
    java.util.Iterator var32 = var22.iterator();
    var1.enqueue((java.lang.Object)var22);
    boolean var34 = var22.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + '#'+ "'", var30.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test387");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.lang.Object var7 = var1.dequeue();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test388");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    java.util.Iterator var17 = var16.iterator();
    java.util.Iterator var18 = var16.iterator();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    boolean var24 = var20.isEmpty();
    int var25 = var20.size();
    int var26 = var20.size();
    randoop.RingBuffer var28 = new randoop.RingBuffer(0);
    int var29 = var28.size();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var20.enqueue((java.lang.Object)var31);
    int var33 = var20.size();
    var16.enqueue((java.lang.Object)var20);
    var9.enqueue((java.lang.Object)var16);
    java.lang.Object var36 = var9.dequeue();
    randoop.RingBuffer var38 = new randoop.RingBuffer(10);
    boolean var39 = var38.isEmpty();
    boolean var40 = var38.isEmpty();
    java.util.Iterator var41 = var38.iterator();
    boolean var42 = var38.isEmpty();
    randoop.RingBuffer var44 = new randoop.RingBuffer(10);
    var44.enqueue((java.lang.Object)'#');
    java.util.Iterator var47 = var44.iterator();
    java.util.Iterator var48 = var44.iterator();
    var44.enqueue((java.lang.Object)false);
    int var51 = var44.size();
    var38.enqueue((java.lang.Object)var44);
    java.util.Iterator var53 = var44.iterator();
    randoop.RingBuffer var55 = new randoop.RingBuffer(1);
    boolean var56 = var55.isEmpty();
    randoop.RingBuffer var58 = new randoop.RingBuffer(10);
    var58.enqueue((java.lang.Object)'#');
    java.util.Iterator var61 = var58.iterator();
    java.util.Iterator var62 = var58.iterator();
    java.util.Iterator var63 = var58.iterator();
    boolean var64 = var58.isEmpty();
    java.util.Iterator var65 = var58.iterator();
    java.util.Iterator var66 = var58.iterator();
    var55.enqueue((java.lang.Object)var58);
    var44.enqueue((java.lang.Object)var58);
    var9.enqueue((java.lang.Object)var58);
    java.util.Iterator var70 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test389");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    java.util.Iterator var11 = var1.iterator();
    randoop.RingBuffer var13 = new randoop.RingBuffer(10);
    var13.enqueue((java.lang.Object)'#');
    java.util.Iterator var16 = var13.iterator();
    java.util.Iterator var17 = var13.iterator();
    java.util.Iterator var18 = var13.iterator();
    boolean var19 = var13.isEmpty();
    java.util.Iterator var20 = var13.iterator();
    java.util.Iterator var21 = var13.iterator();
    var13.enqueue((java.lang.Object)1.0f);
    var1.enqueue((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test390");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var10 = var1.dequeue();
    randoop.RingBuffer var12 = new randoop.RingBuffer(10);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    int var16 = var12.size();
    boolean var17 = var12.isEmpty();
    boolean var18 = var12.isEmpty();
    boolean var19 = var12.isEmpty();
    java.util.Iterator var20 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    int var22 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test391");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    java.lang.Object var15 = var9.dequeue();
    int var16 = var9.size();
    boolean var17 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var19 = var9.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test392");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    int var19 = var1.size();
    java.util.Iterator var20 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test393");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test394");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test395");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test396");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    java.lang.Object var7 = var1.dequeue();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test397");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    java.lang.Object var14 = var4.dequeue();
    int var15 = var4.size();
    int var16 = var4.size();
    int var17 = var4.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test398");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(10);
    var3.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var6 = var3.iterator();
    var3.enqueue((java.lang.Object)(byte)1);
    boolean var9 = var3.isEmpty();
    boolean var10 = var3.isEmpty();
    randoop.RingBuffer var12 = new randoop.RingBuffer(0);
    int var13 = var12.size();
    boolean var14 = var12.isEmpty();
    var3.enqueue((java.lang.Object)var12);
    java.util.Iterator var16 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    java.lang.Object var18 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test399");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test400");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    randoop.RingBuffer var6 = new randoop.RingBuffer(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    var1.enqueue((java.lang.Object)var6);
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var6.enqueue((java.lang.Object)var22);
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    var25.enqueue((java.lang.Object)1.0d);
    boolean var28 = var25.isEmpty();
    int var29 = var25.size();
    randoop.RingBuffer var31 = new randoop.RingBuffer(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    java.util.Iterator var36 = var31.iterator();
    boolean var37 = var31.isEmpty();
    randoop.RingBuffer var39 = new randoop.RingBuffer(10);
    var39.enqueue((java.lang.Object)'#');
    int var42 = var39.size();
    java.util.Iterator var43 = var39.iterator();
    var31.enqueue((java.lang.Object)var39);
    randoop.RingBuffer var46 = new randoop.RingBuffer(1);
    java.util.Iterator var47 = var46.iterator();
    java.util.Iterator var48 = var46.iterator();
    randoop.RingBuffer var50 = new randoop.RingBuffer(10);
    boolean var51 = var50.isEmpty();
    boolean var52 = var50.isEmpty();
    java.util.Iterator var53 = var50.iterator();
    boolean var54 = var50.isEmpty();
    int var55 = var50.size();
    int var56 = var50.size();
    randoop.RingBuffer var58 = new randoop.RingBuffer(0);
    int var59 = var58.size();
    boolean var60 = var58.isEmpty();
    boolean var61 = var58.isEmpty();
    var50.enqueue((java.lang.Object)var61);
    int var63 = var50.size();
    var46.enqueue((java.lang.Object)var50);
    var39.enqueue((java.lang.Object)var46);
    var25.enqueue((java.lang.Object)var39);
    boolean var67 = var39.isEmpty();
    int var68 = var39.size();
    var6.enqueue((java.lang.Object)var39);
    boolean var70 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test401");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    var1.enqueue((java.lang.Object)1);
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test402");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    var1.enqueue((java.lang.Object)'4');
    java.util.Iterator var15 = var1.iterator();
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    java.util.Iterator var18 = var1.iterator();
    randoop.RingBuffer var20 = new randoop.RingBuffer(0);
    int var21 = var20.size();
    boolean var22 = var20.isEmpty();
    var1.enqueue((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test403");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test404");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    int var10 = var7.size();
    randoop.RingBuffer var12 = new randoop.RingBuffer(1);
    int var13 = var12.size();
    boolean var14 = var12.isEmpty();
    var7.enqueue((java.lang.Object)var12);
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    java.lang.Object var23 = var17.dequeue();
    boolean var24 = var17.isEmpty();
    int var25 = var17.size();
    randoop.RingBuffer var27 = new randoop.RingBuffer(10);
    var27.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var30 = var27.iterator();
    var27.enqueue((java.lang.Object)(byte)1);
    boolean var33 = var27.isEmpty();
    boolean var34 = var27.isEmpty();
    int var35 = var27.size();
    java.lang.Object var36 = var27.dequeue();
    var17.enqueue((java.lang.Object)var27);
    java.lang.Object var38 = var17.dequeue();
    var12.enqueue((java.lang.Object)var17);
    var1.enqueue((java.lang.Object)var17);
    java.util.Iterator var41 = var17.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '#'+ "'", var23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 1.0d+ "'", var36.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test405");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    boolean var15 = var9.isEmpty();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    int var20 = var17.size();
    java.util.Iterator var21 = var17.iterator();
    var9.enqueue((java.lang.Object)var17);
    int var23 = var9.size();
    int var24 = var9.size();
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    int var29 = var26.size();
    randoop.RingBuffer var31 = new randoop.RingBuffer(1);
    int var32 = var31.size();
    boolean var33 = var31.isEmpty();
    var26.enqueue((java.lang.Object)var31);
    var9.enqueue((java.lang.Object)var26);
    boolean var36 = var26.isEmpty();
    java.util.Iterator var37 = var26.iterator();
    randoop.RingBuffer var39 = new randoop.RingBuffer(10);
    var39.enqueue((java.lang.Object)'#');
    java.util.Iterator var42 = var39.iterator();
    java.util.Iterator var43 = var39.iterator();
    boolean var44 = var39.isEmpty();
    java.lang.Object var45 = var39.dequeue();
    java.util.Iterator var46 = var39.iterator();
    randoop.RingBuffer var48 = new randoop.RingBuffer(10);
    var48.enqueue((java.lang.Object)'#');
    java.util.Iterator var51 = var48.iterator();
    java.util.Iterator var52 = var48.iterator();
    var48.enqueue((java.lang.Object)false);
    int var55 = var48.size();
    boolean var56 = var48.isEmpty();
    java.lang.Object var57 = var48.dequeue();
    java.lang.Object var58 = var48.dequeue();
    java.util.Iterator var59 = var48.iterator();
    var48.enqueue((java.lang.Object)'4');
    java.util.Iterator var62 = var48.iterator();
    var39.enqueue((java.lang.Object)var48);
    boolean var64 = var39.isEmpty();
    java.lang.Object var65 = var39.dequeue();
    var26.enqueue((java.lang.Object)var39);
    var1.enqueue((java.lang.Object)var39);
    int var68 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '#'+ "'", var45.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + '#'+ "'", var57.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + false+ "'", var58.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test406");


    randoop.RingBuffer var1 = new randoop.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test407");


    randoop.RingBuffer var1 = new randoop.RingBuffer(2);
    java.util.Iterator var2 = var1.iterator();
    randoop.RingBuffer var4 = new randoop.RingBuffer(1);
    java.util.Iterator var5 = var4.iterator();
    boolean var6 = var4.isEmpty();
    int var7 = var4.size();
    boolean var8 = var4.isEmpty();
    randoop.RingBuffer var10 = new randoop.RingBuffer(0);
    int var11 = var10.size();
    int var12 = var10.size();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    var4.enqueue((java.lang.Object)var14);
    var1.enqueue((java.lang.Object)var4);
    randoop.RingBuffer var18 = new randoop.RingBuffer(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    var18.enqueue((java.lang.Object)100.0d);
    boolean var24 = var18.isEmpty();
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    var26.enqueue((java.lang.Object)'#');
    var18.enqueue((java.lang.Object)var26);
    var1.enqueue((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test408");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    int var16 = var1.size();
    java.lang.Object var17 = var1.dequeue();
    int var18 = var1.size();
    boolean var19 = var1.isEmpty();
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    boolean var26 = var21.isEmpty();
    int var27 = var21.size();
    int var28 = var21.size();
    randoop.RingBuffer var30 = new randoop.RingBuffer(10);
    var30.enqueue((java.lang.Object)'#');
    java.util.Iterator var33 = var30.iterator();
    var30.enqueue((java.lang.Object)100.0d);
    randoop.RingBuffer var37 = new randoop.RingBuffer(10);
    var37.enqueue((java.lang.Object)'#');
    java.util.Iterator var40 = var37.iterator();
    java.util.Iterator var41 = var37.iterator();
    var37.enqueue((java.lang.Object)false);
    int var44 = var37.size();
    var30.enqueue((java.lang.Object)var44);
    java.util.Iterator var46 = var30.iterator();
    int var47 = var30.size();
    var21.enqueue((java.lang.Object)var30);
    java.lang.Object var49 = var21.dequeue();
    boolean var50 = var21.isEmpty();
    var1.enqueue((java.lang.Object)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + '#'+ "'", var49.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test409");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test410");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();
    randoop.RingBuffer var13 = new randoop.RingBuffer(10);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    java.util.Iterator var16 = var13.iterator();
    boolean var17 = var13.isEmpty();
    var13.enqueue((java.lang.Object)'#');
    boolean var20 = var13.isEmpty();
    boolean var21 = var13.isEmpty();
    int var22 = var13.size();
    var1.enqueue((java.lang.Object)var13);
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    var25.enqueue((java.lang.Object)false);
    int var32 = var25.size();
    boolean var33 = var25.isEmpty();
    java.lang.Object var34 = var25.dequeue();
    java.lang.Object var35 = var25.dequeue();
    java.util.Iterator var36 = var25.iterator();
    var25.enqueue((java.lang.Object)'4');
    randoop.RingBuffer var40 = new randoop.RingBuffer(10);
    var40.enqueue((java.lang.Object)'#');
    int var43 = var40.size();
    var40.enqueue((java.lang.Object)true);
    java.util.Iterator var46 = var40.iterator();
    java.util.Iterator var47 = var40.iterator();
    var25.enqueue((java.lang.Object)var47);
    boolean var49 = var25.isEmpty();
    java.util.Iterator var50 = var25.iterator();
    var1.enqueue((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + '#'+ "'", var34.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + false+ "'", var35.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test411");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    int var14 = var7.size();
    boolean var15 = var7.isEmpty();
    java.lang.Object var16 = var7.dequeue();
    java.lang.Object var17 = var7.dequeue();
    java.util.Iterator var18 = var7.iterator();
    var7.enqueue((java.lang.Object)'4');
    boolean var21 = var7.isEmpty();
    int var22 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test412");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    int var17 = var1.size();
    boolean var18 = var1.isEmpty();
    boolean var19 = var1.isEmpty();
    java.util.Iterator var20 = var1.iterator();
    boolean var21 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test413");


    randoop.RingBuffer var1 = new randoop.RingBuffer(4);
    boolean var2 = var1.isEmpty();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    int var11 = var4.size();
    boolean var12 = var4.isEmpty();
    java.lang.Object var13 = var4.dequeue();
    java.lang.Object var14 = var4.dequeue();
    boolean var15 = var4.isEmpty();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    int var20 = var17.size();
    var17.enqueue((java.lang.Object)true);
    var4.enqueue((java.lang.Object)var17);
    randoop.RingBuffer var25 = new randoop.RingBuffer(10);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    java.util.Iterator var28 = var25.iterator();
    int var29 = var25.size();
    var25.enqueue((java.lang.Object)(byte)10);
    int var32 = var25.size();
    var17.enqueue((java.lang.Object)var25);
    java.lang.Object var34 = var25.dequeue();
    var1.enqueue((java.lang.Object)var25);
    randoop.RingBuffer var37 = new randoop.RingBuffer(10);
    var37.enqueue((java.lang.Object)'#');
    java.util.Iterator var40 = var37.iterator();
    java.util.Iterator var41 = var37.iterator();
    java.util.Iterator var42 = var37.iterator();
    boolean var43 = var37.isEmpty();
    randoop.RingBuffer var45 = new randoop.RingBuffer(10);
    var45.enqueue((java.lang.Object)'#');
    int var48 = var45.size();
    java.util.Iterator var49 = var45.iterator();
    var37.enqueue((java.lang.Object)var45);
    int var51 = var37.size();
    java.util.Iterator var52 = var37.iterator();
    var25.enqueue((java.lang.Object)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + '#'+ "'", var13.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + (byte)10+ "'", var34.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test414");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test415");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    boolean var23 = var22.isEmpty();
    java.util.Iterator var24 = var22.iterator();
    var20.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var20.iterator();
    java.util.Iterator var27 = var20.iterator();
    var1.enqueue((java.lang.Object)var27);
    randoop.RingBuffer var30 = new randoop.RingBuffer(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    java.util.Iterator var33 = var30.iterator();
    boolean var34 = var30.isEmpty();
    var1.enqueue((java.lang.Object)var34);
    java.util.Iterator var36 = var1.iterator();
    boolean var37 = var1.isEmpty();
    randoop.RingBuffer var39 = new randoop.RingBuffer(10);
    var39.enqueue((java.lang.Object)'#');
    boolean var42 = var39.isEmpty();
    java.util.Iterator var43 = var39.iterator();
    var1.enqueue((java.lang.Object)var39);
    int var45 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 6);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test416");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    java.lang.Object var7 = var1.dequeue();
    java.lang.Object var8 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0d+ "'", var8.equals(100.0d));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test417");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    randoop.RingBuffer var11 = new randoop.RingBuffer(10);
    randoop.RingBuffer var13 = new randoop.RingBuffer(10);
    boolean var14 = var13.isEmpty();
    java.util.Iterator var15 = var13.iterator();
    var11.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var11);
    boolean var18 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test418");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test419");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test420");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    int var12 = var1.size();
    randoop.RingBuffer var14 = new randoop.RingBuffer(1);
    boolean var15 = var14.isEmpty();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    boolean var23 = var17.isEmpty();
    java.util.Iterator var24 = var17.iterator();
    java.util.Iterator var25 = var17.iterator();
    var14.enqueue((java.lang.Object)var17);
    int var27 = var17.size();
    boolean var28 = var17.isEmpty();
    boolean var29 = var17.isEmpty();
    var1.enqueue((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test421");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    boolean var23 = var22.isEmpty();
    java.util.Iterator var24 = var22.iterator();
    var20.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var20.iterator();
    java.util.Iterator var27 = var20.iterator();
    var1.enqueue((java.lang.Object)var27);
    randoop.RingBuffer var30 = new randoop.RingBuffer(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    java.util.Iterator var33 = var30.iterator();
    boolean var34 = var30.isEmpty();
    var1.enqueue((java.lang.Object)var34);
    java.util.Iterator var36 = var1.iterator();
    boolean var37 = var1.isEmpty();
    java.lang.Object var38 = var1.dequeue();
    boolean var39 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + '#'+ "'", var38.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test422");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    int var2 = var1.size();
    randoop.RingBuffer var4 = new randoop.RingBuffer(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    java.lang.Object var11 = var4.dequeue();
    java.lang.Object var12 = var4.dequeue();
    java.util.Iterator var13 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var4.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + '#'+ "'", var11.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test423");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    randoop.RingBuffer var16 = new randoop.RingBuffer(1);
    int var17 = var16.size();
    var1.enqueue((java.lang.Object)var17);
    java.util.Iterator var19 = var1.iterator();
    java.util.Iterator var20 = var1.iterator();
    java.lang.Object var21 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + true+ "'", var21.equals(true));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test424");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    boolean var19 = var1.isEmpty();
    java.util.Iterator var20 = var1.iterator();
    int var21 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 3);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test425");


    randoop.RingBuffer var1 = new randoop.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(0);
    int var8 = var7.size();
    int var9 = var7.size();
    java.util.Iterator var10 = var7.iterator();
    boolean var11 = var7.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    java.lang.Object var13 = var1.dequeue();
    boolean var14 = var1.isEmpty();
    int var15 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + true+ "'", var13.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test426");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    boolean var23 = var22.isEmpty();
    java.util.Iterator var24 = var22.iterator();
    var20.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var20.iterator();
    java.util.Iterator var27 = var20.iterator();
    var1.enqueue((java.lang.Object)var27);
    randoop.RingBuffer var30 = new randoop.RingBuffer(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    java.util.Iterator var33 = var30.iterator();
    boolean var34 = var30.isEmpty();
    var1.enqueue((java.lang.Object)var34);
    java.util.Iterator var36 = var1.iterator();
    boolean var37 = var1.isEmpty();
    boolean var38 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test427");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    boolean var17 = var9.isEmpty();
    randoop.RingBuffer var19 = new randoop.RingBuffer(10);
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    boolean var22 = var21.isEmpty();
    java.util.Iterator var23 = var21.iterator();
    var19.enqueue((java.lang.Object)var23);
    var9.enqueue((java.lang.Object)var19);
    java.util.Iterator var26 = var9.iterator();
    int var27 = var9.size();
    java.util.Iterator var28 = var9.iterator();
    var1.enqueue((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test428");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    var1.enqueue((java.lang.Object)1);
    randoop.RingBuffer var12 = new randoop.RingBuffer(10);
    var12.enqueue((java.lang.Object)'#');
    boolean var15 = var12.isEmpty();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    var12.enqueue((java.lang.Object)var17);
    var1.enqueue((java.lang.Object)var12);
    int var26 = var12.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test429");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    int var14 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var16 = var7.iterator();
    randoop.RingBuffer var18 = new randoop.RingBuffer(1);
    boolean var19 = var18.isEmpty();
    randoop.RingBuffer var21 = new randoop.RingBuffer(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    java.util.Iterator var26 = var21.iterator();
    boolean var27 = var21.isEmpty();
    java.util.Iterator var28 = var21.iterator();
    java.util.Iterator var29 = var21.iterator();
    var18.enqueue((java.lang.Object)var21);
    var7.enqueue((java.lang.Object)var21);
    boolean var32 = var7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test430");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)'#');
    randoop.RingBuffer var14 = new randoop.RingBuffer(1);
    boolean var15 = var14.isEmpty();
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    boolean var23 = var17.isEmpty();
    java.util.Iterator var24 = var17.iterator();
    java.util.Iterator var25 = var17.iterator();
    var14.enqueue((java.lang.Object)var17);
    int var27 = var17.size();
    boolean var28 = var17.isEmpty();
    boolean var29 = var17.isEmpty();
    var1.enqueue((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test431");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    java.util.Iterator var13 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test432");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    randoop.RingBuffer var9 = new randoop.RingBuffer(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    randoop.RingBuffer var15 = new randoop.RingBuffer(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    int var22 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    java.util.Iterator var24 = var15.iterator();
    java.lang.Object var25 = var15.dequeue();
    java.util.Iterator var26 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    randoop.RingBuffer var29 = new randoop.RingBuffer(10);
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    java.util.Iterator var32 = var29.iterator();
    boolean var33 = var29.isEmpty();
    var29.enqueue((java.lang.Object)'#');
    boolean var36 = var29.isEmpty();
    var15.enqueue((java.lang.Object)var29);
    int var38 = var15.size();
    boolean var39 = var15.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test433");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.RingBuffer var9 = new randoop.RingBuffer(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    int var15 = var1.size();
    randoop.RingBuffer var17 = new randoop.RingBuffer(1);
    boolean var18 = var17.isEmpty();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    java.util.Iterator var25 = var20.iterator();
    boolean var26 = var20.isEmpty();
    java.util.Iterator var27 = var20.iterator();
    java.util.Iterator var28 = var20.iterator();
    var17.enqueue((java.lang.Object)var20);
    var1.enqueue((java.lang.Object)var20);
    java.util.Iterator var31 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test434");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    randoop.RingBuffer var10 = new randoop.RingBuffer(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    java.util.Iterator var15 = var10.iterator();
    boolean var16 = var10.isEmpty();
    java.util.Iterator var17 = var10.iterator();
    java.lang.Object var18 = var10.dequeue();
    boolean var19 = var10.isEmpty();
    int var20 = var10.size();
    var1.enqueue((java.lang.Object)var10);
    randoop.RingBuffer var23 = new randoop.RingBuffer(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    boolean var26 = var23.isEmpty();
    randoop.RingBuffer var28 = new randoop.RingBuffer(10);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    java.util.Iterator var31 = var28.iterator();
    boolean var32 = var28.isEmpty();
    var28.enqueue((java.lang.Object)'#');
    var23.enqueue((java.lang.Object)'#');
    var10.enqueue((java.lang.Object)'#');
    int var37 = var10.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + '#'+ "'", var18.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test435");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    randoop.RingBuffer var14 = new randoop.RingBuffer(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)var14);
    randoop.RingBuffer var22 = new randoop.RingBuffer(10);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    java.util.Iterator var25 = var22.iterator();
    int var26 = var22.size();
    var22.enqueue((java.lang.Object)(byte)10);
    int var29 = var22.size();
    var14.enqueue((java.lang.Object)var22);
    java.util.Iterator var31 = var22.iterator();
    java.lang.Object var32 = var22.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + (byte)10+ "'", var32.equals((byte)10));

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test436");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.RingBuffer var7 = new randoop.RingBuffer(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    int var14 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    randoop.RingBuffer var17 = new randoop.RingBuffer(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    java.lang.Object var23 = var17.dequeue();
    java.util.Iterator var24 = var17.iterator();
    randoop.RingBuffer var26 = new randoop.RingBuffer(10);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    java.util.Iterator var29 = var26.iterator();
    boolean var30 = var26.isEmpty();
    var17.enqueue((java.lang.Object)var30);
    var1.enqueue((java.lang.Object)var17);
    int var33 = var1.size();
    randoop.RingBuffer var35 = new randoop.RingBuffer(10);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    java.util.Iterator var38 = var35.iterator();
    boolean var39 = var35.isEmpty();
    var35.enqueue((java.lang.Object)'#');
    java.lang.Object var42 = var35.dequeue();
    var1.enqueue(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '#'+ "'", var23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + '#'+ "'", var42.equals('#'));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test437");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    randoop.RingBuffer var10 = new randoop.RingBuffer(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    java.util.Iterator var15 = var10.iterator();
    boolean var16 = var10.isEmpty();
    java.util.Iterator var17 = var10.iterator();
    java.lang.Object var18 = var10.dequeue();
    randoop.RingBuffer var20 = new randoop.RingBuffer(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    int var24 = var20.size();
    var20.enqueue((java.lang.Object)(byte)10);
    boolean var27 = var20.isEmpty();
    var10.enqueue((java.lang.Object)var27);
    java.util.Iterator var29 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    boolean var31 = var10.isEmpty();
    int var32 = var10.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + '#'+ "'", var18.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test438");


    randoop.RingBuffer var1 = new randoop.RingBuffer(10);
    randoop.RingBuffer var3 = new randoop.RingBuffer(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    java.lang.Object var8 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
