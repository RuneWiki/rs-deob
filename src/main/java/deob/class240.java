package deob;

@ObfuscatedName("iv")
public class class240 implements Runnable {

    @ObfuscatedName("iv.w")
    public static class197 field3232 = new class197();

    @ObfuscatedName("iv.o")
    public static class197 field3233 = new class197();

    @ObfuscatedName("iv.x")
    public static int field3234 = 0;

    @ObfuscatedName("iv.k")
    public static Object field3235 = new Object();

    @ObfuscatedName("gy.w(ILfj;Lio;I)V")
    public static void method3392(int arg0, class163 arg1, class241 arg2) {
        byte[] var3 = null;
        class197 var4 = field3232;
        synchronized (field3232) {
            for (class237 var5 = (class237) field3232.method3304(); var5 != null; var5 = (class237) field3232.method3306()) {
                if ((long) arg0 == var5.field2490 && var5.field3202 == arg1 && var5.field3203 == 0) {
                    var3 = var5.field3205;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2733(arg0);
            arg2.method3833(arg1, arg0, var7, true);
        } else {
            arg2.method3833(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("d.o(I)V")
    public static void method151() {
        while (true) {
            class197 var0 = field3232;
            class237 var1;
            synchronized (field3232) {
                var1 = (class237) field3233.method3302();
            }
            if (var1 == null) {
                return;
            }
            var1.field3204.method3833(var1.field3202, (int) var1.field2490, var1.field3205, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class197 var1 = field3232;
                class237 var2;
                synchronized (field3232) {
                    var2 = (class237) field3232.method3304();
                }
                if (var2 == null) {
                    class185.method7(100L);
                    Object var10 = field3235;
                    synchronized (field3235) {
                        if (field3234 <= 1) {
                            field3234 = 0;
                            field3235.notifyAll();
                            return;
                        }
                        field3234--;
                    }
                } else {
                    if (var2.field3203 == 0) {
                        var2.field3202.method2732((int) var2.field2490, var2.field3205, var2.field3205.length);
                        class197 var4 = field3232;
                        synchronized (field3232) {
                            var2.method3294();
                        }
                    } else if (var2.field3203 == 1) {
                        var2.field3205 = var2.field3202.method2733((int) var2.field2490);
                        class197 var6 = field3232;
                        synchronized (field3232) {
                            field3233.method3299(var2);
                        }
                    }
                    Object var8 = field3235;
                    synchronized (field3235) {
                        if (field3234 <= 1) {
                            field3234 = 0;
                            field3235.notifyAll();
                            return;
                        }
                        field3234 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class154.method2730((String) null, var18);
        }
    }
}
