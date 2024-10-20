package deob;

@ObfuscatedName("fc")
public class class157 implements Runnable {

    @ObfuscatedName("fc.i")
    public static class177 field2567 = new class177();

    @ObfuscatedName("fc.w")
    public static class177 field2565 = new class177();

    @ObfuscatedName("fc.f")
    public static int field2566 = 0;

    @ObfuscatedName("fc.e")
    public static Object field2564 = new Object();

    @ObfuscatedName("ey.e(ILbk;Lez;B)V")
    public static void method2741(int arg0, class71 arg1, class154 arg2) {
        class156 var3 = new class156();
        var3.field2563 = 1;
        var3.field2817 = (long) arg0;
        var3.field2559 = arg1;
        var3.field2560 = arg2;
        class177 var4 = field2567;
        synchronized (field2567) {
            field2567.method3289(var3);
        }
        Object var6 = field2564;
        synchronized (field2564) {
            if (field2566 == 0) {
                Statics.field293.method1475(new class157(), 5);
            }
            field2566 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2567;
                class156 var2;
                synchronized (field2567) {
                    var2 = (class156) field2567.method3294();
                }
                if (var2 == null) {
                    class126.method738(100L);
                    Object var10 = field2564;
                    synchronized (field2564) {
                        if (field2566 <= 1) {
                            field2566 = 0;
                            field2564.notifyAll();
                            return;
                        }
                        field2566--;
                    }
                } else {
                    if (var2.field2563 == 0) {
                        var2.field2559.method1393((int) var2.field2817, var2.field2562, var2.field2562.length);
                        class177 var4 = field2567;
                        synchronized (field2567) {
                            var2.method3328();
                        }
                    } else if (var2.field2563 == 1) {
                        var2.field2562 = var2.field2559.method1392((int) var2.field2817);
                        class177 var6 = field2567;
                        synchronized (field2567) {
                            field2565.method3289(var2);
                        }
                    }
                    Object var8 = field2564;
                    synchronized (field2564) {
                        if (field2566 <= 1) {
                            field2566 = 0;
                            field2564.notifyAll();
                            return;
                        }
                        field2566 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method4((String) null, var18);
        }
    }

    @ObfuscatedName("cl.t(I)V")
    public static void method2039() {
        Object var0 = field2564;
        synchronized (field2564) {
            if (field2566 != 0) {
                field2566 = 1;
                try {
                    field2564.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
