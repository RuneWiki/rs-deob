package deob;

@ObfuscatedName("fi")
public class class171 implements Runnable {

    @ObfuscatedName("fi.s")
    public static class200 field2723 = new class200();

    @ObfuscatedName("fi.j")
    public static class200 field2721 = new class200();

    @ObfuscatedName("fi.p")
    public static int field2722 = 0;

    @ObfuscatedName("fi.x")
    public static Object field2724 = new Object();

    @ObfuscatedName("m.x(ILev;Lfg;I)V")
    public static void method169(int arg0, class135 arg1, class169 arg2) {
        class170 var3 = new class170();
        var3.field2713 = 1;
        var3.field3126 = (long) arg0;
        var3.field2714 = arg1;
        var3.field2717 = arg2;
        class200 var4 = field2723;
        synchronized (field2723) {
            field2723.method3548(var3);
        }
        Object var6 = field2724;
        synchronized (field2724) {
            if (field2722 == 0) {
                Statics.field879.method2704(new class171(), 5);
            }
            field2722 = 600;
        }
    }

    @ObfuscatedName("h.d(ILev;Lfg;I)V")
    public static void method194(int arg0, class135 arg1, class169 arg2) {
        byte[] var3 = null;
        class200 var4 = field2723;
        synchronized (field2723) {
            for (class170 var5 = (class170) field2723.method3553(); var5 != null; var5 = (class170) field2723.method3558()) {
                if ((long) arg0 == var5.field3126 && var5.field2714 == arg1 && var5.field2713 == 0) {
                    var3 = var5.field2715;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2696(arg0);
            arg2.method3105(arg1, arg0, var7, true);
        } else {
            arg2.method3105(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("aw.u(I)V")
    public static void method872() {
        while (true) {
            class200 var0 = field2723;
            class170 var1;
            synchronized (field2723) {
                var1 = (class170) field2721.method3551();
            }
            if (var1 == null) {
                return;
            }
            var1.field2717.method3105(var1.field2714, (int) var1.field3126, var1.field2715, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class200 var1 = field2723;
                class170 var2;
                synchronized (field2723) {
                    var2 = (class170) field2723.method3553();
                }
                if (var2 == null) {
                    class128.method2294(100L);
                    Object var10 = field2724;
                    synchronized (field2724) {
                        if (field2722 <= 1) {
                            field2722 = 0;
                            field2724.notifyAll();
                            return;
                        }
                        field2722--;
                    }
                } else {
                    if (var2.field2713 == 0) {
                        var2.field2714.method2691((int) var2.field3126, var2.field2715, var2.field2715.length);
                        class200 var4 = field2723;
                        synchronized (field2723) {
                            var2.method3639();
                        }
                    } else if (var2.field2713 == 1) {
                        var2.field2715 = var2.field2714.method2696((int) var2.field3126);
                        class200 var6 = field2723;
                        synchronized (field2723) {
                            field2721.method3548(var2);
                        }
                    }
                    Object var8 = field2724;
                    synchronized (field2724) {
                        if (field2722 <= 1) {
                            field2722 = 0;
                            field2724.notifyAll();
                            return;
                        }
                        field2722 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class149.method1942((String) null, var18);
        }
    }

    @ObfuscatedName("av.o(S)V")
    public static void method965() {
        Object var0 = field2724;
        synchronized (field2724) {
            if (field2722 != 0) {
                field2722 = 1;
                try {
                    field2724.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
