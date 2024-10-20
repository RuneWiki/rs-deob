package deob;

@ObfuscatedName("fj")
public class class157 implements Runnable {

    @ObfuscatedName("fj.g")
    public static class177 field2556 = new class177();

    @ObfuscatedName("fj.m")
    public static class177 field2555 = new class177();

    @ObfuscatedName("fj.v")
    public static int field2557 = 0;

    @ObfuscatedName("fj.r")
    public static Object field2558 = new Object();

    @ObfuscatedName("cw.v(B)V")
    public static void method1616() {
        Object var0 = field2558;
        synchronized (field2558) {
            if (field2557 == 0) {
                Statics.field1457.method1498(new class157(), 5);
            }
            field2557 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2556;
                class156 var2;
                synchronized (field2556) {
                    var2 = (class156) field2556.method3321();
                }
                if (var2 == null) {
                    class126.method209(100L);
                    Object var10 = field2558;
                    synchronized (field2558) {
                        if (field2557 <= 1) {
                            field2557 = 0;
                            field2558.notifyAll();
                            return;
                        }
                        field2557--;
                    }
                } else {
                    if (var2.field2553 == 0) {
                        var2.field2550.method1411((int) var2.field2814, var2.field2551, var2.field2551.length);
                        class177 var4 = field2556;
                        synchronized (field2556) {
                            var2.method3346();
                        }
                    } else if (var2.field2553 == 1) {
                        var2.field2551 = var2.field2550.method1421((int) var2.field2814);
                        class177 var6 = field2556;
                        synchronized (field2556) {
                            field2555.method3326(var2);
                        }
                    }
                    Object var8 = field2558;
                    synchronized (field2558) {
                        if (field2557 <= 1) {
                            field2557 = 0;
                            field2558.notifyAll();
                            return;
                        }
                        field2557 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method815((String) null, var18);
        }
    }
}
