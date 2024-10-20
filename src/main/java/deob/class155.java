package deob;

@ObfuscatedName("eq")
public class class155 implements Runnable {

    @ObfuscatedName("eq.z")
    public static class175 field2502 = new class175();

    @ObfuscatedName("eq.h")
    public static class175 field2498 = new class175();

    @ObfuscatedName("eq.c")
    public static int field2499 = 0;

    @ObfuscatedName("eq.p")
    public static Object field2500 = new Object();

    @ObfuscatedName("er.l(I[BLba;B)V")
    public static void method2844(int arg0, byte[] arg1, class70 arg2) {
        class154 var3 = new class154();
        var3.field2496 = 0;
        var3.field2755 = (long) arg0;
        var3.field2491 = arg1;
        var3.field2493 = arg2;
        class175 var4 = field2502;
        synchronized (field2502) {
            field2502.method3303(var3);
        }
        Object var6 = field2500;
        synchronized (field2500) {
            if (field2499 == 0) {
                Statics.field1445.method1475(new class155(), 5);
            }
            field2499 = 600;
        }
    }

    @ObfuscatedName("ei.g(I)V")
    public static void method2917() {
        while (true) {
            class175 var0 = field2502;
            class154 var1;
            synchronized (field2502) {
                var1 = (class154) field2498.method3330();
            }
            if (var1 == null) {
                return;
            }
            var1.field2492.method3038(var1.field2493, (int) var1.field2755, var1.field2491, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class175 var1 = field2502;
                class154 var2;
                synchronized (field2502) {
                    var2 = (class154) field2502.method3317();
                }
                if (var2 == null) {
                    class125.method2379(100L);
                    Object var10 = field2500;
                    synchronized (field2500) {
                        if (field2499 <= 1) {
                            field2499 = 0;
                            field2500.notifyAll();
                            return;
                        }
                        field2499--;
                    }
                } else {
                    if (var2.field2496 == 0) {
                        var2.field2493.method1386((int) var2.field2755, var2.field2491, var2.field2491.length);
                        class175 var4 = field2502;
                        synchronized (field2502) {
                            var2.method3346();
                        }
                    } else if (var2.field2496 == 1) {
                        var2.field2491 = var2.field2493.method1383((int) var2.field2755);
                        class175 var6 = field2502;
                        synchronized (field2502) {
                            field2498.method3303(var2);
                        }
                    }
                    Object var8 = field2500;
                    synchronized (field2500) {
                        if (field2499 <= 1) {
                            field2499 = 0;
                            field2500.notifyAll();
                            return;
                        }
                        field2499 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class79.method218((String) null, var18);
        }
    }
}
