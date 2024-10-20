package deob;

@ObfuscatedName("ga")
public class class184 implements Runnable {

    @ObfuscatedName("ga.k")
    public static class129 field2715 = new class129();

    @ObfuscatedName("ga.y")
    public static class129 field2714 = new class129();

    @ObfuscatedName("ga.o")
    public static int field2716 = 0;

    @ObfuscatedName("ga.r")
    public static Object field2713 = new Object();

    @ObfuscatedName("m.w(I[BLdx;B)V")
    public static void method226(int arg0, byte[] arg1, class117 arg2) {
        class181 var3 = new class181();
        var3.field2686 = 0;
        var3.field1874 = (long) arg0;
        var3.field2683 = arg1;
        var3.field2684 = arg2;
        class129 var4 = field2715;
        synchronized (field2715) {
            field2715.method2220(var3);
        }
        Object var6 = field2713;
        synchronized (field2713) {
            if (field2716 == 0) {
                Statics.field1094.method1831(new class184(), 5);
            }
            field2716 = 600;
        }
    }

    @ObfuscatedName("h.j(ILdx;Lgf;B)V")
    public static void method195(int arg0, class117 arg1, class185 arg2) {
        byte[] var3 = null;
        class129 var4 = field2715;
        synchronized (field2715) {
            for (class181 var5 = (class181) field2715.method2243(); var5 != null; var5 = (class181) field2715.method2238()) {
                if ((long) arg0 == var5.field1874 && var5.field2684 == arg1 && var5.field2686 == 0) {
                    var3 = var5.field2683;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2080(arg0);
            arg2.method3171(arg1, arg0, var7, true);
        } else {
            arg2.method3171(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("cw.c(I)V")
    public static void method1787() {
        while (true) {
            class129 var0 = field2715;
            class181 var1;
            synchronized (field2715) {
                var1 = (class181) field2714.method2223();
            }
            if (var1 == null) {
                return;
            }
            var1.field2682.method3171(var1.field2684, (int) var1.field1874, var1.field2683, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2715;
                class181 var2;
                synchronized (field2715) {
                    var2 = (class181) field2715.method2243();
                }
                if (var2 == null) {
                    class169.method3344(100L);
                    Object var10 = field2713;
                    synchronized (field2713) {
                        if (field2716 <= 1) {
                            field2716 = 0;
                            field2713.notifyAll();
                            return;
                        }
                        field2716--;
                    }
                } else {
                    if (var2.field2686 == 0) {
                        var2.field2684.method2071((int) var2.field1874, var2.field2683, var2.field2683.length);
                        class129 var4 = field2715;
                        synchronized (field2715) {
                            var2.method2214();
                        }
                    } else if (var2.field2686 == 1) {
                        var2.field2683 = var2.field2684.method2080((int) var2.field1874);
                        class129 var6 = field2715;
                        synchronized (field2715) {
                            field2714.method2220(var2);
                        }
                    }
                    Object var8 = field2713;
                    synchronized (field2713) {
                        if (field2716 <= 1) {
                            field2716 = 0;
                            field2713.notifyAll();
                            return;
                        }
                        field2716 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method706((String) null, var18);
        }
    }
}
