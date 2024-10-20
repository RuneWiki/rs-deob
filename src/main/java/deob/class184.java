package deob;

@ObfuscatedName("gz")
public class class184 implements Runnable {

    @ObfuscatedName("gz.x")
    public static class129 field2732 = new class129();

    @ObfuscatedName("gz.n")
    public static class129 field2729 = new class129();

    @ObfuscatedName("gz.g")
    public static int field2730 = 0;

    @ObfuscatedName("gz.v")
    public static Object field2728 = new Object();

    @ObfuscatedName("h.v(I[BLdb;I)V")
    public static void method226(int arg0, byte[] arg1, class117 arg2) {
        class181 var3 = new class181();
        var3.field2696 = 0;
        var3.field1884 = (long) arg0;
        var3.field2691 = arg1;
        var3.field2692 = arg2;
        class129 var4 = field2732;
        synchronized (field2732) {
            field2732.method2360(var3);
        }
        Object var6 = field2728;
        synchronized (field2728) {
            if (field2730 == 0) {
                Statics.field1794.method1954(new class184(), 5);
            }
            field2730 = 600;
        }
    }

    @ObfuscatedName("a.y(ILdb;Lgj;I)V")
    public static void method104(int arg0, class117 arg1, class185 arg2) {
        byte[] var3 = null;
        class129 var4 = field2732;
        synchronized (field2732) {
            for (class181 var5 = (class181) field2732.method2352(); var5 != null; var5 = (class181) field2732.method2341()) {
                if ((long) arg0 == var5.field1884 && var5.field2692 == arg1 && var5.field2696 == 0) {
                    var3 = var5.field2691;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2185(arg0);
            arg2.method3244(arg1, arg0, var7, true);
        } else {
            arg2.method3244(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2732;
                class181 var2;
                synchronized (field2732) {
                    var2 = (class181) field2732.method2352();
                }
                if (var2 == null) {
                    class162.method951(100L);
                    Object var10 = field2728;
                    synchronized (field2728) {
                        if (field2730 <= 1) {
                            field2730 = 0;
                            field2728.notifyAll();
                            return;
                        }
                        field2730--;
                    }
                } else {
                    if (var2.field2696 == 0) {
                        var2.field2692.method2186((int) var2.field1884, var2.field2691, var2.field2691.length);
                        class129 var4 = field2732;
                        synchronized (field2732) {
                            var2.method2327();
                        }
                    } else if (var2.field2696 == 1) {
                        var2.field2691 = var2.field2692.method2185((int) var2.field1884);
                        class129 var6 = field2732;
                        synchronized (field2732) {
                            field2729.method2360(var2);
                        }
                    }
                    Object var8 = field2728;
                    synchronized (field2728) {
                        if (field2730 <= 1) {
                            field2730 = 0;
                            field2728.notifyAll();
                            return;
                        }
                        field2730 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method1916((String) null, var18);
        }
    }

    @ObfuscatedName("a.p(I)V")
    public static void method109() {
        Object var0 = field2728;
        synchronized (field2728) {
            if (field2730 != 0) {
                field2730 = 1;
                try {
                    field2728.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
