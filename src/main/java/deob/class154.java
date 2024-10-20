package deob;

@ObfuscatedName("es")
public class class154 implements Runnable {

    @ObfuscatedName("es.a")
    public static class182 field2529 = new class182();

    @ObfuscatedName("es.v")
    public static class182 field2530 = new class182();

    @ObfuscatedName("es.i")
    public static int field2527 = 0;

    @ObfuscatedName("es.b")
    public static Object field2528 = new Object();

    @ObfuscatedName("ey.v(ILdz;Lez;I)V")
    public static void method2707(int arg0, class125 arg1, class152 arg2) {
        byte[] var3 = null;
        class182 var4 = field2529;
        synchronized (field2529) {
            for (class153 var5 = (class153) field2529.method3251(); var5 != null; var5 = (class153) field2529.method3261()) {
                if ((long) arg0 == var5.field2908 && var5.field2521 == arg1 && var5.field2526 == 0) {
                    var3 = var5.field2520;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2465(arg0);
            arg2.method2829(arg1, arg0, var7, true);
        } else {
            arg2.method2829(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("i.i(I)V")
    public static void method27() {
        Object var0 = field2528;
        synchronized (field2528) {
            if (field2527 == 0) {
                Statics.field1300.method2481(new class154(), 5);
            }
            field2527 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class182 var1 = field2529;
                class153 var2;
                synchronized (field2529) {
                    var2 = (class153) field2529.method3251();
                }
                if (var2 == null) {
                    class118.method2072(100L);
                    Object var10 = field2528;
                    synchronized (field2528) {
                        if (field2527 <= 1) {
                            field2527 = 0;
                            field2528.notifyAll();
                            return;
                        }
                        field2527--;
                    }
                } else {
                    if (var2.field2526 == 0) {
                        var2.field2521.method2464((int) var2.field2908, var2.field2520, var2.field2520.length);
                        class182 var4 = field2529;
                        synchronized (field2529) {
                            var2.method3343();
                        }
                    } else if (var2.field2526 == 1) {
                        var2.field2520 = var2.field2521.method2465((int) var2.field2908);
                        class182 var6 = field2529;
                        synchronized (field2529) {
                            field2530.method3274(var2);
                        }
                    }
                    Object var8 = field2528;
                    synchronized (field2528) {
                        if (field2527 <= 1) {
                            field2527 = 0;
                            field2528.notifyAll();
                            return;
                        }
                        field2527 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class139.method2550((String) null, var18);
        }
    }
}
