package deob;

@ObfuscatedName("fl")
public class class157 implements Runnable {

    @ObfuscatedName("fl.y")
    public static class177 field2574 = new class177();

    @ObfuscatedName("fl.m")
    public static class177 field2572 = new class177();

    @ObfuscatedName("fl.d")
    public static int field2571 = 0;

    @ObfuscatedName("fl.k")
    public static Object field2573 = new Object();

    @ObfuscatedName("ba.k(ILbm;Lee;I)V")
    public static void method1518(int arg0, class71 arg1, class154 arg2) {
        class156 var3 = new class156();
        var3.field2561 = 1;
        var3.field2819 = (long) arg0;
        var3.field2563 = arg1;
        var3.field2564 = arg2;
        class177 var4 = field2574;
        synchronized (field2574) {
            field2574.method3350(var3);
        }
        method2856();
    }

    @ObfuscatedName("dy.n(ILbm;Lee;I)V")
    public static void method2226(int arg0, class71 arg1, class154 arg2) {
        byte[] var3 = null;
        class177 var4 = field2574;
        synchronized (field2574) {
            for (class156 var5 = (class156) field2574.method3355(); var5 != null; var5 = (class156) field2574.method3357()) {
                if ((long) arg0 == var5.field2819 && var5.field2563 == arg1 && var5.field2561 == 0) {
                    var3 = var5.field2565;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1404(arg0);
            arg2.method3096(arg1, arg0, var7, true);
        } else {
            arg2.method3096(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("eb.s(B)V")
    public static void method2856() {
        Object var0 = field2573;
        synchronized (field2573) {
            if (field2571 == 0) {
                Statics.field1637.method1495(new class157(), 5);
            }
            field2571 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2574;
                class156 var2;
                synchronized (field2574) {
                    var2 = (class156) field2574.method3355();
                }
                if (var2 == null) {
                    class126.method1326(100L);
                    Object var10 = field2573;
                    synchronized (field2573) {
                        if (field2571 <= 1) {
                            field2571 = 0;
                            field2573.notifyAll();
                            return;
                        }
                        field2571--;
                    }
                } else {
                    if (var2.field2561 == 0) {
                        var2.field2563.method1405((int) var2.field2819, var2.field2565, var2.field2565.length);
                        class177 var4 = field2574;
                        synchronized (field2574) {
                            var2.method3395();
                        }
                    } else if (var2.field2561 == 1) {
                        var2.field2565 = var2.field2563.method1404((int) var2.field2819);
                        class177 var6 = field2574;
                        synchronized (field2574) {
                            field2572.method3350(var2);
                        }
                    }
                    Object var8 = field2573;
                    synchronized (field2573) {
                        if (field2571 <= 1) {
                            field2571 = 0;
                            field2573.notifyAll();
                            return;
                        }
                        field2571 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method210((String) null, var18);
        }
    }

    @ObfuscatedName("eq.x(B)V")
    public static void method2965() {
        Object var0 = field2573;
        synchronized (field2573) {
            if (field2571 != 0) {
                field2571 = 1;
                try {
                    field2573.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
