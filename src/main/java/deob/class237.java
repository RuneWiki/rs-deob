package deob;

@ObfuscatedName("ia")
public class class237 implements Runnable {

    @ObfuscatedName("ia.i")
    public static class194 field3239 = new class194();

    @ObfuscatedName("ia.c")
    public static class194 field3236 = new class194();

    @ObfuscatedName("ia.e")
    public static int field3237 = 0;

    @ObfuscatedName("ia.v")
    public static Object field3235 = new Object();

    @ObfuscatedName("bd.i(ILff;Lin;I)V")
    public static void method989(int arg0, class161 arg1, class238 arg2) {
        class234 var3 = new class234();
        var3.field3208 = 1;
        var3.field2480 = (long) arg0;
        var3.field3200 = arg1;
        var3.field3201 = arg2;
        class194 var4 = field3239;
        synchronized (field3239) {
            field3239.method3289(var3);
        }
        Object var6 = field3235;
        synchronized (field3235) {
            if (field3237 == 0) {
                Statics.field1677 = new Thread(new class237());
                Statics.field1677.setDaemon(true);
                Statics.field1677.start();
                Statics.field1677.setPriority(5);
            }
            field3237 = 600;
        }
    }

    @ObfuscatedName("fl.c(ILff;Lin;I)V")
    public static void method2713(int arg0, class161 arg1, class238 arg2) {
        byte[] var3 = null;
        class194 var4 = field3239;
        synchronized (field3239) {
            for (class234 var5 = (class234) field3239.method3294(); var5 != null; var5 = (class234) field3239.method3296()) {
                if ((long) arg0 == var5.field2480 && var5.field3200 == arg1 && var5.field3208 == 0) {
                    var3 = var5.field3199;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2743(arg0);
            arg2.method3882(arg1, arg0, var7, true);
        } else {
            arg2.method3882(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("hg.e(B)V")
    public static void method3761() {
        while (true) {
            class194 var0 = field3239;
            class234 var1;
            synchronized (field3239) {
                var1 = (class234) field3236.method3313();
            }
            if (var1 == null) {
                return;
            }
            var1.field3201.method3882(var1.field3200, (int) var1.field2480, var1.field3199, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class194 var1 = field3239;
                class234 var2;
                synchronized (field3239) {
                    var2 = (class234) field3239.method3294();
                }
                if (var2 == null) {
                    class182.method10(100L);
                    Object var10 = field3235;
                    synchronized (field3235) {
                        if (field3237 <= 1) {
                            field3237 = 0;
                            field3235.notifyAll();
                            return;
                        }
                        field3237--;
                    }
                } else {
                    if (var2.field3208 == 0) {
                        var2.field3200.method2744((int) var2.field2480, var2.field3199, var2.field3199.length);
                        class194 var4 = field3239;
                        synchronized (field3239) {
                            var2.method3278();
                        }
                    } else if (var2.field3208 == 1) {
                        var2.field3199 = var2.field3200.method2743((int) var2.field2480);
                        class194 var6 = field3239;
                        synchronized (field3239) {
                            field3236.method3289(var2);
                        }
                    }
                    Object var8 = field3235;
                    synchronized (field3235) {
                        if (field3237 <= 1) {
                            field3237 = 0;
                            field3235.notifyAll();
                            return;
                        }
                        field3237 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method131((String) null, var18);
        }
    }
}
