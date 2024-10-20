package deob;

@ObfuscatedName("ft")
public class class161 implements Runnable {

    @ObfuscatedName("ft.n")
    public static class190 field2599 = new class190();

    @ObfuscatedName("ft.d")
    public static class190 field2601 = new class190();

    @ObfuscatedName("ft.z")
    public static int field2600 = 0;

    @ObfuscatedName("ft.y")
    public static Object field2602 = new Object();

    @ObfuscatedName("x.z(I[BLdu;I)V")
    public static void method147(int arg0, byte[] arg1, class126 arg2) {
        class160 var3 = new class160();
        var3.field2596 = 0;
        var3.field3007 = (long) arg0;
        var3.field2595 = arg1;
        var3.field2594 = arg2;
        class190 var4 = field2599;
        synchronized (field2599) {
            field2599.method3477(var3);
        }
        method1965();
    }

    @ObfuscatedName("ch.y(ILdu;Lfx;I)V")
    public static void method1963(int arg0, class126 arg1, class159 arg2) {
        byte[] var3 = null;
        class190 var4 = field2599;
        synchronized (field2599) {
            for (class160 var5 = (class160) field2599.method3497(); var5 != null; var5 = (class160) field2599.method3475()) {
                if ((long) arg0 == var5.field3007 && var5.field2594 == arg1 && var5.field2596 == 0) {
                    var3 = var5.field2595;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2601(arg0);
            arg2.method3041(arg1, arg0, var7, true);
        } else {
            arg2.method3041(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ch.e(I)V")
    public static void method1965() {
        Object var0 = field2602;
        synchronized (field2602) {
            if (field2600 == 0) {
                Statics.field969.method2624(new class161(), 5);
            }
            field2600 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class190 var1 = field2599;
                class160 var2;
                synchronized (field2599) {
                    var2 = (class160) field2599.method3497();
                }
                if (var2 == null) {
                    class119.method3147(100L);
                    Object var10 = field2602;
                    synchronized (field2602) {
                        if (field2600 <= 1) {
                            field2600 = 0;
                            field2602.notifyAll();
                            return;
                        }
                        field2600--;
                    }
                } else {
                    if (var2.field2596 == 0) {
                        var2.field2594.method2603((int) var2.field3007, var2.field2595, var2.field2595.length);
                        class190 var4 = field2599;
                        synchronized (field2599) {
                            var2.method3562();
                        }
                    } else if (var2.field2596 == 1) {
                        var2.field2595 = var2.field2594.method2601((int) var2.field3007);
                        class190 var6 = field2599;
                        synchronized (field2599) {
                            field2601.method3477(var2);
                        }
                    }
                    Object var8 = field2602;
                    synchronized (field2602) {
                        if (field2600 <= 1) {
                            field2600 = 0;
                            field2602.notifyAll();
                            return;
                        }
                        field2600 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class140.method1864((String) null, var18);
        }
    }
}
