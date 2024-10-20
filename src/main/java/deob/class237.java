package deob;

@ObfuscatedName("ih")
public class class237 implements Runnable {

    @ObfuscatedName("ih.i")
    public static class194 field3248 = new class194();

    @ObfuscatedName("ih.w")
    public static class194 field3243 = new class194();

    @ObfuscatedName("ih.a")
    public static int field3244 = 0;

    @ObfuscatedName("ih.s")
    public static Object field3245 = new Object();

    @ObfuscatedName("jm.i(ILfv;Lix;I)V")
    public static void method4489(int arg0, class161 arg1, class238 arg2) {
        class234 var3 = new class234();
        var3.field3214 = 1;
        var3.field2473 = (long) arg0;
        var3.field3210 = arg1;
        var3.field3211 = arg2;
        class194 var4 = field3248;
        synchronized (field3248) {
            field3248.method3322(var3);
        }
        method559();
    }

    @ObfuscatedName("r.w(ILfv;Lix;I)V")
    public static void method20(int arg0, class161 arg1, class238 arg2) {
        byte[] var3 = null;
        class194 var4 = field3248;
        synchronized (field3248) {
            for (class234 var5 = (class234) field3248.method3303(); var5 != null; var5 = (class234) field3248.method3297()) {
                if ((long) arg0 == var5.field2473 && var5.field3210 == arg1 && var5.field3214 == 0) {
                    var3 = var5.field3216;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2734(arg0);
            arg2.method3873(arg1, arg0, var7, true);
        } else {
            arg2.method3873(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("am.a(B)V")
    public static void method559() {
        Object var0 = field3245;
        synchronized (field3245) {
            if (field3244 == 0) {
                Statics.field3246 = new Thread(new class237());
                Statics.field3246.setDaemon(true);
                Statics.field3246.start();
                Statics.field3246.setPriority(5);
            }
            field3244 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class194 var1 = field3248;
                class234 var2;
                synchronized (field3248) {
                    var2 = (class234) field3248.method3303();
                }
                if (var2 == null) {
                    class182.method1004(100L);
                    Object var10 = field3245;
                    synchronized (field3245) {
                        if (field3244 <= 1) {
                            field3244 = 0;
                            field3245.notifyAll();
                            return;
                        }
                        field3244--;
                    }
                } else {
                    if (var2.field3214 == 0) {
                        var2.field3210.method2739((int) var2.field2473, var2.field3216, var2.field3216.length);
                        class194 var4 = field3248;
                        synchronized (field3248) {
                            var2.method3290();
                        }
                    } else if (var2.field3214 == 1) {
                        var2.field3216 = var2.field3210.method2734((int) var2.field2473);
                        class194 var6 = field3248;
                        synchronized (field3248) {
                            field3243.method3322(var2);
                        }
                    }
                    Object var8 = field3245;
                    synchronized (field3245) {
                        if (field3244 <= 1) {
                            field3244 = 0;
                            field3245.notifyAll();
                            return;
                        }
                        field3244 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method2658((String) null, var18);
        }
    }
}
