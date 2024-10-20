package deob;

@ObfuscatedName("fo")
public class class158 implements Runnable {

    @ObfuscatedName("fo.j")
    public static class177 field2584 = new class177();

    @ObfuscatedName("fo.f")
    public static class177 field2583 = new class177();

    @ObfuscatedName("fo.o")
    public static int field2582 = 0;

    @ObfuscatedName("fo.h")
    public static Object field2585 = new Object();

    @ObfuscatedName("client.o(I[BLbk;I)V")
    public static void method562(int arg0, byte[] arg1, class71 arg2) {
        class157 var3 = new class157();
        var3.field2576 = 0;
        var3.field2813 = (long) arg0;
        var3.field2580 = arg1;
        var3.field2575 = arg2;
        class177 var4 = field2584;
        synchronized (field2584) {
            field2584.method3312(var3);
        }
        Object var6 = field2585;
        synchronized (field2585) {
            if (field2582 == 0) {
                Statics.field896.method1512(new class158(), 5);
            }
            field2582 = 600;
        }
    }

    @ObfuscatedName("ah.h(ILbk;Ley;B)V")
    public static void method568(int arg0, class71 arg1, class155 arg2) {
        class157 var3 = new class157();
        var3.field2576 = 1;
        var3.field2813 = (long) arg0;
        var3.field2575 = arg1;
        var3.field2574 = arg2;
        class177 var4 = field2584;
        synchronized (field2584) {
            field2584.method3312(var3);
        }
        Object var6 = field2585;
        synchronized (field2585) {
            if (field2582 == 0) {
                Statics.field896.method1512(new class158(), 5);
            }
            field2582 = 600;
        }
    }

    @ObfuscatedName("bu.u(I)V")
    public static void method1331() {
        while (true) {
            class177 var0 = field2584;
            class157 var1;
            synchronized (field2584) {
                var1 = (class157) field2583.method3315();
            }
            if (var1 == null) {
                return;
            }
            var1.field2574.method3120(var1.field2575, (int) var1.field2813, var1.field2580, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2584;
                class157 var2;
                synchronized (field2584) {
                    var2 = (class157) field2584.method3338();
                }
                if (var2 == null) {
                    class126.method768(100L);
                    Object var10 = field2585;
                    synchronized (field2585) {
                        if (field2582 <= 1) {
                            field2582 = 0;
                            field2585.notifyAll();
                            return;
                        }
                        field2582--;
                    }
                } else {
                    if (var2.field2576 == 0) {
                        var2.field2575.method1409((int) var2.field2813, var2.field2580, var2.field2580.length);
                        class177 var4 = field2584;
                        synchronized (field2584) {
                            var2.method3349();
                        }
                    } else if (var2.field2576 == 1) {
                        var2.field2580 = var2.field2575.method1413((int) var2.field2813);
                        class177 var6 = field2584;
                        synchronized (field2584) {
                            field2583.method3312(var2);
                        }
                    }
                    Object var8 = field2585;
                    synchronized (field2585) {
                        if (field2582 <= 1) {
                            field2582 = 0;
                            field2585.notifyAll();
                            return;
                        }
                        field2582 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method1544((String) null, var18);
        }
    }
}
