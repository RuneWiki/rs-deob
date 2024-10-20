package deob;

@ObfuscatedName("ga")
public class class184 implements Runnable {

    @ObfuscatedName("ga.q")
    public static class129 field2731 = new class129();

    @ObfuscatedName("ga.d")
    public static class129 field2729 = new class129();

    @ObfuscatedName("ga.h")
    public static int field2730 = 0;

    @ObfuscatedName("ga.p")
    public static Object field2733 = new Object();

    @ObfuscatedName("el.h(I)V")
    public static void method2865() {
        while (true) {
            class129 var0 = field2731;
            class181 var1;
            synchronized (field2731) {
                var1 = (class181) field2729.method2320();
            }
            if (var1 == null) {
                return;
            }
            var1.field2696.method3208(var1.field2698, (int) var1.field1882, var1.field2697, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2731;
                class181 var2;
                synchronized (field2731) {
                    var2 = (class181) field2731.method2319();
                }
                if (var2 == null) {
                    class162.method2156(100L);
                    Object var10 = field2733;
                    synchronized (field2733) {
                        if (field2730 <= 1) {
                            field2730 = 0;
                            field2733.notifyAll();
                            return;
                        }
                        field2730--;
                    }
                } else {
                    if (var2.field2702 == 0) {
                        var2.field2698.method2159((int) var2.field1882, var2.field2697, var2.field2697.length);
                        class129 var4 = field2731;
                        synchronized (field2731) {
                            var2.method2310();
                        }
                    } else if (var2.field2702 == 1) {
                        var2.field2697 = var2.field2698.method2157((int) var2.field1882);
                        class129 var6 = field2731;
                        synchronized (field2731) {
                            field2729.method2314(var2);
                        }
                    }
                    Object var8 = field2733;
                    synchronized (field2733) {
                        if (field2730 <= 1) {
                            field2730 = 0;
                            field2733.notifyAll();
                            return;
                        }
                        field2730 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method811((String) null, var18);
        }
    }

    @ObfuscatedName("client.p(B)V")
    public static void method568() {
        Object var0 = field2733;
        synchronized (field2733) {
            if (field2730 != 0) {
                field2730 = 1;
                try {
                    field2733.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
