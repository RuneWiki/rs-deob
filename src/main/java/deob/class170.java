package deob;

@ObfuscatedName("fx")
public class class170 implements Runnable {

    @ObfuscatedName("fx.h")
    public static class199 field2695 = new class199();

    @ObfuscatedName("fx.q")
    public static class199 field2691 = new class199();

    @ObfuscatedName("fx.v")
    public static int field2690 = 0;

    @ObfuscatedName("fx.n")
    public static Object field2693 = new Object();

    @ObfuscatedName("hp.v(I[BLev;I)V")
    public static void method3770(int arg0, byte[] arg1, class134 arg2) {
        class169 var3 = new class169();
        var3.field2684 = 0;
        var3.field3093 = (long) arg0;
        var3.field2689 = arg1;
        var3.field2685 = arg2;
        class199 var4 = field2695;
        synchronized (field2695) {
            field2695.method3609(var3);
        }
        method877();
    }

    @ObfuscatedName("d.n(ILev;Lff;S)V")
    public static void method169(int arg0, class134 arg1, class168 arg2) {
        class169 var3 = new class169();
        var3.field2684 = 1;
        var3.field3093 = (long) arg0;
        var3.field2685 = arg1;
        var3.field2686 = arg2;
        class199 var4 = field2695;
        synchronized (field2695) {
            field2695.method3609(var3);
        }
        method877();
    }

    @ObfuscatedName("as.f(I)V")
    public static void method674() {
        while (true) {
            class199 var0 = field2695;
            class169 var1;
            synchronized (field2695) {
                var1 = (class169) field2691.method3628();
            }
            if (var1 == null) {
                return;
            }
            var1.field2686.method3161(var1.field2685, (int) var1.field3093, var1.field2689, false);
        }
    }

    @ObfuscatedName("aw.g(I)V")
    public static void method877() {
        Object var0 = field2693;
        synchronized (field2693) {
            if (field2690 == 0) {
                Statics.field2158.method2780(new class170(), 5);
            }
            field2690 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2695;
                class169 var2;
                synchronized (field2695) {
                    var2 = (class169) field2695.method3611();
                }
                if (var2 == null) {
                    class127.method2075(100L);
                    Object var10 = field2693;
                    synchronized (field2693) {
                        if (field2690 <= 1) {
                            field2690 = 0;
                            field2693.notifyAll();
                            return;
                        }
                        field2690--;
                    }
                } else {
                    if (var2.field2684 == 0) {
                        var2.field2685.method2739((int) var2.field3093, var2.field2689, var2.field2689.length);
                        class199 var4 = field2695;
                        synchronized (field2695) {
                            var2.method3711();
                        }
                    } else if (var2.field2684 == 1) {
                        var2.field2689 = var2.field2685.method2737((int) var2.field3093);
                        class199 var6 = field2695;
                        synchronized (field2695) {
                            field2691.method3609(var2);
                        }
                    }
                    Object var8 = field2693;
                    synchronized (field2693) {
                        if (field2690 <= 1) {
                            field2690 = 0;
                            field2693.notifyAll();
                            return;
                        }
                        field2690 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method190((String) null, var18);
        }
    }
}
