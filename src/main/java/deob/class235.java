package deob;

@ObfuscatedName("ih")
public class class235 implements Runnable {

    @ObfuscatedName("ih.f")
    public static class262 field3122 = new class262();

    @ObfuscatedName("ih.i")
    public static class262 field3124 = new class262();

    @ObfuscatedName("ih.y")
    public static int field3121 = 0;

    @ObfuscatedName("ih.w")
    public static Object field3123 = new Object();

    @ObfuscatedName("kj.f(I[BLkg;B)V")
    public static void method5372(int arg0, byte[] arg1, class308 arg2) {
        class232 var3 = new class232();
        var3.field3094 = 0;
        var3.field2322 = (long) arg0;
        var3.field3095 = arg1;
        var3.field3096 = arg2;
        class262 var4 = field3122;
        synchronized (field3122) {
            field3122.method4554(var3);
        }
        Object var6 = field3123;
        synchronized (field3123) {
            if (field3121 == 0) {
                Statics.field3125 = new Thread(new class235());
                Statics.field3125.setDaemon(true);
                Statics.field3125.start();
                Statics.field3125.setPriority(5);
            }
            field3121 = 600;
        }
    }

    @ObfuscatedName("j.i(ILkg;Lif;I)V")
    public static void method166(int arg0, class308 arg1, class236 arg2) {
        class232 var3 = new class232();
        var3.field3094 = 1;
        var3.field2322 = (long) arg0;
        var3.field3096 = arg1;
        var3.field3098 = arg2;
        class262 var4 = field3122;
        synchronized (field3122) {
            field3122.method4554(var3);
        }
        method486();
    }

    @ObfuscatedName("ak.y(ILkg;Lif;B)V")
    public static void method480(int arg0, class308 arg1, class236 arg2) {
        byte[] var3 = null;
        class262 var4 = field3122;
        synchronized (field3122) {
            for (class232 var5 = (class232) field3122.method4540(); var5 != null; var5 = (class232) field3122.method4533()) {
                if ((long) arg0 == var5.field2322 && var5.field3096 == arg1 && var5.field3094 == 0) {
                    var3 = var5.field3095;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5420(arg0);
            arg2.method3877(arg1, arg0, var7, true);
        } else {
            arg2.method3877(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("ft.w(I)V")
    public static void method3260() {
        while (true) {
            class262 var0 = field3122;
            class232 var1;
            synchronized (field3122) {
                var1 = (class232) field3124.method4529();
            }
            if (var1 == null) {
                return;
            }
            var1.field3098.method3877(var1.field3096, (int) var1.field2322, var1.field3095, false);
        }
    }

    @ObfuscatedName("ah.p(I)V")
    public static void method486() {
        Object var0 = field3123;
        synchronized (field3123) {
            if (field3121 == 0) {
                Statics.field3125 = new Thread(new class235());
                Statics.field3125.setDaemon(true);
                Statics.field3125.start();
                Statics.field3125.setPriority(5);
            }
            field3121 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class262 var1 = field3122;
                class232 var2;
                synchronized (field3122) {
                    var2 = (class232) field3122.method4540();
                }
                if (var2 == null) {
                    class298.method3743(100L);
                    Object var10 = field3123;
                    synchronized (field3123) {
                        if (field3121 <= 1) {
                            field3121 = 0;
                            field3123.notifyAll();
                            return;
                        }
                        field3121--;
                    }
                } else {
                    if (var2.field3094 == 0) {
                        var2.field3096.method5417((int) var2.field2322, var2.field3095, var2.field3095.length);
                        class262 var4 = field3122;
                        synchronized (field3122) {
                            var2.method3292();
                        }
                    } else if (var2.field3094 == 1) {
                        var2.field3095 = var2.field3096.method5420((int) var2.field2322);
                        class262 var6 = field3122;
                        synchronized (field3122) {
                            field3124.method4554(var2);
                        }
                    }
                    Object var8 = field3123;
                    synchronized (field3123) {
                        if (field3121 <= 1) {
                            field3121 = 0;
                            field3123.notifyAll();
                            return;
                        }
                        field3121 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class341.method5815((String) null, var18);
        }
    }

    @ObfuscatedName("gb.b(I)V")
    public static void method3341() {
        Object var0 = field3123;
        synchronized (field3123) {
            if (field3121 != 0) {
                field3121 = 1;
                try {
                    field3123.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
