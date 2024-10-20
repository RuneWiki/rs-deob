package deob;

@ObfuscatedName("ir")
public class class251 implements Runnable {

    @ObfuscatedName("ir.f")
    public static class208 field3245 = new class208();

    @ObfuscatedName("ir.l")
    public static class208 field3241 = new class208();

    @ObfuscatedName("ir.w")
    public static int field3244 = 0;

    @ObfuscatedName("ir.s")
    public static Object field3242 = new Object();

    @ObfuscatedName("bm.f(I)V")
    public static void method1017() {
        while (true) {
            class208 var0 = field3245;
            class248 var1;
            synchronized (field3245) {
                var1 = (class248) field3241.method3822();
            }
            if (var1 == null) {
                return;
            }
            var1.field3216.method4399(var1.field3213, (int) var1.field2497, var1.field3214, false);
        }
    }

    @ObfuscatedName("ie.l(B)V")
    public static void method4275() {
        Object var0 = field3242;
        synchronized (field3242) {
            if (field3244 == 0) {
                Statics.field3240 = new Thread(new class251());
                Statics.field3240.setDaemon(true);
                Statics.field3240.start();
                Statics.field3240.setPriority(5);
            }
            field3244 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class208 var1 = field3245;
                class248 var2;
                synchronized (field3245) {
                    var2 = (class248) field3245.method3827();
                }
                if (var2 == null) {
                    class194.method1752(100L);
                    Object var10 = field3242;
                    synchronized (field3242) {
                        if (field3244 <= 1) {
                            field3244 = 0;
                            field3242.notifyAll();
                            return;
                        }
                        field3244--;
                    }
                } else {
                    if (var2.field3215 == 0) {
                        var2.field3213.method3160((int) var2.field2497, var2.field3214, var2.field3214.length);
                        class208 var4 = field3245;
                        synchronized (field3245) {
                            var2.method3818();
                        }
                    } else if (var2.field3215 == 1) {
                        var2.field3214 = var2.field3213.method3161((int) var2.field2497);
                        class208 var6 = field3245;
                        synchronized (field3245) {
                            field3241.method3823(var2);
                        }
                    }
                    Object var8 = field3242;
                    synchronized (field3242) {
                        if (field3244 <= 1) {
                            field3244 = 0;
                            field3242.notifyAll();
                            return;
                        }
                        field3244 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class155.method2919((String) null, var18);
        }
    }
}
