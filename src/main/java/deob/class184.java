package deob;

@ObfuscatedName("gx")
public class class184 implements Runnable {

    @ObfuscatedName("gx.p")
    public static class129 field2728 = new class129();

    @ObfuscatedName("gx.g")
    public static class129 field2721 = new class129();

    @ObfuscatedName("gx.x")
    public static int field2726 = 0;

    @ObfuscatedName("gx.q")
    public static Object field2729 = new Object();

    @ObfuscatedName("fw.q(I[BLdu;I)V")
    public static void method2988(int arg0, byte[] arg1, class117 arg2) {
        class181 var3 = new class181();
        var3.field2692 = 0;
        var3.field1885 = (long) arg0;
        var3.field2694 = arg1;
        var3.field2691 = arg2;
        class129 var4 = field2728;
        synchronized (field2728) {
            field2728.method2232(var3);
        }
        Object var6 = field2729;
        synchronized (field2729) {
            if (field2726 == 0) {
                Statics.field900.method1838(new class184(), 5);
            }
            field2726 = 600;
        }
    }

    @ObfuscatedName("by.d(ILdu;Lgm;I)V")
    public static void method1358(int arg0, class117 arg1, class185 arg2) {
        byte[] var3 = null;
        class129 var4 = field2728;
        synchronized (field2728) {
            for (class181 var5 = (class181) field2728.method2237(); var5 != null; var5 = (class181) field2728.method2251()) {
                if ((long) arg0 == var5.field1885 && var5.field2691 == arg1 && var5.field2692 == 0) {
                    var3 = var5.field2694;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2068(arg0);
            arg2.method3123(arg1, arg0, var7, true);
        } else {
            arg2.method3123(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("g.k(B)V")
    public static void method21() {
        while (true) {
            class129 var0 = field2728;
            class181 var1;
            synchronized (field2728) {
                var1 = (class181) field2721.method2247();
            }
            if (var1 == null) {
                return;
            }
            var1.field2690.method3123(var1.field2691, (int) var1.field1885, var1.field2694, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2728;
                class181 var2;
                synchronized (field2728) {
                    var2 = (class181) field2728.method2237();
                }
                if (var2 == null) {
                    class162.method1858(100L);
                    Object var10 = field2729;
                    synchronized (field2729) {
                        if (field2726 <= 1) {
                            field2726 = 0;
                            field2729.notifyAll();
                            return;
                        }
                        field2726--;
                    }
                } else {
                    if (var2.field2692 == 0) {
                        var2.field2691.method2074((int) var2.field1885, var2.field2694, var2.field2694.length);
                        class129 var4 = field2728;
                        synchronized (field2728) {
                            var2.method2225();
                        }
                    } else if (var2.field2692 == 1) {
                        var2.field2694 = var2.field2691.method2068((int) var2.field1885);
                        class129 var6 = field2728;
                        synchronized (field2728) {
                            field2721.method2232(var2);
                        }
                    }
                    Object var8 = field2729;
                    synchronized (field2729) {
                        if (field2726 <= 1) {
                            field2726 = 0;
                            field2729.notifyAll();
                            return;
                        }
                        field2726 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method1103((String) null, var18);
        }
    }

    @ObfuscatedName("d.j(I)V")
    public static void method63() {
        Object var0 = field2729;
        synchronized (field2729) {
            if (field2726 != 0) {
                field2726 = 1;
                try {
                    field2729.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
