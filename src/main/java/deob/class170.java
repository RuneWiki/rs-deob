package deob;

@ObfuscatedName("fd")
public class class170 implements Runnable {

    @ObfuscatedName("fd.v")
    public static class199 field2713 = new class199();

    @ObfuscatedName("fd.f")
    public static class199 field2714 = new class199();

    @ObfuscatedName("fd.i")
    public static int field2715 = 0;

    @ObfuscatedName("fd.d")
    public static Object field2716 = new Object();

    @ObfuscatedName("fd.d(ILeh;Lfx;B)V")
    public static void method3143(int arg0, class134 arg1, class168 arg2) {
        class169 var3 = new class169();
        var3.field2706 = 1;
        var3.field3115 = (long) arg0;
        var3.field2705 = arg1;
        var3.field2708 = arg2;
        class199 var4 = field2713;
        synchronized (field2713) {
            field2713.method3558(var3);
        }
        Object var6 = field2716;
        synchronized (field2716) {
            if (field2715 == 0) {
                Statics.field2031.method2718(new class170(), 5);
            }
            field2715 = 600;
        }
    }

    @ObfuscatedName("fu.o(B)V")
    public static void method2934() {
        while (true) {
            class199 var0 = field2713;
            class169 var1;
            synchronized (field2713) {
                var1 = (class169) field2714.method3561();
            }
            if (var1 == null) {
                return;
            }
            var1.field2708.method3111(var1.field2705, (int) var1.field3115, var1.field2707, false);
        }
    }

    @ObfuscatedName("t.c(I)V")
    public static void method576() {
        Object var0 = field2716;
        synchronized (field2716) {
            if (field2715 == 0) {
                Statics.field2031.method2718(new class170(), 5);
            }
            field2715 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2713;
                class169 var2;
                synchronized (field2713) {
                    var2 = (class169) field2713.method3563();
                }
                if (var2 == null) {
                    class127.method2134(100L);
                    Object var10 = field2716;
                    synchronized (field2716) {
                        if (field2715 <= 1) {
                            field2715 = 0;
                            field2716.notifyAll();
                            return;
                        }
                        field2715--;
                    }
                } else {
                    if (var2.field2706 == 0) {
                        var2.field2705.method2696((int) var2.field3115, var2.field2707, var2.field2707.length);
                        class199 var4 = field2713;
                        synchronized (field2713) {
                            var2.method3645();
                        }
                    } else if (var2.field2706 == 1) {
                        var2.field2707 = var2.field2705.method2697((int) var2.field3115);
                        class199 var6 = field2713;
                        synchronized (field2713) {
                            field2714.method3558(var2);
                        }
                    }
                    Object var8 = field2716;
                    synchronized (field2716) {
                        if (field2715 <= 1) {
                            field2715 = 0;
                            field2716.notifyAll();
                            return;
                        }
                        field2715 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method1777((String) null, var18);
        }
    }

    @ObfuscatedName("ct.p(B)V")
    public static void method2046() {
        Object var0 = field2716;
        synchronized (field2716) {
            if (field2715 != 0) {
                field2715 = 1;
                try {
                    field2716.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
