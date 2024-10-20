package deob;

@ObfuscatedName("jd")
public class class274 implements Runnable {

    @ObfuscatedName("jd.s")
    public static class296 field3558 = new class296();

    @ObfuscatedName("jd.v")
    public static class296 field3556 = new class296();

    @ObfuscatedName("jd.j")
    public static int field3557 = 0;

    @ObfuscatedName("jd.l")
    public static Object field3559 = new Object();

    @ObfuscatedName("jt.s(I)V")
    public static void method4397() {
        while (true) {
            class296 var0 = field3558;
            class273 var1;
            synchronized (field3558) {
                var1 = (class273) field3556.method4733();
            }
            if (var1 == null) {
                return;
            }
            var1.field3550.method4423(var1.field3552, (int) var1.field3966, var1.field3551, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class296 var1 = field3558;
                class273 var2;
                synchronized (field3558) {
                    var2 = (class273) field3558.method4721();
                }
                if (var2 == null) {
                    class383.method3882(100L);
                    Object var10 = field3559;
                    synchronized (field3559) {
                        if (field3557 <= 1) {
                            field3557 = 0;
                            field3559.notifyAll();
                            return;
                        }
                        field3557--;
                    }
                } else {
                    if (var2.field3555 == 0) {
                        var2.field3552.method5360((int) var2.field3966, var2.field3551, var2.field3551.length);
                        class296 var4 = field3558;
                        synchronized (field3558) {
                            var2.method5447();
                        }
                    } else if (var2.field3555 == 1) {
                        var2.field3551 = var2.field3552.method5354((int) var2.field3966);
                        class296 var6 = field3558;
                        synchronized (field3558) {
                            field3556.method4706(var2);
                        }
                    }
                    Object var8 = field3559;
                    synchronized (field3559) {
                        if (field3557 <= 1) {
                            field3557 = 0;
                            field3559.notifyAll();
                            return;
                        }
                        field3557 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class409.method5337((String) null, var18);
        }
    }
}
