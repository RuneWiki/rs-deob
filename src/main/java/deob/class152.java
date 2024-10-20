package deob;

@ObfuscatedName("eo")
public class class152 implements Runnable {

    @ObfuscatedName("eo.e")
    public static class180 field2514 = new class180();

    @ObfuscatedName("eo.v")
    public static class180 field2509 = new class180();

    @ObfuscatedName("eo.k")
    public static int field2510 = 0;

    @ObfuscatedName("eo.g")
    public static Object field2511 = new Object();

    @ObfuscatedName("az.g(ILdm;Lej;I)V")
    public static void method776(int arg0, class123 arg1, class150 arg2) {
        byte[] var3 = null;
        class180 var4 = field2514;
        synchronized (field2514) {
            for (class151 var5 = (class151) field2514.method3226(); var5 != null; var5 = (class151) field2514.method3231()) {
                if ((long) arg0 == var5.field2894 && var5.field2502 == arg1 && var5.field2500 == 0) {
                    var3 = var5.field2499;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2470(arg0);
            arg2.method2806(arg1, arg0, var7, true);
        } else {
            arg2.method2806(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class180 var1 = field2514;
                class151 var2;
                synchronized (field2514) {
                    var2 = (class151) field2514.method3226();
                }
                if (var2 == null) {
                    class116.method7(100L);
                    Object var10 = field2511;
                    synchronized (field2511) {
                        if (field2510 <= 1) {
                            field2510 = 0;
                            field2511.notifyAll();
                            return;
                        }
                        field2510--;
                    }
                } else {
                    if (var2.field2500 == 0) {
                        var2.field2502.method2471((int) var2.field2894, var2.field2499, var2.field2499.length);
                        class180 var4 = field2514;
                        synchronized (field2514) {
                            var2.method3324();
                        }
                    } else if (var2.field2500 == 1) {
                        var2.field2499 = var2.field2502.method2470((int) var2.field2894);
                        class180 var6 = field2514;
                        synchronized (field2514) {
                            field2509.method3224(var2);
                        }
                    }
                    Object var8 = field2511;
                    synchronized (field2511) {
                        if (field2510 <= 1) {
                            field2510 = 0;
                            field2511.notifyAll();
                            return;
                        }
                        field2510 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class137.method101((String) null, var18);
        }
    }
}
