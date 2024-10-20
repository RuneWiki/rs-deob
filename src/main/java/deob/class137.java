package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("es")
public class class137 implements Runnable {

    @ObfuscatedName("es.t")
    public class54 field2105;

    @ObfuscatedName("es.p")
    public class147 field2109 = null;

    @ObfuscatedName("es.e")
    public class147 field2107 = null;

    @ObfuscatedName("es.y")
    public Thread field2108;

    @ObfuscatedName("es.m")
    public boolean field2106 = false;

    @ObfuscatedName("es.c")
    public EventQueue field2110;

    public class137() {
        Statics.field2113 = "Unknown";
        Statics.field787 = "1.1";
        try {
            Statics.field2113 = System.getProperty("java.vendor");
            Statics.field787 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2110 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2106 = false;
        this.field2108 = new Thread(this);
        this.field2108.setPriority(10);
        this.field2108.setDaemon(true);
        this.field2108.start();
    }

    @ObfuscatedName("es.x(B)V")
    public final void method2736() {
        synchronized (this) {
            this.field2106 = true;
            this.notifyAll();
        }
        try {
            this.field2108.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class147 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2106) {
                        return;
                    }
                    if (this.field2109 != null) {
                        var2 = this.field2109;
                        this.field2109 = this.field2109.field2232;
                        if (this.field2109 == null) {
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
                int var5 = var2.field2237;
                if (var5 == 1) {
                    var2.field2235 = new Socket(InetAddress.getByName((String) var2.field2239), var2.field2238);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2239);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2238);
                    var2.field2235 = var6;
                } else if (var5 == 4) {
                    var2.field2235 = new DataInputStream(((URL) var2.field2239).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2238 >> 24 & 0xFF) + "." + (var2.field2238 >> 16 & 0xFF) + "." + (var2.field2238 >> 8 & 0xFF) + "." + (var2.field2238 & 0xFF);
                    var2.field2235 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2236 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2236 = 2;
            }
        }
    }

    @ObfuscatedName("es.t(IIILjava/lang/Object;I)Len;")
    public final class147 method2737(int arg0, int arg1, int arg2, Object arg3) {
        class147 var5 = new class147();
        var5.field2237 = arg0;
        var5.field2238 = arg1;
        var5.field2239 = arg3;
        synchronized (this) {
            if (this.field2107 == null) {
                this.field2107 = this.field2109 = var5;
            } else {
                this.field2107.field2232 = var5;
                this.field2107 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("es.p(Ljava/lang/String;IS)Len;")
    public final class147 method2735(String arg0, int arg1) {
        return this.method2737(1, arg1, 0, arg0);
    }

    @ObfuscatedName("es.e(Ljava/lang/Runnable;II)Len;")
    public final class147 method2739(Runnable arg0, int arg1) {
        return this.method2737(2, arg1, 0, arg0);
    }

    @ObfuscatedName("es.y(IB)Len;")
    public final class147 method2747(int arg0) {
        return this.method2737(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("es.m(Ljava/net/URL;I)Len;")
    public final class147 method2738(URL arg0) {
        return this.method2737(4, 0, 0, arg0);
    }

    @ObfuscatedName("es.c(B)Lbb;")
    public final class54 method2746() {
        return this.field2105;
    }
}
