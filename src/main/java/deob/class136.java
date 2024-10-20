package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ep")
public class class136 implements Runnable {

    @ObfuscatedName("ep.f")
    public class54 field2083;

    @ObfuscatedName("ep.l")
    public class146 field2075 = null;

    @ObfuscatedName("ep.u")
    public class146 field2076 = null;

    @ObfuscatedName("ep.a")
    public Thread field2077;

    @ObfuscatedName("ep.h")
    public boolean field2078 = false;

    @ObfuscatedName("ep.i")
    public EventQueue field2079;

    public class136() {
        Statics.field2090 = "Unknown";
        Statics.field2081 = "1.1";
        try {
            Statics.field2090 = System.getProperty("java.vendor");
            Statics.field2081 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2079 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2078 = false;
        this.field2077 = new Thread(this);
        this.field2077.setPriority(10);
        this.field2077.setDaemon(true);
        this.field2077.start();
    }

    @ObfuscatedName("ep.m(I)V")
    public final void method2740() {
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
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2078) {
                        return;
                    }
                    if (this.field2075 != null) {
                        var2 = this.field2075;
                        this.field2075 = this.field2075.field2198;
                        if (this.field2075 == null) {
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
                int var5 = var2.field2202;
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
                var2.field2199 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2199 = 2;
            }
        }
    }

    @ObfuscatedName("ep.f(IIILjava/lang/Object;S)Leg;")
    public final class146 method2742(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2202 = arg0;
        var5.field2203 = arg1;
        var5.field2204 = arg3;
        synchronized (this) {
            if (this.field2076 == null) {
                this.field2076 = this.field2075 = var5;
            } else {
                this.field2076.field2198 = var5;
                this.field2076 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ep.l(Ljava/lang/String;II)Leg;")
    public final class146 method2743(String arg0, int arg1) {
        return this.method2742(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ep.u(Ljava/lang/Runnable;II)Leg;")
    public final class146 method2747(Runnable arg0, int arg1) {
        return this.method2742(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ep.a(II)Leg;")
    public final class146 method2744(int arg0) {
        return this.method2742(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ep.h(Ljava/net/URL;I)Leg;")
    public final class146 method2745(URL arg0) {
        return this.method2742(4, 0, 0, arg0);
    }

    @ObfuscatedName("ep.i(B)Lbn;")
    public final class54 method2754() {
        return this.field2083;
    }
}
