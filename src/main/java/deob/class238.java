package deob;

@ObfuscatedName("io")
public class class238 implements Runnable {

    @ObfuscatedName("io.j")
    public static class195 field3225 = new class195();

    @ObfuscatedName("io.h")
    public static class195 field3221 = new class195();

    @ObfuscatedName("io.f")
    public static int field3220 = 0;

    @ObfuscatedName("io.p")
    public static Object field3223 = new Object();

    @ObfuscatedName("hx.f(I)V")
    public static void method3757() {
        while (true) {
            class195 var0 = field3225;
            class235 var1;
            synchronized (field3225) {
                var1 = (class235) field3221.method3325();
            }
            if (var1 == null) {
                return;
            }
            var1.field3196.method3886(var1.field3194, (int) var1.field2469, var1.field3195, false);
        }
    }

    @ObfuscatedName("hc.p(I)V")
    public static void method3761() {
        Object var0 = field3223;
        synchronized (field3223) {
            if (field3220 == 0) {
                Statics.field3222 = new Thread(new class238());
                Statics.field3222.setDaemon(true);
                Statics.field3222.start();
                Statics.field3222.setPriority(5);
            }
            field3220 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class195 var1 = field3225;
                class235 var2;
                synchronized (field3225) {
                    var2 = (class235) field3225.method3326();
                }
                if (var2 == null) {
                    class183.method40(100L);
                    Object var10 = field3223;
                    synchronized (field3223) {
                        if (field3220 <= 1) {
                            field3220 = 0;
                            field3223.notifyAll();
                            return;
                        }
                        field3220--;
                    }
                } else {
                    if (var2.field3197 == 0) {
                        var2.field3194.method2767((int) var2.field2469, var2.field3195, var2.field3195.length);
                        class195 var4 = field3225;
                        synchronized (field3225) {
                            var2.method3314();
                        }
                    } else if (var2.field3197 == 1) {
                        var2.field3195 = var2.field3194.method2771((int) var2.field2469);
                        class195 var6 = field3225;
                        synchronized (field3225) {
                            field3221.method3317(var2);
                        }
                    }
                    Object var8 = field3223;
                    synchronized (field3223) {
                        if (field3220 <= 1) {
                            field3220 = 0;
                            field3223.notifyAll();
                            return;
                        }
                        field3220 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method1698((String) null, var18);
        }
    }

    @ObfuscatedName("hz.x(I)V")
    public static void method3748() {
        Object var0 = field3223;
        synchronized (field3223) {
            if (field3220 != 0) {
                field3220 = 1;
                try {
                    field3223.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
