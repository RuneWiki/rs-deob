package deob;

@ObfuscatedName("fm")
public class class157 implements Runnable {

    @ObfuscatedName("fm.x")
    public static class177 field2560 = new class177();

    @ObfuscatedName("fm.p")
    public static class177 field2562 = new class177();

    @ObfuscatedName("fm.k")
    public static int field2561 = 0;

    @ObfuscatedName("fm.a")
    public static Object field2566 = new Object();

    @ObfuscatedName("bg.k(I[BLbt;B)V")
    public static void method1324(int arg0, byte[] arg1, class71 arg2) {
        class156 var3 = new class156();
        var3.field2553 = 0;
        var3.field2816 = (long) arg0;
        var3.field2552 = arg1;
        var3.field2551 = arg2;
        class177 var4 = field2560;
        synchronized (field2560) {
            field2560.method3264(var3);
        }
        Object var6 = field2566;
        synchronized (field2566) {
            if (field2561 == 0) {
                Statics.field1301.method1458(new class157(), 5);
            }
            field2561 = 600;
        }
    }

    @ObfuscatedName("u.a(ILbt;Leq;I)V")
    public static void method131(int arg0, class71 arg1, class154 arg2) {
        byte[] var3 = null;
        class177 var4 = field2560;
        synchronized (field2560) {
            for (class156 var5 = (class156) field2560.method3280(); var5 != null; var5 = (class156) field2560.method3269()) {
                if ((long) arg0 == var5.field2816 && var5.field2551 == arg1 && var5.field2553 == 0) {
                    var3 = var5.field2552;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1374(arg0);
            arg2.method3007(arg1, arg0, var7, true);
        } else {
            arg2.method3007(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2560;
                class156 var2;
                synchronized (field2560) {
                    var2 = (class156) field2560.method3280();
                }
                if (var2 == null) {
                    class126.method731(100L);
                    Object var10 = field2566;
                    synchronized (field2566) {
                        if (field2561 <= 1) {
                            field2561 = 0;
                            field2566.notifyAll();
                            return;
                        }
                        field2561--;
                    }
                } else {
                    if (var2.field2553 == 0) {
                        var2.field2551.method1375((int) var2.field2816, var2.field2552, var2.field2552.length);
                        class177 var4 = field2560;
                        synchronized (field2560) {
                            var2.method3301();
                        }
                    } else if (var2.field2553 == 1) {
                        var2.field2552 = var2.field2551.method1374((int) var2.field2816);
                        class177 var6 = field2560;
                        synchronized (field2560) {
                            field2562.method3264(var2);
                        }
                    }
                    Object var8 = field2566;
                    synchronized (field2566) {
                        if (field2561 <= 1) {
                            field2561 = 0;
                            field2566.notifyAll();
                            return;
                        }
                        field2561 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method2341((String) null, var18);
        }
    }

    @ObfuscatedName("h.q(B)V")
    public static void method130() {
        Object var0 = field2566;
        synchronized (field2566) {
            if (field2561 != 0) {
                field2561 = 1;
                try {
                    field2566.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
