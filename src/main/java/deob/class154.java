package deob;

@ObfuscatedName("ew")
public class class154 implements Runnable {

    @ObfuscatedName("ew.v")
    public static class182 field2513 = new class182();

    @ObfuscatedName("ew.t")
    public static class182 field2512 = new class182();

    @ObfuscatedName("ew.f")
    public static int field2509 = 0;

    @ObfuscatedName("ew.j")
    public static Object field2510 = new Object();

    @ObfuscatedName("q.f(ILdz;Lei;I)V")
    public static void method154(int arg0, class125 arg1, class152 arg2) {
        class153 var3 = new class153();
        var3.field2499 = 1;
        var3.field2911 = (long) arg0;
        var3.field2506 = arg1;
        var3.field2502 = arg2;
        class182 var4 = field2513;
        synchronized (field2513) {
            field2513.method3323(var3);
        }
        Object var6 = field2510;
        synchronized (field2510) {
            if (field2509 == 0) {
                Statics.field1950.method2547(new class154(), 5);
            }
            field2509 = 600;
        }
    }

    @ObfuscatedName("en.j(ILdz;Lei;I)V")
    public static void method2764(int arg0, class125 arg1, class152 arg2) {
        byte[] var3 = null;
        class182 var4 = field2513;
        synchronized (field2513) {
            for (class153 var5 = (class153) field2513.method3303(); var5 != null; var5 = (class153) field2513.method3305()) {
                if ((long) arg0 == var5.field2911 && var5.field2506 == arg1 && var5.field2499 == 0) {
                    var3 = var5.field2504;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2512(arg0);
            arg2.method2867(arg1, arg0, var7, true);
        } else {
            arg2.method2867(arg1, arg0, var3, true);
        }
    }

    public void run() {
        try {
            while (true) {
                class182 var1 = field2513;
                class153 var2;
                synchronized (field2513) {
                    var2 = (class153) field2513.method3303();
                }
                if (var2 == null) {
                    class118.method2729(100L);
                    Object var10 = field2510;
                    synchronized (field2510) {
                        if (field2509 <= 1) {
                            field2509 = 0;
                            field2510.notifyAll();
                            return;
                        }
                        field2509--;
                    }
                } else {
                    if (var2.field2499 == 0) {
                        var2.field2506.method2501((int) var2.field2911, var2.field2504, var2.field2504.length);
                        class182 var4 = field2513;
                        synchronized (field2513) {
                            var2.method3392();
                        }
                    } else if (var2.field2499 == 1) {
                        var2.field2504 = var2.field2506.method2512((int) var2.field2911);
                        class182 var6 = field2513;
                        synchronized (field2513) {
                            field2512.method3323(var2);
                        }
                    }
                    Object var8 = field2510;
                    synchronized (field2510) {
                        if (field2509 <= 1) {
                            field2509 = 0;
                            field2510.notifyAll();
                            return;
                        }
                        field2509 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class139.method2439((String) null, var18);
        }
    }

    @ObfuscatedName("ed.l(I)V")
    public static void method2748() {
        Object var0 = field2510;
        synchronized (field2510) {
            if (field2509 != 0) {
                field2509 = 1;
                try {
                    field2510.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
