package deob;

@ObfuscatedName("fq")
public class class174 implements Runnable {

    @ObfuscatedName("fq.s")
    public static class203 field2761 = new class203();

    @ObfuscatedName("fq.z")
    public static class203 field2762 = new class203();

    @ObfuscatedName("fq.t")
    public static int field2760 = 0;

    @ObfuscatedName("fq.y")
    public static Object field2763 = new Object();

    @ObfuscatedName("ap.t(I[BLes;B)V")
    public static void method754(int arg0, byte[] arg1, class138 arg2) {
        class173 var3 = new class173();
        var3.field2759 = 0;
        var3.field3167 = (long) arg0;
        var3.field2758 = arg1;
        var3.field2751 = arg2;
        class203 var4 = field2761;
        synchronized (field2761) {
            field2761.method3581(var3);
        }
        method1577();
    }

    @ObfuscatedName("cn.y(ILes;Lff;B)V")
    public static void method2070(int arg0, class138 arg1, class172 arg2) {
        byte[] var3 = null;
        class203 var4 = field2761;
        synchronized (field2761) {
            for (class173 var5 = (class173) field2761.method3588(); var5 != null; var5 = (class173) field2761.method3590()) {
                if ((long) arg0 == var5.field3167 && var5.field2751 == arg1 && var5.field2759 == 0) {
                    var3 = var5.field2758;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2745(arg0);
            arg2.method3155(arg1, arg0, var7, true);
        } else {
            arg2.method3155(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("fn.p(I)V")
    public static void method2983() {
        while (true) {
            class203 var0 = field2761;
            class173 var1;
            synchronized (field2761) {
                var1 = (class173) field2762.method3586();
            }
            if (var1 == null) {
                return;
            }
            var1.field2752.method3155(var1.field2751, (int) var1.field3167, var1.field2758, false);
        }
    }

    @ObfuscatedName("cj.g(B)V")
    public static void method1577() {
        Object var0 = field2763;
        synchronized (field2763) {
            if (field2760 == 0) {
                Statics.field122.method2755(new class174(), 5);
            }
            field2760 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class203 var1 = field2761;
                class173 var2;
                synchronized (field2761) {
                    var2 = (class173) field2761.method3588();
                }
                if (var2 == null) {
                    class131.method182(100L);
                    Object var10 = field2763;
                    synchronized (field2763) {
                        if (field2760 <= 1) {
                            field2760 = 0;
                            field2763.notifyAll();
                            return;
                        }
                        field2760--;
                    }
                } else {
                    if (var2.field2759 == 0) {
                        var2.field2751.method2740((int) var2.field3167, var2.field2758, var2.field2758.length);
                        class203 var4 = field2761;
                        synchronized (field2761) {
                            var2.method3699();
                        }
                    } else if (var2.field2759 == 1) {
                        var2.field2758 = var2.field2751.method2745((int) var2.field3167);
                        class203 var6 = field2761;
                        synchronized (field2761) {
                            field2762.method3581(var2);
                        }
                    }
                    Object var8 = field2763;
                    synchronized (field2763) {
                        if (field2760 <= 1) {
                            field2760 = 0;
                            field2763.notifyAll();
                            return;
                        }
                        field2760 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class152.method2846((String) null, var18);
        }
    }

    @ObfuscatedName("db.m(I)V")
    public static void method2153() {
        Object var0 = field2763;
        synchronized (field2763) {
            if (field2760 != 0) {
                field2760 = 1;
                try {
                    field2763.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
