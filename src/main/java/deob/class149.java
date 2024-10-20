package deob;

@ObfuscatedName("eu")
public class class149 implements Runnable {

    @ObfuscatedName("eu.i")
    public static class177 field2489 = new class177();

    @ObfuscatedName("eu.c")
    public static class177 field2484 = new class177();

    @ObfuscatedName("eu.h")
    public static int field2485 = 0;

    @ObfuscatedName("eu.v")
    public static Object field2486 = new Object();

    @ObfuscatedName("cv.v(ILdh;Lef;I)V")
    public static void method1796(int arg0, class121 arg1, class147 arg2) {
        class148 var3 = new class148();
        var3.field2481 = 1;
        var3.field2871 = (long) arg0;
        var3.field2478 = arg1;
        var3.field2479 = arg2;
        class177 var4 = field2489;
        synchronized (field2489) {
            field2489.method3251(var3);
        }
        Object var6 = field2486;
        synchronized (field2486) {
            if (field2485 == 0) {
                Statics.field649.method2498(new class149(), 5);
            }
            field2485 = 600;
        }
    }

    @ObfuscatedName("g.q(ILdh;Lef;B)V")
    public static void method87(int arg0, class121 arg1, class147 arg2) {
        byte[] var3 = null;
        class177 var4 = field2489;
        synchronized (field2489) {
            for (class148 var5 = (class148) field2489.method3257(); var5 != null; var5 = (class148) field2489.method3249()) {
                if ((long) arg0 == var5.field2871 && var5.field2478 == arg1 && var5.field2481 == 0) {
                    var3 = var5.field2477;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2477(arg0);
            arg2.method2827(arg1, arg0, var7, true);
        } else {
            arg2.method2827(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("du.s(I)V")
    public static void method2380() {
        while (true) {
            class177 var0 = field2489;
            class148 var1;
            synchronized (field2489) {
                var1 = (class148) field2484.method3264();
            }
            if (var1 == null) {
                return;
            }
            var1.field2479.method2827(var1.field2478, (int) var1.field2871, var1.field2477, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2489;
                class148 var2;
                synchronized (field2489) {
                    var2 = (class148) field2489.method3257();
                }
                if (var2 == null) {
                    class114.method743(100L);
                    Object var10 = field2486;
                    synchronized (field2486) {
                        if (field2485 <= 1) {
                            field2485 = 0;
                            field2486.notifyAll();
                            return;
                        }
                        field2485--;
                    }
                } else {
                    if (var2.field2481 == 0) {
                        var2.field2478.method2480((int) var2.field2871, var2.field2477, var2.field2477.length);
                        class177 var4 = field2489;
                        synchronized (field2489) {
                            var2.method3334();
                        }
                    } else if (var2.field2481 == 1) {
                        var2.field2477 = var2.field2478.method2477((int) var2.field2871);
                        class177 var6 = field2489;
                        synchronized (field2489) {
                            field2484.method3251(var2);
                        }
                    }
                    Object var8 = field2486;
                    synchronized (field2486) {
                        if (field2485 <= 1) {
                            field2485 = 0;
                            field2486.notifyAll();
                            return;
                        }
                        field2485 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method2595((String) null, var18);
        }
    }
}
