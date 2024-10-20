package deob;

@ObfuscatedName("id")
public class class256 implements Runnable {

    @ObfuscatedName("id.a")
    public static class213 field3261 = new class213();

    @ObfuscatedName("id.s")
    public static class213 field3259 = new class213();

    @ObfuscatedName("id.g")
    public static int field3260 = 0;

    @ObfuscatedName("id.x")
    public static Object field3262 = new Object();

    @ObfuscatedName("e.a(I[BLfb;B)V")
    public static void method131(int arg0, byte[] arg1, class170 arg2) {
        class253 var3 = new class253();
        var3.field3229 = 0;
        var3.field2512 = (long) arg0;
        var3.field3232 = arg1;
        var3.field3231 = arg2;
        class213 var4 = field3261;
        synchronized (field3261) {
            field3261.method3966(var3);
        }
        Object var6 = field3262;
        synchronized (field3262) {
            if (field3260 == 0) {
                Statics.field3263 = new Thread(new class256());
                Statics.field3263.setDaemon(true);
                Statics.field3263.start();
                Statics.field3263.setPriority(5);
            }
            field3260 = 600;
        }
    }

    @ObfuscatedName("ih.s(ILfb;Lin;I)V")
    public static void method4405(int arg0, class170 arg1, class257 arg2) {
        class253 var3 = new class253();
        var3.field3229 = 1;
        var3.field2512 = (long) arg0;
        var3.field3231 = arg1;
        var3.field3230 = arg2;
        class213 var4 = field3261;
        synchronized (field3261) {
            field3261.method3966(var3);
        }
        Object var6 = field3262;
        synchronized (field3262) {
            if (field3260 == 0) {
                Statics.field3263 = new Thread(new class256());
                Statics.field3263.setDaemon(true);
                Statics.field3263.start();
                Statics.field3263.setPriority(5);
            }
            field3260 = 600;
        }
    }

    @ObfuscatedName("bn.g(I)V")
    public static void method1072() {
        while (true) {
            class213 var0 = field3261;
            class253 var1;
            synchronized (field3261) {
                var1 = (class253) field3259.method3969();
            }
            if (var1 == null) {
                return;
            }
            var1.field3230.method4528(var1.field3231, (int) var1.field2512, var1.field3232, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class213 var1 = field3261;
                class253 var2;
                synchronized (field3261) {
                    var2 = (class253) field3261.method3990();
                }
                if (var2 == null) {
                    class199.method3774(100L);
                    Object var10 = field3262;
                    synchronized (field3262) {
                        if (field3260 <= 1) {
                            field3260 = 0;
                            field3262.notifyAll();
                            return;
                        }
                        field3260--;
                    }
                } else {
                    if (var2.field3229 == 0) {
                        var2.field3231.method3292((int) var2.field2512, var2.field3232, var2.field3232.length);
                        class213 var4 = field3261;
                        synchronized (field3261) {
                            var2.method3960();
                        }
                    } else if (var2.field3229 == 1) {
                        var2.field3232 = var2.field3231.method3291((int) var2.field2512);
                        class213 var6 = field3261;
                        synchronized (field3261) {
                            field3259.method3966(var2);
                        }
                    }
                    Object var8 = field3262;
                    synchronized (field3262) {
                        if (field3260 <= 1) {
                            field3260 = 0;
                            field3262.notifyAll();
                            return;
                        }
                        field3260 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class160.method2786((String) null, var18);
        }
    }

    @ObfuscatedName("jc.x(I)V")
    public static void method4952() {
        Object var0 = field3262;
        synchronized (field3262) {
            if (field3260 != 0) {
                field3260 = 1;
                try {
                    field3262.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
