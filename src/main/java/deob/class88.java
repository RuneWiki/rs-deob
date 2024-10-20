package deob;

@ObfuscatedName("cc")
public class class88 implements Runnable {

    @ObfuscatedName("cc.r")
    public static class104 field1208 = new class104();

    @ObfuscatedName("cc.d")
    public static class104 field1206 = new class104();

    @ObfuscatedName("cc.l")
    public static int field1205 = 0;

    @ObfuscatedName("cc.m")
    public static Object field1207 = new Object();

    public void run() {
        try {
            while (true) {
                class104 var1 = field1208;
                class139 var2;
                synchronized (field1208) {
                    var2 = (class139) field1208.method1297();
                }
                if (var2 == null) {
                    class67.method1020(100L);
                    Object var10 = field1207;
                    synchronized (field1207) {
                        if (field1205 <= 1) {
                            field1205 = 0;
                            field1207.notifyAll();
                            return;
                        }
                        field1205--;
                    }
                } else {
                    if (var2.field1772 == 0) {
                        var2.field1770.method410((int) var2.field1506, var2.field1771, var2.field1771.length);
                        class104 var4 = field1208;
                        synchronized (field1208) {
                            var2.method1325();
                        }
                    } else if (var2.field1772 == 1) {
                        var2.field1771 = var2.field1770.method418((int) var2.field1506);
                        class104 var6 = field1208;
                        synchronized (field1208) {
                            field1206.method1292(var2);
                        }
                    }
                    Object var8 = field1207;
                    synchronized (field1207) {
                        if (field1205 <= 1) {
                            field1205 = 0;
                            field1207.notifyAll();
                            return;
                        }
                        field1205 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class169.method1490((String) null, var18);
        }
    }

    @ObfuscatedName("bv.c(B)V")
    public static void method781() {
        Object var0 = field1207;
        synchronized (field1207) {
            if (field1205 != 0) {
                field1205 = 1;
                try {
                    field1207.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
