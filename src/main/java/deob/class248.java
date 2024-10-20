package deob;

@ObfuscatedName("ij")
public class class248 implements Runnable {

    @ObfuscatedName("ij.n")
    public static class205 field3330 = new class205();

    @ObfuscatedName("ij.v")
    public static class205 field3332 = new class205();

    @ObfuscatedName("ij.y")
    public static int field3329 = 0;

    @ObfuscatedName("ij.r")
    public static Object field3331 = new Object();

    @ObfuscatedName("fj.n(I[BLfv;B)V")
    public static void method2931(int arg0, byte[] arg1, class165 arg2) {
        class245 var3 = new class245();
        var3.field3298 = 0;
        var3.field2597 = (long) arg0;
        var3.field3300 = arg1;
        var3.field3299 = arg2;
        class205 var4 = field3330;
        synchronized (field3330) {
            field3330.method3482(var3);
        }
        method168();
    }

    @ObfuscatedName("fu.v(ILfv;Lif;I)V")
    public static void method2859(int arg0, class165 arg1, class249 arg2) {
        class245 var3 = new class245();
        var3.field3298 = 1;
        var3.field2597 = (long) arg0;
        var3.field3299 = arg1;
        var3.field3301 = arg2;
        class205 var4 = field3330;
        synchronized (field3330) {
            field3330.method3482(var3);
        }
        method168();
    }

    @ObfuscatedName("fp.y(ILfv;Lif;I)V")
    public static void method2871(int arg0, class165 arg1, class249 arg2) {
        byte[] var3 = null;
        class205 var4 = field3330;
        synchronized (field3330) {
            for (class245 var5 = (class245) field3330.method3492(); var5 != null; var5 = (class245) field3330.method3481()) {
                if ((long) arg0 == var5.field2597 && var5.field3299 == arg1 && var5.field3298 == 0) {
                    var3 = var5.field3300;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2863(arg0);
            arg2.method4028(arg1, arg0, var7, true);
        } else {
            arg2.method4028(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("er.r(B)V")
    public static void method2698() {
        while (true) {
            class205 var0 = field3330;
            class245 var1;
            synchronized (field3330) {
                var1 = (class245) field3332.method3485();
            }
            if (var1 == null) {
                return;
            }
            var1.field3301.method4028(var1.field3299, (int) var1.field2597, var1.field3300, false);
        }
    }

    @ObfuscatedName("q.h(I)V")
    public static void method168() {
        Object var0 = field3331;
        synchronized (field3331) {
            if (field3329 == 0) {
                Statics.field3333 = new Thread(new class248());
                Statics.field3333.setDaemon(true);
                Statics.field3333.start();
                Statics.field3333.setPriority(5);
            }
            field3329 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class205 var1 = field3330;
                class245 var2;
                synchronized (field3330) {
                    var2 = (class245) field3330.method3492();
                }
                if (var2 == null) {
                    class193.method980(100L);
                    Object var10 = field3331;
                    synchronized (field3331) {
                        if (field3329 <= 1) {
                            field3329 = 0;
                            field3331.notifyAll();
                            return;
                        }
                        field3329--;
                    }
                } else {
                    if (var2.field3298 == 0) {
                        var2.field3299.method2862((int) var2.field2597, var2.field3300, var2.field3300.length);
                        class205 var4 = field3330;
                        synchronized (field3330) {
                            var2.method3474();
                        }
                    } else if (var2.field3298 == 1) {
                        var2.field3300 = var2.field3299.method2863((int) var2.field2597);
                        class205 var6 = field3330;
                        synchronized (field3330) {
                            field3332.method3482(var2);
                        }
                    }
                    Object var8 = field3331;
                    synchronized (field3331) {
                        if (field3329 <= 1) {
                            field3329 = 0;
                            field3331.notifyAll();
                            return;
                        }
                        field3329 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class155.method4721((String) null, var18);
        }
    }
}
