package deob;

@ObfuscatedName("fx")
public class class170 implements Runnable {

    @ObfuscatedName("fx.o")
    public static class199 field2716 = new class199();

    @ObfuscatedName("fx.e")
    public static class199 field2720 = new class199();

    @ObfuscatedName("fx.u")
    public static int field2718 = 0;

    @ObfuscatedName("fx.b")
    public static Object field2713 = new Object();

    @ObfuscatedName("ez.b(ILeb;Lfr;B)V")
    public static void method2956(int arg0, class134 arg1, class168 arg2) {
        class169 var3 = new class169();
        var3.field2706 = 1;
        var3.field3113 = (long) arg0;
        var3.field2707 = arg1;
        var3.field2705 = arg2;
        class199 var4 = field2716;
        synchronized (field2716) {
            field2716.method3589(var3);
        }
        method2589();
    }

    @ObfuscatedName("dw.p(I)V")
    public static void method2589() {
        Object var0 = field2713;
        synchronized (field2713) {
            if (field2718 == 0) {
                Statics.field2024.method2710(new class170(), 5);
            }
            field2718 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2716;
                class169 var2;
                synchronized (field2716) {
                    var2 = (class169) field2716.method3581();
                }
                if (var2 == null) {
                    class127.method2614(100L);
                    Object var10 = field2713;
                    synchronized (field2713) {
                        if (field2718 <= 1) {
                            field2718 = 0;
                            field2713.notifyAll();
                            return;
                        }
                        field2718--;
                    }
                } else {
                    if (var2.field2706 == 0) {
                        var2.field2707.method2703((int) var2.field3113, var2.field2708, var2.field2708.length);
                        class199 var4 = field2716;
                        synchronized (field2716) {
                            var2.method3670();
                        }
                    } else if (var2.field2706 == 1) {
                        var2.field2708 = var2.field2707.method2701((int) var2.field3113);
                        class199 var6 = field2716;
                        synchronized (field2716) {
                            field2720.method3589(var2);
                        }
                    }
                    Object var8 = field2713;
                    synchronized (field2713) {
                        if (field2718 <= 1) {
                            field2718 = 0;
                            field2713.notifyAll();
                            return;
                        }
                        field2718 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method2262((String) null, var18);
        }
    }

    @ObfuscatedName("fd.s(B)V")
    public static void method3019() {
        Object var0 = field2713;
        synchronized (field2713) {
            if (field2718 != 0) {
                field2718 = 1;
                try {
                    field2713.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
