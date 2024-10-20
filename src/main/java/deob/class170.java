package deob;

@ObfuscatedName("fl")
public class class170 implements Runnable {

    @ObfuscatedName("fl.i")
    public static class199 field2695 = new class199();

    @ObfuscatedName("fl.v")
    public static class199 field2696 = new class199();

    @ObfuscatedName("fl.r")
    public static int field2697 = 0;

    @ObfuscatedName("fl.n")
    public static Object field2698 = new Object();

    @ObfuscatedName("aq.x(B)V")
    public static void method965() {
        while (true) {
            class199 var0 = field2695;
            class169 var1;
            synchronized (field2695) {
                var1 = (class169) field2696.method3532();
            }
            if (var1 == null) {
                return;
            }
            var1.field2692.method3113(var1.field2694, (int) var1.field3100, var1.field2690, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2695;
                class169 var2;
                synchronized (field2695) {
                    var2 = (class169) field2695.method3534();
                }
                if (var2 == null) {
                    class127.method731(100L);
                    Object var10 = field2698;
                    synchronized (field2698) {
                        if (field2697 <= 1) {
                            field2697 = 0;
                            field2698.notifyAll();
                            return;
                        }
                        field2697--;
                    }
                } else {
                    if (var2.field2691 == 0) {
                        var2.field2694.method2683((int) var2.field3100, var2.field2690, var2.field2690.length);
                        class199 var4 = field2695;
                        synchronized (field2695) {
                            var2.method3626();
                        }
                    } else if (var2.field2691 == 1) {
                        var2.field2690 = var2.field2694.method2681((int) var2.field3100);
                        class199 var6 = field2695;
                        synchronized (field2695) {
                            field2696.method3529(var2);
                        }
                    }
                    Object var8 = field2698;
                    synchronized (field2698) {
                        if (field2697 <= 1) {
                            field2697 = 0;
                            field2698.notifyAll();
                            return;
                        }
                        field2697 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method145((String) null, var18);
        }
    }
}
