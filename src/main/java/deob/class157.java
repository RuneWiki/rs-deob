package deob;

@ObfuscatedName("fx")
public class class157 implements Runnable {

    @ObfuscatedName("fx.t")
    public static class177 field2578 = new class177();

    @ObfuscatedName("fx.l")
    public static class177 field2577 = new class177();

    @ObfuscatedName("fx.c")
    public static int field2580 = 0;

    @ObfuscatedName("fx.d")
    public static Object field2579 = new Object();

    @ObfuscatedName("dr.c(I[BLbz;B)V")
    public static void method2335(int arg0, byte[] arg1, class71 arg2) {
        class156 var3 = new class156();
        var3.field2574 = 0;
        var3.field2821 = (long) arg0;
        var3.field2571 = arg1;
        var3.field2573 = arg2;
        class177 var4 = field2578;
        synchronized (field2578) {
            field2578.method3317(var3);
        }
        Object var6 = field2579;
        synchronized (field2579) {
            if (field2580 == 0) {
                Statics.field1405.method1515(new class157(), 5);
            }
            field2580 = 600;
        }
    }

    @ObfuscatedName("w.d(ILbz;Ley;I)V")
    public static void method149(int arg0, class71 arg1, class154 arg2) {
        byte[] var3 = null;
        class177 var4 = field2578;
        synchronized (field2578) {
            for (class156 var5 = (class156) field2578.method3345(); var5 != null; var5 = (class156) field2578.method3324()) {
                if ((long) arg0 == var5.field2821 && var5.field2573 == arg1 && var5.field2574 == 0) {
                    var3 = var5.field2571;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1420(arg0);
            arg2.method3082(arg1, arg0, var7, true);
        } else {
            arg2.method3082(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2578;
                class156 var2;
                synchronized (field2578) {
                    var2 = (class156) field2578.method3345();
                }
                if (var2 == null) {
                    class126.method3086(100L);
                    Object var10 = field2579;
                    synchronized (field2579) {
                        if (field2580 <= 1) {
                            field2580 = 0;
                            field2579.notifyAll();
                            return;
                        }
                        field2580--;
                    }
                } else {
                    if (var2.field2574 == 0) {
                        var2.field2573.method1419((int) var2.field2821, var2.field2571, var2.field2571.length);
                        class177 var4 = field2578;
                        synchronized (field2578) {
                            var2.method3361();
                        }
                    } else if (var2.field2574 == 1) {
                        var2.field2571 = var2.field2573.method1420((int) var2.field2821);
                        class177 var6 = field2578;
                        synchronized (field2578) {
                            field2577.method3317(var2);
                        }
                    }
                    Object var8 = field2579;
                    synchronized (field2579) {
                        if (field2580 <= 1) {
                            field2580 = 0;
                            field2579.notifyAll();
                            return;
                        }
                        field2580 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method3170((String) null, var18);
        }
    }
}
