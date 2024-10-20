package deob;

@ObfuscatedName("ob")
public class class371 implements Runnable {

    @ObfuscatedName("ob.ac")
    public static final class393 field4296 = new class393();

    @ObfuscatedName("ob.al")
    public static class393 field4294 = new class393();

    @ObfuscatedName("ob.ak")
    public static int field4295 = 0;

    @ObfuscatedName("ob.ax")
    public static boolean field4301 = false;

    @ObfuscatedName("ob.ao")
    public static Object field4293 = new Object();

    @ObfuscatedName("lh.ac(I[BLrw;B)V")
    public static void method5197(int arg0, byte[] arg1, class458 arg2) {
        class370 var3 = new class370();
        var3.field4288 = 0;
        var3.field4857 = (long) arg0;
        var3.field4291 = arg1;
        var3.field4289 = arg2;
        class393 var4 = field4296;
        synchronized (field4296) {
            field4296.method6526(var3);
        }
        method2212();
    }

    @ObfuscatedName("dm.al(ILrw;Lok;I)V")
    public static void method2102(int arg0, class458 arg1, class372 arg2) {
        class370 var3 = new class370();
        var3.field4288 = 1;
        var3.field4857 = (long) arg0;
        var3.field4289 = arg1;
        var3.field4290 = arg2;
        class393 var4 = field4296;
        synchronized (field4296) {
            field4296.method6526(var3);
        }
        method2212();
    }

    @ObfuscatedName("nu.ak(B)V")
    public static void method6173() {
        while (true) {
            class393 var0 = field4296;
            class370 var1;
            synchronized (field4296) {
                var1 = (class370) field4294.method6531();
            }
            if (var1 == null) {
                return;
            }
            var1.field4290.method6241(var1.field4289, (int) var1.field4857, var1.field4291, false);
        }
    }

    @ObfuscatedName("df.ax(I)V")
    public static void method2212() {
        Object var0 = field4293;
        synchronized (field4293) {
            if (field4295 == 0) {
                Statics.field1474 = new Thread(new class371());
                Statics.field1474.setDaemon(true);
                Statics.field1474.start();
                Statics.field1474.setPriority(5);
            }
            field4295 = 600;
            field4301 = false;
        }
    }

    public void run() {
        try {
            while (true) {
                class393 var1 = field4296;
                class370 var2;
                synchronized (field4296) {
                    var2 = (class370) field4296.method6532();
                }
                if (var2 == null) {
                    class317.method2610(100L);
                    Object var10 = field4293;
                    synchronized (field4293) {
                        if ((field4301 || field4295 <= 1) && field4296.method6559()) {
                            field4295 = 0;
                            field4293.notifyAll();
                            return;
                        }
                        field4295--;
                    }
                } else {
                    if (var2.field4288 == 0) {
                        var2.field4289.method7493((int) var2.field4857, var2.field4291, var2.field4291.length);
                        class393 var4 = field4296;
                        synchronized (field4296) {
                            var2.method7776();
                        }
                    } else if (var2.field4288 == 1) {
                        var2.field4291 = var2.field4289.method7492((int) var2.field4857);
                        class393 var6 = field4296;
                        synchronized (field4296) {
                            field4294.method6526(var2);
                        }
                    }
                    Object var8 = field4293;
                    synchronized (field4293) {
                        if ((field4301 || field4295 <= 1) && field4296.method6559()) {
                            field4295 = 0;
                            field4293.notifyAll();
                            return;
                        }
                        field4295 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class556.method3321((String) null, var18);
        }
    }

    @ObfuscatedName("nl.ao(I)V")
    public static void method6171() {
        Object var0 = field4293;
        synchronized (field4293) {
            if (field4295 != 0) {
                field4295 = 1;
                field4301 = true;
                try {
                    field4293.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
