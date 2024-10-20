package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("en")
public class class155 implements Runnable {

    @ObfuscatedName("en.n")
    public class154 field2226 = null;

    @ObfuscatedName("en.r")
    public class154 field2236 = null;

    @ObfuscatedName("en.v")
    public Thread field2230;

    @ObfuscatedName("en.e")
    public boolean field2231 = false;

    public class155() {
        Statics.field2228 = "Unknown";
        Statics.field2227 = "1.6";
        try {
            Statics.field2228 = System.getProperty("java.vendor");
            Statics.field2227 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2231 = false;
        this.field2230 = new Thread(this);
        this.field2230.setPriority(10);
        this.field2230.setDaemon(true);
        this.field2230.start();
    }

    @ObfuscatedName("en.a(I)V")
    public final void method2674() {
        synchronized (this) {
            this.field2231 = true;
            this.notifyAll();
        }
        try {
            this.field2230.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2231) {
                        return;
                    }
                    if (this.field2226 != null) {
                        var2 = this.field2226;
                        this.field2226 = this.field2226.field2224;
                        if (this.field2226 == null) {
                            this.field2236 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var5 = var2.field2222;
                if (var5 == 1) {
                    var2.field2225 = new Socket(InetAddress.getByName((String) var2.field2220), var2.field2223);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2220);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2223);
                    var2.field2225 = var6;
                } else if (var5 == 4) {
                    var2.field2225 = new DataInputStream(((URL) var2.field2220).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2223 >> 24 & 0xFF) + "." + (var2.field2223 >> 16 & 0xFF) + "." + (var2.field2223 >> 8 & 0xFF) + "." + (var2.field2223 & 0xFF);
                    var2.field2225 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2221 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2221 = 2;
            }
        }
    }

    @ObfuscatedName("en.j(IIILjava/lang/Object;I)Lev;")
    public final class154 method2675(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field2222 = arg0;
        var5.field2223 = arg1;
        var5.field2220 = arg3;
        synchronized (this) {
            if (this.field2236 == null) {
                this.field2236 = this.field2226 = var5;
            } else {
                this.field2236.field2224 = var5;
                this.field2236 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("en.n(Ljava/lang/String;II)Lev;")
    public final class154 method2694(String arg0, int arg1) {
        return this.method2675(1, arg1, 0, arg0);
    }

    @ObfuscatedName("en.r(Ljava/lang/Runnable;II)Lev;")
    public final class154 method2677(Runnable arg0, int arg1) {
        return this.method2675(2, arg1, 0, arg0);
    }

    @ObfuscatedName("en.v(IB)Lev;")
    public final class154 method2695(int arg0) {
        return this.method2675(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("en.e(Ljava/net/URL;I)Lev;")
    public final class154 method2679(URL arg0) {
        return this.method2675(4, 0, 0, arg0);
    }
}
