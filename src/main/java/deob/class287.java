package deob;

@ObfuscatedName("ke")
public class class287 implements Runnable {

    @ObfuscatedName("ke.n")
    public static class309 field3675 = new class309();

    @ObfuscatedName("ke.c")
    public static class309 field3682 = new class309();

    @ObfuscatedName("ke.m")
    public static int field3677 = 0;

    @ObfuscatedName("ke.k")
    public static Object field3678 = new Object();

    @ObfuscatedName("fm.n(ILms;Lkx;S)V")
    public static void method3391(int arg0, class347 arg1, class288 arg2) {
        byte[] var3 = null;
        class309 var4 = field3675;
        synchronized (field3675) {
            for (class286 var5 = (class286) field3675.method4962(); var5 != null; var5 = (class286) field3675.method4985()) {
                if ((long) arg0 == var5.field4056 && var5.field3672 == arg1 && var5.field3674 == 0) {
                    var3 = var5.field3671;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5617(arg0);
            arg2.method4670(arg1, arg0, var7, true);
        } else {
            arg2.method4670(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("dc.c(I)V")
    public static void method2366() {
        Object var0 = field3678;
        synchronized (field3678) {
            if (field3677 == 0) {
                Statics.field3676 = new Thread(new class287());
                Statics.field3676.setDaemon(true);
                Statics.field3676.start();
                Statics.field3676.setPriority(5);
            }
            field3677 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class309 var1 = field3675;
                class286 var2;
                synchronized (field3675) {
                    var2 = (class286) field3675.method4962();
                }
                if (var2 == null) {
                    class398.method4655(100L);
                    Object var10 = field3678;
                    synchronized (field3678) {
                        if (field3677 <= 1) {
                            field3677 = 0;
                            field3678.notifyAll();
                            return;
                        }
                        field3677--;
                    }
                } else {
                    if (var2.field3674 == 0) {
                        var2.field3672.method5618((int) var2.field4056, var2.field3671, var2.field3671.length);
                        class309 var4 = field3675;
                        synchronized (field3675) {
                            var2.method5732();
                        }
                    } else if (var2.field3674 == 1) {
                        var2.field3671 = var2.field3672.method5617((int) var2.field4056);
                        class309 var6 = field3675;
                        synchronized (field3675) {
                            field3682.method4986(var2);
                        }
                    }
                    Object var8 = field3678;
                    synchronized (field3678) {
                        if (field3677 <= 1) {
                            field3677 = 0;
                            field3678.notifyAll();
                            return;
                        }
                        field3677 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class424.method21((String) null, var18);
        }
    }
}
