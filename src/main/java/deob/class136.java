package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ed")
public class class136 implements Runnable {

    @ObfuscatedName("ed.u")
    public class54 field2075;

    @ObfuscatedName("ed.b")
    public class146 field2078 = null;

    @ObfuscatedName("ed.p")
    public class146 field2094 = null;

    @ObfuscatedName("ed.s")
    public Thread field2080;

    @ObfuscatedName("ed.y")
    public boolean field2081 = false;

    @ObfuscatedName("ed.t")
    public EventQueue field2082;

    public class136() {
        Statics.field2084 = "Unknown";
        Statics.field2076 = "1.1";
        try {
            Statics.field2084 = System.getProperty("java.vendor");
            Statics.field2076 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2082 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2081 = false;
        this.field2080 = new Thread(this);
        this.field2080.setPriority(10);
        this.field2080.setDaemon(true);
        this.field2080.start();
    }

    @ObfuscatedName("ed.b(B)V")
    public final void method2707() {
        synchronized (this) {
            this.field2081 = true;
            this.notifyAll();
        }
        try {
            this.field2080.join();
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
                    if (this.field2078 != null) {
                        var2 = this.field2078;
                        this.field2078 = this.field2078.field2211;
                        if (this.field2078 == null) {
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
                int var5 = var2.field2209;
                if (var5 == 1) {
                    var2.field2215 = new Socket(InetAddress.getByName((String) var2.field2214), var2.field2212);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2214);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2212);
                    var2.field2215 = var6;
                } else if (var5 == 4) {
                    var2.field2215 = new DataInputStream(((URL) var2.field2214).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2212 >> 24 & 0xFF) + "." + (var2.field2212 >> 16 & 0xFF) + "." + (var2.field2212 >> 8 & 0xFF) + "." + (var2.field2212 & 0xFF);
                    var2.field2215 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2208 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2208 = 2;
            }
        }
    }

    @ObfuscatedName("ed.p(IIILjava/lang/Object;S)Leq;")
    public final class146 method2708(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2209 = arg0;
        var5.field2212 = arg1;
        var5.field2214 = arg3;
        synchronized (this) {
            if (this.field2094 == null) {
                this.field2094 = this.field2078 = var5;
            } else {
                this.field2094.field2211 = var5;
                this.field2094 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ed.s(Ljava/lang/String;II)Leq;")
    public final class146 method2709(String arg0, int arg1) {
        return this.method2708(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.y(Ljava/lang/Runnable;IB)Leq;")
    public final class146 method2710(Runnable arg0, int arg1) {
        return this.method2708(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.t(IS)Leq;")
    public final class146 method2734(int arg0) {
        return this.method2708(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ed.w(Ljava/net/URL;I)Leq;")
    public final class146 method2712(URL arg0) {
        return this.method2708(4, 0, 0, arg0);
    }

    @ObfuscatedName("ed.h(I)Lbg;")
    public final class54 method2713() {
        return this.field2075;
    }
}
