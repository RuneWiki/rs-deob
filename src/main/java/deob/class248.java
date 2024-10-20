package deob;

@ObfuscatedName("iz")
public class class248 implements Runnable {

    @ObfuscatedName("iz.s")
    public static class205 field3326 = new class205();

    @ObfuscatedName("iz.g")
    public static class205 field3323 = new class205();

    @ObfuscatedName("iz.m")
    public static int field3325 = 0;

    @ObfuscatedName("iz.h")
    public static Object field3324 = new Object();

    @ObfuscatedName("gl.s(I)V")
    public static void method3497() {
        while (true) {
            class205 var0 = field3326;
            class245 var1;
            synchronized (field3326) {
                var1 = (class245) field3323.method3750();
            }
            if (var1 == null) {
                return;
            }
            var1.field3294.method4303(var1.field3293, (int) var1.field2585, var1.field3292, false);
        }
    }

    @ObfuscatedName("hf.g(B)V")
    public static void method3850() {
        Object var0 = field3324;
        synchronized (field3324) {
            if (field3325 == 0) {
                Statics.field2698 = new Thread(new class248());
                Statics.field2698.setDaemon(true);
                Statics.field2698.start();
                Statics.field2698.setPriority(5);
            }
            field3325 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class205 var1 = field3326;
                class245 var2;
                synchronized (field3326) {
                    var2 = (class245) field3326.method3752();
                }
                if (var2 == null) {
                    class193.method2520(100L);
                    Object var10 = field3324;
                    synchronized (field3324) {
                        if (field3325 <= 1) {
                            field3325 = 0;
                            field3324.notifyAll();
                            return;
                        }
                        field3325--;
                    }
                } else {
                    if (var2.field3291 == 0) {
                        var2.field3293.method3062((int) var2.field2585, var2.field3292, var2.field3292.length);
                        class205 var4 = field3326;
                        synchronized (field3326) {
                            var2.method3740();
                        }
                    } else if (var2.field3291 == 1) {
                        var2.field3292 = var2.field3293.method3070((int) var2.field2585);
                        class205 var6 = field3326;
                        synchronized (field3326) {
                            field3323.method3747(var2);
                        }
                    }
                    Object var8 = field3324;
                    synchronized (field3324) {
                        if (field3325 <= 1) {
                            field3325 = 0;
                            field3324.notifyAll();
                            return;
                        }
                        field3325 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class155.method73((String) null, var18);
        }
    }

    @ObfuscatedName("x.m(I)V")
    public static void method100() {
        Object var0 = field3324;
        synchronized (field3324) {
            if (field3325 != 0) {
                field3325 = 1;
                try {
                    field3324.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
