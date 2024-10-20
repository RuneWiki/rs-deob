package deob;

@ObfuscatedName("fs")
public class class171 implements Runnable {

    @ObfuscatedName("fs.e")
    public static class200 field2709 = new class200();

    @ObfuscatedName("fs.w")
    public static class200 field2707 = new class200();

    @ObfuscatedName("fs.f")
    public static int field2708 = 0;

    @ObfuscatedName("fs.s")
    public static Object field2710 = new Object();

    @ObfuscatedName("eo.w(I[BLeq;B)V")
    public static void method2924(int arg0, byte[] arg1, class135 arg2) {
        class170 var3 = new class170();
        var3.field2704 = 0;
        var3.field3116 = (long) arg0;
        var3.field2700 = arg1;
        var3.field2701 = arg2;
        class200 var4 = field2709;
        synchronized (field2709) {
            field2709.method3553(var3);
        }
        Object var6 = field2710;
        synchronized (field2710) {
            if (field2708 == 0) {
                Statics.field2029.method2715(new class171(), 5);
            }
            field2708 = 600;
        }
    }

    @ObfuscatedName("fa.f(ILeq;Lfl;I)V")
    public static void method3112(int arg0, class135 arg1, class169 arg2) {
        byte[] var3 = null;
        class200 var4 = field2709;
        synchronized (field2709) {
            for (class170 var5 = (class170) field2709.method3544(); var5 != null; var5 = (class170) field2709.method3546()) {
                if ((long) arg0 == var5.field3116 && var5.field2701 == arg1 && var5.field2704 == 0) {
                    var3 = var5.field2700;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2678(arg0);
            arg2.method3092(arg1, arg0, var7, true);
        } else {
            arg2.method3092(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("cm.s(B)V")
    public static void method1948() {
        while (true) {
            class200 var0 = field2709;
            class170 var1;
            synchronized (field2709) {
                var1 = (class170) field2707.method3542();
            }
            if (var1 == null) {
                return;
            }
            var1.field2702.method3092(var1.field2701, (int) var1.field3116, var1.field2700, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class200 var1 = field2709;
                class170 var2;
                synchronized (field2709) {
                    var2 = (class170) field2709.method3544();
                }
                if (var2 == null) {
                    class128.method2645(100L);
                    Object var10 = field2710;
                    synchronized (field2710) {
                        if (field2708 <= 1) {
                            field2708 = 0;
                            field2710.notifyAll();
                            return;
                        }
                        field2708--;
                    }
                } else {
                    if (var2.field2704 == 0) {
                        var2.field2701.method2686((int) var2.field3116, var2.field2700, var2.field2700.length);
                        class200 var4 = field2709;
                        synchronized (field2709) {
                            var2.method3632();
                        }
                    } else if (var2.field2704 == 1) {
                        var2.field2700 = var2.field2701.method2678((int) var2.field3116);
                        class200 var6 = field2709;
                        synchronized (field2709) {
                            field2707.method3553(var2);
                        }
                    }
                    Object var8 = field2710;
                    synchronized (field2710) {
                        if (field2708 <= 1) {
                            field2708 = 0;
                            field2710.notifyAll();
                            return;
                        }
                        field2708 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class149.method17((String) null, var18);
        }
    }
}
