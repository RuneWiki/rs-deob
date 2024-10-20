package deob;

@ObfuscatedName("jt")
public class class263 implements Runnable {

    @ObfuscatedName("jt.q")
    public static class218 field3397 = new class218();

    @ObfuscatedName("jt.i")
    public static class218 field3398 = new class218();

    @ObfuscatedName("jt.a")
    public static int field3399 = 0;

    @ObfuscatedName("jt.l")
    public static Object field3400 = new Object();

    @ObfuscatedName("ei.t(ILfn;Lju;I)V")
    public static void method2643(int arg0, class175 arg1, class264 arg2) {
        byte[] var3 = null;
        class218 var4 = field3397;
        synchronized (field3397) {
            for (class260 var5 = (class260) field3397.method3731(); var5 != null; var5 = (class260) field3397.method3733()) {
                if ((long) arg0 == var5.field2636 && var5.field3369 == arg1 && var5.field3371 == 0) {
                    var3 = var5.field3368;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method3068(arg0);
            arg2.method4311(arg1, arg0, var7, true);
        } else {
            arg2.method4311(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class218 var1 = field3397;
                class260 var2;
                synchronized (field3397) {
                    var2 = (class260) field3397.method3731();
                }
                if (var2 == null) {
                    class204.method1827(100L);
                    Object var10 = field3400;
                    synchronized (field3400) {
                        if (field3399 <= 1) {
                            field3399 = 0;
                            field3400.notifyAll();
                            return;
                        }
                        field3399--;
                    }
                } else {
                    if (var2.field3371 == 0) {
                        var2.field3369.method3065((int) var2.field2636, var2.field3368, var2.field3368.length);
                        class218 var4 = field3397;
                        synchronized (field3397) {
                            var2.method3721();
                        }
                    } else if (var2.field3371 == 1) {
                        var2.field3368 = var2.field3369.method3068((int) var2.field2636);
                        class218 var6 = field3397;
                        synchronized (field3397) {
                            field3398.method3759(var2);
                        }
                    }
                    Object var8 = field3400;
                    synchronized (field3400) {
                        if (field3399 <= 1) {
                            field3399 = 0;
                            field3400.notifyAll();
                            return;
                        }
                        field3399 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class165.method2453((String) null, var18);
        }
    }

    @ObfuscatedName("ar.q(B)V")
    public static void method502() {
        Object var0 = field3400;
        synchronized (field3400) {
            if (field3399 != 0) {
                field3399 = 1;
                try {
                    field3400.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
