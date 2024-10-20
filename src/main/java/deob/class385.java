package deob;

@ObfuscatedName("oq")
public class class385 implements Runnable {

    @ObfuscatedName("oq.ab")
    public static final class408 field4445 = new class408();

    @ObfuscatedName("oq.ay")
    public static class408 field4440 = new class408();

    @ObfuscatedName("oq.an")
    public static int field4439 = 0;

    @ObfuscatedName("oq.au")
    public static boolean field4442 = false;

    @ObfuscatedName("oq.ax")
    public static Object field4441 = new Object();

    @ObfuscatedName("ho.ab(ILsi;Loj;B)V")
    public static void method3840(int arg0, class484 arg1, class386 arg2) {
        class384 var3 = new class384();
        var3.field4437 = 1;
        var3.field5075 = (long) arg0;
        var3.field4438 = arg1;
        var3.field4436 = arg2;
        class408 var4 = field4445;
        synchronized (field4445) {
            field4445.method6892(var3);
        }
        method3336();
    }

    @ObfuscatedName("gq.ay(I)V")
    public static void method3336() {
        Object var0 = field4441;
        synchronized (field4441) {
            if (field4439 == 0) {
                Statics.field58 = new Thread(new class385());
                Statics.field58.setDaemon(true);
                Statics.field58.start();
                Statics.field58.setPriority(5);
            }
            field4439 = 600;
            field4442 = false;
        }
    }

    public void run() {
        try {
            while (true) {
                class408 var1 = field4445;
                class384 var2;
                synchronized (field4445) {
                    var2 = (class384) field4445.method6907();
                }
                if (var2 == null) {
                    class330.method3326(100L);
                    Object var10 = field4441;
                    synchronized (field4441) {
                        if ((field4442 || field4439 <= 1) && field4445.method6900()) {
                            field4439 = 0;
                            field4441.notifyAll();
                            return;
                        }
                        field4439--;
                    }
                } else {
                    if (var2.field4437 == 0) {
                        var2.field4438.method8118((int) var2.field5075, var2.field4435, var2.field4435.length);
                        class408 var4 = field4445;
                        synchronized (field4445) {
                            var2.method8218();
                        }
                    } else if (var2.field4437 == 1) {
                        var2.field4435 = var2.field4438.method8116((int) var2.field5075);
                        class408 var6 = field4445;
                        synchronized (field4445) {
                            field4440.method6892(var2);
                        }
                    }
                    Object var8 = field4441;
                    synchronized (field4441) {
                        if ((field4442 || field4439 <= 1) && field4445.method6900()) {
                            field4439 = 0;
                            field4441.notifyAll();
                            return;
                        }
                        field4439 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class575.method2216((String) null, var18);
        }
    }

    @ObfuscatedName("gd.an(I)V")
    public static void method3329() {
        Object var0 = field4441;
        synchronized (field4441) {
            if (field4439 != 0) {
                field4439 = 1;
                field4442 = true;
                try {
                    field4441.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
