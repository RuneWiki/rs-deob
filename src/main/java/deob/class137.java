package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ey")
public class class137 implements Runnable {

    @ObfuscatedName("ey.p")
    public class54 field2107;

    @ObfuscatedName("ey.x")
    public class147 field2108 = null;

    @ObfuscatedName("ey.d")
    public class147 field2109 = null;

    @ObfuscatedName("ey.u")
    public Thread field2110;

    @ObfuscatedName("ey.o")
    public boolean field2111 = false;

    @ObfuscatedName("ey.b")
    public EventQueue field2112;

    public class137() {
        Statics.field2116 = "Unknown";
        Statics.field2047 = "1.1";
        try {
            Statics.field2116 = System.getProperty("java.vendor");
            Statics.field2047 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2112 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2111 = false;
        this.field2110 = new Thread(this);
        this.field2110.setPriority(10);
        this.field2110.setDaemon(true);
        this.field2110.start();
    }

    @ObfuscatedName("ey.x(I)V")
    public final void method2722() {
        synchronized (this) {
            this.field2111 = true;
            this.notifyAll();
        }
        try {
            this.field2110.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class147 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2111) {
                        return;
                    }
                    if (this.field2108 != null) {
                        var2 = this.field2108;
                        this.field2108 = this.field2108.field2228;
                        if (this.field2108 == null) {
                            this.field2109 = null;
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
                int var5 = var2.field2223;
                if (var5 == 1) {
                    var2.field2225 = new Socket(InetAddress.getByName((String) var2.field2230), var2.field2229);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2230);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2229);
                    var2.field2225 = var6;
                } else if (var5 == 4) {
                    var2.field2225 = new DataInputStream(((URL) var2.field2230).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2229 >> 24 & 0xFF) + "." + (var2.field2229 >> 16 & 0xFF) + "." + (var2.field2229 >> 8 & 0xFF) + "." + (var2.field2229 & 0xFF);
                    var2.field2225 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2227 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2227 = 2;
            }
        }
    }

    @ObfuscatedName("ey.d(IIILjava/lang/Object;I)Lem;")
    public final class147 method2705(int arg0, int arg1, int arg2, Object arg3) {
        class147 var5 = new class147();
        var5.field2223 = arg0;
        var5.field2229 = arg1;
        var5.field2230 = arg3;
        synchronized (this) {
            if (this.field2109 == null) {
                this.field2109 = this.field2108 = var5;
            } else {
                this.field2109.field2228 = var5;
                this.field2109 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ey.u(Ljava/lang/String;IB)Lem;")
    public final class147 method2706(String arg0, int arg1) {
        return this.method2705(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ey.o(Ljava/lang/Runnable;IB)Lem;")
    public final class147 method2704(Runnable arg0, int arg1) {
        return this.method2705(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ey.b(II)Lem;")
    public final class147 method2708(int arg0) {
        return this.method2705(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ey.k(Ljava/net/URL;B)Lem;")
    public final class147 method2709(URL arg0) {
        return this.method2705(4, 0, 0, arg0);
    }

    @ObfuscatedName("ey.c(I)Lbt;")
    public final class54 method2710() {
        return this.field2107;
    }
}
