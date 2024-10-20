package deob;

@ObfuscatedName("ny")
public class class356 implements Runnable {

    @ObfuscatedName("ny.au")
    public static final class378 field4259 = new class378();

    @ObfuscatedName("ny.ae")
    public static class378 field4257 = new class378();

    @ObfuscatedName("ny.ao")
    public static int field4258 = 0;

    @ObfuscatedName("ny.at")
    public static boolean field4262 = false;

    @ObfuscatedName("ny.ac")
    public static Object field4260 = new Object();

    @ObfuscatedName("jg.au(ILru;Lnk;B)V")
    public static void method4592(int arg0, class443 arg1, class357 arg2) {
        class355 var3 = new class355();
        var3.field4252 = 1;
        var3.field4814 = (long) arg0;
        var3.field4253 = arg1;
        var3.field4254 = arg2;
        class378 var4 = field4259;
        synchronized (field4259) {
            field4259.method6405(var3);
        }
        method2741();
    }

    @ObfuscatedName("eb.ae(I)V")
    public static void method2741() {
        Object var0 = field4260;
        synchronized (field4260) {
            if (field4258 == 0) {
                Statics.field1831 = new Thread(new class356());
                Statics.field1831.setDaemon(true);
                Statics.field1831.start();
                Statics.field1831.setPriority(5);
            }
            field4258 = 600;
            field4262 = false;
        }
    }

    public void run() {
        try {
            while (true) {
                class378 var1 = field4259;
                class355 var2;
                synchronized (field4259) {
                    var2 = (class355) field4259.method6393();
                }
                if (var2 == null) {
                    class303.method2265(100L);
                    Object var10 = field4260;
                    synchronized (field4260) {
                        if ((field4262 || field4258 <= 1) && field4259.method6397()) {
                            field4258 = 0;
                            field4260.notifyAll();
                            return;
                        }
                        field4258--;
                    }
                } else {
                    if (var2.field4252 == 0) {
                        var2.field4253.method7429((int) var2.field4814, var2.field4251, var2.field4251.length);
                        class378 var4 = field4259;
                        synchronized (field4259) {
                            var2.method7700();
                        }
                    } else if (var2.field4252 == 1) {
                        var2.field4251 = var2.field4253.method7428((int) var2.field4814);
                        class378 var6 = field4259;
                        synchronized (field4259) {
                            field4257.method6405(var2);
                        }
                    }
                    Object var8 = field4260;
                    synchronized (field4260) {
                        if ((field4262 || field4258 <= 1) && field4259.method6397()) {
                            field4258 = 0;
                            field4260.notifyAll();
                            return;
                        }
                        field4258 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method2661((String) null, var18);
        }
    }

    @ObfuscatedName("io.ao(I)V")
    public static void method3865() {
        Object var0 = field4260;
        synchronized (field4260) {
            if (field4258 != 0) {
                field4258 = 1;
                field4262 = true;
                try {
                    field4260.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
