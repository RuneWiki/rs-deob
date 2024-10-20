package deob;

@ObfuscatedName("gr")
public class class184 implements Runnable {

    @ObfuscatedName("gr.b")
    public static class129 field2735 = new class129();

    @ObfuscatedName("gr.e")
    public static class129 field2739 = new class129();

    @ObfuscatedName("gr.c")
    public static int field2736 = 0;

    @ObfuscatedName("gr.l")
    public static Object field2734 = new Object();

    @ObfuscatedName("bv.l(I[BLdg;I)V")
    public static void method1140(int arg0, byte[] arg1, class117 arg2) {
        class181 var3 = new class181();
        var3.field2701 = 0;
        var3.field1864 = (long) arg0;
        var3.field2704 = arg1;
        var3.field2703 = arg2;
        class129 var4 = field2735;
        synchronized (field2735) {
            field2735.method2308(var3);
        }
        method2906();
    }

    @ObfuscatedName("ff.y(B)V")
    public static void method2906() {
        Object var0 = field2734;
        synchronized (field2734) {
            if (field2736 == 0) {
                Statics.field2640.method1905(new class184(), 5);
            }
            field2736 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class129 var1 = field2735;
                class181 var2;
                synchronized (field2735) {
                    var2 = (class181) field2735.method2315();
                }
                if (var2 == null) {
                    class162.method2120(100L);
                    Object var10 = field2734;
                    synchronized (field2734) {
                        if (field2736 <= 1) {
                            field2736 = 0;
                            field2734.notifyAll();
                            return;
                        }
                        field2736--;
                    }
                } else {
                    if (var2.field2701 == 0) {
                        var2.field2703.method2151((int) var2.field1864, var2.field2704, var2.field2704.length);
                        class129 var4 = field2735;
                        synchronized (field2735) {
                            var2.method2298();
                        }
                    } else if (var2.field2701 == 1) {
                        var2.field2704 = var2.field2703.method2153((int) var2.field1864);
                        class129 var6 = field2735;
                        synchronized (field2735) {
                            field2739.method2308(var2);
                        }
                    }
                    Object var8 = field2734;
                    synchronized (field2734) {
                        if (field2736 <= 1) {
                            field2736 = 0;
                            field2734.notifyAll();
                            return;
                        }
                        field2736 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class102.method24((String) null, var18);
        }
    }
}
