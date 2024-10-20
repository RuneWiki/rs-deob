package deob;

@ObfuscatedName("fs")
public class class158 implements Runnable {

    @ObfuscatedName("fs.p")
    public static class177 field2589 = new class177();

    @ObfuscatedName("fs.l")
    public static class177 field2587 = new class177();

    @ObfuscatedName("fs.d")
    public static int field2588 = 0;

    @ObfuscatedName("fs.x")
    public static Object field2592 = new Object();

    @ObfuscatedName("ep.o(I[BLbp;I)V")
    public static void method3074(int arg0, byte[] arg1, class71 arg2) {
        class157 var3 = new class157();
        var3.field2581 = 0;
        var3.field2821 = (long) arg0;
        var3.field2580 = arg1;
        var3.field2579 = arg2;
        class177 var4 = field2589;
        synchronized (field2589) {
            field2589.method3422(var3);
        }
        method1702();
    }

    @ObfuscatedName("er.a(ILbp;Leu;I)V")
    public static void method3044(int arg0, class71 arg1, class155 arg2) {
        class157 var3 = new class157();
        var3.field2581 = 1;
        var3.field2821 = (long) arg0;
        var3.field2579 = arg1;
        var3.field2582 = arg2;
        class177 var4 = field2589;
        synchronized (field2589) {
            field2589.method3422(var3);
        }
        method1702();
    }

    @ObfuscatedName("eg.w(ILbp;Leu;I)V")
    public static void method2765(int arg0, class71 arg1, class155 arg2) {
        byte[] var3 = null;
        class177 var4 = field2589;
        synchronized (field2589) {
            for (class157 var5 = (class157) field2589.method3446(); var5 != null; var5 = (class157) field2589.method3428()) {
                if ((long) arg0 == var5.field2821 && var5.field2579 == arg1 && var5.field2581 == 0) {
                    var3 = var5.field2580;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1454(arg0);
            arg2.method3185(arg1, arg0, var7, true);
        } else {
            arg2.method3185(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("be.i(B)V")
    public static void method1388() {
        while (true) {
            class177 var0 = field2589;
            class157 var1;
            synchronized (field2589) {
                var1 = (class157) field2587.method3425();
            }
            if (var1 == null) {
                return;
            }
            var1.field2582.method3185(var1.field2579, (int) var1.field2821, var1.field2580, false);
        }
    }

    @ObfuscatedName("cu.y(I)V")
    public static void method1702() {
        Object var0 = field2592;
        synchronized (field2592) {
            if (field2588 == 0) {
                Statics.field2345.method1549(new class158(), 5);
            }
            field2588 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2589;
                class157 var2;
                synchronized (field2589) {
                    var2 = (class157) field2589.method3446();
                }
                if (var2 == null) {
                    class126.method1463(100L);
                    Object var10 = field2592;
                    synchronized (field2592) {
                        if (field2588 <= 1) {
                            field2588 = 0;
                            field2592.notifyAll();
                            return;
                        }
                        field2588--;
                    }
                } else {
                    if (var2.field2581 == 0) {
                        var2.field2579.method1455((int) var2.field2821, var2.field2580, var2.field2580.length);
                        class177 var4 = field2589;
                        synchronized (field2589) {
                            var2.method3455();
                        }
                    } else if (var2.field2581 == 1) {
                        var2.field2580 = var2.field2579.method1454((int) var2.field2821);
                        class177 var6 = field2589;
                        synchronized (field2589) {
                            field2587.method3422(var2);
                        }
                    }
                    Object var8 = field2592;
                    synchronized (field2592) {
                        if (field2588 <= 1) {
                            field2588 = 0;
                            field2592.notifyAll();
                            return;
                        }
                        field2588 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method2076((String) null, var18);
        }
    }

    @ObfuscatedName("eu.m(I)V")
    public static void method3207() {
        Object var0 = field2592;
        synchronized (field2592) {
            if (field2588 != 0) {
                field2588 = 1;
                try {
                    field2592.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
