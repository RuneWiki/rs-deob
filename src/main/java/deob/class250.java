package deob;

@ObfuscatedName("ia")
public class class250 implements Runnable {

    @ObfuscatedName("ia.f")
    public static class272 field3239 = new class272();

    @ObfuscatedName("ia.o")
    public static class272 field3243 = new class272();

    @ObfuscatedName("ia.u")
    public static int field3240 = 0;

    @ObfuscatedName("ia.p")
    public static Object field3241 = new Object();

    @ObfuscatedName("bn.f(I[BLlp;I)V")
    public static void method675(int arg0, byte[] arg1, class332 arg2) {
        class249 var3 = new class249();
        var3.field3236 = 0;
        var3.field3941 = (long) arg0;
        var3.field3234 = arg1;
        var3.field3235 = arg2;
        class272 var4 = field3239;
        synchronized (field3239) {
            field3239.method4155(var3);
        }
        method2835();
    }

    @ObfuscatedName("e.o(ILlp;Lig;I)V")
    public static void method66(int arg0, class332 arg1, class251 arg2) {
        class249 var3 = new class249();
        var3.field3236 = 1;
        var3.field3941 = (long) arg0;
        var3.field3235 = arg1;
        var3.field3237 = arg2;
        class272 var4 = field3239;
        synchronized (field3239) {
            field3239.method4155(var3);
        }
        method2835();
    }

    @ObfuscatedName("fk.u(I)V")
    public static void method2835() {
        Object var0 = field3241;
        synchronized (field3241) {
            if (field3240 == 0) {
                Statics.field3238 = new Thread(new class250());
                Statics.field3238.setDaemon(true);
                Statics.field3238.start();
                Statics.field3238.setPriority(5);
            }
            field3240 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class272 var1 = field3239;
                class249 var2;
                synchronized (field3239) {
                    var2 = (class249) field3239.method4160();
                }
                if (var2 == null) {
                    class380.method4072(100L);
                    Object var10 = field3241;
                    synchronized (field3241) {
                        if (field3240 <= 1) {
                            field3240 = 0;
                            field3241.notifyAll();
                            return;
                        }
                        field3240--;
                    }
                } else {
                    if (var2.field3236 == 0) {
                        var2.field3235.method5273((int) var2.field3941, var2.field3234, var2.field3234.length);
                        class272 var4 = field3239;
                        synchronized (field3239) {
                            var2.method5354();
                        }
                    } else if (var2.field3236 == 1) {
                        var2.field3234 = var2.field3235.method5272((int) var2.field3941);
                        class272 var6 = field3239;
                        synchronized (field3239) {
                            field3243.method4155(var2);
                        }
                    }
                    Object var8 = field3241;
                    synchronized (field3241) {
                        if (field3240 <= 1) {
                            field3240 = 0;
                            field3241.notifyAll();
                            return;
                        }
                        field3240 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class405.method3718((String) null, var18);
        }
    }
}
