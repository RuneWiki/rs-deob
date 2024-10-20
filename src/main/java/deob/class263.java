package deob;

@ObfuscatedName("jm")
public class class263 implements Runnable {

    @ObfuscatedName("jm.g")
    public static class218 field3389 = new class218();

    @ObfuscatedName("jm.e")
    public static class218 field3385 = new class218();

    @ObfuscatedName("jm.b")
    public static int field3387 = 0;

    @ObfuscatedName("jm.z")
    public static Object field3388 = new Object();

    @ObfuscatedName("i.g(I[BLfr;I)V")
    public static void method44(int arg0, byte[] arg1, class175 arg2) {
        class260 var3 = new class260();
        var3.field3360 = 0;
        var3.field2660 = (long) arg0;
        var3.field3359 = arg1;
        var3.field3361 = arg2;
        class218 var4 = field3389;
        synchronized (field3389) {
            field3389.method3829(var3);
        }
        method740();
    }

    @ObfuscatedName("fv.e(ILfr;Lji;I)V")
    public static void method3044(int arg0, class175 arg1, class264 arg2) {
        class260 var3 = new class260();
        var3.field3360 = 1;
        var3.field2660 = (long) arg0;
        var3.field3361 = arg1;
        var3.field3362 = arg2;
        class218 var4 = field3389;
        synchronized (field3389) {
            field3389.method3829(var3);
        }
        method740();
    }

    @ObfuscatedName("ck.b(ILfr;Lji;I)V")
    public static void method1836(int arg0, class175 arg1, class264 arg2) {
        byte[] var3 = null;
        class218 var4 = field3389;
        synchronized (field3389) {
            for (class260 var5 = (class260) field3389.method3809(); var5 != null; var5 = (class260) field3389.method3832()) {
                if ((long) arg0 == var5.field2660 && var5.field3361 == arg1 && var5.field3360 == 0) {
                    var3 = var5.field3359;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method3147(arg0);
            arg2.method4381(arg1, arg0, var7, true);
        } else {
            arg2.method4381(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("cu.z(I)V")
    public static void method1831() {
        while (true) {
            class218 var0 = field3389;
            class260 var1;
            synchronized (field3389) {
                var1 = (class260) field3385.method3807();
            }
            if (var1 == null) {
                return;
            }
            var1.field3362.method4381(var1.field3361, (int) var1.field2660, var1.field3359, false);
        }
    }

    @ObfuscatedName("bo.n(I)V")
    public static void method740() {
        Object var0 = field3388;
        synchronized (field3388) {
            if (field3387 == 0) {
                Statics.field3386 = new Thread(new class263());
                Statics.field3386.setDaemon(true);
                Statics.field3386.start();
                Statics.field3386.setPriority(5);
            }
            field3387 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class218 var1 = field3389;
                class260 var2;
                synchronized (field3389) {
                    var2 = (class260) field3389.method3809();
                }
                if (var2 == null) {
                    class204.method48(100L);
                    Object var10 = field3388;
                    synchronized (field3388) {
                        if (field3387 <= 1) {
                            field3387 = 0;
                            field3388.notifyAll();
                            return;
                        }
                        field3387--;
                    }
                } else {
                    if (var2.field3360 == 0) {
                        var2.field3361.method3148((int) var2.field2660, var2.field3359, var2.field3359.length);
                        class218 var4 = field3389;
                        synchronized (field3389) {
                            var2.method3796();
                        }
                    } else if (var2.field3360 == 1) {
                        var2.field3359 = var2.field3361.method3147((int) var2.field2660);
                        class218 var6 = field3389;
                        synchronized (field3389) {
                            field3385.method3829(var2);
                        }
                    }
                    Object var8 = field3388;
                    synchronized (field3388) {
                        if (field3387 <= 1) {
                            field3387 = 0;
                            field3388.notifyAll();
                            return;
                        }
                        field3387 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class165.method4257((String) null, var18);
        }
    }

    @ObfuscatedName("gj.l(I)V")
    public static void method3225() {
        Object var0 = field3388;
        synchronized (field3388) {
            if (field3387 != 0) {
                field3387 = 1;
                try {
                    field3388.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
