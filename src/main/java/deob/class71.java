package deob;

@ObfuscatedName("fd")
public class class71 implements Runnable {

    @ObfuscatedName("fd.o")
    public static int field672 = 0;

    @ObfuscatedName("fd.j")
    public static class13 field674 = new class13();

    @ObfuscatedName("fd.t")
    public static Object field673 = new Object();

    @ObfuscatedName("fd.p")
    public static class13 field675 = new class13();

    public void run() {
        try {
            while (true) {
                class13 var1 = field674;
                class59 var2;
                synchronized (field674) {
                    var2 = (class59) field674.method253();
                }
                if (var2 == null) {
                    class30.method1166(100L);
                    Object var10 = field673;
                    synchronized (field673) {
                        if (field672 <= 1) {
                            field672 = 0;
                            field673.notifyAll();
                            return;
                        }
                        field672--;
                    }
                } else {
                    if (var2.field508 == 0) {
                        var2.field503.method2008((int) var2.field11, var2.field504, var2.field504.length);
                        class13 var4 = field674;
                        synchronized (field674) {
                            var2.method44();
                        }
                    } else if (var2.field508 == 1) {
                        var2.field504 = var2.field503.method2015((int) var2.field11);
                        class13 var6 = field674;
                        synchronized (field674) {
                            field675.method248(var2);
                        }
                    }
                    Object var8 = field673;
                    synchronized (field673) {
                        if (field672 <= 1) {
                            field672 = 0;
                            field673.notifyAll();
                            return;
                        }
                        field672 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class156.method2297((String) null, var18);
        }
    }

    @ObfuscatedName("eb.h(ILbj;Len;I)V")
    public static void method590(int arg0, class121 arg1, class97 arg2) {
        byte[] var3 = null;
        class13 var4 = field674;
        synchronized (field674) {
            for (class59 var5 = (class59) field674.method253(); var5 != null; var5 = (class59) field674.method255()) {
                if ((long) arg0 == var5.field11 && var5.field503 == arg1 && var5.field508 == 0) {
                    var3 = var5.field504;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2015(arg0);
            arg2.method1421(arg1, arg0, var7, true);
        } else {
            arg2.method1421(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ez.t(ILbj;Len;I)V")
    public static void method882(int arg0, class121 arg1, class97 arg2) {
        class59 var3 = new class59();
        var3.field508 = 1;
        var3.field11 = (long) arg0;
        var3.field503 = arg1;
        var3.field506 = arg2;
        class13 var4 = field674;
        synchronized (field674) {
            field674.method248(var3);
        }
        method2364();
    }

    @ObfuscatedName("bz.o(I[BLbj;I)V")
    public static void method1883(int arg0, byte[] arg1, class121 arg2) {
        class59 var3 = new class59();
        var3.field508 = 0;
        var3.field11 = (long) arg0;
        var3.field504 = arg1;
        var3.field503 = arg2;
        class13 var4 = field674;
        synchronized (field674) {
            field674.method248(var3);
        }
        method2364();
    }

    @ObfuscatedName("bz.r(I)V")
    public static void method1884() {
        while (true) {
            class13 var0 = field674;
            class59 var1;
            synchronized (field674) {
                var1 = (class59) field675.method272();
            }
            if (var1 == null) {
                return;
            }
            var1.field506.method1421(var1.field503, (int) var1.field11, var1.field504, false);
        }
    }

    @ObfuscatedName("cv.n(I)V")
    public static void method2364() {
        Object var0 = field673;
        synchronized (field673) {
            if (field672 == 0) {
                Statics.field2009.method1905(new class71(), 5);
            }
            field672 = 600;
        }
    }
}
