package deob;

@ObfuscatedName("gc")
public class class184 implements Runnable {

    @ObfuscatedName("gc.o")
    public static class129 field2734 = new class129();

    @ObfuscatedName("gc.m")
    public static class129 field2735 = new class129();

    @ObfuscatedName("gc.b")
    public static int field2741 = 0;

    @ObfuscatedName("gc.g")
    public static Object field2737 = new Object();

    @ObfuscatedName("as.b(I[BLdz;B)V")
    public static void method876(int arg0, byte[] arg1, class117 arg2) {
        class181 var3 = new class181();
        var3.field2703 = 0;
        var3.field1894 = (long) arg0;
        var3.field2704 = arg1;
        var3.field2705 = arg2;
        class129 var4 = field2734;
        synchronized (field2734) {
            field2734.method2213(var3);
        }
        Object var6 = field2737;
        synchronized (field2737) {
            if (field2741 == 0) {
                Statics.field1347.method1833(new class184(), 5);
            }
            field2741 = 600;
        }
    }

    @ObfuscatedName("dz.g(ILdz;Lgk;I)V")
    public static void method2050(int arg0, class117 arg1, class185 arg2) {
        byte[] var3 = null;
        class129 var4 = field2734;
        synchronized (field2734) {
            for (class181 var5 = (class181) field2734.method2201(); var5 != null; var5 = (class181) field2734.method2203()) {
                if ((long) arg0 == var5.field1894 && var5.field2705 == arg1 && var5.field2703 == 0) {
                    var3 = var5.field2704;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2040(arg0);
            arg2.method3105(arg1, arg0, var7, true);
        } else {
            arg2.method3105(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("d.l(I)V")
    public static void method188() {
        Object var0 = field2737;
        synchronized (field2737) {
            if (field2741 == 0) {
                Statics.field1347.method1833(new class184(), 5);
            }
            field2741 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2734;
                class181 var2;
                synchronized (field2734) {
                    var2 = (class181) field2734.method2201();
                }
                if (var2 == null) {
                    class162.method238(100L);
                    Object var10 = field2737;
                    synchronized (field2737) {
                        if (field2741 <= 1) {
                            field2741 = 0;
                            field2737.notifyAll();
                            return;
                        }
                        field2741--;
                    }
                } else {
                    if (var2.field2703 == 0) {
                        var2.field2705.method2041((int) var2.field1894, var2.field2704, var2.field2704.length);
                        class129 var4 = field2734;
                        synchronized (field2734) {
                            var2.method2189();
                        }
                    } else if (var2.field2703 == 1) {
                        var2.field2704 = var2.field2705.method2040((int) var2.field1894);
                        class129 var6 = field2734;
                        synchronized (field2734) {
                            field2735.method2213(var2);
                        }
                    }
                    Object var8 = field2737;
                    synchronized (field2737) {
                        if (field2741 <= 1) {
                            field2741 = 0;
                            field2737.notifyAll();
                            return;
                        }
                        field2741 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method1762((String) null, var18);
        }
    }
}
