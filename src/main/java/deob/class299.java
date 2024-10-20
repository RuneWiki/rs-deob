package deob;

@ObfuscatedName("ke")
public class class299 implements Runnable {

    @ObfuscatedName("ke.c")
    public static class321 field3815 = new class321();

    @ObfuscatedName("ke.b")
    public static class321 field3814 = new class321();

    @ObfuscatedName("ke.p")
    public static int field3816 = 0;

    @ObfuscatedName("ke.m")
    public static Object field3813 = new Object();

    @ObfuscatedName("o.b(ILmy;Lkz;B)V")
    public static void method114(int arg0, class360 arg1, class300 arg2) {
        byte[] var3 = null;
        class321 var4 = field3815;
        synchronized (field3815) {
            for (class298 var5 = (class298) field3815.method5301(); var5 != null; var5 = (class298) field3815.method5303()) {
                if ((long) arg0 == var5.field4257 && var5.field3811 == arg1 && var5.field3809 == 0) {
                    var3 = var5.field3810;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method5911(arg0);
            arg2.method5007(arg1, arg0, var7, true);
        } else {
            arg2.method5007(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class321 var1 = field3815;
                class298 var2;
                synchronized (field3815) {
                    var2 = (class298) field3815.method5301();
                }
                if (var2 == null) {
                    class417.method5965(100L);
                    Object var10 = field3813;
                    synchronized (field3813) {
                        if (field3816 <= 1) {
                            field3816 = 0;
                            field3813.notifyAll();
                            return;
                        }
                        field3816--;
                    }
                } else {
                    if (var2.field3809 == 0) {
                        var2.field3811.method5919((int) var2.field4257, var2.field3810, var2.field3810.length);
                        class321 var4 = field3815;
                        synchronized (field3815) {
                            var2.method6163();
                        }
                    } else if (var2.field3809 == 1) {
                        var2.field3810 = var2.field3811.method5911((int) var2.field4257);
                        class321 var6 = field3815;
                        synchronized (field3815) {
                            field3814.method5296(var2);
                        }
                    }
                    Object var8 = field3813;
                    synchronized (field3813) {
                        if (field3816 <= 1) {
                            field3816 = 0;
                            field3813.notifyAll();
                            return;
                        }
                        field3816 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class443.method6513((String) null, var18);
        }
    }

    @ObfuscatedName("hd.m(I)V")
    public static void method4014() {
        Object var0 = field3813;
        synchronized (field3813) {
            if (field3816 != 0) {
                field3816 = 1;
                try {
                    field3813.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
