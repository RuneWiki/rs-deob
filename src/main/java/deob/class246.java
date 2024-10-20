package deob;

@ObfuscatedName("il")
public class class246 implements Runnable {

    @ObfuscatedName("il.f")
    public static class273 field3179 = new class273();

    @ObfuscatedName("il.b")
    public static class273 field3175 = new class273();

    @ObfuscatedName("il.l")
    public static int field3177 = 0;

    @ObfuscatedName("il.m")
    public static Object field3176 = new Object();

    @ObfuscatedName("es.f(I[BLlt;I)V")
    public static void method3133(int arg0, byte[] arg1, class319 arg2) {
        class243 var3 = new class243();
        var3.field3150 = 0;
        var3.field2140 = (long) arg0;
        var3.field3149 = arg1;
        var3.field3151 = arg2;
        class273 var4 = field3179;
        synchronized (field3179) {
            field3179.method4639(var3);
        }
        Object var6 = field3176;
        synchronized (field3176) {
            if (field3177 == 0) {
                Statics.field1355 = new Thread(new class246());
                Statics.field1355.setDaemon(true);
                Statics.field1355.start();
                Statics.field1355.setPriority(5);
            }
            field3177 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class273 var1 = field3179;
                class243 var2;
                synchronized (field3179) {
                    var2 = (class243) field3179.method4638();
                }
                if (var2 == null) {
                    class309.method735(100L);
                    Object var10 = field3176;
                    synchronized (field3176) {
                        if (field3177 <= 1) {
                            field3177 = 0;
                            field3176.notifyAll();
                            return;
                        }
                        field3177--;
                    }
                } else {
                    if (var2.field3150 == 0) {
                        var2.field3151.method5502((int) var2.field2140, var2.field3149, var2.field3149.length);
                        class273 var4 = field3179;
                        synchronized (field3179) {
                            var2.method3407();
                        }
                    } else if (var2.field3150 == 1) {
                        var2.field3149 = var2.field3151.method5503((int) var2.field2140);
                        class273 var6 = field3179;
                        synchronized (field3179) {
                            field3175.method4639(var2);
                        }
                    }
                    Object var8 = field3176;
                    synchronized (field3176) {
                        if (field3177 <= 1) {
                            field3177 = 0;
                            field3176.notifyAll();
                            return;
                        }
                        field3177 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class352.method2205((String) null, var18);
        }
    }
}
