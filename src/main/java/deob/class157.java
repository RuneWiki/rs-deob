package deob;

@ObfuscatedName("fx")
public class class157 implements Runnable {

    @ObfuscatedName("fx.a")
    public static class177 field2563 = new class177();

    @ObfuscatedName("fx.r")
    public static class177 field2566 = new class177();

    @ObfuscatedName("fx.u")
    public static int field2564 = 0;

    @ObfuscatedName("fx.t")
    public static Object field2565 = new Object();

    @ObfuscatedName("dn.r(ILbp;Led;I)V")
    public static void method2312(int arg0, class71 arg1, class154 arg2) {
        class156 var3 = new class156();
        var3.field2560 = 1;
        var3.field2817 = (long) arg0;
        var3.field2558 = arg1;
        var3.field2556 = arg2;
        class177 var4 = field2563;
        synchronized (field2563) {
            field2563.method3271(var3);
        }
        Object var6 = field2565;
        synchronized (field2565) {
            if (field2564 == 0) {
                Statics.field156.method1424(new class157(), 5);
            }
            field2564 = 600;
        }
    }

    @ObfuscatedName("ce.u(ILbp;Led;I)V")
    public static void method1515(int arg0, class71 arg1, class154 arg2) {
        byte[] var3 = null;
        class177 var4 = field2563;
        synchronized (field2563) {
            for (class156 var5 = (class156) field2563.method3276(); var5 != null; var5 = (class156) field2563.method3278()) {
                if ((long) arg0 == var5.field2817 && var5.field2558 == arg1 && var5.field2560 == 0) {
                    var3 = var5.field2557;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1353(arg0);
            arg2.method3031(arg1, arg0, var7, true);
        } else {
            arg2.method3031(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2563;
                class156 var2;
                synchronized (field2563) {
                    var2 = (class156) field2563.method3276();
                }
                if (var2 == null) {
                    class127.method1598(100L);
                    Object var10 = field2565;
                    synchronized (field2565) {
                        if (field2564 <= 1) {
                            field2564 = 0;
                            field2565.notifyAll();
                            return;
                        }
                        field2564--;
                    }
                } else {
                    if (var2.field2560 == 0) {
                        var2.field2558.method1344((int) var2.field2817, var2.field2557, var2.field2557.length);
                        class177 var4 = field2563;
                        synchronized (field2563) {
                            var2.method3311();
                        }
                    } else if (var2.field2560 == 1) {
                        var2.field2557 = var2.field2558.method1353((int) var2.field2817);
                        class177 var6 = field2563;
                        synchronized (field2563) {
                            field2566.method3271(var2);
                        }
                    }
                    Object var8 = field2565;
                    synchronized (field2565) {
                        if (field2564 <= 1) {
                            field2564 = 0;
                            field2565.notifyAll();
                            return;
                        }
                        field2564 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method184((String) null, var18);
        }
    }

    @ObfuscatedName("v.t(I)V")
    public static void method46() {
        Object var0 = field2565;
        synchronized (field2565) {
            if (field2564 != 0) {
                field2564 = 1;
                try {
                    field2565.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
