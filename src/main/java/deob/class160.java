package deob;

@ObfuscatedName("fv")
public class class160 implements Runnable {

    @ObfuscatedName("fv.e")
    public static class179 field2608 = new class179();

    @ObfuscatedName("fv.i")
    public static class179 field2615 = new class179();

    @ObfuscatedName("fv.k")
    public static int field2607 = 0;

    @ObfuscatedName("fv.q")
    public static Object field2610 = new Object();

    @ObfuscatedName("ee.q(I[BLbu;I)V")
    public static void method2728(int arg0, byte[] arg1, class72 arg2) {
        class159 var3 = new class159();
        var3.field2605 = 0;
        var3.field2839 = (long) arg0;
        var3.field2603 = arg1;
        var3.field2604 = arg2;
        class179 var4 = field2608;
        synchronized (field2608) {
            field2608.method3328(var3);
        }
        Object var6 = field2610;
        synchronized (field2610) {
            if (field2607 == 0) {
                Statics.field200.method1546(new class160(), 5);
            }
            field2607 = 600;
        }
    }

    @ObfuscatedName("fh.j(ILbu;Lfh;I)V")
    public static void method3126(int arg0, class72 arg1, class157 arg2) {
        byte[] var3 = null;
        class179 var4 = field2608;
        synchronized (field2608) {
            for (class159 var5 = (class159) field2608.method3331(); var5 != null; var5 = (class159) field2608.method3333()) {
                if ((long) arg0 == var5.field2839 && var5.field2604 == arg1 && var5.field2605 == 0) {
                    var3 = var5.field2603;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1463(arg0);
            arg2.method3105(arg1, arg0, var7, true);
        } else {
            arg2.method3105(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("g.z(I)V")
    public static void method159() {
        while (true) {
            class179 var0 = field2608;
            class159 var1;
            synchronized (field2608) {
                var1 = (class159) field2615.method3329();
            }
            if (var1 == null) {
                return;
            }
            var1.field2602.method3105(var1.field2604, (int) var1.field2839, var1.field2603, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class179 var1 = field2608;
                class159 var2;
                synchronized (field2608) {
                    var2 = (class159) field2608.method3331();
                }
                if (var2 == null) {
                    class127.method2200(100L);
                    Object var10 = field2610;
                    synchronized (field2610) {
                        if (field2607 <= 1) {
                            field2607 = 0;
                            field2610.notifyAll();
                            return;
                        }
                        field2607--;
                    }
                } else {
                    if (var2.field2605 == 0) {
                        var2.field2604.method1461((int) var2.field2839, var2.field2603, var2.field2603.length);
                        class179 var4 = field2608;
                        synchronized (field2608) {
                            var2.method3366();
                        }
                    } else if (var2.field2605 == 1) {
                        var2.field2603 = var2.field2604.method1463((int) var2.field2839);
                        class179 var6 = field2608;
                        synchronized (field2608) {
                            field2615.method3328(var2);
                        }
                    }
                    Object var8 = field2610;
                    synchronized (field2610) {
                        if (field2607 <= 1) {
                            field2607 = 0;
                            field2610.notifyAll();
                            return;
                        }
                        field2607 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class81.method1452((String) null, var18);
        }
    }
}
