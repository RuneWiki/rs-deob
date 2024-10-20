package deob;

@ObfuscatedName("kg")
public class class287 implements Runnable {

    @ObfuscatedName("kg.i")
    public static class309 field3667 = new class309();

    @ObfuscatedName("kg.w")
    public static class309 field3662 = new class309();

    @ObfuscatedName("kg.s")
    public static int field3663 = 0;

    @ObfuscatedName("kg.a")
    public static Object field3664 = new Object();

    @ObfuscatedName("dm.i(ILmr;Lkd;B)V")
    public static void method2435(int arg0, class348 arg1, class288 arg2) {
        class286 var3 = new class286();
        var3.field3659 = 1;
        var3.field4075 = (long) arg0;
        var3.field3658 = arg1;
        var3.field3657 = arg2;
        class309 var4 = field3667;
        synchronized (field3667) {
            field3667.method4980(var3);
        }
        method1856();
    }

    @ObfuscatedName("lq.w(ILmr;Lkd;I)V")
    public static void method5296(int arg0, class348 arg1, class288 arg2) {
        byte[] var3 = null;
        class309 var4 = field3667;
        synchronized (field3667) {
            for (class286 var5 = (class286) field3667.method4981(); var5 != null; var5 = (class286) field3667.method4987()) {
                if ((long) arg0 == var5.field4075 && var5.field3658 == arg1 && var5.field3659 == 0) {
                    var3 = var5.field3656;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5641(arg0);
            arg2.method4715(arg1, arg0, var7, true);
        } else {
            arg2.method4715(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ie.s(B)V")
    public static void method4481() {
        while (true) {
            class309 var0 = field3667;
            class286 var1;
            synchronized (field3667) {
                var1 = (class286) field3662.method4994();
            }
            if (var1 == null) {
                return;
            }
            var1.field3657.method4715(var1.field3658, (int) var1.field4075, var1.field3656, false);
        }
    }

    @ObfuscatedName("bc.a(B)V")
    public static void method1856() {
        Object var0 = field3664;
        synchronized (field3664) {
            if (field3663 == 0) {
                Statics.field3665 = new Thread(new class287());
                Statics.field3665.setDaemon(true);
                Statics.field3665.start();
                Statics.field3665.setPriority(5);
            }
            field3663 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class309 var1 = field3667;
                class286 var2;
                synchronized (field3667) {
                    var2 = (class286) field3667.method4981();
                }
                if (var2 == null) {
                    class399.method2872(100L);
                    Object var10 = field3664;
                    synchronized (field3664) {
                        if (field3663 <= 1) {
                            field3663 = 0;
                            field3664.notifyAll();
                            return;
                        }
                        field3663--;
                    }
                } else {
                    if (var2.field3659 == 0) {
                        var2.field3658.method5652((int) var2.field4075, var2.field3656, var2.field3656.length);
                        class309 var4 = field3667;
                        synchronized (field3667) {
                            var2.method5752();
                        }
                    } else if (var2.field3659 == 1) {
                        var2.field3656 = var2.field3658.method5641((int) var2.field4075);
                        class309 var6 = field3667;
                        synchronized (field3667) {
                            field3662.method4980(var2);
                        }
                    }
                    Object var8 = field3664;
                    synchronized (field3664) {
                        if (field3663 <= 1) {
                            field3663 = 0;
                            field3664.notifyAll();
                            return;
                        }
                        field3663 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class425.method2652((String) null, var18);
        }
    }
}
