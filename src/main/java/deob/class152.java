package deob;

@ObfuscatedName("ev")
public class class152 implements Runnable {

    @ObfuscatedName("ev.c")
    public static class180 field2497 = new class180();

    @ObfuscatedName("ev.j")
    public static class180 field2492 = new class180();

    @ObfuscatedName("ev.y")
    public static int field2493 = 0;

    @ObfuscatedName("ev.r")
    public static Object field2491 = new Object();

    @ObfuscatedName("aj.r(I[BLdt;I)V")
    public static void method756(int arg0, byte[] arg1, class123 arg2) {
        class151 var3 = new class151();
        var3.field2490 = 0;
        var3.field2886 = (long) arg0;
        var3.field2488 = arg1;
        var3.field2489 = arg2;
        class180 var4 = field2497;
        synchronized (field2497) {
            field2497.method3241(var3);
        }
        Object var6 = field2491;
        synchronized (field2491) {
            if (field2493 == 0) {
                Statics.field122.method2500(new class152(), 5);
            }
            field2493 = 600;
        }
    }

    @ObfuscatedName("aq.f(ILdt;Leo;B)V")
    public static void method886(int arg0, class123 arg1, class150 arg2) {
        class151 var3 = new class151();
        var3.field2490 = 1;
        var3.field2886 = (long) arg0;
        var3.field2489 = arg1;
        var3.field2487 = arg2;
        class180 var4 = field2497;
        synchronized (field2497) {
            field2497.method3241(var3);
        }
        Object var6 = field2491;
        synchronized (field2491) {
            if (field2493 == 0) {
                Statics.field122.method2500(new class152(), 5);
            }
            field2493 = 600;
        }
    }

    @ObfuscatedName("dd.l(ILdt;Leo;I)V")
    public static void method2390(int arg0, class123 arg1, class150 arg2) {
        byte[] var3 = null;
        class180 var4 = field2497;
        synchronized (field2497) {
            for (class151 var5 = (class151) field2497.method3249(); var5 != null; var5 = (class151) field2497.method3248()) {
                if ((long) arg0 == var5.field2886 && var5.field2489 == arg1 && var5.field2490 == 0) {
                    var3 = var5.field2488;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2475(arg0);
            arg2.method2822(arg1, arg0, var7, true);
        } else {
            arg2.method2822(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ex.b(I)V")
    public static void method2686() {
        while (true) {
            class180 var0 = field2497;
            class151 var1;
            synchronized (field2497) {
                var1 = (class151) field2492.method3244();
            }
            if (var1 == null) {
                return;
            }
            var1.field2487.method2822(var1.field2489, (int) var1.field2886, var1.field2488, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class180 var1 = field2497;
                class151 var2;
                synchronized (field2497) {
                    var2 = (class151) field2497.method3249();
                }
                if (var2 == null) {
                    class116.method2713(100L);
                    Object var10 = field2491;
                    synchronized (field2491) {
                        if (field2493 <= 1) {
                            field2493 = 0;
                            field2491.notifyAll();
                            return;
                        }
                        field2493--;
                    }
                } else {
                    if (var2.field2490 == 0) {
                        var2.field2489.method2476((int) var2.field2886, var2.field2488, var2.field2488.length);
                        class180 var4 = field2497;
                        synchronized (field2497) {
                            var2.method3334();
                        }
                    } else if (var2.field2490 == 1) {
                        var2.field2488 = var2.field2489.method2475((int) var2.field2886);
                        class180 var6 = field2497;
                        synchronized (field2497) {
                            field2492.method3241(var2);
                        }
                    }
                    Object var8 = field2491;
                    synchronized (field2491) {
                        if (field2493 <= 1) {
                            field2493 = 0;
                            field2491.notifyAll();
                            return;
                        }
                        field2493 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class137.method880((String) null, var18);
        }
    }

    @ObfuscatedName("x.k(I)V")
    public static void method118() {
        Object var0 = field2491;
        synchronized (field2491) {
            if (field2493 != 0) {
                field2493 = 1;
                try {
                    field2491.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
