package deob;

@ObfuscatedName("ol")
public class class388 implements Runnable {

    @ObfuscatedName("ol.ap")
    public static final class411 field4537 = new class411();

    @ObfuscatedName("ol.aw")
    public static class411 field4534 = new class411();

    @ObfuscatedName("ol.ak")
    public static int field4535 = 0;

    @ObfuscatedName("ol.aj")
    public static final Object field4536 = new Object();

    @ObfuscatedName("jx.ap(I[BLsl;I)V")
    public static void method4617(int arg0, byte[] arg1, class491 arg2) {
        class387 var3 = new class387();
        var3.field4532 = 0;
        var3.field5170 = (long) arg0;
        var3.field4527 = arg1;
        var3.field4529 = arg2;
        class411 var4 = field4537;
        synchronized (field4537) {
            field4537.method7243(var3);
        }
        method5891();
    }

    @ObfuscatedName("dp.aw(ILsl;Lor;I)V")
    public static void method2570(int arg0, class491 arg1, class389 arg2) {
        byte[] var3 = null;
        class411 var4 = field4537;
        synchronized (field4537) {
            for (class387 var5 = (class387) field4537.method7247(); var5 != null; var5 = (class387) field4537.method7249()) {
                if ((long) arg0 == var5.field5170 && var5.field4529 == arg1 && var5.field4532 == 0) {
                    var3 = var5.field4527;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method8554(arg0);
            arg2.method6953(arg1, arg0, var7, true);
        } else {
            arg2.method6953(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ll.ak(I)V")
    public static void method5891() {
        Object var0 = field4536;
        synchronized (field4536) {
            if (field4535 == 0) {
                Statics.field4538 = new Thread(new class388());
                Statics.field4538.setDaemon(true);
                Statics.field4538.start();
                Statics.field4538.setPriority(5);
            }
            field4535 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class411 var1 = field4537;
                class387 var2;
                synchronized (field4537) {
                    var2 = (class387) field4537.method7247();
                }
                if (var2 == null) {
                    class331.method1920(100L);
                    Object var10 = field4536;
                    synchronized (field4536) {
                        if (field4535 <= 1) {
                            field4535 = 0;
                            field4536.notifyAll();
                            return;
                        }
                        field4535--;
                    }
                } else {
                    if (var2.field4532 == 0) {
                        var2.field4529.method8545((int) var2.field5170, var2.field4527, var2.field4527.length);
                        class411 var4 = field4537;
                        synchronized (field4537) {
                            var2.method8667();
                        }
                    } else if (var2.field4532 == 1) {
                        var2.field4527 = var2.field4529.method8554((int) var2.field5170);
                        class411 var6 = field4537;
                        synchronized (field4537) {
                            field4534.method7243(var2);
                        }
                    }
                    Object var8 = field4536;
                    synchronized (field4536) {
                        if (field4535 <= 1) {
                            field4535 = 0;
                            field4536.notifyAll();
                            return;
                        }
                        field4535 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class584.method8201((String) null, var18);
        }
    }

    @ObfuscatedName("fn.aj(I)V")
    public static void method3344() {
        Object var0 = field4536;
        synchronized (field4536) {
            if (field4535 != 0) {
                field4535 = 1;
                try {
                    field4536.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class411 var3 = field4537;
        synchronized (field4537) {
            field4537.method7248();
            field4534.method7248();
        }
    }
}
