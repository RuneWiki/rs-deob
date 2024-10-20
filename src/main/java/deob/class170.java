package deob;

@ObfuscatedName("fu")
public class class170 implements Runnable {

    @ObfuscatedName("fu.a")
    public static class199 field2697 = new class199();

    @ObfuscatedName("fu.r")
    public static class199 field2695 = new class199();

    @ObfuscatedName("fu.f")
    public static int field2696 = 0;

    @ObfuscatedName("fu.s")
    public static Object field2700 = new Object();

    @ObfuscatedName("ef.f(ILei;Lfn;I)V")
    public static void method2736(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2697;
        synchronized (field2697) {
            for (class169 var5 = (class169) field2697.method3575(); var5 != null; var5 = (class169) field2697.method3576()) {
                if ((long) arg0 == var5.field3112 && var5.field2690 == arg1 && var5.field2689 == 0) {
                    var3 = var5.field2688;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2698(arg0);
            arg2.method3121(arg1, arg0, var7, true);
        } else {
            arg2.method3121(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("l.s(I)V")
    public static void method144() {
        while (true) {
            class199 var0 = field2697;
            class169 var1;
            synchronized (field2697) {
                var1 = (class169) field2695.method3581();
            }
            if (var1 == null) {
                return;
            }
            var1.field2691.method3121(var1.field2690, (int) var1.field3112, var1.field2688, false);
        }
    }

    @ObfuscatedName("dp.y(B)V")
    public static void method2282() {
        Object var0 = field2700;
        synchronized (field2700) {
            if (field2696 == 0) {
                Statics.field2057.method2719(new class170(), 5);
            }
            field2696 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2697;
                class169 var2;
                synchronized (field2697) {
                    var2 = (class169) field2697.method3575();
                }
                if (var2 == null) {
                    class127.method2148(100L);
                    Object var10 = field2700;
                    synchronized (field2700) {
                        if (field2696 <= 1) {
                            field2696 = 0;
                            field2700.notifyAll();
                            return;
                        }
                        field2696--;
                    }
                } else {
                    if (var2.field2689 == 0) {
                        var2.field2690.method2694((int) var2.field3112, var2.field2688, var2.field2688.length);
                        class199 var4 = field2697;
                        synchronized (field2697) {
                            var2.method3661();
                        }
                    } else if (var2.field2689 == 1) {
                        var2.field2688 = var2.field2690.method2698((int) var2.field3112);
                        class199 var6 = field2697;
                        synchronized (field2697) {
                            field2695.method3570(var2);
                        }
                    }
                    Object var8 = field2700;
                    synchronized (field2700) {
                        if (field2696 <= 1) {
                            field2696 = 0;
                            field2700.notifyAll();
                            return;
                        }
                        field2696 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method643((String) null, var18);
        }
    }

    @ObfuscatedName("aq.e(I)V")
    public static void method962() {
        Object var0 = field2700;
        synchronized (field2700) {
            if (field2696 != 0) {
                field2696 = 1;
                try {
                    field2700.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
