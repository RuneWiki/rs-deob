package deob;

@ObfuscatedName("ks")
public class class287 implements Runnable {

    @ObfuscatedName("ks.l")
    public static class309 field3674 = new class309();

    @ObfuscatedName("ks.q")
    public static class309 field3673 = new class309();

    @ObfuscatedName("ks.f")
    public static int field3672 = 0;

    @ObfuscatedName("ks.j")
    public static Object field3675 = new Object();

    @ObfuscatedName("ed.l(I[BLmm;I)V")
    public static void method2626(int arg0, byte[] arg1, class348 arg2) {
        class286 var3 = new class286();
        var3.field3671 = 0;
        var3.field4075 = (long) arg0;
        var3.field3667 = arg1;
        var3.field3668 = arg2;
        class309 var4 = field3674;
        synchronized (field3674) {
            field3674.method5015(var3);
        }
        Object var6 = field3675;
        synchronized (field3675) {
            if (field3672 == 0) {
                Statics.field3202 = new Thread(new class287());
                Statics.field3202.setDaemon(true);
                Statics.field3202.start();
                Statics.field3202.setPriority(5);
            }
            field3672 = 600;
        }
    }

    @ObfuscatedName("ee.q(ILmm;Lky;I)V")
    public static void method2506(int arg0, class348 arg1, class288 arg2) {
        class286 var3 = new class286();
        var3.field3671 = 1;
        var3.field4075 = (long) arg0;
        var3.field3668 = arg1;
        var3.field3670 = arg2;
        class309 var4 = field3674;
        synchronized (field3674) {
            field3674.method5015(var3);
        }
        Object var6 = field3675;
        synchronized (field3675) {
            if (field3672 == 0) {
                Statics.field3202 = new Thread(new class287());
                Statics.field3202.setDaemon(true);
                Statics.field3202.start();
                Statics.field3202.setPriority(5);
            }
            field3672 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class309 var1 = field3674;
                class286 var2;
                synchronized (field3674) {
                    var2 = (class286) field3674.method5035();
                }
                if (var2 == null) {
                    class399.method2395(100L);
                    Object var10 = field3675;
                    synchronized (field3675) {
                        if (field3672 <= 1) {
                            field3672 = 0;
                            field3675.notifyAll();
                            return;
                        }
                        field3672--;
                    }
                } else {
                    if (var2.field3671 == 0) {
                        var2.field3668.method5664((int) var2.field4075, var2.field3667, var2.field3667.length);
                        class309 var4 = field3674;
                        synchronized (field3674) {
                            var2.method5775();
                        }
                    } else if (var2.field3671 == 1) {
                        var2.field3667 = var2.field3668.method5663((int) var2.field4075);
                        class309 var6 = field3674;
                        synchronized (field3674) {
                            field3673.method5015(var2);
                        }
                    }
                    Object var8 = field3675;
                    synchronized (field3675) {
                        if (field3672 <= 1) {
                            field3672 = 0;
                            field3675.notifyAll();
                            return;
                        }
                        field3672 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class425.method5430((String) null, var18);
        }
    }
}
