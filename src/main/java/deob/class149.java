package deob;

@ObfuscatedName("ex")
public class class149 implements Runnable {

    @ObfuscatedName("ex.g")
    public static class177 field2493 = new class177();

    @ObfuscatedName("ex.v")
    public static class177 field2491 = new class177();

    @ObfuscatedName("ex.z")
    public static int field2492 = 0;

    @ObfuscatedName("ex.h")
    public static Object field2490 = new Object();

    @ObfuscatedName("l.z(ILdi;Leg;I)V")
    public static void method41(int arg0, class121 arg1, class147 arg2) {
        byte[] var3 = null;
        class177 var4 = field2493;
        synchronized (field2493) {
            for (class148 var5 = (class148) field2493.method3237(); var5 != null; var5 = (class148) field2493.method3239()) {
                if ((long) arg0 == var5.field2875 && var5.field2485 == arg1 && var5.field2487 == 0) {
                    var3 = var5.field2482;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2452(arg0);
            arg2.method2792(arg1, arg0, var7, true);
        } else {
            arg2.method2792(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("dv.h(I)V")
    public static void method2400() {
        Object var0 = field2490;
        synchronized (field2490) {
            if (field2492 == 0) {
                Statics.field985.method2472(new class149(), 5);
            }
            field2492 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2493;
                class148 var2;
                synchronized (field2493) {
                    var2 = (class148) field2493.method3237();
                }
                if (var2 == null) {
                    class114.method2962(100L);
                    Object var10 = field2490;
                    synchronized (field2490) {
                        if (field2492 <= 1) {
                            field2492 = 0;
                            field2490.notifyAll();
                            return;
                        }
                        field2492--;
                    }
                } else {
                    if (var2.field2487 == 0) {
                        var2.field2485.method2453((int) var2.field2875, var2.field2482, var2.field2482.length);
                        class177 var4 = field2493;
                        synchronized (field2493) {
                            var2.method3322();
                        }
                    } else if (var2.field2487 == 1) {
                        var2.field2482 = var2.field2485.method2452((int) var2.field2875);
                        class177 var6 = field2493;
                        synchronized (field2493) {
                            field2491.method3232(var2);
                        }
                    }
                    Object var8 = field2490;
                    synchronized (field2490) {
                        if (field2492 <= 1) {
                            field2492 = 0;
                            field2490.notifyAll();
                            return;
                        }
                        field2492 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method495((String) null, var18);
        }
    }
}
