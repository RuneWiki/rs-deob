package deob;

@ObfuscatedName("ej")
public class class155 implements Runnable {

    @ObfuscatedName("ej.g")
    public static class175 field2518 = new class175();

    @ObfuscatedName("ej.e")
    public static class175 field2511 = new class175();

    @ObfuscatedName("ej.n")
    public static int field2516 = 0;

    @ObfuscatedName("ej.j")
    public static Object field2513 = new Object();

    @ObfuscatedName("ae.n(I[BLby;I)V")
    public static void method899(int arg0, byte[] arg1, class70 arg2) {
        class154 var3 = new class154();
        var3.field2508 = 0;
        var3.field2760 = (long) arg0;
        var3.field2505 = arg1;
        var3.field2506 = arg2;
        class175 var4 = field2518;
        synchronized (field2518) {
            field2518.method3379(var3);
        }
        Object var6 = field2513;
        synchronized (field2513) {
            if (field2516 == 0) {
                Statics.field1791.method1485(new class155(), 5);
            }
            field2516 = 600;
        }
    }

    @ObfuscatedName("n.j(I)V")
    public static void method25() {
        while (true) {
            class175 var0 = field2518;
            class154 var1;
            synchronized (field2518) {
                var1 = (class154) field2511.method3380();
            }
            if (var1 == null) {
                return;
            }
            var1.field2507.method3107(var1.field2506, (int) var1.field2760, var1.field2505, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class175 var1 = field2518;
                class154 var2;
                synchronized (field2518) {
                    var2 = (class154) field2518.method3382();
                }
                if (var2 == null) {
                    class125.method2058(100L);
                    Object var10 = field2513;
                    synchronized (field2513) {
                        if (field2516 <= 1) {
                            field2516 = 0;
                            field2513.notifyAll();
                            return;
                        }
                        field2516--;
                    }
                } else {
                    if (var2.field2508 == 0) {
                        var2.field2506.method1388((int) var2.field2760, var2.field2505, var2.field2505.length);
                        class175 var4 = field2518;
                        synchronized (field2518) {
                            var2.method3415();
                        }
                    } else if (var2.field2508 == 1) {
                        var2.field2505 = var2.field2506.method1389((int) var2.field2760);
                        class175 var6 = field2518;
                        synchronized (field2518) {
                            field2511.method3379(var2);
                        }
                    }
                    Object var8 = field2513;
                    synchronized (field2513) {
                        if (field2516 <= 1) {
                            field2516 = 0;
                            field2513.notifyAll();
                            return;
                        }
                        field2516 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class79.method126((String) null, var18);
        }
    }
}
