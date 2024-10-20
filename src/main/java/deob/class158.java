package deob;

@ObfuscatedName("ff")
public class class158 implements Runnable {

    @ObfuscatedName("ff.c")
    public static class177 field2601 = new class177();

    @ObfuscatedName("ff.q")
    public static class177 field2595 = new class177();

    @ObfuscatedName("ff.y")
    public static int field2598 = 0;

    @ObfuscatedName("ff.v")
    public static Object field2597 = new Object();

    @ObfuscatedName("cv.q(I[BLbn;I)V")
    public static void method1963(int arg0, byte[] arg1, class71 arg2) {
        class157 var3 = new class157();
        var3.field2591 = 0;
        var3.field2824 = (long) arg0;
        var3.field2590 = arg1;
        var3.field2589 = arg2;
        class177 var4 = field2601;
        synchronized (field2601) {
            field2601.method3158(var3);
        }
        method1506();
    }

    @ObfuscatedName("bm.y(B)V")
    public static void method1232() {
        while (true) {
            class177 var0 = field2601;
            class157 var1;
            synchronized (field2601) {
                var1 = (class157) field2595.method3161();
            }
            if (var1 == null) {
                return;
            }
            var1.field2592.method2977(var1.field2589, (int) var1.field2824, var1.field2590, false);
        }
    }

    @ObfuscatedName("bq.v(I)V")
    public static void method1506() {
        Object var0 = field2597;
        synchronized (field2597) {
            if (field2598 == 0) {
                Statics.field271.method1433(new class158(), 5);
            }
            field2598 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2601;
                class157 var2;
                synchronized (field2601) {
                    var2 = (class157) field2601.method3163();
                }
                if (var2 == null) {
                    class126.method577(100L);
                    Object var10 = field2597;
                    synchronized (field2597) {
                        if (field2598 <= 1) {
                            field2598 = 0;
                            field2597.notifyAll();
                            return;
                        }
                        field2598--;
                    }
                } else {
                    if (var2.field2591 == 0) {
                        var2.field2589.method1352((int) var2.field2824, var2.field2590, var2.field2590.length);
                        class177 var4 = field2601;
                        synchronized (field2601) {
                            var2.method3196();
                        }
                    } else if (var2.field2591 == 1) {
                        var2.field2590 = var2.field2589.method1351((int) var2.field2824);
                        class177 var6 = field2601;
                        synchronized (field2601) {
                            field2595.method3158(var2);
                        }
                    }
                    Object var8 = field2597;
                    synchronized (field2597) {
                        if (field2598 <= 1) {
                            field2598 = 0;
                            field2597.notifyAll();
                            return;
                        }
                        field2598 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method789((String) null, var18);
        }
    }

    @ObfuscatedName("cv.g(I)V")
    public static void method1964() {
        Object var0 = field2597;
        synchronized (field2597) {
            if (field2598 != 0) {
                field2598 = 1;
                try {
                    field2597.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
