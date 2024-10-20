package deob;

@ObfuscatedName("ey")
public class class149 implements Runnable {

    @ObfuscatedName("ey.t")
    public static class177 field2484 = new class177();

    @ObfuscatedName("ey.s")
    public static class177 field2483 = new class177();

    @ObfuscatedName("ey.f")
    public static int field2482 = 0;

    @ObfuscatedName("ey.e")
    public static Object field2485 = new Object();

    @ObfuscatedName("ar.s(ILdp;Leo;I)V")
    public static void method608(int arg0, class121 arg1, class147 arg2) {
        class148 var3 = new class148();
        var3.field2470 = 1;
        var3.field2864 = (long) arg0;
        var3.field2478 = arg1;
        var3.field2473 = arg2;
        class177 var4 = field2484;
        synchronized (field2484) {
            field2484.method3260(var3);
        }
        method2686();
    }

    @ObfuscatedName("u.f(ILdp;Leo;B)V")
    public static void method124(int arg0, class121 arg1, class147 arg2) {
        byte[] var3 = null;
        class177 var4 = field2484;
        synchronized (field2484) {
            for (class148 var5 = (class148) field2484.method3239(); var5 != null; var5 = (class148) field2484.method3248()) {
                if ((long) arg0 == var5.field2864 && var5.field2478 == arg1 && var5.field2470 == 0) {
                    var3 = var5.field2471;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2447(arg0);
            arg2.method2794(arg1, arg0, var7, true);
        } else {
            arg2.method2794(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("at.e(I)V")
    public static void method745() {
        while (true) {
            class177 var0 = field2484;
            class148 var1;
            synchronized (field2484) {
                var1 = (class148) field2483.method3237();
            }
            if (var1 == null) {
                return;
            }
            var1.field2473.method2794(var1.field2478, (int) var1.field2864, var1.field2471, false);
        }
    }

    @ObfuscatedName("ee.d(B)V")
    public static void method2686() {
        Object var0 = field2485;
        synchronized (field2485) {
            if (field2482 == 0) {
                Statics.field2036.method2468(new class149(), 5);
            }
            field2482 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2484;
                class148 var2;
                synchronized (field2484) {
                    var2 = (class148) field2484.method3239();
                }
                if (var2 == null) {
                    class114.method2031(100L);
                    Object var10 = field2485;
                    synchronized (field2485) {
                        if (field2482 <= 1) {
                            field2482 = 0;
                            field2485.notifyAll();
                            return;
                        }
                        field2482--;
                    }
                } else {
                    if (var2.field2470 == 0) {
                        var2.field2478.method2448((int) var2.field2864, var2.field2471, var2.field2471.length);
                        class177 var4 = field2484;
                        synchronized (field2484) {
                            var2.method3316();
                        }
                    } else if (var2.field2470 == 1) {
                        var2.field2471 = var2.field2478.method2447((int) var2.field2864);
                        class177 var6 = field2484;
                        synchronized (field2484) {
                            field2483.method3260(var2);
                        }
                    }
                    Object var8 = field2485;
                    synchronized (field2485) {
                        if (field2482 <= 1) {
                            field2482 = 0;
                            field2485.notifyAll();
                            return;
                        }
                        field2482 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method96((String) null, var18);
        }
    }

    @ObfuscatedName("cn.n(I)V")
    public static void method1830() {
        Object var0 = field2485;
        synchronized (field2485) {
            if (field2482 != 0) {
                field2482 = 1;
                try {
                    field2485.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
