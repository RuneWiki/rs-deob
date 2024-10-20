package deob;

@ObfuscatedName("fl")
public class class157 implements Runnable {

    @ObfuscatedName("fl.i")
    public static class177 field2567 = new class177();

    @ObfuscatedName("fl.v")
    public static class177 field2568 = new class177();

    @ObfuscatedName("fl.m")
    public static int field2571 = 0;

    @ObfuscatedName("fl.j")
    public static Object field2569 = new Object();

    @ObfuscatedName("ci.m(ILbt;Leh;I)V")
    public static void method1883(int arg0, class71 arg1, class154 arg2) {
        class156 var3 = new class156();
        var3.field2561 = 1;
        var3.field2818 = (long) arg0;
        var3.field2563 = arg1;
        var3.field2564 = arg2;
        class177 var4 = field2567;
        synchronized (field2567) {
            field2567.method3364(var3);
        }
        method28();
    }

    @ObfuscatedName("o.j(I)V")
    public static void method28() {
        Object var0 = field2569;
        synchronized (field2569) {
            if (field2571 == 0) {
                Statics.field1325.method1525(new class157(), 5);
            }
            field2571 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2567;
                class156 var2;
                synchronized (field2567) {
                    var2 = (class156) field2567.method3369();
                }
                if (var2 == null) {
                    class126.method1440(100L);
                    Object var10 = field2569;
                    synchronized (field2569) {
                        if (field2571 <= 1) {
                            field2571 = 0;
                            field2569.notifyAll();
                            return;
                        }
                        field2571--;
                    }
                } else {
                    if (var2.field2561 == 0) {
                        var2.field2563.method1429((int) var2.field2818, var2.field2562, var2.field2562.length);
                        class177 var4 = field2567;
                        synchronized (field2567) {
                            var2.method3409();
                        }
                    } else if (var2.field2561 == 1) {
                        var2.field2562 = var2.field2563.method1430((int) var2.field2818);
                        class177 var6 = field2567;
                        synchronized (field2567) {
                            field2568.method3364(var2);
                        }
                    }
                    Object var8 = field2569;
                    synchronized (field2569) {
                        if (field2571 <= 1) {
                            field2571 = 0;
                            field2569.notifyAll();
                            return;
                        }
                        field2571 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method562((String) null, var18);
        }
    }
}
