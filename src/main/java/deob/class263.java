package deob;

@ObfuscatedName("ja")
public class class263 implements Runnable {

    @ObfuscatedName("ja.d")
    public static class218 field3393 = new class218();

    @ObfuscatedName("ja.z")
    public static class218 field3390 = new class218();

    @ObfuscatedName("ja.n")
    public static int field3395 = 0;

    @ObfuscatedName("ja.r")
    public static Object field3392 = new Object();

    @ObfuscatedName("bk.d(I)V")
    public static void method1508() {
        while (true) {
            class218 var0 = field3393;
            class260 var1;
            synchronized (field3393) {
                var1 = (class260) field3390.method3796();
            }
            if (var1 == null) {
                return;
            }
            var1.field3362.method4381(var1.field3361, (int) var1.field2655, var1.field3360, false);
        }
    }

    @ObfuscatedName("ba.z(I)V")
    public static void method1033() {
        Object var0 = field3392;
        synchronized (field3392) {
            if (field3395 == 0) {
                Statics.field3394 = new Thread(new class263());
                Statics.field3394.setDaemon(true);
                Statics.field3394.start();
                Statics.field3394.setPriority(5);
            }
            field3395 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class218 var1 = field3393;
                class260 var2;
                synchronized (field3393) {
                    var2 = (class260) field3393.method3798();
                }
                if (var2 == null) {
                    class204.method3573(100L);
                    Object var10 = field3392;
                    synchronized (field3392) {
                        if (field3395 <= 1) {
                            field3395 = 0;
                            field3392.notifyAll();
                            return;
                        }
                        field3395--;
                    }
                } else {
                    if (var2.field3363 == 0) {
                        var2.field3361.method3091((int) var2.field2655, var2.field3360, var2.field3360.length);
                        class218 var4 = field3393;
                        synchronized (field3393) {
                            var2.method3785();
                        }
                    } else if (var2.field3363 == 1) {
                        var2.field3360 = var2.field3361.method3099((int) var2.field2655);
                        class218 var6 = field3393;
                        synchronized (field3393) {
                            field3390.method3793(var2);
                        }
                    }
                    Object var8 = field3392;
                    synchronized (field3392) {
                        if (field3395 <= 1) {
                            field3395 = 0;
                            field3392.notifyAll();
                            return;
                        }
                        field3395 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class165.method2426((String) null, var18);
        }
    }
}
