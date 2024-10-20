package deob;

@ObfuscatedName("fv")
public class class170 implements Runnable {

    @ObfuscatedName("fv.y")
    public static class199 field2684 = new class199();

    @ObfuscatedName("fv.d")
    public static class199 field2683 = new class199();

    @ObfuscatedName("fv.g")
    public static int field2685 = 0;

    @ObfuscatedName("fv.w")
    public static Object field2686 = new Object();

    public void run() {
        try {
            while (true) {
                class199 var1 = field2684;
                class169 var2;
                synchronized (field2684) {
                    var2 = (class169) field2684.method3493();
                }
                if (var2 == null) {
                    class127.method1535(100L);
                    Object var10 = field2686;
                    synchronized (field2686) {
                        if (field2685 <= 1) {
                            field2685 = 0;
                            field2686.notifyAll();
                            return;
                        }
                        field2685--;
                    }
                } else {
                    if (var2.field2681 == 0) {
                        var2.field2680.method2670((int) var2.field3091, var2.field2678, var2.field2678.length);
                        class199 var4 = field2684;
                        synchronized (field2684) {
                            var2.method3588();
                        }
                    } else if (var2.field2681 == 1) {
                        var2.field2678 = var2.field2680.method2667((int) var2.field3091);
                        class199 var6 = field2684;
                        synchronized (field2684) {
                            field2683.method3488(var2);
                        }
                    }
                    Object var8 = field2686;
                    synchronized (field2686) {
                        if (field2685 <= 1) {
                            field2685 = 0;
                            field2686.notifyAll();
                            return;
                        }
                        field2685 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method2701((String) null, var18);
        }
    }
}
