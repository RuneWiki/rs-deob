package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ea")
public class class136 implements Runnable {

    @ObfuscatedName("ea.a")
    public class54 field2093;

    @ObfuscatedName("ea.i")
    public class146 field2094 = null;

    @ObfuscatedName("ea.f")
    public class146 field2107 = null;

    @ObfuscatedName("ea.m")
    public Thread field2096;

    @ObfuscatedName("ea.o")
    public boolean field2097 = false;

    @ObfuscatedName("ea.h")
    public EventQueue field2098;

    public class136() {
        Statics.field2092 = "Unknown";
        Statics.field2091 = "1.1";
        try {
            Statics.field2092 = System.getProperty("java.vendor");
            Statics.field2091 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2098 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2097 = false;
        this.field2096 = new Thread(this);
        this.field2096.setPriority(10);
        this.field2096.setDaemon(true);
        this.field2096.start();
    }

    @ObfuscatedName("ea.i(S)V")
    public final void method2665() {
        synchronized (this) {
            this.field2097 = true;
            this.notifyAll();
        }
        try {
            this.field2096.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2097) {
                        return;
                    }
                    if (this.field2094 != null) {
                        var2 = this.field2094;
                        this.field2094 = this.field2094.field2227;
                        if (this.field2094 == null) {
                            this.field2107 = null;
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
                int var5 = var2.field2219;
                if (var5 == 1) {
                    var2.field2224 = new Socket(InetAddress.getByName((String) var2.field2226), var2.field2225);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2226);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2225);
                    var2.field2224 = var6;
                } else if (var5 == 4) {
                    var2.field2224 = new DataInputStream(((URL) var2.field2226).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2225 >> 24 & 0xFF) + "." + (var2.field2225 >> 16 & 0xFF) + "." + (var2.field2225 >> 8 & 0xFF) + "." + (var2.field2225 & 0xFF);
                    var2.field2224 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2223 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2223 = 2;
            }
        }
    }

    @ObfuscatedName("ea.f(IIILjava/lang/Object;I)Lez;")
    public final class146 method2684(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2219 = arg0;
        var5.field2225 = arg1;
        var5.field2226 = arg3;
        synchronized (this) {
            if (this.field2107 == null) {
                this.field2107 = this.field2094 = var5;
            } else {
                this.field2107.field2227 = var5;
                this.field2107 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ea.m(Ljava/lang/String;IB)Lez;")
    public final class146 method2667(String arg0, int arg1) {
        return this.method2684(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ea.o(Ljava/lang/Runnable;II)Lez;")
    public final class146 method2689(Runnable arg0, int arg1) {
        return this.method2684(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ea.h(II)Lez;")
    public final class146 method2666(int arg0) {
        return this.method2684(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ea.n(Ljava/net/URL;I)Lez;")
    public final class146 method2670(URL arg0) {
        return this.method2684(4, 0, 0, arg0);
    }

    @ObfuscatedName("ea.k(I)Lbv;")
    public final class54 method2671() {
        return this.field2093;
    }
}
