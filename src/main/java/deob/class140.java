package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("et")
public class class140 implements Runnable {

    @ObfuscatedName("et.n")
    public class150 field2143 = null;

    @ObfuscatedName("et.t")
    public class150 field2144 = null;

    @ObfuscatedName("et.v")
    public Thread field2145;

    @ObfuscatedName("et.b")
    public boolean field2146 = false;

    @ObfuscatedName("et.m")
    public EventQueue field2142;

    public class140() {
        Statics.field2147 = "Unknown";
        Statics.field2141 = "1.1";
        try {
            Statics.field2147 = System.getProperty("java.vendor");
            Statics.field2141 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2142 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2146 = false;
        this.field2145 = new Thread(this);
        this.field2145.setPriority(10);
        this.field2145.setDaemon(true);
        this.field2145.start();
    }

    @ObfuscatedName("et.t(I)V")
    public final void method2764() {
        synchronized (this) {
            this.field2146 = true;
            this.notifyAll();
        }
        try {
            this.field2145.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class150 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2146) {
                        return;
                    }
                    if (this.field2143 != null) {
                        var2 = this.field2143;
                        this.field2143 = this.field2143.field2266;
                        if (this.field2143 == null) {
                            this.field2144 = null;
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
                int var5 = var2.field2265;
                if (var5 == 1) {
                    var2.field2267 = new Socket(InetAddress.getByName((String) var2.field2261), var2.field2259);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2261);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2259);
                    var2.field2267 = var6;
                } else if (var5 == 4) {
                    var2.field2267 = new DataInputStream(((URL) var2.field2261).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2259 >> 24 & 0xFF) + "." + (var2.field2259 >> 16 & 0xFF) + "." + (var2.field2259 >> 8 & 0xFF) + "." + (var2.field2259 & 0xFF);
                    var2.field2267 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2263 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2263 = 2;
            }
        }
    }

    @ObfuscatedName("et.v(IIILjava/lang/Object;I)Ley;")
    public final class150 method2766(int arg0, int arg1, int arg2, Object arg3) {
        class150 var5 = new class150();
        var5.field2265 = arg0;
        var5.field2259 = arg1;
        var5.field2261 = arg3;
        synchronized (this) {
            if (this.field2144 == null) {
                this.field2144 = this.field2143 = var5;
            } else {
                this.field2144.field2266 = var5;
                this.field2144 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("et.b(Ljava/lang/String;II)Ley;")
    public final class150 method2767(String arg0, int arg1) {
        return this.method2766(1, arg1, 0, arg0);
    }

    @ObfuscatedName("et.m(Ljava/lang/Runnable;IB)Ley;")
    public final class150 method2768(Runnable arg0, int arg1) {
        return this.method2766(2, arg1, 0, arg0);
    }

    @ObfuscatedName("et.k(IB)Ley;")
    public final class150 method2769(int arg0) {
        return this.method2766(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("et.c(Ljava/net/URL;I)Ley;")
    public final class150 method2778(URL arg0) {
        return this.method2766(4, 0, 0, arg0);
    }
}
