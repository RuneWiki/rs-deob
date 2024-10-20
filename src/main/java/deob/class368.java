package deob;

@ObfuscatedName("ox")
public class class368 implements Runnable {

    @ObfuscatedName("ox.at")
    public static final class390 field4274 = new class390();

    @ObfuscatedName("ox.ah")
    public static class390 field4269 = new class390();

    @ObfuscatedName("ox.ar")
    public static int field4272 = 0;

    @ObfuscatedName("ox.ao")
    public static boolean field4275 = false;

    @ObfuscatedName("ox.ab")
    public static Object field4273 = new Object();

    @ObfuscatedName("iw.at(I[BLrg;I)V")
    public static void method4009(int arg0, byte[] arg1, class455 arg2) {
        class367 var3 = new class367();
        var3.field4265 = 0;
        var3.field4849 = (long) arg0;
        var3.field4268 = arg1;
        var3.field4266 = arg2;
        class390 var4 = field4274;
        synchronized (field4274) {
            field4274.method6547(var3);
        }
        Object var6 = field4273;
        synchronized (field4273) {
            if (field4272 == 0) {
                Statics.field4271 = new Thread(new class368());
                Statics.field4271.setDaemon(true);
                Statics.field4271.start();
                Statics.field4271.setPriority(5);
            }
            field4272 = 600;
            field4275 = false;
        }
    }

    public void run() {
        try {
            while (true) {
                class390 var1 = field4274;
                class367 var2;
                synchronized (field4274) {
                    var2 = (class367) field4274.method6579();
                }
                if (var2 == null) {
                    class314.method3920(100L);
                    Object var10 = field4273;
                    synchronized (field4273) {
                        if ((field4275 || field4272 <= 1) && field4274.method6551()) {
                            field4272 = 0;
                            field4273.notifyAll();
                            return;
                        }
                        field4272--;
                    }
                } else {
                    if (var2.field4265 == 0) {
                        var2.field4266.method7587((int) var2.field4849, var2.field4268, var2.field4268.length);
                        class390 var4 = field4274;
                        synchronized (field4274) {
                            var2.method7828();
                        }
                    } else if (var2.field4265 == 1) {
                        var2.field4268 = var2.field4266.method7586((int) var2.field4849);
                        class390 var6 = field4274;
                        synchronized (field4274) {
                            field4269.method6547(var2);
                        }
                    }
                    Object var8 = field4273;
                    synchronized (field4273) {
                        if ((field4275 || field4272 <= 1) && field4274.method6551()) {
                            field4272 = 0;
                            field4273.notifyAll();
                            return;
                        }
                        field4272 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class553.method6436((String) null, var18);
        }
    }

    @ObfuscatedName("ig.ah(I)V")
    public static void method4031() {
        Object var0 = field4273;
        synchronized (field4273) {
            if (field4272 != 0) {
                field4272 = 1;
                field4275 = true;
                try {
                    field4273.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }
}
