package deob;

@ObfuscatedName("ie")
public class class237 implements Runnable {

    @ObfuscatedName("ie.d")
    public static class194 field3221 = new class194();

    @ObfuscatedName("ie.q")
    public static class194 field3215 = new class194();

    @ObfuscatedName("ie.x")
    public static int field3217 = 0;

    @ObfuscatedName("ie.y")
    public static Object field3214 = new Object();

    @ObfuscatedName("fh.d(ILfv;Lib;B)V")
    public static void method2880(int arg0, class161 arg1, class238 arg2) {
        class234 var3 = new class234();
        var3.field3181 = 1;
        var3.field2441 = (long) arg0;
        var3.field3186 = arg1;
        var3.field3183 = arg2;
        class194 var4 = field3221;
        synchronized (field3221) {
            field3221.method3318(var3);
        }
        Object var6 = field3214;
        synchronized (field3214) {
            if (field3217 == 0) {
                Statics.field3218 = new Thread(new class237());
                Statics.field3218.setDaemon(true);
                Statics.field3218.start();
                Statics.field3218.setPriority(5);
            }
            field3217 = 600;
        }
    }

    @ObfuscatedName("bt.q(ILfv;Lib;S)V")
    public static void method994(int arg0, class161 arg1, class238 arg2) {
        byte[] var3 = null;
        class194 var4 = field3221;
        synchronized (field3221) {
            for (class234 var5 = (class234) field3221.method3323(); var5 != null; var5 = (class234) field3221.method3325()) {
                if ((long) arg0 == var5.field2441 && var5.field3186 == arg1 && var5.field3181 == 0) {
                    var3 = var5.field3182;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2760(arg0);
            arg2.method3864(arg1, arg0, var7, true);
        } else {
            arg2.method3864(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class194 var1 = field3221;
                class234 var2;
                synchronized (field3221) {
                    var2 = (class234) field3221.method3323();
                }
                if (var2 == null) {
                    class182.method2253(100L);
                    Object var10 = field3214;
                    synchronized (field3214) {
                        if (field3217 <= 1) {
                            field3217 = 0;
                            field3214.notifyAll();
                            return;
                        }
                        field3217--;
                    }
                } else {
                    if (var2.field3181 == 0) {
                        var2.field3186.method2761((int) var2.field2441, var2.field3182, var2.field3182.length);
                        class194 var4 = field3221;
                        synchronized (field3221) {
                            var2.method3312();
                        }
                    } else if (var2.field3181 == 1) {
                        var2.field3182 = var2.field3186.method2760((int) var2.field2441);
                        class194 var6 = field3221;
                        synchronized (field3221) {
                            field3215.method3318(var2);
                        }
                    }
                    Object var8 = field3214;
                    synchronized (field3214) {
                        if (field3217 <= 1) {
                            field3217 = 0;
                            field3214.notifyAll();
                            return;
                        }
                        field3217 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method158((String) null, var18);
        }
    }

    @ObfuscatedName("hk.x(B)V")
    public static void method3739() {
        Object var0 = field3214;
        synchronized (field3214) {
            if (field3217 != 0) {
                field3217 = 1;
                try {
                    field3214.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
