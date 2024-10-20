package deob;

@ObfuscatedName("ib")
public class class235 implements Runnable {

    @ObfuscatedName("ib.c")
    public static class262 field3124 = new class262();

    @ObfuscatedName("ib.x")
    public static class262 field3123 = new class262();

    @ObfuscatedName("ib.g")
    public static int field3127 = 0;

    @ObfuscatedName("ib.l")
    public static Object field3125 = new Object();

    @ObfuscatedName("ci.c(I[BLkx;I)V")
    public static void method2108(int arg0, byte[] arg1, class308 arg2) {
        class232 var3 = new class232();
        var3.field3096 = 0;
        var3.field2096 = (long) arg0;
        var3.field3092 = arg1;
        var3.field3093 = arg2;
        class262 var4 = field3124;
        synchronized (field3124) {
            field3124.method4572(var3);
        }
        Object var6 = field3125;
        synchronized (field3125) {
            if (field3127 == 0) {
                Statics.field3128 = new Thread(new class235());
                Statics.field3128.setDaemon(true);
                Statics.field3128.start();
                Statics.field3128.setPriority(5);
            }
            field3127 = 600;
        }
    }

    @ObfuscatedName("jy.x(ILkx;Lio;I)V")
    public static void method4839(int arg0, class308 arg1, class236 arg2) {
        class232 var3 = new class232();
        var3.field3096 = 1;
        var3.field2096 = (long) arg0;
        var3.field3093 = arg1;
        var3.field3094 = arg2;
        class262 var4 = field3124;
        synchronized (field3124) {
            field3124.method4572(var3);
        }
        Object var6 = field3125;
        synchronized (field3125) {
            if (field3127 == 0) {
                Statics.field3128 = new Thread(new class235());
                Statics.field3128.setDaemon(true);
                Statics.field3128.start();
                Statics.field3128.setPriority(5);
            }
            field3127 = 600;
        }
    }

    @ObfuscatedName("hx.t(ILkx;Lio;I)V")
    public static void method3810(int arg0, class308 arg1, class236 arg2) {
        byte[] var3 = null;
        class262 var4 = field3124;
        synchronized (field3124) {
            for (class232 var5 = (class232) field3124.method4550(); var5 != null; var5 = (class232) field3124.method4573()) {
                if ((long) arg0 == var5.field2096 && var5.field3093 == arg1 && var5.field3096 == 0) {
                    var3 = var5.field3092;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5430(arg0);
            arg2.method3945(arg1, arg0, var7, true);
        } else {
            arg2.method3945(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ca.g(I)V")
    public static void method1906() {
        while (true) {
            class262 var0 = field3124;
            class232 var1;
            synchronized (field3124) {
                var1 = (class232) field3123.method4548();
            }
            if (var1 == null) {
                return;
            }
            var1.field3094.method3945(var1.field3093, (int) var1.field2096, var1.field3092, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class262 var1 = field3124;
                class232 var2;
                synchronized (field3124) {
                    var2 = (class232) field3124.method4550();
                }
                if (var2 == null) {
                    class298.method4811(100L);
                    Object var10 = field3125;
                    synchronized (field3125) {
                        if (field3127 <= 1) {
                            field3127 = 0;
                            field3125.notifyAll();
                            return;
                        }
                        field3127--;
                    }
                } else {
                    if (var2.field3096 == 0) {
                        var2.field3093.method5431((int) var2.field2096, var2.field3092, var2.field3092.length);
                        class262 var4 = field3124;
                        synchronized (field3124) {
                            var2.method3326();
                        }
                    } else if (var2.field3096 == 1) {
                        var2.field3092 = var2.field3093.method5430((int) var2.field2096);
                        class262 var6 = field3124;
                        synchronized (field3124) {
                            field3123.method4572(var2);
                        }
                    }
                    Object var8 = field3125;
                    synchronized (field3125) {
                        if (field3127 <= 1) {
                            field3127 = 0;
                            field3125.notifyAll();
                            return;
                        }
                        field3127 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class341.method3361((String) null, var18);
        }
    }
}
