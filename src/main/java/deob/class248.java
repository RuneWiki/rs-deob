package deob;

@ObfuscatedName("id")
public class class248 implements Runnable {

    @ObfuscatedName("id.a")
    public static class205 field3328 = new class205();

    @ObfuscatedName("id.w")
    public static class205 field3331 = new class205();

    @ObfuscatedName("id.e")
    public static int field3329 = 0;

    @ObfuscatedName("id.k")
    public static Object field3330 = new Object();

    @ObfuscatedName("ge.a(ILfv;Liu;B)V")
    public static void method3214(int arg0, class165 arg1, class249 arg2) {
        class245 var3 = new class245();
        var3.field3302 = 1;
        var3.field2589 = (long) arg0;
        var3.field3301 = arg1;
        var3.field3299 = arg2;
        class205 var4 = field3328;
        synchronized (field3328) {
            field3328.method3446(var3);
        }
        Object var6 = field3330;
        synchronized (field3330) {
            if (field3329 == 0) {
                Statics.field3327 = new Thread(new class248());
                Statics.field3327.setDaemon(true);
                Statics.field3327.start();
                Statics.field3327.setPriority(5);
            }
            field3329 = 600;
        }
    }

    @ObfuscatedName("ac.w(ILfv;Liu;I)V")
    public static void method461(int arg0, class165 arg1, class249 arg2) {
        byte[] var3 = null;
        class205 var4 = field3328;
        synchronized (field3328) {
            for (class245 var5 = (class245) field3328.method3442(); var5 != null; var5 = (class245) field3328.method3444()) {
                if ((long) arg0 == var5.field2589 && var5.field3301 == arg1 && var5.field3302 == 0) {
                    var3 = var5.field3300;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2814(arg0);
            arg2.method4003(arg1, arg0, var7, true);
        } else {
            arg2.method4003(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class205 var1 = field3328;
                class245 var2;
                synchronized (field3328) {
                    var2 = (class245) field3328.method3442();
                }
                if (var2 == null) {
                    class193.method1373(100L);
                    Object var10 = field3330;
                    synchronized (field3330) {
                        if (field3329 <= 1) {
                            field3329 = 0;
                            field3330.notifyAll();
                            return;
                        }
                        field3329--;
                    }
                } else {
                    if (var2.field3302 == 0) {
                        var2.field3301.method2815((int) var2.field2589, var2.field3300, var2.field3300.length);
                        class205 var4 = field3328;
                        synchronized (field3328) {
                            var2.method3427();
                        }
                    } else if (var2.field3302 == 1) {
                        var2.field3300 = var2.field3301.method2814((int) var2.field2589);
                        class205 var6 = field3328;
                        synchronized (field3328) {
                            field3331.method3446(var2);
                        }
                    }
                    Object var8 = field3330;
                    synchronized (field3330) {
                        if (field3329 <= 1) {
                            field3329 = 0;
                            field3330.notifyAll();
                            return;
                        }
                        field3329 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class155.method1339((String) null, var18);
        }
    }
}
