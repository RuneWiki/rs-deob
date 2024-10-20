package deob;

@ObfuscatedName("nl")
public class class357 implements Runnable {

    @ObfuscatedName("nl.aw")
    public static final class379 field4245 = new class379();

    @ObfuscatedName("nl.ay")
    public static class379 field4246 = new class379();

    @ObfuscatedName("nl.ar")
    public static int field4247 = 0;

    @ObfuscatedName("nl.am")
    public static boolean field4248 = false;

    @ObfuscatedName("nl.as")
    public static Object field4249 = new Object();

    @ObfuscatedName("fn.aw(ILrg;Lny;B)V")
    public static void method2980(int arg0, class444 arg1, class358 arg2) {
        class356 var3 = new class356();
        var3.field4242 = 1;
        var3.field4819 = (long) arg0;
        var3.field4238 = arg1;
        var3.field4239 = arg2;
        class379 var4 = field4245;
        synchronized (field4245) {
            field4245.method6367(var3);
        }
        method5162();
    }

    @ObfuscatedName("rh.ay(S)V")
    public static void method7398() {
        while (true) {
            class379 var0 = field4245;
            class356 var1;
            synchronized (field4245) {
                var1 = (class356) field4246.method6370();
            }
            if (var1 == null) {
                return;
            }
            var1.field4239.method6071(var1.field4238, (int) var1.field4819, var1.field4237, false);
        }
    }

    @ObfuscatedName("lu.ar(I)V")
    public static void method5162() {
        Object var0 = field4249;
        synchronized (field4249) {
            if (field4247 == 0) {
                Statics.field4255 = new Thread(new class357());
                Statics.field4255.setDaemon(true);
                Statics.field4255.start();
                Statics.field4255.setPriority(5);
            }
            field4247 = 600;
            field4248 = false;
        }
    }

    public void run() {
        try {
            while (true) {
                class379 var1 = field4245;
                class356 var2;
                synchronized (field4245) {
                    var2 = (class356) field4245.method6393();
                }
                if (var2 == null) {
                    class304.method173(100L);
                    Object var10 = field4249;
                    synchronized (field4249) {
                        if ((field4248 || field4247 <= 1) && field4245.method6376()) {
                            field4247 = 0;
                            field4249.notifyAll();
                            return;
                        }
                        field4247--;
                    }
                } else {
                    if (var2.field4242 == 0) {
                        var2.field4238.method7413((int) var2.field4819, var2.field4237, var2.field4237.length);
                        class379 var4 = field4245;
                        synchronized (field4245) {
                            var2.method7662();
                        }
                    } else if (var2.field4242 == 1) {
                        var2.field4237 = var2.field4238.method7405((int) var2.field4819);
                        class379 var6 = field4245;
                        synchronized (field4245) {
                            field4246.method6367(var2);
                        }
                    }
                    Object var8 = field4249;
                    synchronized (field4249) {
                        if ((field4248 || field4247 <= 1) && field4245.method6376()) {
                            field4247 = 0;
                            field4249.notifyAll();
                            return;
                        }
                        field4247 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class541.method5458((String) null, var18);
        }
    }

    @ObfuscatedName("nn.am(I)V")
    public static void method6046() {
        Object var0 = field4249;
        synchronized (field4249) {
            if (field4247 != 0) {
                field4247 = 1;
                field4248 = true;
                try {
                    field4249.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
