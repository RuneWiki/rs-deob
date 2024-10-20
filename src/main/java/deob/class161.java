package deob;

@ObfuscatedName("fe")
public class class161 implements Runnable {

    @ObfuscatedName("fe.n")
    public static class190 field2606 = new class190();

    @ObfuscatedName("fe.g")
    public static class190 field2607 = new class190();

    @ObfuscatedName("fe.a")
    public static int field2602 = 0;

    @ObfuscatedName("fe.m")
    public static Object field2605 = new Object();

    @ObfuscatedName("dm.a(ILdt;Lft;I)V")
    public static void method2569(int arg0, class126 arg1, class159 arg2) {
        byte[] var3 = null;
        class190 var4 = field2606;
        synchronized (field2606) {
            for (class160 var5 = (class160) field2606.method3468(); var5 != null; var5 = (class160) field2606.method3470()) {
                if ((long) arg0 == var5.field3018 && var5.field2597 == arg1 && var5.field2599 == 0) {
                    var3 = var5.field2600;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2559(arg0);
            arg2.method3001(arg1, arg0, var7, true);
        } else {
            arg2.method3001(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class190 var1 = field2606;
                class160 var2;
                synchronized (field2606) {
                    var2 = (class160) field2606.method3468();
                }
                if (var2 == null) {
                    class119.method2154(100L);
                    Object var10 = field2605;
                    synchronized (field2605) {
                        if (field2602 <= 1) {
                            field2602 = 0;
                            field2605.notifyAll();
                            return;
                        }
                        field2602--;
                    }
                } else {
                    if (var2.field2599 == 0) {
                        var2.field2597.method2552((int) var2.field3018, var2.field2600, var2.field2600.length);
                        class190 var4 = field2606;
                        synchronized (field2606) {
                            var2.method3554();
                        }
                    } else if (var2.field2599 == 1) {
                        var2.field2600 = var2.field2597.method2559((int) var2.field3018);
                        class190 var6 = field2606;
                        synchronized (field2606) {
                            field2607.method3463(var2);
                        }
                    }
                    Object var8 = field2605;
                    synchronized (field2605) {
                        if (field2602 <= 1) {
                            field2602 = 0;
                            field2605.notifyAll();
                            return;
                        }
                        field2602 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class140.method2829((String) null, var18);
        }
    }

    @ObfuscatedName("ag.m(B)V")
    public static void method614() {
        Object var0 = field2605;
        synchronized (field2605) {
            if (field2602 != 0) {
                field2602 = 1;
                try {
                    field2605.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
