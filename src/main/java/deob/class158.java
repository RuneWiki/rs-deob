package deob;

@ObfuscatedName("fh")
public class class158 implements Runnable {

    @ObfuscatedName("fh.f")
    public static class177 field2583 = new class177();

    @ObfuscatedName("fh.t")
    public static class177 field2581 = new class177();

    @ObfuscatedName("fh.n")
    public static int field2582 = 0;

    @ObfuscatedName("fh.e")
    public static Object field2580 = new Object();

    @ObfuscatedName("ab.l(I[BLbl;S)V")
    public static void method819(int arg0, byte[] arg1, class71 arg2) {
        class157 var3 = new class157();
        var3.field2579 = 0;
        var3.field2812 = (long) arg0;
        var3.field2578 = arg1;
        var3.field2572 = arg2;
        class177 var4 = field2583;
        synchronized (field2583) {
            field2583.method3333(var3);
        }
        method2442();
    }

    @ObfuscatedName("dy.d(ILbl;Lep;I)V")
    public static void method2378(int arg0, class71 arg1, class155 arg2) {
        class157 var3 = new class157();
        var3.field2579 = 1;
        var3.field2812 = (long) arg0;
        var3.field2572 = arg1;
        var3.field2574 = arg2;
        class177 var4 = field2583;
        synchronized (field2583) {
            field2583.method3333(var3);
        }
        method2442();
    }

    @ObfuscatedName("dr.r(ILbl;Lep;S)V")
    public static void method2232(int arg0, class71 arg1, class155 arg2) {
        byte[] var3 = null;
        class177 var4 = field2583;
        synchronized (field2583) {
            for (class157 var5 = (class157) field2583.method3362(); var5 != null; var5 = (class157) field2583.method3350()) {
                if ((long) arg0 == var5.field2812 && var5.field2572 == arg1 && var5.field2579 == 0) {
                    var3 = var5.field2578;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1420(arg0);
            arg2.method3117(arg1, arg0, var7, true);
        } else {
            arg2.method3117(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("eh.k(I)V")
    public static void method2892() {
        while (true) {
            class177 var0 = field2583;
            class157 var1;
            synchronized (field2583) {
                var1 = (class157) field2581.method3358();
            }
            if (var1 == null) {
                return;
            }
            var1.field2574.method3117(var1.field2572, (int) var1.field2812, var1.field2578, false);
        }
    }

    @ObfuscatedName("de.u(I)V")
    public static void method2442() {
        Object var0 = field2580;
        synchronized (field2580) {
            if (field2582 == 0) {
                Statics.field1214.method1507(new class158(), 5);
            }
            field2582 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2583;
                class157 var2;
                synchronized (field2583) {
                    var2 = (class157) field2583.method3362();
                }
                if (var2 == null) {
                    class126.method815(100L);
                    Object var10 = field2580;
                    synchronized (field2580) {
                        if (field2582 <= 1) {
                            field2582 = 0;
                            field2580.notifyAll();
                            return;
                        }
                        field2582--;
                    }
                } else {
                    if (var2.field2579 == 0) {
                        var2.field2572.method1427((int) var2.field2812, var2.field2578, var2.field2578.length);
                        class177 var4 = field2583;
                        synchronized (field2583) {
                            var2.method3374();
                        }
                    } else if (var2.field2579 == 1) {
                        var2.field2578 = var2.field2572.method1420((int) var2.field2812);
                        class177 var6 = field2583;
                        synchronized (field2583) {
                            field2581.method3333(var2);
                        }
                    }
                    Object var8 = field2580;
                    synchronized (field2580) {
                        if (field2582 <= 1) {
                            field2582 = 0;
                            field2580.notifyAll();
                            return;
                        }
                        field2582 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method802((String) null, var18);
        }
    }

    @ObfuscatedName("s.o(B)V")
    public static void method134() {
        Object var0 = field2580;
        synchronized (field2580) {
            if (field2582 != 0) {
                field2582 = 1;
                try {
                    field2580.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
