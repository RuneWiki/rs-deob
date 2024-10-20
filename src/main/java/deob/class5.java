package deob;

@ObfuscatedName("fy")
public class class5 implements Runnable {

    @ObfuscatedName("fy.b")
    public static int field46 = 0;

    @ObfuscatedName("fy.c")
    public static class71 field45 = new class71();

    @ObfuscatedName("fy.i")
    public static Object field44 = new Object();

    @ObfuscatedName("fy.v")
    public static class71 field48 = new class71();

    public void run() {
        try {
            while (true) {
                class71 var1 = field48;
                class95 var2;
                synchronized (field48) {
                    var2 = (class95) field48.method1104();
                }
                if (var2 == null) {
                    class134.method1468(100L);
                    Object var10 = field44;
                    synchronized (field44) {
                        if (field46 <= 1) {
                            field46 = 0;
                            field44.notifyAll();
                            return;
                        }
                        field46--;
                    }
                } else {
                    if (var2.field1341 == 0) {
                        var2.field1338.method1973((int) var2.field76, var2.field1337, var2.field1337.length);
                        class71 var4 = field48;
                        synchronized (field48) {
                            var2.method76();
                        }
                    } else if (var2.field1341 == 1) {
                        var2.field1337 = var2.field1338.method1972((int) var2.field76);
                        class71 var6 = field48;
                        synchronized (field48) {
                            field45.method1099(var2);
                        }
                    }
                    Object var8 = field44;
                    synchronized (field44) {
                        if (field46 <= 1) {
                            field46 = 0;
                            field44.notifyAll();
                            return;
                        }
                        field46 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class136.method1295((String) null, var18);
        }
    }

    @ObfuscatedName("b.z(I)V")
    public static void method941() {
        while (true) {
            class71 var0 = field48;
            class95 var1;
            synchronized (field48) {
                var1 = (class95) field45.method1102();
            }
            if (var1 == null) {
                return;
            }
            var1.field1339.method1232(var1.field1338, (int) var1.field76, var1.field1337, false);
        }
    }

    @ObfuscatedName("bk.m(I[BLbs;I)V")
    public static void method2165(int arg0, byte[] arg1, class113 arg2) {
        class95 var3 = new class95();
        var3.field1341 = 0;
        var3.field76 = (long) arg0;
        var3.field1337 = arg1;
        var3.field1338 = arg2;
        class71 var4 = field48;
        synchronized (field48) {
            field48.method1099(var3);
        }
        Object var6 = field44;
        synchronized (field44) {
            if (field46 == 0) {
                Statics.field2717.method2224(new class5(), 5);
            }
            field46 = 600;
        }
    }

    @ObfuscatedName("an.x(B)V")
    public static void method3253() {
        Object var0 = field44;
        synchronized (field44) {
            if (field46 != 0) {
                field46 = 1;
                try {
                    field44.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
