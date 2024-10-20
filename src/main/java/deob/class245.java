package deob;

@ObfuscatedName("ip")
public class class245 implements Runnable {

    @ObfuscatedName("ip.m")
    public static class272 field3187 = new class272();

    @ObfuscatedName("ip.o")
    public static class272 field3183 = new class272();

    @ObfuscatedName("ip.q")
    public static int field3182 = 0;

    @ObfuscatedName("ip.j")
    public static Object field3185 = new Object();

    @ObfuscatedName("ct.m(I[BLlp;B)V")
    public static void method2048(int arg0, byte[] arg1, class318 arg2) {
        class242 var3 = new class242();
        var3.field3153 = 0;
        var3.field2152 = (long) arg0;
        var3.field3151 = arg1;
        var3.field3150 = arg2;
        class272 var4 = field3187;
        synchronized (field3187) {
            field3187.method4644(var3);
        }
        Object var6 = field3185;
        synchronized (field3185) {
            if (field3182 == 0) {
                Statics.field3186 = new Thread(new class245());
                Statics.field3186.setDaemon(true);
                Statics.field3186.start();
                Statics.field3186.setPriority(5);
            }
            field3182 = 600;
        }
    }

    @ObfuscatedName("ho.o(ILlp;Lig;B)V")
    public static void method3859(int arg0, class318 arg1, class246 arg2) {
        class242 var3 = new class242();
        var3.field3153 = 1;
        var3.field2152 = (long) arg0;
        var3.field3150 = arg1;
        var3.field3152 = arg2;
        class272 var4 = field3187;
        synchronized (field3187) {
            field3187.method4644(var3);
        }
        Object var6 = field3185;
        synchronized (field3185) {
            if (field3182 == 0) {
                Statics.field3186 = new Thread(new class245());
                Statics.field3186.setDaemon(true);
                Statics.field3186.start();
                Statics.field3186.setPriority(5);
            }
            field3182 = 600;
        }
    }

    @ObfuscatedName("at.q(ILlp;Lig;I)V")
    public static void method571(int arg0, class318 arg1, class246 arg2) {
        byte[] var3 = null;
        class272 var4 = field3187;
        synchronized (field3187) {
            for (class242 var5 = (class242) field3187.method4651(); var5 != null; var5 = (class242) field3187.method4656()) {
                if ((long) arg0 == var5.field2152 && var5.field3150 == arg1 && var5.field3153 == 0) {
                    var3 = var5.field3151;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5561(arg0);
            arg2.method4040(arg1, arg0, var7, true);
        } else {
            arg2.method4040(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("go.j(I)V")
    public static void method3401() {
        while (true) {
            class272 var0 = field3187;
            class242 var1;
            synchronized (field3187) {
                var1 = (class242) field3183.method4653();
            }
            if (var1 == null) {
                return;
            }
            var1.field3152.method4040(var1.field3150, (int) var1.field2152, var1.field3151, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class272 var1 = field3187;
                class242 var2;
                synchronized (field3187) {
                    var2 = (class242) field3187.method4651();
                }
                if (var2 == null) {
                    class308.method3708(99L);
                    class308.method3708(1L);
                    Object var10 = field3185;
                    synchronized (field3185) {
                        if (field3182 <= 1) {
                            field3182 = 0;
                            field3185.notifyAll();
                            return;
                        }
                        field3182--;
                    }
                } else {
                    if (var2.field3153 == 0) {
                        var2.field3150.method5560((int) var2.field2152, var2.field3151, var2.field3151.length);
                        class272 var4 = field3187;
                        synchronized (field3187) {
                            var2.method3388();
                        }
                    } else if (var2.field3153 == 1) {
                        var2.field3151 = var2.field3150.method5561((int) var2.field2152);
                        class272 var6 = field3187;
                        synchronized (field3187) {
                            field3183.method4644(var2);
                        }
                    }
                    Object var8 = field3185;
                    synchronized (field3185) {
                        if (field3182 <= 1) {
                            field3182 = 0;
                            field3185.notifyAll();
                            return;
                        }
                        field3182 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class351.method3425((String) null, var18);
        }
    }

    @ObfuscatedName("af.p(I)V")
    public static void method570() {
        Object var0 = field3185;
        synchronized (field3185) {
            if (field3182 != 0) {
                field3182 = 1;
                try {
                    field3185.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
