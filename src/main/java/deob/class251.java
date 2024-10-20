package deob;

@ObfuscatedName("ic")
public class class251 implements Runnable {

    @ObfuscatedName("ic.c")
    public static class208 field3212 = new class208();

    @ObfuscatedName("ic.q")
    public static class208 field3214 = new class208();

    @ObfuscatedName("ic.m")
    public static int field3213 = 0;

    @ObfuscatedName("ic.j")
    public static Object field3215 = new Object();

    @ObfuscatedName("fh.q(I)V")
    public static void method3138() {
        while (true) {
            class208 var0 = field3212;
            class248 var1;
            synchronized (field3212) {
                var1 = (class248) field3214.method3743();
            }
            if (var1 == null) {
                return;
            }
            var1.field3178.method4322(var1.field3179, (int) var1.field2466, var1.field3181, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class208 var1 = field3212;
                class248 var2;
                synchronized (field3212) {
                    var2 = (class248) field3212.method3746();
                }
                if (var2 == null) {
                    class194.method672(100L);
                    Object var10 = field3215;
                    synchronized (field3215) {
                        if (field3213 <= 1) {
                            field3213 = 0;
                            field3215.notifyAll();
                            return;
                        }
                        field3213--;
                    }
                } else {
                    if (var2.field3180 == 0) {
                        var2.field3179.method3063((int) var2.field2466, var2.field3181, var2.field3181.length);
                        class208 var4 = field3212;
                        synchronized (field3212) {
                            var2.method3733();
                        }
                    } else if (var2.field3180 == 1) {
                        var2.field3181 = var2.field3179.method3062((int) var2.field2466);
                        class208 var6 = field3212;
                        synchronized (field3212) {
                            field3214.method3740(var2);
                        }
                    }
                    Object var8 = field3215;
                    synchronized (field3215) {
                        if (field3213 <= 1) {
                            field3213 = 0;
                            field3215.notifyAll();
                            return;
                        }
                        field3213 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class155.method1451((String) null, var18);
        }
    }
}
