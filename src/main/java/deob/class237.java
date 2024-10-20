package deob;

@ObfuscatedName("id")
public class class237 implements Runnable {

    @ObfuscatedName("id.n")
    public static class194 field3234 = new class194();

    @ObfuscatedName("id.p")
    public static class194 field3235 = new class194();

    @ObfuscatedName("id.i")
    public static int field3236 = 0;

    @ObfuscatedName("id.j")
    public static Object field3237 = new Object();

    @ObfuscatedName("hs.n(ILfu;Lit;B)V")
    public static void method3814(int arg0, class161 arg1, class238 arg2) {
        byte[] var3 = null;
        class194 var4 = field3234;
        synchronized (field3234) {
            for (class234 var5 = (class234) field3234.method3372(); var5 != null; var5 = (class234) field3234.method3358()) {
                if ((long) arg0 == var5.field2483 && var5.field3202 == arg1 && var5.field3205 == 0) {
                    var3 = var5.field3201;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2774(arg0);
            arg2.method3941(arg1, arg0, var7, true);
        } else {
            arg2.method3941(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("l.p(I)V")
    public static void method157() {
        Object var0 = field3237;
        synchronized (field3237) {
            if (field3236 == 0) {
                Statics.field2849 = new Thread(new class237());
                Statics.field2849.setDaemon(true);
                Statics.field2849.start();
                Statics.field2849.setPriority(5);
            }
            field3236 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class194 var1 = field3234;
                class234 var2;
                synchronized (field3234) {
                    var2 = (class234) field3234.method3372();
                }
                if (var2 == null) {
                    class182.method1713(100L);
                    Object var10 = field3237;
                    synchronized (field3237) {
                        if (field3236 <= 1) {
                            field3236 = 0;
                            field3237.notifyAll();
                            return;
                        }
                        field3236--;
                    }
                } else {
                    if (var2.field3205 == 0) {
                        var2.field3202.method2775((int) var2.field2483, var2.field3201, var2.field3201.length);
                        class194 var4 = field3234;
                        synchronized (field3234) {
                            var2.method3347();
                        }
                    } else if (var2.field3205 == 1) {
                        var2.field3201 = var2.field3202.method2774((int) var2.field2483);
                        class194 var6 = field3234;
                        synchronized (field3234) {
                            field3235.method3384(var2);
                        }
                    }
                    Object var8 = field3237;
                    synchronized (field3237) {
                        if (field3236 <= 1) {
                            field3236 = 0;
                            field3237.notifyAll();
                            return;
                        }
                        field3236 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method1609((String) null, var18);
        }
    }

    @ObfuscatedName("as.i(I)V")
    public static void method461() {
        Object var0 = field3237;
        synchronized (field3237) {
            if (field3236 != 0) {
                field3236 = 1;
                try {
                    field3237.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
