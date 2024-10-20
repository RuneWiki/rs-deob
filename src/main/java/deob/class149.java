package deob;

@ObfuscatedName("er")
public class class149 implements Runnable {

    @ObfuscatedName("er.t")
    public static class177 field2472 = new class177();

    @ObfuscatedName("er.o")
    public static class177 field2466 = new class177();

    @ObfuscatedName("er.i")
    public static int field2471 = 0;

    @ObfuscatedName("er.p")
    public static Object field2468 = new Object();

    @ObfuscatedName("bx.i(I[BLdt;I)V")
    public static void method1332(int arg0, byte[] arg1, class121 arg2) {
        class148 var3 = new class148();
        var3.field2458 = 0;
        var3.field2866 = (long) arg0;
        var3.field2459 = arg1;
        var3.field2460 = arg2;
        class177 var4 = field2472;
        synchronized (field2472) {
            field2472.method3166(var3);
        }
        Object var6 = field2468;
        synchronized (field2468) {
            if (field2471 == 0) {
                Statics.field777.method2458(new class149(), 5);
            }
            field2471 = 600;
        }
    }

    @ObfuscatedName("an.p(ILdt;Leh;I)V")
    public static void method781(int arg0, class121 arg1, class147 arg2) {
        byte[] var3 = null;
        class177 var4 = field2472;
        synchronized (field2472) {
            for (class148 var5 = (class148) field2472.method3170(); var5 != null; var5 = (class148) field2472.method3172()) {
                if ((long) arg0 == var5.field2866 && var5.field2460 == arg1 && var5.field2458 == 0) {
                    var3 = var5.field2459;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2434(arg0);
            arg2.method2747(arg1, arg0, var7, true);
        } else {
            arg2.method2747(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("eq.c(I)V")
    public static void method2653() {
        while (true) {
            class177 var0 = field2472;
            class148 var1;
            synchronized (field2472) {
                var1 = (class148) field2466.method3173();
            }
            if (var1 == null) {
                return;
            }
            var1.field2461.method2747(var1.field2460, (int) var1.field2866, var1.field2459, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2472;
                class148 var2;
                synchronized (field2472) {
                    var2 = (class148) field2472.method3170();
                }
                if (var2 == null) {
                    class114.method1854(100L);
                    Object var10 = field2468;
                    synchronized (field2468) {
                        if (field2471 <= 1) {
                            field2471 = 0;
                            field2468.notifyAll();
                            return;
                        }
                        field2471--;
                    }
                } else {
                    if (var2.field2458 == 0) {
                        var2.field2460.method2437((int) var2.field2866, var2.field2459, var2.field2459.length);
                        class177 var4 = field2472;
                        synchronized (field2472) {
                            var2.method3261();
                        }
                    } else if (var2.field2458 == 1) {
                        var2.field2459 = var2.field2460.method2434((int) var2.field2866);
                        class177 var6 = field2472;
                        synchronized (field2472) {
                            field2466.method3166(var2);
                        }
                    }
                    Object var8 = field2468;
                    synchronized (field2468) {
                        if (field2471 <= 1) {
                            field2471 = 0;
                            field2468.notifyAll();
                            return;
                        }
                        field2471 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method1362((String) null, var18);
        }
    }

    @ObfuscatedName("ah.y(B)V")
    public static void method577() {
        Object var0 = field2468;
        synchronized (field2468) {
            if (field2471 != 0) {
                field2471 = 1;
                try {
                    field2468.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
