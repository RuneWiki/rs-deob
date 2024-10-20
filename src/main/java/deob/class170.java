package deob;

@ObfuscatedName("fq")
public class class170 implements Runnable {

    @ObfuscatedName("fq.h")
    public static class199 field2698 = new class199();

    @ObfuscatedName("fq.m")
    public static class199 field2695 = new class199();

    @ObfuscatedName("fq.i")
    public static int field2693 = 0;

    @ObfuscatedName("fq.q")
    public static Object field2692 = new Object();

    @ObfuscatedName("eh.i(I[BLel;I)V")
    public static void method2654(int arg0, byte[] arg1, class134 arg2) {
        class169 var3 = new class169();
        var3.field2685 = 0;
        var3.field3100 = (long) arg0;
        var3.field2689 = arg1;
        var3.field2686 = arg2;
        class199 var4 = field2698;
        synchronized (field2698) {
            field2698.method3541(var3);
        }
        Object var6 = field2692;
        synchronized (field2692) {
            if (field2693 == 0) {
                Statics.field1935.method2689(new class170(), 5);
            }
            field2693 = 600;
        }
    }

    @ObfuscatedName("cd.q(ILel;Lfb;B)V")
    public static void method1934(int arg0, class134 arg1, class168 arg2) {
        class169 var3 = new class169();
        var3.field2685 = 1;
        var3.field3100 = (long) arg0;
        var3.field2686 = arg1;
        var3.field2687 = arg2;
        class199 var4 = field2698;
        synchronized (field2698) {
            field2698.method3541(var3);
        }
        Object var6 = field2692;
        synchronized (field2692) {
            if (field2693 == 0) {
                Statics.field1935.method2689(new class170(), 5);
            }
            field2693 = 600;
        }
    }

    @ObfuscatedName("em.p(ILel;Lfb;B)V")
    public static void method2791(int arg0, class134 arg1, class168 arg2) {
        byte[] var3 = null;
        class199 var4 = field2698;
        synchronized (field2698) {
            for (class169 var5 = (class169) field2698.method3546(); var5 != null; var5 = (class169) field2698.method3548()) {
                if ((long) arg0 == var5.field3100 && var5.field2686 == arg1 && var5.field2685 == 0) {
                    var3 = var5.field2689;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2665(arg0);
            arg2.method3086(arg1, arg0, var7, true);
        } else {
            arg2.method3086(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class199 var1 = field2698;
                class169 var2;
                synchronized (field2698) {
                    var2 = (class169) field2698.method3546();
                }
                if (var2 == null) {
                    class127.method952(100L);
                    Object var10 = field2692;
                    synchronized (field2692) {
                        if (field2693 <= 1) {
                            field2693 = 0;
                            field2692.notifyAll();
                            return;
                        }
                        field2693--;
                    }
                } else {
                    if (var2.field2685 == 0) {
                        var2.field2686.method2666((int) var2.field3100, var2.field2689, var2.field2689.length);
                        class199 var4 = field2698;
                        synchronized (field2698) {
                            var2.method3625();
                        }
                    } else if (var2.field2685 == 1) {
                        var2.field2689 = var2.field2686.method2665((int) var2.field3100);
                        class199 var6 = field2698;
                        synchronized (field2698) {
                            field2695.method3541(var2);
                        }
                    }
                    Object var8 = field2692;
                    synchronized (field2692) {
                        if (field2693 <= 1) {
                            field2693 = 0;
                            field2692.notifyAll();
                            return;
                        }
                        field2693 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class148.method2106((String) null, var18);
        }
    }
}
