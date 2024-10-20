package deob;

@ObfuscatedName("fy")
public class class174 implements Runnable {

    @ObfuscatedName("fy.x")
    public static class203 field2770 = new class203();

    @ObfuscatedName("fy.r")
    public static class203 field2769 = new class203();

    @ObfuscatedName("fy.j")
    public static int field2772 = 0;

    @ObfuscatedName("fy.z")
    public static Object field2771 = new Object();

    @ObfuscatedName("cv.j(I[BLek;I)V")
    public static void method2114(int arg0, byte[] arg1, class138 arg2) {
        class173 var3 = new class173();
        var3.field2765 = 0;
        var3.field3174 = (long) arg0;
        var3.field2764 = arg1;
        var3.field2763 = arg2;
        class203 var4 = field2770;
        synchronized (field2770) {
            field2770.method3594(var3);
        }
        method1066();
    }

    @ObfuscatedName("fs.z(ILek;Lfw;I)V")
    public static void method3010(int arg0, class138 arg1, class172 arg2) {
        byte[] var3 = null;
        class203 var4 = field2770;
        synchronized (field2770) {
            for (class173 var5 = (class173) field2770.method3600(); var5 != null; var5 = (class173) field2770.method3602()) {
                if ((long) arg0 == var5.field3174 && var5.field2763 == arg1 && var5.field2765 == 0) {
                    var3 = var5.field2764;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2758(arg0);
            arg2.method3155(arg1, arg0, var7, true);
        } else {
            arg2.method3155(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("aq.i(I)V")
    public static void method647() {
        while (true) {
            class203 var0 = field2770;
            class173 var1;
            synchronized (field2770) {
                var1 = (class173) field2769.method3598();
            }
            if (var1 == null) {
                return;
            }
            var1.field2766.method3155(var1.field2763, (int) var1.field3174, var1.field2764, false);
        }
    }

    @ObfuscatedName("bh.b(I)V")
    public static void method1066() {
        Object var0 = field2771;
        synchronized (field2771) {
            if (field2772 == 0) {
                Statics.field2087.method2772(new class174(), 5);
            }
            field2772 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class203 var1 = field2770;
                class173 var2;
                synchronized (field2770) {
                    var2 = (class173) field2770.method3600();
                }
                if (var2 == null) {
                    class131.method2672(100L);
                    Object var10 = field2771;
                    synchronized (field2771) {
                        if (field2772 <= 1) {
                            field2772 = 0;
                            field2771.notifyAll();
                            return;
                        }
                        field2772--;
                    }
                } else {
                    if (var2.field2765 == 0) {
                        var2.field2763.method2757((int) var2.field3174, var2.field2764, var2.field2764.length);
                        class203 var4 = field2770;
                        synchronized (field2770) {
                            var2.method3695();
                        }
                    } else if (var2.field2765 == 1) {
                        var2.field2764 = var2.field2763.method2758((int) var2.field3174);
                        class203 var6 = field2770;
                        synchronized (field2770) {
                            field2769.method3594(var2);
                        }
                    }
                    Object var8 = field2771;
                    synchronized (field2771) {
                        if (field2772 <= 1) {
                            field2772 = 0;
                            field2771.notifyAll();
                            return;
                        }
                        field2772 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class152.method2217((String) null, var18);
        }
    }
}
