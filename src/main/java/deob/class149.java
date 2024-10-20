package deob;

@ObfuscatedName("ed")
public class class149 implements Runnable {

    @ObfuscatedName("ed.k")
    public static class177 field2498 = new class177();

    @ObfuscatedName("ed.b")
    public static class177 field2495 = new class177();

    @ObfuscatedName("ed.e")
    public static int field2494 = 0;

    @ObfuscatedName("ed.i")
    public static Object field2497 = new Object();

    @ObfuscatedName("de.i(I[BLdr;B)V")
    public static void method2421(int arg0, byte[] arg1, class121 arg2) {
        class148 var3 = new class148();
        var3.field2485 = 0;
        var3.field2867 = (long) arg0;
        var3.field2490 = arg1;
        var3.field2487 = arg2;
        class177 var4 = field2498;
        synchronized (field2498) {
            field2498.method3223(var3);
        }
        method1771();
    }

    @ObfuscatedName("q.t(ILdr;Leh;B)V")
    public static void method109(int arg0, class121 arg1, class147 arg2) {
        byte[] var3 = null;
        class177 var4 = field2498;
        synchronized (field2498) {
            for (class148 var5 = (class148) field2498.method3228(); var5 != null; var5 = (class148) field2498.method3254()) {
                if ((long) arg0 == var5.field2867 && var5.field2487 == arg1 && var5.field2485 == 0) {
                    var3 = var5.field2490;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2442(arg0);
            arg2.method2768(arg1, arg0, var7, true);
        } else {
            arg2.method2768(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("cd.z(B)V")
    public static void method1771() {
        Object var0 = field2497;
        synchronized (field2497) {
            if (field2494 == 0) {
                Statics.field1005.method2463(new class149(), 5);
            }
            field2494 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2498;
                class148 var2;
                synchronized (field2498) {
                    var2 = (class148) field2498.method3228();
                }
                if (var2 == null) {
                    class114.method500(100L);
                    Object var10 = field2497;
                    synchronized (field2497) {
                        if (field2494 <= 1) {
                            field2494 = 0;
                            field2497.notifyAll();
                            return;
                        }
                        field2494--;
                    }
                } else {
                    if (var2.field2485 == 0) {
                        var2.field2487.method2443((int) var2.field2867, var2.field2490, var2.field2490.length);
                        class177 var4 = field2498;
                        synchronized (field2498) {
                            var2.method3321();
                        }
                    } else if (var2.field2485 == 1) {
                        var2.field2490 = var2.field2487.method2442((int) var2.field2867);
                        class177 var6 = field2498;
                        synchronized (field2498) {
                            field2495.method3223(var2);
                        }
                    }
                    Object var8 = field2497;
                    synchronized (field2497) {
                        if (field2494 <= 1) {
                            field2494 = 0;
                            field2497.notifyAll();
                            return;
                        }
                        field2494 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method2560((String) null, var18);
        }
    }

    @ObfuscatedName("y.g(B)V")
    public static void method144() {
        Object var0 = field2497;
        synchronized (field2497) {
            if (field2494 != 0) {
                field2494 = 1;
                try {
                    field2497.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
