package deob;

@ObfuscatedName("jv")
public class class263 implements Runnable {

    @ObfuscatedName("jv.o")
    public static class218 field3395 = new class218();

    @ObfuscatedName("jv.k")
    public static class218 field3396 = new class218();

    @ObfuscatedName("jv.d")
    public static int field3402 = 0;

    @ObfuscatedName("jv.h")
    public static Object field3398 = new Object();

    @ObfuscatedName("cb.o(ILff;Ljn;B)V")
    public static void method1722(int arg0, class175 arg1, class264 arg2) {
        byte[] var3 = null;
        class218 var4 = field3395;
        synchronized (field3395) {
            for (class260 var5 = (class260) field3395.method3707(); var5 != null; var5 = (class260) field3395.method3697()) {
                if ((long) arg0 == var5.field2652 && var5.field3369 == arg1 && var5.field3370 == 0) {
                    var3 = var5.field3368;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method3050(arg0);
            arg2.method4264(arg1, arg0, var7, true);
        } else {
            arg2.method4264(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class218 var1 = field3395;
                class260 var2;
                synchronized (field3395) {
                    var2 = (class260) field3395.method3707();
                }
                if (var2 == null) {
                    class204.method12(100L);
                    Object var10 = field3398;
                    synchronized (field3398) {
                        if (field3402 <= 1) {
                            field3402 = 0;
                            field3398.notifyAll();
                            return;
                        }
                        field3402--;
                    }
                } else {
                    if (var2.field3370 == 0) {
                        var2.field3369.method3051((int) var2.field2652, var2.field3368, var2.field3368.length);
                        class218 var4 = field3395;
                        synchronized (field3395) {
                            var2.method3681();
                        }
                    } else if (var2.field3370 == 1) {
                        var2.field3368 = var2.field3369.method3050((int) var2.field2652);
                        class218 var6 = field3395;
                        synchronized (field3395) {
                            field3396.method3690(var2);
                        }
                    }
                    Object var8 = field3398;
                    synchronized (field3398) {
                        if (field3402 <= 1) {
                            field3402 = 0;
                            field3398.notifyAll();
                            return;
                        }
                        field3402 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class165.method1744((String) null, var18);
        }
    }
}
