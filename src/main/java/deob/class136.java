package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ev")
public class class136 implements Runnable {

    @ObfuscatedName("ev.i")
    public class54 field2100;

    @ObfuscatedName("ev.q")
    public class146 field2090 = null;

    @ObfuscatedName("ev.p")
    public class146 field2094 = null;

    @ObfuscatedName("ev.c")
    public Thread field2095;

    @ObfuscatedName("ev.f")
    public boolean field2093 = false;

    @ObfuscatedName("ev.y")
    public EventQueue field2097;

    public class136() {
        Statics.field2101 = "Unknown";
        Statics.field2091 = "1.1";
        try {
            Statics.field2101 = System.getProperty("java.vendor");
            Statics.field2091 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2097 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2093 = false;
        this.field2095 = new Thread(this);
        this.field2095.setPriority(10);
        this.field2095.setDaemon(true);
        this.field2095.start();
    }

    @ObfuscatedName("ev.i(I)V")
    public final void method2685() {
        synchronized (this) {
            this.field2093 = true;
            this.notifyAll();
        }
        try {
            this.field2095.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2093) {
                        return;
                    }
                    if (this.field2090 != null) {
                        var2 = this.field2090;
                        this.field2090 = this.field2090.field2216;
                        if (this.field2090 == null) {
                            this.field2094 = null;
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
                int var5 = var2.field2217;
                if (var5 == 1) {
                    var2.field2219 = new Socket(InetAddress.getByName((String) var2.field2218), var2.field2211);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2218);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2211);
                    var2.field2219 = var6;
                } else if (var5 == 4) {
                    var2.field2219 = new DataInputStream(((URL) var2.field2218).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2211 >> 24 & 0xFF) + "." + (var2.field2211 >> 16 & 0xFF) + "." + (var2.field2211 >> 8 & 0xFF) + "." + (var2.field2211 & 0xFF);
                    var2.field2219 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2215 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2215 = 2;
            }
        }
    }

    @ObfuscatedName("ev.q(IIILjava/lang/Object;I)Leo;")
    public final class146 method2703(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2217 = arg0;
        var5.field2211 = arg1;
        var5.field2218 = arg3;
        synchronized (this) {
            if (this.field2094 == null) {
                this.field2094 = this.field2090 = var5;
            } else {
                this.field2094.field2216 = var5;
                this.field2094 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ev.p(Ljava/lang/String;IB)Leo;")
    public final class146 method2688(String arg0, int arg1) {
        return this.method2703(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ev.c(Ljava/lang/Runnable;IB)Leo;")
    public final class146 method2689(Runnable arg0, int arg1) {
        return this.method2703(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ev.f(II)Leo;")
    public final class146 method2715(int arg0) {
        return this.method2703(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ev.y(Ljava/net/URL;B)Leo;")
    public final class146 method2691(URL arg0) {
        return this.method2703(4, 0, 0, arg0);
    }

    @ObfuscatedName("ev.w(I)Lbo;")
    public final class54 method2692() {
        return this.field2100;
    }
}
