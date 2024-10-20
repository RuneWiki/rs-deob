package deob;

@ObfuscatedName("ej")
public class class150 implements Runnable {

    @ObfuscatedName("ej.g")
    public static class178 field2504 = new class178();

    @ObfuscatedName("ej.s")
    public static class178 field2505 = new class178();

    @ObfuscatedName("ej.v")
    public static int field2506 = 0;

    @ObfuscatedName("ej.o")
    public static Object field2507 = new Object();

    @ObfuscatedName("eh.v(I)V")
    public static void method2618() {
        while (true) {
            class178 var0 = field2504;
            class149 var1;
            synchronized (field2504) {
                var1 = (class149) field2505.method3187();
            }
            if (var1 == null) {
                return;
            }
            var1.field2500.method2747(var1.field2499, (int) var1.field2884, var1.field2502, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class178 var1 = field2504;
                class149 var2;
                synchronized (field2504) {
                    var2 = (class149) field2504.method3189();
                }
                if (var2 == null) {
                    class114.method26(100L);
                    Object var10 = field2507;
                    synchronized (field2507) {
                        if (field2506 <= 1) {
                            field2506 = 0;
                            field2507.notifyAll();
                            return;
                        }
                        field2506--;
                    }
                } else {
                    if (var2.field2497 == 0) {
                        var2.field2499.method2398((int) var2.field2884, var2.field2502, var2.field2502.length);
                        class178 var4 = field2504;
                        synchronized (field2504) {
                            var2.method3285();
                        }
                    } else if (var2.field2497 == 1) {
                        var2.field2502 = var2.field2499.method2400((int) var2.field2884);
                        class178 var6 = field2504;
                        synchronized (field2504) {
                            field2505.method3184(var2);
                        }
                    }
                    Object var8 = field2507;
                    synchronized (field2507) {
                        if (field2506 <= 1) {
                            field2506 = 0;
                            field2507.notifyAll();
                            return;
                        }
                        field2506 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method1813((String) null, var18);
        }
    }

    @ObfuscatedName("ca.o(I)V")
    public static void method1941() {
        Object var0 = field2507;
        synchronized (field2507) {
            if (field2506 != 0) {
                field2506 = 1;
                try {
                    field2507.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
