package deob;

@ObfuscatedName("ge")
public class class184 implements Runnable {

    @ObfuscatedName("ge.u")
    public static class129 field2706 = new class129();

    @ObfuscatedName("ge.x")
    public static class129 field2704 = new class129();

    @ObfuscatedName("ge.i")
    public static int field2705 = 0;

    @ObfuscatedName("ge.a")
    public static Object field2707 = new Object();

    @ObfuscatedName("p.i(ILdw;Lgy;B)V")
    public static void method183(int arg0, class117 arg1, class185 arg2) {
        class181 var3 = new class181();
        var3.field2674 = 1;
        var3.field1867 = (long) arg0;
        var3.field2671 = arg1;
        var3.field2672 = arg2;
        class129 var4 = field2706;
        synchronized (field2706) {
            field2706.method2245(var3);
        }
        method3035();
    }

    @ObfuscatedName("x.a(ILdw;Lgy;B)V")
    public static void method12(int arg0, class117 arg1, class185 arg2) {
        byte[] var3 = null;
        class129 var4 = field2706;
        synchronized (field2706) {
            for (class181 var5 = (class181) field2706.method2242(); var5 != null; var5 = (class181) field2706.method2244()) {
                if ((long) arg0 == var5.field1867 && var5.field2671 == arg1 && var5.field2674 == 0) {
                    var3 = var5.field2676;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2082(arg0);
            arg2.method3159(arg1, arg0, var7, true);
        } else {
            arg2.method3159(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("l.c(B)V")
    public static void method111() {
        while (true) {
            class129 var0 = field2706;
            class181 var1;
            synchronized (field2706) {
                var1 = (class181) field2704.method2240();
            }
            if (var1 == null) {
                return;
            }
            var1.field2672.method3159(var1.field2671, (int) var1.field1867, var1.field2676, false);
        }
    }

    @ObfuscatedName("fm.g(I)V")
    public static void method3035() {
        Object var0 = field2707;
        synchronized (field2707) {
            if (field2705 == 0) {
                Statics.field882.method1815(new class184(), 5);
            }
            field2705 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2706;
                class181 var2;
                synchronized (field2706) {
                    var2 = (class181) field2706.method2242();
                }
                if (var2 == null) {
                    class162.method1528(100L);
                    Object var10 = field2707;
                    synchronized (field2707) {
                        if (field2705 <= 1) {
                            field2705 = 0;
                            field2707.notifyAll();
                            return;
                        }
                        field2705--;
                    }
                } else {
                    if (var2.field2674 == 0) {
                        var2.field2671.method2079((int) var2.field1867, var2.field2676, var2.field2676.length);
                        class129 var4 = field2706;
                        synchronized (field2706) {
                            var2.method2228();
                        }
                    } else if (var2.field2674 == 1) {
                        var2.field2676 = var2.field2671.method2082((int) var2.field1867);
                        class129 var6 = field2706;
                        synchronized (field2706) {
                            field2704.method2245(var2);
                        }
                    }
                    Object var8 = field2707;
                    synchronized (field2707) {
                        if (field2705 <= 1) {
                            field2705 = 0;
                            field2707.notifyAll();
                            return;
                        }
                        field2705 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method3043((String) null, var18);
        }
    }

    @ObfuscatedName("fz.z(I)V")
    public static void method3055() {
        Object var0 = field2707;
        synchronized (field2707) {
            if (field2705 != 0) {
                field2705 = 1;
                try {
                    field2707.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
