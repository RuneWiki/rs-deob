package deob;

@ObfuscatedName("fz")
public class class157 implements Runnable {

    @ObfuscatedName("fz.i")
    public static class177 field2577 = new class177();

    @ObfuscatedName("fz.p")
    public static class177 field2578 = new class177();

    @ObfuscatedName("fz.a")
    public static int field2579 = 0;

    @ObfuscatedName("fz.l")
    public static Object field2580 = new Object();

    @ObfuscatedName("y.a(I[BLbb;B)V")
    public static void method154(int arg0, byte[] arg1, class71 arg2) {
        class156 var3 = new class156();
        var3.field2574 = 0;
        var3.field2818 = (long) arg0;
        var3.field2573 = arg1;
        var3.field2576 = arg2;
        class177 var4 = field2577;
        synchronized (field2577) {
            field2577.method3308(var3);
        }
        Object var6 = field2580;
        synchronized (field2580) {
            if (field2579 == 0) {
                Statics.field2466.method1455(new class157(), 5);
            }
            field2579 = 600;
        }
    }

    @ObfuscatedName("cw.l(ILbb;Let;I)V")
    public static void method2059(int arg0, class71 arg1, class154 arg2) {
        class156 var3 = new class156();
        var3.field2574 = 1;
        var3.field2818 = (long) arg0;
        var3.field2576 = arg1;
        var3.field2572 = arg2;
        class177 var4 = field2577;
        synchronized (field2577) {
            field2577.method3308(var3);
        }
        Object var6 = field2580;
        synchronized (field2580) {
            if (field2579 == 0) {
                Statics.field2466.method1455(new class157(), 5);
            }
            field2579 = 600;
        }
    }

    @ObfuscatedName("u.q(ILbb;Let;B)V")
    public static void method59(int arg0, class71 arg1, class154 arg2) {
        byte[] var3 = null;
        class177 var4 = field2577;
        synchronized (field2577) {
            for (class156 var5 = (class156) field2577.method3313(); var5 != null; var5 = (class156) field2577.method3292()) {
                if ((long) arg0 == var5.field2818 && var5.field2576 == arg1 && var5.field2574 == 0) {
                    var3 = var5.field2573;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1357(arg0);
            arg2.method3041(arg1, arg0, var7, true);
        } else {
            arg2.method3041(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2577;
                class156 var2;
                synchronized (field2577) {
                    var2 = (class156) field2577.method3313();
                }
                if (var2 == null) {
                    class126.method1489(100L);
                    Object var10 = field2580;
                    synchronized (field2580) {
                        if (field2579 <= 1) {
                            field2579 = 0;
                            field2580.notifyAll();
                            return;
                        }
                        field2579--;
                    }
                } else {
                    if (var2.field2574 == 0) {
                        var2.field2576.method1358((int) var2.field2818, var2.field2573, var2.field2573.length);
                        class177 var4 = field2577;
                        synchronized (field2577) {
                            var2.method3319();
                        }
                    } else if (var2.field2574 == 1) {
                        var2.field2573 = var2.field2576.method1357((int) var2.field2818);
                        class177 var6 = field2577;
                        synchronized (field2577) {
                            field2578.method3308(var2);
                        }
                    }
                    Object var8 = field2580;
                    synchronized (field2580) {
                        if (field2579 <= 1) {
                            field2579 = 0;
                            field2580.notifyAll();
                            return;
                        }
                        field2579 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method252((String) null, var18);
        }
    }
}
