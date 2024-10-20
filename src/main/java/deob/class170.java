package deob;

@ObfuscatedName("fo")
public class class170 implements Runnable {

    @ObfuscatedName("fo.j")
    public static class199 field2695 = new class199();

    @ObfuscatedName("fo.m")
    public static class199 field2692 = new class199();

    @ObfuscatedName("fo.f")
    public static int field2694 = 0;

    @ObfuscatedName("fo.l")
    public static Object field2691 = new Object();

    @ObfuscatedName("au.m(ILer;Lfg;I)V")
    public static void method958(int arg0, class134 arg1, class168 arg2) {
        class169 var3 = new class169();
        var3.field2685 = 1;
        var3.field3105 = (long) arg0;
        var3.field2684 = arg1;
        var3.field2687 = arg2;
        class199 var4 = field2695;
        synchronized (field2695) {
            field2695.method3603(var3);
        }
        method2173();
    }

    @ObfuscatedName("ci.l(B)V")
    public static void method2173() {
        Object var0 = field2691;
        synchronized (field2691) {
            if (field2694 == 0) {
                Statics.field631.method2747(new class170(), 5);
            }
            field2694 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2695;
                class169 var2;
                synchronized (field2695) {
                    var2 = (class169) field2695.method3606();
                }
                if (var2 == null) {
                    class127.method692(100L);
                    Object var10 = field2691;
                    synchronized (field2691) {
                        if (field2694 <= 1) {
                            field2694 = 0;
                            field2691.notifyAll();
                            return;
                        }
                        field2694--;
                    }
                } else {
                    if (var2.field2685 == 0) {
                        var2.field2684.method2727((int) var2.field3105, var2.field2686, var2.field2686.length);
                        class199 var4 = field2695;
                        synchronized (field2695) {
                            var2.method3700();
                        }
                    } else if (var2.field2685 == 1) {
                        var2.field2686 = var2.field2684.method2726((int) var2.field3105);
                        class199 var6 = field2695;
                        synchronized (field2695) {
                            field2692.method3603(var2);
                        }
                    }
                    Object var8 = field2691;
                    synchronized (field2691) {
                        if (field2694 <= 1) {
                            field2694 = 0;
                            field2691.notifyAll();
                            return;
                        }
                        field2694 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method769((String) null, var18);
        }
    }
}
