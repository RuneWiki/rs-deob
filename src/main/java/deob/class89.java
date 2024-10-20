package deob;

@ObfuscatedName("cw")
public class class89 implements Runnable {

    @ObfuscatedName("cw.q")
    public static class105 field1213 = new class105();

    @ObfuscatedName("cw.l")
    public static class105 field1211 = new class105();

    @ObfuscatedName("cw.a")
    public static int field1212 = 0;

    @ObfuscatedName("cw.o")
    public static Object field1214 = new Object();

    @ObfuscatedName("an.a(I[BLar;I)V")
    public static void method429(int arg0, byte[] arg1, class33 arg2) {
        class140 var3 = new class140();
        var3.field1764 = 0;
        var3.field1513 = (long) arg0;
        var3.field1763 = arg1;
        var3.field1762 = arg2;
        class105 var4 = field1213;
        synchronized (field1213) {
            field1213.method1293(var3);
        }
        method343();
    }

    @ObfuscatedName("ax.o(ILar;Ldc;I)V")
    public static void method521(int arg0, class33 arg1, class121 arg2) {
        class140 var3 = new class140();
        var3.field1764 = 1;
        var3.field1513 = (long) arg0;
        var3.field1762 = arg1;
        var3.field1765 = arg2;
        class105 var4 = field1213;
        synchronized (field1213) {
            field1213.method1293(var3);
        }
        method343();
    }

    @ObfuscatedName("aa.c(I)V")
    public static void method343() {
        Object var0 = field1214;
        synchronized (field1214) {
            if (field1212 == 0) {
                Statics.field1551.method426(new class89(), 5);
            }
            field1212 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class105 var1 = field1213;
                class140 var2;
                synchronized (field1213) {
                    var2 = (class140) field1213.method1298();
                }
                if (var2 == null) {
                    class68.method86(100L);
                    Object var10 = field1214;
                    synchronized (field1214) {
                        if (field1212 <= 1) {
                            field1212 = 0;
                            field1214.notifyAll();
                            return;
                        }
                        field1212--;
                    }
                } else {
                    if (var2.field1764 == 0) {
                        var2.field1762.method388((int) var2.field1513, var2.field1763, var2.field1763.length);
                        class105 var4 = field1213;
                        synchronized (field1213) {
                            var2.method1328();
                        }
                    } else if (var2.field1764 == 1) {
                        var2.field1763 = var2.field1762.method387((int) var2.field1513);
                        class105 var6 = field1213;
                        synchronized (field1213) {
                            field1211.method1293(var2);
                        }
                    }
                    Object var8 = field1214;
                    synchronized (field1214) {
                        if (field1212 <= 1) {
                            field1212 = 0;
                            field1214.notifyAll();
                            return;
                        }
                        field1212 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            Statics.method244((String) null, var18);
        }
    }
}
