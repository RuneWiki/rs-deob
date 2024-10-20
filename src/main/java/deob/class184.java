package deob;

@ObfuscatedName("gl")
public class class184 implements Runnable {

    @ObfuscatedName("gl.s")
    public static class129 field2734 = new class129();

    @ObfuscatedName("gl.c")
    public static class129 field2731 = new class129();

    @ObfuscatedName("gl.f")
    public static int field2732 = 0;

    @ObfuscatedName("gl.h")
    public static Object field2733 = new Object();

    @ObfuscatedName("cq.k(I[BLdw;I)V")
    public static void method1753(int arg0, byte[] arg1, class117 arg2) {
        class181 var3 = new class181();
        var3.field2705 = 0;
        var3.field1889 = (long) arg0;
        var3.field2702 = arg1;
        var3.field2703 = arg2;
        class129 var4 = field2734;
        synchronized (field2734) {
            field2734.method2190(var3);
        }
        Object var6 = field2733;
        synchronized (field2733) {
            if (field2732 == 0) {
                Statics.field253.method1806(new class184(), 5);
            }
            field2732 = 600;
        }
    }

    @ObfuscatedName("h.u(ILdw;Lgo;I)V")
    public static void method35(int arg0, class117 arg1, class185 arg2) {
        byte[] var3 = null;
        class129 var4 = field2734;
        synchronized (field2734) {
            for (class181 var5 = (class181) field2734.method2187(); var5 != null; var5 = (class181) field2734.method2203()) {
                if ((long) arg0 == var5.field1889 && var5.field2703 == arg1 && var5.field2705 == 0) {
                    var3 = var5.field2702;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2032(arg0);
            arg2.method3077(arg1, arg0, var7, true);
        } else {
            arg2.method3077(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("gp.x(I)V")
    public static void method3028() {
        Object var0 = field2733;
        synchronized (field2733) {
            if (field2732 == 0) {
                Statics.field253.method1806(new class184(), 5);
            }
            field2732 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2734;
                class181 var2;
                synchronized (field2734) {
                    var2 = (class181) field2734.method2187();
                }
                if (var2 == null) {
                    class162.method746(100L);
                    Object var10 = field2733;
                    synchronized (field2733) {
                        if (field2732 <= 1) {
                            field2732 = 0;
                            field2733.notifyAll();
                            return;
                        }
                        field2732--;
                    }
                } else {
                    if (var2.field2705 == 0) {
                        var2.field2703.method2033((int) var2.field1889, var2.field2702, var2.field2702.length);
                        class129 var4 = field2734;
                        synchronized (field2734) {
                            var2.method2179();
                        }
                    } else if (var2.field2705 == 1) {
                        var2.field2702 = var2.field2703.method2032((int) var2.field1889);
                        class129 var6 = field2734;
                        synchronized (field2734) {
                            field2731.method2190(var2);
                        }
                    }
                    Object var8 = field2733;
                    synchronized (field2733) {
                        if (field2732 <= 1) {
                            field2732 = 0;
                            field2733.notifyAll();
                            return;
                        }
                        field2732 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method690((String) null, var18);
        }
    }
}
