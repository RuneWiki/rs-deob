package deob;

@ObfuscatedName("fg")
public class class174 implements Runnable {

    @ObfuscatedName("fg.f")
    public static class203 field2745 = new class203();

    @ObfuscatedName("fg.e")
    public static class203 field2743 = new class203();

    @ObfuscatedName("fg.n")
    public static int field2744 = 0;

    @ObfuscatedName("fg.t")
    public static Object field2747 = new Object();

    @ObfuscatedName("do.t(I[BLes;I)V")
    public static void method2289(int arg0, byte[] arg1, class138 arg2) {
        class173 var3 = new class173();
        var3.field2738 = 0;
        var3.field3167 = (long) arg0;
        var3.field2736 = arg1;
        var3.field2737 = arg2;
        class203 var4 = field2745;
        synchronized (field2745) {
            field2745.method3642(var3);
        }
        method2018();
    }

    @ObfuscatedName("cq.v(S)V")
    public static void method2018() {
        Object var0 = field2747;
        synchronized (field2747) {
            if (field2744 == 0) {
                Statics.field1147.method2768(new class174(), 5);
            }
            field2744 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class203 var1 = field2745;
                class173 var2;
                synchronized (field2745) {
                    var2 = (class173) field2745.method3646();
                }
                if (var2 == null) {
                    class131.method2276(100L);
                    Object var10 = field2747;
                    synchronized (field2747) {
                        if (field2744 <= 1) {
                            field2744 = 0;
                            field2747.notifyAll();
                            return;
                        }
                        field2744--;
                    }
                } else {
                    if (var2.field2738 == 0) {
                        var2.field2737.method2746((int) var2.field3167, var2.field2736, var2.field2736.length);
                        class203 var4 = field2745;
                        synchronized (field2745) {
                            var2.method3744();
                        }
                    } else if (var2.field2738 == 1) {
                        var2.field2736 = var2.field2737.method2745((int) var2.field3167);
                        class203 var6 = field2745;
                        synchronized (field2745) {
                            field2743.method3642(var2);
                        }
                    }
                    Object var8 = field2747;
                    synchronized (field2747) {
                        if (field2744 <= 1) {
                            field2744 = 0;
                            field2747.notifyAll();
                            return;
                        }
                        field2744 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class152.method2194((String) null, var18);
        }
    }
}
