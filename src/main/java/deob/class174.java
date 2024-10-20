package deob;

@ObfuscatedName("fr")
public class class174 implements Runnable {

    @ObfuscatedName("fr.m")
    public static class203 field2760 = new class203();

    @ObfuscatedName("fr.w")
    public static class203 field2758 = new class203();

    @ObfuscatedName("fr.e")
    public static int field2759 = 0;

    @ObfuscatedName("fr.o")
    public static Object field2757 = new Object();

    @ObfuscatedName("ep.o(I[BLei;B)V")
    public static void method2834(int arg0, byte[] arg1, class138 arg2) {
        class173 var3 = new class173();
        var3.field2754 = 0;
        var3.field3168 = (long) arg0;
        var3.field2756 = arg1;
        var3.field2755 = arg2;
        class203 var4 = field2760;
        synchronized (field2760) {
            field2760.method3616(var3);
        }
        Object var6 = field2757;
        synchronized (field2757) {
            if (field2759 == 0) {
                Statics.field901.method2772(new class174(), 5);
            }
            field2759 = 600;
        }
    }

    @ObfuscatedName("bx.g(ILei;Lfi;I)V")
    public static void method1097(int arg0, class138 arg1, class172 arg2) {
        class173 var3 = new class173();
        var3.field2754 = 1;
        var3.field3168 = (long) arg0;
        var3.field2755 = arg1;
        var3.field2753 = arg2;
        class203 var4 = field2760;
        synchronized (field2760) {
            field2760.method3616(var3);
        }
        Object var6 = field2757;
        synchronized (field2757) {
            if (field2759 == 0) {
                Statics.field901.method2772(new class174(), 5);
            }
            field2759 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class203 var1 = field2760;
                class173 var2;
                synchronized (field2760) {
                    var2 = (class173) field2760.method3621();
                }
                if (var2 == null) {
                    class131.method2828(100L);
                    Object var10 = field2757;
                    synchronized (field2757) {
                        if (field2759 <= 1) {
                            field2759 = 0;
                            field2757.notifyAll();
                            return;
                        }
                        field2759--;
                    }
                } else {
                    if (var2.field2754 == 0) {
                        var2.field2755.method2750((int) var2.field3168, var2.field2756, var2.field2756.length);
                        class203 var4 = field2760;
                        synchronized (field2760) {
                            var2.method3729();
                        }
                    } else if (var2.field2754 == 1) {
                        var2.field2756 = var2.field2755.method2749((int) var2.field3168);
                        class203 var6 = field2760;
                        synchronized (field2760) {
                            field2758.method3616(var2);
                        }
                    }
                    Object var8 = field2757;
                    synchronized (field2757) {
                        if (field2759 <= 1) {
                            field2759 = 0;
                            field2757.notifyAll();
                            return;
                        }
                        field2759 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class152.method1096((String) null, var18);
        }
    }
}
