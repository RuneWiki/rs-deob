package deob;

@ObfuscatedName("fk")
public class class161 implements Runnable {

    @ObfuscatedName("fk.q")
    public static class189 field2562 = new class189();

    @ObfuscatedName("fk.s")
    public static class189 field2560 = new class189();

    @ObfuscatedName("fk.h")
    public static int field2561 = 0;

    @ObfuscatedName("fk.e")
    public static Object field2563 = new Object();

    @ObfuscatedName("ez.n(I[BLdd;I)V")
    public static void method2720(int arg0, byte[] arg1, class126 arg2) {
        class160 var3 = new class160();
        var3.field2549 = 0;
        var3.field2958 = (long) arg0;
        var3.field2557 = arg1;
        var3.field2551 = arg2;
        class189 var4 = field2562;
        synchronized (field2562) {
            field2562.method3327(var3);
        }
        method2457();
    }

    @ObfuscatedName("ec.t(ILdd;Lfg;I)V")
    public static void method2703(int arg0, class126 arg1, class159 arg2) {
        class160 var3 = new class160();
        var3.field2549 = 1;
        var3.field2958 = (long) arg0;
        var3.field2551 = arg1;
        var3.field2552 = arg2;
        class189 var4 = field2562;
        synchronized (field2562) {
            field2562.method3327(var3);
        }
        method2457();
    }

    @ObfuscatedName("av.l(ILdd;Lfg;B)V")
    public static void method582(int arg0, class126 arg1, class159 arg2) {
        byte[] var3 = null;
        class189 var4 = field2562;
        synchronized (field2562) {
            for (class160 var5 = (class160) field2562.method3309(); var5 != null; var5 = (class160) field2562.method3311()) {
                if ((long) arg0 == var5.field2958 && var5.field2551 == arg1 && var5.field2549 == 0) {
                    var3 = var5.field2557;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2479(arg0);
            arg2.method2892(arg1, arg0, var7, true);
        } else {
            arg2.method2892(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("dz.m(I)V")
    public static void method2457() {
        Object var0 = field2563;
        synchronized (field2563) {
            if (field2561 == 0) {
                Statics.field925.method2501(new class161(), 5);
            }
            field2561 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class189 var1 = field2562;
                class160 var2;
                synchronized (field2562) {
                    var2 = (class160) field2562.method3309();
                }
                if (var2 == null) {
                    class119.method587(100L);
                    Object var10 = field2563;
                    synchronized (field2563) {
                        if (field2561 <= 1) {
                            field2561 = 0;
                            field2563.notifyAll();
                            return;
                        }
                        field2561--;
                    }
                } else {
                    if (var2.field2549 == 0) {
                        var2.field2551.method2480((int) var2.field2958, var2.field2557, var2.field2557.length);
                        class189 var4 = field2562;
                        synchronized (field2562) {
                            var2.method3404();
                        }
                    } else if (var2.field2549 == 1) {
                        var2.field2557 = var2.field2551.method2479((int) var2.field2958);
                        class189 var6 = field2562;
                        synchronized (field2562) {
                            field2560.method3327(var2);
                        }
                    }
                    Object var8 = field2563;
                    synchronized (field2563) {
                        if (field2561 <= 1) {
                            field2561 = 0;
                            field2563.notifyAll();
                            return;
                        }
                        field2561 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class140.method1379((String) null, var18);
        }
    }
}
