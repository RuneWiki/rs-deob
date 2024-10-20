package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ig")
public class class213 implements Runnable {

    @ObfuscatedName("ig.al")
    public class221 field2314 = null;

    @ObfuscatedName("ig.ai")
    public class221 field2316 = null;

    @ObfuscatedName("ig.ar")
    public Thread field2322;

    @ObfuscatedName("ig.as")
    public boolean field2318 = false;

    public class213() {
        Statics.field4466 = "Unknown";
        Statics.field2317 = "1.6";
        try {
            Statics.field4466 = System.getProperty("java.vendor");
            Statics.field2317 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2318 = false;
        this.field2322 = new Thread(this);
        this.field2322.setPriority(10);
        this.field2322.setDaemon(true);
        this.field2322.start();
    }

    @ObfuscatedName("ig.aq(I)V")
    public final void method3857() {
        synchronized (this) {
            this.field2318 = true;
            this.notifyAll();
        }
        try {
            this.field2322.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class221 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2318) {
                        return;
                    }
                    if (this.field2314 != null) {
                        var2 = this.field2314;
                        this.field2314 = this.field2314.field2374;
                        if (this.field2314 == null) {
                            this.field2316 = null;
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
                int var5 = var2.field2378;
                if (var5 == 1) {
                    var2.field2381 = new Socket(InetAddress.getByName((String) var2.field2377), var2.field2379);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2377);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2379);
                    var2.field2381 = var6;
                } else if (var5 == 4) {
                    var2.field2381 = new DataInputStream(((URL) var2.field2377).openStream());
                }
                var2.field2380 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2380 = 2;
            }
        }
    }

    @ObfuscatedName("ig.aw(IIILjava/lang/Object;B)Lii;")
    public final class221 method3860(int arg0, int arg1, int arg2, Object arg3) {
        class221 var5 = new class221();
        var5.field2378 = arg0;
        var5.field2379 = arg1;
        var5.field2377 = arg3;
        synchronized (this) {
            if (this.field2316 == null) {
                this.field2316 = this.field2314 = var5;
            } else {
                this.field2316.field2374 = var5;
                this.field2316 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ig.al(Ljava/lang/String;II)Lii;")
    public final class221 method3856(String arg0, int arg1) {
        return this.method3860(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ig.ai(Ljava/lang/Runnable;IB)Lii;")
    public final class221 method3858(Runnable arg0, int arg1) {
        return this.method3860(2, arg1, 0, arg0);
    }
}
