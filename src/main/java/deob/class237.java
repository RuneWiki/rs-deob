package deob;

@ObfuscatedName("it")
public class class237 implements Runnable {

    @ObfuscatedName("it.w")
    public static class194 field3230 = new class194();

    @ObfuscatedName("it.s")
    public static class194 field3228 = new class194();

    @ObfuscatedName("it.q")
    public static int field3229 = 0;

    @ObfuscatedName("it.o")
    public static Object field3232 = new Object();

    @ObfuscatedName("hc.w(I[BLfr;S)V")
    public static void method3853(int arg0, byte[] arg1, class161 arg2) {
        class234 var3 = new class234();
        var3.field3201 = 0;
        var3.field2464 = (long) arg0;
        var3.field3198 = arg1;
        var3.field3199 = arg2;
        class194 var4 = field3230;
        synchronized (field3230) {
            field3230.method3429(var3);
        }
        method2338();
    }

    @ObfuscatedName("j.s(ILfr;Lih;I)V")
    public static void method128(int arg0, class161 arg1, class238 arg2) {
        class234 var3 = new class234();
        var3.field3201 = 1;
        var3.field2464 = (long) arg0;
        var3.field3199 = arg1;
        var3.field3200 = arg2;
        class194 var4 = field3230;
        synchronized (field3230) {
            field3230.method3429(var3);
        }
        method2338();
    }

    @ObfuscatedName("r.q(ILfr;Lih;I)V")
    public static void method163(int arg0, class161 arg1, class238 arg2) {
        byte[] var3 = null;
        class194 var4 = field3230;
        synchronized (field3230) {
            for (class234 var5 = (class234) field3230.method3427(); var5 != null; var5 = (class234) field3230.method3435()) {
                if ((long) arg0 == var5.field2464 && var5.field3199 == arg1 && var5.field3201 == 0) {
                    var3 = var5.field3198;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2814(arg0);
            arg2.method3981(arg1, arg0, var7, true);
        } else {
            arg2.method3981(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("gu.o(B)V")
    public static void method3628() {
        while (true) {
            class194 var0 = field3230;
            class234 var1;
            synchronized (field3230) {
                var1 = (class234) field3228.method3432();
            }
            if (var1 == null) {
                return;
            }
            var1.field3200.method3981(var1.field3199, (int) var1.field2464, var1.field3198, false);
        }
    }

    @ObfuscatedName("dg.g(B)V")
    public static void method2338() {
        Object var0 = field3232;
        synchronized (field3232) {
            if (field3229 == 0) {
                Statics.field2836 = new Thread(new class237());
                Statics.field2836.setDaemon(true);
                Statics.field2836.start();
                Statics.field2836.setPriority(5);
            }
            field3229 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class194 var1 = field3230;
                class234 var2;
                synchronized (field3230) {
                    var2 = (class234) field3230.method3427();
                }
                if (var2 == null) {
                    class182.method1687(100L);
                    Object var10 = field3232;
                    synchronized (field3232) {
                        if (field3229 <= 1) {
                            field3229 = 0;
                            field3232.notifyAll();
                            return;
                        }
                        field3229--;
                    }
                } else {
                    if (var2.field3201 == 0) {
                        var2.field3199.method2812((int) var2.field2464, var2.field3198, var2.field3198.length);
                        class194 var4 = field3230;
                        synchronized (field3230) {
                            var2.method3425();
                        }
                    } else if (var2.field3201 == 1) {
                        var2.field3198 = var2.field3199.method2814((int) var2.field2464);
                        class194 var6 = field3230;
                        synchronized (field3230) {
                            field3228.method3429(var2);
                        }
                    }
                    Object var8 = field3232;
                    synchronized (field3232) {
                        if (field3229 <= 1) {
                            field3229 = 0;
                            field3232.notifyAll();
                            return;
                        }
                        field3229 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method611((String) null, var18);
        }
    }
}
