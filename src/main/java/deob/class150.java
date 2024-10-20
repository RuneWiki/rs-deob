package deob;

@ObfuscatedName("eu")
public class class150 implements Runnable {

    @ObfuscatedName("eu.k")
    public static class178 field2504 = new class178();

    @ObfuscatedName("eu.y")
    public static class178 field2499 = new class178();

    @ObfuscatedName("eu.s")
    public static int field2501 = 0;

    @ObfuscatedName("eu.g")
    public static Object field2500 = new Object();

    @ObfuscatedName("ap.l(I[BLdt;B)V")
    public static void method603(int arg0, byte[] arg1, class121 arg2) {
        class149 var3 = new class149();
        var3.field2495 = 0;
        var3.field2879 = (long) arg0;
        var3.field2492 = arg1;
        var3.field2493 = arg2;
        class178 var4 = field2504;
        synchronized (field2504) {
            field2504.method3271(var3);
        }
        Object var6 = field2500;
        synchronized (field2500) {
            if (field2501 == 0) {
                Statics.field1752.method2481(new class150(), 5);
            }
            field2501 = 600;
        }
    }

    @ObfuscatedName("dz.e(ILdt;Lem;I)V")
    public static void method2432(int arg0, class121 arg1, class148 arg2) {
        class149 var3 = new class149();
        var3.field2495 = 1;
        var3.field2879 = (long) arg0;
        var3.field2493 = arg1;
        var3.field2494 = arg2;
        class178 var4 = field2504;
        synchronized (field2504) {
            field2504.method3271(var3);
        }
        Object var6 = field2500;
        synchronized (field2500) {
            if (field2501 == 0) {
                Statics.field1752.method2481(new class150(), 5);
            }
            field2501 = 600;
        }
    }

    @ObfuscatedName("ex.u(ILdt;Lem;I)V")
    public static void method2711(int arg0, class121 arg1, class148 arg2) {
        byte[] var3 = null;
        class178 var4 = field2504;
        synchronized (field2504) {
            for (class149 var5 = (class149) field2504.method3301(); var5 != null; var5 = (class149) field2504.method3278()) {
                if ((long) arg0 == var5.field2879 && var5.field2493 == arg1 && var5.field2495 == 0) {
                    var3 = var5.field2492;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2461(arg0);
            arg2.method2825(arg1, arg0, var7, true);
        } else {
            arg2.method2825(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class178 var1 = field2504;
                class149 var2;
                synchronized (field2504) {
                    var2 = (class149) field2504.method3301();
                }
                if (var2 == null) {
                    class114.method1888(100L);
                    Object var10 = field2500;
                    synchronized (field2500) {
                        if (field2501 <= 1) {
                            field2501 = 0;
                            field2500.notifyAll();
                            return;
                        }
                        field2501--;
                    }
                } else {
                    if (var2.field2495 == 0) {
                        var2.field2493.method2462((int) var2.field2879, var2.field2492, var2.field2492.length);
                        class178 var4 = field2504;
                        synchronized (field2504) {
                            var2.method3365();
                        }
                    } else if (var2.field2495 == 1) {
                        var2.field2492 = var2.field2493.method2461((int) var2.field2879);
                        class178 var6 = field2504;
                        synchronized (field2504) {
                            field2499.method3271(var2);
                        }
                    }
                    Object var8 = field2500;
                    synchronized (field2500) {
                        if (field2501 <= 1) {
                            field2501 = 0;
                            field2500.notifyAll();
                            return;
                        }
                        field2501 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method2083((String) null, var18);
        }
    }
}
