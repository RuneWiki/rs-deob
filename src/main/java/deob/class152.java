package deob;

@ObfuscatedName("eh")
public class class152 implements Runnable {

    @ObfuscatedName("eh.x")
    public static class180 field2501 = new class180();

    @ObfuscatedName("eh.v")
    public static class180 field2498 = new class180();

    @ObfuscatedName("eh.m")
    public static int field2500 = 0;

    @ObfuscatedName("eh.e")
    public static Object field2499 = new Object();

    @ObfuscatedName("ce.h(I[BLds;I)V")
    public static void method1885(int arg0, byte[] arg1, class123 arg2) {
        class151 var3 = new class151();
        var3.field2494 = 0;
        var3.field2882 = (long) arg0;
        var3.field2488 = arg1;
        var3.field2495 = arg2;
        class180 var4 = field2501;
        synchronized (field2501) {
            field2501.method3246(var3);
        }
        Object var6 = field2499;
        synchronized (field2499) {
            if (field2500 == 0) {
                Statics.field1891.method2500(new class152(), 5);
            }
            field2500 = 600;
        }
    }

    @ObfuscatedName("be.j(I)V")
    public static void method1395() {
        while (true) {
            class180 var0 = field2501;
            class151 var1;
            synchronized (field2501) {
                var1 = (class151) field2498.method3249();
            }
            if (var1 == null) {
                return;
            }
            var1.field2491.method2808(var1.field2495, (int) var1.field2882, var1.field2488, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class180 var1 = field2501;
                class151 var2;
                synchronized (field2501) {
                    var2 = (class151) field2501.method3251();
                }
                if (var2 == null) {
                    class116.method1361(100L);
                    Object var10 = field2499;
                    synchronized (field2499) {
                        if (field2500 <= 1) {
                            field2500 = 0;
                            field2499.notifyAll();
                            return;
                        }
                        field2500--;
                    }
                } else {
                    if (var2.field2494 == 0) {
                        var2.field2495.method2479((int) var2.field2882, var2.field2488, var2.field2488.length);
                        class180 var4 = field2501;
                        synchronized (field2501) {
                            var2.method3352();
                        }
                    } else if (var2.field2494 == 1) {
                        var2.field2488 = var2.field2495.method2478((int) var2.field2882);
                        class180 var6 = field2501;
                        synchronized (field2501) {
                            field2498.method3246(var2);
                        }
                    }
                    Object var8 = field2499;
                    synchronized (field2499) {
                        if (field2500 <= 1) {
                            field2500 = 0;
                            field2499.notifyAll();
                            return;
                        }
                        field2500 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class137.method483((String) null, var18);
        }
    }
}
