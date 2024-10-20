package deob;

@ObfuscatedName("ll")
public class class314 implements Runnable {

    @ObfuscatedName("ll.c")
    public static class336 field4012 = new class336();

    @ObfuscatedName("ll.p")
    public static class336 field4013 = new class336();

    @ObfuscatedName("ll.f")
    public static int field4019 = 0;

    @ObfuscatedName("ll.n")
    public static Object field4014 = new Object();

    @ObfuscatedName("be.c(I[BLnj;B)V")
    public static void method1952(int arg0, byte[] arg1, class383 arg2) {
        class313 var3 = new class313();
        var3.field4009 = 0;
        var3.field4504 = (long) arg0;
        var3.field4006 = arg1;
        var3.field4008 = arg2;
        class336 var4 = field4012;
        synchronized (field4012) {
            field4012.method5660(var3);
        }
        Object var6 = field4014;
        synchronized (field4014) {
            if (field4019 == 0) {
                Statics.field4015 = new Thread(new class314());
                Statics.field4015.setDaemon(true);
                Statics.field4015.start();
                Statics.field4015.setPriority(5);
            }
            field4019 = 600;
        }
    }

    @ObfuscatedName("du.p(ILnj;Llb;I)V")
    public static void method2626(int arg0, class383 arg1, class315 arg2) {
        class313 var3 = new class313();
        var3.field4009 = 1;
        var3.field4504 = (long) arg0;
        var3.field4008 = arg1;
        var3.field4007 = arg2;
        class336 var4 = field4012;
        synchronized (field4012) {
            field4012.method5660(var3);
        }
        Object var6 = field4014;
        synchronized (field4014) {
            if (field4019 == 0) {
                Statics.field4015 = new Thread(new class314());
                Statics.field4015.setDaemon(true);
                Statics.field4015.start();
                Statics.field4015.setPriority(5);
            }
            field4019 = 600;
        }
    }

    @ObfuscatedName("ip.f(ILnj;Llb;B)V")
    public static void method4659(int arg0, class383 arg1, class315 arg2) {
        byte[] var3 = null;
        class336 var4 = field4012;
        synchronized (field4012) {
            for (class313 var5 = (class313) field4012.method5647(); var5 != null; var5 = (class313) field4012.method5649()) {
                if ((long) arg0 == var5.field4504 && var5.field4008 == arg1 && var5.field4009 == 0) {
                    var3 = var5.field4006;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method6408(arg0);
            arg2.method5383(arg1, arg0, var7, true);
        } else {
            arg2.method5383(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ew.n(I)V")
    public static void method2994() {
        while (true) {
            class336 var0 = field4012;
            class313 var1;
            synchronized (field4012) {
                var1 = (class313) field4013.method5645();
            }
            if (var1 == null) {
                return;
            }
            var1.field4007.method5383(var1.field4008, (int) var1.field4504, var1.field4006, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class336 var1 = field4012;
                class313 var2;
                synchronized (field4012) {
                    var2 = (class313) field4012.method5647();
                }
                if (var2 == null) {
                    class272.method406(100L);
                    Object var10 = field4014;
                    synchronized (field4014) {
                        if (field4019 <= 1) {
                            field4019 = 0;
                            field4014.notifyAll();
                            return;
                        }
                        field4019--;
                    }
                } else {
                    if (var2.field4009 == 0) {
                        var2.field4008.method6405((int) var2.field4504, var2.field4006, var2.field4006.length);
                        class336 var4 = field4012;
                        synchronized (field4012) {
                            var2.method6657();
                        }
                    } else if (var2.field4009 == 1) {
                        var2.field4006 = var2.field4008.method6408((int) var2.field4504);
                        class336 var6 = field4012;
                        synchronized (field4012) {
                            field4013.method5660(var2);
                        }
                    }
                    Object var8 = field4014;
                    synchronized (field4014) {
                        if (field4019 <= 1) {
                            field4019 = 0;
                            field4014.notifyAll();
                            return;
                        }
                        field4019 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method3146((String) null, var18);
        }
    }

    @ObfuscatedName("eg.k(I)V")
    public static void method2877() {
        Object var0 = field4014;
        synchronized (field4014) {
            if (field4019 != 0) {
                field4019 = 1;
                try {
                    field4014.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
