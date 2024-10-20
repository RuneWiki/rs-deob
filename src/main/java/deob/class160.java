package deob;

@ObfuscatedName("fs")
public class class160 implements Runnable {

    @ObfuscatedName("fs.i")
    public static class179 field2604 = new class179();

    @ObfuscatedName("fs.b")
    public static class179 field2605 = new class179();

    @ObfuscatedName("fs.r")
    public static int field2606 = 0;

    @ObfuscatedName("fs.l")
    public static Object field2607 = new Object();

    @ObfuscatedName("eg.s(I[BLbh;I)V")
    public static void method3126(int arg0, byte[] arg1, class72 arg2) {
        class159 var3 = new class159();
        var3.field2603 = 0;
        var3.field2839 = (long) arg0;
        var3.field2599 = arg1;
        var3.field2600 = arg2;
        class179 var4 = field2604;
        synchronized (field2604) {
            field2604.method3334(var3);
        }
        Object var6 = field2607;
        synchronized (field2607) {
            if (field2606 == 0) {
                Statics.field1483.method1495(new class160(), 5);
            }
            field2606 = 600;
        }
    }

    @ObfuscatedName("h.d(ILbh;Lfv;B)V")
    public static void method166(int arg0, class72 arg1, class157 arg2) {
        class159 var3 = new class159();
        var3.field2603 = 1;
        var3.field2839 = (long) arg0;
        var3.field2600 = arg1;
        var3.field2601 = arg2;
        class179 var4 = field2604;
        synchronized (field2604) {
            field2604.method3334(var3);
        }
        Object var6 = field2607;
        synchronized (field2607) {
            if (field2606 == 0) {
                Statics.field1483.method1495(new class160(), 5);
            }
            field2606 = 600;
        }
    }

    @ObfuscatedName("dn.e(ILbh;Lfv;I)V")
    public static void method2256(int arg0, class72 arg1, class157 arg2) {
        byte[] var3 = null;
        class179 var4 = field2604;
        synchronized (field2604) {
            for (class159 var5 = (class159) field2604.method3339(); var5 != null; var5 = (class159) field2604.method3353()) {
                if ((long) arg0 == var5.field2839 && var5.field2600 == arg1 && var5.field2603 == 0) {
                    var3 = var5.field2599;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1404(arg0);
            arg2.method3142(arg1, arg0, var7, true);
        } else {
            arg2.method3142(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class179 var1 = field2604;
                class159 var2;
                synchronized (field2604) {
                    var2 = (class159) field2604.method3339();
                }
                if (var2 == null) {
                    class127.method1642(100L);
                    Object var10 = field2607;
                    synchronized (field2607) {
                        if (field2606 <= 1) {
                            field2606 = 0;
                            field2607.notifyAll();
                            return;
                        }
                        field2606--;
                    }
                } else {
                    if (var2.field2603 == 0) {
                        var2.field2600.method1402((int) var2.field2839, var2.field2599, var2.field2599.length);
                        class179 var4 = field2604;
                        synchronized (field2604) {
                            var2.method3363();
                        }
                    } else if (var2.field2603 == 1) {
                        var2.field2599 = var2.field2600.method1404((int) var2.field2839);
                        class179 var6 = field2604;
                        synchronized (field2604) {
                            field2605.method3334(var2);
                        }
                    }
                    Object var8 = field2607;
                    synchronized (field2607) {
                        if (field2606 <= 1) {
                            field2606 = 0;
                            field2607.notifyAll();
                            return;
                        }
                        field2606 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class81.method3159((String) null, var18);
        }
    }

    @ObfuscatedName("g.u(I)V")
    public static void method241() {
        Object var0 = field2607;
        synchronized (field2607) {
            if (field2606 != 0) {
                field2606 = 1;
                try {
                    field2607.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
