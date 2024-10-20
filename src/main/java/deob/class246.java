package deob;

@ObfuscatedName("if")
public class class246 implements Runnable {

    @ObfuscatedName("if.n")
    public static class273 field3192 = new class273();

    @ObfuscatedName("if.v")
    public static class273 field3187 = new class273();

    @ObfuscatedName("if.d")
    public static int field3188 = 0;

    @ObfuscatedName("if.c")
    public static Object field3189 = new Object();

    @ObfuscatedName("bh.n(ILlu;Liy;B)V")
    public static void method1080(int arg0, class319 arg1, class247 arg2) {
        class243 var3 = new class243();
        var3.field3162 = 1;
        var3.field2141 = (long) arg0;
        var3.field3160 = arg1;
        var3.field3161 = arg2;
        class273 var4 = field3192;
        synchronized (field3192) {
            field3192.method4699(var3);
        }
        Object var6 = field3189;
        synchronized (field3189) {
            if (field3188 == 0) {
                Statics.field3190 = new Thread(new class246());
                Statics.field3190.setDaemon(true);
                Statics.field3190.start();
                Statics.field3190.setPriority(5);
            }
            field3188 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class273 var1 = field3192;
                class243 var2;
                synchronized (field3192) {
                    var2 = (class243) field3192.method4721();
                }
                if (var2 == null) {
                    class309.method1173(100L);
                    Object var10 = field3189;
                    synchronized (field3189) {
                        if (field3188 <= 1) {
                            field3188 = 0;
                            field3189.notifyAll();
                            return;
                        }
                        field3188--;
                    }
                } else {
                    if (var2.field3162 == 0) {
                        var2.field3160.method5585((int) var2.field2141, var2.field3159, var2.field3159.length);
                        class273 var4 = field3192;
                        synchronized (field3192) {
                            var2.method3486();
                        }
                    } else if (var2.field3162 == 1) {
                        var2.field3159 = var2.field3160.method5583((int) var2.field2141);
                        class273 var6 = field3192;
                        synchronized (field3192) {
                            field3187.method4699(var2);
                        }
                    }
                    Object var8 = field3189;
                    synchronized (field3189) {
                        if (field3188 <= 1) {
                            field3188 = 0;
                            field3189.notifyAll();
                            return;
                        }
                        field3188 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class352.method4617((String) null, var18);
        }
    }
}
