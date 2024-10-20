package deob;

@ObfuscatedName("fj")
public class class157 implements Runnable {

    @ObfuscatedName("fj.p")
    public static class177 field2567 = new class177();

    @ObfuscatedName("fj.i")
    public static class177 field2568 = new class177();

    @ObfuscatedName("fj.o")
    public static int field2573 = 0;

    @ObfuscatedName("fj.n")
    public static Object field2570 = new Object();

    @ObfuscatedName("x.o(I)V")
    public static void method62() {
        while (true) {
            class177 var0 = field2567;
            class156 var1;
            synchronized (field2567) {
                var1 = (class156) field2568.method3353();
            }
            if (var1 == null) {
                return;
            }
            var1.field2564.method3086(var1.field2563, (int) var1.field2820, var1.field2562, false);
        }
    }

    @ObfuscatedName("ae.n(I)V")
    public static void method577() {
        Object var0 = field2570;
        synchronized (field2570) {
            if (field2573 == 0) {
                Statics.field895.method1521(new class157(), 5);
            }
            field2573 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2567;
                class156 var2;
                synchronized (field2567) {
                    var2 = (class156) field2567.method3334();
                }
                if (var2 == null) {
                    class126.method2420(100L);
                    Object var10 = field2570;
                    synchronized (field2570) {
                        if (field2573 <= 1) {
                            field2573 = 0;
                            field2570.notifyAll();
                            return;
                        }
                        field2573--;
                    }
                } else {
                    if (var2.field2561 == 0) {
                        var2.field2563.method1432((int) var2.field2820, var2.field2562, var2.field2562.length);
                        class177 var4 = field2567;
                        synchronized (field2567) {
                            var2.method3360();
                        }
                    } else if (var2.field2561 == 1) {
                        var2.field2562 = var2.field2563.method1437((int) var2.field2820);
                        class177 var6 = field2567;
                        synchronized (field2567) {
                            field2568.method3328(var2);
                        }
                    }
                    Object var8 = field2570;
                    synchronized (field2570) {
                        if (field2573 <= 1) {
                            field2573 = 0;
                            field2570.notifyAll();
                            return;
                        }
                        field2573 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method1379((String) null, var18);
        }
    }

    @ObfuscatedName("ao.l(I)V")
    public static void method665() {
        Object var0 = field2570;
        synchronized (field2570) {
            if (field2573 != 0) {
                field2573 = 1;
                try {
                    field2570.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
