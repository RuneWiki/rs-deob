package deob;

@ObfuscatedName("or")
public class class375 implements Runnable {

    @ObfuscatedName("or.aq")
    public static final class397 field4365 = new class397();

    @ObfuscatedName("or.aw")
    public static class397 field4361 = new class397();

    @ObfuscatedName("or.al")
    public static int field4363 = 0;

    @ObfuscatedName("or.ai")
    public static boolean field4364 = false;

    @ObfuscatedName("or.ar")
    public static Object field4366 = new Object();

    @ObfuscatedName("mt.aq(I[BLrl;B)V")
    public static void method5507(int arg0, byte[] arg1, class462 arg2) {
        class374 var3 = new class374();
        var3.field4359 = 0;
        var3.field4920 = (long) arg0;
        var3.field4357 = arg1;
        var3.field4358 = arg2;
        class397 var4 = field4365;
        synchronized (field4365) {
            field4365.method6678(var3);
        }
        Object var6 = field4366;
        synchronized (field4366) {
            if (field4363 == 0) {
                Statics.field4362 = new Thread(new class375());
                Statics.field4362.setDaemon(true);
                Statics.field4362.start();
                Statics.field4362.setPriority(5);
            }
            field4363 = 600;
            field4364 = false;
        }
    }

    @ObfuscatedName("ce.aw(ILrl;Lom;I)V")
    public static void method1134(int arg0, class462 arg1, class376 arg2) {
        byte[] var3 = null;
        class397 var4 = field4365;
        synchronized (field4365) {
            for (class374 var5 = (class374) field4365.method6702(); var5 != null; var5 = (class374) field4365.method6684()) {
                if ((long) arg0 == var5.field4920 && var5.field4358 == arg1 && var5.field4359 == 0) {
                    var3 = var5.field4357;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method7723(arg0);
            arg2.method6371(arg1, arg0, var7, true);
        } else {
            arg2.method6371(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("dr.al(S)V")
    public static void method2613() {
        while (true) {
            class397 var0 = field4365;
            class374 var1;
            synchronized (field4365) {
                var1 = (class374) field4361.method6681();
            }
            if (var1 == null) {
                return;
            }
            var1.field4360.method6371(var1.field4358, (int) var1.field4920, var1.field4357, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class397 var1 = field4365;
                class374 var2;
                synchronized (field4365) {
                    var2 = (class374) field4365.method6702();
                }
                if (var2 == null) {
                    class319.method3040(100L);
                    Object var10 = field4366;
                    synchronized (field4366) {
                        if ((field4364 || field4363 <= 1) && field4365.method6715()) {
                            field4363 = 0;
                            field4366.notifyAll();
                            return;
                        }
                        field4363--;
                    }
                } else {
                    if (var2.field4359 == 0) {
                        var2.field4358.method7724((int) var2.field4920, var2.field4357, var2.field4357.length);
                        class397 var4 = field4365;
                        synchronized (field4365) {
                            var2.method7996();
                        }
                    } else if (var2.field4359 == 1) {
                        var2.field4357 = var2.field4358.method7723((int) var2.field4920);
                        class397 var6 = field4365;
                        synchronized (field4365) {
                            field4361.method6678(var2);
                        }
                    }
                    Object var8 = field4366;
                    synchronized (field4366) {
                        if ((field4364 || field4363 <= 1) && field4365.method6715()) {
                            field4363 = 0;
                            field4366.notifyAll();
                            return;
                        }
                        field4363 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method5453((String) null, var18);
        }
    }

    @ObfuscatedName("hx.ai(I)V")
    public static void method3448() {
        Object var0 = field4366;
        synchronized (field4366) {
            if (field4363 != 0) {
                field4363 = 1;
                field4364 = true;
                try {
                    field4366.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
