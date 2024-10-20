package deob;

@ObfuscatedName("ef")
public class class150 implements Runnable {

    @ObfuscatedName("ef.g")
    public static class178 field2484 = new class178();

    @ObfuscatedName("ef.s")
    public static class178 field2485 = new class178();

    @ObfuscatedName("ef.h")
    public static int field2490 = 0;

    @ObfuscatedName("ef.m")
    public static Object field2487 = new Object();

    @ObfuscatedName("ex.j(I[BLda;B)V")
    public static void method2634(int arg0, byte[] arg1, class121 arg2) {
        class149 var3 = new class149();
        var3.field2478 = 0;
        var3.field2873 = (long) arg0;
        var3.field2476 = arg1;
        var3.field2477 = arg2;
        class178 var4 = field2484;
        synchronized (field2484) {
            field2484.method3200(var3);
        }
        method1947();
    }

    @ObfuscatedName("cp.b(ILda;Leg;I)V")
    public static void method1761(int arg0, class121 arg1, class148 arg2) {
        class149 var3 = new class149();
        var3.field2478 = 1;
        var3.field2873 = (long) arg0;
        var3.field2477 = arg1;
        var3.field2475 = arg2;
        class178 var4 = field2484;
        synchronized (field2484) {
            field2484.method3200(var3);
        }
        method1947();
    }

    @ObfuscatedName("dm.v(ILda;Leg;I)V")
    public static void method2502(int arg0, class121 arg1, class148 arg2) {
        byte[] var3 = null;
        class178 var4 = field2484;
        synchronized (field2484) {
            for (class149 var5 = (class149) field2484.method3196(); var5 != null; var5 = (class149) field2484.method3206()) {
                if ((long) arg0 == var5.field2873 && var5.field2477 == arg1 && var5.field2478 == 0) {
                    var3 = var5.field2476;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2432(arg0);
            arg2.method2757(arg1, arg0, var7, true);
        } else {
            arg2.method2757(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("cu.y(I)V")
    public static void method1947() {
        Object var0 = field2487;
        synchronized (field2487) {
            if (field2490 == 0) {
                Statics.field235.method2443(new class150(), 5);
            }
            field2490 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class178 var1 = field2484;
                class149 var2;
                synchronized (field2484) {
                    var2 = (class149) field2484.method3196();
                }
                if (var2 == null) {
                    class114.method2036(100L);
                    Object var10 = field2487;
                    synchronized (field2487) {
                        if (field2490 <= 1) {
                            field2490 = 0;
                            field2487.notifyAll();
                            return;
                        }
                        field2490--;
                    }
                } else {
                    if (var2.field2478 == 0) {
                        var2.field2477.method2425((int) var2.field2873, var2.field2476, var2.field2476.length);
                        class178 var4 = field2484;
                        synchronized (field2484) {
                            var2.method3280();
                        }
                    } else if (var2.field2478 == 1) {
                        var2.field2476 = var2.field2477.method2432((int) var2.field2873);
                        class178 var6 = field2484;
                        synchronized (field2484) {
                            field2485.method3200(var2);
                        }
                    }
                    Object var8 = field2487;
                    synchronized (field2487) {
                        if (field2490 <= 1) {
                            field2490 = 0;
                            field2487.notifyAll();
                            return;
                        }
                        field2490 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method1860((String) null, var18);
        }
    }

    @ObfuscatedName("es.w(B)V")
    public static void method2646() {
        Object var0 = field2487;
        synchronized (field2487) {
            if (field2490 != 0) {
                field2490 = 1;
                try {
                    field2487.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
