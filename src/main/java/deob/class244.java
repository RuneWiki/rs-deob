package deob;

@ObfuscatedName("iz")
public class class244 implements Runnable {

    @ObfuscatedName("iz.b")
    public static class201 field3292 = new class201();

    @ObfuscatedName("iz.s")
    public static class201 field3290 = new class201();

    @ObfuscatedName("iz.r")
    public static int field3289 = 0;

    @ObfuscatedName("iz.g")
    public static Object field3291 = new Object();

    @ObfuscatedName("bf.b(I[BLfw;I)V")
    public static void method947(int arg0, byte[] arg1, class162 arg2) {
        class241 var3 = new class241();
        var3.field3261 = 0;
        var3.field2557 = (long) arg0;
        var3.field3259 = arg1;
        var3.field3264 = arg2;
        class201 var4 = field3292;
        synchronized (field3292) {
            field3292.method3400(var3);
        }
        method209();
    }

    @ObfuscatedName("ao.s(ILfw;Liu;I)V")
    public static void method440(int arg0, class162 arg1, class245 arg2) {
        class241 var3 = new class241();
        var3.field3261 = 1;
        var3.field2557 = (long) arg0;
        var3.field3264 = arg1;
        var3.field3262 = arg2;
        class201 var4 = field3292;
        synchronized (field3292) {
            field3292.method3400(var3);
        }
        method209();
    }

    @ObfuscatedName("as.r(ILfw;Liu;B)V")
    public static void method454(int arg0, class162 arg1, class245 arg2) {
        byte[] var3 = null;
        class201 var4 = field3292;
        synchronized (field3292) {
            for (class241 var5 = (class241) field3292.method3405(); var5 != null; var5 = (class241) field3292.method3414()) {
                if ((long) arg0 == var5.field2557 && var5.field3264 == arg1 && var5.field3261 == 0) {
                    var3 = var5.field3259;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2791(arg0);
            arg2.method3921(arg1, arg0, var7, true);
        } else {
            arg2.method3921(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ak.g(I)V")
    public static void method209() {
        Object var0 = field3291;
        synchronized (field3291) {
            if (field3289 == 0) {
                Statics.field3288 = new Thread(new class244());
                Statics.field3288.setDaemon(true);
                Statics.field3288.start();
                Statics.field3288.setPriority(5);
            }
            field3289 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class201 var1 = field3292;
                class241 var2;
                synchronized (field3292) {
                    var2 = (class241) field3292.method3405();
                }
                if (var2 == null) {
                    class189.method2888(100L);
                    Object var10 = field3291;
                    synchronized (field3291) {
                        if (field3289 <= 1) {
                            field3289 = 0;
                            field3291.notifyAll();
                            return;
                        }
                        field3289--;
                    }
                } else {
                    if (var2.field3261 == 0) {
                        var2.field3264.method2792((int) var2.field2557, var2.field3259, var2.field3259.length);
                        class201 var4 = field3292;
                        synchronized (field3292) {
                            var2.method3392();
                        }
                    } else if (var2.field3261 == 1) {
                        var2.field3259 = var2.field3264.method2791((int) var2.field2557);
                        class201 var6 = field3292;
                        synchronized (field3292) {
                            field3290.method3400(var2);
                        }
                    }
                    Object var8 = field3291;
                    synchronized (field3291) {
                        if (field3289 <= 1) {
                            field3289 = 0;
                            field3291.notifyAll();
                            return;
                        }
                        field3289 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class154.method607((String) null, var18);
        }
    }
}
