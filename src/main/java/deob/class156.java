package deob;

@ObfuscatedName("ef")
public class class156 implements Runnable {

    @ObfuscatedName("ef.p")
    public static class176 field2562 = new class176();

    @ObfuscatedName("ef.j")
    public static class176 field2565 = new class176();

    @ObfuscatedName("ef.w")
    public static int field2564 = 0;

    @ObfuscatedName("ef.h")
    public static Object field2563 = new Object();

    @ObfuscatedName("ea.v(ILbx;Let;I)V")
    public static void method2621(int arg0, class70 arg1, class153 arg2) {
        class155 var3 = new class155();
        var3.field2560 = 1;
        var3.field2809 = (long) arg0;
        var3.field2554 = arg1;
        var3.field2557 = arg2;
        class176 var4 = field2562;
        synchronized (field2562) {
            field2562.method3305(var3);
        }
        Object var6 = field2563;
        synchronized (field2563) {
            if (field2564 == 0) {
                Statics.field1175.method1458(new class156(), 5);
            }
            field2564 = 600;
        }
    }

    @ObfuscatedName("u.k(ILbx;Let;I)V")
    public static void method126(int arg0, class70 arg1, class153 arg2) {
        byte[] var3 = null;
        class176 var4 = field2562;
        synchronized (field2562) {
            for (class155 var5 = (class155) field2562.method3285(); var5 != null; var5 = (class155) field2562.method3299()) {
                if ((long) arg0 == var5.field2809 && var5.field2554 == arg1 && var5.field2560 == 0) {
                    var3 = var5.field2555;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1359(arg0);
            arg2.method3000(arg1, arg0, var7, true);
        } else {
            arg2.method3000(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ec.g(I)V")
    public static void method2780() {
        while (true) {
            class176 var0 = field2562;
            class155 var1;
            synchronized (field2562) {
                var1 = (class155) field2565.method3283();
            }
            if (var1 == null) {
                return;
            }
            var1.field2557.method3000(var1.field2554, (int) var1.field2809, var1.field2555, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class176 var1 = field2562;
                class155 var2;
                synchronized (field2562) {
                    var2 = (class155) field2562.method3285();
                }
                if (var2 == null) {
                    class125.method123(100L);
                    Object var10 = field2563;
                    synchronized (field2563) {
                        if (field2564 <= 1) {
                            field2564 = 0;
                            field2563.notifyAll();
                            return;
                        }
                        field2564--;
                    }
                } else {
                    if (var2.field2560 == 0) {
                        var2.field2554.method1372((int) var2.field2809, var2.field2555, var2.field2555.length);
                        class176 var4 = field2562;
                        synchronized (field2562) {
                            var2.method3327();
                        }
                    } else if (var2.field2560 == 1) {
                        var2.field2555 = var2.field2554.method1359((int) var2.field2809);
                        class176 var6 = field2562;
                        synchronized (field2562) {
                            field2565.method3305(var2);
                        }
                    }
                    Object var8 = field2563;
                    synchronized (field2563) {
                        if (field2564 <= 1) {
                            field2564 = 0;
                            field2563.notifyAll();
                            return;
                        }
                        field2564 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class79.method720((String) null, var18);
        }
    }
}
