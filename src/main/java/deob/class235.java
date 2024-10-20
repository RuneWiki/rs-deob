package deob;

@ObfuscatedName("ir")
public class class235 implements Runnable {

    @ObfuscatedName("ir.q")
    public static class262 field3147 = new class262();

    @ObfuscatedName("ir.w")
    public static class262 field3146 = new class262();

    @ObfuscatedName("ir.e")
    public static int field3145 = 0;

    @ObfuscatedName("ir.p")
    public static Object field3148 = new Object();

    @ObfuscatedName("kz.q(I[BLkm;I)V")
    public static void method4909(int arg0, byte[] arg1, class309 arg2) {
        class232 var3 = new class232();
        var3.field3119 = 0;
        var3.field2114 = (long) arg0;
        var3.field3116 = arg1;
        var3.field3117 = arg2;
        class262 var4 = field3147;
        synchronized (field3147) {
            field3147.method4532(var3);
        }
        Object var6 = field3148;
        synchronized (field3148) {
            if (field3145 == 0) {
                Statics.field3149 = new Thread(new class235());
                Statics.field3149.setDaemon(true);
                Statics.field3149.start();
                Statics.field3149.setPriority(5);
            }
            field3145 = 600;
        }
    }

    @ObfuscatedName("co.w(ILkm;Liu;I)V")
    public static void method1865(int arg0, class309 arg1, class236 arg2) {
        byte[] var3 = null;
        class262 var4 = field3147;
        synchronized (field3147) {
            for (class232 var5 = (class232) field3147.method4507(); var5 != null; var5 = (class232) field3147.method4509()) {
                if ((long) arg0 == var5.field2114 && var5.field3117 == arg1 && var5.field3119 == 0) {
                    var3 = var5.field3116;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5394(arg0);
            arg2.method3893(arg1, arg0, var7, true);
        } else {
            arg2.method3893(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class262 var1 = field3147;
                class232 var2;
                synchronized (field3147) {
                    var2 = (class232) field3147.method4507();
                }
                if (var2 == null) {
                    class299.method4167(100L);
                    Object var10 = field3148;
                    synchronized (field3148) {
                        if (field3145 <= 1) {
                            field3145 = 0;
                            field3148.notifyAll();
                            return;
                        }
                        field3145--;
                    }
                } else {
                    if (var2.field3119 == 0) {
                        var2.field3117.method5395((int) var2.field2114, var2.field3116, var2.field3116.length);
                        class262 var4 = field3147;
                        synchronized (field3147) {
                            var2.method3286();
                        }
                    } else if (var2.field3119 == 1) {
                        var2.field3116 = var2.field3117.method5394((int) var2.field2114);
                        class262 var6 = field3147;
                        synchronized (field3147) {
                            field3146.method4532(var2);
                        }
                    }
                    Object var8 = field3148;
                    synchronized (field3148) {
                        if (field3145 <= 1) {
                            field3145 = 0;
                            field3148.notifyAll();
                            return;
                        }
                        field3145 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class342.method4173((String) null, var18);
        }
    }

    @ObfuscatedName("cw.e(B)V")
    public static void method1902() {
        Object var0 = field3148;
        synchronized (field3148) {
            if (field3145 != 0) {
                field3145 = 1;
                try {
                    field3148.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
