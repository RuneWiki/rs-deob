package deob;

@ObfuscatedName("fn")
public class class158 implements Runnable {

    @ObfuscatedName("fn.b")
    public static class177 field2591 = new class177();

    @ObfuscatedName("fn.e")
    public static class177 field2596 = new class177();

    @ObfuscatedName("fn.g")
    public static int field2589 = 0;

    @ObfuscatedName("fn.o")
    public static Object field2592 = new Object();

    @ObfuscatedName("al.a(I[BLbg;I)V")
    public static void method688(int arg0, byte[] arg1, class71 arg2) {
        class157 var3 = new class157();
        var3.field2582 = 0;
        var3.field2810 = (long) arg0;
        var3.field2580 = arg1;
        var3.field2581 = arg2;
        class177 var4 = field2591;
        synchronized (field2591) {
            field2591.method3318(var3);
        }
        method3();
    }

    @ObfuscatedName("b.j(B)V")
    public static void method3() {
        Object var0 = field2592;
        synchronized (field2592) {
            if (field2589 == 0) {
                Statics.field12.method1480(new class158(), 5);
            }
            field2589 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2591;
                class157 var2;
                synchronized (field2591) {
                    var2 = (class157) field2591.method3314();
                }
                if (var2 == null) {
                    class127.method686(100L);
                    Object var10 = field2592;
                    synchronized (field2592) {
                        if (field2589 <= 1) {
                            field2589 = 0;
                            field2592.notifyAll();
                            return;
                        }
                        field2589--;
                    }
                } else {
                    if (var2.field2582 == 0) {
                        var2.field2581.method1386((int) var2.field2810, var2.field2580, var2.field2580.length);
                        class177 var4 = field2591;
                        synchronized (field2591) {
                            var2.method3341();
                        }
                    } else if (var2.field2582 == 1) {
                        var2.field2580 = var2.field2581.method1385((int) var2.field2810);
                        class177 var6 = field2591;
                        synchronized (field2591) {
                            field2596.method3318(var2);
                        }
                    }
                    Object var8 = field2592;
                    synchronized (field2592) {
                        if (field2589 <= 1) {
                            field2589 = 0;
                            field2592.notifyAll();
                            return;
                        }
                        field2589 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method1557((String) null, var18);
        }
    }

    @ObfuscatedName("ek.f(I)V")
    public static void method2697() {
        Object var0 = field2592;
        synchronized (field2592) {
            if (field2589 != 0) {
                field2589 = 1;
                try {
                    field2592.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
