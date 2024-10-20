package deob;

@ObfuscatedName("er")
public class class145 implements Runnable {

    @ObfuscatedName("er.z")
    public static class171 field2450 = new class171();

    @ObfuscatedName("er.n")
    public static class171 field2454 = new class171();

    @ObfuscatedName("er.u")
    public static int field2451 = 0;

    @ObfuscatedName("er.t")
    public static Object field2452 = new Object();

    @ObfuscatedName("as.u(I[BLdx;I)V")
    public static void method625(int arg0, byte[] arg1, class118 arg2) {
        class144 var3 = new class144();
        var3.field2443 = 0;
        var3.field2817 = (long) arg0;
        var3.field2448 = arg1;
        var3.field2442 = arg2;
        class171 var4 = field2450;
        synchronized (field2450) {
            field2450.method3221(var3);
        }
        Object var6 = field2452;
        synchronized (field2452) {
            if (field2451 == 0) {
                Statics.field1249.method2523(new class145(), 5);
            }
            field2451 = 600;
        }
    }

    @ObfuscatedName("n.t(B)V")
    public static void method12() {
        while (true) {
            class171 var0 = field2450;
            class144 var1;
            synchronized (field2450) {
                var1 = (class144) field2454.method3260();
            }
            if (var1 == null) {
                return;
            }
            var1.field2444.method2833(var1.field2442, (int) var1.field2817, var1.field2448, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class171 var1 = field2450;
                class144 var2;
                synchronized (field2450) {
                    var2 = (class144) field2450.method3236();
                }
                if (var2 == null) {
                    class111.method1306(100L);
                    Object var10 = field2452;
                    synchronized (field2452) {
                        if (field2451 <= 1) {
                            field2451 = 0;
                            field2452.notifyAll();
                            return;
                        }
                        field2451--;
                    }
                } else {
                    if (var2.field2443 == 0) {
                        var2.field2442.method2482((int) var2.field2817, var2.field2448, var2.field2448.length);
                        class171 var4 = field2450;
                        synchronized (field2450) {
                            var2.method3288();
                        }
                    } else if (var2.field2443 == 1) {
                        var2.field2448 = var2.field2442.method2481((int) var2.field2817);
                        class171 var6 = field2450;
                        synchronized (field2450) {
                            field2454.method3221(var2);
                        }
                    }
                    Object var8 = field2452;
                    synchronized (field2452) {
                        if (field2451 <= 1) {
                            field2451 = 0;
                            field2452.notifyAll();
                            return;
                        }
                        field2451 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class132.method508((String) null, var18);
        }
    }

    @ObfuscatedName("an.e(B)V")
    public static void method706() {
        Object var0 = field2452;
        synchronized (field2452) {
            if (field2451 != 0) {
                field2451 = 1;
                try {
                    field2452.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
