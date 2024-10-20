package deob;

@ObfuscatedName("eg")
public class class149 implements Runnable {

    @ObfuscatedName("eg.e")
    public static class177 field2478 = new class177();

    @ObfuscatedName("eg.o")
    public static class177 field2477 = new class177();

    @ObfuscatedName("eg.y")
    public static int field2476 = 0;

    @ObfuscatedName("eg.b")
    public static Object field2479 = new Object();

    @ObfuscatedName("du.o(ILdd;Lei;I)V")
    public static void method2312(int arg0, class121 arg1, class147 arg2) {
        class148 var3 = new class148();
        var3.field2473 = 1;
        var3.field2874 = (long) arg0;
        var3.field2471 = arg1;
        var3.field2475 = arg2;
        class177 var4 = field2478;
        synchronized (field2478) {
            field2478.method3117(var3);
        }
        Object var6 = field2479;
        synchronized (field2479) {
            if (field2476 == 0) {
                Statics.field1450.method2414(new class149(), 5);
            }
            field2476 = 600;
        }
    }

    @ObfuscatedName("ei.y(S)V")
    public static void method2729() {
        Object var0 = field2479;
        synchronized (field2479) {
            if (field2476 == 0) {
                Statics.field1450.method2414(new class149(), 5);
            }
            field2476 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2478;
                class148 var2;
                synchronized (field2478) {
                    var2 = (class148) field2478.method3122();
                }
                if (var2 == null) {
                    class114.method134(100L);
                    Object var10 = field2479;
                    synchronized (field2479) {
                        if (field2476 <= 1) {
                            field2476 = 0;
                            field2479.notifyAll();
                            return;
                        }
                        field2476--;
                    }
                } else {
                    if (var2.field2473 == 0) {
                        var2.field2471.method2403((int) var2.field2874, var2.field2470, var2.field2470.length);
                        class177 var4 = field2478;
                        synchronized (field2478) {
                            var2.method3204();
                        }
                    } else if (var2.field2473 == 1) {
                        var2.field2470 = var2.field2471.method2399((int) var2.field2874);
                        class177 var6 = field2478;
                        synchronized (field2478) {
                            field2477.method3117(var2);
                        }
                    }
                    Object var8 = field2479;
                    synchronized (field2479) {
                        if (field2476 <= 1) {
                            field2476 = 0;
                            field2479.notifyAll();
                            return;
                        }
                        field2476 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method1996((String) null, var18);
        }
    }
}
