package deob;

@ObfuscatedName("fq")
public class class170 implements Runnable {

    @ObfuscatedName("fq.k")
    public static class199 field2700 = new class199();

    @ObfuscatedName("fq.h")
    public static class199 field2697 = new class199();

    @ObfuscatedName("fq.o")
    public static int field2699 = 0;

    @ObfuscatedName("fq.z")
    public static Object field2698 = new Object();

    @ObfuscatedName("at.o(I[BLel;I)V")
    public static void method690(int arg0, byte[] arg1, class134 arg2) {
        class169 var3 = new class169();
        var3.field2694 = 0;
        var3.field3111 = (long) arg0;
        var3.field2690 = arg1;
        var3.field2691 = arg2;
        class199 var4 = field2700;
        synchronized (field2700) {
            field2700.method3588(var3);
        }
        method3166();
    }

    @ObfuscatedName("dp.z(ILel;Lfd;B)V")
    public static void method2212(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2700;
        synchronized (field2700) {
            for (class169 var5 = (class169) field2700.method3581(); var5 != null; var5 = (class169) field2700.method3583()) {
                if ((long) arg0 == var5.field3111 && var5.field2691 == arg1 && var5.field2694 == 0) {
                    var3 = var5.field2690;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2689(arg0);
            arg2.method3132(arg1, arg0, var7, true);
        } else {
            arg2.method3132(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("eg.c(S)V")
    public static void method2848() {
        while (true) {
            class199 var0 = field2700;
            class169 var1;
            synchronized (field2700) {
                var1 = (class169) field2697.method3580();
            }
            if (var1 == null) {
                return;
            }
            var1.field2693.method3132(var1.field2691, (int) var1.field3111, var1.field2690, false);
        }
    }

    @ObfuscatedName("fq.d(B)V")
    public static void method3166() {
        Object var0 = field2698;
        synchronized (field2698) {
            if (field2699 == 0) {
                Statics.field675.method2702(new class170(), 5);
            }
            field2699 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2700;
                class169 var2;
                synchronized (field2700) {
                    var2 = (class169) field2700.method3581();
                }
                if (var2 == null) {
                    class127.method890(100L);
                    Object var10 = field2698;
                    synchronized (field2698) {
                        if (field2699 <= 1) {
                            field2699 = 0;
                            field2698.notifyAll();
                            return;
                        }
                        field2699--;
                    }
                } else {
                    if (var2.field2694 == 0) {
                        var2.field2691.method2684((int) var2.field3111, var2.field2690, var2.field2690.length);
                        class199 var4 = field2700;
                        synchronized (field2700) {
                            var2.method3679();
                        }
                    } else if (var2.field2694 == 1) {
                        var2.field2690 = var2.field2691.method2689((int) var2.field3111);
                        class199 var6 = field2700;
                        synchronized (field2700) {
                            field2697.method3588(var2);
                        }
                    }
                    Object var8 = field2698;
                    synchronized (field2698) {
                        if (field2699 <= 1) {
                            field2699 = 0;
                            field2698.notifyAll();
                            return;
                        }
                        field2699 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method725((String) null, var18);
        }
    }
}
