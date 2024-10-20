package deob;

@ObfuscatedName("fi")
public class class158 implements Runnable {

    @ObfuscatedName("fi.p")
    public static class177 field2579 = new class177();

    @ObfuscatedName("fi.e")
    public static class177 field2576 = new class177();

    @ObfuscatedName("fi.a")
    public static int field2575 = 0;

    @ObfuscatedName("fi.h")
    public static Object field2578 = new Object();

    @ObfuscatedName("bc.h(ILbr;Lep;I)V")
    public static void method1398(int arg0, class71 arg1, class155 arg2) {
        byte[] var3 = null;
        class177 var4 = field2579;
        synchronized (field2579) {
            for (class157 var5 = (class157) field2579.method3325(); var5 != null; var5 = (class157) field2579.method3333()) {
                if ((long) arg0 == var5.field2813 && var5.field2573 == arg1 && var5.field2569 == 0) {
                    var3 = var5.field2568;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method1430(arg0);
            arg2.method3138(arg1, arg0, var7, true);
        } else {
            arg2.method3138(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("em.y(I)V")
    public static void method3159() {
        Object var0 = field2578;
        synchronized (field2578) {
            if (field2575 == 0) {
                Statics.field441.method1517(new class158(), 5);
            }
            field2575 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class177 var1 = field2579;
                class157 var2;
                synchronized (field2579) {
                    var2 = (class157) field2579.method3325();
                }
                if (var2 == null) {
                    class126.method47(100L);
                    Object var10 = field2578;
                    synchronized (field2578) {
                        if (field2575 <= 1) {
                            field2575 = 0;
                            field2578.notifyAll();
                            return;
                        }
                        field2575--;
                    }
                } else {
                    if (var2.field2569 == 0) {
                        var2.field2573.method1431((int) var2.field2813, var2.field2568, var2.field2568.length);
                        class177 var4 = field2579;
                        synchronized (field2579) {
                            var2.method3360();
                        }
                    } else if (var2.field2569 == 1) {
                        var2.field2568 = var2.field2573.method1430((int) var2.field2813);
                        class177 var6 = field2579;
                        synchronized (field2579) {
                            field2576.method3332(var2);
                        }
                    }
                    Object var8 = field2578;
                    synchronized (field2578) {
                        if (field2575 <= 1) {
                            field2575 = 0;
                            field2578.notifyAll();
                            return;
                        }
                        field2575 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class80.method838((String) null, var18);
        }
    }

    @ObfuscatedName("bq.j(I)V")
    public static void method1400() {
        Object var0 = field2578;
        synchronized (field2578) {
            if (field2575 != 0) {
                field2575 = 1;
                try {
                    field2578.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
