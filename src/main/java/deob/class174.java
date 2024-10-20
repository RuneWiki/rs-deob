package deob;

@ObfuscatedName("fz")
public class class174 implements Runnable {

    @ObfuscatedName("fz.l")
    public static class203 field2766 = new class203();

    @ObfuscatedName("fz.g")
    public static class203 field2762 = new class203();

    @ObfuscatedName("fz.r")
    public static int field2768 = 0;

    @ObfuscatedName("fz.e")
    public static Object field2764 = new Object();

    @ObfuscatedName("de.r(ILel;Lfq;B)V")
    public static void method2417(int arg0, class138 arg1, class172 arg2) {
        byte[] var3 = null;
        class203 var4 = field2766;
        synchronized (field2766) {
            for (class173 var5 = (class173) field2766.method3728(); var5 != null; var5 = (class173) field2766.method3718()) {
                if ((long) arg0 == var5.field3176 && var5.field2760 == arg1 && var5.field2758 == 0) {
                    var3 = var5.field2756;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2867(arg0);
            arg2.method3282(arg1, arg0, var7, true);
        } else {
            arg2.method3282(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("bq.e(B)V")
    public static void method1122() {
        while (true) {
            class203 var0 = field2766;
            class173 var1;
            synchronized (field2766) {
                var1 = (class173) field2762.method3714();
            }
            if (var1 == null) {
                return;
            }
            var1.field2759.method3282(var1.field2760, (int) var1.field3176, var1.field2756, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class203 var1 = field2766;
                class173 var2;
                synchronized (field2766) {
                    var2 = (class173) field2766.method3728();
                }
                if (var2 == null) {
                    class131.method587(100L);
                    Object var10 = field2764;
                    synchronized (field2764) {
                        if (field2768 <= 1) {
                            field2768 = 0;
                            field2764.notifyAll();
                            return;
                        }
                        field2768--;
                    }
                } else {
                    if (var2.field2758 == 0) {
                        var2.field2760.method2855((int) var2.field3176, var2.field2756, var2.field2756.length);
                        class203 var4 = field2766;
                        synchronized (field2766) {
                            var2.method3815();
                        }
                    } else if (var2.field2758 == 1) {
                        var2.field2756 = var2.field2760.method2867((int) var2.field3176);
                        class203 var6 = field2766;
                        synchronized (field2766) {
                            field2762.method3711(var2);
                        }
                    }
                    Object var8 = field2764;
                    synchronized (field2764) {
                        if (field2768 <= 1) {
                            field2768 = 0;
                            field2764.notifyAll();
                            return;
                        }
                        field2768 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class152.method169((String) null, var18);
        }
    }
}
