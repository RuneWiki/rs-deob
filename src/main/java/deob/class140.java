package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ec")
public class class140 implements Runnable {

    @ObfuscatedName("ec.c")
    public class150 field2142 = null;

    @ObfuscatedName("ec.h")
    public class150 field2149 = null;

    @ObfuscatedName("ec.r")
    public Thread field2143;

    @ObfuscatedName("ec.a")
    public boolean field2147 = false;

    @ObfuscatedName("ec.b")
    public EventQueue field2145;

    public class140() {
        Statics.field2144 = "Unknown";
        Statics.field3191 = "1.1";
        try {
            Statics.field2144 = System.getProperty("java.vendor");
            Statics.field3191 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2145 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2147 = false;
        this.field2143 = new Thread(this);
        this.field2143.setPriority(10);
        this.field2143.setDaemon(true);
        this.field2143.start();
    }

    @ObfuscatedName("ec.r(B)V")
    public final void method2863() {
        synchronized (this) {
            this.field2147 = true;
            this.notifyAll();
        }
        try {
            this.field2143.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class150 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2147) {
                        return;
                    }
                    if (this.field2142 != null) {
                        var2 = this.field2142;
                        this.field2142 = this.field2142.field2262;
                        if (this.field2142 == null) {
                            this.field2149 = null;
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
                int var5 = var2.field2266;
                if (var5 == 1) {
                    var2.field2261 = new Socket(InetAddress.getByName((String) var2.field2268), var2.field2267);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2268);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2267);
                    var2.field2261 = var6;
                } else if (var5 == 4) {
                    var2.field2261 = new DataInputStream(((URL) var2.field2268).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2267 >> 24 & 0xFF) + "." + (var2.field2267 >> 16 & 0xFF) + "." + (var2.field2267 >> 8 & 0xFF) + "." + (var2.field2267 & 0xFF);
                    var2.field2261 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2265 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2265 = 2;
            }
        }
    }

    @ObfuscatedName("ec.a(IIILjava/lang/Object;I)Leu;")
    public final class150 method2855(int arg0, int arg1, int arg2, Object arg3) {
        class150 var5 = new class150();
        var5.field2266 = arg0;
        var5.field2267 = arg1;
        var5.field2268 = arg3;
        synchronized (this) {
            if (this.field2149 == null) {
                this.field2149 = this.field2142 = var5;
            } else {
                this.field2149.field2262 = var5;
                this.field2149 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ec.b(Ljava/lang/String;II)Leu;")
    public final class150 method2841(String arg0, int arg1) {
        return this.method2855(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ec.u(Ljava/lang/Runnable;II)Leu;")
    public final class150 method2852(Runnable arg0, int arg1) {
        return this.method2855(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ec.o(II)Leu;")
    public final class150 method2843(int arg0) {
        return this.method2855(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ec.p(Ljava/net/URL;I)Leu;")
    public final class150 method2844(URL arg0) {
        return this.method2855(4, 0, 0, arg0);
    }
}
