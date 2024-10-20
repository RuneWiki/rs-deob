package deob;

@ObfuscatedName("iv")
public class class237 implements Runnable {

    @ObfuscatedName("iv.e")
    public static class194 field3205 = new class194();

    @ObfuscatedName("iv.o")
    public static class194 field3208 = new class194();

    @ObfuscatedName("iv.m")
    public static int field3206 = 0;

    @ObfuscatedName("iv.g")
    public static Object field3207 = new Object();

    @ObfuscatedName("ha.e(ILfg;Lik;B)V")
    public static void method3727(int arg0, class161 arg1, class238 arg2) {
        byte[] var3 = null;
        class194 var4 = field3205;
        synchronized (field3205) {
            for (class234 var5 = (class234) field3205.method3336(); var5 != null; var5 = (class234) field3205.method3324()) {
                if ((long) arg0 == var5.field2454 && var5.field3179 == arg1 && var5.field3177 == 0) {
                    var3 = var5.field3178;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2751(arg0);
            arg2.method3857(arg1, arg0, var7, true);
        } else {
            arg2.method3857(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("cn.o(S)V")
    public static void method1601() {
        Object var0 = field3207;
        synchronized (field3207) {
            if (field3206 == 0) {
                Statics.field3212 = new Thread(new class237());
                Statics.field3212.setDaemon(true);
                Statics.field3212.start();
                Statics.field3212.setPriority(5);
            }
            field3206 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class194 var1 = field3205;
                class234 var2;
                synchronized (field3205) {
                    var2 = (class234) field3205.method3336();
                }
                if (var2 == null) {
                    class182.method1535(100L);
                    Object var10 = field3207;
                    synchronized (field3207) {
                        if (field3206 <= 1) {
                            field3206 = 0;
                            field3207.notifyAll();
                            return;
                        }
                        field3206--;
                    }
                } else {
                    if (var2.field3177 == 0) {
                        var2.field3179.method2749((int) var2.field2454, var2.field3178, var2.field3178.length);
                        class194 var4 = field3205;
                        synchronized (field3205) {
                            var2.method3304();
                        }
                    } else if (var2.field3177 == 1) {
                        var2.field3178 = var2.field3179.method2751((int) var2.field2454);
                        class194 var6 = field3205;
                        synchronized (field3205) {
                            field3208.method3318(var2);
                        }
                    }
                    Object var8 = field3207;
                    synchronized (field3207) {
                        if (field3206 <= 1) {
                            field3206 = 0;
                            field3207.notifyAll();
                            return;
                        }
                        field3206 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method464((String) null, var18);
        }
    }
}
