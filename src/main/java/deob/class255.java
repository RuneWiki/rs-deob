package deob;

@ObfuscatedName("iw")
public class class255 implements Runnable {

    @ObfuscatedName("iw.n")
    public static class213 field3243 = new class213();

    @ObfuscatedName("iw.h")
    public static class213 field3242 = new class213();

    @ObfuscatedName("iw.l")
    public static int field3244 = 0;

    @ObfuscatedName("iw.g")
    public static Object field3245 = new Object();

    @ObfuscatedName("em.n(I[BLfy;I)V")
    public static void method3068(int arg0, byte[] arg1, class170 arg2) {
        class252 var3 = new class252();
        var3.field3220 = 0;
        var3.field2502 = (long) arg0;
        var3.field3214 = arg1;
        var3.field3215 = arg2;
        class213 var4 = field3243;
        synchronized (field3243) {
            field3243.method3981(var3);
        }
        method2021();
    }

    @ObfuscatedName("kt.h(ILfy;Lit;I)V")
    public static void method5231(int arg0, class170 arg1, class256 arg2) {
        class252 var3 = new class252();
        var3.field3220 = 1;
        var3.field2502 = (long) arg0;
        var3.field3215 = arg1;
        var3.field3213 = arg2;
        class213 var4 = field3243;
        synchronized (field3243) {
            field3243.method3981(var3);
        }
        method2021();
    }

    @ObfuscatedName("ad.l(ILfy;Lit;B)V")
    public static void method482(int arg0, class170 arg1, class256 arg2) {
        byte[] var3 = null;
        class213 var4 = field3243;
        synchronized (field3243) {
            for (class252 var5 = (class252) field3243.method3986(); var5 != null; var5 = (class252) field3243.method3988()) {
                if ((long) arg0 == var5.field2502 && var5.field3215 == arg1 && var5.field3220 == 0) {
                    var3 = var5.field3214;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method3313(arg0);
            arg2.method4564(arg1, arg0, var7, true);
        } else {
            arg2.method4564(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("c.g(I)V")
    public static void method52() {
        while (true) {
            class213 var0 = field3243;
            class252 var1;
            synchronized (field3243) {
                var1 = (class252) field3242.method3984();
            }
            if (var1 == null) {
                return;
            }
            var1.field3213.method4564(var1.field3215, (int) var1.field2502, var1.field3214, false);
        }
    }

    @ObfuscatedName("cd.b(I)V")
    public static void method2021() {
        Object var0 = field3245;
        synchronized (field3245) {
            if (field3244 == 0) {
                Statics.field590 = new Thread(new class255());
                Statics.field590.setDaemon(true);
                Statics.field590.start();
                Statics.field590.setPriority(5);
            }
            field3244 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class213 var1 = field3243;
                class252 var2;
                synchronized (field3243) {
                    var2 = (class252) field3243.method3986();
                }
                if (var2 == null) {
                    class199.method3065(100L);
                    Object var10 = field3245;
                    synchronized (field3245) {
                        if (field3244 <= 1) {
                            field3244 = 0;
                            field3245.notifyAll();
                            return;
                        }
                        field3244--;
                    }
                } else {
                    if (var2.field3220 == 0) {
                        var2.field3215.method3314((int) var2.field2502, var2.field3214, var2.field3214.length);
                        class213 var4 = field3243;
                        synchronized (field3243) {
                            var2.method3973();
                        }
                    } else if (var2.field3220 == 1) {
                        var2.field3214 = var2.field3215.method3313((int) var2.field2502);
                        class213 var6 = field3243;
                        synchronized (field3243) {
                            field3242.method3981(var2);
                        }
                    }
                    Object var8 = field3245;
                    synchronized (field3245) {
                        if (field3244 <= 1) {
                            field3244 = 0;
                            field3245.notifyAll();
                            return;
                        }
                        field3244 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class160.method943((String) null, var18);
        }
    }
}
