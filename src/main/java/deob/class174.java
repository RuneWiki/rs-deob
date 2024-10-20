package deob;

@ObfuscatedName("fx")
public class class174 implements Runnable {

    @ObfuscatedName("fx.a")
    public static class203 field2775 = new class203();

    @ObfuscatedName("fx.d")
    public static class203 field2774 = new class203();

    @ObfuscatedName("fx.v")
    public static int field2778 = 0;

    @ObfuscatedName("fx.r")
    public static Object field2773 = new Object();

    @ObfuscatedName("fl.d(I[BLes;B)V")
    public static void method3015(int arg0, byte[] arg1, class138 arg2) {
        class173 var3 = new class173();
        var3.field2768 = 0;
        var3.field3171 = (long) arg0;
        var3.field2763 = arg1;
        var3.field2764 = arg2;
        class203 var4 = field2775;
        synchronized (field2775) {
            field2775.method3612(var3);
        }
        Statics.method3047();
    }

    public void run() {
        try {
            while (true) {
                class203 var1 = field2775;
                class173 var2;
                synchronized (field2775) {
                    var2 = (class173) field2775.method3617();
                }
                if (var2 == null) {
                    class131.method674(100L);
                    Object var10 = field2773;
                    synchronized (field2773) {
                        if (field2778 <= 1) {
                            field2778 = 0;
                            field2773.notifyAll();
                            return;
                        }
                        field2778--;
                    }
                } else {
                    if (var2.field2768 == 0) {
                        var2.field2764.method2761((int) var2.field3171, var2.field2763, var2.field2763.length);
                        class203 var4 = field2775;
                        synchronized (field2775) {
                            var2.method3729();
                        }
                    } else if (var2.field2768 == 1) {
                        var2.field2763 = var2.field2764.method2763((int) var2.field3171);
                        class203 var6 = field2775;
                        synchronized (field2775) {
                            field2774.method3612(var2);
                        }
                    }
                    Object var8 = field2773;
                    synchronized (field2773) {
                        if (field2778 <= 1) {
                            field2778 = 0;
                            field2773.notifyAll();
                            return;
                        }
                        field2778 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class152.method2703((String) null, var18);
        }
    }
}
