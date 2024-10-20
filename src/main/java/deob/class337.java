package deob;

@ObfuscatedName("mp")
public class class337 implements Runnable {

    @ObfuscatedName("mp.aj")
    public static class359 field4160 = new class359();

    @ObfuscatedName("mp.al")
    public static class359 field4158 = new class359();

    @ObfuscatedName("mp.ac")
    public static int field4163 = 0;

    @ObfuscatedName("mp.ab")
    public static Object field4161 = new Object();

    @ObfuscatedName("dm.aj(I[BLpv;B)V")
    public static void method2436(int arg0, byte[] arg1, class414 arg2) {
        class336 var3 = new class336();
        var3.field4154 = 0;
        var3.field4673 = (long) arg0;
        var3.field4157 = arg1;
        var3.field4153 = arg2;
        class359 var4 = field4160;
        synchronized (field4160) {
            field4160.method6111(var3);
        }
        method5758();
    }

    @ObfuscatedName("mz.al(ILpv;Lmx;B)V")
    public static void method5761(int arg0, class414 arg1, class338 arg2) {
        class336 var3 = new class336();
        var3.field4154 = 1;
        var3.field4673 = (long) arg0;
        var3.field4153 = arg1;
        var3.field4151 = arg2;
        class359 var4 = field4160;
        synchronized (field4160) {
            field4160.method6111(var3);
        }
        method5758();
    }

    @ObfuscatedName("he.ac(I)V")
    public static void method3399() {
        while (true) {
            class359 var0 = field4160;
            class336 var1;
            synchronized (field4160) {
                var1 = (class336) field4158.method6094();
            }
            if (var1 == null) {
                return;
            }
            var1.field4151.method5839(var1.field4153, (int) var1.field4673, var1.field4157, false);
        }
    }

    @ObfuscatedName("mm.ab(I)V")
    public static void method5758() {
        Object var0 = field4161;
        synchronized (field4161) {
            if (field4163 == 0) {
                Statics.field1647 = new Thread(new class337());
                Statics.field1647.setDaemon(true);
                Statics.field1647.start();
                Statics.field1647.setPriority(5);
            }
            field4163 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class359 var1 = field4160;
                class336 var2;
                synchronized (field4160) {
                    var2 = (class336) field4160.method6089();
                }
                if (var2 == null) {
                    class291.method1994(100L);
                    Object var10 = field4161;
                    synchronized (field4161) {
                        if (field4163 <= 1) {
                            field4163 = 0;
                            field4161.notifyAll();
                            return;
                        }
                        field4163--;
                    }
                } else {
                    if (var2.field4154 == 0) {
                        var2.field4153.method7088((int) var2.field4673, var2.field4157, var2.field4157.length);
                        class359 var4 = field4160;
                        synchronized (field4160) {
                            var2.method7335();
                        }
                    } else if (var2.field4154 == 1) {
                        var2.field4157 = var2.field4153.method7089((int) var2.field4673);
                        class359 var6 = field4160;
                        synchronized (field4160) {
                            field4158.method6111(var2);
                        }
                    }
                    Object var8 = field4161;
                    synchronized (field4161) {
                        if (field4163 <= 1) {
                            field4163 = 0;
                            field4161.notifyAll();
                            return;
                        }
                        field4163 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class504.method6263((String) null, var18);
        }
    }

    @ObfuscatedName("ge.an(I)V")
    public static void method3181() {
        Object var0 = field4161;
        synchronized (field4161) {
            if (field4163 != 0) {
                field4163 = 1;
                try {
                    field4161.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
