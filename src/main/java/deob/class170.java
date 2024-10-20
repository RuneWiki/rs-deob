package deob;

@ObfuscatedName("fr")
public class class170 implements Runnable {

    @ObfuscatedName("fr.c")
    public static class199 field2694 = new class199();

    @ObfuscatedName("fr.h")
    public static class199 field2692 = new class199();

    @ObfuscatedName("fr.k")
    public static int field2693 = 0;

    @ObfuscatedName("fr.t")
    public static Object field2695 = new Object();

    @ObfuscatedName("eu.h(I)V")
    public static void method2893() {
        Object var0 = field2695;
        synchronized (field2695) {
            if (field2693 == 0) {
                Statics.field1993.method2680(new class170(), 5);
            }
            field2693 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2694;
                class169 var2;
                synchronized (field2694) {
                    var2 = (class169) field2694.method3558();
                }
                if (var2 == null) {
                    class127.method2079(100L);
                    Object var10 = field2695;
                    synchronized (field2695) {
                        if (field2693 <= 1) {
                            field2693 = 0;
                            field2695.notifyAll();
                            return;
                        }
                        field2693--;
                    }
                } else {
                    if (var2.field2687 == 0) {
                        var2.field2686.method2646((int) var2.field3096, var2.field2684, var2.field2684.length);
                        class199 var4 = field2694;
                        synchronized (field2694) {
                            var2.method3646();
                        }
                    } else if (var2.field2687 == 1) {
                        var2.field2684 = var2.field2686.method2645((int) var2.field3096);
                        class199 var6 = field2694;
                        synchronized (field2694) {
                            field2692.method3585(var2);
                        }
                    }
                    Object var8 = field2695;
                    synchronized (field2695) {
                        if (field2693 <= 1) {
                            field2693 = 0;
                            field2695.notifyAll();
                            return;
                        }
                        field2693 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method2598((String) null, var18);
        }
    }

    @ObfuscatedName("dw.k(I)V")
    public static void method2205() {
        Object var0 = field2695;
        synchronized (field2695) {
            if (field2693 != 0) {
                field2693 = 1;
                try {
                    field2695.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
