package deob;

@ObfuscatedName("fx")
public class class174 implements Runnable {

    @ObfuscatedName("fx.i")
    public static class203 field2757 = new class203();

    @ObfuscatedName("fx.h")
    public static class203 field2758 = new class203();

    @ObfuscatedName("fx.e")
    public static int field2756 = 0;

    @ObfuscatedName("fx.g")
    public static Object field2754 = new Object();

    @ObfuscatedName("fa.e(I)V")
    public static void method2990() {
        Object var0 = field2754;
        synchronized (field2754) {
            if (field2756 == 0) {
                Statics.field899.method2773(new class174(), 5);
            }
            field2756 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class203 var1 = field2757;
                class173 var2;
                synchronized (field2757) {
                    var2 = (class173) field2757.method3597();
                }
                if (var2 == null) {
                    class131.method3297(100L);
                    Object var10 = field2754;
                    synchronized (field2754) {
                        if (field2756 <= 1) {
                            field2756 = 0;
                            field2754.notifyAll();
                            return;
                        }
                        field2756--;
                    }
                } else {
                    if (var2.field2748 == 0) {
                        var2.field2751.method2754((int) var2.field3176, var2.field2749, var2.field2749.length);
                        class203 var4 = field2757;
                        synchronized (field2757) {
                            var2.method3706();
                        }
                    } else if (var2.field2748 == 1) {
                        var2.field2749 = var2.field2751.method2752((int) var2.field3176);
                        class203 var6 = field2757;
                        synchronized (field2757) {
                            field2758.method3617(var2);
                        }
                    }
                    Object var8 = field2754;
                    synchronized (field2754) {
                        if (field2756 <= 1) {
                            field2756 = 0;
                            field2754.notifyAll();
                            return;
                        }
                        field2756 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class152.method2021((String) null, var18);
        }
    }

    @ObfuscatedName("ci.g(B)V")
    public static void method1637() {
        Object var0 = field2754;
        synchronized (field2754) {
            if (field2756 != 0) {
                field2756 = 1;
                try {
                    field2754.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
