package deob;

@ObfuscatedName("om")
public class class383 implements Runnable {

    @ObfuscatedName("om.ak")
    public static final class406 field4450 = new class406();

    @ObfuscatedName("om.al")
    public static class406 field4447 = new class406();

    @ObfuscatedName("om.aj")
    public static int field4446 = 0;

    @ObfuscatedName("om.az")
    public static boolean field4449 = false;

    @ObfuscatedName("om.af")
    public static Object field4448 = new Object();

    @ObfuscatedName("ni.ak(ILsf;Lot;B)V")
    public static void method6471(int arg0, class482 arg1, class384 arg2) {
        byte[] var3 = null;
        class406 var4 = field4450;
        synchronized (field4450) {
            for (class382 var5 = (class382) field4450.method6834(); var5 != null; var5 = (class382) field4450.method6842()) {
                if ((long) arg0 == var5.field5049 && var5.field4439 == arg1 && var5.field4443 == 0) {
                    var3 = var5.field4438;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method8085(arg0);
            arg2.method6541(arg1, arg0, var7, true);
        } else {
            arg2.method6541(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class406 var1 = field4450;
                class382 var2;
                synchronized (field4450) {
                    var2 = (class382) field4450.method6834();
                }
                if (var2 == null) {
                    class327.method8101(100L);
                    Object var10 = field4448;
                    synchronized (field4448) {
                        if ((field4449 || field4446 <= 1) && field4450.method6837()) {
                            field4446 = 0;
                            field4448.notifyAll();
                            return;
                        }
                        field4446--;
                    }
                } else {
                    if (var2.field4443 == 0) {
                        var2.field4439.method8093((int) var2.field5049, var2.field4438, var2.field4438.length);
                        class406 var4 = field4450;
                        synchronized (field4450) {
                            var2.method8189();
                        }
                    } else if (var2.field4443 == 1) {
                        var2.field4438 = var2.field4439.method8085((int) var2.field5049);
                        class406 var6 = field4450;
                        synchronized (field4450) {
                            field4447.method6829(var2);
                        }
                    }
                    Object var8 = field4448;
                    synchronized (field4448) {
                        if ((field4449 || field4446 <= 1) && field4450.method6837()) {
                            field4446 = 0;
                            field4448.notifyAll();
                            return;
                        }
                        field4446 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class571.method8083((String) null, var18);
        }
    }

    @ObfuscatedName("mn.al(B)V")
    public static void method5582() {
        Object var0 = field4448;
        synchronized (field4448) {
            if (field4446 != 0) {
                field4446 = 1;
                field4449 = true;
                try {
                    field4448.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
