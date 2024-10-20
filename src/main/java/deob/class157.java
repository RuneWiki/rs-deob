package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fw")
public class class157 implements Runnable {

    @ObfuscatedName("fw.w")
    public class156 field2114 = null;

    @ObfuscatedName("fw.s")
    public class156 field2113 = null;

    @ObfuscatedName("fw.j")
    public Thread field2112;

    @ObfuscatedName("fw.a")
    public boolean field2115 = false;

    public class157() {
        Statics.field2532 = "Unknown";
        Statics.field2083 = "1.6";
        try {
            Statics.field2532 = System.getProperty("java.vendor");
            Statics.field2083 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2115 = false;
        this.field2112 = new Thread(this);
        this.field2112.setPriority(10);
        this.field2112.setDaemon(true);
        this.field2112.start();
    }

    @ObfuscatedName("fw.p(B)V")
    public final void method2868() {
        synchronized (this) {
            this.field2115 = true;
            this.notifyAll();
        }
        try {
            this.field2112.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class156 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2115) {
                        return;
                    }
                    if (this.field2114 != null) {
                        var2 = this.field2114;
                        this.field2114 = this.field2114.field2105;
                        if (this.field2114 == null) {
                            this.field2113 = null;
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
                int var5 = var2.field2108;
                if (var5 == 1) {
                    var2.field2111 = new Socket(InetAddress.getByName((String) var2.field2104), var2.field2109);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2104);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2109);
                    var2.field2111 = var6;
                } else if (var5 == 4) {
                    var2.field2111 = new DataInputStream(((URL) var2.field2104).openStream());
                }
                var2.field2106 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2106 = 2;
            }
        }
    }

    @ObfuscatedName("fw.i(IIILjava/lang/Object;I)Led;")
    public final class156 method2869(int arg0, int arg1, int arg2, Object arg3) {
        class156 var5 = new class156();
        var5.field2108 = arg0;
        var5.field2109 = arg1;
        var5.field2104 = arg3;
        synchronized (this) {
            if (this.field2113 == null) {
                this.field2113 = this.field2114 = var5;
            } else {
                this.field2113.field2105 = var5;
                this.field2113 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fw.w(Ljava/lang/String;IB)Led;")
    public final class156 method2870(String arg0, int arg1) {
        return this.method2869(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fw.s(Ljava/lang/Runnable;II)Led;")
    public final class156 method2873(Runnable arg0, int arg1) {
        return this.method2869(2, arg1, 0, arg0);
    }
}
