package deob;

@ObfuscatedName("ed")
public class class149 implements Runnable {

    @ObfuscatedName("ed.b")
    public static class177 field2495 = new class177();

    @ObfuscatedName("ed.u")
    public static class177 field2487 = new class177();

    @ObfuscatedName("ed.x")
    public static int field2489 = 0;

    @ObfuscatedName("ed.j")
    public static Object field2490 = new Object();

    @ObfuscatedName("ef.u(I[BLde;I)V")
    public static void method2792(int arg0, byte[] arg1, class121 arg2) {
        class148 var3 = new class148();
        var3.field2485 = 0;
        var3.field2861 = (long) arg0;
        var3.field2478 = arg1;
        var3.field2479 = arg2;
        class177 var4 = field2495;
        synchronized (field2495) {
            field2495.method3180(var3);
        }
        method808();
    }

    @ObfuscatedName("l.x(ILde;Lef;S)V")
    public static void method124(int arg0, class121 arg1, class147 arg2) {
        class148 var3 = new class148();
        var3.field2485 = 1;
        var3.field2861 = (long) arg0;
        var3.field2479 = arg1;
        var3.field2480 = arg2;
        class177 var4 = field2495;
        synchronized (field2495) {
            field2495.method3180(var3);
        }
        method808();
    }

    @ObfuscatedName("ak.j(I)V")
    public static void method808() {
        Object var0 = field2490;
        synchronized (field2490) {
            if (field2489 == 0) {
                Statics.field1761.method2487(new class149(), 5);
            }
            field2489 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2495;
                class148 var2;
                synchronized (field2495) {
                    var2 = (class148) field2495.method3185();
                }
                if (var2 == null) {
                    class114.method2914(100L);
                    Object var10 = field2490;
                    synchronized (field2490) {
                        if (field2489 <= 1) {
                            field2489 = 0;
                            field2490.notifyAll();
                            return;
                        }
                        field2489--;
                    }
                } else {
                    if (var2.field2485 == 0) {
                        var2.field2479.method2472((int) var2.field2861, var2.field2478, var2.field2478.length);
                        class177 var4 = field2495;
                        synchronized (field2495) {
                            var2.method3260();
                        }
                    } else if (var2.field2485 == 1) {
                        var2.field2478 = var2.field2479.method2475((int) var2.field2861);
                        class177 var6 = field2495;
                        synchronized (field2495) {
                            field2487.method3180(var2);
                        }
                    }
                    Object var8 = field2490;
                    synchronized (field2490) {
                        if (field2489 <= 1) {
                            field2489 = 0;
                            field2490.notifyAll();
                            return;
                        }
                        field2489 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method3292((String) null, var18);
        }
    }
}
