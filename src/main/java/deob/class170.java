package deob;

@ObfuscatedName("fp")
public class class170 implements Runnable {

    @ObfuscatedName("fp.l")
    public static class199 field2697 = new class199();

    @ObfuscatedName("fp.e")
    public static class199 field2698 = new class199();

    @ObfuscatedName("fp.q")
    public static int field2696 = 0;

    @ObfuscatedName("fp.o")
    public static Object field2695 = new Object();

    @ObfuscatedName("fz.o(ILes;Lfr;I)V")
    public static void method3030(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2697;
        synchronized (field2697) {
            for (class169 var5 = (class169) field2697.method3544(); var5 != null; var5 = (class169) field2697.method3538()) {
                if ((long) arg0 == var5.field3107 && var5.field2689 == arg1 && var5.field2690 == 0) {
                    var3 = var5.field2687;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2707(arg0);
            arg2.method3131(arg1, arg0, var7, true);
        } else {
            arg2.method3131(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ag.g(I)V")
    public static void method754() {
        Object var0 = field2695;
        synchronized (field2695) {
            if (field2696 == 0) {
                Statics.field93.method2736(new class170(), 5);
            }
            field2696 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2697;
                class169 var2;
                synchronized (field2697) {
                    var2 = (class169) field2697.method3544();
                }
                if (var2 == null) {
                    class127.method2667(100L);
                    Object var10 = field2695;
                    synchronized (field2695) {
                        if (field2696 <= 1) {
                            field2696 = 0;
                            field2695.notifyAll();
                            return;
                        }
                        field2696--;
                    }
                } else {
                    if (var2.field2690 == 0) {
                        var2.field2689.method2708((int) var2.field3107, var2.field2687, var2.field2687.length);
                        class199 var4 = field2697;
                        synchronized (field2697) {
                            var2.method3620();
                        }
                    } else if (var2.field2690 == 1) {
                        var2.field2687 = var2.field2689.method2707((int) var2.field3107);
                        class199 var6 = field2697;
                        synchronized (field2697) {
                            field2698.method3567(var2);
                        }
                    }
                    Object var8 = field2695;
                    synchronized (field2695) {
                        if (field2696 <= 1) {
                            field2696 = 0;
                            field2695.notifyAll();
                            return;
                        }
                        field2696 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method2819((String) null, var18);
        }
    }
}
