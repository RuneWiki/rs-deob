package deob;

@ObfuscatedName("fx")
public class class170 implements Runnable {

    @ObfuscatedName("fx.i")
    public static class199 field2700 = new class199();

    @ObfuscatedName("fx.v")
    public static class199 field2704 = new class199();

    @ObfuscatedName("fx.f")
    public static int field2701 = 0;

    @ObfuscatedName("fx.h")
    public static Object field2702 = new Object();

    @ObfuscatedName("cr.h(I[BLet;I)V")
    public static void method2089(int arg0, byte[] arg1, class134 arg2) {
        class169 var3 = new class169();
        var3.field2697 = 0;
        var3.field3099 = (long) arg0;
        var3.field2694 = arg1;
        var3.field2693 = arg2;
        class199 var4 = field2700;
        synchronized (field2700) {
            field2700.method3545(var3);
        }
        Object var6 = field2702;
        synchronized (field2702) {
            if (field2701 == 0) {
                Statics.field1158.method2683(new class170(), 5);
            }
            field2701 = 600;
        }
    }

    @ObfuscatedName("ax.a(ILet;Lfg;B)V")
    public static void method671(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2700;
        synchronized (field2700) {
            for (class169 var5 = (class169) field2700.method3535(); var5 != null; var5 = (class169) field2700.method3537()) {
                if ((long) arg0 == var5.field3099 && var5.field2693 == arg1 && var5.field2697 == 0) {
                    var3 = var5.field2694;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2659(arg0);
            arg2.method3092(arg1, arg0, var7, true);
        } else {
            arg2.method3092(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("k.s(B)V")
    public static void method113() {
        while (true) {
            class199 var0 = field2700;
            class169 var1;
            synchronized (field2700) {
                var1 = (class169) field2704.method3542();
            }
            if (var1 == null) {
                return;
            }
            var1.field2696.method3092(var1.field2693, (int) var1.field3099, var1.field2694, false);
        }
    }

    @ObfuscatedName("k.p(I)V")
    public static void method115() {
        Object var0 = field2702;
        synchronized (field2702) {
            if (field2701 == 0) {
                Statics.field1158.method2683(new class170(), 5);
            }
            field2701 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2700;
                class169 var2;
                synchronized (field2700) {
                    var2 = (class169) field2700.method3535();
                }
                if (var2 == null) {
                    class127.method848(100L);
                    Object var10 = field2702;
                    synchronized (field2702) {
                        if (field2701 <= 1) {
                            field2701 = 0;
                            field2702.notifyAll();
                            return;
                        }
                        field2701--;
                    }
                } else {
                    if (var2.field2697 == 0) {
                        var2.field2693.method2653((int) var2.field3099, var2.field2694, var2.field2694.length);
                        class199 var4 = field2700;
                        synchronized (field2700) {
                            var2.method3624();
                        }
                    } else if (var2.field2697 == 1) {
                        var2.field2694 = var2.field2693.method2659((int) var2.field3099);
                        class199 var6 = field2700;
                        synchronized (field2700) {
                            field2704.method3545(var2);
                        }
                    }
                    Object var8 = field2702;
                    synchronized (field2702) {
                        if (field2701 <= 1) {
                            field2701 = 0;
                            field2702.notifyAll();
                            return;
                        }
                        field2701 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method929((String) null, var18);
        }
    }
}
