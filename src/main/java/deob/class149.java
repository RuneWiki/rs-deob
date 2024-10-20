package deob;

@ObfuscatedName("ez")
public class class149 implements Runnable {

    @ObfuscatedName("ez.z")
    public static class177 field2477 = new class177();

    @ObfuscatedName("ez.j")
    public static class177 field2476 = new class177();

    @ObfuscatedName("ez.a")
    public static int field2480 = 0;

    @ObfuscatedName("ez.y")
    public static Object field2478 = new Object();

    @ObfuscatedName("cf.a(I[BLdm;I)V")
    public static void method1959(int arg0, byte[] arg1, class121 arg2) {
        class148 var3 = new class148();
        var3.field2471 = 0;
        var3.field2857 = (long) arg0;
        var3.field2466 = arg1;
        var3.field2469 = arg2;
        class177 var4 = field2477;
        synchronized (field2477) {
            field2477.method3227(var3);
        }
        Object var6 = field2478;
        synchronized (field2478) {
            if (field2480 == 0) {
                Statics.field1881.method2484(new class149(), 5);
            }
            field2480 = 600;
        }
    }

    @ObfuscatedName("dt.y(ILdm;Leq;I)V")
    public static void method2523(int arg0, class121 arg1, class147 arg2) {
        byte[] var3 = null;
        class177 var4 = field2477;
        synchronized (field2477) {
            for (class148 var5 = (class148) field2477.method3232(); var5 != null; var5 = (class148) field2477.method3251()) {
                if ((long) arg0 == var5.field2857 && var5.field2469 == arg1 && var5.field2471 == 0) {
                    var3 = var5.field2466;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2468(arg0);
            arg2.method2794(arg1, arg0, var7, true);
        } else {
            arg2.method2794(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2477;
                class148 var2;
                synchronized (field2477) {
                    var2 = (class148) field2477.method3232();
                }
                if (var2 == null) {
                    class114.method1960(100L);
                    Object var10 = field2478;
                    synchronized (field2478) {
                        if (field2480 <= 1) {
                            field2480 = 0;
                            field2478.notifyAll();
                            return;
                        }
                        field2480--;
                    }
                } else {
                    if (var2.field2471 == 0) {
                        var2.field2469.method2467((int) var2.field2857, var2.field2466, var2.field2466.length);
                        class177 var4 = field2477;
                        synchronized (field2477) {
                            var2.method3311();
                        }
                    } else if (var2.field2471 == 1) {
                        var2.field2466 = var2.field2469.method2468((int) var2.field2857);
                        class177 var6 = field2477;
                        synchronized (field2477) {
                            field2476.method3227(var2);
                        }
                    }
                    Object var8 = field2478;
                    synchronized (field2478) {
                        if (field2480 <= 1) {
                            field2480 = 0;
                            field2478.notifyAll();
                            return;
                        }
                        field2480 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method2452((String) null, var18);
        }
    }
}
