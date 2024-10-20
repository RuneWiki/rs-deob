package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ec")
public class class136 implements Runnable {

    @ObfuscatedName("ec.c")
    public class54 field2074;

    @ObfuscatedName("ec.l")
    public class146 field2075 = null;

    @ObfuscatedName("ec.r")
    public class146 field2072 = null;

    @ObfuscatedName("ec.u")
    public Thread field2077;

    @ObfuscatedName("ec.j")
    public boolean field2081 = false;

    @ObfuscatedName("ec.w")
    public EventQueue field2079;

    public class136() {
        Statics.field2080 = "Unknown";
        Statics.field2073 = "1.1";
        try {
            Statics.field2080 = System.getProperty("java.vendor");
            Statics.field2073 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2079 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2081 = false;
        this.field2077 = new Thread(this);
        this.field2077.setPriority(10);
        this.field2077.setDaemon(true);
        this.field2077.start();
    }

    @ObfuscatedName("ec.c(I)V")
    public final void method2709() {
        synchronized (this) {
            this.field2081 = true;
            this.notifyAll();
        }
        try {
            this.field2077.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2081) {
                        return;
                    }
                    if (this.field2075 != null) {
                        var2 = this.field2075;
                        this.field2075 = this.field2075.field2196;
                        if (this.field2075 == null) {
                            this.field2072 = null;
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
                int var5 = var2.field2201;
                if (var5 == 1) {
                    var2.field2204 = new Socket(InetAddress.getByName((String) var2.field2203), var2.field2202);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2203);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2202);
                    var2.field2204 = var6;
                } else if (var5 == 4) {
                    var2.field2204 = new DataInputStream(((URL) var2.field2203).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2202 >> 24 & 0xFF) + "." + (var2.field2202 >> 16 & 0xFF) + "." + (var2.field2202 >> 8 & 0xFF) + "." + (var2.field2202 & 0xFF);
                    var2.field2204 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2200 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2200 = 2;
            }
        }
    }

    @ObfuscatedName("ec.l(IIILjava/lang/Object;B)Leo;")
    public final class146 method2711(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2201 = arg0;
        var5.field2202 = arg1;
        var5.field2203 = arg3;
        synchronized (this) {
            if (this.field2072 == null) {
                this.field2072 = this.field2075 = var5;
            } else {
                this.field2072.field2196 = var5;
                this.field2072 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ec.r(Ljava/lang/String;IB)Leo;")
    public final class146 method2712(String arg0, int arg1) {
        return this.method2711(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ec.u(Ljava/lang/Runnable;II)Leo;")
    public final class146 method2713(Runnable arg0, int arg1) {
        return this.method2711(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ec.j(IB)Leo;")
    public final class146 method2717(int arg0) {
        return this.method2711(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ec.w(Ljava/net/URL;B)Leo;")
    public final class146 method2715(URL arg0) {
        return this.method2711(4, 0, 0, arg0);
    }

    @ObfuscatedName("ec.y(S)Lbd;")
    public final class54 method2710() {
        return this.field2074;
    }
}
