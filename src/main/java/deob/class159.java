package deob;

@ObfuscatedName("fz")
public class class159 implements Runnable {

    @ObfuscatedName("fz.l")
    public static class178 field2604 = new class178();

    @ObfuscatedName("fz.b")
    public static class178 field2599 = new class178();

    @ObfuscatedName("fz.o")
    public static int field2603 = 0;

    @ObfuscatedName("fz.w")
    public static Object field2601 = new Object();

    @ObfuscatedName("dp.w(ILbg;Lee;B)V")
    public static void method2203(int arg0, class71 arg1, class156 arg2) {
        byte[] var3 = null;
        class178 var4 = field2604;
        synchronized (field2604) {
            for (class158 var5 = (class158) field2604.method3343(); var5 != null; var5 = (class158) field2604.method3328()) {
                if ((long) arg0 == var5.field2837 && var5.field2597 == arg1 && var5.field2596 == 0) {
                    var3 = var5.field2593;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1426(arg0);
            arg2.method3116(arg1, arg0, var7, true);
        } else {
            arg2.method3116(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class178 var1 = field2604;
                class158 var2;
                synchronized (field2604) {
                    var2 = (class158) field2604.method3343();
                }
                if (var2 == null) {
                    class126.method46(100L);
                    Object var10 = field2601;
                    synchronized (field2601) {
                        if (field2603 <= 1) {
                            field2603 = 0;
                            field2601.notifyAll();
                            return;
                        }
                        field2603--;
                    }
                } else {
                    if (var2.field2596 == 0) {
                        var2.field2597.method1425((int) var2.field2837, var2.field2593, var2.field2593.length);
                        class178 var4 = field2604;
                        synchronized (field2604) {
                            var2.method3360();
                        }
                    } else if (var2.field2596 == 1) {
                        var2.field2593 = var2.field2597.method1426((int) var2.field2837);
                        class178 var6 = field2604;
                        synchronized (field2604) {
                            field2599.method3321(var2);
                        }
                    }
                    Object var8 = field2601;
                    synchronized (field2601) {
                        if (field2603 <= 1) {
                            field2603 = 0;
                            field2601.notifyAll();
                            return;
                        }
                        field2603 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method1393((String) null, var18);
        }
    }
}
