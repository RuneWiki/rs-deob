package deob;

@ObfuscatedName("ns")
public class class341 implements Runnable {

    @ObfuscatedName("ns.af")
    public static class363 field4196 = new class363();

    @ObfuscatedName("ns.an")
    public static class363 field4195 = new class363();

    @ObfuscatedName("ns.aw")
    public static int field4197 = 0;

    @ObfuscatedName("ns.ac")
    public static Object field4198 = new Object();

    @ObfuscatedName("cb.af(I[BLqk;B)V")
    public static void method1945(int arg0, byte[] arg1, class418 arg2) {
        class340 var3 = new class340();
        var3.field4190 = 0;
        var3.field4745 = (long) arg0;
        var3.field4191 = arg1;
        var3.field4192 = arg2;
        class363 var4 = field4196;
        synchronized (field4196) {
            field4196.method6324(var3);
        }
        method2905();
    }

    @ObfuscatedName("jg.an(ILqk;Lnd;I)V")
    public static void method4574(int arg0, class418 arg1, class342 arg2) {
        class340 var3 = new class340();
        var3.field4190 = 1;
        var3.field4745 = (long) arg0;
        var3.field4192 = arg1;
        var3.field4193 = arg2;
        class363 var4 = field4196;
        synchronized (field4196) {
            field4196.method6324(var3);
        }
        method2905();
    }

    @ObfuscatedName("eh.aw(I)V")
    public static void method2905() {
        Object var0 = field4198;
        synchronized (field4198) {
            if (field4197 == 0) {
                Statics.field4272 = new Thread(new class341());
                Statics.field4272.setDaemon(true);
                Statics.field4272.start();
                Statics.field4272.setPriority(5);
            }
            field4197 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class363 var1 = field4196;
                class340 var2;
                synchronized (field4196) {
                    var2 = (class340) field4196.method6329();
                }
                if (var2 == null) {
                    class295.method5489(100L);
                    Object var10 = field4198;
                    synchronized (field4198) {
                        if (field4197 <= 1) {
                            field4197 = 0;
                            field4198.notifyAll();
                            return;
                        }
                        field4197--;
                    }
                } else {
                    if (var2.field4190 == 0) {
                        var2.field4192.method7348((int) var2.field4745, var2.field4191, var2.field4191.length);
                        class363 var4 = field4196;
                        synchronized (field4196) {
                            var2.method7651();
                        }
                    } else if (var2.field4190 == 1) {
                        var2.field4191 = var2.field4192.method7351((int) var2.field4745);
                        class363 var6 = field4196;
                        synchronized (field4196) {
                            field4195.method6324(var2);
                        }
                    }
                    Object var8 = field4198;
                    synchronized (field4198) {
                        if (field4197 <= 1) {
                            field4197 = 0;
                            field4198.notifyAll();
                            return;
                        }
                        field4197 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class516.method6950((String) null, var18);
        }
    }

    @ObfuscatedName("fw.ac(I)V")
    public static void method3055() {
        Object var0 = field4198;
        synchronized (field4198) {
            if (field4197 != 0) {
                field4197 = 1;
                try {
                    field4198.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
