package deob;

@ObfuscatedName("fg")
public class class157 implements Runnable {

    @ObfuscatedName("fg.d")
    public static class177 field2583 = new class177();

    @ObfuscatedName("fg.g")
    public static class177 field2579 = new class177();

    @ObfuscatedName("fg.a")
    public static int field2580 = 0;

    @ObfuscatedName("fg.t")
    public static Object field2581 = new Object();

    @ObfuscatedName("ez.a(I[BLbo;I)V")
    public static void method2620(int arg0, byte[] arg1, class71 arg2) {
        class156 var3 = new class156();
        var3.field2577 = 0;
        var3.field2818 = (long) arg0;
        var3.field2573 = arg1;
        var3.field2576 = arg2;
        class177 var4 = field2583;
        synchronized (field2583) {
            field2583.method3273(var3);
        }
        Object var6 = field2581;
        synchronized (field2581) {
            if (field2580 == 0) {
                Statics.field1652.method1460(new class157(), 5);
            }
            field2580 = 600;
        }
    }

    @ObfuscatedName("by.t(I)V")
    public static void method1480() {
        while (true) {
            class177 var0 = field2583;
            class156 var1;
            synchronized (field2583) {
                var1 = (class156) field2579.method3274();
            }
            if (var1 == null) {
                return;
            }
            var1.field2575.method3031(var1.field2576, (int) var1.field2818, var1.field2573, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2583;
                class156 var2;
                synchronized (field2583) {
                    var2 = (class156) field2583.method3278();
                }
                if (var2 == null) {
                    class126.method112(100L);
                    Object var10 = field2581;
                    synchronized (field2581) {
                        if (field2580 <= 1) {
                            field2580 = 0;
                            field2581.notifyAll();
                            return;
                        }
                        field2580--;
                    }
                } else {
                    if (var2.field2577 == 0) {
                        var2.field2576.method1387((int) var2.field2818, var2.field2573, var2.field2573.length);
                        class177 var4 = field2583;
                        synchronized (field2583) {
                            var2.method3306();
                        }
                    } else if (var2.field2577 == 1) {
                        var2.field2573 = var2.field2576.method1379((int) var2.field2818);
                        class177 var6 = field2583;
                        synchronized (field2583) {
                            field2579.method3273(var2);
                        }
                    }
                    Object var8 = field2581;
                    synchronized (field2581) {
                        if (field2580 <= 1) {
                            field2580 = 0;
                            field2581.notifyAll();
                            return;
                        }
                        field2580 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method2305((String) null, var18);
        }
    }
}
