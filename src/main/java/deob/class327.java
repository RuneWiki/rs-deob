package deob;

@ObfuscatedName("lj")
public class class327 implements Runnable {

    @ObfuscatedName("lj.a")
    public static class349 field4121 = new class349();

    @ObfuscatedName("lj.f")
    public static class349 field4122 = new class349();

    @ObfuscatedName("lj.c")
    public static int field4123 = 0;

    @ObfuscatedName("lj.x")
    public static Object field4124 = new Object();

    @ObfuscatedName("cj.a(I[BLob;B)V")
    public static void method2158(int arg0, byte[] arg1, class401 arg2) {
        class326 var3 = new class326();
        var3.field4117 = 0;
        var3.field4635 = (long) arg0;
        var3.field4118 = arg1;
        var3.field4119 = arg2;
        class349 var4 = field4121;
        synchronized (field4121) {
            field4121.method6031(var3);
        }
        Object var6 = field4124;
        synchronized (field4124) {
            if (field4123 == 0) {
                Statics.field4125 = new Thread(new class327());
                Statics.field4125.setDaemon(true);
                Statics.field4125.start();
                Statics.field4125.setPriority(5);
            }
            field4123 = 600;
        }
    }

    @ObfuscatedName("ki.f(ILob;Llx;B)V")
    public static void method5145(int arg0, class401 arg1, class328 arg2) {
        class326 var3 = new class326();
        var3.field4117 = 1;
        var3.field4635 = (long) arg0;
        var3.field4119 = arg1;
        var3.field4120 = arg2;
        class349 var4 = field4121;
        synchronized (field4121) {
            field4121.method6031(var3);
        }
        Object var6 = field4124;
        synchronized (field4124) {
            if (field4123 == 0) {
                Statics.field4125 = new Thread(new class327());
                Statics.field4125.setDaemon(true);
                Statics.field4125.start();
                Statics.field4125.setPriority(5);
            }
            field4123 = 600;
        }
    }

    @ObfuscatedName("il.c(I)V")
    public static void method4598() {
        while (true) {
            class349 var0 = field4121;
            class326 var1;
            synchronized (field4121) {
                var1 = (class326) field4122.method6051();
            }
            if (var1 == null) {
                return;
            }
            var1.field4120.method5738(var1.field4119, (int) var1.field4635, var1.field4118, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class349 var1 = field4121;
                class326 var2;
                synchronized (field4121) {
                    var2 = (class326) field4121.method6040();
                }
                if (var2 == null) {
                    class281.method3621(100L);
                    Object var10 = field4124;
                    synchronized (field4124) {
                        if (field4123 <= 1) {
                            field4123 = 0;
                            field4124.notifyAll();
                            return;
                        }
                        field4123--;
                    }
                } else {
                    if (var2.field4117 == 0) {
                        var2.field4119.method6911((int) var2.field4635, var2.field4118, var2.field4118.length);
                        class349 var4 = field4121;
                        synchronized (field4121) {
                            var2.method7170();
                        }
                    } else if (var2.field4117 == 1) {
                        var2.field4118 = var2.field4119.method6910((int) var2.field4635);
                        class349 var6 = field4121;
                        synchronized (field4121) {
                            field4122.method6031(var2);
                        }
                    }
                    Object var8 = field4124;
                    synchronized (field4124) {
                        if (field4123 <= 1) {
                            field4123 = 0;
                            field4124.notifyAll();
                            return;
                        }
                        field4123 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class489.method7161((String) null, var18);
        }
    }

    @ObfuscatedName("ge.x(I)V")
    public static void method3366() {
        Object var0 = field4124;
        synchronized (field4124) {
            if (field4123 != 0) {
                field4123 = 1;
                try {
                    field4124.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
