package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("en")
public class class136 implements Runnable {

    @ObfuscatedName("en.q")
    public class54 field2089;

    @ObfuscatedName("en.o")
    public class146 field2088 = null;

    @ObfuscatedName("en.g")
    public class146 field2091 = null;

    @ObfuscatedName("en.m")
    public Thread field2097;

    @ObfuscatedName("en.b")
    public boolean field2093 = false;

    @ObfuscatedName("en.p")
    public EventQueue field2094;

    public class136() {
        Statics.field2096 = "Unknown";
        Statics.field2087 = "1.1";
        try {
            Statics.field2096 = System.getProperty("java.vendor");
            Statics.field2087 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2094 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2093 = false;
        this.field2097 = new Thread(this);
        this.field2097.setPriority(10);
        this.field2097.setDaemon(true);
        this.field2097.start();
    }

    @ObfuscatedName("en.o(I)V")
    public final void method2720() {
        synchronized (this) {
            this.field2093 = true;
            this.notifyAll();
        }
        try {
            this.field2097.join();
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
                    if (this.field2088 != null) {
                        var2 = this.field2088;
                        this.field2088 = this.field2088.field2217;
                        if (this.field2088 == null) {
                            this.field2091 = null;
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
                int var5 = var2.field2216;
                if (var5 == 1) {
                    var2.field2211 = new Socket(InetAddress.getByName((String) var2.field2218), var2.field2214);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2218);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2214);
                    var2.field2211 = var6;
                } else if (var5 == 4) {
                    var2.field2211 = new DataInputStream(((URL) var2.field2218).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2214 >> 24 & 0xFF) + "." + (var2.field2214 >> 16 & 0xFF) + "." + (var2.field2214 >> 8 & 0xFF) + "." + (var2.field2214 & 0xFF);
                    var2.field2211 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2215 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2215 = 2;
            }
        }
    }

    @ObfuscatedName("en.g(IIILjava/lang/Object;S)Lej;")
    public final class146 method2721(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2216 = arg0;
        var5.field2214 = arg1;
        var5.field2218 = arg3;
        synchronized (this) {
            if (this.field2091 == null) {
                this.field2091 = this.field2088 = var5;
            } else {
                this.field2091.field2217 = var5;
                this.field2091 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("en.m(Ljava/lang/String;IB)Lej;")
    public final class146 method2722(String arg0, int arg1) {
        return this.method2721(1, arg1, 0, arg0);
    }

    @ObfuscatedName("en.b(Ljava/lang/Runnable;IB)Lej;")
    public final class146 method2736(Runnable arg0, int arg1) {
        return this.method2721(2, arg1, 0, arg0);
    }

    @ObfuscatedName("en.p(II)Lej;")
    public final class146 method2728(int arg0) {
        return this.method2721(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("en.t(Ljava/net/URL;S)Lej;")
    public final class146 method2735(URL arg0) {
        return this.method2721(4, 0, 0, arg0);
    }

    @ObfuscatedName("en.w(I)Lbb;")
    public final class54 method2726() {
        return this.field2089;
    }
}
