package deob;

@ObfuscatedName("ic")
public class class235 implements Runnable {

    @ObfuscatedName("ic.u")
    public static class262 field3157 = new class262();

    @ObfuscatedName("ic.f")
    public static class262 field3155 = new class262();

    @ObfuscatedName("ic.b")
    public static int field3156 = 0;

    @ObfuscatedName("ic.g")
    public static Object field3154 = new Object();

    @ObfuscatedName("cb.u(I[BLke;I)V")
    public static void method1942(int arg0, byte[] arg1, class308 arg2) {
        class232 var3 = new class232();
        var3.field3127 = 0;
        var3.field2126 = (long) arg0;
        var3.field3125 = arg1;
        var3.field3126 = arg2;
        class262 var4 = field3157;
        synchronized (field3157) {
            field3157.method4563(var3);
        }
        Object var6 = field3154;
        synchronized (field3154) {
            if (field3156 == 0) {
                Statics.field3158 = new Thread(new class235());
                Statics.field3158.setDaemon(true);
                Statics.field3158.start();
                Statics.field3158.setPriority(5);
            }
            field3156 = 600;
        }
    }

    @ObfuscatedName("az.f(ILke;Lij;I)V")
    public static void method653(int arg0, class308 arg1, class236 arg2) {
        class232 var3 = new class232();
        var3.field3127 = 1;
        var3.field2126 = (long) arg0;
        var3.field3126 = arg1;
        var3.field3130 = arg2;
        class262 var4 = field3157;
        synchronized (field3157) {
            field3157.method4563(var3);
        }
        Object var6 = field3154;
        synchronized (field3154) {
            if (field3156 == 0) {
                Statics.field3158 = new Thread(new class235());
                Statics.field3158.setDaemon(true);
                Statics.field3158.start();
                Statics.field3158.setPriority(5);
            }
            field3156 = 600;
        }
    }

    @ObfuscatedName("hb.b(ILke;Lij;I)V")
    public static void method3824(int arg0, class308 arg1, class236 arg2) {
        byte[] var3 = null;
        class262 var4 = field3157;
        synchronized (field3157) {
            for (class232 var5 = (class232) field3157.method4568(); var5 != null; var5 = (class232) field3157.method4561()) {
                if ((long) arg0 == var5.field2126 && var5.field3126 == arg1 && var5.field3127 == 0) {
                    var3 = var5.field3125;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5454(arg0);
            arg2.method3959(arg1, arg0, var7, true);
        } else {
            arg2.method3959(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("im.g(I)V")
    public static void method3999() {
        while (true) {
            class262 var0 = field3157;
            class232 var1;
            synchronized (field3157) {
                var1 = (class232) field3155.method4566();
            }
            if (var1 == null) {
                return;
            }
            var1.field3130.method3959(var1.field3126, (int) var1.field2126, var1.field3125, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class262 var1 = field3157;
                class232 var2;
                synchronized (field3157) {
                    var2 = (class232) field3157.method4568();
                }
                if (var2 == null) {
                    long var10 = 99L;
                    try {
                        Thread.sleep(var10);
                    } catch (InterruptedException var22) {
                    }
                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException var21) {
                    }
                    Object var14 = field3154;
                    synchronized (field3154) {
                        if (field3156 <= 1) {
                            field3156 = 0;
                            field3154.notifyAll();
                            return;
                        }
                        field3156--;
                    }
                } else {
                    if (var2.field3127 == 0) {
                        var2.field3126.method5455((int) var2.field2126, var2.field3125, var2.field3125.length);
                        class262 var4 = field3157;
                        synchronized (field3157) {
                            var2.method3332();
                        }
                    } else if (var2.field3127 == 1) {
                        var2.field3125 = var2.field3126.method5454((int) var2.field2126);
                        class262 var6 = field3157;
                        synchronized (field3157) {
                            field3155.method4563(var2);
                        }
                    }
                    Object var8 = field3154;
                    synchronized (field3154) {
                        if (field3156 <= 1) {
                            field3156 = 0;
                            field3154.notifyAll();
                            return;
                        }
                        field3156 = 600;
                    }
                }
            }
        } catch (Exception var24) {
            class341.method3640((String) null, var24);
        }
    }
}
