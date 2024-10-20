package deob;

@ObfuscatedName("iv")
public class class246 implements Runnable {

    @ObfuscatedName("iv.m")
    public static class273 field3229 = new class273();

    @ObfuscatedName("iv.f")
    public static class273 field3228 = new class273();

    @ObfuscatedName("iv.q")
    public static int field3227 = 0;

    @ObfuscatedName("iv.w")
    public static Object field3230 = new Object();

    @ObfuscatedName("ho.m(I[BLff;I)V")
    public static void method4105(int arg0, byte[] arg1, class176 arg2) {
        class243 var3 = new class243();
        var3.field3193 = 0;
        var3.field2139 = (long) arg0;
        var3.field3191 = arg1;
        var3.field3197 = arg2;
        class273 var4 = field3229;
        synchronized (field3229) {
            field3229.method4851(var3);
        }
        Object var6 = field3230;
        synchronized (field3230) {
            if (field3227 == 0) {
                Statics.field1868 = new Thread(new class246());
                Statics.field1868.setDaemon(true);
                Statics.field1868.start();
                Statics.field1868.setPriority(5);
            }
            field3227 = 600;
        }
    }

    @ObfuscatedName("cv.f(ILff;Lit;B)V")
    public static void method1834(int arg0, class176 arg1, class247 arg2) {
        class243 var3 = new class243();
        var3.field3193 = 1;
        var3.field2139 = (long) arg0;
        var3.field3197 = arg1;
        var3.field3190 = arg2;
        class273 var4 = field3229;
        synchronized (field3229) {
            field3229.method4851(var3);
        }
        Object var6 = field3230;
        synchronized (field3230) {
            if (field3227 == 0) {
                Statics.field1868 = new Thread(new class246());
                Statics.field1868.setDaemon(true);
                Statics.field1868.start();
                Statics.field1868.setPriority(5);
            }
            field3227 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class273 var1 = field3229;
                class243 var2;
                synchronized (field3229) {
                    var2 = (class243) field3229.method4856();
                }
                if (var2 == null) {
                    class211.method3659(100L);
                    Object var10 = field3230;
                    synchronized (field3230) {
                        if (field3227 <= 1) {
                            field3227 = 0;
                            field3230.notifyAll();
                            return;
                        }
                        field3227--;
                    }
                } else {
                    if (var2.field3193 == 0) {
                        var2.field3197.method3233((int) var2.field2139, var2.field3191, var2.field3191.length);
                        class273 var4 = field3229;
                        synchronized (field3229) {
                            var2.method3306();
                        }
                    } else if (var2.field3193 == 1) {
                        var2.field3191 = var2.field3197.method3229((int) var2.field2139);
                        class273 var6 = field3229;
                        synchronized (field3229) {
                            field3228.method4851(var2);
                        }
                    }
                    Object var8 = field3230;
                    synchronized (field3230) {
                        if (field3227 <= 1) {
                            field3227 = 0;
                            field3230.notifyAll();
                            return;
                        }
                        field3227 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class166.method4746((String) null, var18);
        }
    }

    @ObfuscatedName("fx.w(I)V")
    public static void method3142() {
        Object var0 = field3230;
        synchronized (field3230) {
            if (field3227 != 0) {
                field3227 = 1;
                try {
                    field3230.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
