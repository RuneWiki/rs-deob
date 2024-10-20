package deob;

@ObfuscatedName("fy")
public class class5 implements Runnable {

    @ObfuscatedName("fy.b")
    public static class15 field15 = new class15();

    @ObfuscatedName("fy.k")
    public static int field17 = 0;

    @ObfuscatedName("fy.h")
    public static class15 field16 = new class15();

    @ObfuscatedName("fy.w")
    public static Object field18 = new Object();

    public void run() {
        try {
            while (true) {
                class15 var1 = field15;
                class99 var2;
                synchronized (field15) {
                    var2 = (class99) field15.method212();
                }
                if (var2 == null) {
                    class134.method600(100L);
                    Object var10 = field18;
                    synchronized (field18) {
                        if (field17 <= 1) {
                            field17 = 0;
                            field18.notifyAll();
                            return;
                        }
                        field17--;
                    }
                } else {
                    if (var2.field1376 == 0) {
                        var2.field1377.method2055((int) var2.field213, var2.field1374, var2.field1374.length);
                        class15 var4 = field15;
                        synchronized (field15) {
                            var2.method234();
                        }
                    } else if (var2.field1376 == 1) {
                        var2.field1374 = var2.field1377.method2054((int) var2.field213);
                        class15 var6 = field15;
                        synchronized (field15) {
                            field16.method219(var2);
                        }
                    }
                    Object var8 = field18;
                    synchronized (field18) {
                        if (field17 <= 1) {
                            field17 = 0;
                            field18.notifyAll();
                            return;
                        }
                        field17 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class136.method1127((String) null, var18);
        }
    }

    @ObfuscatedName("df.w(I)V")
    public static void method551() {
        Object var0 = field18;
        synchronized (field18) {
            if (field17 == 0) {
                Statics.field1999.method2077(new class5(), 5);
            }
            field17 = 600;
        }
    }

    @ObfuscatedName("df.t(I)V")
    public static void method553() {
        Object var0 = field18;
        synchronized (field18) {
            if (field17 != 0) {
                field17 = 1;
                try {
                    field18.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }

    @ObfuscatedName("t.k(I[BLbr;B)V")
    public static void method1216(int arg0, byte[] arg1, class114 arg2) {
        class99 var3 = new class99();
        var3.field1376 = 0;
        var3.field213 = (long) arg0;
        var3.field1374 = arg1;
        var3.field1377 = arg2;
        class15 var4 = field15;
        synchronized (field15) {
            field15.method219(var3);
        }
        method551();
    }
}
