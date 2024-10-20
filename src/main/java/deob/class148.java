package deob;

@ObfuscatedName("eg")
public class class148 implements Runnable {

    @ObfuscatedName("eg.e")
    public static class176 field2474 = new class176();

    @ObfuscatedName("eg.p")
    public static class176 field2472 = new class176();

    @ObfuscatedName("eg.a")
    public static int field2471 = 0;

    @ObfuscatedName("eg.g")
    public static Object field2473 = new Object();

    @ObfuscatedName("eo.a(I[BLdj;B)V")
    public static void method2818(int arg0, byte[] arg1, class121 arg2) {
        class147 var3 = new class147();
        var3.field2470 = 0;
        var3.field2843 = (long) arg0;
        var3.field2465 = arg1;
        var3.field2466 = arg2;
        class176 var4 = field2474;
        synchronized (field2474) {
            field2474.method3222(var3);
        }
        method120();
    }

    @ObfuscatedName("z.g(ILdj;Leb;I)V")
    public static void method483(int arg0, class121 arg1, class146 arg2) {
        byte[] var3 = null;
        class176 var4 = field2474;
        synchronized (field2474) {
            for (class147 var5 = (class147) field2474.method3225(); var5 != null; var5 = (class147) field2474.method3227()) {
                if ((long) arg0 == var5.field2843 && var5.field2466 == arg1 && var5.field2470 == 0) {
                    var3 = var5.field2465;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2462(arg0);
            arg2.method2796(arg1, arg0, var7, true);
        } else {
            arg2.method2796(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("l.u(I)V")
    public static void method100() {
        while (true) {
            class176 var0 = field2474;
            class147 var1;
            synchronized (field2474) {
                var1 = (class147) field2472.method3223();
            }
            if (var1 == null) {
                return;
            }
            var1.field2464.method2796(var1.field2466, (int) var1.field2843, var1.field2465, false);
        }
    }

    @ObfuscatedName("c.k(B)V")
    public static void method120() {
        Object var0 = field2473;
        synchronized (field2473) {
            if (field2471 == 0) {
                Statics.field1920.method2480(new class148(), 5);
            }
            field2471 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class176 var1 = field2474;
                class147 var2;
                synchronized (field2474) {
                    var2 = (class147) field2474.method3225();
                }
                if (var2 == null) {
                    class114.method658(100L);
                    Object var10 = field2473;
                    synchronized (field2473) {
                        if (field2471 <= 1) {
                            field2471 = 0;
                            field2473.notifyAll();
                            return;
                        }
                        field2471--;
                    }
                } else {
                    if (var2.field2470 == 0) {
                        var2.field2466.method2461((int) var2.field2843, var2.field2465, var2.field2465.length);
                        class176 var4 = field2474;
                        synchronized (field2474) {
                            var2.method3307();
                        }
                    } else if (var2.field2470 == 1) {
                        var2.field2465 = var2.field2466.method2462((int) var2.field2843);
                        class176 var6 = field2474;
                        synchronized (field2474) {
                            field2472.method3222(var2);
                        }
                    }
                    Object var8 = field2473;
                    synchronized (field2473) {
                        if (field2471 <= 1) {
                            field2471 = 0;
                            field2473.notifyAll();
                            return;
                        }
                        field2471 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method95((String) null, var18);
        }
    }

    @ObfuscatedName("ds.m(I)V")
    public static void method2424() {
        Object var0 = field2473;
        synchronized (field2473) {
            if (field2471 != 0) {
                field2471 = 1;
                try {
                    field2473.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
