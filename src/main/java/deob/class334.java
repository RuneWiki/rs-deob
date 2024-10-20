package deob;

@ObfuscatedName("li")
public class class334 implements Runnable {

    @ObfuscatedName("li.f")
    public static class356 field4198 = new class356();

    @ObfuscatedName("li.w")
    public static class356 field4199 = new class356();

    @ObfuscatedName("li.v")
    public static int field4200 = 0;

    @ObfuscatedName("li.s")
    public static Object field4201 = new Object();

    @ObfuscatedName("ib.f(I[BLoi;I)V")
    public static void method4870(int arg0, byte[] arg1, class411 arg2) {
        class333 var3 = new class333();
        var3.field4195 = 0;
        var3.field4711 = (long) arg0;
        var3.field4192 = arg1;
        var3.field4193 = arg2;
        class356 var4 = field4198;
        synchronized (field4198) {
            field4198.method6236(var3);
        }
        method5095();
    }

    @ObfuscatedName("cn.w(ILoi;Llm;I)V")
    public static void method2612(int arg0, class411 arg1, class335 arg2) {
        class333 var3 = new class333();
        var3.field4195 = 1;
        var3.field4711 = (long) arg0;
        var3.field4193 = arg1;
        var3.field4196 = arg2;
        class356 var4 = field4198;
        synchronized (field4198) {
            field4198.method6236(var3);
        }
        method5095();
    }

    @ObfuscatedName("ig.v(B)V")
    public static void method4859() {
        while (true) {
            class356 var0 = field4198;
            class333 var1;
            synchronized (field4198) {
                var1 = (class333) field4199.method6239();
            }
            if (var1 == null) {
                return;
            }
            var1.field4196.method5960(var1.field4193, (int) var1.field4711, var1.field4192, false);
        }
    }

    @ObfuscatedName("kf.s(I)V")
    public static void method5095() {
        Object var0 = field4201;
        synchronized (field4201) {
            if (field4200 == 0) {
                Statics.field4202 = new Thread(new class334());
                Statics.field4202.setDaemon(true);
                Statics.field4202.start();
                Statics.field4202.setPriority(5);
            }
            field4200 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class356 var1 = field4198;
                class333 var2;
                synchronized (field4198) {
                    var2 = (class333) field4198.method6241();
                }
                if (var2 == null) {
                    class288.method3270(100L);
                    Object var10 = field4201;
                    synchronized (field4201) {
                        if (field4200 <= 1) {
                            field4200 = 0;
                            field4201.notifyAll();
                            return;
                        }
                        field4200--;
                    }
                } else {
                    if (var2.field4195 == 0) {
                        var2.field4193.method7200((int) var2.field4711, var2.field4192, var2.field4192.length);
                        class356 var4 = field4198;
                        synchronized (field4198) {
                            var2.method7431();
                        }
                    } else if (var2.field4195 == 1) {
                        var2.field4192 = var2.field4193.method7199((int) var2.field4711);
                        class356 var6 = field4198;
                        synchronized (field4198) {
                            field4199.method6236(var2);
                        }
                    }
                    Object var8 = field4201;
                    synchronized (field4201) {
                        if (field4200 <= 1) {
                            field4200 = 0;
                            field4201.notifyAll();
                            return;
                        }
                        field4200 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class500.method2855((String) null, var18);
        }
    }
}
