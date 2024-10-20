package deob;

@ObfuscatedName("kg")
public class class304 implements Runnable {

    @ObfuscatedName("kg.c")
    public static class326 field3871 = new class326();

    @ObfuscatedName("kg.l")
    public static class326 field3868 = new class326();

    @ObfuscatedName("kg.s")
    public static int field3870 = 0;

    @ObfuscatedName("kg.e")
    public static Object field3872 = new Object();

    @ObfuscatedName("cm.c(ILnb;Lkz;I)V")
    public static void method2298(int arg0, class365 arg1, class305 arg2) {
        class303 var3 = new class303();
        var3.field3865 = 1;
        var3.field4301 = (long) arg0;
        var3.field3863 = arg1;
        var3.field3866 = arg2;
        class326 var4 = field3871;
        synchronized (field3871) {
            field3871.method5264(var3);
        }
        Object var6 = field3872;
        synchronized (field3872) {
            if (field3870 == 0) {
                Statics.field3869 = new Thread(new class304());
                Statics.field3869.setDaemon(true);
                Statics.field3869.start();
                Statics.field3869.setPriority(5);
            }
            field3870 = 600;
        }
    }

    @ObfuscatedName("dd.l(ILnb;Lkz;B)V")
    public static void method2573(int arg0, class365 arg1, class305 arg2) {
        byte[] var3 = null;
        class326 var4 = field3871;
        synchronized (field3871) {
            for (class303 var5 = (class303) field3871.method5269(); var5 != null; var5 = (class303) field3871.method5270()) {
                if ((long) arg0 == var5.field4301 && var5.field3863 == arg1 && var5.field3865 == 0) {
                    var3 = var5.field3864;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5915(arg0);
            arg2.method4981(arg1, arg0, var7, true);
        } else {
            arg2.method4981(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ip.s(B)V")
    public static void method4380() {
        while (true) {
            class326 var0 = field3871;
            class303 var1;
            synchronized (field3871) {
                var1 = (class303) field3868.method5267();
            }
            if (var1 == null) {
                return;
            }
            var1.field3866.method4981(var1.field3863, (int) var1.field4301, var1.field3864, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class326 var1 = field3871;
                class303 var2;
                synchronized (field3871) {
                    var2 = (class303) field3871.method5269();
                }
                if (var2 == null) {
                    class263.method5249(100L);
                    Object var10 = field3872;
                    synchronized (field3872) {
                        if (field3870 <= 1) {
                            field3870 = 0;
                            field3872.notifyAll();
                            return;
                        }
                        field3870--;
                    }
                } else {
                    if (var2.field3865 == 0) {
                        var2.field3863.method5916((int) var2.field4301, var2.field3864, var2.field3864.length);
                        class326 var4 = field3871;
                        synchronized (field3871) {
                            var2.method6167();
                        }
                    } else if (var2.field3865 == 1) {
                        var2.field3864 = var2.field3863.method5915((int) var2.field4301);
                        class326 var6 = field3871;
                        synchronized (field3871) {
                            field3868.method5264(var2);
                        }
                    }
                    Object var8 = field3872;
                    synchronized (field3872) {
                        if (field3870 <= 1) {
                            field3870 = 0;
                            field3872.notifyAll();
                            return;
                        }
                        field3870 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class445.method3452((String) null, var18);
        }
    }

    @ObfuscatedName("ia.e(I)V")
    public static void method4512() {
        Object var0 = field3872;
        synchronized (field3872) {
            if (field3870 != 0) {
                field3870 = 1;
                try {
                    field3872.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
