package deob;

@ObfuscatedName("ip")
public class class237 implements Runnable {

    @ObfuscatedName("ip.d")
    public static class194 field3238 = new class194();

    @ObfuscatedName("ip.k")
    public static class194 field3234 = new class194();

    @ObfuscatedName("ip.e")
    public static int field3235 = 0;

    @ObfuscatedName("ip.p")
    public static Object field3237 = new Object();

    @ObfuscatedName("ev.d(ILfr;Lij;B)V")
    public static void method2700(int arg0, class161 arg1, class238 arg2) {
        class234 var3 = new class234();
        var3.field3207 = 1;
        var3.field2486 = (long) arg0;
        var3.field3205 = arg1;
        var3.field3206 = arg2;
        class194 var4 = field3238;
        synchronized (field3238) {
            field3238.method3411(var3);
        }
        Object var6 = field3237;
        synchronized (field3237) {
            if (field3235 == 0) {
                Statics.field3236 = new Thread(new class237());
                Statics.field3236.setDaemon(true);
                Statics.field3236.start();
                Statics.field3236.setPriority(5);
            }
            field3235 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class194 var1 = field3238;
                class234 var2;
                synchronized (field3238) {
                    var2 = (class234) field3238.method3409();
                }
                if (var2 == null) {
                    class182.method3711(100L);
                    Object var10 = field3237;
                    synchronized (field3237) {
                        if (field3235 <= 1) {
                            field3235 = 0;
                            field3237.notifyAll();
                            return;
                        }
                        field3235--;
                    }
                } else {
                    if (var2.field3207 == 0) {
                        var2.field3205.method2816((int) var2.field2486, var2.field3204, var2.field3204.length);
                        class194 var4 = field3238;
                        synchronized (field3238) {
                            var2.method3407();
                        }
                    } else if (var2.field3207 == 1) {
                        var2.field3204 = var2.field3205.method2825((int) var2.field2486);
                        class194 var6 = field3238;
                        synchronized (field3238) {
                            field3234.method3411(var2);
                        }
                    }
                    Object var8 = field3237;
                    synchronized (field3237) {
                        if (field3235 <= 1) {
                            field3235 = 0;
                            field3237.notifyAll();
                            return;
                        }
                        field3235 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method1775((String) null, var18);
        }
    }
}
