package deob;

@ObfuscatedName("ea")
public class class145 implements Runnable {

    @ObfuscatedName("ea.m")
    public static class171 field2443 = new class171();

    @ObfuscatedName("ea.k")
    public static class171 field2441 = new class171();

    @ObfuscatedName("ea.y")
    public static int field2442 = 0;

    @ObfuscatedName("ea.g")
    public static Object field2444 = new Object();

    @ObfuscatedName("j.y(ILdo;Ler;I)V")
    public static void method145(int arg0, class118 arg1, class143 arg2) {
        byte[] var3 = null;
        class171 var4 = field2443;
        synchronized (field2443) {
            for (class144 var5 = (class144) field2443.method3178(); var5 != null; var5 = (class144) field2443.method3179()) {
                if ((long) arg0 == var5.field2812 && var5.field2435 == arg1 && var5.field2436 == 0) {
                    var3 = var5.field2434;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2456(arg0);
            arg2.method2782(arg1, arg0, var7, true);
        } else {
            arg2.method2782(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ee.g(I)V")
    public static void method2679() {
        while (true) {
            class171 var0 = field2443;
            class144 var1;
            synchronized (field2443) {
                var1 = (class144) field2441.method3182();
            }
            if (var1 == null) {
                return;
            }
            var1.field2433.method2782(var1.field2435, (int) var1.field2812, var1.field2434, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class171 var1 = field2443;
                class144 var2;
                synchronized (field2443) {
                    var2 = (class144) field2443.method3178();
                }
                if (var2 == null) {
                    class111.method59(100L);
                    Object var10 = field2444;
                    synchronized (field2444) {
                        if (field2442 <= 1) {
                            field2442 = 0;
                            field2444.notifyAll();
                            return;
                        }
                        field2442--;
                    }
                } else {
                    if (var2.field2436 == 0) {
                        var2.field2435.method2457((int) var2.field2812, var2.field2434, var2.field2434.length);
                        class171 var4 = field2443;
                        synchronized (field2443) {
                            var2.method3223();
                        }
                    } else if (var2.field2436 == 1) {
                        var2.field2434 = var2.field2435.method2456((int) var2.field2812);
                        class171 var6 = field2443;
                        synchronized (field2443) {
                            field2441.method3180(var2);
                        }
                    }
                    Object var8 = field2444;
                    synchronized (field2444) {
                        if (field2442 <= 1) {
                            field2442 = 0;
                            field2444.notifyAll();
                            return;
                        }
                        field2442 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class132.method130((String) null, var18);
        }
    }
}
