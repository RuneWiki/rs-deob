package deob;

@ObfuscatedName("fp")
public class class170 implements Runnable {

    @ObfuscatedName("fp.n")
    public static class199 field2700 = new class199();

    @ObfuscatedName("fp.q")
    public static class199 field2703 = new class199();

    @ObfuscatedName("fp.c")
    public static int field2702 = 0;

    @ObfuscatedName("fp.l")
    public static Object field2701 = new Object();

    @ObfuscatedName("ci.c(ILei;Lfn;I)V")
    public static void method2045(int arg0, class134 arg1, class168 arg2) {
        class169 var3 = new class169();
        var3.field2698 = 1;
        var3.field3112 = (long) arg0;
        var3.field2695 = arg1;
        var3.field2696 = arg2;
        class199 var4 = field2700;
        synchronized (field2700) {
            field2700.method3544(var3);
        }
        Object var6 = field2701;
        synchronized (field2701) {
            if (field2702 == 0) {
                Statics.field162.method2713(new class170(), 5);
            }
            field2702 = 600;
        }
    }

    @ObfuscatedName("ho.l(ILei;Lfn;B)V")
    public static void method3689(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2700;
        synchronized (field2700) {
            for (class169 var5 = (class169) field2700.method3549(); var5 != null; var5 = (class169) field2700.method3550()) {
                if ((long) arg0 == var5.field3112 && var5.field2695 == arg1 && var5.field2698 == 0) {
                    var3 = var5.field2694;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2690(arg0);
            arg2.method3106(arg1, arg0, var7, true);
        } else {
            arg2.method3106(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2700;
                class169 var2;
                synchronized (field2700) {
                    var2 = (class169) field2700.method3549();
                }
                if (var2 == null) {
                    class127.method1567(100L);
                    Object var10 = field2701;
                    synchronized (field2701) {
                        if (field2702 <= 1) {
                            field2702 = 0;
                            field2701.notifyAll();
                            return;
                        }
                        field2702--;
                    }
                } else {
                    if (var2.field2698 == 0) {
                        var2.field2695.method2701((int) var2.field3112, var2.field2694, var2.field2694.length);
                        class199 var4 = field2700;
                        synchronized (field2700) {
                            var2.method3651();
                        }
                    } else if (var2.field2698 == 1) {
                        var2.field2694 = var2.field2695.method2690((int) var2.field3112);
                        class199 var6 = field2700;
                        synchronized (field2700) {
                            field2703.method3544(var2);
                        }
                    }
                    Object var8 = field2701;
                    synchronized (field2701) {
                        if (field2702 <= 1) {
                            field2702 = 0;
                            field2701.notifyAll();
                            return;
                        }
                        field2702 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method2765((String) null, var18);
        }
    }
}
