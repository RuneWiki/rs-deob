package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fl")
public class class167 implements Runnable {

    @ObfuscatedName("fl.o")
    public class166 field2201 = null;

    @ObfuscatedName("fl.j")
    public class166 field2197 = null;

    @ObfuscatedName("fl.k")
    public Thread field2198;

    @ObfuscatedName("fl.x")
    public boolean field2199 = false;

    public class167() {
        Statics.field2801 = "Unknown";
        Statics.field2196 = "1.6";
        try {
            Statics.field2801 = System.getProperty("java.vendor");
            Statics.field2196 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2199 = false;
        this.field2198 = new Thread(this);
        this.field2198.setPriority(10);
        this.field2198.setDaemon(true);
        this.field2198.start();
    }

    @ObfuscatedName("fl.c(I)V")
    public final void method2990() {
        synchronized (this) {
            this.field2199 = true;
            this.notifyAll();
        }
        try {
            this.field2198.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2199) {
                        return;
                    }
                    if (this.field2201 != null) {
                        var2 = this.field2201;
                        this.field2201 = this.field2201.field2188;
                        if (this.field2201 == null) {
                            this.field2197 = null;
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
                int var5 = var2.field2191;
                if (var5 == 1) {
                    var2.field2194 = new Socket(InetAddress.getByName((String) var2.field2193), var2.field2186);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2193);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2186);
                    var2.field2194 = var6;
                } else if (var5 == 4) {
                    var2.field2194 = new DataInputStream(((URL) var2.field2193).openStream());
                }
                var2.field2190 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2190 = 2;
            }
        }
    }

    @ObfuscatedName("fl.i(IIILjava/lang/Object;B)Lfy;")
    public final class166 method2991(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2191 = arg0;
        var5.field2186 = arg1;
        var5.field2193 = arg3;
        synchronized (this) {
            if (this.field2197 == null) {
                this.field2197 = this.field2201 = var5;
            } else {
                this.field2197.field2188 = var5;
                this.field2197 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fl.o(Ljava/lang/String;II)Lfy;")
    public final class166 method3002(String arg0, int arg1) {
        return this.method2991(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fl.j(Ljava/lang/Runnable;IB)Lfy;")
    public final class166 method2989(Runnable arg0, int arg1) {
        return this.method2991(2, arg1, 0, arg0);
    }
}
