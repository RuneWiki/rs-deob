package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ef")
public class class136 implements Runnable {

    @ObfuscatedName("ef.f")
    public class54 field2082;

    @ObfuscatedName("ef.s")
    public class146 field2083 = null;

    @ObfuscatedName("ef.y")
    public class146 field2084 = null;

    @ObfuscatedName("ef.e")
    public Thread field2085;

    @ObfuscatedName("ef.g")
    public boolean field2086 = false;

    @ObfuscatedName("ef.m")
    public EventQueue field2087;

    public class136() {
        Statics.field2081 = "Unknown";
        Statics.field1901 = "1.1";
        try {
            Statics.field2081 = System.getProperty("java.vendor");
            Statics.field1901 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2087 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2086 = false;
        this.field2085 = new Thread(this);
        this.field2085.setPriority(10);
        this.field2085.setDaemon(true);
        this.field2085.start();
    }

    @ObfuscatedName("ef.f(I)V")
    public final void method2707() {
        synchronized (this) {
            this.field2086 = true;
            this.notifyAll();
        }
        try {
            this.field2085.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2086) {
                        return;
                    }
                    if (this.field2083 != null) {
                        var2 = this.field2083;
                        this.field2083 = this.field2083.field2205;
                        if (this.field2083 == null) {
                            this.field2084 = null;
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
                int var5 = var2.field2199;
                if (var5 == 1) {
                    var2.field2207 = new Socket(InetAddress.getByName((String) var2.field2206), var2.field2204);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2206);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2204);
                    var2.field2207 = var6;
                } else if (var5 == 4) {
                    var2.field2207 = new DataInputStream(((URL) var2.field2206).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2204 >> 24 & 0xFF) + "." + (var2.field2204 >> 16 & 0xFF) + "." + (var2.field2204 >> 8 & 0xFF) + "." + (var2.field2204 & 0xFF);
                    var2.field2207 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2203 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2203 = 2;
            }
        }
    }

    @ObfuscatedName("ef.s(IIILjava/lang/Object;I)Leq;")
    public final class146 method2709(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2199 = arg0;
        var5.field2204 = arg1;
        var5.field2206 = arg3;
        synchronized (this) {
            if (this.field2084 == null) {
                this.field2084 = this.field2083 = var5;
            } else {
                this.field2084.field2205 = var5;
                this.field2084 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ef.y(Ljava/lang/String;II)Leq;")
    public final class146 method2710(String arg0, int arg1) {
        return this.method2709(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ef.e(Ljava/lang/Runnable;II)Leq;")
    public final class146 method2719(Runnable arg0, int arg1) {
        return this.method2709(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ef.g(II)Leq;")
    public final class146 method2706(int arg0) {
        return this.method2709(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ef.m(Ljava/net/URL;I)Leq;")
    public final class146 method2727(URL arg0) {
        return this.method2709(4, 0, 0, arg0);
    }

    @ObfuscatedName("ef.j(I)Lbr;")
    public final class54 method2712() {
        return this.field2082;
    }
}
