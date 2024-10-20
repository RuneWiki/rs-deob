package deob;

@ObfuscatedName("fz")
public class class170 implements Runnable {

    @ObfuscatedName("fz.f")
    public static class199 field2696 = new class199();

    @ObfuscatedName("fz.s")
    public static class199 field2698 = new class199();

    @ObfuscatedName("fz.q")
    public static int field2697 = 0;

    @ObfuscatedName("fz.g")
    public static Object field2695 = new Object();

    @ObfuscatedName("cq.m(I[BLen;I)V")
    public static void method2041(int arg0, byte[] arg1, class134 arg2) {
        class169 var3 = new class169();
        var3.field2690 = 0;
        var3.field3105 = (long) arg0;
        var3.field2685 = arg1;
        var3.field2684 = arg2;
        class199 var4 = field2696;
        synchronized (field2696) {
            field2696.method3559(var3);
        }
        method2932();
    }

    @ObfuscatedName("cj.t(ILen;Lfb;I)V")
    public static void method2061(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2696;
        synchronized (field2696) {
            for (class169 var5 = (class169) field2696.method3566(); var5 != null; var5 = (class169) field2696.method3567()) {
                if ((long) arg0 == var5.field3105 && var5.field2684 == arg1 && var5.field2690 == 0) {
                    var3 = var5.field2685;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2693(arg0);
            arg2.method3122(arg1, arg0, var7, true);
        } else {
            arg2.method3122(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("es.j(B)V")
    public static void method2932() {
        Object var0 = field2695;
        synchronized (field2695) {
            if (field2697 == 0) {
                Statics.field2245.method2714(new class170(), 5);
            }
            field2697 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2696;
                class169 var2;
                synchronized (field2696) {
                    var2 = (class169) field2696.method3566();
                }
                if (var2 == null) {
                    class127.method1962(100L);
                    Object var10 = field2695;
                    synchronized (field2695) {
                        if (field2697 <= 1) {
                            field2697 = 0;
                            field2695.notifyAll();
                            return;
                        }
                        field2697--;
                    }
                } else {
                    if (var2.field2690 == 0) {
                        var2.field2684.method2694((int) var2.field3105, var2.field2685, var2.field2685.length);
                        class199 var4 = field2696;
                        synchronized (field2696) {
                            var2.method3665();
                        }
                    } else if (var2.field2690 == 1) {
                        var2.field2685 = var2.field2684.method2693((int) var2.field3105);
                        class199 var6 = field2696;
                        synchronized (field2696) {
                            field2698.method3559(var2);
                        }
                    }
                    Object var8 = field2695;
                    synchronized (field2695) {
                        if (field2697 <= 1) {
                            field2697 = 0;
                            field2695.notifyAll();
                            return;
                        }
                        field2697 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method1532((String) null, var18);
        }
    }

    @ObfuscatedName("ab.n(I)V")
    public static void method622() {
        Object var0 = field2695;
        synchronized (field2695) {
            if (field2697 != 0) {
                field2697 = 1;
                try {
                    field2695.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
