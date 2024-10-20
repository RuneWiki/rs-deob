package deob;

@ObfuscatedName("fj")
public class class171 implements Runnable {

    @ObfuscatedName("fj.b")
    public static class200 field2705 = new class200();

    @ObfuscatedName("fj.g")
    public static class200 field2703 = new class200();

    @ObfuscatedName("fj.j")
    public static int field2702 = 0;

    @ObfuscatedName("fj.d")
    public static Object field2707 = new Object();

    @ObfuscatedName("fa.d(B)V")
    public static void method2957() {
        Object var0 = field2707;
        synchronized (field2707) {
            if (field2702 == 0) {
                Statics.field925.method2741(new class171(), 5);
            }
            field2702 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class200 var1 = field2705;
                class170 var2;
                synchronized (field2705) {
                    var2 = (class170) field2705.method3575();
                }
                if (var2 == null) {
                    class128.method2289(100L);
                    Object var10 = field2707;
                    synchronized (field2707) {
                        if (field2702 <= 1) {
                            field2702 = 0;
                            field2707.notifyAll();
                            return;
                        }
                        field2702--;
                    }
                } else {
                    if (var2.field2699 == 0) {
                        var2.field2696.method2722((int) var2.field3114, var2.field2695, var2.field2695.length);
                        class200 var4 = field2705;
                        synchronized (field2705) {
                            var2.method3647();
                        }
                    } else if (var2.field2699 == 1) {
                        var2.field2695 = var2.field2696.method2726((int) var2.field3114);
                        class200 var6 = field2705;
                        synchronized (field2705) {
                            field2703.method3550(var2);
                        }
                    }
                    Object var8 = field2707;
                    synchronized (field2707) {
                        if (field2702 <= 1) {
                            field2702 = 0;
                            field2707.notifyAll();
                            return;
                        }
                        field2702 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class149.method93((String) null, var18);
        }
    }
}
