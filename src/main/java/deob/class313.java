package deob;

@ObfuscatedName("lf")
public class class313 implements Runnable {

    @ObfuscatedName("lf.o")
    public static class335 field4001 = new class335();

    @ObfuscatedName("lf.q")
    public static class335 field4000 = new class335();

    @ObfuscatedName("lf.l")
    public static int field3999 = 0;

    @ObfuscatedName("lf.k")
    public static Object field4002 = new Object();

    @ObfuscatedName("hl.o(I[BLnc;I)V")
    public static void method4067(int arg0, byte[] arg1, class382 arg2) {
        class312 var3 = new class312();
        var3.field3996 = 0;
        var3.field4468 = (long) arg0;
        var3.field3994 = arg1;
        var3.field3993 = arg2;
        class335 var4 = field4001;
        synchronized (field4001) {
            field4001.method5413(var3);
        }
        method5127();
    }

    @ObfuscatedName("gf.q(ILnc;Lle;I)V")
    public static void method3719(int arg0, class382 arg1, class314 arg2) {
        byte[] var3 = null;
        class335 var4 = field4001;
        synchronized (field4001) {
            for (class312 var5 = (class312) field4001.method5431(); var5 != null; var5 = (class312) field4001.method5419()) {
                if ((long) arg0 == var5.field4468 && var5.field3993 == arg1 && var5.field3996 == 0) {
                    var3 = var5.field3994;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method6146(arg0);
            arg2.method5165(arg1, arg0, var7, true);
        } else {
            arg2.method5165(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ku.l(I)V")
    public static void method5127() {
        Object var0 = field4002;
        synchronized (field4002) {
            if (field3999 == 0) {
                Statics.field1595 = new Thread(new class313());
                Statics.field1595.setDaemon(true);
                Statics.field1595.start();
                Statics.field1595.setPriority(5);
            }
            field3999 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class335 var1 = field4001;
                class312 var2;
                synchronized (field4001) {
                    var2 = (class312) field4001.method5431();
                }
                if (var2 == null) {
                    class271.method4446(100L);
                    Object var10 = field4002;
                    synchronized (field4002) {
                        if (field3999 <= 1) {
                            field3999 = 0;
                            field4002.notifyAll();
                            return;
                        }
                        field3999--;
                    }
                } else {
                    if (var2.field3996 == 0) {
                        var2.field3993.method6144((int) var2.field4468, var2.field3994, var2.field3994.length);
                        class335 var4 = field4001;
                        synchronized (field4001) {
                            var2.method6399();
                        }
                    } else if (var2.field3996 == 1) {
                        var2.field3994 = var2.field3993.method6146((int) var2.field4468);
                        class335 var6 = field4001;
                        synchronized (field4001) {
                            field4000.method5413(var2);
                        }
                    }
                    Object var8 = field4002;
                    synchronized (field4002) {
                        if (field3999 <= 1) {
                            field3999 = 0;
                            field4002.notifyAll();
                            return;
                        }
                        field3999 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class464.method5148((String) null, var18);
        }
    }

    @ObfuscatedName("hy.k(I)V")
    public static void method3913() {
        Object var0 = field4002;
        synchronized (field4002) {
            if (field3999 != 0) {
                field3999 = 1;
                try {
                    field4002.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
