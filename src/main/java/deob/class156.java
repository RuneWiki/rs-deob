package deob;

@ObfuscatedName("ey")
public class class156 implements Runnable {

    @ObfuscatedName("ey.u")
    public static class176 field2551 = new class176();

    @ObfuscatedName("ey.k")
    public static class176 field2552 = new class176();

    @ObfuscatedName("ey.x")
    public static int field2550 = 0;

    @ObfuscatedName("ey.m")
    public static Object field2553 = new Object();

    @ObfuscatedName("cn.m(I[BLbk;B)V")
    public static void method1673(int arg0, byte[] arg1, class70 arg2) {
        class155 var3 = new class155();
        var3.field2547 = 0;
        var3.field2808 = (long) arg0;
        var3.field2545 = arg1;
        var3.field2546 = arg2;
        class176 var4 = field2551;
        synchronized (field2551) {
            field2551.method3323(var3);
        }
        method131();
    }

    @ObfuscatedName("eq.n(ILbk;Lef;B)V")
    public static void method2684(int arg0, class70 arg1, class153 arg2) {
        byte[] var3 = null;
        class176 var4 = field2551;
        synchronized (field2551) {
            for (class155 var5 = (class155) field2551.method3326(); var5 != null; var5 = (class155) field2551.method3330()) {
                if ((long) arg0 == var5.field2808 && var5.field2546 == arg1 && var5.field2547 == 0) {
                    var3 = var5.field2545;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1395(arg0);
            arg2.method3063(arg1, arg0, var7, true);
        } else {
            arg2.method3063(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ab.q(I)V")
    public static void method666() {
        while (true) {
            class176 var0 = field2551;
            class155 var1;
            synchronized (field2551) {
                var1 = (class155) field2552.method3325();
            }
            if (var1 == null) {
                return;
            }
            var1.field2548.method3063(var1.field2546, (int) var1.field2808, var1.field2545, false);
        }
    }

    @ObfuscatedName("e.a(I)V")
    public static void method131() {
        Object var0 = field2553;
        synchronized (field2553) {
            if (field2550 == 0) {
                Statics.field108.method1483(new class156(), 5);
            }
            field2550 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class176 var1 = field2551;
                class155 var2;
                synchronized (field2551) {
                    var2 = (class155) field2551.method3326();
                }
                if (var2 == null) {
                    class125.method1228(100L);
                    Object var10 = field2553;
                    synchronized (field2553) {
                        if (field2550 <= 1) {
                            field2550 = 0;
                            field2553.notifyAll();
                            return;
                        }
                        field2550--;
                    }
                } else {
                    if (var2.field2547 == 0) {
                        var2.field2546.method1396((int) var2.field2808, var2.field2545, var2.field2545.length);
                        class176 var4 = field2551;
                        synchronized (field2551) {
                            var2.method3357();
                        }
                    } else if (var2.field2547 == 1) {
                        var2.field2545 = var2.field2546.method1395((int) var2.field2808);
                        class176 var6 = field2551;
                        synchronized (field2551) {
                            field2552.method3323(var2);
                        }
                    }
                    Object var8 = field2553;
                    synchronized (field2553) {
                        if (field2550 <= 1) {
                            field2550 = 0;
                            field2553.notifyAll();
                            return;
                        }
                        field2550 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class79.method1474((String) null, var18);
        }
    }

    @ObfuscatedName("ax.g(B)V")
    public static void method527() {
        Object var0 = field2553;
        synchronized (field2553) {
            if (field2550 != 0) {
                field2550 = 1;
                try {
                    field2553.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
