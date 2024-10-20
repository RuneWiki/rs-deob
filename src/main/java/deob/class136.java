package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ex")
public class class136 implements Runnable {

    @ObfuscatedName("ex.s")
    public class54 field2079;

    @ObfuscatedName("ex.q")
    public class146 field2074 = null;

    @ObfuscatedName("ex.j")
    public class146 field2075 = null;

    @ObfuscatedName("ex.k")
    public Thread field2076;

    @ObfuscatedName("ex.i")
    public boolean field2077 = false;

    @ObfuscatedName("ex.m")
    public EventQueue field2080;

    public class136() {
        Statics.field2078 = "Unknown";
        Statics.field2897 = "1.1";
        try {
            Statics.field2078 = System.getProperty("java.vendor");
            Statics.field2897 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2080 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2077 = false;
        this.field2076 = new Thread(this);
        this.field2076.setPriority(10);
        this.field2076.setDaemon(true);
        this.field2076.start();
    }

    @ObfuscatedName("ex.s(I)V")
    public final void method2705() {
        synchronized (this) {
            this.field2077 = true;
            this.notifyAll();
        }
        try {
            this.field2076.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2077) {
                        return;
                    }
                    if (this.field2074 != null) {
                        var2 = this.field2074;
                        this.field2074 = this.field2074.field2199;
                        if (this.field2074 == null) {
                            this.field2075 = null;
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
                    var2.field2205 = new Socket(InetAddress.getByName((String) var2.field2204), var2.field2203);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2204);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2203);
                    var2.field2205 = var6;
                } else if (var5 == 4) {
                    var2.field2205 = new DataInputStream(((URL) var2.field2204).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2203 >> 24 & 0xFF) + "." + (var2.field2203 >> 16 & 0xFF) + "." + (var2.field2203 >> 8 & 0xFF) + "." + (var2.field2203 & 0xFF);
                    var2.field2205 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2202 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2202 = 2;
            }
        }
    }

    @ObfuscatedName("ex.q(IIILjava/lang/Object;I)Lei;")
    public final class146 method2707(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2201 = arg0;
        var5.field2203 = arg1;
        var5.field2204 = arg3;
        synchronized (this) {
            if (this.field2075 == null) {
                this.field2075 = this.field2074 = var5;
            } else {
                this.field2075.field2199 = var5;
                this.field2075 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ex.j(Ljava/lang/String;II)Lei;")
    public final class146 method2708(String arg0, int arg1) {
        return this.method2707(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ex.k(Ljava/lang/Runnable;IS)Lei;")
    public final class146 method2709(Runnable arg0, int arg1) {
        return this.method2707(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ex.i(II)Lei;")
    public final class146 method2711(int arg0) {
        return this.method2707(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ex.m(Ljava/net/URL;I)Lei;")
    public final class146 method2725(URL arg0) {
        return this.method2707(4, 0, 0, arg0);
    }

    @ObfuscatedName("ex.p(I)Lby;")
    public final class54 method2719() {
        return this.field2079;
    }
}
