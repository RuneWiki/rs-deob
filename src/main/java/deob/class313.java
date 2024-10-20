package deob;

@ObfuscatedName("lk")
public class class313 implements Runnable {

    @ObfuscatedName("lk.s")
    public static class335 field3975 = new class335();

    @ObfuscatedName("lk.h")
    public static class335 field3972 = new class335();

    @ObfuscatedName("lk.w")
    public static int field3971 = 0;

    @ObfuscatedName("lk.v")
    public static Object field3974 = new Object();

    @ObfuscatedName("nf.h(ILnk;Lln;I)V")
    public static void method6011(int arg0, class382 arg1, class314 arg2) {
        byte[] var3 = null;
        class335 var4 = field3975;
        synchronized (field3975) {
            for (class312 var5 = (class312) field3975.method5442(); var5 != null; var5 = (class312) field3975.method5426()) {
                if ((long) arg0 == var5.field4468 && var5.field3970 == arg1 && var5.field3969 == 0) {
                    var3 = var5.field3968;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method6166(arg0);
            arg2.method5157(arg1, arg0, var7, true);
        } else {
            arg2.method5157(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class335 var1 = field3975;
                class312 var2;
                synchronized (field3975) {
                    var2 = (class312) field3975.method5442();
                }
                if (var2 == null) {
                    class271.method2748(100L);
                    Object var10 = field3974;
                    synchronized (field3974) {
                        if (field3971 <= 1) {
                            field3971 = 0;
                            field3974.notifyAll();
                            return;
                        }
                        field3971--;
                    }
                } else {
                    if (var2.field3969 == 0) {
                        var2.field3970.method6172((int) var2.field4468, var2.field3968, var2.field3968.length);
                        class335 var4 = field3975;
                        synchronized (field3975) {
                            var2.method6409();
                        }
                    } else if (var2.field3969 == 1) {
                        var2.field3968 = var2.field3970.method6166((int) var2.field4468);
                        class335 var6 = field3975;
                        synchronized (field3975) {
                            field3972.method5425(var2);
                        }
                    }
                    Object var8 = field3974;
                    synchronized (field3974) {
                        if (field3971 <= 1) {
                            field3971 = 0;
                            field3974.notifyAll();
                            return;
                        }
                        field3971 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class468.method566((String) null, var18);
        }
    }
}
