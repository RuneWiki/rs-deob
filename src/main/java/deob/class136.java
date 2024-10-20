package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eh")
public class class136 implements Runnable {

    @ObfuscatedName("eh.v")
    public class54 field2078;

    @ObfuscatedName("eh.n")
    public class146 field2082 = null;

    @ObfuscatedName("eh.f")
    public class146 field2080 = null;

    @ObfuscatedName("eh.g")
    public Thread field2077;

    @ObfuscatedName("eh.o")
    public boolean field2084 = false;

    @ObfuscatedName("eh.s")
    public EventQueue field2083;

    public class136() {
        Statics.field2081 = "Unknown";
        Statics.field3147 = "1.1";
        try {
            Statics.field2081 = System.getProperty("java.vendor");
            Statics.field3147 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2083 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2084 = false;
        this.field2077 = new Thread(this);
        this.field2077.setPriority(10);
        this.field2077.setDaemon(true);
        this.field2077.start();
    }

    @ObfuscatedName("eh.v(I)V")
    public final void method2759() {
        synchronized (this) {
            this.field2084 = true;
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
                    if (this.field2084) {
                        return;
                    }
                    if (this.field2082 != null) {
                        var2 = this.field2082;
                        this.field2082 = this.field2082.field2198;
                        if (this.field2082 == null) {
                            this.field2080 = null;
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
                int var5 = var2.field2196;
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

    @ObfuscatedName("eh.n(IIILjava/lang/Object;I)Lec;")
    public final class146 method2762(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2196 = arg0;
        var5.field2202 = arg1;
        var5.field2203 = arg3;
        synchronized (this) {
            if (this.field2080 == null) {
                this.field2080 = this.field2082 = var5;
            } else {
                this.field2080.field2198 = var5;
                this.field2080 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eh.f(Ljava/lang/String;II)Lec;")
    public final class146 method2765(String arg0, int arg1) {
        return this.method2762(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eh.g(Ljava/lang/Runnable;II)Lec;")
    public final class146 method2780(Runnable arg0, int arg1) {
        return this.method2762(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eh.o(II)Lec;")
    public final class146 method2772(int arg0) {
        return this.method2762(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("eh.s(Ljava/net/URL;I)Lec;")
    public final class146 method2764(URL arg0) {
        return this.method2762(4, 0, 0, arg0);
    }

    @ObfuscatedName("eh.k(I)Lbe;")
    public final class54 method2763() {
        return this.field2078;
    }
}
