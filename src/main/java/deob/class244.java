package deob;

@ObfuscatedName("ih")
public class class244 implements Runnable {

    @ObfuscatedName("ih.m")
    public static class201 field3298 = new class201();

    @ObfuscatedName("ih.p")
    public static class201 field3296 = new class201();

    @ObfuscatedName("ih.i")
    public static int field3297 = 0;

    @ObfuscatedName("ih.j")
    public static Object field3301 = new Object();

    @ObfuscatedName("an.m(I[BLfe;I)V")
    public static void method502(int arg0, byte[] arg1, class162 arg2) {
        class241 var3 = new class241();
        var3.field3268 = 0;
        var3.field2563 = (long) arg0;
        var3.field3266 = arg1;
        var3.field3267 = arg2;
        class201 var4 = field3298;
        synchronized (field3298) {
            field3298.method3480(var3);
        }
        Object var6 = field3301;
        synchronized (field3301) {
            if (field3297 == 0) {
                Statics.field3295 = new Thread(new class244());
                Statics.field3295.setDaemon(true);
                Statics.field3295.start();
                Statics.field3295.setPriority(5);
            }
            field3297 = 600;
        }
    }

    @ObfuscatedName("hz.p(ILfe;Liy;I)V")
    public static void method3903(int arg0, class162 arg1, class245 arg2) {
        class241 var3 = new class241();
        var3.field3268 = 1;
        var3.field2563 = (long) arg0;
        var3.field3267 = arg1;
        var3.field3271 = arg2;
        class201 var4 = field3298;
        synchronized (field3298) {
            field3298.method3480(var3);
        }
        Object var6 = field3301;
        synchronized (field3301) {
            if (field3297 == 0) {
                Statics.field3295 = new Thread(new class244());
                Statics.field3295.setDaemon(true);
                Statics.field3295.start();
                Statics.field3295.setPriority(5);
            }
            field3297 = 600;
        }
    }

    @ObfuscatedName("gv.i(ILfe;Liy;I)V")
    public static void method3328(int arg0, class162 arg1, class245 arg2) {
        byte[] var3 = null;
        class201 var4 = field3298;
        synchronized (field3298) {
            for (class241 var5 = (class241) field3298.method3486(); var5 != null; var5 = (class241) field3298.method3507()) {
                if ((long) arg0 == var5.field2563 && var5.field3267 == arg1 && var5.field3268 == 0) {
                    var3 = var5.field3266;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2857(arg0);
            arg2.method4039(arg1, arg0, var7, true);
        } else {
            arg2.method4039(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class201 var1 = field3298;
                class241 var2;
                synchronized (field3298) {
                    var2 = (class241) field3298.method3486();
                }
                if (var2 == null) {
                    class189.method1011(100L);
                    Object var10 = field3301;
                    synchronized (field3301) {
                        if (field3297 <= 1) {
                            field3297 = 0;
                            field3301.notifyAll();
                            return;
                        }
                        field3297--;
                    }
                } else {
                    if (var2.field3268 == 0) {
                        var2.field3267.method2854((int) var2.field2563, var2.field3266, var2.field3266.length);
                        class201 var4 = field3298;
                        synchronized (field3298) {
                            var2.method3476();
                        }
                    } else if (var2.field3268 == 1) {
                        var2.field3266 = var2.field3267.method2857((int) var2.field2563);
                        class201 var6 = field3298;
                        synchronized (field3298) {
                            field3296.method3480(var2);
                        }
                    }
                    Object var8 = field3301;
                    synchronized (field3301) {
                        if (field3297 <= 1) {
                            field3297 = 0;
                            field3301.notifyAll();
                            return;
                        }
                        field3297 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class154.method355((String) null, var18);
        }
    }
}
