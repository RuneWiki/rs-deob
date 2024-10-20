package deob;

@ObfuscatedName("ip")
public class class251 implements Runnable {

    @ObfuscatedName("ip.g")
    public static class208 field3243 = new class208();

    @ObfuscatedName("ip.r")
    public static class208 field3245 = new class208();

    @ObfuscatedName("ip.e")
    public static int field3244 = 0;

    @ObfuscatedName("ip.q")
    public static Object field3242 = new Object();

    @ObfuscatedName("bh.g(I[BLfp;I)V")
    public static void method1720(int arg0, byte[] arg1, class165 arg2) {
        class248 var3 = new class248();
        var3.field3214 = 0;
        var3.field2497 = (long) arg0;
        var3.field3213 = arg1;
        var3.field3216 = arg2;
        class208 var4 = field3243;
        synchronized (field3243) {
            field3243.method3957(var3);
        }
        Object var6 = field3242;
        synchronized (field3242) {
            if (field3244 == 0) {
                Statics.field3246 = new Thread(new class251());
                Statics.field3246.setDaemon(true);
                Statics.field3246.start();
                Statics.field3246.setPriority(5);
            }
            field3244 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class208 var1 = field3243;
                class248 var2;
                synchronized (field3243) {
                    var2 = (class248) field3243.method3979();
                }
                if (var2 == null) {
                    class194.method4976(100L);
                    Object var10 = field3242;
                    synchronized (field3242) {
                        if (field3244 <= 1) {
                            field3244 = 0;
                            field3242.notifyAll();
                            return;
                        }
                        field3244--;
                    }
                } else {
                    if (var2.field3214 == 0) {
                        var2.field3216.method3287((int) var2.field2497, var2.field3213, var2.field3213.length);
                        class208 var4 = field3243;
                        synchronized (field3243) {
                            var2.method3952();
                        }
                    } else if (var2.field3214 == 1) {
                        var2.field3213 = var2.field3216.method3292((int) var2.field2497);
                        class208 var6 = field3243;
                        synchronized (field3243) {
                            field3245.method3957(var2);
                        }
                    }
                    Object var8 = field3242;
                    synchronized (field3242) {
                        if (field3244 <= 1) {
                            field3244 = 0;
                            field3242.notifyAll();
                            return;
                        }
                        field3244 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class155.method1917((String) null, var18);
        }
    }
}
