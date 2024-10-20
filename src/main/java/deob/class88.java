package deob;

@ObfuscatedName("ct")
public class class88 implements Runnable {

    @ObfuscatedName("ct.t")
    public static class104 field1201 = new class104();

    @ObfuscatedName("ct.n")
    public static class104 field1199 = new class104();

    @ObfuscatedName("ct.q")
    public static int field1200 = 0;

    @ObfuscatedName("ct.h")
    public static Object field1198 = new Object();

    @ObfuscatedName("dj.h(ILam;Ldy;I)V")
    public static void method1482(int arg0, class32 arg1, class120 arg2) {
        byte[] var3 = null;
        class104 var4 = field1201;
        synchronized (field1201) {
            for (class139 var5 = (class139) field1201.method1305(); var5 != null; var5 = (class139) field1201.method1287()) {
                if ((long) arg0 == var5.field1500 && var5.field1762 == arg1 && var5.field1764 == 0) {
                    var3 = var5.field1763;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method401(arg0);
            arg2.method1447(arg1, arg0, var7, true);
        } else {
            arg2.method1447(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class104 var1 = field1201;
                class139 var2;
                synchronized (field1201) {
                    var2 = (class139) field1201.method1305();
                }
                if (var2 == null) {
                    Statics.method101(100L);
                    Object var10 = field1198;
                    synchronized (field1198) {
                        if (field1200 <= 1) {
                            field1200 = 0;
                            field1198.notifyAll();
                            return;
                        }
                        field1200--;
                    }
                } else {
                    if (var2.field1764 == 0) {
                        var2.field1762.method406((int) var2.field1500, var2.field1763, var2.field1763.length);
                        class104 var4 = field1201;
                        synchronized (field1201) {
                            var2.method1307();
                        }
                    } else if (var2.field1764 == 1) {
                        var2.field1763 = var2.field1762.method401((int) var2.field1500);
                        class104 var6 = field1201;
                        synchronized (field1201) {
                            field1199.method1284(var2);
                        }
                    }
                    Object var8 = field1198;
                    synchronized (field1198) {
                        if (field1200 <= 1) {
                            field1200 = 0;
                            field1198.notifyAll();
                            return;
                        }
                        field1200 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class169.method255((String) null, var18);
        }
    }
}
