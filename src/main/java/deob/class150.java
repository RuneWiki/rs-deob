package deob;

@ObfuscatedName("ej")
public class class150 implements Runnable {

    @ObfuscatedName("ej.g")
    public static class178 field2514 = new class178();

    @ObfuscatedName("ej.i")
    public static class178 field2513 = new class178();

    @ObfuscatedName("ej.k")
    public static int field2515 = 0;

    @ObfuscatedName("ej.e")
    public static Object field2516 = new Object();

    @ObfuscatedName("y.k(I[BLdt;I)V")
    public static void method168(int arg0, byte[] arg1, class121 arg2) {
        class149 var3 = new class149();
        var3.field2506 = 0;
        var3.field2885 = (long) arg0;
        var3.field2509 = arg1;
        var3.field2508 = arg2;
        class178 var4 = field2514;
        synchronized (field2514) {
            field2514.method3202(var3);
        }
        method39();
    }

    @ObfuscatedName("cb.e(ILdt;Leb;B)V")
    public static void method1936(int arg0, class121 arg1, class148 arg2) {
        class149 var3 = new class149();
        var3.field2506 = 1;
        var3.field2885 = (long) arg0;
        var3.field2508 = arg1;
        var3.field2512 = arg2;
        class178 var4 = field2514;
        synchronized (field2514) {
            field2514.method3202(var3);
        }
        method39();
    }

    @ObfuscatedName("ae.w(ILdt;Leb;S)V")
    public static void method620(int arg0, class121 arg1, class148 arg2) {
        byte[] var3 = null;
        class178 var4 = field2514;
        synchronized (field2514) {
            for (class149 var5 = (class149) field2514.method3200(); var5 != null; var5 = (class149) field2514.method3209()) {
                if ((long) arg0 == var5.field2885 && var5.field2508 == arg1 && var5.field2506 == 0) {
                    var3 = var5.field2509;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2439(arg0);
            arg2.method2768(arg1, arg0, var7, true);
        } else {
            arg2.method2768(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("f.m(I)V")
    public static void method480() {
        while (true) {
            class178 var0 = field2514;
            class149 var1;
            synchronized (field2514) {
                var1 = (class149) field2513.method3219();
            }
            if (var1 == null) {
                return;
            }
            var1.field2512.method2768(var1.field2508, (int) var1.field2885, var1.field2509, false);
        }
    }

    @ObfuscatedName("w.u(S)V")
    public static void method39() {
        Object var0 = field2516;
        synchronized (field2516) {
            if (field2515 == 0) {
                Statics.field1064.method2461(new class150(), 5);
            }
            field2515 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class178 var1 = field2514;
                class149 var2;
                synchronized (field2514) {
                    var2 = (class149) field2514.method3200();
                }
                if (var2 == null) {
                    class114.method1935(100L);
                    Object var10 = field2516;
                    synchronized (field2516) {
                        if (field2515 <= 1) {
                            field2515 = 0;
                            field2516.notifyAll();
                            return;
                        }
                        field2515--;
                    }
                } else {
                    if (var2.field2506 == 0) {
                        var2.field2508.method2438((int) var2.field2885, var2.field2509, var2.field2509.length);
                        class178 var4 = field2514;
                        synchronized (field2514) {
                            var2.method3304();
                        }
                    } else if (var2.field2506 == 1) {
                        var2.field2509 = var2.field2508.method2439((int) var2.field2885);
                        class178 var6 = field2514;
                        synchronized (field2514) {
                            field2513.method3202(var2);
                        }
                    }
                    Object var8 = field2516;
                    synchronized (field2516) {
                        if (field2515 <= 1) {
                            field2515 = 0;
                            field2516.notifyAll();
                            return;
                        }
                        field2515 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class135.method33((String) null, var18);
        }
    }

    @ObfuscatedName("x.j(B)V")
    public static void method152() {
        Object var0 = field2516;
        synchronized (field2516) {
            if (field2515 != 0) {
                field2515 = 1;
                try {
                    field2516.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
