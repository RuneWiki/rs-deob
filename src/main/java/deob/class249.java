package deob;

@ObfuscatedName("ih")
public class class249 implements Runnable {

    @ObfuscatedName("ih.w")
    public static class206 field3197 = new class206();

    @ObfuscatedName("ih.m")
    public static class206 field3194 = new class206();

    @ObfuscatedName("ih.q")
    public static int field3192 = 0;

    @ObfuscatedName("ih.b")
    public static Object field3195 = new Object();

    @ObfuscatedName("cn.w(I[BLff;I)V")
    public static void method1765(int arg0, byte[] arg1, class163 arg2) {
        class246 var3 = new class246();
        var3.field3164 = 0;
        var3.field2450 = (long) arg0;
        var3.field3166 = arg1;
        var3.field3165 = arg2;
        class206 var4 = field3197;
        synchronized (field3197) {
            field3197.method3810(var3);
        }
        method3068();
    }

    @ObfuscatedName("dy.m(ILff;Lic;B)V")
    public static void method2862(int arg0, class163 arg1, class250 arg2) {
        class246 var3 = new class246();
        var3.field3164 = 1;
        var3.field2450 = (long) arg0;
        var3.field3165 = arg1;
        var3.field3163 = arg2;
        class206 var4 = field3197;
        synchronized (field3197) {
            field3197.method3810(var3);
        }
        method3068();
    }

    @ObfuscatedName("fz.q(I)V")
    public static void method3068() {
        Object var0 = field3195;
        synchronized (field3195) {
            if (field3192 == 0) {
                Statics.field3196 = new Thread(new class249());
                Statics.field3196.setDaemon(true);
                Statics.field3196.start();
                Statics.field3196.setPriority(5);
            }
            field3192 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class206 var1 = field3197;
                class246 var2;
                synchronized (field3197) {
                    var2 = (class246) field3197.method3797();
                }
                if (var2 == null) {
                    class192.method196(100L);
                    Object var10 = field3195;
                    synchronized (field3195) {
                        if (field3192 <= 1) {
                            field3192 = 0;
                            field3195.notifyAll();
                            return;
                        }
                        field3192--;
                    }
                } else {
                    if (var2.field3164 == 0) {
                        var2.field3165.method3086((int) var2.field2450, var2.field3166, var2.field3166.length);
                        class206 var4 = field3197;
                        synchronized (field3197) {
                            var2.method3782();
                        }
                    } else if (var2.field3164 == 1) {
                        var2.field3166 = var2.field3165.method3085((int) var2.field2450);
                        class206 var6 = field3197;
                        synchronized (field3197) {
                            field3194.method3810(var2);
                        }
                    }
                    Object var8 = field3195;
                    synchronized (field3195) {
                        if (field3192 <= 1) {
                            field3192 = 0;
                            field3195.notifyAll();
                            return;
                        }
                        field3192 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method695((String) null, var18);
        }
    }
}
