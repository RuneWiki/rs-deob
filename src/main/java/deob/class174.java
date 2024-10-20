package deob;

@ObfuscatedName("fc")
public class class174 implements Runnable {

    @ObfuscatedName("fc.k")
    public static class203 field2760 = new class203();

    @ObfuscatedName("fc.q")
    public static class203 field2756 = new class203();

    @ObfuscatedName("fc.f")
    public static int field2757 = 0;

    @ObfuscatedName("fc.c")
    public static Object field2758 = new Object();

    @ObfuscatedName("aw.f(ILex;Lfx;B)V")
    public static void method798(int arg0, class138 arg1, class172 arg2) {
        byte[] var3 = null;
        class203 var4 = field2760;
        synchronized (field2760) {
            for (class173 var5 = (class173) field2760.method3616(); var5 != null; var5 = (class173) field2760.method3603()) {
                if ((long) arg0 == var5.field3166 && var5.field2749 == arg1 && var5.field2750 == 0) {
                    var3 = var5.field2748;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2751(arg0);
            arg2.method3158(arg1, arg0, var7, true);
        } else {
            arg2.method3158(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("gb.c(S)V")
    public static void method3528() {
        Object var0 = field2758;
        synchronized (field2758) {
            if (field2757 == 0) {
                Statics.field700.method2766(new class174(), 5);
            }
            field2757 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class203 var1 = field2760;
                class173 var2;
                synchronized (field2760) {
                    var2 = (class173) field2760.method3616();
                }
                if (var2 == null) {
                    class131.method2702(100L);
                    Object var10 = field2758;
                    synchronized (field2758) {
                        if (field2757 <= 1) {
                            field2757 = 0;
                            field2758.notifyAll();
                            return;
                        }
                        field2757--;
                    }
                } else {
                    if (var2.field2750 == 0) {
                        var2.field2749.method2753((int) var2.field3166, var2.field2748, var2.field2748.length);
                        class203 var4 = field2760;
                        synchronized (field2760) {
                            var2.method3703();
                        }
                    } else if (var2.field2750 == 1) {
                        var2.field2748 = var2.field2749.method2751((int) var2.field3166);
                        class203 var6 = field2760;
                        synchronized (field2760) {
                            field2756.method3596(var2);
                        }
                    }
                    Object var8 = field2758;
                    synchronized (field2758) {
                        if (field2757 <= 1) {
                            field2757 = 0;
                            field2758.notifyAll();
                            return;
                        }
                        field2757 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class152.method2817((String) null, var18);
        }
    }

    @ObfuscatedName("a.v(I)V")
    public static void method180() {
        Object var0 = field2758;
        synchronized (field2758) {
            if (field2757 != 0) {
                field2757 = 1;
                try {
                    field2758.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
