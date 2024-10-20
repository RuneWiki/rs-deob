package deob;

@ObfuscatedName("gs")
public class class184 implements Runnable {

    @ObfuscatedName("gs.i")
    public static class129 field2727 = new class129();

    @ObfuscatedName("gs.e")
    public static class129 field2726 = new class129();

    @ObfuscatedName("gs.f")
    public static int field2729 = 0;

    @ObfuscatedName("gs.k")
    public static Object field2728 = new Object();

    @ObfuscatedName("e.f(I[BLdb;I)V")
    public static void method15(int arg0, byte[] arg1, class117 arg2) {
        class181 var3 = new class181();
        var3.field2693 = 0;
        var3.field1879 = (long) arg0;
        var3.field2692 = arg1;
        var3.field2694 = arg2;
        class129 var4 = field2727;
        synchronized (field2727) {
            field2727.method2226(var3);
        }
        method1863();
    }

    @ObfuscatedName("en.k(ILdb;Lgm;I)V")
    public static void method2549(int arg0, class117 arg1, class185 arg2) {
        class181 var3 = new class181();
        var3.field2693 = 1;
        var3.field1879 = (long) arg0;
        var3.field2694 = arg1;
        var3.field2695 = arg2;
        class129 var4 = field2727;
        synchronized (field2727) {
            field2727.method2226(var3);
        }
        method1863();
    }

    @ObfuscatedName("e.a(I)V")
    public static void method9() {
        while (true) {
            class129 var0 = field2727;
            class181 var1;
            synchronized (field2727) {
                var1 = (class181) field2726.method2207();
            }
            if (var1 == null) {
                return;
            }
            var1.field2695.method3123(var1.field2694, (int) var1.field1879, var1.field2692, false);
        }
    }

    @ObfuscatedName("dd.q(B)V")
    public static void method1863() {
        Object var0 = field2728;
        synchronized (field2728) {
            if (field2729 == 0) {
                Statics.field856.method1820(new class184(), 5);
            }
            field2729 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2727;
                class181 var2;
                synchronized (field2727) {
                    var2 = (class181) field2727.method2209();
                }
                if (var2 == null) {
                    class162.method150(100L);
                    Object var10 = field2728;
                    synchronized (field2728) {
                        if (field2729 <= 1) {
                            field2729 = 0;
                            field2728.notifyAll();
                            return;
                        }
                        field2729--;
                    }
                } else {
                    if (var2.field2693 == 0) {
                        var2.field2694.method2060((int) var2.field1879, var2.field2692, var2.field2692.length);
                        class129 var4 = field2727;
                        synchronized (field2727) {
                            var2.method2200();
                        }
                    } else if (var2.field2693 == 1) {
                        var2.field2692 = var2.field2694.method2058((int) var2.field1879);
                        class129 var6 = field2727;
                        synchronized (field2727) {
                            field2726.method2226(var2);
                        }
                    }
                    Object var8 = field2728;
                    synchronized (field2728) {
                        if (field2729 <= 1) {
                            field2729 = 0;
                            field2728.notifyAll();
                            return;
                        }
                        field2729 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method1780((String) null, var18);
        }
    }
}
