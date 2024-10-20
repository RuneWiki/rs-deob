package deob;

@ObfuscatedName("nz")
public class class354 implements Runnable {

    @ObfuscatedName("nz.at")
    public static class376 field4227 = new class376();

    @ObfuscatedName("nz.an")
    public static class376 field4226 = new class376();

    @ObfuscatedName("nz.av")
    public static int field4225 = 0;

    @ObfuscatedName("nz.as")
    public static Object field4224 = new Object();

    @ObfuscatedName("ji.at(ILqc;Lny;I)V")
    public static void method4758(int arg0, class431 arg1, class355 arg2) {
        class353 var3 = new class353();
        var3.field4219 = 1;
        var3.field4757 = (long) arg0;
        var3.field4221 = arg1;
        var3.field4220 = arg2;
        class376 var4 = field4227;
        synchronized (field4227) {
            field4227.method6303(var3);
        }
        method5156();
    }

    @ObfuscatedName("mc.an(ILqc;Lny;B)V")
    public static void method5382(int arg0, class431 arg1, class355 arg2) {
        byte[] var3 = null;
        class376 var4 = field4227;
        synchronized (field4227) {
            for (class353 var5 = (class353) field4227.method6309(); var5 != null; var5 = (class353) field4227.method6311()) {
                if ((long) arg0 == var5.field4757 && var5.field4221 == arg1 && var5.field4219 == 0) {
                    var3 = var5.field4222;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method7313(arg0);
            arg2.method6038(arg1, arg0, var7, true);
        } else {
            arg2.method6038(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("lw.av(I)V")
    public static void method5156() {
        Object var0 = field4224;
        synchronized (field4224) {
            if (field4225 == 0) {
                Statics.field4223 = new Thread(new class354());
                Statics.field4223.setDaemon(true);
                Statics.field4223.start();
                Statics.field4223.setPriority(5);
            }
            field4225 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class376 var1 = field4227;
                class353 var2;
                synchronized (field4227) {
                    var2 = (class353) field4227.method6309();
                }
                if (var2 == null) {
                    class302.method3997(100L);
                    Object var10 = field4224;
                    synchronized (field4224) {
                        if (field4225 <= 1) {
                            field4225 = 0;
                            field4224.notifyAll();
                            return;
                        }
                        field4225--;
                    }
                } else {
                    if (var2.field4219 == 0) {
                        var2.field4221.method7314((int) var2.field4757, var2.field4222, var2.field4222.length);
                        class376 var4 = field4227;
                        synchronized (field4227) {
                            var2.method7560();
                        }
                    } else if (var2.field4219 == 1) {
                        var2.field4222 = var2.field4221.method7313((int) var2.field4757);
                        class376 var6 = field4227;
                        synchronized (field4227) {
                            field4226.method6303(var2);
                        }
                    }
                    Object var8 = field4224;
                    synchronized (field4224) {
                        if (field4225 <= 1) {
                            field4225 = 0;
                            field4224.notifyAll();
                            return;
                        }
                        field4225 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class528.method4947((String) null, var18);
        }
    }

    @ObfuscatedName("hd.as(I)V")
    public static void method3393() {
        Object var0 = field4224;
        synchronized (field4224) {
            if (field4225 != 0) {
                field4225 = 1;
                try {
                    field4224.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
