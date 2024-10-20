package deob;

@ObfuscatedName("ip")
public class class245 implements Runnable {

    @ObfuscatedName("ip.z")
    public static class272 field3178 = new class272();

    @ObfuscatedName("ip.k")
    public static class272 field3179 = new class272();

    @ObfuscatedName("ip.s")
    public static int field3180 = 0;

    @ObfuscatedName("ip.i")
    public static Object field3181 = new Object();

    @ObfuscatedName("hk.z(I[BLlz;I)V")
    public static void method3693(int arg0, byte[] arg1, class318 arg2) {
        class242 var3 = new class242();
        var3.field3155 = 0;
        var3.field2157 = (long) arg0;
        var3.field3152 = arg1;
        var3.field3154 = arg2;
        class272 var4 = field3178;
        synchronized (field3178) {
            field3178.method4616(var3);
        }
        method341();
    }

    @ObfuscatedName("et.k(ILlz;Liw;B)V")
    public static void method3141(int arg0, class318 arg1, class246 arg2) {
        class242 var3 = new class242();
        var3.field3155 = 1;
        var3.field2157 = (long) arg0;
        var3.field3154 = arg1;
        var3.field3153 = arg2;
        class272 var4 = field3178;
        synchronized (field3178) {
            field3178.method4616(var3);
        }
        method341();
    }

    @ObfuscatedName("ar.t(I)V")
    public static void method341() {
        Object var0 = field3181;
        synchronized (field3181) {
            if (field3180 == 0) {
                Statics.field2543 = new Thread(new class245());
                Statics.field2543.setDaemon(true);
                Statics.field2543.start();
                Statics.field2543.setPriority(5);
            }
            field3180 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class272 var1 = field3178;
                class242 var2;
                synchronized (field3178) {
                    var2 = (class242) field3178.method4621();
                }
                if (var2 == null) {
                    class308.method3834(100L);
                    Object var10 = field3181;
                    synchronized (field3181) {
                        if (field3180 <= 1) {
                            field3180 = 0;
                            field3181.notifyAll();
                            return;
                        }
                        field3180--;
                    }
                } else {
                    if (var2.field3155 == 0) {
                        var2.field3154.method5523((int) var2.field2157, var2.field3152, var2.field3152.length);
                        class272 var4 = field3178;
                        synchronized (field3178) {
                            var2.method3401();
                        }
                    } else if (var2.field3155 == 1) {
                        var2.field3152 = var2.field3154.method5522((int) var2.field2157);
                        class272 var6 = field3178;
                        synchronized (field3178) {
                            field3179.method4616(var2);
                        }
                    }
                    Object var8 = field3181;
                    synchronized (field3181) {
                        if (field3180 <= 1) {
                            field3180 = 0;
                            field3181.notifyAll();
                            return;
                        }
                        field3180 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class351.method2420((String) null, var18);
        }
    }
}
