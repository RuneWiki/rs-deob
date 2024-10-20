package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ez")
public class class136 implements Runnable {

    @ObfuscatedName("ez.q")
    public class54 field2099;

    @ObfuscatedName("ez.g")
    public class146 field2093 = null;

    @ObfuscatedName("ez.m")
    public class146 field2094 = null;

    @ObfuscatedName("ez.t")
    public Thread field2090;

    @ObfuscatedName("ez.j")
    public boolean field2096 = false;

    @ObfuscatedName("ez.n")
    public EventQueue field2091;

    public class136() {
        Statics.field2102 = "Unknown";
        Statics.field2097 = "1.1";
        try {
            Statics.field2102 = System.getProperty("java.vendor");
            Statics.field2097 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2091 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2096 = false;
        this.field2090 = new Thread(this);
        this.field2090.setPriority(10);
        this.field2090.setDaemon(true);
        this.field2090.start();
    }

    @ObfuscatedName("ez.m(I)V")
    public final void method2711() {
        synchronized (this) {
            this.field2096 = true;
            this.notifyAll();
        }
        try {
            this.field2090.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2096) {
                        return;
                    }
                    if (this.field2093 != null) {
                        var2 = this.field2093;
                        this.field2093 = this.field2093.field2200;
                        if (this.field2093 == null) {
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
                int var5 = var2.field2204;
                if (var5 == 1) {
                    var2.field2205 = new Socket(InetAddress.getByName((String) var2.field2199), var2.field2203);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2199);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2203);
                    var2.field2205 = var6;
                } else if (var5 == 4) {
                    var2.field2205 = new DataInputStream(((URL) var2.field2199).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2203 >> 24 & 0xFF) + "." + (var2.field2203 >> 16 & 0xFF) + "." + (var2.field2203 >> 8 & 0xFF) + "." + (var2.field2203 & 0xFF);
                    var2.field2205 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2206 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2206 = 2;
            }
        }
    }

    @ObfuscatedName("ez.t(IIILjava/lang/Object;I)Leb;")
    public final class146 method2731(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2204 = arg0;
        var5.field2203 = arg1;
        var5.field2199 = arg3;
        synchronized (this) {
            if (this.field2094 == null) {
                this.field2094 = this.field2093 = var5;
            } else {
                this.field2094.field2200 = var5;
                this.field2094 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ez.j(Ljava/lang/String;II)Leb;")
    public final class146 method2713(String arg0, int arg1) {
        return this.method2731(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ez.n(Ljava/lang/Runnable;II)Leb;")
    public final class146 method2714(Runnable arg0, int arg1) {
        return this.method2731(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ez.l(II)Leb;")
    public final class146 method2712(int arg0) {
        return this.method2731(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ez.i(Ljava/net/URL;I)Leb;")
    public final class146 method2715(URL arg0) {
        return this.method2731(4, 0, 0, arg0);
    }

    @ObfuscatedName("ez.w(I)Lbe;")
    public final class54 method2710() {
        return this.field2099;
    }
}
