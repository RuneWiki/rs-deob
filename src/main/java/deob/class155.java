package deob;

@ObfuscatedName("ef")
public class class155 implements Runnable {

    @ObfuscatedName("ef.c")
    public static class175 field2518 = new class175();

    @ObfuscatedName("ef.j")
    public static class175 field2514 = new class175();

    @ObfuscatedName("ef.f")
    public static int field2517 = 0;

    @ObfuscatedName("ef.y")
    public static Object field2516 = new Object();

    @ObfuscatedName("z.f(B)V")
    public static void method121() {
        Object var0 = field2516;
        synchronized (field2516) {
            if (field2517 == 0) {
                Statics.field1010.method1438(new class155(), 5);
            }
            field2517 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class175 var1 = field2518;
                class154 var2;
                synchronized (field2518) {
                    var2 = (class154) field2518.method3145();
                }
                if (var2 == null) {
                    class126.method2308(100L);
                    Object var10 = field2516;
                    synchronized (field2516) {
                        if (field2517 <= 1) {
                            field2517 = 0;
                            field2516.notifyAll();
                            return;
                        }
                        field2517--;
                    }
                } else {
                    if (var2.field2511 == 0) {
                        var2.field2508.method1350((int) var2.field2759, var2.field2507, var2.field2507.length);
                        class175 var4 = field2518;
                        synchronized (field2518) {
                            var2.method3182();
                        }
                    } else if (var2.field2511 == 1) {
                        var2.field2507 = var2.field2508.method1359((int) var2.field2759);
                        class175 var6 = field2518;
                        synchronized (field2518) {
                            field2514.method3147(var2);
                        }
                    }
                    Object var8 = field2516;
                    synchronized (field2516) {
                        if (field2517 <= 1) {
                            field2517 = 0;
                            field2516.notifyAll();
                            return;
                        }
                        field2517 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class79.method848((String) null, var18);
        }
    }

    @ObfuscatedName("p.y(S)V")
    public static void method102() {
        Object var0 = field2516;
        synchronized (field2516) {
            if (field2517 != 0) {
                field2517 = 1;
                try {
                    field2516.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
