package deob;

@ObfuscatedName("in")
public class class257 implements Runnable {

    @ObfuscatedName("in.b")
    public static class214 field3342 = new class214();

    @ObfuscatedName("in.q")
    public static class214 field3340 = new class214();

    @ObfuscatedName("in.o")
    public static int field3339 = 0;

    @ObfuscatedName("in.p")
    public static Object field3341 = new Object();

    @ObfuscatedName("jh.b(I[BLfn;B)V")
    public static void method4516(int arg0, byte[] arg1, class174 arg2) {
        class254 var3 = new class254();
        var3.field3315 = 0;
        var3.field2613 = (long) arg0;
        var3.field3317 = arg1;
        var3.field3314 = arg2;
        class214 var4 = field3342;
        synchronized (field3342) {
            field3342.method3741(var3);
        }
        method4022();
    }

    @ObfuscatedName("im.q(ILfn;Lia;I)V")
    public static void method4119(int arg0, class174 arg1, class258 arg2) {
        class254 var3 = new class254();
        var3.field3315 = 1;
        var3.field2613 = (long) arg0;
        var3.field3314 = arg1;
        var3.field3316 = arg2;
        class214 var4 = field3342;
        synchronized (field3342) {
            field3342.method3741(var3);
        }
        method4022();
    }

    @ObfuscatedName("gl.o(I)V")
    public static void method3225() {
        while (true) {
            class214 var0 = field3342;
            class254 var1;
            synchronized (field3342) {
                var1 = (class254) field3340.method3737();
            }
            if (var1 == null) {
                return;
            }
            var1.field3316.method4267(var1.field3314, (int) var1.field2613, var1.field3317, false);
        }
    }

    @ObfuscatedName("hu.p(B)V")
    public static void method4022() {
        Object var0 = field3341;
        synchronized (field3341) {
            if (field3339 == 0) {
                Statics.field1544 = new Thread(new class257());
                Statics.field1544.setDaemon(true);
                Statics.field1544.start();
                Statics.field1544.setPriority(5);
            }
            field3339 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class214 var1 = field3342;
                class254 var2;
                synchronized (field3342) {
                    var2 = (class254) field3342.method3739();
                }
                if (var2 == null) {
                    class202.method141(100L);
                    Object var10 = field3341;
                    synchronized (field3341) {
                        if (field3339 <= 1) {
                            field3339 = 0;
                            field3341.notifyAll();
                            return;
                        }
                        field3339--;
                    }
                } else {
                    if (var2.field3315 == 0) {
                        var2.field3314.method3055((int) var2.field2613, var2.field3317, var2.field3317.length);
                        class214 var4 = field3342;
                        synchronized (field3342) {
                            var2.method3726();
                        }
                    } else if (var2.field3315 == 1) {
                        var2.field3317 = var2.field3314.method3054((int) var2.field2613);
                        class214 var6 = field3342;
                        synchronized (field3342) {
                            field3340.method3741(var2);
                        }
                    }
                    Object var8 = field3341;
                    synchronized (field3341) {
                        if (field3339 <= 1) {
                            field3339 = 0;
                            field3341.notifyAll();
                            return;
                        }
                        field3339 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class164.method482((String) null, var18);
        }
    }
}
