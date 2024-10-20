package deob;

@ObfuscatedName("fr")
public class class170 implements Runnable {

    @ObfuscatedName("fr.g")
    public static class199 field2697 = new class199();

    @ObfuscatedName("fr.b")
    public static class199 field2696 = new class199();

    @ObfuscatedName("fr.w")
    public static int field2698 = 0;

    @ObfuscatedName("fr.d")
    public static Object field2699 = new Object();

    @ObfuscatedName("fg.b(I[BLea;I)V")
    public static void method2986(int arg0, byte[] arg1, class134 arg2) {
        class169 var3 = new class169();
        var3.field2689 = 0;
        var3.field3099 = (long) arg0;
        var3.field2694 = arg1;
        var3.field2690 = arg2;
        class199 var4 = field2697;
        synchronized (field2697) {
            field2697.method3598(var3);
        }
        method2677();
    }

    @ObfuscatedName("g.w(ILea;Lfn;B)V")
    public static void method3(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2697;
        synchronized (field2697) {
            for (class169 var5 = (class169) field2697.method3603(); var5 != null; var5 = (class169) field2697.method3596()) {
                if ((long) arg0 == var5.field3099 && var5.field2690 == arg1 && var5.field2689 == 0) {
                    var3 = var5.field2694;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2724(arg0);
            arg2.method3170(arg1, arg0, var7, true);
        } else {
            arg2.method3170(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("dk.d(I)V")
    public static void method2677() {
        Object var0 = field2699;
        synchronized (field2699) {
            if (field2698 == 0) {
                Statics.field107.method2742(new class170(), 5);
            }
            field2698 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2697;
                class169 var2;
                synchronized (field2697) {
                    var2 = (class169) field2697.method3603();
                }
                if (var2 == null) {
                    class127.method2632(100L);
                    Object var10 = field2699;
                    synchronized (field2699) {
                        if (field2698 <= 1) {
                            field2698 = 0;
                            field2699.notifyAll();
                            return;
                        }
                        field2698--;
                    }
                } else {
                    if (var2.field2689 == 0) {
                        var2.field2690.method2731((int) var2.field3099, var2.field2694, var2.field2694.length);
                        class199 var4 = field2697;
                        synchronized (field2697) {
                            var2.method3693();
                        }
                    } else if (var2.field2689 == 1) {
                        var2.field2694 = var2.field2690.method2724((int) var2.field3099);
                        class199 var6 = field2697;
                        synchronized (field2697) {
                            field2696.method3598(var2);
                        }
                    }
                    Object var8 = field2699;
                    synchronized (field2699) {
                        if (field2698 <= 1) {
                            field2698 = 0;
                            field2699.notifyAll();
                            return;
                        }
                        field2698 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method2631((String) null, var18);
        }
    }
}
