package deob;

@ObfuscatedName("fr")
public class class170 implements Runnable {

    @ObfuscatedName("fr.d")
    public static class199 field2685 = new class199();

    @ObfuscatedName("fr.p")
    public static class199 field2684 = new class199();

    @ObfuscatedName("fr.v")
    public static int field2686 = 0;

    @ObfuscatedName("fr.l")
    public static Object field2687 = new Object();

    @ObfuscatedName("dz.l(ILed;Lfe;I)V")
    public static void method2678(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2685;
        synchronized (field2685) {
            for (class169 var5 = (class169) field2685.method3613(); var5 != null; var5 = (class169) field2685.method3615()) {
                if ((long) arg0 == var5.field3107 && var5.field2678 == arg1 && var5.field2680 == 0) {
                    var3 = var5.field2682;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2725(arg0);
            arg2.method3174(arg1, arg0, var7, true);
        } else {
            arg2.method3174(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("an.y(I)V")
    public static void method995() {
        while (true) {
            class199 var0 = field2685;
            class169 var1;
            synchronized (field2685) {
                var1 = (class169) field2684.method3611();
            }
            if (var1 == null) {
                return;
            }
            var1.field2679.method3174(var1.field2678, (int) var1.field3107, var1.field2682, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2685;
                class169 var2;
                synchronized (field2685) {
                    var2 = (class169) field2685.method3613();
                }
                if (var2 == null) {
                    class127.method724(100L);
                    Object var10 = field2687;
                    synchronized (field2687) {
                        if (field2686 <= 1) {
                            field2686 = 0;
                            field2687.notifyAll();
                            return;
                        }
                        field2686--;
                    }
                } else {
                    if (var2.field2680 == 0) {
                        var2.field2678.method2726((int) var2.field3107, var2.field2682, var2.field2682.length);
                        class199 var4 = field2685;
                        synchronized (field2685) {
                            var2.method3715();
                        }
                    } else if (var2.field2680 == 1) {
                        var2.field2682 = var2.field2678.method2725((int) var2.field3107);
                        class199 var6 = field2685;
                        synchronized (field2685) {
                            field2684.method3633(var2);
                        }
                    }
                    Object var8 = field2687;
                    synchronized (field2687) {
                        if (field2686 <= 1) {
                            field2686 = 0;
                            field2687.notifyAll();
                            return;
                        }
                        field2686 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method2734((String) null, var18);
        }
    }
}
