package deob;

@ObfuscatedName("ie")
public class class237 implements Runnable {

    @ObfuscatedName("ie.c")
    public static class194 field3208 = new class194();

    @ObfuscatedName("ie.o")
    public static class194 field3205 = new class194();

    @ObfuscatedName("ie.i")
    public static int field3206 = 0;

    @ObfuscatedName("ie.u")
    public static Object field3204 = new Object();

    @ObfuscatedName("ax.c(I[BLfz;I)V")
    public static void method523(int arg0, byte[] arg1, class161 arg2) {
        class234 var3 = new class234();
        var3.field3172 = 0;
        var3.field2437 = (long) arg0;
        var3.field3171 = arg1;
        var3.field3174 = arg2;
        class194 var4 = field3208;
        synchronized (field3208) {
            field3208.method3290(var3);
        }
        Object var6 = field3204;
        synchronized (field3204) {
            if (field3206 == 0) {
                Statics.field317 = new Thread(new class237());
                Statics.field317.setDaemon(true);
                Statics.field317.start();
                Statics.field317.setPriority(5);
            }
            field3206 = 600;
        }
    }

    @ObfuscatedName("bw.o(ILfz;Lix;I)V")
    public static void method952(int arg0, class161 arg1, class238 arg2) {
        class234 var3 = new class234();
        var3.field3172 = 1;
        var3.field2437 = (long) arg0;
        var3.field3174 = arg1;
        var3.field3173 = arg2;
        class194 var4 = field3208;
        synchronized (field3208) {
            field3208.method3290(var3);
        }
        Object var6 = field3204;
        synchronized (field3204) {
            if (field3206 == 0) {
                Statics.field317 = new Thread(new class237());
                Statics.field317.setDaemon(true);
                Statics.field317.start();
                Statics.field317.setPriority(5);
            }
            field3206 = 600;
        }
    }

    @ObfuscatedName("fu.u(I)V")
    public static void method2745() {
        while (true) {
            class194 var0 = field3208;
            class234 var1;
            synchronized (field3208) {
                var1 = (class234) field3205.method3291();
            }
            if (var1 == null) {
                return;
            }
            var1.field3173.method3828(var1.field3174, (int) var1.field2437, var1.field3171, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class194 var1 = field3208;
                class234 var2;
                synchronized (field3208) {
                    var2 = (class234) field3208.method3296();
                }
                if (var2 == null) {
                    Statics.method2614(100L);
                    Object var10 = field3204;
                    synchronized (field3204) {
                        if (field3206 <= 1) {
                            field3206 = 0;
                            field3204.notifyAll();
                            return;
                        }
                        field3206--;
                    }
                } else {
                    if (var2.field3172 == 0) {
                        var2.field3174.method2707((int) var2.field2437, var2.field3171, var2.field3171.length);
                        class194 var4 = field3208;
                        synchronized (field3208) {
                            var2.method3287();
                        }
                    } else if (var2.field3172 == 1) {
                        var2.field3171 = var2.field3174.method2706((int) var2.field2437);
                        class194 var6 = field3208;
                        synchronized (field3208) {
                            field3205.method3290(var2);
                        }
                    }
                    Object var8 = field3204;
                    synchronized (field3204) {
                        if (field3206 <= 1) {
                            field3206 = 0;
                            field3204.notifyAll();
                            return;
                        }
                        field3206 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class153.method463((String) null, var18);
        }
    }

    @ObfuscatedName("bv.g(I)V")
    public static void method971() {
        Object var0 = field3204;
        synchronized (field3204) {
            if (field3206 != 0) {
                field3206 = 1;
                try {
                    field3204.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
