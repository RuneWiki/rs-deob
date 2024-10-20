package deob;

@ObfuscatedName("gn")
public class class184 implements Runnable {

    @ObfuscatedName("gn.n")
    public static class129 field2732 = new class129();

    @ObfuscatedName("gn.d")
    public static class129 field2728 = new class129();

    @ObfuscatedName("gn.m")
    public static int field2735 = 0;

    @ObfuscatedName("gn.h")
    public static Object field2730 = new Object();

    @ObfuscatedName("ap.w(I[BLdy;I)V")
    public static void method750(int arg0, byte[] arg1, class117 arg2) {
        class181 var3 = new class181();
        var3.field2700 = 0;
        var3.field1879 = (long) arg0;
        var3.field2701 = arg1;
        var3.field2702 = arg2;
        class129 var4 = field2732;
        synchronized (field2732) {
            field2732.method2278(var3);
        }
        method733();
    }

    @ObfuscatedName("ea.r(ILdy;Lgq;I)V")
    public static void method2554(int arg0, class117 arg1, class185 arg2) {
        byte[] var3 = null;
        class129 var4 = field2732;
        synchronized (field2732) {
            for (class181 var5 = (class181) field2732.method2290(); var5 != null; var5 = (class181) field2732.method2285()) {
                if ((long) arg0 == var5.field1879 && var5.field2702 == arg1 && var5.field2700 == 0) {
                    var3 = var5.field2701;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2127(arg0);
            arg2.method3191(arg1, arg0, var7, true);
        } else {
            arg2.method3191(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("bs.c(I)V")
    public static void method1353() {
        while (true) {
            class129 var0 = field2732;
            class181 var1;
            synchronized (field2732) {
                var1 = (class181) field2728.method2298();
            }
            if (var1 == null) {
                return;
            }
            var1.field2703.method3191(var1.field2702, (int) var1.field1879, var1.field2701, false);
        }
    }

    @ObfuscatedName("af.z(I)V")
    public static void method733() {
        Object var0 = field2730;
        synchronized (field2730) {
            if (field2735 == 0) {
                Statics.field160.method1871(new class184(), 5);
            }
            field2735 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2732;
                class181 var2;
                synchronized (field2732) {
                    var2 = (class181) field2732.method2290();
                }
                if (var2 == null) {
                    Statics.method13(100L);
                    Object var10 = field2730;
                    synchronized (field2730) {
                        if (field2735 <= 1) {
                            field2735 = 0;
                            field2730.notifyAll();
                            return;
                        }
                        field2735--;
                    }
                } else {
                    if (var2.field2700 == 0) {
                        var2.field2702.method2124((int) var2.field1879, var2.field2701, var2.field2701.length);
                        class129 var4 = field2732;
                        synchronized (field2732) {
                            var2.method2273();
                        }
                    } else if (var2.field2700 == 1) {
                        var2.field2701 = var2.field2702.method2127((int) var2.field1879);
                        class129 var6 = field2732;
                        synchronized (field2732) {
                            field2728.method2278(var2);
                        }
                    }
                    Object var8 = field2730;
                    synchronized (field2730) {
                        if (field2735 <= 1) {
                            field2735 = 0;
                            field2730.notifyAll();
                            return;
                        }
                        field2735 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method755((String) null, var18);
        }
    }
}
