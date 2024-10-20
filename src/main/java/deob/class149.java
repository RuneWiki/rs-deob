package deob;

@ObfuscatedName("eg")
public class class149 implements Runnable {

    @ObfuscatedName("eg.k")
    public static class177 field2487 = new class177();

    @ObfuscatedName("eg.r")
    public static class177 field2488 = new class177();

    @ObfuscatedName("eg.y")
    public static int field2489 = 0;

    @ObfuscatedName("eg.w")
    public static Object field2490 = new Object();

    @ObfuscatedName("cm.m(I[BLdt;I)V")
    public static void method1968(int arg0, byte[] arg1, class121 arg2) {
        class148 var3 = new class148();
        var3.field2478 = 0;
        var3.field2877 = (long) arg0;
        var3.field2479 = arg1;
        var3.field2480 = arg2;
        class177 var4 = field2487;
        synchronized (field2487) {
            field2487.method3190(var3);
        }
        Object var6 = field2490;
        synchronized (field2490) {
            if (field2489 == 0) {
                Statics.field1680.method2463(new class149(), 5);
            }
            field2489 = 600;
        }
    }

    @ObfuscatedName("dr.j(ILdt;Let;I)V")
    public static void method2407(int arg0, class121 arg1, class147 arg2) {
        byte[] var3 = null;
        class177 var4 = field2487;
        synchronized (field2487) {
            for (class148 var5 = (class148) field2487.method3195(); var5 != null; var5 = (class148) field2487.method3212()) {
                if ((long) arg0 == var5.field2877 && var5.field2480 == arg1 && var5.field2478 == 0) {
                    var3 = var5.field2479;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2447(arg0);
            arg2.method2766(arg1, arg0, var7, true);
        } else {
            arg2.method2766(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("h.g(B)V")
    public static void method463() {
        while (true) {
            class177 var0 = field2487;
            class148 var1;
            synchronized (field2487) {
                var1 = (class148) field2488.method3211();
            }
            if (var1 == null) {
                return;
            }
            var1.field2481.method2766(var1.field2480, (int) var1.field2877, var1.field2479, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2487;
                class148 var2;
                synchronized (field2487) {
                    var2 = (class148) field2487.method3195();
                }
                if (var2 == null) {
                    class114.method2808(100L);
                    Object var10 = field2490;
                    synchronized (field2490) {
                        if (field2489 <= 1) {
                            field2489 = 0;
                            field2490.notifyAll();
                            return;
                        }
                        field2489--;
                    }
                } else {
                    if (var2.field2478 == 0) {
                        var2.field2480.method2441((int) var2.field2877, var2.field2479, var2.field2479.length);
                        class177 var4 = field2487;
                        synchronized (field2487) {
                            var2.method3275();
                        }
                    } else if (var2.field2478 == 1) {
                        var2.field2479 = var2.field2480.method2447((int) var2.field2877);
                        class177 var6 = field2487;
                        synchronized (field2487) {
                            field2488.method3190(var2);
                        }
                    }
                    Object var8 = field2490;
                    synchronized (field2490) {
                        if (field2489 <= 1) {
                            field2489 = 0;
                            field2490.notifyAll();
                            return;
                        }
                        field2489 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method1963((String) null, var18);
        }
    }
}
