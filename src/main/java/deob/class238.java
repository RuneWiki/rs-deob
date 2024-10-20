package deob;

@ObfuscatedName("ik")
public class class238 implements Runnable {

    @ObfuscatedName("ik.e")
    public static class195 field3216 = new class195();

    @ObfuscatedName("ik.n")
    public static class195 field3215 = new class195();

    @ObfuscatedName("ik.g")
    public static int field3217 = 0;

    @ObfuscatedName("ik.y")
    public static Object field3218 = new Object();

    @ObfuscatedName("bc.e(I[BLfq;I)V")
    public static void method977(int arg0, byte[] arg1, class162 arg2) {
        class235 var3 = new class235();
        var3.field3190 = 0;
        var3.field2451 = (long) arg0;
        var3.field3186 = arg1;
        var3.field3187 = arg2;
        class195 var4 = field3216;
        synchronized (field3216) {
            field3216.method3379(var3);
        }
        Object var6 = field3218;
        synchronized (field3218) {
            if (field3217 == 0) {
                Statics.field3220 = new Thread(new class238());
                Statics.field3220.setDaemon(true);
                Statics.field3220.start();
                Statics.field3220.setPriority(5);
            }
            field3217 = 600;
        }
    }

    @ObfuscatedName("hr.n(ILfq;Lid;I)V")
    public static void method3796(int arg0, class162 arg1, class239 arg2) {
        byte[] var3 = null;
        class195 var4 = field3216;
        synchronized (field3216) {
            for (class235 var5 = (class235) field3216.method3348(); var5 != null; var5 = (class235) field3216.method3350()) {
                if ((long) arg0 == var5.field2451 && var5.field3187 == arg1 && var5.field3190 == 0) {
                    var3 = var5.field3186;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2802(arg0);
            arg2.method3910(arg1, arg0, var7, true);
        } else {
            arg2.method3910(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class195 var1 = field3216;
                class235 var2;
                synchronized (field3216) {
                    var2 = (class235) field3216.method3348();
                }
                if (var2 == null) {
                    class183.method534(100L);
                    Object var10 = field3218;
                    synchronized (field3218) {
                        if (field3217 <= 1) {
                            field3217 = 0;
                            field3218.notifyAll();
                            return;
                        }
                        field3217--;
                    }
                } else {
                    if (var2.field3190 == 0) {
                        var2.field3187.method2801((int) var2.field2451, var2.field3186, var2.field3186.length);
                        class195 var4 = field3216;
                        synchronized (field3216) {
                            var2.method3333();
                        }
                    } else if (var2.field3190 == 1) {
                        var2.field3186 = var2.field3187.method2802((int) var2.field2451);
                        class195 var6 = field3216;
                        synchronized (field3216) {
                            field3215.method3379(var2);
                        }
                    }
                    Object var8 = field3218;
                    synchronized (field3218) {
                        if (field3217 <= 1) {
                            field3217 = 0;
                            field3218.notifyAll();
                            return;
                        }
                        field3217 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class154.method1592((String) null, var18);
        }
    }
}
