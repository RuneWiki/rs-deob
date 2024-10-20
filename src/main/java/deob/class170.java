package deob;

@ObfuscatedName("fc")
public class class170 implements Runnable {

    @ObfuscatedName("fc.j")
    public static class199 field2718 = new class199();

    @ObfuscatedName("fc.l")
    public static class199 field2721 = new class199();

    @ObfuscatedName("fc.a")
    public static int field2719 = 0;

    @ObfuscatedName("fc.i")
    public static Object field2717 = new Object();

    @ObfuscatedName("ff.i(ILeg;Lfe;I)V")
    public static void method3077(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2718;
        synchronized (field2718) {
            for (class169 var5 = (class169) field2718.method3528(); var5 != null; var5 = (class169) field2718.method3527()) {
                if ((long) arg0 == var5.field3113 && var5.field2712 == arg1 && var5.field2710 == 0) {
                    var3 = var5.field2711;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2649(arg0);
            arg2.method3103(arg1, arg0, var7, true);
        } else {
            arg2.method3103(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2718;
                class169 var2;
                synchronized (field2718) {
                    var2 = (class169) field2718.method3528();
                }
                if (var2 == null) {
                    class127.method2202(100L);
                    Object var10 = field2717;
                    synchronized (field2717) {
                        if (field2719 <= 1) {
                            field2719 = 0;
                            field2717.notifyAll();
                            return;
                        }
                        field2719--;
                    }
                } else {
                    if (var2.field2710 == 0) {
                        var2.field2712.method2648((int) var2.field3113, var2.field2711, var2.field2711.length);
                        class199 var4 = field2718;
                        synchronized (field2718) {
                            var2.method3608();
                        }
                    } else if (var2.field2710 == 1) {
                        var2.field2711 = var2.field2712.method2649((int) var2.field3113);
                        class199 var6 = field2718;
                        synchronized (field2718) {
                            field2721.method3523(var2);
                        }
                    }
                    Object var8 = field2717;
                    synchronized (field2717) {
                        if (field2719 <= 1) {
                            field2719 = 0;
                            field2717.notifyAll();
                            return;
                        }
                        field2719 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method181((String) null, var18);
        }
    }
}
