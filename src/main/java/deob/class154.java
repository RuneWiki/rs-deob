package deob;

@ObfuscatedName("er")
public class class154 implements Runnable {

    @ObfuscatedName("er.p")
    public static class182 field2510 = new class182();

    @ObfuscatedName("er.y")
    public static class182 field2513 = new class182();

    @ObfuscatedName("er.d")
    public static int field2511 = 0;

    @ObfuscatedName("er.c")
    public static Object field2512 = new Object();

    @ObfuscatedName("gc.r(ILdi;Les;I)V")
    public static void method3444(int arg0, class125 arg1, class152 arg2) {
        class153 var3 = new class153();
        var3.field2506 = 1;
        var3.field2903 = (long) arg0;
        var3.field2501 = arg1;
        var3.field2505 = arg2;
        class182 var4 = field2510;
        synchronized (field2510) {
            field2510.method3256(var3);
        }
        Object var6 = field2512;
        synchronized (field2512) {
            if (field2511 == 0) {
                Statics.field1115.method2500(new class154(), 5);
            }
            field2511 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class182 var1 = field2510;
                class153 var2;
                synchronized (field2510) {
                    var2 = (class153) field2510.method3270();
                }
                if (var2 == null) {
                    class118.method1901(100L);
                    Object var10 = field2512;
                    synchronized (field2512) {
                        if (field2511 <= 1) {
                            field2511 = 0;
                            field2512.notifyAll();
                            return;
                        }
                        field2511--;
                    }
                } else {
                    if (var2.field2506 == 0) {
                        var2.field2501.method2466((int) var2.field2903, var2.field2502, var2.field2502.length);
                        class182 var4 = field2510;
                        synchronized (field2510) {
                            var2.method3358();
                        }
                    } else if (var2.field2506 == 1) {
                        var2.field2502 = var2.field2501.method2465((int) var2.field2903);
                        class182 var6 = field2510;
                        synchronized (field2510) {
                            field2513.method3256(var2);
                        }
                    }
                    Object var8 = field2512;
                    synchronized (field2512) {
                        if (field2511 <= 1) {
                            field2511 = 0;
                            field2512.notifyAll();
                            return;
                        }
                        field2511 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class139.method2074((String) null, var18);
        }
    }
}
