package deob;

@ObfuscatedName("eo")
public class class154 implements Runnable {

    @ObfuscatedName("eo.b")
    public static class182 field2520 = new class182();

    @ObfuscatedName("eo.e")
    public static class182 field2514 = new class182();

    @ObfuscatedName("eo.i")
    public static int field2513 = 0;

    @ObfuscatedName("eo.k")
    public static Object field2515 = new Object();

    @ObfuscatedName("ei.e(ILdm;Len;I)V")
    public static void method2736(int arg0, class125 arg1, class152 arg2) {
        byte[] var3 = null;
        class182 var4 = field2520;
        synchronized (field2520) {
            for (class153 var5 = (class153) field2520.method3293(); var5 != null; var5 = (class153) field2520.method3288()) {
                if ((long) arg0 == var5.field2905 && var5.field2509 == arg1 && var5.field2508 == 0) {
                    var3 = var5.field2512;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2487(arg0);
            arg2.method2849(arg1, arg0, var7, true);
        } else {
            arg2.method2849(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class182 var1 = field2520;
                class153 var2;
                synchronized (field2520) {
                    var2 = (class153) field2520.method3293();
                }
                if (var2 == null) {
                    class118.method2490(100L);
                    Object var10 = field2515;
                    synchronized (field2515) {
                        if (field2513 <= 1) {
                            field2513 = 0;
                            field2515.notifyAll();
                            return;
                        }
                        field2513--;
                    }
                } else {
                    if (var2.field2508 == 0) {
                        var2.field2509.method2480((int) var2.field2905, var2.field2512, var2.field2512.length);
                        class182 var4 = field2520;
                        synchronized (field2520) {
                            var2.method3392();
                        }
                    } else if (var2.field2508 == 1) {
                        var2.field2512 = var2.field2509.method2487((int) var2.field2905);
                        class182 var6 = field2520;
                        synchronized (field2520) {
                            field2514.method3302(var2);
                        }
                    }
                    Object var8 = field2515;
                    synchronized (field2515) {
                        if (field2513 <= 1) {
                            field2513 = 0;
                            field2515.notifyAll();
                            return;
                        }
                        field2513 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class139.method1404((String) null, var18);
        }
    }

    @ObfuscatedName("ah.i(I)V")
    public static void method571() {
        Object var0 = field2515;
        synchronized (field2515) {
            if (field2513 != 0) {
                field2513 = 1;
                try {
                    field2515.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
