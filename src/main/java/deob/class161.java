package deob;

@ObfuscatedName("fl")
public class class161 implements Runnable {

    @ObfuscatedName("fl.t")
    public static class190 field2591 = new class190();

    @ObfuscatedName("fl.b")
    public static class190 field2590 = new class190();

    @ObfuscatedName("fl.p")
    public static int field2594 = 0;

    @ObfuscatedName("fl.e")
    public static Object field2592 = new Object();

    @ObfuscatedName("ge.b(I[BLdg;I)V")
    public static void method3517(int arg0, byte[] arg1, class126 arg2) {
        class160 var3 = new class160();
        var3.field2583 = 0;
        var3.field3015 = (long) arg0;
        var3.field2580 = arg1;
        var3.field2581 = arg2;
        class190 var4 = field2591;
        synchronized (field2591) {
            field2591.method3442(var3);
        }
        Object var6 = field2592;
        synchronized (field2592) {
            if (field2594 == 0) {
                Statics.field957.method2551(new class161(), 5);
            }
            field2594 = 600;
        }
    }

    @ObfuscatedName("f.p(ILdg;Lfv;B)V")
    public static void method94(int arg0, class126 arg1, class159 arg2) {
        byte[] var3 = null;
        class190 var4 = field2591;
        synchronized (field2591) {
            for (class160 var5 = (class160) field2591.method3415(); var5 != null; var5 = (class160) field2591.method3419()) {
                if ((long) arg0 == var5.field3015 && var5.field2581 == arg1 && var5.field2583 == 0) {
                    var3 = var5.field2580;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2527(arg0);
            arg2.method2957(arg1, arg0, var7, true);
        } else {
            arg2.method2957(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("co.e(B)V")
    public static void method2101() {
        while (true) {
            class190 var0 = field2591;
            class160 var1;
            synchronized (field2591) {
                var1 = (class160) field2590.method3421();
            }
            if (var1 == null) {
                return;
            }
            var1.field2584.method2957(var1.field2581, (int) var1.field3015, var1.field2580, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class190 var1 = field2591;
                class160 var2;
                synchronized (field2591) {
                    var2 = (class160) field2591.method3415();
                }
                if (var2 == null) {
                    class119.method172(100L);
                    Object var10 = field2592;
                    synchronized (field2592) {
                        if (field2594 <= 1) {
                            field2594 = 0;
                            field2592.notifyAll();
                            return;
                        }
                        field2594--;
                    }
                } else {
                    if (var2.field2583 == 0) {
                        var2.field2581.method2529((int) var2.field3015, var2.field2580, var2.field2580.length);
                        class190 var4 = field2591;
                        synchronized (field2591) {
                            var2.method3506();
                        }
                    } else if (var2.field2583 == 1) {
                        var2.field2580 = var2.field2581.method2527((int) var2.field3015);
                        class190 var6 = field2591;
                        synchronized (field2591) {
                            field2590.method3442(var2);
                        }
                    }
                    Object var8 = field2592;
                    synchronized (field2592) {
                        if (field2594 <= 1) {
                            field2594 = 0;
                            field2592.notifyAll();
                            return;
                        }
                        field2594 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class140.method2756((String) null, var18);
        }
    }
}
