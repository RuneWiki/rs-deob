package deob;

@ObfuscatedName("fo")
public class class161 implements Runnable {

    @ObfuscatedName("fo.n")
    public static class190 field2617 = new class190();

    @ObfuscatedName("fo.o")
    public static class190 field2615 = new class190();

    @ObfuscatedName("fo.a")
    public static int field2611 = 0;

    @ObfuscatedName("fo.w")
    public static Object field2612 = new Object();

    @ObfuscatedName("eo.w(I[BLdt;I)V")
    public static void method2896(int arg0, byte[] arg1, class126 arg2) {
        class160 var3 = new class160();
        var3.field2604 = 0;
        var3.field3018 = (long) arg0;
        var3.field2605 = arg1;
        var3.field2606 = arg2;
        class190 var4 = field2617;
        synchronized (field2617) {
            field2617.method3441(var3);
        }
        Object var6 = field2612;
        synchronized (field2612) {
            if (field2611 == 0) {
                Statics.field202.method2610(new class161(), 5);
            }
            field2611 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class190 var1 = field2617;
                class160 var2;
                synchronized (field2617) {
                    var2 = (class160) field2617.method3451();
                }
                if (var2 == null) {
                    class119.method2156(100L);
                    Object var10 = field2612;
                    synchronized (field2612) {
                        if (field2611 <= 1) {
                            field2611 = 0;
                            field2612.notifyAll();
                            return;
                        }
                        field2611--;
                    }
                } else {
                    if (var2.field2604 == 0) {
                        var2.field2606.method2597((int) var2.field3018, var2.field2605, var2.field2605.length);
                        class190 var4 = field2617;
                        synchronized (field2617) {
                            var2.method3540();
                        }
                    } else if (var2.field2604 == 1) {
                        var2.field2605 = var2.field2606.method2591((int) var2.field3018);
                        class190 var6 = field2617;
                        synchronized (field2617) {
                            field2615.method3441(var2);
                        }
                    }
                    Object var8 = field2612;
                    synchronized (field2612) {
                        if (field2611 <= 1) {
                            field2611 = 0;
                            field2612.notifyAll();
                            return;
                        }
                        field2611 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class140.method2571((String) null, var18);
        }
    }
}
