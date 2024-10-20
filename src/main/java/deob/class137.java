package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ek")
public class class137 implements Runnable {

    @ObfuscatedName("ek.g")
    public class54 field2116;

    @ObfuscatedName("ek.h")
    public class147 field2114 = null;

    @ObfuscatedName("ek.z")
    public class147 field2112 = null;

    @ObfuscatedName("ek.r")
    public Thread field2113;

    @ObfuscatedName("ek.f")
    public boolean field2117 = false;

    @ObfuscatedName("ek.s")
    public EventQueue field2118;

    public class137() {
        Statics.field2115 = "Unknown";
        Statics.field2125 = "1.1";
        try {
            Statics.field2115 = System.getProperty("java.vendor");
            Statics.field2125 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2118 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2117 = false;
        this.field2113 = new Thread(this);
        this.field2113.setPriority(10);
        this.field2113.setDaemon(true);
        this.field2113.start();
    }

    @ObfuscatedName("ek.g(B)V")
    public final void method2694() {
        synchronized (this) {
            this.field2117 = true;
            this.notifyAll();
        }
        try {
            this.field2113.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class147 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2117) {
                        return;
                    }
                    if (this.field2114 != null) {
                        var2 = this.field2114;
                        this.field2114 = this.field2114.field2246;
                        if (this.field2114 == null) {
                            this.field2112 = null;
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
                int var5 = var2.field2251;
                if (var5 == 1) {
                    var2.field2247 = new Socket(InetAddress.getByName((String) var2.field2253), var2.field2252);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2253);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2252);
                    var2.field2247 = var6;
                } else if (var5 == 4) {
                    var2.field2247 = new DataInputStream(((URL) var2.field2253).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2252 >> 24 & 0xFF) + "." + (var2.field2252 >> 16 & 0xFF) + "." + (var2.field2252 >> 8 & 0xFF) + "." + (var2.field2252 & 0xFF);
                    var2.field2247 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2250 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2250 = 2;
            }
        }
    }

    @ObfuscatedName("ek.h(IIILjava/lang/Object;I)Leb;")
    public final class147 method2703(int arg0, int arg1, int arg2, Object arg3) {
        class147 var5 = new class147();
        var5.field2251 = arg0;
        var5.field2252 = arg1;
        var5.field2253 = arg3;
        synchronized (this) {
            if (this.field2112 == null) {
                this.field2112 = this.field2114 = var5;
            } else {
                this.field2112.field2246 = var5;
                this.field2112 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ek.z(Ljava/lang/String;II)Leb;")
    public final class147 method2700(String arg0, int arg1) {
        return this.method2703(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ek.r(Ljava/lang/Runnable;II)Leb;")
    public final class147 method2701(Runnable arg0, int arg1) {
        return this.method2703(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ek.f(II)Leb;")
    public final class147 method2690(int arg0) {
        return this.method2703(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ek.s(Ljava/net/URL;I)Leb;")
    public final class147 method2691(URL arg0) {
        return this.method2703(4, 0, 0, arg0);
    }

    @ObfuscatedName("ek.d(B)Lbi;")
    public final class54 method2692() {
        return this.field2116;
    }
}
