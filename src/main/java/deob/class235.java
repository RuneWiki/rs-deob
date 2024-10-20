package deob;

@ObfuscatedName("ig")
public class class235 implements Runnable {

    @ObfuscatedName("ig.a")
    public static class262 field3136 = new class262();

    @ObfuscatedName("ig.n")
    public static class262 field3137 = new class262();

    @ObfuscatedName("ig.q")
    public static int field3133 = 0;

    @ObfuscatedName("ig.v")
    public static Object field3132 = new Object();

    @ObfuscatedName("bu.a(B)V")
    public static void method1076() {
        Object var0 = field3132;
        synchronized (field3132) {
            if (field3133 == 0) {
                Statics.field3135 = new Thread(new class235());
                Statics.field3135.setDaemon(true);
                Statics.field3135.start();
                Statics.field3135.setPriority(5);
            }
            field3133 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class262 var1 = field3136;
                class232 var2;
                synchronized (field3136) {
                    var2 = (class232) field3136.method4581();
                }
                if (var2 == null) {
                    Statics.method4888(100L);
                    Object var10 = field3132;
                    synchronized (field3132) {
                        if (field3133 <= 1) {
                            field3133 = 0;
                            field3132.notifyAll();
                            return;
                        }
                        field3133--;
                    }
                } else {
                    if (var2.field3102 == 0) {
                        var2.field3104.method5440((int) var2.field2091, var2.field3103, var2.field3103.length);
                        class262 var4 = field3136;
                        synchronized (field3136) {
                            var2.method3386();
                        }
                    } else if (var2.field3102 == 1) {
                        var2.field3103 = var2.field3104.method5441((int) var2.field2091);
                        class262 var6 = field3136;
                        synchronized (field3136) {
                            field3137.method4576(var2);
                        }
                    }
                    Object var8 = field3132;
                    synchronized (field3132) {
                        if (field3133 <= 1) {
                            field3133 = 0;
                            field3132.notifyAll();
                            return;
                        }
                        field3133 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class341.method4728((String) null, var18);
        }
    }

    @ObfuscatedName("hk.t(I)V")
    public static void method3838() {
        Object var0 = field3132;
        synchronized (field3132) {
            if (field3133 != 0) {
                field3133 = 1;
                try {
                    field3132.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
