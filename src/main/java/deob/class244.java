package deob;

@ObfuscatedName("in")
public class class244 implements Runnable {

    @ObfuscatedName("in.d")
    public static class201 field3308 = new class201();

    @ObfuscatedName("in.x")
    public static class201 field3307 = new class201();

    @ObfuscatedName("in.k")
    public static int field3309 = 0;

    @ObfuscatedName("in.z")
    public static Object field3310 = new Object();

    @ObfuscatedName("az.d(I[BLff;I)V")
    public static void method669(int arg0, byte[] arg1, class162 arg2) {
        class241 var3 = new class241();
        var3.field3283 = 0;
        var3.field2564 = (long) arg0;
        var3.field3281 = arg1;
        var3.field3284 = arg2;
        class201 var4 = field3308;
        synchronized (field3308) {
            field3308.method3502(var3);
        }
        method3557();
    }

    @ObfuscatedName("fq.x(ILff;Liv;I)V")
    public static void method2954(int arg0, class162 arg1, class245 arg2) {
        class241 var3 = new class241();
        var3.field3283 = 1;
        var3.field2564 = (long) arg0;
        var3.field3284 = arg1;
        var3.field3282 = arg2;
        class201 var4 = field3308;
        synchronized (field3308) {
            field3308.method3502(var3);
        }
        method3557();
    }

    @ObfuscatedName("hc.z(I)V")
    public static void method3557() {
        Object var0 = field3310;
        synchronized (field3310) {
            if (field3309 == 0) {
                Statics.field2517 = new Thread(new class244());
                Statics.field2517.setDaemon(true);
                Statics.field2517.start();
                Statics.field2517.setPriority(5);
            }
            field3309 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class201 var1 = field3308;
                class241 var2;
                synchronized (field3308) {
                    var2 = (class241) field3308.method3500();
                }
                if (var2 == null) {
                    class189.method13(100L);
                    Object var10 = field3310;
                    synchronized (field3310) {
                        if (field3309 <= 1) {
                            field3309 = 0;
                            field3310.notifyAll();
                            return;
                        }
                        field3309--;
                    }
                } else {
                    if (var2.field3283 == 0) {
                        var2.field3284.method2881((int) var2.field2564, var2.field3281, var2.field3281.length);
                        class201 var4 = field3308;
                        synchronized (field3308) {
                            var2.method3475();
                        }
                    } else if (var2.field3283 == 1) {
                        var2.field3281 = var2.field3284.method2880((int) var2.field2564);
                        class201 var6 = field3308;
                        synchronized (field3308) {
                            field3307.method3502(var2);
                        }
                    }
                    Object var8 = field3310;
                    synchronized (field3310) {
                        if (field3309 <= 1) {
                            field3309 = 0;
                            field3310.notifyAll();
                            return;
                        }
                        field3309 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class154.method1684((String) null, var18);
        }
    }

    @ObfuscatedName("ef.v(I)V")
    public static void method2772() {
        Object var0 = field3310;
        synchronized (field3310) {
            if (field3309 != 0) {
                field3309 = 1;
                try {
                    field3310.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
