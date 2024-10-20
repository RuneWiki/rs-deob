package deob;

@ObfuscatedName("ey")
public class class152 implements Runnable {

    @ObfuscatedName("ey.g")
    public static class180 field2498 = new class180();

    @ObfuscatedName("ey.j")
    public static class180 field2495 = new class180();

    @ObfuscatedName("ey.z")
    public static int field2497 = 0;

    @ObfuscatedName("ey.b")
    public static Object field2496 = new Object();

    @ObfuscatedName("m.b(I[BLdx;B)V")
    public static void method494(int arg0, byte[] arg1, class123 arg2) {
        class151 var3 = new class151();
        var3.field2487 = 0;
        var3.field2887 = (long) arg0;
        var3.field2491 = arg1;
        var3.field2486 = arg2;
        class180 var4 = field2498;
        synchronized (field2498) {
            field2498.method3169(var3);
        }
        Object var6 = field2496;
        synchronized (field2496) {
            if (field2497 == 0) {
                Statics.field519.method2442(new class152(), 5);
            }
            field2497 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class180 var1 = field2498;
                class151 var2;
                synchronized (field2498) {
                    var2 = (class151) field2498.method3174();
                }
                if (var2 == null) {
                    class116.method154(100L);
                    Object var10 = field2496;
                    synchronized (field2496) {
                        if (field2497 <= 1) {
                            field2497 = 0;
                            field2496.notifyAll();
                            return;
                        }
                        field2497--;
                    }
                } else {
                    if (var2.field2487 == 0) {
                        var2.field2486.method2421((int) var2.field2887, var2.field2491, var2.field2491.length);
                        class180 var4 = field2498;
                        synchronized (field2498) {
                            var2.method3259();
                        }
                    } else if (var2.field2487 == 1) {
                        var2.field2491 = var2.field2486.method2430((int) var2.field2887);
                        class180 var6 = field2498;
                        synchronized (field2498) {
                            field2495.method3169(var2);
                        }
                    }
                    Object var8 = field2496;
                    synchronized (field2496) {
                        if (field2497 <= 1) {
                            field2497 = 0;
                            field2496.notifyAll();
                            return;
                        }
                        field2497 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class137.method2362((String) null, var18);
        }
    }

    @ObfuscatedName("u.k(I)V")
    public static void method164() {
        Object var0 = field2496;
        synchronized (field2496) {
            if (field2497 != 0) {
                field2497 = 1;
                try {
                    field2496.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
