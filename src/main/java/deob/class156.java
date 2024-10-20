package deob;

@ObfuscatedName("ew")
public class class156 implements Runnable {

    @ObfuscatedName("ew.v")
    public static class176 field2560 = new class176();

    @ObfuscatedName("ew.f")
    public static class176 field2555 = new class176();

    @ObfuscatedName("ew.n")
    public static int field2557 = 0;

    @ObfuscatedName("ew.c")
    public static Object field2558 = new Object();

    @ObfuscatedName("q.r(I[BLbg;I)V")
    public static void method50(int arg0, byte[] arg1, class70 arg2) {
        class155 var3 = new class155();
        var3.field2548 = 0;
        var3.field2814 = (long) arg0;
        var3.field2547 = arg1;
        var3.field2546 = arg2;
        class176 var4 = field2560;
        synchronized (field2560) {
            field2560.method3316(var3);
        }
        Object var6 = field2558;
        synchronized (field2558) {
            if (field2557 == 0) {
                Statics.field960.method1522(new class156(), 5);
            }
            field2557 = 600;
        }
    }

    @ObfuscatedName("cj.k(ILbg;Leq;I)V")
    public static void method1665(int arg0, class70 arg1, class153 arg2) {
        class155 var3 = new class155();
        var3.field2548 = 1;
        var3.field2814 = (long) arg0;
        var3.field2546 = arg1;
        var3.field2549 = arg2;
        class176 var4 = field2560;
        synchronized (field2560) {
            field2560.method3316(var3);
        }
        Object var6 = field2558;
        synchronized (field2558) {
            if (field2557 == 0) {
                Statics.field960.method1522(new class156(), 5);
            }
            field2557 = 600;
        }
    }

    @ObfuscatedName("dm.e(I)V")
    public static void method2450() {
        while (true) {
            class176 var0 = field2560;
            class155 var1;
            synchronized (field2560) {
                var1 = (class155) field2555.method3292();
            }
            if (var1 == null) {
                return;
            }
            var1.field2549.method3063(var1.field2546, (int) var1.field2814, var1.field2547, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class176 var1 = field2560;
                class155 var2;
                synchronized (field2560) {
                    var2 = (class155) field2560.method3294();
                }
                if (var2 == null) {
                    class125.method2683(100L);
                    Object var10 = field2558;
                    synchronized (field2558) {
                        if (field2557 <= 1) {
                            field2557 = 0;
                            field2558.notifyAll();
                            return;
                        }
                        field2557--;
                    }
                } else {
                    if (var2.field2548 == 0) {
                        var2.field2546.method1431((int) var2.field2814, var2.field2547, var2.field2547.length);
                        class176 var4 = field2560;
                        synchronized (field2560) {
                            var2.method3320();
                        }
                    } else if (var2.field2548 == 1) {
                        var2.field2547 = var2.field2546.method1430((int) var2.field2814);
                        class176 var6 = field2560;
                        synchronized (field2560) {
                            field2555.method3316(var2);
                        }
                    }
                    Object var8 = field2558;
                    synchronized (field2558) {
                        if (field2557 <= 1) {
                            field2557 = 0;
                            field2558.notifyAll();
                            return;
                        }
                        field2557 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class79.method811((String) null, var18);
        }
    }
}
