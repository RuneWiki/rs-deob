package deob;

@ObfuscatedName("fy")
public class class170 implements Runnable {

    @ObfuscatedName("fy.m")
    public static class199 field2690 = new class199();

    @ObfuscatedName("fy.l")
    public static class199 field2686 = new class199();

    @ObfuscatedName("fy.y")
    public static int field2688 = 0;

    @ObfuscatedName("fy.u")
    public static Object field2689 = new Object();

    @ObfuscatedName("fj.k(I[BLee;B)V")
    public static void method3003(int arg0, byte[] arg1, class134 arg2) {
        class169 var3 = new class169();
        var3.field2682 = 0;
        var3.field3095 = (long) arg0;
        var3.field2678 = arg1;
        var3.field2679 = arg2;
        class199 var4 = field2690;
        synchronized (field2690) {
            field2690.method3606(var3);
        }
        method206();
    }

    @ObfuscatedName("fv.j(ILee;Lfl;B)V")
    public static void method3053(int arg0, class134 arg1, class168 arg2) {
        class169 var3 = new class169();
        var3.field2682 = 1;
        var3.field3095 = (long) arg0;
        var3.field2679 = arg1;
        var3.field2680 = arg2;
        class199 var4 = field2690;
        synchronized (field2690) {
            field2690.method3606(var3);
        }
        method206();
    }

    @ObfuscatedName("du.i(ILee;Lfl;B)V")
    public static void method2256(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2690;
        synchronized (field2690) {
            for (class169 var5 = (class169) field2690.method3611(); var5 != null; var5 = (class169) field2690.method3613()) {
                if ((long) arg0 == var5.field3095 && var5.field2679 == arg1 && var5.field2682 == 0) {
                    var3 = var5.field2678;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2731(arg0);
            arg2.method3166(arg1, arg0, var7, true);
        } else {
            arg2.method3166(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("am.x(I)V")
    public static void method750() {
        while (true) {
            class199 var0 = field2690;
            class169 var1;
            synchronized (field2690) {
                var1 = (class169) field2686.method3609();
            }
            if (var1 == null) {
                return;
            }
            var1.field2680.method3166(var1.field2679, (int) var1.field3095, var1.field2678, false);
        }
    }

    @ObfuscatedName("f.g(B)V")
    public static void method206() {
        Object var0 = field2689;
        synchronized (field2689) {
            if (field2688 == 0) {
                Statics.field2048.method2756(new class170(), 5);
            }
            field2688 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2690;
                class169 var2;
                synchronized (field2690) {
                    var2 = (class169) field2690.method3611();
                }
                if (var2 == null) {
                    class127.method3199(100L);
                    Object var10 = field2689;
                    synchronized (field2689) {
                        if (field2688 <= 1) {
                            field2688 = 0;
                            field2689.notifyAll();
                            return;
                        }
                        field2688--;
                    }
                } else {
                    if (var2.field2682 == 0) {
                        var2.field2679.method2732((int) var2.field3095, var2.field2678, var2.field2678.length);
                        class199 var4 = field2690;
                        synchronized (field2690) {
                            var2.method3702();
                        }
                    } else if (var2.field2682 == 1) {
                        var2.field2678 = var2.field2679.method2731((int) var2.field3095);
                        class199 var6 = field2690;
                        synchronized (field2690) {
                            field2686.method3606(var2);
                        }
                    }
                    Object var8 = field2689;
                    synchronized (field2689) {
                        if (field2688 <= 1) {
                            field2688 = 0;
                            field2689.notifyAll();
                            return;
                        }
                        field2688 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method1554((String) null, var18);
        }
    }

    @ObfuscatedName("dw.e(I)V")
    public static void method2655() {
        Object var0 = field2689;
        synchronized (field2689) {
            if (field2688 != 0) {
                field2688 = 1;
                try {
                    field2689.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
