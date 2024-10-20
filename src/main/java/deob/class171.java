package deob;

@ObfuscatedName("fc")
public class class171 implements Runnable {

    @ObfuscatedName("fc.a")
    public static class200 field2708 = new class200();

    @ObfuscatedName("fc.w")
    public static class200 field2712 = new class200();

    @ObfuscatedName("fc.d")
    public static int field2707 = 0;

    @ObfuscatedName("fc.c")
    public static Object field2706 = new Object();

    @ObfuscatedName("i.w(ILec;Lfb;S)V")
    public static void method192(int arg0, class135 arg1, class169 arg2) {
        byte[] var3 = null;
        class200 var4 = field2708;
        synchronized (field2708) {
            for (class170 var5 = (class170) field2708.method3665(); var5 != null; var5 = (class170) field2708.method3641()) {
                if ((long) arg0 == var5.field3126 && var5.field2700 == arg1 && var5.field2699 == 0) {
                    var3 = var5.field2696;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2819(arg0);
            arg2.method3228(arg1, arg0, var7, true);
        } else {
            arg2.method3228(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("l.d(I)V")
    public static void method655() {
        while (true) {
            class200 var0 = field2708;
            class170 var1;
            synchronized (field2708) {
                var1 = (class170) field2712.method3642();
            }
            if (var1 == null) {
                return;
            }
            var1.field2698.method3228(var1.field2700, (int) var1.field3126, var1.field2696, false);
        }
    }

    @ObfuscatedName("j.c(I)V")
    public static void method223() {
        Object var0 = field2706;
        synchronized (field2706) {
            if (field2707 == 0) {
                Statics.field1875.method2831(new class171(), 5);
            }
            field2707 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class200 var1 = field2708;
                class170 var2;
                synchronized (field2708) {
                    var2 = (class170) field2708.method3665();
                }
                if (var2 == null) {
                    class128.method56(100L);
                    Object var10 = field2706;
                    synchronized (field2706) {
                        if (field2707 <= 1) {
                            field2707 = 0;
                            field2706.notifyAll();
                            return;
                        }
                        field2707--;
                    }
                } else {
                    if (var2.field2699 == 0) {
                        var2.field2700.method2817((int) var2.field3126, var2.field2696, var2.field2696.length);
                        class200 var4 = field2708;
                        synchronized (field2708) {
                            var2.method3737();
                        }
                    } else if (var2.field2699 == 1) {
                        var2.field2696 = var2.field2700.method2819((int) var2.field3126);
                        class200 var6 = field2708;
                        synchronized (field2708) {
                            field2712.method3639(var2);
                        }
                    }
                    Object var8 = field2706;
                    synchronized (field2706) {
                        if (field2707 <= 1) {
                            field2707 = 0;
                            field2706.notifyAll();
                            return;
                        }
                        field2707 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class149.method650((String) null, var18);
        }
    }

    @ObfuscatedName("du.y(I)V")
    public static void method2774() {
        Object var0 = field2706;
        synchronized (field2706) {
            if (field2707 != 0) {
                field2707 = 1;
                try {
                    field2706.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
