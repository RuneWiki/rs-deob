package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ed")
public class class137 implements Runnable {

    @ObfuscatedName("ed.j")
    public class54 field2079;

    @ObfuscatedName("ed.d")
    public class147 field2075 = null;

    @ObfuscatedName("ed.x")
    public class147 field2073 = null;

    @ObfuscatedName("ed.y")
    public Thread field2077;

    @ObfuscatedName("ed.r")
    public boolean field2078 = false;

    @ObfuscatedName("ed.c")
    public EventQueue field2076;

    public class137() {
        Statics.field660 = "Unknown";
        Statics.field2080 = "1.1";
        try {
            Statics.field660 = System.getProperty("java.vendor");
            Statics.field2080 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2076 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2078 = false;
        this.field2077 = new Thread(this);
        this.field2077.setPriority(10);
        this.field2077.setDaemon(true);
        this.field2077.start();
    }

    @ObfuscatedName("ed.d(I)V")
    public final void method2738() {
        synchronized (this) {
            this.field2078 = true;
            this.notifyAll();
        }
        try {
            this.field2077.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class147 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2078) {
                        return;
                    }
                    if (this.field2075 != null) {
                        var2 = this.field2075;
                        this.field2075 = this.field2075.field2196;
                        if (this.field2075 == null) {
                            this.field2073 = null;
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
                int var5 = var2.field2198;
                if (var5 == 1) {
                    var2.field2202 = new Socket(InetAddress.getByName((String) var2.field2203), var2.field2201);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2203);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2201);
                    var2.field2202 = var6;
                } else if (var5 == 4) {
                    var2.field2202 = new DataInputStream(((URL) var2.field2203).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2201 >> 24 & 0xFF) + "." + (var2.field2201 >> 16 & 0xFF) + "." + (var2.field2201 >> 8 & 0xFF) + "." + (var2.field2201 & 0xFF);
                    var2.field2202 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2200 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2200 = 2;
            }
        }
    }

    @ObfuscatedName("ed.x(IIILjava/lang/Object;I)Lea;")
    public final class147 method2739(int arg0, int arg1, int arg2, Object arg3) {
        class147 var5 = new class147();
        var5.field2198 = arg0;
        var5.field2201 = arg1;
        var5.field2203 = arg3;
        synchronized (this) {
            if (this.field2073 == null) {
                this.field2073 = this.field2075 = var5;
            } else {
                this.field2073.field2196 = var5;
                this.field2073 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ed.y(Ljava/lang/String;II)Lea;")
    public final class147 method2740(String arg0, int arg1) {
        return this.method2739(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.r(Ljava/lang/Runnable;II)Lea;")
    public final class147 method2741(Runnable arg0, int arg1) {
        return this.method2739(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.c(II)Lea;")
    public final class147 method2752(int arg0) {
        return this.method2739(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ed.l(Ljava/net/URL;B)Lea;")
    public final class147 method2749(URL arg0) {
        return this.method2739(4, 0, 0, arg0);
    }

    @ObfuscatedName("ed.u(I)Lbj;")
    public final class54 method2744() {
        return this.field2079;
    }
}
