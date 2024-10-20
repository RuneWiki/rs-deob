package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ik")
public class class216 implements Runnable {

    @ObfuscatedName("ik.ag")
    public class224 field2350 = null;

    @ObfuscatedName("ik.ak")
    public class224 field2345 = null;

    @ObfuscatedName("ik.ap")
    public Thread field2347;

    @ObfuscatedName("ik.an")
    public boolean field2348 = false;

    public class216() {
        Statics.field2343 = "Unknown";
        Statics.field2346 = "1.6";
        try {
            Statics.field2343 = System.getProperty("java.vendor");
            Statics.field2346 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2348 = false;
        this.field2347 = new Thread(this);
        this.field2347.setPriority(10);
        this.field2347.setDaemon(true);
        this.field2347.start();
    }

    @ObfuscatedName("ik.aq(I)V")
    public final void method3884() {
        synchronized (this) {
            this.field2348 = true;
            this.notifyAll();
        }
        try {
            this.field2347.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class224 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2348) {
                        return;
                    }
                    if (this.field2350 != null) {
                        var2 = this.field2350;
                        this.field2350 = this.field2350.field2402;
                        if (this.field2350 == null) {
                            this.field2345 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var11) {
                    }
                }
            }
            try {
                int var5 = var2.field2396;
                if (var5 == 1) {
                    var2.field2403 = new Socket(InetAddress.getByName((String) var2.field2400), var2.field2401);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2400);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2401);
                    var2.field2403 = var6;
                } else if (var5 == 4) {
                    var2.field2403 = new DataInputStream(((URL) var2.field2400).openStream());
                }
                var2.field2397 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2397 = 2;
            }
        }
    }

    @ObfuscatedName("ik.ad(IIILjava/lang/Object;I)Lig;")
    public final class224 method3870(int arg0, int arg1, int arg2, Object arg3) {
        class224 var5 = new class224();
        var5.field2396 = arg0;
        var5.field2401 = arg1;
        var5.field2400 = arg3;
        synchronized (this) {
            if (this.field2345 == null) {
                this.field2345 = this.field2350 = var5;
            } else {
                this.field2345.field2402 = var5;
                this.field2345 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ik.ag(Ljava/lang/String;II)Lig;")
    public final class224 method3871(String arg0, int arg1) {
        return this.method3870(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ik.ak(Ljava/lang/Runnable;II)Lig;")
    public final class224 method3880(Runnable arg0, int arg1) {
        return this.method3870(2, arg1, 0, arg0);
    }
}
