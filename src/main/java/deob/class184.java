package deob;

@ObfuscatedName("gn")
public class class184 implements Runnable {

    @ObfuscatedName("gn.b")
    public static class129 field2731 = new class129();

    @ObfuscatedName("gn.l")
    public static class129 field2726 = new class129();

    @ObfuscatedName("gn.i")
    public static int field2728 = 0;

    @ObfuscatedName("gn.t")
    public static Object field2729 = new Object();

    @ObfuscatedName("ey.t(ILdu;Lgk;I)V")
    public static void method2513(int arg0, class117 arg1, class185 arg2) {
        byte[] var3 = null;
        class129 var4 = field2731;
        synchronized (field2731) {
            for (class181 var5 = (class181) field2731.method2324(); var5 != null; var5 = (class181) field2731.method2331()) {
                if ((long) arg0 == var5.field1879 && var5.field2697 == arg1 && var5.field2698 == 0) {
                    var3 = var5.field2696;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2168(arg0);
            arg2.method3261(arg1, arg0, var7, true);
        } else {
            arg2.method3261(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2731;
                class181 var2;
                synchronized (field2731) {
                    var2 = (class181) field2731.method2324();
                }
                if (var2 == null) {
                    class162.method2157(100L);
                    Object var10 = field2729;
                    synchronized (field2729) {
                        if (field2728 <= 1) {
                            field2728 = 0;
                            field2729.notifyAll();
                            return;
                        }
                        field2728--;
                    }
                } else {
                    if (var2.field2698 == 0) {
                        var2.field2697.method2165((int) var2.field1879, var2.field2696, var2.field2696.length);
                        class129 var4 = field2731;
                        synchronized (field2731) {
                            var2.method2313();
                        }
                    } else if (var2.field2698 == 1) {
                        var2.field2696 = var2.field2697.method2168((int) var2.field1879);
                        class129 var6 = field2731;
                        synchronized (field2731) {
                            field2726.method2320(var2);
                        }
                    }
                    Object var8 = field2729;
                    synchronized (field2729) {
                        if (field2728 <= 1) {
                            field2728 = 0;
                            field2729.notifyAll();
                            return;
                        }
                        field2728 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method1864((String) null, var18);
        }
    }
}
