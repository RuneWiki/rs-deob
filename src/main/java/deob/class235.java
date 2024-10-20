package deob;

@ObfuscatedName("iw")
public class class235 implements Runnable {

    @ObfuscatedName("iw.s")
    public static class262 field3123 = new class262();

    @ObfuscatedName("iw.j")
    public static class262 field3124 = new class262();

    @ObfuscatedName("iw.i")
    public static int field3125 = 0;

    @ObfuscatedName("iw.k")
    public static Object field3126 = new Object();

    @ObfuscatedName("bw.s(I[BLkv;I)V")
    public static void method882(int arg0, byte[] arg1, class308 arg2) {
        class232 var3 = new class232();
        var3.field3091 = 0;
        var3.field2096 = (long) arg0;
        var3.field3092 = arg1;
        var3.field3093 = arg2;
        class262 var4 = field3123;
        synchronized (field3123) {
            field3123.method4475(var3);
        }
        Object var6 = field3126;
        synchronized (field3126) {
            if (field3125 == 0) {
                Statics.field89 = new Thread(new class235());
                Statics.field89.setDaemon(true);
                Statics.field89.start();
                Statics.field89.setPriority(5);
            }
            field3125 = 600;
        }
    }

    @ObfuscatedName("fi.j(ILkv;Lid;I)V")
    public static void method3160(int arg0, class308 arg1, class236 arg2) {
        class232 var3 = new class232();
        var3.field3091 = 1;
        var3.field2096 = (long) arg0;
        var3.field3093 = arg1;
        var3.field3094 = arg2;
        class262 var4 = field3123;
        synchronized (field3123) {
            field3123.method4475(var3);
        }
        Object var6 = field3126;
        synchronized (field3126) {
            if (field3125 == 0) {
                Statics.field89 = new Thread(new class235());
                Statics.field89.setDaemon(true);
                Statics.field89.start();
                Statics.field89.setPriority(5);
            }
            field3125 = 600;
        }
    }

    @ObfuscatedName("z.i(ILkv;Lid;I)V")
    public static void method168(int arg0, class308 arg1, class236 arg2) {
        byte[] var3 = null;
        class262 var4 = field3123;
        synchronized (field3123) {
            for (class232 var5 = (class232) field3123.method4480(); var5 != null; var5 = (class232) field3123.method4491()) {
                if ((long) arg0 == var5.field2096 && var5.field3093 == arg1 && var5.field3091 == 0) {
                    var3 = var5.field3092;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5347(arg0);
            arg2.method3881(arg1, arg0, var7, true);
        } else {
            arg2.method3881(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("an.k(B)V")
    public static void method485() {
        while (true) {
            class262 var0 = field3123;
            class232 var1;
            synchronized (field3123) {
                var1 = (class232) field3124.method4478();
            }
            if (var1 == null) {
                return;
            }
            var1.field3094.method3881(var1.field3093, (int) var1.field2096, var1.field3092, false);
        }
    }

    public void run() {
        try {
            while (true) {
                class262 var1 = field3123;
                class232 var2;
                synchronized (field3123) {
                    var2 = (class232) field3123.method4480();
                }
                if (var2 == null) {
                    class298.method4739(100L);
                    Object var10 = field3126;
                    synchronized (field3126) {
                        if (field3125 <= 1) {
                            field3125 = 0;
                            field3126.notifyAll();
                            return;
                        }
                        field3125--;
                    }
                } else {
                    if (var2.field3091 == 0) {
                        var2.field3093.method5351((int) var2.field2096, var2.field3092, var2.field3092.length);
                        class262 var4 = field3123;
                        synchronized (field3123) {
                            var2.method3304();
                        }
                    } else if (var2.field3091 == 1) {
                        var2.field3092 = var2.field3093.method5347((int) var2.field2096);
                        class262 var6 = field3123;
                        synchronized (field3123) {
                            field3124.method4475(var2);
                        }
                    }
                    Object var8 = field3126;
                    synchronized (field3126) {
                        if (field3125 <= 1) {
                            field3125 = 0;
                            field3126.notifyAll();
                            return;
                        }
                        field3125 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class341.method40((String) null, var18);
        }
    }

    @ObfuscatedName("bj.u(I)V")
    public static void method999() {
        Object var0 = field3126;
        synchronized (field3126) {
            if (field3125 != 0) {
                field3125 = 1;
                try {
                    field3126.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
