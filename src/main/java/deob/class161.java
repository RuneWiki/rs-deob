package deob;

@ObfuscatedName("fl")
public class class161 implements Runnable {

    @ObfuscatedName("fl.b")
    public static class190 field2596 = new class190();

    @ObfuscatedName("fl.e")
    public static class190 field2593 = new class190();

    @ObfuscatedName("fl.a")
    public static int field2594 = 0;

    @ObfuscatedName("fl.k")
    public static Object field2592 = new Object();

    @ObfuscatedName("ay.a(I[BLdf;B)V")
    public static void method870(int arg0, byte[] arg1, class126 arg2) {
        class160 var3 = new class160();
        var3.field2591 = 0;
        var3.field3006 = (long) arg0;
        var3.field2588 = arg1;
        var3.field2584 = arg2;
        class190 var4 = field2596;
        synchronized (field2596) {
            field2596.method3319(var3);
        }
        Object var6 = field2592;
        synchronized (field2592) {
            if (field2594 == 0) {
                Statics.field808.method2507(new class161(), 5);
            }
            field2594 = 600;
        }
    }

    @ObfuscatedName("a.k(ILdf;Lfn;I)V")
    public static void method30(int arg0, class126 arg1, class159 arg2) {
        byte[] var3 = null;
        class190 var4 = field2596;
        synchronized (field2596) {
            for (class160 var5 = (class160) field2596.method3324(); var5 != null; var5 = (class160) field2596.method3326()) {
                if ((long) arg0 == var5.field3006 && var5.field2584 == arg1 && var5.field2591 == 0) {
                    var3 = var5.field2588;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2486(arg0);
            arg2.method2906(arg1, arg0, var7, true);
        } else {
            arg2.method2906(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class190 var1 = field2596;
                class160 var2;
                synchronized (field2596) {
                    var2 = (class160) field2596.method3324();
                }
                if (var2 == null) {
                    class119.method555(100L);
                    Object var10 = field2592;
                    synchronized (field2592) {
                        if (field2594 <= 1) {
                            field2594 = 0;
                            field2592.notifyAll();
                            return;
                        }
                        field2594--;
                    }
                } else {
                    if (var2.field2591 == 0) {
                        var2.field2584.method2482((int) var2.field3006, var2.field2588, var2.field2588.length);
                        class190 var4 = field2596;
                        synchronized (field2596) {
                            var2.method3414();
                        }
                    } else if (var2.field2591 == 1) {
                        var2.field2588 = var2.field2584.method2486((int) var2.field3006);
                        class190 var6 = field2596;
                        synchronized (field2596) {
                            field2593.method3319(var2);
                        }
                    }
                    Object var8 = field2592;
                    synchronized (field2592) {
                        if (field2594 <= 1) {
                            field2594 = 0;
                            field2592.notifyAll();
                            return;
                        }
                        field2594 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class140.method2489((String) null, var18);
        }
    }
}
