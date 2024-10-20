package deob;

@ObfuscatedName("eh")
public class class152 implements Runnable {

    @ObfuscatedName("eh.l")
    public static class180 field2479 = new class180();

    @ObfuscatedName("eh.y")
    public static class180 field2481 = new class180();

    @ObfuscatedName("eh.g")
    public static int field2480 = 0;

    @ObfuscatedName("eh.j")
    public static Object field2478 = new Object();

    @ObfuscatedName("ez.j(I[BLdc;I)V")
    public static void method2726(int arg0, byte[] arg1, class123 arg2) {
        class151 var3 = new class151();
        var3.field2476 = 0;
        var3.field2886 = (long) arg0;
        var3.field2474 = arg1;
        var3.field2477 = arg2;
        class180 var4 = field2479;
        synchronized (field2479) {
            field2479.method3278(var3);
        }
        method1612();
    }

    @ObfuscatedName("ei.w(ILdc;Lex;I)V")
    public static void method2739(int arg0, class123 arg1, class150 arg2) {
        class151 var3 = new class151();
        var3.field2476 = 1;
        var3.field2886 = (long) arg0;
        var3.field2477 = arg1;
        var3.field2475 = arg2;
        class180 var4 = field2479;
        synchronized (field2479) {
            field2479.method3278(var3);
        }
        method1612();
    }

    @ObfuscatedName("ed.c(ILdc;Lex;B)V")
    public static void method2724(int arg0, class123 arg1, class150 arg2) {
        byte[] var3 = null;
        class180 var4 = field2479;
        synchronized (field2479) {
            for (class151 var5 = (class151) field2479.method3304(); var5 != null; var5 = (class151) field2479.method3297()) {
                if ((long) arg0 == var5.field2886 && var5.field2477 == arg1 && var5.field2476 == 0) {
                    var3 = var5.field2474;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2472(arg0);
            arg2.method2835(arg1, arg0, var7, true);
        } else {
            arg2.method2835(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("dc.x(B)V")
    public static void method2474() {
        while (true) {
            class180 var0 = field2479;
            class151 var1;
            synchronized (field2479) {
                var1 = (class151) field2481.method3280();
            }
            if (var1 == null) {
                return;
            }
            var1.field2475.method2835(var1.field2477, (int) var1.field2886, var1.field2474, false);
        }
    }

    @ObfuscatedName("cc.f(I)V")
    public static void method1612() {
        Object var0 = field2478;
        synchronized (field2478) {
            if (field2480 == 0) {
                Statics.field938.method2497(new class152(), 5);
            }
            field2480 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class180 var1 = field2479;
                class151 var2;
                synchronized (field2479) {
                    var2 = (class151) field2479.method3304();
                }
                if (var2 == null) {
                    class116.method71(100L);
                    Object var10 = field2478;
                    synchronized (field2478) {
                        if (field2480 <= 1) {
                            field2480 = 0;
                            field2478.notifyAll();
                            return;
                        }
                        field2480--;
                    }
                } else {
                    if (var2.field2476 == 0) {
                        var2.field2477.method2473((int) var2.field2886, var2.field2474, var2.field2474.length);
                        class180 var4 = field2479;
                        synchronized (field2479) {
                            var2.method3375();
                        }
                    } else if (var2.field2476 == 1) {
                        var2.field2474 = var2.field2477.method2472((int) var2.field2886);
                        class180 var6 = field2479;
                        synchronized (field2479) {
                            field2481.method3278(var2);
                        }
                    }
                    Object var8 = field2478;
                    synchronized (field2478) {
                        if (field2480 <= 1) {
                            field2480 = 0;
                            field2478.notifyAll();
                            return;
                        }
                        field2480 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class137.method2490((String) null, var18);
        }
    }

    @ObfuscatedName("en.t(I)V")
    public static void method2614() {
        Object var0 = field2478;
        synchronized (field2478) {
            if (field2480 != 0) {
                field2480 = 1;
                try {
                    field2478.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
