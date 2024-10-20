package deob;

@ObfuscatedName("fo")
public class class161 implements Runnable {

    @ObfuscatedName("fo.o")
    public static class190 field2596 = new class190();

    @ObfuscatedName("fo.l")
    public static class190 field2592 = new class190();

    @ObfuscatedName("fo.g")
    public static int field2594 = 0;

    @ObfuscatedName("fo.u")
    public static Object field2593 = new Object();

    @ObfuscatedName("fd.g(I[BLdn;S)V")
    public static void method3037(int arg0, byte[] arg1, class126 arg2) {
        class160 var3 = new class160();
        var3.field2585 = 0;
        var3.field3015 = (long) arg0;
        var3.field2588 = arg1;
        var3.field2583 = arg2;
        class190 var4 = field2596;
        synchronized (field2596) {
            field2596.method3470(var3);
        }
        method2693();
    }

    @ObfuscatedName("dh.u(ILdn;Lfc;I)V")
    public static void method2659(int arg0, class126 arg1, class159 arg2) {
        class160 var3 = new class160();
        var3.field2585 = 1;
        var3.field3015 = (long) arg0;
        var3.field2583 = arg1;
        var3.field2586 = arg2;
        class190 var4 = field2596;
        synchronized (field2596) {
            field2596.method3470(var3);
        }
        method2693();
    }

    @ObfuscatedName("ab.q(ILdn;Lfc;B)V")
    public static void method638(int arg0, class126 arg1, class159 arg2) {
        byte[] var3 = null;
        class190 var4 = field2596;
        synchronized (field2596) {
            for (class160 var5 = (class160) field2596.method3499(); var5 != null; var5 = (class160) field2596.method3482()) {
                if ((long) arg0 == var5.field3015 && var5.field2583 == arg1 && var5.field2585 == 0) {
                    var3 = var5.field2588;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2590(arg0);
            arg2.method3019(arg1, arg0, var7, true);
        } else {
            arg2.method3019(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ef.r(I)V")
    public static void method2853() {
        while (true) {
            class190 var0 = field2596;
            class160 var1;
            synchronized (field2596) {
                var1 = (class160) field2592.method3473();
            }
            if (var1 == null) {
                return;
            }
            var1.field2586.method3019(var1.field2583, (int) var1.field3015, var1.field2588, false);
        }
    }

    @ObfuscatedName("ec.v(I)V")
    public static void method2693() {
        Object var0 = field2593;
        synchronized (field2593) {
            if (field2594 == 0) {
                Statics.field1007.method2607(new class161(), 5);
            }
            field2594 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class190 var1 = field2596;
                class160 var2;
                synchronized (field2596) {
                    var2 = (class160) field2596.method3499();
                }
                if (var2 == null) {
                    Statics.method832(100L);
                    Object var10 = field2593;
                    synchronized (field2593) {
                        if (field2594 <= 1) {
                            field2594 = 0;
                            field2593.notifyAll();
                            return;
                        }
                        field2594--;
                    }
                } else {
                    if (var2.field2585 == 0) {
                        var2.field2583.method2591((int) var2.field3015, var2.field2588, var2.field2588.length);
                        class190 var4 = field2596;
                        synchronized (field2596) {
                            var2.method3564();
                        }
                    } else if (var2.field2585 == 1) {
                        var2.field2588 = var2.field2583.method2590((int) var2.field3015);
                        class190 var6 = field2596;
                        synchronized (field2596) {
                            field2592.method3470(var2);
                        }
                    }
                    Object var8 = field2593;
                    synchronized (field2593) {
                        if (field2594 <= 1) {
                            field2594 = 0;
                            field2593.notifyAll();
                            return;
                        }
                        field2594 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class140.method530((String) null, var18);
        }
    }
}
