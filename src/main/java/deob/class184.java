package deob;

@ObfuscatedName("gi")
public class class184 implements Runnable {

    @ObfuscatedName("gi.f")
    public static class129 field2747 = new class129();

    @ObfuscatedName("gi.i")
    public static class129 field2746 = new class129();

    @ObfuscatedName("gi.u")
    public static int field2748 = 0;

    @ObfuscatedName("gi.h")
    public static Object field2749 = new Object();

    @ObfuscatedName("fq.r(ILdb;Lgp;B)V")
    public static void method3094(int arg0, class117 arg1, class185 arg2) {
        byte[] var3 = null;
        class129 var4 = field2747;
        synchronized (field2747) {
            for (class181 var5 = (class181) field2747.method2301(); var5 != null; var5 = (class181) field2747.method2309()) {
                if ((long) arg0 == var5.field1905 && var5.field2717 == arg1 && var5.field2720 == 0) {
                    var3 = var5.field2716;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2151(arg0);
            arg2.method3203(arg1, arg0, var7, true);
        } else {
            arg2.method3203(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2747;
                class181 var2;
                synchronized (field2747) {
                    var2 = (class181) field2747.method2301();
                }
                if (var2 == null) {
                    class162.method2141(100L);
                    Object var10 = field2749;
                    synchronized (field2749) {
                        if (field2748 <= 1) {
                            field2748 = 0;
                            field2749.notifyAll();
                            return;
                        }
                        field2748--;
                    }
                } else {
                    if (var2.field2720 == 0) {
                        var2.field2717.method2144((int) var2.field1905, var2.field2716, var2.field2716.length);
                        class129 var4 = field2747;
                        synchronized (field2747) {
                            var2.method2289();
                        }
                    } else if (var2.field2720 == 1) {
                        var2.field2716 = var2.field2717.method2151((int) var2.field1905);
                        class129 var6 = field2747;
                        synchronized (field2747) {
                            field2746.method2296(var2);
                        }
                    }
                    Object var8 = field2749;
                    synchronized (field2749) {
                        if (field2748 <= 1) {
                            field2748 = 0;
                            field2749.notifyAll();
                            return;
                        }
                        field2748 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method1851((String) null, var18);
        }
    }
}
