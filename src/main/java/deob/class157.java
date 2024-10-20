package deob;

@ObfuscatedName("fc")
public class class157 implements Runnable {

    @ObfuscatedName("fc.j")
    public static class177 field2561 = new class177();

    @ObfuscatedName("fc.r")
    public static class177 field2558 = new class177();

    @ObfuscatedName("fc.v")
    public static int field2559 = 0;

    @ObfuscatedName("fc.p")
    public static Object field2560 = new Object();

    @ObfuscatedName("ee.v(ILbt;Lei;I)V")
    public static void method2828(int arg0, class71 arg1, class154 arg2) {
        class156 var3 = new class156();
        var3.field2549 = 1;
        var3.field2809 = (long) arg0;
        var3.field2554 = arg1;
        var3.field2552 = arg2;
        class177 var4 = field2561;
        synchronized (field2561) {
            field2561.method3328(var3);
        }
        method3033();
    }

    @ObfuscatedName("f.p(B)V")
    public static void method151() {
        while (true) {
            class177 var0 = field2561;
            class156 var1;
            synchronized (field2561) {
                var1 = (class156) field2558.method3324();
            }
            if (var1 == null) {
                return;
            }
            var1.field2552.method3052(var1.field2554, (int) var1.field2809, var1.field2550, false);
        }
    }

    @ObfuscatedName("ez.e(I)V")
    public static void method3033() {
        Object var0 = field2560;
        synchronized (field2560) {
            if (field2559 == 0) {
                Statics.field2333.method1479(new class157(), 5);
            }
            field2559 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2561;
                class156 var2;
                synchronized (field2561) {
                    var2 = (class156) field2561.method3326();
                }
                if (var2 == null) {
                    class126.method1316(100L);
                    Object var10 = field2560;
                    synchronized (field2560) {
                        if (field2559 <= 1) {
                            field2559 = 0;
                            field2560.notifyAll();
                            return;
                        }
                        field2559--;
                    }
                } else {
                    if (var2.field2549 == 0) {
                        var2.field2554.method1397((int) var2.field2809, var2.field2550, var2.field2550.length);
                        class177 var4 = field2561;
                        synchronized (field2561) {
                            var2.method3359();
                        }
                    } else if (var2.field2549 == 1) {
                        var2.field2550 = var2.field2554.method1398((int) var2.field2809);
                        class177 var6 = field2561;
                        synchronized (field2561) {
                            field2558.method3328(var2);
                        }
                    }
                    Object var8 = field2560;
                    synchronized (field2560) {
                        if (field2559 <= 1) {
                            field2559 = 0;
                            field2560.notifyAll();
                            return;
                        }
                        field2559 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method2830((String) null, var18);
        }
    }

    @ObfuscatedName("bs.d(I)V")
    public static void method1373() {
        Object var0 = field2560;
        synchronized (field2560) {
            if (field2559 != 0) {
                field2559 = 1;
                try {
                    field2560.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
