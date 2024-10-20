package deob;

@ObfuscatedName("ez")
public class class152 implements Runnable {

    @ObfuscatedName("ez.f")
    public static class180 field2513 = new class180();

    @ObfuscatedName("ez.k")
    public static class180 field2512 = new class180();

    @ObfuscatedName("ez.y")
    public static int field2515 = 0;

    @ObfuscatedName("ez.e")
    public static Object field2514 = new Object();

    @ObfuscatedName("dc.e(I[BLdw;I)V")
    public static void method2393(int arg0, byte[] arg1, class123 arg2) {
        class151 var3 = new class151();
        var3.field2503 = 0;
        var3.field2882 = (long) arg0;
        var3.field2508 = arg1;
        var3.field2504 = arg2;
        class180 var4 = field2513;
        synchronized (field2513) {
            field2513.method3276(var3);
        }
        Object var6 = field2514;
        synchronized (field2514) {
            if (field2515 == 0) {
                Statics.field29.method2526(new class152(), 5);
            }
            field2515 = 600;
        }
    }

    @ObfuscatedName("ae.r(ILdw;Les;I)V")
    public static void method678(int arg0, class123 arg1, class150 arg2) {
        class151 var3 = new class151();
        var3.field2503 = 1;
        var3.field2882 = (long) arg0;
        var3.field2504 = arg1;
        var3.field2505 = arg2;
        class180 var4 = field2513;
        synchronized (field2513) {
            field2513.method3276(var3);
        }
        Object var6 = field2514;
        synchronized (field2514) {
            if (field2515 == 0) {
                Statics.field29.method2526(new class152(), 5);
            }
            field2515 = 600;
        }
    }

    @ObfuscatedName("az.a(ILdw;Les;S)V")
    public static void method1063(int arg0, class123 arg1, class150 arg2) {
        byte[] var3 = null;
        class180 var4 = field2513;
        synchronized (field2513) {
            for (class151 var5 = (class151) field2513.method3285(); var5 != null; var5 = (class151) field2513.method3286()) {
                if ((long) arg0 == var5.field2882 && var5.field2504 == arg1 && var5.field2503 == 0) {
                    var3 = var5.field2508;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2506(arg0);
            arg2.method2845(arg1, arg0, var7, true);
        } else {
            arg2.method2845(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class180 var1 = field2513;
                class151 var2;
                synchronized (field2513) {
                    var2 = (class151) field2513.method3285();
                }
                if (var2 == null) {
                    class116.method557(100L);
                    Object var10 = field2514;
                    synchronized (field2514) {
                        if (field2515 <= 1) {
                            field2515 = 0;
                            field2514.notifyAll();
                            return;
                        }
                        field2515--;
                    }
                } else {
                    if (var2.field2503 == 0) {
                        var2.field2504.method2508((int) var2.field2882, var2.field2508, var2.field2508.length);
                        class180 var4 = field2513;
                        synchronized (field2513) {
                            var2.method3367();
                        }
                    } else if (var2.field2503 == 1) {
                        var2.field2508 = var2.field2504.method2506((int) var2.field2882);
                        class180 var6 = field2513;
                        synchronized (field2513) {
                            field2512.method3276(var2);
                        }
                    }
                    Object var8 = field2514;
                    synchronized (field2514) {
                        if (field2515 <= 1) {
                            field2515 = 0;
                            field2514.notifyAll();
                            return;
                        }
                        field2515 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class137.method94((String) null, var18);
        }
    }
}
