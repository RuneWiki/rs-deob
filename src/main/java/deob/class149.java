package deob;

@ObfuscatedName("ee")
public class class149 implements Runnable {

    @ObfuscatedName("ee.e")
    public static class177 field2476 = new class177();

    @ObfuscatedName("ee.v")
    public static class177 field2477 = new class177();

    @ObfuscatedName("ee.i")
    public static int field2479 = 0;

    @ObfuscatedName("ee.g")
    public static Object field2478 = new Object();

    @ObfuscatedName("aq.g(I[BLdy;I)V")
    public static void method695(int arg0, byte[] arg1, class121 arg2) {
        class148 var3 = new class148();
        var3.field2475 = 0;
        var3.field2867 = (long) arg0;
        var3.field2471 = arg1;
        var3.field2472 = arg2;
        class177 var4 = field2476;
        synchronized (field2476) {
            field2476.method3183(var3);
        }
        Object var6 = field2478;
        synchronized (field2478) {
            if (field2479 == 0) {
                Statics.field2672.method2463(new class149(), 5);
            }
            field2479 = 600;
        }
    }

    @ObfuscatedName("d.x(ILdy;Ley;I)V")
    public static void method471(int arg0, class121 arg1, class147 arg2) {
        byte[] var3 = null;
        class177 var4 = field2476;
        synchronized (field2476) {
            for (class148 var5 = (class148) field2476.method3210(); var5 != null; var5 = (class148) field2476.method3182()) {
                if ((long) arg0 == var5.field2867 && var5.field2472 == arg1 && var5.field2475 == 0) {
                    var3 = var5.field2471;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2442(arg0);
            arg2.method2775(arg1, arg0, var7, true);
        } else {
            arg2.method2775(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("aj.b(I)V")
    public static void method745() {
        while (true) {
            class177 var0 = field2476;
            class148 var1;
            synchronized (field2476) {
                var1 = (class148) field2477.method3187();
            }
            if (var1 == null) {
                return;
            }
            var1.field2473.method2775(var1.field2472, (int) var1.field2867, var1.field2471, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2476;
                class148 var2;
                synchronized (field2476) {
                    var2 = (class148) field2476.method3210();
                }
                if (var2 == null) {
                    class114.method2357(100L);
                    Object var10 = field2478;
                    synchronized (field2478) {
                        if (field2479 <= 1) {
                            field2479 = 0;
                            field2478.notifyAll();
                            return;
                        }
                        field2479--;
                    }
                } else {
                    if (var2.field2475 == 0) {
                        var2.field2472.method2444((int) var2.field2867, var2.field2471, var2.field2471.length);
                        class177 var4 = field2476;
                        synchronized (field2476) {
                            var2.method3273();
                        }
                    } else if (var2.field2475 == 1) {
                        var2.field2471 = var2.field2472.method2442((int) var2.field2867);
                        class177 var6 = field2476;
                        synchronized (field2476) {
                            field2477.method3183(var2);
                        }
                    }
                    Object var8 = field2478;
                    synchronized (field2478) {
                        if (field2479 <= 1) {
                            field2479 = 0;
                            field2478.notifyAll();
                            return;
                        }
                        field2479 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method457((String) null, var18);
        }
    }

    @ObfuscatedName("am.q(I)V")
    public static void method550() {
        Object var0 = field2478;
        synchronized (field2478) {
            if (field2479 != 0) {
                field2479 = 1;
                try {
                    field2478.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
