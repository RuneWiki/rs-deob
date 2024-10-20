package deob;

@ObfuscatedName("ff")
public class class170 implements Runnable {

    @ObfuscatedName("ff.n")
    public static class199 field2690 = new class199();

    @ObfuscatedName("ff.d")
    public static class199 field2694 = new class199();

    @ObfuscatedName("ff.s")
    public static int field2691 = 0;

    @ObfuscatedName("ff.q")
    public static Object field2692 = new Object();

    @ObfuscatedName("ai.s(I[BLeh;I)V")
    public static void method911(int arg0, byte[] arg1, class134 arg2) {
        class169 var3 = new class169();
        var3.field2688 = 0;
        var3.field3096 = (long) arg0;
        var3.field2682 = arg1;
        var3.field2687 = arg2;
        class199 var4 = field2690;
        synchronized (field2690) {
            field2690.method3579(var3);
        }
        method3201();
    }

    @ObfuscatedName("el.q(ILeh;Lfz;B)V")
    public static void method2681(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2690;
        synchronized (field2690) {
            for (class169 var5 = (class169) field2690.method3574(); var5 != null; var5 = (class169) field2690.method3568()) {
                if ((long) arg0 == var5.field3096 && var5.field2687 == arg1 && var5.field2688 == 0) {
                    var3 = var5.field2682;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2690(arg0);
            arg2.method3089(arg1, arg0, var7, true);
        } else {
            arg2.method3089(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("fx.j(I)V")
    public static void method3201() {
        Object var0 = field2692;
        synchronized (field2692) {
            if (field2691 == 0) {
                Statics.field2013.method2709(new class170(), 5);
            }
            field2691 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2690;
                class169 var2;
                synchronized (field2690) {
                    var2 = (class169) field2690.method3574();
                }
                if (var2 == null) {
                    class127.method1160(100L);
                    Object var10 = field2692;
                    synchronized (field2692) {
                        if (field2691 <= 1) {
                            field2691 = 0;
                            field2692.notifyAll();
                            return;
                        }
                        field2691--;
                    }
                } else {
                    if (var2.field2688 == 0) {
                        var2.field2687.method2688((int) var2.field3096, var2.field2682, var2.field2682.length);
                        class199 var4 = field2690;
                        synchronized (field2690) {
                            var2.method3651();
                        }
                    } else if (var2.field2688 == 1) {
                        var2.field2682 = var2.field2687.method2690((int) var2.field3096);
                        class199 var6 = field2690;
                        synchronized (field2690) {
                            field2694.method3579(var2);
                        }
                    }
                    Object var8 = field2692;
                    synchronized (field2692) {
                        if (field2691 <= 1) {
                            field2691 = 0;
                            field2692.notifyAll();
                            return;
                        }
                        field2691 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method2798((String) null, var18);
        }
    }

    @ObfuscatedName("cp.k(B)V")
    public static void method1924() {
        Object var0 = field2692;
        synchronized (field2692) {
            if (field2691 != 0) {
                field2691 = 1;
                try {
                    field2692.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
