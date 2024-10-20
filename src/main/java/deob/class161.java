package deob;

@ObfuscatedName("fj")
public class class161 implements Runnable {

    @ObfuscatedName("fj.e")
    public static class189 field2574 = new class189();

    @ObfuscatedName("fj.a")
    public static class189 field2575 = new class189();

    @ObfuscatedName("fj.l")
    public static int field2576 = 0;

    @ObfuscatedName("fj.c")
    public static Object field2577 = new Object();

    @ObfuscatedName("ds.c(I[BLdg;I)V")
    public static void method2501(int arg0, byte[] arg1, class126 arg2) {
        class160 var3 = new class160();
        var3.field2573 = 0;
        var3.field2963 = (long) arg0;
        var3.field2565 = arg1;
        var3.field2564 = arg2;
        class189 var4 = field2574;
        synchronized (field2574) {
            field2574.method3374(var3);
        }
        Object var6 = field2577;
        synchronized (field2577) {
            if (field2576 == 0) {
                Statics.field879.method2566(new class161(), 5);
            }
            field2576 = 600;
        }
    }

    @ObfuscatedName("dh.u(ILdg;Lfo;B)V")
    public static void method2165(int arg0, class126 arg1, class159 arg2) {
        class160 var3 = new class160();
        var3.field2573 = 1;
        var3.field2963 = (long) arg0;
        var3.field2564 = arg1;
        var3.field2567 = arg2;
        class189 var4 = field2574;
        synchronized (field2574) {
            field2574.method3374(var3);
        }
        Object var6 = field2577;
        synchronized (field2577) {
            if (field2576 == 0) {
                Statics.field879.method2566(new class161(), 5);
            }
            field2576 = 600;
        }
    }

    @ObfuscatedName("ew.w(ILdg;Lfo;I)V")
    public static void method2750(int arg0, class126 arg1, class159 arg2) {
        byte[] var3 = null;
        class189 var4 = field2574;
        synchronized (field2574) {
            for (class160 var5 = (class160) field2574.method3378(); var5 != null; var5 = (class160) field2574.method3394()) {
                if ((long) arg0 == var5.field2963 && var5.field2564 == arg1 && var5.field2573 == 0) {
                    var3 = var5.field2565;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2542(arg0);
            arg2.method2922(arg1, arg0, var7, true);
        } else {
            arg2.method2922(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class189 var1 = field2574;
                class160 var2;
                synchronized (field2574) {
                    var2 = (class160) field2574.method3378();
                }
                if (var2 == null) {
                    class119.method837(100L);
                    Object var10 = field2577;
                    synchronized (field2577) {
                        if (field2576 <= 1) {
                            field2576 = 0;
                            field2577.notifyAll();
                            return;
                        }
                        field2576--;
                    }
                } else {
                    if (var2.field2573 == 0) {
                        var2.field2564.method2548((int) var2.field2963, var2.field2565, var2.field2565.length);
                        class189 var4 = field2574;
                        synchronized (field2574) {
                            var2.method3463();
                        }
                    } else if (var2.field2573 == 1) {
                        var2.field2565 = var2.field2564.method2542((int) var2.field2963);
                        class189 var6 = field2574;
                        synchronized (field2574) {
                            field2575.method3374(var2);
                        }
                    }
                    Object var8 = field2577;
                    synchronized (field2577) {
                        if (field2576 <= 1) {
                            field2576 = 0;
                            field2577.notifyAll();
                            return;
                        }
                        field2576 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class140.method2555((String) null, var18);
        }
    }
}
