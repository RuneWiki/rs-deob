package deob;

@ObfuscatedName("fm")
public class class164 implements Runnable {

    @ObfuscatedName("fm.j")
    public static class193 field2634 = new class193();

    @ObfuscatedName("fm.y")
    public static class193 field2633 = new class193();

    @ObfuscatedName("fm.z")
    public static int field2630 = 0;

    @ObfuscatedName("fm.l")
    public static Object field2632 = new Object();

    @ObfuscatedName("j.y(I[BLdw;I)V")
    public static void method1(int arg0, byte[] arg1, class129 arg2) {
        class163 var3 = new class163();
        var3.field2624 = 0;
        var3.field3043 = (long) arg0;
        var3.field2627 = arg1;
        var3.field2625 = arg2;
        class193 var4 = field2634;
        synchronized (field2634) {
            field2634.method3485(var3);
        }
        Object var6 = field2632;
        synchronized (field2632) {
            if (field2630 == 0) {
                Statics.field109.method2697(new class164(), 5);
            }
            field2630 = 600;
        }
    }

    @ObfuscatedName("av.l(ILdw;Lfc;I)V")
    public static void method727(int arg0, class129 arg1, class162 arg2) {
        byte[] var3 = null;
        class193 var4 = field2634;
        synchronized (field2634) {
            for (class163 var5 = (class163) field2634.method3490(); var5 != null; var5 = (class163) field2634.method3492()) {
                if ((long) arg0 == var5.field3043 && var5.field2625 == arg1 && var5.field2624 == 0) {
                    var3 = var5.field2627;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2675(arg0);
            arg2.method3060(arg1, arg0, var7, true);
        } else {
            arg2.method3060(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class193 var1 = field2634;
                class163 var2;
                synchronized (field2634) {
                    var2 = (class163) field2634.method3490();
                }
                if (var2 == null) {
                    class122.method558(100L);
                    Object var10 = field2632;
                    synchronized (field2632) {
                        if (field2630 <= 1) {
                            field2630 = 0;
                            field2632.notifyAll();
                            return;
                        }
                        field2630--;
                    }
                } else {
                    if (var2.field2624 == 0) {
                        var2.field2625.method2672((int) var2.field3043, var2.field2627, var2.field2627.length);
                        class193 var4 = field2634;
                        synchronized (field2634) {
                            var2.method3563();
                        }
                    } else if (var2.field2624 == 1) {
                        var2.field2627 = var2.field2625.method2675((int) var2.field3043);
                        class193 var6 = field2634;
                        synchronized (field2634) {
                            field2633.method3485(var2);
                        }
                    }
                    Object var8 = field2632;
                    synchronized (field2632) {
                        if (field2630 <= 1) {
                            field2630 = 0;
                            field2632.notifyAll();
                            return;
                        }
                        field2630 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class143.method1973((String) null, var18);
        }
    }
}
