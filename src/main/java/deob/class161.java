package deob;

@ObfuscatedName("fj")
public class class161 implements Runnable {

    @ObfuscatedName("fj.p")
    public static class190 field2614 = new class190();

    @ObfuscatedName("fj.k")
    public static class190 field2611 = new class190();

    @ObfuscatedName("fj.e")
    public static int field2612 = 0;

    @ObfuscatedName("fj.f")
    public static Object field2613 = new Object();

    @ObfuscatedName("ae.e(I[BLda;I)V")
    public static void method842(int arg0, byte[] arg1, class126 arg2) {
        class160 var3 = new class160();
        var3.field2604 = 0;
        var3.field3015 = (long) arg0;
        var3.field2603 = arg1;
        var3.field2602 = arg2;
        class190 var4 = field2614;
        synchronized (field2614) {
            field2614.method3437(var3);
        }
        Object var6 = field2613;
        synchronized (field2613) {
            if (field2612 == 0) {
                Statics.field1983.method2547(new class161(), 5);
            }
            field2612 = 600;
        }
    }

    @ObfuscatedName("ay.f(ILda;Lft;S)V")
    public static void method858(int arg0, class126 arg1, class159 arg2) {
        byte[] var3 = null;
        class190 var4 = field2614;
        synchronized (field2614) {
            for (class160 var5 = (class160) field2614.method3442(); var5 != null; var5 = (class160) field2614.method3444()) {
                if ((long) arg0 == var5.field3015 && var5.field2602 == arg1 && var5.field2604 == 0) {
                    var3 = var5.field2603;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2529(arg0);
            arg2.method2997(arg1, arg0, var7, true);
        } else {
            arg2.method2997(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ef.w(B)V")
    public static void method2613() {
        while (true) {
            class190 var0 = field2614;
            class160 var1;
            synchronized (field2614) {
                var1 = (class160) field2611.method3452();
            }
            if (var1 == null) {
                return;
            }
            var1.field2605.method2997(var1.field2602, (int) var1.field3015, var1.field2603, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class190 var1 = field2614;
                class160 var2;
                synchronized (field2614) {
                    var2 = (class160) field2614.method3442();
                }
                if (var2 == null) {
                    class119.method1371(100L);
                    Object var10 = field2613;
                    synchronized (field2613) {
                        if (field2612 <= 1) {
                            field2612 = 0;
                            field2613.notifyAll();
                            return;
                        }
                        field2612--;
                    }
                } else {
                    if (var2.field2604 == 0) {
                        var2.field2602.method2535((int) var2.field3015, var2.field2603, var2.field2603.length);
                        class190 var4 = field2614;
                        synchronized (field2614) {
                            var2.method3533();
                        }
                    } else if (var2.field2604 == 1) {
                        var2.field2603 = var2.field2602.method2529((int) var2.field3015);
                        class190 var6 = field2614;
                        synchronized (field2614) {
                            field2611.method3437(var2);
                        }
                    }
                    Object var8 = field2613;
                    synchronized (field2613) {
                        if (field2612 <= 1) {
                            field2612 = 0;
                            field2613.notifyAll();
                            return;
                        }
                        field2612 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class140.method1((String) null, var18);
        }
    }
}
