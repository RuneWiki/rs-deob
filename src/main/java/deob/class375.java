package deob;

@ObfuscatedName("oq")
public class class375 implements Runnable {

    @ObfuscatedName("oq.az")
    public static final class398 field4360 = new class398();

    @ObfuscatedName("oq.ah")
    public static class398 field4363 = new class398();

    @ObfuscatedName("oq.af")
    public static int field4361 = 0;

    @ObfuscatedName("oq.at")
    public static boolean field4359 = false;

    @ObfuscatedName("oq.an")
    public static Object field4366 = new Object();

    @ObfuscatedName("ne.az(I[BLra;B)V")
    public static void method6204(int arg0, byte[] arg1, class463 arg2) {
        class374 var3 = new class374();
        var3.field4355 = 0;
        var3.field4951 = (long) arg0;
        var3.field4356 = arg1;
        var3.field4357 = arg2;
        class398 var4 = field4360;
        synchronized (field4360) {
            field4360.method6581(var3);
        }
        Object var6 = field4366;
        synchronized (field4366) {
            if (field4361 == 0) {
                Statics.field4364 = new Thread(new class375());
                Statics.field4364.setDaemon(true);
                Statics.field4364.start();
                Statics.field4364.setPriority(5);
            }
            field4361 = 600;
            field4359 = false;
        }
    }

    @ObfuscatedName("eg.ah(ILra;Lov;I)V")
    public static void method2813(int arg0, class463 arg1, class376 arg2) {
        class374 var3 = new class374();
        var3.field4355 = 1;
        var3.field4951 = (long) arg0;
        var3.field4357 = arg1;
        var3.field4358 = arg2;
        class398 var4 = field4360;
        synchronized (field4360) {
            field4360.method6581(var3);
        }
        Object var6 = field4366;
        synchronized (field4366) {
            if (field4361 == 0) {
                Statics.field4364 = new Thread(new class375());
                Statics.field4364.setDaemon(true);
                Statics.field4364.start();
                Statics.field4364.setPriority(5);
            }
            field4361 = 600;
            field4359 = false;
        }
    }

    public void run() {
        try {
            while (true) {
                class398 var1 = field4360;
                class374 var2;
                synchronized (field4360) {
                    var2 = (class374) field4360.method6591();
                }
                if (var2 == null) {
                    class319.method7909(100L);
                    Object var10 = field4366;
                    synchronized (field4366) {
                        if ((field4359 || field4361 <= 1) && field4360.method6614()) {
                            field4361 = 0;
                            field4366.notifyAll();
                            return;
                        }
                        field4361--;
                    }
                } else {
                    if (var2.field4355 == 0) {
                        var2.field4357.method7612((int) var2.field4951, var2.field4356, var2.field4356.length);
                        class398 var4 = field4360;
                        synchronized (field4360) {
                            var2.method7855();
                        }
                    } else if (var2.field4355 == 1) {
                        var2.field4356 = var2.field4357.method7603((int) var2.field4951);
                        class398 var6 = field4360;
                        synchronized (field4360) {
                            field4363.method6581(var2);
                        }
                    }
                    Object var8 = field4366;
                    synchronized (field4366) {
                        if ((field4359 || field4361 <= 1) && field4360.method6614()) {
                            field4361 = 0;
                            field4366.notifyAll();
                            return;
                        }
                        field4361 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class561.method3291((String) null, var18);
        }
    }

    @ObfuscatedName("ic.af(B)V")
    public static void method3713() {
        Object var0 = field4366;
        synchronized (field4366) {
            if (field4361 != 0) {
                field4361 = 1;
                field4359 = true;
                try {
                    field4366.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
