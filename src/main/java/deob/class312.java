package deob;

@ObfuscatedName("ks")
public class class312 implements Runnable {

    @ObfuscatedName("ks.c")
    public static class334 field3974 = new class334();

    @ObfuscatedName("ks.v")
    public static class334 field3971 = new class334();

    @ObfuscatedName("ks.q")
    public static int field3972 = 0;

    @ObfuscatedName("ks.f")
    public static Object field3970 = new Object();

    @ObfuscatedName("pv.c(I[BLnd;B)V")
    public static void method6898(int arg0, byte[] arg1, class381 arg2) {
        class311 var3 = new class311();
        var3.field3969 = 0;
        var3.field4462 = (long) arg0;
        var3.field3968 = arg1;
        var3.field3966 = arg2;
        class334 var4 = field3974;
        synchronized (field3974) {
            field3974.method5530(var3);
        }
        method1970();
    }

    @ObfuscatedName("kz.v(ILnd;Llc;B)V")
    public static void method5225(int arg0, class381 arg1, class313 arg2) {
        class311 var3 = new class311();
        var3.field3969 = 1;
        var3.field4462 = (long) arg0;
        var3.field3966 = arg1;
        var3.field3967 = arg2;
        class334 var4 = field3974;
        synchronized (field3974) {
            field3974.method5530(var3);
        }
        method1970();
    }

    @ObfuscatedName("ju.q(ILnd;Llc;B)V")
    public static void method4706(int arg0, class381 arg1, class313 arg2) {
        byte[] var3 = null;
        class334 var4 = field3974;
        synchronized (field3974) {
            for (class311 var5 = (class311) field3974.method5535(); var5 != null; var5 = (class311) field3974.method5537()) {
                if ((long) arg0 == var5.field4462 && var5.field3966 == arg1 && var5.field3969 == 0) {
                    var3 = var5.field3968;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method6249(arg0);
            arg2.method5257(arg1, arg0, var7, true);
        } else {
            arg2.method5257(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("bm.f(I)V")
    public static void method1970() {
        Object var0 = field3970;
        synchronized (field3970) {
            if (field3972 == 0) {
                Statics.field3973 = new Thread(new class312());
                Statics.field3973.setDaemon(true);
                Statics.field3973.start();
                Statics.field3973.setPriority(5);
            }
            field3972 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class334 var1 = field3974;
                class311 var2;
                synchronized (field3974) {
                    var2 = (class311) field3974.method5535();
                }
                if (var2 == null) {
                    class270.method1896(100L);
                    Object var10 = field3970;
                    synchronized (field3970) {
                        if (field3972 <= 1) {
                            field3972 = 0;
                            field3970.notifyAll();
                            return;
                        }
                        field3972--;
                    }
                } else {
                    if (var2.field3969 == 0) {
                        var2.field3966.method6248((int) var2.field4462, var2.field3968, var2.field3968.length);
                        class334 var4 = field3974;
                        synchronized (field3974) {
                            var2.method6497();
                        }
                    } else if (var2.field3969 == 1) {
                        var2.field3968 = var2.field3966.method6249((int) var2.field4462);
                        class334 var6 = field3974;
                        synchronized (field3974) {
                            field3971.method5530(var2);
                        }
                    }
                    Object var8 = field3970;
                    synchronized (field3970) {
                        if (field3972 <= 1) {
                            field3972 = 0;
                            field3970.notifyAll();
                            return;
                        }
                        field3972 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class467.method4655((String) null, var18);
        }
    }
}
