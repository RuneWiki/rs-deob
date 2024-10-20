package deob;

@ObfuscatedName("ga")
public class class184 implements Runnable {

    @ObfuscatedName("ga.x")
    public static class129 field2720 = new class129();

    @ObfuscatedName("ga.j")
    public static class129 field2718 = new class129();

    @ObfuscatedName("ga.c")
    public static int field2719 = 0;

    @ObfuscatedName("ga.d")
    public static Object field2726 = new Object();

    @ObfuscatedName("a.c(I[BLdd;I)V")
    public static void method276(int arg0, byte[] arg1, class117 arg2) {
        class181 var3 = new class181();
        var3.field2691 = 0;
        var3.field1885 = (long) arg0;
        var3.field2682 = arg1;
        var3.field2684 = arg2;
        class129 var4 = field2720;
        synchronized (field2720) {
            field2720.method2300(var3);
        }
        method1889();
    }

    @ObfuscatedName("el.d(ILdd;Lgn;I)V")
    public static void method2601(int arg0, class117 arg1, class185 arg2) {
        byte[] var3 = null;
        class129 var4 = field2720;
        synchronized (field2720) {
            for (class181 var5 = (class181) field2720.method2290(); var5 != null; var5 = (class181) field2720.method2287()) {
                if ((long) arg0 == var5.field1885 && var5.field2684 == arg1 && var5.field2691 == 0) {
                    var3 = var5.field2682;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2128(arg0);
            arg2.method3197(arg1, arg0, var7, true);
        } else {
            arg2.method3197(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ap.w(I)V")
    public static void method854() {
        while (true) {
            class129 var0 = field2720;
            class181 var1;
            synchronized (field2720) {
                var1 = (class181) field2718.method2288();
            }
            if (var1 == null) {
                return;
            }
            var1.field2686.method3197(var1.field2684, (int) var1.field1885, var1.field2682, false);
        }
    }

    @ObfuscatedName("co.u(I)V")
    public static void method1889() {
        Object var0 = field2726;
        synchronized (field2726) {
            if (field2719 == 0) {
                Statics.field1194.method1906(new class184(), 5);
            }
            field2719 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2720;
                class181 var2;
                synchronized (field2720) {
                    var2 = (class181) field2720.method2290();
                }
                if (var2 == null) {
                    class162.method2485(100L);
                    Object var10 = field2726;
                    synchronized (field2726) {
                        if (field2719 <= 1) {
                            field2719 = 0;
                            field2726.notifyAll();
                            return;
                        }
                        field2719--;
                    }
                } else {
                    if (var2.field2691 == 0) {
                        var2.field2684.method2129((int) var2.field1885, var2.field2682, var2.field2682.length);
                        class129 var4 = field2720;
                        synchronized (field2720) {
                            var2.method2278();
                        }
                    } else if (var2.field2691 == 1) {
                        var2.field2682 = var2.field2684.method2128((int) var2.field1885);
                        class129 var6 = field2720;
                        synchronized (field2720) {
                            field2718.method2300(var2);
                        }
                    }
                    Object var8 = field2726;
                    synchronized (field2726) {
                        if (field2719 <= 1) {
                            field2719 = 0;
                            field2726.notifyAll();
                            return;
                        }
                        field2719 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method702((String) null, var18);
        }
    }

    @ObfuscatedName("i.y(I)V")
    public static void method208() {
        Object var0 = field2726;
        synchronized (field2726) {
            if (field2719 != 0) {
                field2719 = 1;
                try {
                    field2726.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
