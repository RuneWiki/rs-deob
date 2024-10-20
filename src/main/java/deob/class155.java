package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("em")
public class class155 implements Runnable {

    @ObfuscatedName("em.q")
    public class154 field2226 = null;

    @ObfuscatedName("em.o")
    public class154 field2228 = null;

    @ObfuscatedName("em.g")
    public Thread field2227;

    @ObfuscatedName("em.v")
    public boolean field2230 = false;

    public class155() {
        Statics.field2229 = "Unknown";
        Statics.field328 = "1.6";
        try {
            Statics.field2229 = System.getProperty("java.vendor");
            Statics.field328 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2230 = false;
        this.field2227 = new Thread(this);
        this.field2227.setPriority(10);
        this.field2227.setDaemon(true);
        this.field2227.start();
    }

    @ObfuscatedName("em.w(I)V")
    public final void method2742() {
        synchronized (this) {
            this.field2230 = true;
            this.notifyAll();
        }
        try {
            this.field2227.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2230) {
                        return;
                    }
                    if (this.field2226 != null) {
                        var2 = this.field2226;
                        this.field2226 = this.field2226.field2222;
                        if (this.field2226 == null) {
                            this.field2228 = null;
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
                int var5 = var2.field2221;
                if (var5 == 1) {
                    var2.field2225 = new Socket(InetAddress.getByName((String) var2.field2224), var2.field2223);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2224);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2223);
                    var2.field2225 = var6;
                } else if (var5 == 4) {
                    var2.field2225 = new DataInputStream(((URL) var2.field2224).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2223 >> 24 & 0xFF) + "." + (var2.field2223 >> 16 & 0xFF) + "." + (var2.field2223 >> 8 & 0xFF) + "." + (var2.field2223 & 0xFF);
                    var2.field2225 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2218 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2218 = 2;
            }
        }
    }

    @ObfuscatedName("em.s(IIILjava/lang/Object;I)Let;")
    public final class154 method2743(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field2221 = arg0;
        var5.field2223 = arg1;
        var5.field2224 = arg3;
        synchronized (this) {
            if (this.field2228 == null) {
                this.field2228 = this.field2226 = var5;
            } else {
                this.field2228.field2222 = var5;
                this.field2228 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("em.q(Ljava/lang/String;II)Let;")
    public final class154 method2745(String arg0, int arg1) {
        return this.method2743(1, arg1, 0, arg0);
    }

    @ObfuscatedName("em.o(Ljava/lang/Runnable;II)Let;")
    public final class154 method2746(Runnable arg0, int arg1) {
        return this.method2743(2, arg1, 0, arg0);
    }

    @ObfuscatedName("em.g(IS)Let;")
    public final class154 method2747(int arg0) {
        return this.method2743(3, arg0, 0, (Object) null);
    }
}
