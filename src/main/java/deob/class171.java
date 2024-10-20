package deob;

@ObfuscatedName("ft")
public class class171 implements Runnable {

    @ObfuscatedName("ft.j")
    public static class200 field2703 = new class200();

    @ObfuscatedName("ft.h")
    public static class200 field2708 = new class200();

    @ObfuscatedName("ft.m")
    public static int field2706 = 0;

    @ObfuscatedName("ft.z")
    public static Object field2705 = new Object();

    @ObfuscatedName("cs.m(I[BLet;I)V")
    public static void method1787(int arg0, byte[] arg1, class135 arg2) {
        class170 var3 = new class170();
        var3.field2695 = 0;
        var3.field3123 = (long) arg0;
        var3.field2694 = arg1;
        var3.field2700 = arg2;
        class200 var4 = field2703;
        synchronized (field2703) {
            field2703.method3535(var3);
        }
        method2957();
    }

    @ObfuscatedName("at.z(ILet;Lfm;I)V")
    public static void method887(int arg0, class135 arg1, class169 arg2) {
        byte[] var3 = null;
        class200 var4 = field2703;
        synchronized (field2703) {
            for (class170 var5 = (class170) field2703.method3540(); var5 != null; var5 = (class170) field2703.method3533()) {
                if ((long) arg0 == var5.field3123 && var5.field2700 == arg1 && var5.field2695 == 0) {
                    var3 = var5.field2694;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2686(arg0);
            arg2.method3094(arg1, arg0, var7, true);
        } else {
            arg2.method3094(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("fe.x(B)V")
    public static void method2957() {
        Object var0 = field2705;
        synchronized (field2705) {
            if (field2706 == 0) {
                Statics.field2154.method2706(new class171(), 5);
            }
            field2706 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class200 var1 = field2703;
                class170 var2;
                synchronized (field2703) {
                    var2 = (class170) field2703.method3540();
                }
                if (var2 == null) {
                    class128.method167(100L);
                    Object var10 = field2705;
                    synchronized (field2705) {
                        if (field2706 <= 1) {
                            field2706 = 0;
                            field2705.notifyAll();
                            return;
                        }
                        field2706--;
                    }
                } else {
                    if (var2.field2695 == 0) {
                        var2.field2700.method2687((int) var2.field3123, var2.field2694, var2.field2694.length);
                        class200 var4 = field2703;
                        synchronized (field2703) {
                            var2.method3639();
                        }
                    } else if (var2.field2695 == 1) {
                        var2.field2694 = var2.field2700.method2686((int) var2.field3123);
                        class200 var6 = field2703;
                        synchronized (field2703) {
                            field2708.method3535(var2);
                        }
                    }
                    Object var8 = field2705;
                    synchronized (field2705) {
                        if (field2706 <= 1) {
                            field2706 = 0;
                            field2705.notifyAll();
                            return;
                        }
                        field2706 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class149.method101((String) null, var18);
        }
    }

    @ObfuscatedName("ez.e(I)V")
    public static void method2910() {
        Object var0 = field2705;
        synchronized (field2705) {
            if (field2706 != 0) {
                field2706 = 1;
                try {
                    field2705.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
