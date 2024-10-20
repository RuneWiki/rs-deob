package deob;

@ObfuscatedName("jn")
public class class273 implements Runnable {

    @ObfuscatedName("jn.f")
    public static class295 field3560 = new class295();

    @ObfuscatedName("jn.e")
    public static class295 field3556 = new class295();

    @ObfuscatedName("jn.v")
    public static int field3558 = 0;

    @ObfuscatedName("jn.y")
    public static Object field3559 = new Object();

    @ObfuscatedName("ai.f(ILla;Ljf;I)V")
    public static void method564(int arg0, class334 arg1, class274 arg2) {
        class272 var3 = new class272();
        var3.field3554 = 1;
        var3.field3937 = (long) arg0;
        var3.field3553 = arg1;
        var3.field3551 = arg2;
        class295 var4 = field3560;
        synchronized (field3560) {
            field3560.method4716(var3);
        }
        Object var6 = field3559;
        synchronized (field3559) {
            if (field3558 == 0) {
                Statics.field3752 = new Thread(new class273());
                Statics.field3752.setDaemon(true);
                Statics.field3752.start();
                Statics.field3752.setPriority(5);
            }
            field3558 = 600;
        }
    }

    @ObfuscatedName("cr.e(ILla;Ljf;I)V")
    public static void method1998(int arg0, class334 arg1, class274 arg2) {
        byte[] var3 = null;
        class295 var4 = field3560;
        synchronized (field3560) {
            for (class272 var5 = (class272) field3560.method4721(); var5 != null; var5 = (class272) field3560.method4723()) {
                if ((long) arg0 == var5.field3937 && var5.field3553 == arg1 && var5.field3554 == 0) {
                    var3 = var5.field3552;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5321(arg0);
            arg2.method4464(arg1, arg0, var7, true);
        } else {
            arg2.method4464(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class295 var1 = field3560;
                class272 var2;
                synchronized (field3560) {
                    var2 = (class272) field3560.method4721();
                }
                if (var2 == null) {
                    class382.method169(100L);
                    Object var10 = field3559;
                    synchronized (field3559) {
                        if (field3558 <= 1) {
                            field3558 = 0;
                            field3559.notifyAll();
                            return;
                        }
                        field3558--;
                    }
                } else {
                    if (var2.field3554 == 0) {
                        var2.field3553.method5322((int) var2.field3937, var2.field3552, var2.field3552.length);
                        class295 var4 = field3560;
                        synchronized (field3560) {
                            var2.method5407();
                        }
                    } else if (var2.field3554 == 1) {
                        var2.field3552 = var2.field3553.method5321((int) var2.field3937);
                        class295 var6 = field3560;
                        synchronized (field3560) {
                            field3556.method4716(var2);
                        }
                    }
                    Object var8 = field3559;
                    synchronized (field3559) {
                        if (field3558 <= 1) {
                            field3558 = 0;
                            field3559.notifyAll();
                            return;
                        }
                        field3558 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class407.method5131((String) null, var18);
        }
    }

    @ObfuscatedName("hf.y(B)V")
    public static void method3950() {
        Object var0 = field3559;
        synchronized (field3559) {
            if (field3558 != 0) {
                field3558 = 1;
                try {
                    field3559.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
