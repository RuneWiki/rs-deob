package deob;

@ObfuscatedName("it")
public class class251 implements Runnable {

    @ObfuscatedName("it.y")
    public static class208 field3221 = new class208();

    @ObfuscatedName("it.c")
    public static class208 field3222 = new class208();

    @ObfuscatedName("it.n")
    public static int field3224 = 0;

    @ObfuscatedName("it.u")
    public static Object field3223 = new Object();

    @ObfuscatedName("v.y(I[BLfa;B)V")
    public static void method97(int arg0, byte[] arg1, class165 arg2) {
        class248 var3 = new class248();
        var3.field3194 = 0;
        var3.field2470 = (long) arg0;
        var3.field3195 = arg1;
        var3.field3196 = arg2;
        class208 var4 = field3221;
        synchronized (field3221) {
            field3221.method3773(var3);
        }
        Object var6 = field3223;
        synchronized (field3223) {
            if (field3224 == 0) {
                Statics.field3220 = new Thread(new class251());
                Statics.field3220.setDaemon(true);
                Statics.field3220.start();
                Statics.field3220.setPriority(5);
            }
            field3224 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class208 var1 = field3221;
                class248 var2;
                synchronized (field3221) {
                    var2 = (class248) field3221.method3799();
                }
                if (var2 == null) {
                    class194.method1689(100L);
                    Object var10 = field3223;
                    synchronized (field3223) {
                        if (field3224 <= 1) {
                            field3224 = 0;
                            field3223.notifyAll();
                            return;
                        }
                        field3224--;
                    }
                } else {
                    if (var2.field3194 == 0) {
                        var2.field3196.method3089((int) var2.field2470, var2.field3195, var2.field3195.length);
                        class208 var4 = field3221;
                        synchronized (field3221) {
                            var2.method3766();
                        }
                    } else if (var2.field3194 == 1) {
                        var2.field3195 = var2.field3196.method3088((int) var2.field2470);
                        class208 var6 = field3221;
                        synchronized (field3221) {
                            field3222.method3773(var2);
                        }
                    }
                    Object var8 = field3223;
                    synchronized (field3223) {
                        if (field3224 <= 1) {
                            field3224 = 0;
                            field3223.notifyAll();
                            return;
                        }
                        field3224 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class155.method917((String) null, var18);
        }
    }
}
