package deob;

@ObfuscatedName("en")
public class class148 implements Runnable {

    @ObfuscatedName("en.y")
    public static class176 field2464 = new class176();

    @ObfuscatedName("en.u")
    public static class176 field2461 = new class176();

    @ObfuscatedName("en.k")
    public static int field2463 = 0;

    @ObfuscatedName("en.v")
    public static Object field2466 = new Object();

    @ObfuscatedName("bo.k(I[BLdh;I)V")
    public static void method1319(int arg0, byte[] arg1, class121 arg2) {
        class147 var3 = new class147();
        var3.field2457 = 0;
        var3.field2830 = (long) arg0;
        var3.field2458 = arg1;
        var3.field2456 = arg2;
        class176 var4 = field2464;
        synchronized (field2464) {
            field2464.method3202(var3);
        }
        Object var6 = field2466;
        synchronized (field2466) {
            if (field2463 == 0) {
                Statics.field708.method2465(new class148(), 5);
            }
            field2463 = 600;
        }
    }

    @ObfuscatedName("ag.v(ILdh;Ler;B)V")
    public static void method607(int arg0, class121 arg1, class146 arg2) {
        class147 var3 = new class147();
        var3.field2457 = 1;
        var3.field2830 = (long) arg0;
        var3.field2456 = arg1;
        var3.field2459 = arg2;
        class176 var4 = field2464;
        synchronized (field2464) {
            field2464.method3202(var3);
        }
        Object var6 = field2466;
        synchronized (field2466) {
            if (field2463 == 0) {
                Statics.field708.method2465(new class148(), 5);
            }
            field2463 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class176 var1 = field2464;
                class147 var2;
                synchronized (field2464) {
                    var2 = (class147) field2464.method3234();
                }
                if (var2 == null) {
                    class114.method140(100L);
                    Object var10 = field2466;
                    synchronized (field2466) {
                        if (field2463 <= 1) {
                            field2463 = 0;
                            field2466.notifyAll();
                            return;
                        }
                        field2463--;
                    }
                } else {
                    if (var2.field2457 == 0) {
                        var2.field2456.method2439((int) var2.field2830, var2.field2458, var2.field2458.length);
                        class176 var4 = field2464;
                        synchronized (field2464) {
                            var2.method3268();
                        }
                    } else if (var2.field2457 == 1) {
                        var2.field2458 = var2.field2456.method2437((int) var2.field2830);
                        class176 var6 = field2464;
                        synchronized (field2464) {
                            field2461.method3202(var2);
                        }
                    }
                    Object var8 = field2466;
                    synchronized (field2466) {
                        if (field2463 <= 1) {
                            field2463 = 0;
                            field2466.notifyAll();
                            return;
                        }
                        field2463 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method583((String) null, var18);
        }
    }

    @ObfuscatedName("at.l(I)V")
    public static void method825() {
        Object var0 = field2466;
        synchronized (field2466) {
            if (field2463 != 0) {
                field2463 = 1;
                try {
                    field2466.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
