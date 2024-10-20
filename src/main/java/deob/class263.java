package deob;

@ObfuscatedName("jr")
public class class263 implements Runnable {

    @ObfuscatedName("jr.c")
    public static class218 field3388 = new class218();

    @ObfuscatedName("jr.i")
    public static class218 field3386 = new class218();

    @ObfuscatedName("jr.o")
    public static int field3390 = 0;

    @ObfuscatedName("jr.j")
    public static Object field3387 = new Object();

    @ObfuscatedName("ib.c(I[BLfa;I)V")
    public static void method4109(int arg0, byte[] arg1, class175 arg2) {
        class260 var3 = new class260();
        var3.field3360 = 0;
        var3.field2645 = (long) arg0;
        var3.field3357 = arg1;
        var3.field3359 = arg2;
        class218 var4 = field3388;
        synchronized (field3388) {
            field3388.method3716(var3);
        }
        Statics.method724();
    }

    @ObfuscatedName("hx.i(ILfa;Ljs;S)V")
    public static void method3806(int arg0, class175 arg1, class264 arg2) {
        class260 var3 = new class260();
        var3.field3360 = 1;
        var3.field2645 = (long) arg0;
        var3.field3359 = arg1;
        var3.field3358 = arg2;
        class218 var4 = field3388;
        synchronized (field3388) {
            field3388.method3716(var3);
        }
        Statics.method724();
    }

    @ObfuscatedName("ip.o(ILfa;Ljs;B)V")
    public static void method4090(int arg0, class175 arg1, class264 arg2) {
        byte[] var3 = null;
        class218 var4 = field3388;
        synchronized (field3388) {
            for (class260 var5 = (class260) field3388.method3723(); var5 != null; var5 = (class260) field3388.method3722()) {
                if ((long) arg0 == var5.field2645 && var5.field3359 == arg1 && var5.field3360 == 0) {
                    var3 = var5.field3357;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method3055(arg0);
            arg2.method4303(arg1, arg0, var7, true);
        } else {
            arg2.method4303(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class218 var1 = field3388;
                class260 var2;
                synchronized (field3388) {
                    var2 = (class260) field3388.method3723();
                }
                if (var2 == null) {
                    class204.method2982(100L);
                    Object var10 = field3387;
                    synchronized (field3387) {
                        if (field3390 <= 1) {
                            field3390 = 0;
                            field3387.notifyAll();
                            return;
                        }
                        field3390--;
                    }
                } else {
                    if (var2.field3360 == 0) {
                        var2.field3359.method3056((int) var2.field2645, var2.field3357, var2.field3357.length);
                        class218 var4 = field3388;
                        synchronized (field3388) {
                            var2.method3710();
                        }
                    } else if (var2.field3360 == 1) {
                        var2.field3357 = var2.field3359.method3055((int) var2.field2645);
                        class218 var6 = field3388;
                        synchronized (field3388) {
                            field3386.method3716(var2);
                        }
                    }
                    Object var8 = field3387;
                    synchronized (field3387) {
                        if (field3390 <= 1) {
                            field3390 = 0;
                            field3387.notifyAll();
                            return;
                        }
                        field3390 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class165.method2883((String) null, var18);
        }
    }
}
