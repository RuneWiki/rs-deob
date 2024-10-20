package deob;

@ObfuscatedName("ot")
public class class372 implements Runnable {

    @ObfuscatedName("ot.am")
    public static final class394 field4331 = new class394();

    @ObfuscatedName("ot.ap")
    public static class394 field4329 = new class394();

    @ObfuscatedName("ot.af")
    public static int field4330 = 0;

    @ObfuscatedName("ot.aj")
    public static boolean field4333 = false;

    @ObfuscatedName("ot.aq")
    public static Object field4332 = new Object();

    @ObfuscatedName("ql.am(B)V")
    public static void method7359() {
        while (true) {
            class394 var0 = field4331;
            class371 var1;
            synchronized (field4331) {
                var1 = (class371) field4329.method6668();
            }
            if (var1 == null) {
                return;
            }
            var1.field4323.method6357(var1.field4325, (int) var1.field4889, var1.field4322, false);
        }
    }

    @ObfuscatedName("gs.ap(I)V")
    public static void method3233() {
        Object var0 = field4332;
        synchronized (field4332) {
            if (field4330 == 0) {
                Statics.field4334 = new Thread(new class372());
                Statics.field4334.setDaemon(true);
                Statics.field4334.start();
                Statics.field4334.setPriority(5);
            }
            field4330 = 600;
            field4333 = false;
        }
    }

    public void run() {
        try {
            while (true) {
                class394 var1 = field4331;
                class371 var2;
                synchronized (field4331) {
                    var2 = (class371) field4331.method6670();
                }
                if (var2 == null) {
                    class317.method2871(100L);
                    Object var10 = field4332;
                    synchronized (field4332) {
                        if ((field4333 || field4330 <= 1) && field4331.method6683()) {
                            field4330 = 0;
                            field4332.notifyAll();
                            return;
                        }
                        field4330--;
                    }
                } else {
                    if (var2.field4324 == 0) {
                        var2.field4325.method7721((int) var2.field4889, var2.field4322, var2.field4322.length);
                        class394 var4 = field4331;
                        synchronized (field4331) {
                            var2.method7988();
                        }
                    } else if (var2.field4324 == 1) {
                        var2.field4322 = var2.field4325.method7720((int) var2.field4889);
                        class394 var6 = field4331;
                        synchronized (field4331) {
                            field4329.method6666(var2);
                        }
                    }
                    Object var8 = field4332;
                    synchronized (field4332) {
                        if ((field4333 || field4330 <= 1) && field4331.method6683()) {
                            field4330 = 0;
                            field4332.notifyAll();
                            return;
                        }
                        field4330 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class557.method6332((String) null, var18);
        }
    }

    @ObfuscatedName("kr.af(I)V")
    public static void method4878() {
        Object var0 = field4332;
        synchronized (field4332) {
            if (field4330 != 0) {
                field4330 = 1;
                field4333 = true;
                try {
                    field4332.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
