package deob;

@ObfuscatedName("oo")
public class class387 implements Runnable {

    @ObfuscatedName("oo.ac")
    public static final class410 field4501 = new class410();

    @ObfuscatedName("oo.ae")
    public static class410 field4496 = new class410();

    @ObfuscatedName("oo.ag")
    public static int field4497 = 0;

    @ObfuscatedName("oo.am")
    public static final Object field4495 = new Object();

    @ObfuscatedName("jj.ac(I[BLsl;I)V")
    public static void method4797(int arg0, byte[] arg1, class486 arg2) {
        class386 var3 = new class386();
        var3.field4493 = 0;
        var3.field5122 = (long) arg0;
        var3.field4492 = arg1;
        var3.field4491 = arg2;
        class410 var4 = field4501;
        synchronized (field4501) {
            field4501.method7051(var3);
        }
        Object var6 = field4495;
        synchronized (field4495) {
            if (field4497 == 0) {
                Statics.field4499 = new Thread(new class387());
                Statics.field4499.setDaemon(true);
                Statics.field4499.start();
                Statics.field4499.setPriority(5);
            }
            field4497 = 600;
        }
    }

    @ObfuscatedName("as.ag(ILsl;Lof;I)V")
    public static void method281(int arg0, class486 arg1, class388 arg2) {
        byte[] var3 = null;
        class410 var4 = field4501;
        synchronized (field4501) {
            for (class386 var5 = (class386) field4501.method7029(); var5 != null; var5 = (class386) field4501.method7031()) {
                if ((long) arg0 == var5.field5122 && var5.field4491 == arg1 && var5.field4493 == 0) {
                    var3 = var5.field4492;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method8259(arg0);
            arg2.method6736(arg1, arg0, var7, true);
        } else {
            arg2.method6736(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class410 var1 = field4501;
                class386 var2;
                synchronized (field4501) {
                    var2 = (class386) field4501.method7029();
                }
                if (var2 == null) {
                    class332.method4128(100L);
                    Object var10 = field4495;
                    synchronized (field4495) {
                        if (field4497 <= 1) {
                            field4497 = 0;
                            field4495.notifyAll();
                            return;
                        }
                        field4497--;
                    }
                } else {
                    if (var2.field4493 == 0) {
                        var2.field4491.method8260((int) var2.field5122, var2.field4492, var2.field4492.length);
                        class410 var4 = field4501;
                        synchronized (field4501) {
                            var2.method8362();
                        }
                    } else if (var2.field4493 == 1) {
                        var2.field4492 = var2.field4491.method8259((int) var2.field5122);
                        class410 var6 = field4501;
                        synchronized (field4501) {
                            field4496.method7051(var2);
                        }
                    }
                    Object var8 = field4495;
                    synchronized (field4495) {
                        if (field4497 <= 1) {
                            field4497 = 0;
                            field4495.notifyAll();
                            return;
                        }
                        field4497 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class577.method3409((String) null, var18);
        }
    }

    @ObfuscatedName("jq.am(B)V")
    public static void method4771() {
        Object var0 = field4495;
        synchronized (field4495) {
            if (field4497 != 0) {
                field4497 = 1;
                try {
                    field4495.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class410 var3 = field4501;
        synchronized (field4501) {
            field4501.method7023();
            field4496.method7023();
        }
    }
}
