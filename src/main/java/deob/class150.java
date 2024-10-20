package deob;

@ObfuscatedName("ec")
public class class150 implements Runnable {

    @ObfuscatedName("ec.n")
    public static class178 field2488 = new class178();

    @ObfuscatedName("ec.x")
    public static class178 field2487 = new class178();

    @ObfuscatedName("ec.k")
    public static int field2491 = 0;

    @ObfuscatedName("ec.i")
    public static Object field2489 = new Object();

    @ObfuscatedName("al.d(I)V")
    public static void method550() {
        Object var0 = field2489;
        synchronized (field2489) {
            if (field2491 == 0) {
                Statics.field1932.method2458(new class150(), 5);
            }
            field2491 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class178 var1 = field2488;
                class149 var2;
                synchronized (field2488) {
                    var2 = (class149) field2488.method3179();
                }
                if (var2 == null) {
                    class114.method25(100L);
                    Object var10 = field2489;
                    synchronized (field2489) {
                        if (field2491 <= 1) {
                            field2491 = 0;
                            field2489.notifyAll();
                            return;
                        }
                        field2491--;
                    }
                } else {
                    if (var2.field2481 == 0) {
                        var2.field2479.method2437((int) var2.field2888, var2.field2478, var2.field2478.length);
                        class178 var4 = field2488;
                        synchronized (field2488) {
                            var2.method3277();
                        }
                    } else if (var2.field2481 == 1) {
                        var2.field2478 = var2.field2479.method2434((int) var2.field2888);
                        class178 var6 = field2488;
                        synchronized (field2488) {
                            field2487.method3181(var2);
                        }
                    }
                    Object var8 = field2489;
                    synchronized (field2489) {
                        if (field2491 <= 1) {
                            field2491 = 0;
                            field2489.notifyAll();
                            return;
                        }
                        field2491 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method3084((String) null, var18);
        }
    }
}
