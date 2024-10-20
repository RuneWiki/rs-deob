package deob;

@ObfuscatedName("fz")
public class class161 implements Runnable {

    @ObfuscatedName("fz.y")
    public static class190 field2626 = new class190();

    @ObfuscatedName("fz.k")
    public static class190 field2622 = new class190();

    @ObfuscatedName("fz.g")
    public static int field2623 = 0;

    @ObfuscatedName("fz.n")
    public static Object field2624 = new Object();

    @ObfuscatedName("co.g(I[BLdz;I)V")
    public static void method1983(int arg0, byte[] arg1, class126 arg2) {
        class160 var3 = new class160();
        var3.field2613 = 0;
        var3.field3024 = (long) arg0;
        var3.field2620 = arg1;
        var3.field2614 = arg2;
        class190 var4 = field2626;
        synchronized (field2626) {
            field2626.method3391(var3);
        }
        Object var6 = field2624;
        synchronized (field2624) {
            if (field2623 == 0) {
                Statics.field1483.method2541(new class161(), 5);
            }
            field2623 = 600;
        }
    }

    @ObfuscatedName("ad.n(ILdz;Lfl;I)V")
    public static void method1082(int arg0, class126 arg1, class159 arg2) {
        byte[] var3 = null;
        class190 var4 = field2626;
        synchronized (field2626) {
            for (class160 var5 = (class160) field2626.method3396(); var5 != null; var5 = (class160) field2626.method3398()) {
                if ((long) arg0 == var5.field3024 && var5.field2614 == arg1 && var5.field2613 == 0) {
                    var3 = var5.field2620;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2519(arg0);
            arg2.method2949(arg1, arg0, var7, true);
        } else {
            arg2.method2949(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class190 var1 = field2626;
                class160 var2;
                synchronized (field2626) {
                    var2 = (class160) field2626.method3396();
                }
                if (var2 == null) {
                    class119.method488(100L);
                    Object var10 = field2624;
                    synchronized (field2624) {
                        if (field2623 <= 1) {
                            field2623 = 0;
                            field2624.notifyAll();
                            return;
                        }
                        field2623--;
                    }
                } else {
                    if (var2.field2613 == 0) {
                        var2.field2614.method2518((int) var2.field3024, var2.field2620, var2.field2620.length);
                        class190 var4 = field2626;
                        synchronized (field2626) {
                            var2.method3482();
                        }
                    } else if (var2.field2613 == 1) {
                        var2.field2620 = var2.field2614.method2519((int) var2.field3024);
                        class190 var6 = field2626;
                        synchronized (field2626) {
                            field2622.method3391(var2);
                        }
                    }
                    Object var8 = field2624;
                    synchronized (field2624) {
                        if (field2623 <= 1) {
                            field2623 = 0;
                            field2624.notifyAll();
                            return;
                        }
                        field2623 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class140.method793((String) null, var18);
        }
    }
}
