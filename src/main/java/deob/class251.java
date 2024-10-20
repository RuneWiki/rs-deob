package deob;

@ObfuscatedName("iq")
public class class251 implements Runnable {

    @ObfuscatedName("iq.f")
    public static class208 field3232 = new class208();

    @ObfuscatedName("iq.h")
    public static class208 field3236 = new class208();

    @ObfuscatedName("iq.e")
    public static int field3233 = 0;

    @ObfuscatedName("iq.b")
    public static Object field3234 = new Object();

    public void run() {
        try {
            while (true) {
                class208 var1 = field3232;
                class248 var2;
                synchronized (field3232) {
                    var2 = (class248) field3232.method3823();
                }
                if (var2 == null) {
                    class194.method3013(100L);
                    Object var10 = field3234;
                    synchronized (field3234) {
                        if (field3233 <= 1) {
                            field3233 = 0;
                            field3234.notifyAll();
                            return;
                        }
                        field3233--;
                    }
                } else {
                    if (var2.field3202 == 0) {
                        var2.field3205.method3138((int) var2.field2486, var2.field3201, var2.field3201.length);
                        class208 var4 = field3232;
                        synchronized (field3232) {
                            var2.method3812();
                        }
                    } else if (var2.field3202 == 1) {
                        var2.field3201 = var2.field3205.method3137((int) var2.field2486);
                        class208 var6 = field3232;
                        synchronized (field3232) {
                            field3236.method3831(var2);
                        }
                    }
                    Object var8 = field3234;
                    synchronized (field3234) {
                        if (field3233 <= 1) {
                            field3233 = 0;
                            field3234.notifyAll();
                            return;
                        }
                        field3233 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class155.method1834((String) null, var18);
        }
    }

    @ObfuscatedName("d.h(B)V")
    public static void method77() {
        Object var0 = field3234;
        synchronized (field3234) {
            if (field3233 != 0) {
                field3233 = 1;
                try {
                    field3234.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
