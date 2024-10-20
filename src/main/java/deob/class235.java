package deob;

@ObfuscatedName("ih")
public class class235 implements Runnable {

    @ObfuscatedName("ih.z")
    public static class262 field3127 = new class262();

    @ObfuscatedName("ih.n")
    public static class262 field3126 = new class262();

    @ObfuscatedName("ih.v")
    public static int field3128 = 0;

    @ObfuscatedName("ih.u")
    public static Object field3125 = new Object();

    @ObfuscatedName("fa.z(I[BLkg;I)V")
    public static void method3217(int arg0, byte[] arg1, class308 arg2) {
        class232 var3 = new class232();
        var3.field3101 = 0;
        var3.field2094 = (long) arg0;
        var3.field3100 = arg1;
        var3.field3098 = arg2;
        class262 var4 = field3127;
        synchronized (field3127) {
            field3127.method4433(var3);
        }
        Object var6 = field3125;
        synchronized (field3125) {
            if (field3128 == 0) {
                Statics.field1965 = new Thread(new class235());
                Statics.field1965.setDaemon(true);
                Statics.field1965.start();
                Statics.field1965.setPriority(5);
            }
            field3128 = 600;
        }
    }

    @ObfuscatedName("ac.n(ILkg;Lie;I)V")
    public static void method365(int arg0, class308 arg1, class236 arg2) {
        byte[] var3 = null;
        class262 var4 = field3127;
        synchronized (field3127) {
            for (class232 var5 = (class232) field3127.method4431(); var5 != null; var5 = (class232) field3127.method4454()) {
                if ((long) arg0 == var5.field2094 && var5.field3098 == arg1 && var5.field3101 == 0) {
                    var3 = var5.field3100;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5293(arg0);
            arg2.method3859(arg1, arg0, var7, true);
        } else {
            arg2.method3859(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class262 var1 = field3127;
                class232 var2;
                synchronized (field3127) {
                    var2 = (class232) field3127.method4431();
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
                    Object var14 = field3125;
                    synchronized (field3125) {
                        if (field3128 <= 1) {
                            field3128 = 0;
                            field3125.notifyAll();
                            return;
                        }
                        field3128--;
                    }
                } else {
                    if (var2.field3101 == 0) {
                        var2.field3098.method5302((int) var2.field2094, var2.field3100, var2.field3100.length);
                        class262 var4 = field3127;
                        synchronized (field3127) {
                            var2.method3249();
                        }
                    } else if (var2.field3101 == 1) {
                        var2.field3100 = var2.field3098.method5293((int) var2.field2094);
                        class262 var6 = field3127;
                        synchronized (field3127) {
                            field3126.method4433(var2);
                        }
                    }
                    Object var8 = field3125;
                    synchronized (field3125) {
                        if (field3128 <= 1) {
                            field3128 = 0;
                            field3125.notifyAll();
                            return;
                        }
                        field3128 = 600;
                    }
                }
            }
        } catch (Exception var24) {
            class341.method511((String) null, var24);
        }
    }

    @ObfuscatedName("eh.v(I)V")
    public static void method2980() {
        Object var0 = field3125;
        synchronized (field3125) {
            if (field3128 != 0) {
                field3128 = 1;
                try {
                    field3125.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
