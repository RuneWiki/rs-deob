package deob;

@ObfuscatedName("ff")
public class class158 implements Runnable {

    @ObfuscatedName("ff.q")
    public static class177 field2597 = new class177();

    @ObfuscatedName("ff.c")
    public static class177 field2599 = new class177();

    @ObfuscatedName("ff.p")
    public static int field2598 = 0;

    @ObfuscatedName("ff.z")
    public static Object field2596 = new Object();

    @ObfuscatedName("db.m(ILbm;Ler;B)V")
    public static void method2353(int arg0, class71 arg1, class155 arg2) {
        class157 var3 = new class157();
        var3.field2595 = 1;
        var3.field2830 = (long) arg0;
        var3.field2593 = arg1;
        var3.field2594 = arg2;
        class177 var4 = field2597;
        synchronized (field2597) {
            field2597.method3288(var3);
        }
        Object var6 = field2596;
        synchronized (field2596) {
            if (field2598 == 0) {
                Statics.field751.method1512(new class158(), 5);
            }
            field2598 = 600;
        }
    }

    @ObfuscatedName("ck.k(I)V")
    public static void method1852() {
        while (true) {
            class177 var0 = field2597;
            class157 var1;
            synchronized (field2597) {
                var1 = (class157) field2599.method3279();
            }
            if (var1 == null) {
                return;
            }
            var1.field2594.method3053(var1.field2593, (int) var1.field2830, var1.field2592, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2597;
                class157 var2;
                synchronized (field2597) {
                    var2 = (class157) field2597.method3286();
                }
                if (var2 == null) {
                    class126.method210(100L);
                    Object var10 = field2596;
                    synchronized (field2596) {
                        if (field2598 <= 1) {
                            field2598 = 0;
                            field2596.notifyAll();
                            return;
                        }
                        field2598--;
                    }
                } else {
                    if (var2.field2595 == 0) {
                        var2.field2593.method1425((int) var2.field2830, var2.field2592, var2.field2592.length);
                        class177 var4 = field2597;
                        synchronized (field2597) {
                            var2.method3309();
                        }
                    } else if (var2.field2595 == 1) {
                        var2.field2592 = var2.field2593.method1434((int) var2.field2830);
                        class177 var6 = field2597;
                        synchronized (field2597) {
                            field2599.method3288(var2);
                        }
                    }
                    Object var8 = field2596;
                    synchronized (field2596) {
                        if (field2598 <= 1) {
                            field2598 = 0;
                            field2596.notifyAll();
                            return;
                        }
                        field2598 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method2321((String) null, var18);
        }
    }
}
