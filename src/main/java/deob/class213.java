package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ig")
public class class213 implements Runnable {

    @ObfuscatedName("ig.an")
    public class221 field2341 = null;

    @ObfuscatedName("ig.au")
    public class221 field2343 = null;

    @ObfuscatedName("ig.ax")
    public Thread field2344;

    @ObfuscatedName("ig.ao")
    public boolean field2342 = false;

    public class213() {
        Statics.field1617 = "Unknown";
        Statics.field2345 = "1.6";
        try {
            Statics.field1617 = System.getProperty("java.vendor");
            Statics.field2345 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2342 = false;
        this.field2344 = new Thread(this);
        this.field2344.setPriority(10);
        this.field2344.setDaemon(true);
        this.field2344.start();
    }

    @ObfuscatedName("ig.ab(B)V")
    public final void method4198() {
        synchronized (this) {
            this.field2342 = true;
            this.notifyAll();
        }
        try {
            this.field2344.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class221 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2342) {
                        return;
                    }
                    if (this.field2341 != null) {
                        var2 = this.field2341;
                        this.field2341 = this.field2341.field2398;
                        if (this.field2341 == null) {
                            this.field2343 = null;
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
                    var2.field2393 = new Socket(InetAddress.getByName((String) var2.field2392), var2.field2397);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2392);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2397);
                    var2.field2393 = var6;
                } else if (var5 == 4) {
                    var2.field2393 = new DataInputStream(((URL) var2.field2392).openStream());
                }
                var2.field2395 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2395 = 2;
            }
        }
    }

    @ObfuscatedName("ig.ay(IIILjava/lang/Object;I)Lik;")
    public final class221 method4202(int arg0, int arg1, int arg2, Object arg3) {
        class221 var5 = new class221();
        var5.field2396 = arg0;
        var5.field2397 = arg1;
        var5.field2392 = arg3;
        synchronized (this) {
            if (this.field2343 == null) {
                this.field2343 = this.field2341 = var5;
            } else {
                this.field2343.field2398 = var5;
                this.field2343 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ig.an(Ljava/lang/String;II)Lik;")
    public final class221 method4200(String arg0, int arg1) {
        return this.method4202(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ig.au(Ljava/lang/Runnable;II)Lik;")
    public final class221 method4201(Runnable arg0, int arg1) {
        return this.method4202(2, arg1, 0, arg0);
    }
}
