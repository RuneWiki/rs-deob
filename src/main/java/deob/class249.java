package deob;

@ObfuscatedName("iv")
public class class249 implements Runnable {

    @ObfuscatedName("iv.z")
    public static class206 field3183 = new class206();

    @ObfuscatedName("iv.w")
    public static class206 field3181 = new class206();

    @ObfuscatedName("iv.s")
    public static int field3180 = 0;

    @ObfuscatedName("iv.l")
    public static Object field3185 = new Object();

    @ObfuscatedName("ce.z(I)V")
    public static void method1826() {
        while (true) {
            class206 var0 = field3183;
            class246 var1;
            synchronized (field3183) {
                var1 = (class246) field3181.method3768();
            }
            if (var1 == null) {
                return;
            }
            var1.field3153.method4359(var1.field3152, (int) var1.field2422, var1.field3150, false);
        }
    }

    @ObfuscatedName("gi.w(S)V")
    public static void method3540() {
        Object var0 = field3185;
        synchronized (field3185) {
            if (field3180 == 0) {
                Statics.field3184 = new Thread(new class249());
                Statics.field3184.setDaemon(true);
                Statics.field3184.start();
                Statics.field3184.setPriority(5);
            }
            field3180 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class206 var1 = field3183;
                class246 var2;
                synchronized (field3183) {
                    var2 = (class246) field3183.method3790();
                }
                if (var2 == null) {
                    class192.method1435(100L);
                    Object var10 = field3185;
                    synchronized (field3185) {
                        if (field3180 <= 1) {
                            field3180 = 0;
                            field3185.notifyAll();
                            return;
                        }
                        field3180--;
                    }
                } else {
                    if (var2.field3151 == 0) {
                        var2.field3152.method3077((int) var2.field2422, var2.field3150, var2.field3150.length);
                        class206 var4 = field3183;
                        synchronized (field3183) {
                            var2.method3756();
                        }
                    } else if (var2.field3151 == 1) {
                        var2.field3150 = var2.field3152.method3078((int) var2.field2422);
                        class206 var6 = field3183;
                        synchronized (field3183) {
                            field3181.method3765(var2);
                        }
                    }
                    Object var8 = field3185;
                    synchronized (field3185) {
                        if (field3180 <= 1) {
                            field3180 = 0;
                            field3185.notifyAll();
                            return;
                        }
                        field3180 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method66((String) null, var18);
        }
    }
}
