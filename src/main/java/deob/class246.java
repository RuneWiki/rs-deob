package deob;

@ObfuscatedName("ij")
public class class246 implements Runnable {

    @ObfuscatedName("ij.h")
    public static class273 field3178 = new class273();

    @ObfuscatedName("ij.v")
    public static class273 field3180 = new class273();

    @ObfuscatedName("ij.x")
    public static int field3179 = 0;

    @ObfuscatedName("ij.w")
    public static Object field3181 = new Object();

    @ObfuscatedName("bs.h(I[BLlx;I)V")
    public static void method751(int arg0, byte[] arg1, class319 arg2) {
        class243 var3 = new class243();
        var3.field3150 = 0;
        var3.field2138 = (long) arg0;
        var3.field3146 = arg1;
        var3.field3147 = arg2;
        class273 var4 = field3178;
        synchronized (field3178) {
            field3178.method4549(var3);
        }
        Object var6 = field3181;
        synchronized (field3181) {
            if (field3179 == 0) {
                Statics.field1248 = new Thread(new class246());
                Statics.field1248.setDaemon(true);
                Statics.field1248.start();
                Statics.field1248.setPriority(5);
            }
            field3179 = 600;
        }
    }

    @ObfuscatedName("hp.v(ILlx;Lil;I)V")
    public static void method3794(int arg0, class319 arg1, class247 arg2) {
        class243 var3 = new class243();
        var3.field3150 = 1;
        var3.field2138 = (long) arg0;
        var3.field3147 = arg1;
        var3.field3148 = arg2;
        class273 var4 = field3178;
        synchronized (field3178) {
            field3178.method4549(var3);
        }
        Object var6 = field3181;
        synchronized (field3181) {
            if (field3179 == 0) {
                Statics.field1248 = new Thread(new class246());
                Statics.field1248.setDaemon(true);
                Statics.field1248.start();
                Statics.field1248.setPriority(5);
            }
            field3179 = 600;
        }
    }

    @ObfuscatedName("az.x(B)V")
    public static void method703() {
        while (true) {
            class273 var0 = field3178;
            class243 var1;
            synchronized (field3178) {
                var1 = (class243) field3180.method4541();
            }
            if (var1 == null) {
                return;
            }
            var1.field3148.method3946(var1.field3147, (int) var1.field2138, var1.field3146, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class273 var1 = field3178;
                class243 var2;
                synchronized (field3178) {
                    var2 = (class243) field3178.method4540();
                }
                if (var2 == null) {
                    class309.method3812(100L);
                    Object var10 = field3181;
                    synchronized (field3181) {
                        if (field3179 <= 1) {
                            field3179 = 0;
                            field3181.notifyAll();
                            return;
                        }
                        field3179--;
                    }
                } else {
                    if (var2.field3150 == 0) {
                        var2.field3147.method5436((int) var2.field2138, var2.field3146, var2.field3146.length);
                        class273 var4 = field3178;
                        synchronized (field3178) {
                            var2.method3359();
                        }
                    } else if (var2.field3150 == 1) {
                        var2.field3146 = var2.field3147.method5442((int) var2.field2138);
                        class273 var6 = field3178;
                        synchronized (field3178) {
                            field3180.method4549(var2);
                        }
                    }
                    Object var8 = field3181;
                    synchronized (field3181) {
                        if (field3179 <= 1) {
                            field3179 = 0;
                            field3181.notifyAll();
                            return;
                        }
                        field3179 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class352.method3694((String) null, var18);
        }
    }
}
