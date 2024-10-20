package deob;

@Deprecated
@ObfuscatedName("lf")
public class class330 implements Runnable {

    @ObfuscatedName("lf.h")
    public static class352 field4176 = new class352();

    @ObfuscatedName("lf.e")
    public static class352 field4173 = new class352();

    @ObfuscatedName("lf.v")
    public static int field4174 = 0;

    @ObfuscatedName("lf.x")
    public static Object field4175 = new Object();

    @ObfuscatedName("jb.h(ILoi;Lln;I)V")
    public static void method4930(int arg0, class404 arg1, class331 arg2) {
        class329 var3 = new class329();
        var3.field4170 = 1;
        var3.field4686 = (long) arg0;
        var3.field4169 = arg1;
        var3.field4167 = arg2;
        class352 var4 = field4176;
        synchronized (field4176) {
            field4176.method6081(var3);
        }
        method3017();
    }

    @ObfuscatedName("eu.e(B)V")
    public static void method3017() {
        Object var0 = field4175;
        synchronized (field4175) {
            if (field4174 == 0) {
                Statics.field3711 = new Thread(new class330());
                Statics.field3711.setDaemon(true);
                Statics.field3711.start();
                Statics.field3711.setPriority(5);
            }
            field4174 = 600;
        }
    }

    public void run() {
        try {
            while (true) {
                class352 var1 = field4176;
                class329 var2;
                synchronized (field4176) {
                    var2 = (class329) field4176.method6086();
                }
                if (var2 == null) {
                    class284.method148(100L);
                    Object var10 = field4175;
                    synchronized (field4175) {
                        if (field4174 <= 1) {
                            field4174 = 0;
                            field4175.notifyAll();
                            return;
                        }
                        field4174--;
                    }
                } else {
                    if (var2.field4170 == 0) {
                        var2.field4169.method7010((int) var2.field4686, var2.field4168, var2.field4168.length);
                        class352 var4 = field4176;
                        synchronized (field4176) {
                            var2.method7230();
                        }
                    } else if (var2.field4170 == 1) {
                        var2.field4168 = var2.field4169.method6999((int) var2.field4686);
                        class352 var6 = field4176;
                        synchronized (field4176) {
                            field4173.method6081(var2);
                        }
                    }
                    Object var8 = field4175;
                    synchronized (field4175) {
                        if (field4174 <= 1) {
                            field4174 = 0;
                            field4175.notifyAll();
                            return;
                        }
                        field4174 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class493.method2879((String) null, var18);
        }
    }

    @ObfuscatedName("gf.v(B)V")
    public static void method3293() {
        Object var0 = field4175;
        synchronized (field4175) {
            if (field4174 != 0) {
                field4174 = 1;
                try {
                    field4175.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
