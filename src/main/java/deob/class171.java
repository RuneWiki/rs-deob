package deob;

@ObfuscatedName("fs")
public class class171 implements Runnable {

    @ObfuscatedName("fs.f")
    public static class200 field2708 = new class200();

    @ObfuscatedName("fs.u")
    public static class200 field2705 = new class200();

    @ObfuscatedName("fs.x")
    public static int field2703 = 0;

    @ObfuscatedName("fs.b")
    public static Object field2706 = new Object();

    @ObfuscatedName("dz.d(I[BLef;B)V")
    public static void method2629(int arg0, byte[] arg1, class135 arg2) {
        class170 var3 = new class170();
        var3.field2698 = 0;
        var3.field3116 = (long) arg0;
        var3.field2697 = arg1;
        var3.field2699 = arg2;
        class200 var4 = field2708;
        synchronized (field2708) {
            field2708.method3610(var3);
        }
        Object var6 = field2706;
        synchronized (field2706) {
            if (field2703 == 0) {
                Statics.field137.method2729(new class171(), 5);
            }
            field2703 = 600;
        }
    }

    @ObfuscatedName("e.n(ILef;Lfo;B)V")
    public static void method190(int arg0, class135 arg1, class169 arg2) {
        class170 var3 = new class170();
        var3.field2698 = 1;
        var3.field3116 = (long) arg0;
        var3.field2699 = arg1;
        var3.field2700 = arg2;
        class200 var4 = field2708;
        synchronized (field2708) {
            field2708.method3610(var3);
        }
        Object var6 = field2706;
        synchronized (field2706) {
            if (field2703 == 0) {
                Statics.field137.method2729(new class171(), 5);
            }
            field2703 = 600;
        }
    }

    @ObfuscatedName("cx.m(ILef;Lfo;I)V")
    public static void method1825(int arg0, class135 arg1, class169 arg2) {
        byte[] var3 = null;
        class200 var4 = field2708;
        synchronized (field2708) {
            for (class170 var5 = (class170) field2708.method3585(); var5 != null; var5 = (class170) field2708.method3590()) {
                if ((long) arg0 == var5.field3116 && var5.field2699 == arg1 && var5.field2698 == 0) {
                    var3 = var5.field2697;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2709(arg0);
            arg2.method3139(arg1, arg0, var7, true);
        } else {
            arg2.method3139(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("es.g(B)V")
    public static void method2671() {
        while (true) {
            class200 var0 = field2708;
            class170 var1;
            synchronized (field2708) {
                var1 = (class170) field2705.method3586();
            }
            if (var1 == null) {
                return;
            }
            var1.field2700.method3139(var1.field2699, (int) var1.field3116, var1.field2697, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class200 var1 = field2708;
                class170 var2;
                synchronized (field2708) {
                    var2 = (class170) field2708.method3585();
                }
                if (var2 == null) {
                    class128.method2102(100L);
                    Object var10 = field2706;
                    synchronized (field2706) {
                        if (field2703 <= 1) {
                            field2703 = 0;
                            field2706.notifyAll();
                            return;
                        }
                        field2703--;
                    }
                } else {
                    if (var2.field2698 == 0) {
                        var2.field2699.method2711((int) var2.field3116, var2.field2697, var2.field2697.length);
                        class200 var4 = field2708;
                        synchronized (field2708) {
                            var2.method3679();
                        }
                    } else if (var2.field2698 == 1) {
                        var2.field2697 = var2.field2699.method2709((int) var2.field3116);
                        class200 var6 = field2708;
                        synchronized (field2708) {
                            field2705.method3610(var2);
                        }
                    }
                    Object var8 = field2706;
                    synchronized (field2706) {
                        if (field2703 <= 1) {
                            field2703 = 0;
                            field2706.notifyAll();
                            return;
                        }
                        field2703 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class149.method957((String) null, var18);
        }
    }
}
