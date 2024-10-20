package deob;

@ObfuscatedName("ik")
public class class240 implements Runnable {

    @ObfuscatedName("ik.s")
    public static class197 field3253 = new class197();

    @ObfuscatedName("ik.c")
    public static class197 field3251 = new class197();

    @ObfuscatedName("ik.f")
    public static int field3252 = 0;

    @ObfuscatedName("ik.m")
    public static Object field3254 = new Object();

    @ObfuscatedName("dz.s(I[BLfe;I)V")
    public static void method1957(int arg0, byte[] arg1, class163 arg2) {
        class237 var3 = new class237();
        var3.field3222 = 0;
        var3.field2487 = (long) arg0;
        var3.field3223 = arg1;
        var3.field3220 = arg2;
        class197 var4 = field3253;
        synchronized (field3253) {
            field3253.method3394(var3);
        }
        Object var6 = field3254;
        synchronized (field3254) {
            if (field3252 == 0) {
                Statics.field349 = new Thread(new class240());
                Statics.field349.setDaemon(true);
                Statics.field349.start();
                Statics.field349.setPriority(5);
            }
            field3252 = 600;
        }
    }

    @ObfuscatedName("i.c(ILfe;Lir;B)V")
    public static void method147(int arg0, class163 arg1, class241 arg2) {
        class237 var3 = new class237();
        var3.field3222 = 1;
        var3.field2487 = (long) arg0;
        var3.field3220 = arg1;
        var3.field3221 = arg2;
        class197 var4 = field3253;
        synchronized (field3253) {
            field3253.method3394(var3);
        }
        Object var6 = field3254;
        synchronized (field3254) {
            if (field3252 == 0) {
                Statics.field349 = new Thread(new class240());
                Statics.field349.setDaemon(true);
                Statics.field349.start();
                Statics.field349.setPriority(5);
            }
            field3252 = 600;
        }
    }

    @ObfuscatedName("b.f(I)V")
    public static void method168() {
        while (true) {
            class197 var0 = field3253;
            class237 var1;
            synchronized (field3253) {
                var1 = (class237) field3251.method3381();
            }
            if (var1 == null) {
                return;
            }
            var1.field3221.method3946(var1.field3220, (int) var1.field2487, var1.field3223, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class197 var1 = field3253;
                class237 var2;
                synchronized (field3253) {
                    var2 = (class237) field3253.method3389();
                }
                if (var2 == null) {
                    class185.method631(100L);
                    Object var10 = field3254;
                    synchronized (field3254) {
                        if (field3252 <= 1) {
                            field3252 = 0;
                            field3254.notifyAll();
                            return;
                        }
                        field3252--;
                    }
                } else {
                    if (var2.field3222 == 0) {
                        var2.field3220.method2831((int) var2.field2487, var2.field3223, var2.field3223.length);
                        class197 var4 = field3253;
                        synchronized (field3253) {
                            var2.method3372();
                        }
                    } else if (var2.field3222 == 1) {
                        var2.field3223 = var2.field3220.method2824((int) var2.field2487);
                        class197 var6 = field3253;
                        synchronized (field3253) {
                            field3251.method3394(var2);
                        }
                    }
                    Object var8 = field3254;
                    synchronized (field3254) {
                        if (field3252 <= 1) {
                            field3252 = 0;
                            field3254.notifyAll();
                            return;
                        }
                        field3252 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class154.method1971((String) null, var18);
        }
    }

    @ObfuscatedName("cq.m(B)V")
    public static void method1746() {
        Object var0 = field3254;
        synchronized (field3254) {
            if (field3252 != 0) {
                field3252 = 1;
                try {
                    field3254.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
