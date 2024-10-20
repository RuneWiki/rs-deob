package deob;

@ObfuscatedName("ic")
public class class237 implements Runnable {

    @ObfuscatedName("ic.p")
    public static class194 field3246 = new class194();

    @ObfuscatedName("ic.m")
    public static class194 field3241 = new class194();

    @ObfuscatedName("ic.e")
    public static int field3242 = 0;

    @ObfuscatedName("ic.w")
    public static Object field3240 = new Object();

    @ObfuscatedName("q.p(ILfk;Liw;I)V")
    public static void method52(int arg0, class161 arg1, class238 arg2) {
        class234 var3 = new class234();
        var3.field3212 = 1;
        var3.field2483 = (long) arg0;
        var3.field3213 = arg1;
        var3.field3214 = arg2;
        class194 var4 = field3246;
        synchronized (field3246) {
            field3246.method3270(var3);
        }
        Statics.method1870();
    }

    public void run() {
        try {
            while (true) {
                class194 var1 = field3246;
                class234 var2;
                synchronized (field3246) {
                    var2 = (class234) field3246.method3252();
                }
                if (var2 == null) {
                    class182.method2791(100L);
                    Object var10 = field3240;
                    synchronized (field3240) {
                        if (field3242 <= 1) {
                            field3242 = 0;
                            field3240.notifyAll();
                            return;
                        }
                        field3242--;
                    }
                } else {
                    if (var2.field3212 == 0) {
                        var2.field3213.method2686((int) var2.field2483, var2.field3211, var2.field3211.length);
                        class194 var4 = field3246;
                        synchronized (field3246) {
                            var2.method3234();
                        }
                    } else if (var2.field3212 == 1) {
                        var2.field3211 = var2.field3213.method2685((int) var2.field2483);
                        class194 var6 = field3246;
                        synchronized (field3246) {
                            field3241.method3270(var2);
                        }
                    }
                    Object var8 = field3240;
                    synchronized (field3240) {
                        if (field3242 <= 1) {
                            field3242 = 0;
                            field3240.notifyAll();
                            return;
                        }
                        field3242 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method40((String) null, var18);
        }
    }

    @ObfuscatedName("ie.e(B)V")
    public static void method4234() {
        Object var0 = field3240;
        synchronized (field3240) {
            if (field3242 != 0) {
                field3242 = 1;
                try {
                    field3240.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
