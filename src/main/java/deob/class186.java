package deob;

@ObfuscatedName("gk")
public class class186 implements Runnable {

    @ObfuscatedName("gk.d")
    public static class150 field2728 = new class150();

    @ObfuscatedName("gk.c")
    public static class150 field2729 = new class150();

    @ObfuscatedName("gk.n")
    public static int field2730 = 0;

    @ObfuscatedName("gk.q")
    public static Object field2731 = new Object();

    @ObfuscatedName("y.p(I[BLds;B)V")
    public static void method574(int arg0, byte[] arg1, class117 arg2) {
        class183 var3 = new class183();
        var3.field2703 = 0;
        var3.field2034 = (long) arg0;
        var3.field2696 = arg1;
        var3.field2698 = arg2;
        class150 var4 = field2728;
        synchronized (field2728) {
            field2728.method2662(var3);
        }
        Object var6 = field2731;
        synchronized (field2731) {
            if (field2730 == 0) {
                Statics.field2732 = new Thread(new class186());
                Statics.field2732.setDaemon(true);
                Statics.field2732.start();
                Statics.field2732.setPriority(5);
            }
            field2730 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class150 var1 = field2728;
                class183 var2;
                synchronized (field2728) {
                    var2 = (class183) field2728.method2666();
                }
                if (var2 == null) {
                    class138.method15(100L);
                    Object var10 = field2731;
                    synchronized (field2731) {
                        if (field2730 <= 1) {
                            field2730 = 0;
                            field2731.notifyAll();
                            return;
                        }
                        field2730--;
                    }
                } else {
                    if (var2.field2703 == 0) {
                        var2.field2698.method2084((int) var2.field2034, var2.field2696, var2.field2696.length);
                        class150 var4 = field2728;
                        synchronized (field2728) {
                            var2.method2652();
                        }
                    } else if (var2.field2703 == 1) {
                        var2.field2696 = var2.field2698.method2092((int) var2.field2034);
                        class150 var6 = field2728;
                        synchronized (field2728) {
                            field2729.method2662(var2);
                        }
                    }
                    Object var8 = field2731;
                    synchronized (field2731) {
                        if (field2730 <= 1) {
                            field2730 = 0;
                            field2731.notifyAll();
                            return;
                        }
                        field2730 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method3059((String) null, var18);
        }
    }

    @ObfuscatedName("ay.u(B)V")
    public static void method725() {
        Object var0 = field2731;
        synchronized (field2731) {
            if (field2730 != 0) {
                field2730 = 1;
                try {
                    field2731.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
