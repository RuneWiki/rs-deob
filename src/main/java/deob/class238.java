package deob;

@ObfuscatedName("ik")
public class class238 implements Runnable {

    @ObfuscatedName("ik.i")
    public static class195 field3244 = new class195();

    @ObfuscatedName("ik.j")
    public static class195 field3236 = new class195();

    @ObfuscatedName("ik.a")
    public static int field3238 = 0;

    @ObfuscatedName("ik.r")
    public static Object field3240 = new Object();

    @ObfuscatedName("y.i(I[BLfx;I)V")
    public static void method72(int arg0, byte[] arg1, class162 arg2) {
        class235 var3 = new class235();
        var3.field3206 = 0;
        var3.field2475 = (long) arg0;
        var3.field3207 = arg1;
        var3.field3205 = arg2;
        class195 var4 = field3244;
        synchronized (field3244) {
            field3244.method3405(var3);
        }
        method2849();
    }

    @ObfuscatedName("fx.j(I)V")
    public static void method2849() {
        Object var0 = field3240;
        synchronized (field3240) {
            if (field3238 == 0) {
                Statics.field1669 = new Thread(new class238());
                Statics.field1669.setDaemon(true);
                Statics.field1669.start();
                Statics.field1669.setPriority(5);
            }
            field3238 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class195 var1 = field3244;
                class235 var2;
                synchronized (field3244) {
                    var2 = (class235) field3244.method3410();
                }
                if (var2 == null) {
                    Statics.method1558(100L);
                    Object var10 = field3240;
                    synchronized (field3240) {
                        if (field3238 <= 1) {
                            field3238 = 0;
                            field3240.notifyAll();
                            return;
                        }
                        field3238--;
                    }
                } else {
                    if (var2.field3206 == 0) {
                        var2.field3205.method2845((int) var2.field2475, var2.field3207, var2.field3207.length);
                        class195 var4 = field3244;
                        synchronized (field3244) {
                            var2.method3397();
                        }
                    } else if (var2.field3206 == 1) {
                        var2.field3207 = var2.field3205.method2833((int) var2.field2475);
                        class195 var6 = field3244;
                        synchronized (field3244) {
                            field3236.method3405(var2);
                        }
                    }
                    Object var8 = field3240;
                    synchronized (field3240) {
                        if (field3238 <= 1) {
                            field3238 = 0;
                            field3240.notifyAll();
                            return;
                        }
                        field3238 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class154.method2746((String) null, var18);
        }
    }
}
