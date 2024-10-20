package deob;

@ObfuscatedName("fx")
public class class158 implements Runnable {

    @ObfuscatedName("fx.g")
    public static class177 field2594 = new class177();

    @ObfuscatedName("fx.h")
    public static class177 field2596 = new class177();

    @ObfuscatedName("fx.s")
    public static int field2595 = 0;

    @ObfuscatedName("fx.o")
    public static Object field2597 = new Object();

    @ObfuscatedName("ep.h(I[BLbc;I)V")
    public static void method2780(int arg0, byte[] arg1, class71 arg2) {
        class157 var3 = new class157();
        var3.field2590 = 0;
        var3.field2823 = (long) arg0;
        var3.field2589 = arg1;
        var3.field2588 = arg2;
        class177 var4 = field2594;
        synchronized (field2594) {
            field2594.method3381(var3);
        }
        Object var6 = field2597;
        synchronized (field2597) {
            if (field2595 == 0) {
                Statics.field1295.method1521(new class158(), 5);
            }
            field2595 = 600;
        }
    }

    @ObfuscatedName("di.s(ILbc;Ley;B)V")
    public static void method2265(int arg0, class71 arg1, class155 arg2) {
        byte[] var3 = null;
        class177 var4 = field2594;
        synchronized (field2594) {
            for (class157 var5 = (class157) field2594.method3373(); var5 != null; var5 = (class157) field2594.method3375()) {
                if ((long) arg0 == var5.field2823 && var5.field2588 == arg1 && var5.field2590 == 0) {
                    var3 = var5.field2589;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1417(arg0);
            arg2.method3173(arg1, arg0, var7, true);
        } else {
            arg2.method3173(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2594;
                class157 var2;
                synchronized (field2594) {
                    var2 = (class157) field2594.method3373();
                }
                if (var2 == null) {
                    class126.method2355(100L);
                    Object var10 = field2597;
                    synchronized (field2597) {
                        if (field2595 <= 1) {
                            field2595 = 0;
                            field2597.notifyAll();
                            return;
                        }
                        field2595--;
                    }
                } else {
                    if (var2.field2590 == 0) {
                        var2.field2588.method1416((int) var2.field2823, var2.field2589, var2.field2589.length);
                        class177 var4 = field2594;
                        synchronized (field2594) {
                            var2.method3404();
                        }
                    } else if (var2.field2590 == 1) {
                        var2.field2589 = var2.field2588.method1417((int) var2.field2823);
                        class177 var6 = field2594;
                        synchronized (field2594) {
                            field2596.method3381(var2);
                        }
                    }
                    Object var8 = field2597;
                    synchronized (field2597) {
                        if (field2595 <= 1) {
                            field2595 = 0;
                            field2597.notifyAll();
                            return;
                        }
                        field2595 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method1330((String) null, var18);
        }
    }
}
