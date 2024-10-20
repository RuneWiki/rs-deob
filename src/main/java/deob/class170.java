package deob;

@ObfuscatedName("fi")
public class class170 implements Runnable {

    @ObfuscatedName("fi.z")
    public static class199 field2698 = new class199();

    @ObfuscatedName("fi.q")
    public static class199 field2694 = new class199();

    @ObfuscatedName("fi.k")
    public static int field2695 = 0;

    @ObfuscatedName("fi.f")
    public static Object field2696 = new Object();

    @ObfuscatedName("ck.q(I[BLea;B)V")
    public static void method1987(int arg0, byte[] arg1, class134 arg2) {
        class169 var3 = new class169();
        var3.field2688 = 0;
        var3.field3102 = (long) arg0;
        var3.field2687 = arg1;
        var3.field2689 = arg2;
        class199 var4 = field2698;
        synchronized (field2698) {
            field2698.method3491(var3);
        }
        Object var6 = field2696;
        synchronized (field2696) {
            if (field2695 == 0) {
                Statics.field606.method2675(new class170(), 5);
            }
            field2695 = 600;
        }
    }

    @ObfuscatedName("as.k(ILea;Lfz;I)V")
    public static void method927(int arg0, class134 arg1, class168 arg2) {
        class169 var3 = new class169();
        var3.field2688 = 1;
        var3.field3102 = (long) arg0;
        var3.field2689 = arg1;
        var3.field2691 = arg2;
        class199 var4 = field2698;
        synchronized (field2698) {
            field2698.method3491(var3);
        }
        Object var6 = field2696;
        synchronized (field2696) {
            if (field2695 == 0) {
                Statics.field606.method2675(new class170(), 5);
            }
            field2695 = 600;
        }
    }

    @ObfuscatedName("e.f(ILea;Lfz;I)V")
    public static void method217(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2698;
        synchronized (field2698) {
            for (class169 var5 = (class169) field2698.method3502(); var5 != null; var5 = (class169) field2698.method3489()) {
                if ((long) arg0 == var5.field3102 && var5.field2689 == arg1 && var5.field2688 == 0) {
                    var3 = var5.field2687;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2658(arg0);
            arg2.method3072(arg1, arg0, var7, true);
        } else {
            arg2.method3072(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2698;
                class169 var2;
                synchronized (field2698) {
                    var2 = (class169) field2698.method3502();
                }
                if (var2 == null) {
                    class127.method712(100L);
                    Object var10 = field2696;
                    synchronized (field2696) {
                        if (field2695 <= 1) {
                            field2695 = 0;
                            field2696.notifyAll();
                            return;
                        }
                        field2695--;
                    }
                } else {
                    if (var2.field2688 == 0) {
                        var2.field2689.method2659((int) var2.field3102, var2.field2687, var2.field2687.length);
                        class199 var4 = field2698;
                        synchronized (field2698) {
                            var2.method3583();
                        }
                    } else if (var2.field2688 == 1) {
                        var2.field2687 = var2.field2689.method2658((int) var2.field3102);
                        class199 var6 = field2698;
                        synchronized (field2698) {
                            field2694.method3491(var2);
                        }
                    }
                    Object var8 = field2696;
                    synchronized (field2696) {
                        if (field2695 <= 1) {
                            field2695 = 0;
                            field2696.notifyAll();
                            return;
                        }
                        field2695 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method623((String) null, var18);
        }
    }

    @ObfuscatedName("ao.d(I)V")
    public static void method865() {
        Object var0 = field2696;
        synchronized (field2696) {
            if (field2695 != 0) {
                field2695 = 1;
                try {
                    field2696.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
