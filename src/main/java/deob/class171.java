package deob;

@ObfuscatedName("fd")
public class class171 implements Runnable {

    @ObfuscatedName("fd.w")
    public static class200 field2730 = new class200();

    @ObfuscatedName("fd.x")
    public static class200 field2732 = new class200();

    @ObfuscatedName("fd.t")
    public static int field2729 = 0;

    @ObfuscatedName("fd.p")
    public static Object field2727 = new Object();

    @ObfuscatedName("eh.x(I[BLel;I)V")
    public static void method2683(int arg0, byte[] arg1, class135 arg2) {
        class170 var3 = new class170();
        var3.field2724 = 0;
        var3.field3124 = (long) arg0;
        var3.field2722 = arg1;
        var3.field2723 = arg2;
        class200 var4 = field2730;
        synchronized (field2730) {
            field2730.method3583(var3);
        }
        Object var6 = field2727;
        synchronized (field2727) {
            if (field2729 == 0) {
                Statics.field2037.method2739(new class171(), 5);
            }
            field2729 = 600;
        }
    }

    @ObfuscatedName("cj.t(ILel;Lfn;I)V")
    public static void method2057(int arg0, class135 arg1, class169 arg2) {
        byte[] var3 = null;
        class200 var4 = field2730;
        synchronized (field2730) {
            for (class170 var5 = (class170) field2730.method3585(); var5 != null; var5 = (class170) field2730.method3590()) {
                if ((long) arg0 == var5.field3124 && var5.field2723 == arg1 && var5.field2724 == 0) {
                    var3 = var5.field2722;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2725(arg0);
            arg2.method3158(arg1, arg0, var7, true);
        } else {
            arg2.method3158(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class200 var1 = field2730;
                class170 var2;
                synchronized (field2730) {
                    var2 = (class170) field2730.method3585();
                }
                if (var2 == null) {
                    class128.method2158(100L);
                    Object var10 = field2727;
                    synchronized (field2727) {
                        if (field2729 <= 1) {
                            field2729 = 0;
                            field2727.notifyAll();
                            return;
                        }
                        field2729--;
                    }
                } else {
                    if (var2.field2724 == 0) {
                        var2.field2723.method2717((int) var2.field3124, var2.field2722, var2.field2722.length);
                        class200 var4 = field2730;
                        synchronized (field2730) {
                            var2.method3684();
                        }
                    } else if (var2.field2724 == 1) {
                        var2.field2722 = var2.field2723.method2725((int) var2.field3124);
                        class200 var6 = field2730;
                        synchronized (field2730) {
                            field2732.method3583(var2);
                        }
                    }
                    Object var8 = field2727;
                    synchronized (field2727) {
                        if (field2729 <= 1) {
                            field2729 = 0;
                            field2727.notifyAll();
                            return;
                        }
                        field2729 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class149.method1((String) null, var18);
        }
    }

    @ObfuscatedName("ed.p(B)V")
    public static void method2978() {
        Object var0 = field2727;
        synchronized (field2727) {
            if (field2729 != 0) {
                field2729 = 1;
                try {
                    field2727.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
