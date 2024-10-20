package deob;

@ObfuscatedName("ex")
public class class150 implements Runnable {

    @ObfuscatedName("ex.p")
    public static class178 field2494 = new class178();

    @ObfuscatedName("ex.g")
    public static class178 field2491 = new class178();

    @ObfuscatedName("ex.x")
    public static int field2492 = 0;

    @ObfuscatedName("ex.c")
    public static Object field2493 = new Object();

    @ObfuscatedName("dx.n(I[BLds;I)V")
    public static void method2470(int arg0, byte[] arg1, class121 arg2) {
        class149 var3 = new class149();
        var3.field2487 = 0;
        var3.field2881 = (long) arg0;
        var3.field2485 = arg1;
        var3.field2486 = arg2;
        class178 var4 = field2494;
        synchronized (field2494) {
            field2494.method3291(var3);
        }
        Object var6 = field2493;
        synchronized (field2493) {
            if (field2492 == 0) {
                Statics.field2680.method2546(new class150(), 5);
            }
            field2492 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class178 var1 = field2494;
                class149 var2;
                synchronized (field2494) {
                    var2 = (class149) field2494.method3303();
                }
                if (var2 == null) {
                    class114.method1917(100L);
                    Object var10 = field2493;
                    synchronized (field2493) {
                        if (field2492 <= 1) {
                            field2492 = 0;
                            field2493.notifyAll();
                            return;
                        }
                        field2492--;
                    }
                } else {
                    if (var2.field2487 == 0) {
                        var2.field2486.method2513((int) var2.field2881, var2.field2485, var2.field2485.length);
                        class178 var4 = field2494;
                        synchronized (field2494) {
                            var2.method3378();
                        }
                    } else if (var2.field2487 == 1) {
                        var2.field2485 = var2.field2486.method2509((int) var2.field2881);
                        class178 var6 = field2494;
                        synchronized (field2494) {
                            field2491.method3291(var2);
                        }
                    }
                    Object var8 = field2493;
                    synchronized (field2493) {
                        if (field2492 <= 1) {
                            field2492 = 0;
                            field2493.notifyAll();
                            return;
                        }
                        field2492 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method2121((String) null, var18);
        }
    }

    @ObfuscatedName("ai.s(S)V")
    public static void method841() {
        Object var0 = field2493;
        synchronized (field2493) {
            if (field2492 != 0) {
                field2492 = 1;
                try {
                    field2493.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
