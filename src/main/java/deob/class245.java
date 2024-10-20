package deob;

@ObfuscatedName("ip")
public class class245 implements Runnable {

    @ObfuscatedName("ip.x")
    public static class272 field3150 = new class272();

    @ObfuscatedName("ip.m")
    public static class272 field3149 = new class272();

    @ObfuscatedName("ip.k")
    public static int field3152 = 0;

    @ObfuscatedName("ip.d")
    public static Object field3151 = new Object();

    @ObfuscatedName("ez.x(I[BLlq;S)V")
    public static void method3116(int arg0, byte[] arg1, class318 arg2) {
        class242 var3 = new class242();
        var3.field3118 = 0;
        var3.field2117 = (long) arg0;
        var3.field3114 = arg1;
        var3.field3115 = arg2;
        class272 var4 = field3150;
        synchronized (field3150) {
            field3150.method4580(var3);
        }
        Object var6 = field3151;
        synchronized (field3151) {
            if (field3152 == 0) {
                Statics.field2350 = new Thread(new class245());
                Statics.field2350.setDaemon(true);
                Statics.field2350.start();
                Statics.field2350.setPriority(5);
            }
            field3152 = 600;
        }
    }

    @ObfuscatedName("hu.m(ILlq;Lih;I)V")
    public static void method3837(int arg0, class318 arg1, class246 arg2) {
        class242 var3 = new class242();
        var3.field3118 = 1;
        var3.field2117 = (long) arg0;
        var3.field3115 = arg1;
        var3.field3116 = arg2;
        class272 var4 = field3150;
        synchronized (field3150) {
            field3150.method4580(var3);
        }
        Object var6 = field3151;
        synchronized (field3151) {
            if (field3152 == 0) {
                Statics.field2350 = new Thread(new class245());
                Statics.field2350.setDaemon(true);
                Statics.field2350.start();
                Statics.field2350.setPriority(5);
            }
            field3152 = 600;
        }
    }

    @ObfuscatedName("cv.k(ILlq;Lih;I)V")
    public static void method2141(int arg0, class318 arg1, class246 arg2) {
        byte[] var3 = null;
        class272 var4 = field3150;
        synchronized (field3150) {
            for (class242 var5 = (class242) field3150.method4559(); var5 != null; var5 = (class242) field3150.method4577()) {
                if ((long) arg0 == var5.field2117 && var5.field3115 == arg1 && var5.field3118 == 0) {
                    var3 = var5.field3114;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5450(arg0);
            arg2.method3985(arg1, arg0, var7, true);
        } else {
            arg2.method3985(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class272 var1 = field3150;
                class242 var2;
                synchronized (field3150) {
                    var2 = (class242) field3150.method4559();
                }
                if (var2 == null) {
                    class308.method3243(100L);
                    Object var10 = field3151;
                    synchronized (field3151) {
                        if (field3152 <= 1) {
                            field3152 = 0;
                            field3151.notifyAll();
                            return;
                        }
                        field3152--;
                    }
                } else {
                    if (var2.field3118 == 0) {
                        var2.field3115.method5449((int) var2.field2117, var2.field3114, var2.field3114.length);
                        class272 var4 = field3150;
                        synchronized (field3150) {
                            var2.method3355();
                        }
                    } else if (var2.field3118 == 1) {
                        var2.field3114 = var2.field3115.method5450((int) var2.field2117);
                        class272 var6 = field3150;
                        synchronized (field3150) {
                            field3149.method4580(var2);
                        }
                    }
                    Object var8 = field3151;
                    synchronized (field3151) {
                        if (field3152 <= 1) {
                            field3152 = 0;
                            field3151.notifyAll();
                            return;
                        }
                        field3152 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class351.method3842((String) null, var18);
        }
    }
}
