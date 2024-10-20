package deob;

@ObfuscatedName("fb")
public class class174 implements Runnable {

    @ObfuscatedName("fb.e")
    public static class203 field2751 = new class203();

    @ObfuscatedName("fb.l")
    public static class203 field2752 = new class203();

    @ObfuscatedName("fb.c")
    public static int field2753 = 0;

    @ObfuscatedName("fb.h")
    public static Object field2754 = new Object();

    @ObfuscatedName("r.r(I[BLei;I)V")
    public static void method45(int arg0, byte[] arg1, class138 arg2) {
        class173 var3 = new class173();
        var3.field2746 = 0;
        var3.field3162 = (long) arg0;
        var3.field2748 = arg1;
        var3.field2743 = arg2;
        class203 var4 = field2751;
        synchronized (field2751) {
            field2751.method3650(var3);
        }
        method2716();
    }

    @ObfuscatedName("h.a(S)V")
    public static void method41() {
        while (true) {
            class203 var0 = field2751;
            class173 var1;
            synchronized (field2751) {
                var1 = (class173) field2752.method3652();
            }
            if (var1 == null) {
                return;
            }
            var1.field2741.method3220(var1.field2743, (int) var1.field3162, var1.field2748, false);
        }
    }

    @ObfuscatedName("dq.b(I)V")
    public static void method2716() {
        Object var0 = field2754;
        synchronized (field2754) {
            if (field2753 == 0) {
                Statics.field1870.method2852(new class174(), 5);
            }
            field2753 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class203 var1 = field2751;
                class173 var2;
                synchronized (field2751) {
                    var2 = (class173) field2751.method3654();
                }
                if (var2 == null) {
                    class131.method2735(100L);
                    Object var10 = field2754;
                    synchronized (field2754) {
                        if (field2753 <= 1) {
                            field2753 = 0;
                            field2754.notifyAll();
                            return;
                        }
                        field2753--;
                    }
                } else {
                    if (var2.field2746 == 0) {
                        var2.field2743.method2828((int) var2.field3162, var2.field2748, var2.field2748.length);
                        class203 var4 = field2751;
                        synchronized (field2751) {
                            var2.method3755();
                        }
                    } else if (var2.field2746 == 1) {
                        var2.field2748 = var2.field2743.method2827((int) var2.field3162);
                        class203 var6 = field2751;
                        synchronized (field2751) {
                            field2752.method3650(var2);
                        }
                    }
                    Object var8 = field2754;
                    synchronized (field2754) {
                        if (field2753 <= 1) {
                            field2753 = 0;
                            field2754.notifyAll();
                            return;
                        }
                        field2753 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class152.method976((String) null, var18);
        }
    }
}
