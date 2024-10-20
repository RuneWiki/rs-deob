package deob;

@ObfuscatedName("fn")
public class class157 implements Runnable {

    @ObfuscatedName("fn.a")
    public static class177 field2573 = new class177();

    @ObfuscatedName("fn.x")
    public static class177 field2574 = new class177();

    @ObfuscatedName("fn.e")
    public static int field2567 = 0;

    @ObfuscatedName("fn.r")
    public static Object field2569 = new Object();

    @ObfuscatedName("bx.r(B)V")
    public static void method1353() {
        while (true) {
            class177 var0 = field2573;
            class156 var1;
            synchronized (field2573) {
                var1 = (class156) field2574.method3274();
            }
            if (var1 == null) {
                return;
            }
            var1.field2559.method3045(var1.field2561, (int) var1.field2816, var1.field2557, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2573;
                class156 var2;
                synchronized (field2573) {
                    var2 = (class156) field2573.method3252();
                }
                if (var2 == null) {
                    class126.method164(100L);
                    Object var10 = field2569;
                    synchronized (field2569) {
                        if (field2567 <= 1) {
                            field2567 = 0;
                            field2569.notifyAll();
                            return;
                        }
                        field2567--;
                    }
                } else {
                    if (var2.field2566 == 0) {
                        var2.field2561.method1375((int) var2.field2816, var2.field2557, var2.field2557.length);
                        class177 var4 = field2573;
                        synchronized (field2573) {
                            var2.method3288();
                        }
                    } else if (var2.field2566 == 1) {
                        var2.field2557 = var2.field2561.method1376((int) var2.field2816);
                        class177 var6 = field2573;
                        synchronized (field2573) {
                            field2574.method3247(var2);
                        }
                    }
                    Object var8 = field2569;
                    synchronized (field2569) {
                        if (field2567 <= 1) {
                            field2567 = 0;
                            field2569.notifyAll();
                            return;
                        }
                        field2567 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method1333((String) null, var18);
        }
    }

    @ObfuscatedName("ea.p(B)V")
    public static void method2858() {
        Object var0 = field2569;
        synchronized (field2569) {
            if (field2567 != 0) {
                field2567 = 1;
                try {
                    field2569.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
