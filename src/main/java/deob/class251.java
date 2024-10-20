package deob;

@ObfuscatedName("ia")
public class class251 implements Runnable {

    @ObfuscatedName("ia.v")
    public static class208 field3209 = new class208();

    @ObfuscatedName("ia.s")
    public static class208 field3208 = new class208();

    @ObfuscatedName("ia.o")
    public static int field3207 = 0;

    @ObfuscatedName("ia.k")
    public static Object field3210 = new Object();

    @ObfuscatedName("ej.v(I[BLfm;I)V")
    public static void method2987(int arg0, byte[] arg1, class165 arg2) {
        class248 var3 = new class248();
        var3.field3181 = 0;
        var3.field2464 = (long) arg0;
        var3.field3183 = arg1;
        var3.field3180 = arg2;
        class208 var4 = field3209;
        synchronized (field3209) {
            field3209.method3793(var3);
        }
        Object var6 = field3210;
        synchronized (field3210) {
            if (field3207 == 0) {
                Statics.field230 = new Thread(new class251());
                Statics.field230.setDaemon(true);
                Statics.field230.start();
                Statics.field230.setPriority(5);
            }
            field3207 = 600;
        }
    }

    @ObfuscatedName("q.s(ILfm;Liy;I)V")
    public static void method208(int arg0, class165 arg1, class252 arg2) {
        class248 var3 = new class248();
        var3.field3181 = 1;
        var3.field2464 = (long) arg0;
        var3.field3180 = arg1;
        var3.field3182 = arg2;
        class208 var4 = field3209;
        synchronized (field3209) {
            field3209.method3793(var3);
        }
        Object var6 = field3210;
        synchronized (field3210) {
            if (field3207 == 0) {
                Statics.field230 = new Thread(new class251());
                Statics.field230.setDaemon(true);
                Statics.field230.start();
                Statics.field230.setPriority(5);
            }
            field3207 = 600;
        }
    }

    @ObfuscatedName("in.o(ILfm;Liy;I)V")
    public static void method4253(int arg0, class165 arg1, class252 arg2) {
        byte[] var3 = null;
        class208 var4 = field3209;
        synchronized (field3209) {
            for (class248 var5 = (class248) field3209.method3792(); var5 != null; var5 = (class248) field3209.method3800()) {
                if ((long) arg0 == var5.field2464 && var5.field3180 == arg1 && var5.field3181 == 0) {
                    var3 = var5.field3183;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method3078(arg0);
            arg2.method4396(arg1, arg0, var7, true);
        } else {
            arg2.method4396(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class208 var1 = field3209;
                class248 var2;
                synchronized (field3209) {
                    var2 = (class248) field3209.method3792();
                }
                if (var2 == null) {
                    class194.method668(100L);
                    Object var10 = field3210;
                    synchronized (field3210) {
                        if (field3207 <= 1) {
                            field3207 = 0;
                            field3210.notifyAll();
                            return;
                        }
                        field3207--;
                    }
                } else {
                    if (var2.field3181 == 0) {
                        var2.field3180.method3079((int) var2.field2464, var2.field3183, var2.field3183.length);
                        class208 var4 = field3209;
                        synchronized (field3209) {
                            var2.method3787();
                        }
                    } else if (var2.field3181 == 1) {
                        var2.field3183 = var2.field3180.method3078((int) var2.field2464);
                        class208 var6 = field3209;
                        synchronized (field3209) {
                            field3208.method3793(var2);
                        }
                    }
                    Object var8 = field3210;
                    synchronized (field3210) {
                        if (field3207 <= 1) {
                            field3207 = 0;
                            field3210.notifyAll();
                            return;
                        }
                        field3207 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class155.method2337((String) null, var18);
        }
    }
}
