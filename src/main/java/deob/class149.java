package deob;

@ObfuscatedName("eu")
public class class149 implements Runnable {

    @ObfuscatedName("eu.j")
    public static class177 field2499 = new class177();

    @ObfuscatedName("eu.z")
    public static class177 field2498 = new class177();

    @ObfuscatedName("eu.y")
    public static int field2494 = 0;

    @ObfuscatedName("eu.h")
    public static Object field2495 = new Object();

    @ObfuscatedName("ee.z(ILdv;Lei;B)V")
    public static void method2700(int arg0, class121 arg1, class147 arg2) {
        byte[] var3 = null;
        class177 var4 = field2499;
        synchronized (field2499) {
            for (class148 var5 = (class148) field2499.method3236(); var5 != null; var5 = (class148) field2499.method3243()) {
                if ((long) arg0 == var5.field2861 && var5.field2488 == arg1 && var5.field2491 == 0) {
                    var3 = var5.field2486;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2471(arg0);
            arg2.method2830(arg1, arg0, var7, true);
        } else {
            arg2.method2830(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("dw.y(I)V")
    public static void method2363() {
        while (true) {
            class177 var0 = field2499;
            class148 var1;
            synchronized (field2499) {
                var1 = (class148) field2498.method3239();
            }
            if (var1 == null) {
                return;
            }
            var1.field2489.method2830(var1.field2488, (int) var1.field2861, var1.field2486, false);
        }
    }

    @ObfuscatedName("dg.h(B)V")
    public static void method2511() {
        Object var0 = field2495;
        synchronized (field2495) {
            if (field2494 == 0) {
                Statics.field1884.method2492(new class149(), 5);
            }
            field2494 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2499;
                class148 var2;
                synchronized (field2499) {
                    var2 = (class148) field2499.method3236();
                }
                if (var2 == null) {
                    class114.method589(100L);
                    Object var10 = field2495;
                    synchronized (field2495) {
                        if (field2494 <= 1) {
                            field2494 = 0;
                            field2495.notifyAll();
                            return;
                        }
                        field2494--;
                    }
                } else {
                    if (var2.field2491 == 0) {
                        var2.field2488.method2472((int) var2.field2861, var2.field2486, var2.field2486.length);
                        class177 var4 = field2499;
                        synchronized (field2499) {
                            var2.method3309();
                        }
                    } else if (var2.field2491 == 1) {
                        var2.field2486 = var2.field2488.method2471((int) var2.field2861);
                        class177 var6 = field2499;
                        synchronized (field2499) {
                            field2498.method3253(var2);
                        }
                    }
                    Object var8 = field2495;
                    synchronized (field2495) {
                        if (field2494 <= 1) {
                            field2494 = 0;
                            field2495.notifyAll();
                            return;
                        }
                        field2494 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method495((String) null, var18);
        }
    }

    @ObfuscatedName("an.r(I)V")
    public static void method621() {
        Object var0 = field2495;
        synchronized (field2495) {
            if (field2494 != 0) {
                field2494 = 1;
                try {
                    field2495.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
