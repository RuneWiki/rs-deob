package deob;

@ObfuscatedName("fd")
public class class158 implements Runnable {

    @ObfuscatedName("fd.b")
    public static class177 field2609 = new class177();

    @ObfuscatedName("fd.c")
    public static class177 field2606 = new class177();

    @ObfuscatedName("fd.j")
    public static int field2603 = 0;

    @ObfuscatedName("fd.i")
    public static Object field2604 = new Object();

    @ObfuscatedName("cb.i(ILbv;Leu;I)V")
    public static void method1573(int arg0, class71 arg1, class155 arg2) {
        class157 var3 = new class157();
        var3.field2596 = 1;
        var3.field2826 = (long) arg0;
        var3.field2598 = arg1;
        var3.field2600 = arg2;
        class177 var4 = field2609;
        synchronized (field2609) {
            field2609.method3261(var3);
        }
        Object var6 = field2604;
        synchronized (field2604) {
            if (field2603 == 0) {
                Statics.field362.method1463(new class158(), 5);
            }
            field2603 = 600;
        }
    }

    @ObfuscatedName("df.k(ILbv;Leu;B)V")
    public static void method2179(int arg0, class71 arg1, class155 arg2) {
        byte[] var3 = null;
        class177 var4 = field2609;
        synchronized (field2609) {
            for (class157 var5 = (class157) field2609.method3246(); var5 != null; var5 = (class157) field2609.method3248()) {
                if ((long) arg0 == var5.field2826 && var5.field2598 == arg1 && var5.field2596 == 0) {
                    var3 = var5.field2597;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1372(arg0);
            arg2.method3056(arg1, arg0, var7, true);
        } else {
            arg2.method3056(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2609;
                class157 var2;
                synchronized (field2609) {
                    var2 = (class157) field2609.method3246();
                }
                if (var2 == null) {
                    class126.method874(100L);
                    Object var10 = field2604;
                    synchronized (field2604) {
                        if (field2603 <= 1) {
                            field2603 = 0;
                            field2604.notifyAll();
                            return;
                        }
                        field2603--;
                    }
                } else {
                    if (var2.field2596 == 0) {
                        var2.field2598.method1373((int) var2.field2826, var2.field2597, var2.field2597.length);
                        class177 var4 = field2609;
                        synchronized (field2609) {
                            var2.method3282();
                        }
                    } else if (var2.field2596 == 1) {
                        var2.field2597 = var2.field2598.method1372((int) var2.field2826);
                        class177 var6 = field2609;
                        synchronized (field2609) {
                            field2606.method3261(var2);
                        }
                    }
                    Object var8 = field2604;
                    synchronized (field2604) {
                        if (field2603 <= 1) {
                            field2603 = 0;
                            field2604.notifyAll();
                            return;
                        }
                        field2603 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method173((String) null, var18);
        }
    }
}
