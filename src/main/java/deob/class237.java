package deob;

@ObfuscatedName("il")
public class class237 implements Runnable {

    @ObfuscatedName("il.a")
    public static class194 field3236 = new class194();

    @ObfuscatedName("il.j")
    public static class194 field3231 = new class194();

    @ObfuscatedName("il.n")
    public static int field3234 = 0;

    @ObfuscatedName("il.r")
    public static Object field3232 = new Object();

    @ObfuscatedName("er.a(ILfz;Lig;B)V")
    public static void method2643(int arg0, class161 arg1, class238 arg2) {
        byte[] var3 = null;
        class194 var4 = field3236;
        synchronized (field3236) {
            for (class234 var5 = (class234) field3236.method3318(); var5 != null; var5 = (class234) field3236.method3338()) {
                if ((long) arg0 == var5.field2467 && var5.field3204 == arg1 && var5.field3205 == 0) {
                    var3 = var5.field3203;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2747(arg0);
            arg2.method3857(arg1, arg0, var7, true);
        } else {
            arg2.method3857(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("bi.j(I)V")
    public static void method680() {
        while (true) {
            class194 var0 = field3236;
            class234 var1;
            synchronized (field3236) {
                var1 = (class234) field3231.method3323();
            }
            if (var1 == null) {
                return;
            }
            var1.field3202.method3857(var1.field3204, (int) var1.field2467, var1.field3203, false);
        }
    }

    @ObfuscatedName("cx.n(B)V")
    public static void method1375() {
        Object var0 = field3232;
        synchronized (field3232) {
            if (field3234 == 0) {
                Statics.field2050 = new Thread(new class237());
                Statics.field2050.setDaemon(true);
                Statics.field2050.start();
                Statics.field2050.setPriority(5);
            }
            field3234 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class194 var1 = field3236;
                class234 var2;
                synchronized (field3236) {
                    var2 = (class234) field3236.method3318();
                }
                if (var2 == null) {
                    class182.method318(100L);
                    Object var10 = field3232;
                    synchronized (field3232) {
                        if (field3234 <= 1) {
                            field3234 = 0;
                            field3232.notifyAll();
                            return;
                        }
                        field3234--;
                    }
                } else {
                    if (var2.field3205 == 0) {
                        var2.field3204.method2753((int) var2.field2467, var2.field3203, var2.field3203.length);
                        class194 var4 = field3236;
                        synchronized (field3236) {
                            var2.method3308();
                        }
                    } else if (var2.field3205 == 1) {
                        var2.field3203 = var2.field3204.method2747((int) var2.field2467);
                        class194 var6 = field3236;
                        synchronized (field3236) {
                            field3231.method3320(var2);
                        }
                    }
                    Object var8 = field3232;
                    synchronized (field3232) {
                        if (field3234 <= 1) {
                            field3234 = 0;
                            field3232.notifyAll();
                            return;
                        }
                        field3234 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method683((String) null, var18);
        }
    }

    @ObfuscatedName("es.r(I)V")
    public static void method2663() {
        Object var0 = field3232;
        synchronized (field3232) {
            if (field3234 != 0) {
                field3234 = 1;
                try {
                    field3232.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
