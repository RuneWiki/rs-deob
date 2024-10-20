package deob;

@ObfuscatedName("lg")
public class class313 implements Runnable {

    @ObfuscatedName("lg.v")
    public static class335 field3941 = new class335();

    @ObfuscatedName("lg.c")
    public static class335 field3940 = new class335();

    @ObfuscatedName("lg.i")
    public static int field3946 = 0;

    @ObfuscatedName("lg.f")
    public static Object field3945 = new Object();

    @ObfuscatedName("t.v(ILnw;Llx;I)V")
    public static void method251(int arg0, class381 arg1, class314 arg2) {
        byte[] var3 = null;
        class335 var4 = field3941;
        synchronized (field3941) {
            for (class312 var5 = (class312) field3941.method5540(); var5 != null; var5 = (class312) field3941.method5534()) {
                if ((long) arg0 == var5.field4410 && var5.field3934 == arg1 && var5.field3933 == 0) {
                    var3 = var5.field3937;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method6263(arg0);
            arg2.method5255(arg1, arg0, var7, true);
        } else {
            arg2.method5255(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("cu.c(I)V")
    public static void method2281() {
        Object var0 = field3945;
        synchronized (field3945) {
            if (field3946 == 0) {
                Statics.field3943 = new Thread(new class313());
                Statics.field3943.setDaemon(true);
                Statics.field3943.start();
                Statics.field3943.setPriority(5);
            }
            field3946 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class335 var1 = field3941;
                class312 var2;
                synchronized (field3941) {
                    var2 = (class312) field3941.method5540();
                }
                if (var2 == null) {
                    class271.method2274(100L);
                    Object var10 = field3945;
                    synchronized (field3945) {
                        if (field3946 <= 1) {
                            field3946 = 0;
                            field3945.notifyAll();
                            return;
                        }
                        field3946--;
                    }
                } else {
                    if (var2.field3933 == 0) {
                        var2.field3934.method6268((int) var2.field4410, var2.field3937, var2.field3937.length);
                        class335 var4 = field3941;
                        synchronized (field3941) {
                            var2.method6503();
                        }
                    } else if (var2.field3933 == 1) {
                        var2.field3937 = var2.field3934.method6263((int) var2.field4410);
                        class335 var6 = field3941;
                        synchronized (field3941) {
                            field3940.method5530(var2);
                        }
                    }
                    Object var8 = field3945;
                    synchronized (field3945) {
                        if (field3946 <= 1) {
                            field3946 = 0;
                            field3945.notifyAll();
                            return;
                        }
                        field3946 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class462.method5173((String) null, var18);
        }
    }
}
