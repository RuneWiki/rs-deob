package deob;

@ObfuscatedName("ew")
public class class155 implements Runnable {

    @ObfuscatedName("ew.j")
    public static class175 field2514 = new class175();

    @ObfuscatedName("ew.y")
    public static class175 field2509 = new class175();

    @ObfuscatedName("ew.x")
    public static int field2516 = 0;

    @ObfuscatedName("ew.z")
    public static Object field2511 = new Object();

    @ObfuscatedName("ej.z(I[BLbd;I)V")
    public static void method2626(int arg0, byte[] arg1, class70 arg2) {
        class154 var3 = new class154();
        var3.field2501 = 0;
        var3.field2758 = (long) arg0;
        var3.field2506 = arg1;
        var3.field2502 = arg2;
        class175 var4 = field2514;
        synchronized (field2514) {
            field2514.method3283(var3);
        }
        Object var6 = field2511;
        synchronized (field2511) {
            if (field2516 == 0) {
                Statics.field16.method1455(new class155(), 5);
            }
            field2516 = 600;
        }
    }

    @ObfuscatedName("bl.c(ILbd;Led;B)V")
    public static void method1320(int arg0, class70 arg1, class152 arg2) {
        class154 var3 = new class154();
        var3.field2501 = 1;
        var3.field2758 = (long) arg0;
        var3.field2502 = arg1;
        var3.field2503 = arg2;
        class175 var4 = field2514;
        synchronized (field2514) {
            field2514.method3283(var3);
        }
        Object var6 = field2511;
        synchronized (field2511) {
            if (field2516 == 0) {
                Statics.field16.method1455(new class155(), 5);
            }
            field2516 = 600;
        }
    }

    @ObfuscatedName("dg.e(I)V")
    public static void method2245() {
        while (true) {
            class175 var0 = field2514;
            class154 var1;
            synchronized (field2514) {
                var1 = (class154) field2509.method3246();
            }
            if (var1 == null) {
                return;
            }
            var1.field2503.method3002(var1.field2502, (int) var1.field2758, var1.field2506, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class175 var1 = field2514;
                class154 var2;
                synchronized (field2514) {
                    var2 = (class154) field2514.method3279();
                }
                if (var2 == null) {
                    class125.method112(100L);
                    Object var10 = field2511;
                    synchronized (field2511) {
                        if (field2516 <= 1) {
                            field2516 = 0;
                            field2511.notifyAll();
                            return;
                        }
                        field2516--;
                    }
                } else {
                    if (var2.field2501 == 0) {
                        var2.field2502.method1378((int) var2.field2758, var2.field2506, var2.field2506.length);
                        class175 var4 = field2514;
                        synchronized (field2514) {
                            var2.method3289();
                        }
                    } else if (var2.field2501 == 1) {
                        var2.field2506 = var2.field2502.method1372((int) var2.field2758);
                        class175 var6 = field2514;
                        synchronized (field2514) {
                            field2509.method3283(var2);
                        }
                    }
                    Object var8 = field2511;
                    synchronized (field2511) {
                        if (field2516 <= 1) {
                            field2516 = 0;
                            field2511.notifyAll();
                            return;
                        }
                        field2516 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class79.method2299((String) null, var18);
        }
    }

    @ObfuscatedName("bz.s(I)V")
    public static void method1207() {
        Object var0 = field2511;
        synchronized (field2511) {
            if (field2516 != 0) {
                field2516 = 1;
                try {
                    field2511.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
