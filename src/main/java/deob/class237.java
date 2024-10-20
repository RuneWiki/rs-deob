package deob;

@ObfuscatedName("ig")
public class class237 implements Runnable {

    @ObfuscatedName("ig.i")
    public static class194 field3227 = new class194();

    @ObfuscatedName("ig.h")
    public static class194 field3225 = new class194();

    @ObfuscatedName("ig.u")
    public static int field3228 = 0;

    @ObfuscatedName("ig.q")
    public static Object field3226 = new Object();

    @ObfuscatedName("fc.i(ILfr;Lin;B)V")
    public static void method2839(int arg0, class161 arg1, class238 arg2) {
        class234 var3 = new class234();
        var3.field3191 = 1;
        var3.field2467 = (long) arg0;
        var3.field3193 = arg1;
        var3.field3194 = arg2;
        class194 var4 = field3227;
        synchronized (field3227) {
            field3227.method3371(var3);
        }
        method2914();
    }

    @ObfuscatedName("ap.h(ILfr;Lin;I)V")
    public static void method566(int arg0, class161 arg1, class238 arg2) {
        byte[] var3 = null;
        class194 var4 = field3227;
        synchronized (field3227) {
            for (class234 var5 = (class234) field3227.method3376(); var5 != null; var5 = (class234) field3227.method3377()) {
                if ((long) arg0 == var5.field2467 && var5.field3193 == arg1 && var5.field3191 == 0) {
                    var3 = var5.field3192;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2794(arg0);
            arg2.method3954(arg1, arg0, var7, true);
        } else {
            arg2.method3954(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("aq.u(B)V")
    public static void method233() {
        while (true) {
            class194 var0 = field3227;
            class234 var1;
            synchronized (field3227) {
                var1 = (class234) field3225.method3374();
            }
            if (var1 == null) {
                return;
            }
            var1.field3194.method3954(var1.field3193, (int) var1.field2467, var1.field3192, false);
        }
    }

    @ObfuscatedName("fh.q(I)V")
    public static void method2914() {
        Object var0 = field3226;
        synchronized (field3226) {
            if (field3228 == 0) {
                Statics.field880 = new Thread(new class237());
                Statics.field880.setDaemon(true);
                Statics.field880.start();
                Statics.field880.setPriority(5);
            }
            field3228 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class194 var1 = field3227;
                class234 var2;
                synchronized (field3227) {
                    var2 = (class234) field3227.method3376();
                }
                if (var2 == null) {
                    class182.method138(100L);
                    Object var10 = field3226;
                    synchronized (field3226) {
                        if (field3228 <= 1) {
                            field3228 = 0;
                            field3226.notifyAll();
                            return;
                        }
                        field3228--;
                    }
                } else {
                    if (var2.field3191 == 0) {
                        var2.field3193.method2803((int) var2.field2467, var2.field3192, var2.field3192.length);
                        class194 var4 = field3227;
                        synchronized (field3227) {
                            var2.method3364();
                        }
                    } else if (var2.field3191 == 1) {
                        var2.field3192 = var2.field3193.method2794((int) var2.field2467);
                        class194 var6 = field3227;
                        synchronized (field3227) {
                            field3225.method3371(var2);
                        }
                    }
                    Object var8 = field3226;
                    synchronized (field3226) {
                        if (field3228 <= 1) {
                            field3228 = 0;
                            field3226.notifyAll();
                            return;
                        }
                        field3228 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method3831((String) null, var18);
        }
    }

    @ObfuscatedName("ge.g(I)V")
    public static void method3641() {
        Object var0 = field3226;
        synchronized (field3226) {
            if (field3228 != 0) {
                field3228 = 1;
                try {
                    field3226.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
