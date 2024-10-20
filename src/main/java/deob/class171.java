package deob;

@ObfuscatedName("ff")
public class class171 implements Runnable {

    @ObfuscatedName("ff.t")
    public static class200 field2739 = new class200();

    @ObfuscatedName("ff.i")
    public static class200 field2738 = new class200();

    @ObfuscatedName("ff.g")
    public static int field2737 = 0;

    @ObfuscatedName("ff.h")
    public static Object field2740 = new Object();

    @ObfuscatedName("fa.g(I[BLef;I)V")
    public static void method3104(int arg0, byte[] arg1, class135 arg2) {
        class170 var3 = new class170();
        var3.field2734 = 0;
        var3.field3126 = (long) arg0;
        var3.field2732 = arg1;
        var3.field2733 = arg2;
        class200 var4 = field2739;
        synchronized (field2739) {
            field2739.method3508(var3);
        }
        method1906();
    }

    @ObfuscatedName("db.h(I)V")
    public static void method2191() {
        while (true) {
            class200 var0 = field2739;
            class170 var1;
            synchronized (field2739) {
                var1 = (class170) field2738.method3526();
            }
            if (var1 == null) {
                return;
            }
            var1.field2735.method3089(var1.field2733, (int) var1.field3126, var1.field2732, false);
        }
    }

    @ObfuscatedName("cc.z(B)V")
    public static void method1906() {
        Object var0 = field2740;
        synchronized (field2740) {
            if (field2737 == 0) {
                Statics.field1401.method2701(new class171(), 5);
            }
            field2737 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class200 var1 = field2739;
                class170 var2;
                synchronized (field2739) {
                    var2 = (class170) field2739.method3534();
                }
                if (var2 == null) {
                    class128.method894(100L);
                    Object var10 = field2740;
                    synchronized (field2740) {
                        if (field2737 <= 1) {
                            field2737 = 0;
                            field2740.notifyAll();
                            return;
                        }
                        field2737--;
                    }
                } else {
                    if (var2.field2734 == 0) {
                        var2.field2733.method2664((int) var2.field3126, var2.field2732, var2.field2732.length);
                        class200 var4 = field2739;
                        synchronized (field2739) {
                            var2.method3607();
                        }
                    } else if (var2.field2734 == 1) {
                        var2.field2732 = var2.field2733.method2666((int) var2.field3126);
                        class200 var6 = field2739;
                        synchronized (field2739) {
                            field2738.method3508(var2);
                        }
                    }
                    Object var8 = field2740;
                    synchronized (field2740) {
                        if (field2737 <= 1) {
                            field2737 = 0;
                            field2740.notifyAll();
                            return;
                        }
                        field2737 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class149.method635((String) null, var18);
        }
    }

    @ObfuscatedName("ek.r(I)V")
    public static void method2697() {
        Object var0 = field2740;
        synchronized (field2740) {
            if (field2737 != 0) {
                field2737 = 1;
                try {
                    field2740.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
