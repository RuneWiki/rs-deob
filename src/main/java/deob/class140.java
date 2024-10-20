package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ed")
public class class140 implements Runnable {

    @ObfuscatedName("ed.t")
    public class150 field2141 = null;

    @ObfuscatedName("ed.y")
    public class150 field2143 = null;

    @ObfuscatedName("ed.p")
    public Thread field2140;

    @ObfuscatedName("ed.g")
    public boolean field2136 = false;

    @ObfuscatedName("ed.m")
    public EventQueue field2142;

    public class140() {
        Statics.field2138 = "Unknown";
        Statics.field2137 = "1.1";
        try {
            Statics.field2138 = System.getProperty("java.vendor");
            Statics.field2137 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2142 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2136 = false;
        this.field2140 = new Thread(this);
        this.field2140.setPriority(10);
        this.field2140.setDaemon(true);
        this.field2140.start();
    }

    @ObfuscatedName("ed.t(I)V")
    public final void method2754() {
        synchronized (this) {
            this.field2136 = true;
            this.notifyAll();
        }
        try {
            this.field2140.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class150 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2136) {
                        return;
                    }
                    if (this.field2141 != null) {
                        var2 = this.field2141;
                        this.field2141 = this.field2141.field2260;
                        if (this.field2141 == null) {
                            this.field2143 = null;
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
                int var5 = var2.field2259;
                if (var5 == 1) {
                    var2.field2262 = new Socket(InetAddress.getByName((String) var2.field2254), var2.field2255);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2254);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2255);
                    var2.field2262 = var6;
                } else if (var5 == 4) {
                    var2.field2262 = new DataInputStream(((URL) var2.field2254).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2255 >> 24 & 0xFF) + "." + (var2.field2255 >> 16 & 0xFF) + "." + (var2.field2255 >> 8 & 0xFF) + "." + (var2.field2255 & 0xFF);
                    var2.field2262 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2258 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2258 = 2;
            }
        }
    }

    @ObfuscatedName("ed.y(IIILjava/lang/Object;I)Lea;")
    public final class150 method2753(int arg0, int arg1, int arg2, Object arg3) {
        class150 var5 = new class150();
        var5.field2259 = arg0;
        var5.field2255 = arg1;
        var5.field2254 = arg3;
        synchronized (this) {
            if (this.field2143 == null) {
                this.field2143 = this.field2141 = var5;
            } else {
                this.field2143.field2260 = var5;
                this.field2143 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ed.p(Ljava/lang/String;II)Lea;")
    public final class150 method2768(String arg0, int arg1) {
        return this.method2753(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.g(Ljava/lang/Runnable;II)Lea;")
    public final class150 method2755(Runnable arg0, int arg1) {
        return this.method2753(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.m(II)Lea;")
    public final class150 method2756(int arg0) {
        return this.method2753(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ed.f(Ljava/net/URL;I)Lea;")
    public final class150 method2757(URL arg0) {
        return this.method2753(4, 0, 0, arg0);
    }
}
