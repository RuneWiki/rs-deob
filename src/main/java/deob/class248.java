package deob;

@ObfuscatedName("iy")
public class class248 implements Runnable {

    @ObfuscatedName("iy.p")
    public static class205 field3306 = new class205();

    @ObfuscatedName("iy.i")
    public static class205 field3307 = new class205();

    @ObfuscatedName("iy.w")
    public static int field3308 = 0;

    @ObfuscatedName("iy.s")
    public static Object field3309 = new Object();

    @ObfuscatedName("id.p(ILfx;Lio;I)V")
    public static void method4019(int arg0, class165 arg1, class249 arg2) {
        class245 var3 = new class245();
        var3.field3280 = 1;
        var3.field2563 = (long) arg0;
        var3.field3281 = arg1;
        var3.field3276 = arg2;
        class205 var4 = field3306;
        synchronized (field3306) {
            field3306.method3572(var3);
        }
        method4186();
    }

    @ObfuscatedName("iq.i(ILfx;Lio;I)V")
    public static void method4009(int arg0, class165 arg1, class249 arg2) {
        byte[] var3 = null;
        class205 var4 = field3306;
        synchronized (field3306) {
            for (class245 var5 = (class245) field3306.method3581(); var5 != null; var5 = (class245) field3306.method3597()) {
                if ((long) arg0 == var5.field2563 && var5.field3281 == arg1 && var5.field3280 == 0) {
                    var3 = var5.field3277;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2945(arg0);
            arg2.method4142(arg1, arg0, var7, true);
        } else {
            arg2.method4142(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("bm.w(I)V")
    public static void method925() {
        while (true) {
            class205 var0 = field3306;
            class245 var1;
            synchronized (field3306) {
                var1 = (class245) field3307.method3570();
            }
            if (var1 == null) {
                return;
            }
            var1.field3276.method4142(var1.field3281, (int) var1.field2563, var1.field3277, false);
        }
    }

    @ObfuscatedName("iz.s(I)V")
    public static void method4186() {
        Object var0 = field3309;
        synchronized (field3309) {
            if (field3308 == 0) {
                Statics.field1371 = new Thread(new class248());
                Statics.field1371.setDaemon(true);
                Statics.field1371.start();
                Statics.field1371.setPriority(5);
            }
            field3308 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class205 var1 = field3306;
                class245 var2;
                synchronized (field3306) {
                    var2 = (class245) field3306.method3581();
                }
                if (var2 == null) {
                    class193.method4(100L);
                    Object var10 = field3309;
                    synchronized (field3309) {
                        if (field3308 <= 1) {
                            field3308 = 0;
                            field3309.notifyAll();
                            return;
                        }
                        field3308--;
                    }
                } else {
                    if (var2.field3280 == 0) {
                        var2.field3281.method2946((int) var2.field2563, var2.field3277, var2.field3277.length);
                        class205 var4 = field3306;
                        synchronized (field3306) {
                            var2.method3561();
                        }
                    } else if (var2.field3280 == 1) {
                        var2.field3277 = var2.field3281.method2945((int) var2.field2563);
                        class205 var6 = field3306;
                        synchronized (field3306) {
                            field3307.method3572(var2);
                        }
                    }
                    Object var8 = field3309;
                    synchronized (field3309) {
                        if (field3308 <= 1) {
                            field3308 = 0;
                            field3309.notifyAll();
                            return;
                        }
                        field3308 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class155.method1770((String) null, var18);
        }
    }

    @ObfuscatedName("fl.j(I)V")
    public static void method2941() {
        Object var0 = field3309;
        synchronized (field3309) {
            if (field3308 != 0) {
                field3308 = 1;
                try {
                    field3309.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
