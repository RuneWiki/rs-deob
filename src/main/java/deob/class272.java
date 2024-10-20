package deob;

@ObfuscatedName("jg")
public class class272 implements Runnable {

    @ObfuscatedName("jg.v")
    public static class294 field3566 = new class294();

    @ObfuscatedName("jg.n")
    public static class294 field3564 = new class294();

    @ObfuscatedName("jg.f")
    public static int field3563 = 0;

    @ObfuscatedName("jg.y")
    public static Object field3562 = new Object();

    public void run() {
        try {
            while (true) {
                class294 var1 = field3566;
                class271 var2;
                synchronized (field3566) {
                    var2 = (class271) field3566.method4714();
                }
                if (var2 == null) {
                    long var10 = 99L;
                    try {
                        Thread.sleep(var10);
                    } catch (InterruptedException var22) {
                    }
                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException var21) {
                    }
                    Object var14 = field3562;
                    synchronized (field3562) {
                        if (field3563 <= 1) {
                            field3563 = 0;
                            field3562.notifyAll();
                            return;
                        }
                        field3563--;
                    }
                } else {
                    if (var2.field3559 == 0) {
                        var2.field3555.method5406((int) var2.field3938, var2.field3556, var2.field3556.length);
                        class294 var4 = field3566;
                        synchronized (field3566) {
                            var2.method5496();
                        }
                    } else if (var2.field3559 == 1) {
                        var2.field3556 = var2.field3555.method5405((int) var2.field3938);
                        class294 var6 = field3566;
                        synchronized (field3566) {
                            field3564.method4709(var2);
                        }
                    }
                    Object var8 = field3562;
                    synchronized (field3562) {
                        if (field3563 <= 1) {
                            field3563 = 0;
                            field3562.notifyAll();
                            return;
                        }
                        field3563 = 600;
                    }
                }
            }
        } catch (Exception var24) {
            class406.method4407((String) null, var24);
        }
    }

    @ObfuscatedName("io.v(S)V")
    public static void method4333() {
        Object var0 = field3562;
        synchronized (field3562) {
            if (field3563 != 0) {
                field3563 = 1;
                try {
                    field3562.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
