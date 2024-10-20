package deob;

@ObfuscatedName("ou")
public class class384 implements Runnable {

    @ObfuscatedName("ou.aq")
    public static final class407 field4475 = new class407();

    @ObfuscatedName("ou.ad")
    public static class407 field4470 = new class407();

    @ObfuscatedName("ou.ag")
    public static int field4469 = 0;

    @ObfuscatedName("ou.ak")
    public static boolean field4471 = false;

    @ObfuscatedName("ou.ap")
    public static Object field4473 = new Object();

    @ObfuscatedName("jw.aq(ILsq;Loz;B)V")
    public static void method4520(int arg0, class483 arg1, class385 arg2) {
        class383 var3 = new class383();
        var3.field4466 = 1;
        var3.field5082 = (long) arg0;
        var3.field4467 = arg1;
        var3.field4468 = arg2;
        class407 var4 = field4475;
        synchronized (field4475) {
            field4475.method6794(var3);
        }
        Object var6 = field4473;
        synchronized (field4473) {
            if (field4469 == 0) {
                Statics.field2712 = new Thread(new class384());
                Statics.field2712.setDaemon(true);
                Statics.field2712.start();
                Statics.field2712.setPriority(5);
            }
            field4469 = 600;
            field4471 = false;
        }
    }

    @ObfuscatedName("ni.ad(ILsq;Loz;S)V")
    public static void method5822(int arg0, class483 arg1, class385 arg2) {
        byte[] var3 = null;
        class407 var4 = field4475;
        synchronized (field4475) {
            for (class383 var5 = (class383) field4475.method6814(); var5 != null; var5 = (class383) field4475.method6799()) {
                if ((long) arg0 == var5.field5082 && var5.field4467 == arg1 && var5.field4466 == 0) {
                    var3 = var5.field4465;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method8020(arg0);
            arg2.method6525(arg1, arg0, var7, true);
        } else {
            arg2.method6525(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("fp.ag(I)V")
    public static void method3031() {
        while (true) {
            class407 var0 = field4475;
            class383 var1;
            synchronized (field4475) {
                var1 = (class383) field4470.method6795();
            }
            if (var1 == null) {
                return;
            }
            var1.field4468.method6525(var1.field4467, (int) var1.field5082, var1.field4465, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class407 var1 = field4475;
                class383 var2;
                synchronized (field4475) {
                    var2 = (class383) field4475.method6814();
                }
                if (var2 == null) {
                    class328.method3390(100L);
                    Object var10 = field4473;
                    synchronized (field4473) {
                        if ((field4471 || field4469 <= 1) && field4475.method6801()) {
                            field4469 = 0;
                            field4473.notifyAll();
                            return;
                        }
                        field4469--;
                    }
                } else {
                    if (var2.field4466 == 0) {
                        var2.field4467.method8028((int) var2.field5082, var2.field4465, var2.field4465.length);
                        class407 var4 = field4475;
                        synchronized (field4475) {
                            var2.method8130();
                        }
                    } else if (var2.field4466 == 1) {
                        var2.field4465 = var2.field4467.method8020((int) var2.field5082);
                        class407 var6 = field4475;
                        synchronized (field4475) {
                            field4470.method6794(var2);
                        }
                    }
                    Object var8 = field4473;
                    synchronized (field4473) {
                        if ((field4471 || field4469 <= 1) && field4475.method6801()) {
                            field4469 = 0;
                            field4473.notifyAll();
                            return;
                        }
                        field4469 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class572.method7807((String) null, var18);
        }
    }

    @ObfuscatedName("ox.ak(B)V")
    public static void method6457() {
        Object var0 = field4473;
        synchronized (field4473) {
            if (field4469 != 0) {
                field4469 = 1;
                field4471 = true;
                try {
                    field4473.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
