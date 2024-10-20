package deob;

@ObfuscatedName("ik")
public class class236 implements Runnable {

    @ObfuscatedName("ik.c")
    public static class263 field3153 = new class263();

    @ObfuscatedName("ik.o")
    public static class263 field3152 = new class263();

    @ObfuscatedName("ik.e")
    public static int field3151 = 0;

    @ObfuscatedName("ik.i")
    public static Object field3154 = new Object();

    @ObfuscatedName("fx.c(I[BLky;B)V")
    public static void method3208(int arg0, byte[] arg1, class309 arg2) {
        class233 var3 = new class233();
        var3.field3123 = 0;
        var3.field2115 = (long) arg0;
        var3.field3122 = arg1;
        var3.field3124 = arg2;
        class263 var4 = field3153;
        synchronized (field3153) {
            field3153.method4545(var3);
        }
        Object var6 = field3154;
        synchronized (field3154) {
            if (field3151 == 0) {
                Statics.field2716 = new Thread(new class236());
                Statics.field2716.setDaemon(true);
                Statics.field2716.start();
                Statics.field2716.setPriority(5);
            }
            field3151 = 600;
        }
    }

    @ObfuscatedName("fe.t(ILky;Lia;I)V")
    public static void method3298(int arg0, class309 arg1, class237 arg2) {
        byte[] var3 = null;
        class263 var4 = field3153;
        synchronized (field3153) {
            for (class233 var5 = (class233) field3153.method4543(); var5 != null; var5 = (class233) field3153.method4564()) {
                if ((long) arg0 == var5.field2115 && var5.field3124 == arg1 && var5.field3123 == 0) {
                    var3 = var5.field3122;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5440(arg0);
            arg2.method3966(arg1, arg0, var7, true);
        } else {
            arg2.method3966(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("bj.o(I)V")
    public static void method1684() {
        while (true) {
            class263 var0 = field3153;
            class233 var1;
            synchronized (field3153) {
                var1 = (class233) field3152.method4548();
            }
            if (var1 == null) {
                return;
            }
            var1.field3125.method3966(var1.field3124, (int) var1.field2115, var1.field3122, false);
        }
    }

    @ObfuscatedName("fe.e(I)V")
    public static void method3280() {
        Object var0 = field3154;
        synchronized (field3154) {
            if (field3151 == 0) {
                Statics.field2716 = new Thread(new class236());
                Statics.field2716.setDaemon(true);
                Statics.field2716.start();
                Statics.field2716.setPriority(5);
            }
            field3151 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class263 var1 = field3153;
                class233 var2;
                synchronized (field3153) {
                    var2 = (class233) field3153.method4543();
                }
                if (var2 == null) {
                    class299.method4884(100L);
                    Object var10 = field3154;
                    synchronized (field3154) {
                        if (field3151 <= 1) {
                            field3151 = 0;
                            field3154.notifyAll();
                            return;
                        }
                        field3151--;
                    }
                } else {
                    if (var2.field3123 == 0) {
                        var2.field3124.method5436((int) var2.field2115, var2.field3122, var2.field3122.length);
                        class263 var4 = field3153;
                        synchronized (field3153) {
                            var2.method3351();
                        }
                    } else if (var2.field3123 == 1) {
                        var2.field3122 = var2.field3124.method5440((int) var2.field2115);
                        class263 var6 = field3153;
                        synchronized (field3153) {
                            field3152.method4545(var2);
                        }
                    }
                    Object var8 = field3154;
                    synchronized (field3154) {
                        if (field3151 <= 1) {
                            field3151 = 0;
                            field3154.notifyAll();
                            return;
                        }
                        field3151 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method3817((String) null, var18);
        }
    }
}
