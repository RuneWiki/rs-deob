package deob;

@ObfuscatedName("fw")
public class class161 implements Runnable {

    @ObfuscatedName("fw.n")
    public static class190 field2611 = new class190();

    @ObfuscatedName("fw.w")
    public static class190 field2610 = new class190();

    @ObfuscatedName("fw.i")
    public static int field2609 = 0;

    @ObfuscatedName("fw.e")
    public static Object field2613 = new Object();

    @ObfuscatedName("ac.h(I[BLdm;B)V")
    public static void method774(int arg0, byte[] arg1, class126 arg2) {
        class160 var3 = new class160();
        var3.field2606 = 0;
        var3.field3013 = (long) arg0;
        var3.field2604 = arg1;
        var3.field2605 = arg2;
        class190 var4 = field2611;
        synchronized (field2611) {
            field2611.method3377(var3);
        }
        Object var6 = field2613;
        synchronized (field2613) {
            if (field2609 == 0) {
                Statics.field813.method2523(new class161(), 5);
            }
            field2609 = 600;
        }
    }

    @ObfuscatedName("z.q(ILdm;Lfi;B)V")
    public static void method150(int arg0, class126 arg1, class159 arg2) {
        class160 var3 = new class160();
        var3.field2606 = 1;
        var3.field3013 = (long) arg0;
        var3.field2605 = arg1;
        var3.field2603 = arg2;
        class190 var4 = field2611;
        synchronized (field2611) {
            field2611.method3377(var3);
        }
        Object var6 = field2613;
        synchronized (field2613) {
            if (field2609 == 0) {
                Statics.field813.method2523(new class161(), 5);
            }
            field2609 = 600;
        }
    }

    @ObfuscatedName("a.l(ILdm;Lfi;S)V")
    public static void method491(int arg0, class126 arg1, class159 arg2) {
        byte[] var3 = null;
        class190 var4 = field2611;
        synchronized (field2611) {
            for (class160 var5 = (class160) field2611.method3382(); var5 != null; var5 = (class160) field2611.method3384()) {
                if ((long) arg0 == var5.field3013 && var5.field2605 == arg1 && var5.field2606 == 0) {
                    var3 = var5.field2604;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2504(arg0);
            arg2.method2936(arg1, arg0, var7, true);
        } else {
            arg2.method2936(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("dj.c(B)V")
    public static void method2472() {
        while (true) {
            class190 var0 = field2611;
            class160 var1;
            synchronized (field2611) {
                var1 = (class160) field2610.method3380();
            }
            if (var1 == null) {
                return;
            }
            var1.field2603.method2936(var1.field2605, (int) var1.field3013, var1.field2604, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class190 var1 = field2611;
                class160 var2;
                synchronized (field2611) {
                    var2 = (class160) field2611.method3382();
                }
                if (var2 == null) {
                    Statics.method849(100L);
                    Object var10 = field2613;
                    synchronized (field2613) {
                        if (field2609 <= 1) {
                            field2609 = 0;
                            field2613.notifyAll();
                            return;
                        }
                        field2609--;
                    }
                } else {
                    if (var2.field2606 == 0) {
                        var2.field2605.method2506((int) var2.field3013, var2.field2604, var2.field2604.length);
                        class190 var4 = field2611;
                        synchronized (field2611) {
                            var2.method3474();
                        }
                    } else if (var2.field2606 == 1) {
                        var2.field2604 = var2.field2605.method2504((int) var2.field3013);
                        class190 var6 = field2611;
                        synchronized (field2611) {
                            field2610.method3377(var2);
                        }
                    }
                    Object var8 = field2613;
                    synchronized (field2613) {
                        if (field2609 <= 1) {
                            field2609 = 0;
                            field2613.notifyAll();
                            return;
                        }
                        field2609 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class140.method1403((String) null, var18);
        }
    }

    @ObfuscatedName("ff.f(I)V")
    public static void method2947() {
        Object var0 = field2613;
        synchronized (field2613) {
            if (field2609 != 0) {
                field2609 = 1;
                try {
                    field2613.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
