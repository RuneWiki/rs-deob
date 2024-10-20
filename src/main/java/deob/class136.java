package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("es")
public class class136 implements Runnable {

    @ObfuscatedName("es.g")
    public class54 field2071;

    @ObfuscatedName("es.w")
    public class146 field2070 = null;

    @ObfuscatedName("es.e")
    public class146 field2076 = null;

    @ObfuscatedName("es.c")
    public Thread field2078;

    @ObfuscatedName("es.a")
    public boolean field2075 = false;

    @ObfuscatedName("es.q")
    public EventQueue field2069;

    public class136() {
        Statics.field2074 = "Unknown";
        Statics.field2073 = "1.1";
        try {
            Statics.field2074 = System.getProperty("java.vendor");
            Statics.field2073 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2069 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2075 = false;
        this.field2078 = new Thread(this);
        this.field2078.setPriority(10);
        this.field2078.setDaemon(true);
        this.field2078.start();
    }

    @ObfuscatedName("es.d(B)V")
    public final void method2679() {
        synchronized (this) {
            this.field2075 = true;
            this.notifyAll();
        }
        try {
            this.field2078.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2075) {
                        return;
                    }
                    if (this.field2070 != null) {
                        var2 = this.field2070;
                        this.field2070 = this.field2070.field2197;
                        if (this.field2070 == null) {
                            this.field2076 = null;
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
                int var5 = var2.field2200;
                if (var5 == 1) {
                    var2.field2202 = new Socket(InetAddress.getByName((String) var2.field2201), var2.field2194);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2201);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2194);
                    var2.field2202 = var6;
                } else if (var5 == 4) {
                    var2.field2202 = new DataInputStream(((URL) var2.field2201).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2194 >> 24 & 0xFF) + "." + (var2.field2194 >> 16 & 0xFF) + "." + (var2.field2194 >> 8 & 0xFF) + "." + (var2.field2194 & 0xFF);
                    var2.field2202 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2198 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2198 = 2;
            }
        }
    }

    @ObfuscatedName("es.g(IIILjava/lang/Object;B)Let;")
    public final class146 method2681(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2200 = arg0;
        var5.field2194 = arg1;
        var5.field2201 = arg3;
        synchronized (this) {
            if (this.field2076 == null) {
                this.field2076 = this.field2070 = var5;
            } else {
                this.field2076.field2197 = var5;
                this.field2076 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("es.w(Ljava/lang/String;IB)Let;")
    public final class146 method2680(String arg0, int arg1) {
        return this.method2681(1, arg1, 0, arg0);
    }

    @ObfuscatedName("es.e(Ljava/lang/Runnable;II)Let;")
    public final class146 method2689(Runnable arg0, int arg1) {
        return this.method2681(2, arg1, 0, arg0);
    }

    @ObfuscatedName("es.c(II)Let;")
    public final class146 method2677(int arg0) {
        return this.method2681(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("es.a(Ljava/net/URL;I)Let;")
    public final class146 method2693(URL arg0) {
        return this.method2681(4, 0, 0, arg0);
    }

    @ObfuscatedName("es.q(B)Lbd;")
    public final class54 method2684() {
        return this.field2071;
    }
}
