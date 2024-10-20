package deob;

@ObfuscatedName("fw")
public class class170 implements Runnable {

    @ObfuscatedName("fw.o")
    public static class199 field2711 = new class199();

    @ObfuscatedName("fw.f")
    public static class199 field2706 = new class199();

    @ObfuscatedName("fw.i")
    public static int field2707 = 0;

    @ObfuscatedName("fw.h")
    public static Object field2708 = new Object();

    @ObfuscatedName("bg.h(ILen;Lft;B)V")
    public static void method1453(int arg0, class134 arg1, class168 arg2) {
        class169 var3 = new class169();
        var3.field2697 = 1;
        var3.field3097 = (long) arg0;
        var3.field2701 = arg1;
        var3.field2700 = arg2;
        class199 var4 = field2711;
        synchronized (field2711) {
            field2711.method3515(var3);
        }
        Object var6 = field2708;
        synchronized (field2708) {
            if (field2707 == 0) {
                Statics.field2177.method2666(new class170(), 5);
            }
            field2707 = 600;
        }
    }

    @ObfuscatedName("ac.q(I)V")
    public static void method631() {
        while (true) {
            class199 var0 = field2711;
            class169 var1;
            synchronized (field2711) {
                var1 = (class169) field2706.method3518();
            }
            if (var1 == null) {
                return;
            }
            var1.field2700.method3055(var1.field2701, (int) var1.field3097, var1.field2698, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2711;
                class169 var2;
                synchronized (field2711) {
                    var2 = (class169) field2711.method3520();
                }
                if (var2 == null) {
                    class127.method16(100L);
                    Object var10 = field2708;
                    synchronized (field2708) {
                        if (field2707 <= 1) {
                            field2707 = 0;
                            field2708.notifyAll();
                            return;
                        }
                        field2707--;
                    }
                } else {
                    if (var2.field2697 == 0) {
                        var2.field2701.method2633((int) var2.field3097, var2.field2698, var2.field2698.length);
                        class199 var4 = field2711;
                        synchronized (field2711) {
                            var2.method3605();
                        }
                    } else if (var2.field2697 == 1) {
                        var2.field2698 = var2.field2701.method2632((int) var2.field3097);
                        class199 var6 = field2711;
                        synchronized (field2711) {
                            field2706.method3515(var2);
                        }
                    }
                    Object var8 = field2708;
                    synchronized (field2708) {
                        if (field2707 <= 1) {
                            field2707 = 0;
                            field2708.notifyAll();
                            return;
                        }
                        field2707 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method2604((String) null, var18);
        }
    }

    @ObfuscatedName("bg.u(I)V")
    public static void method1454() {
        Object var0 = field2708;
        synchronized (field2708) {
            if (field2707 != 0) {
                field2707 = 1;
                try {
                    field2708.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
