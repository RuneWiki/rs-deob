package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ed")
public class class140 implements Runnable {

    @ObfuscatedName("ed.r")
    public class150 field2150 = null;

    @ObfuscatedName("ed.e")
    public class150 field2154 = null;

    @ObfuscatedName("ed.h")
    public Thread field2146;

    @ObfuscatedName("ed.s")
    public boolean field2151 = false;

    @ObfuscatedName("ed.k")
    public EventQueue field2152;

    public class140() {
        Statics.field2153 = "Unknown";
        Statics.field2147 = "1.1";
        try {
            Statics.field2153 = System.getProperty("java.vendor");
            Statics.field2147 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2152 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2151 = false;
        this.field2146 = new Thread(this);
        this.field2146.setPriority(10);
        this.field2146.setDaemon(true);
        this.field2146.start();
    }

    @ObfuscatedName("ed.r(I)V")
    public final void method2877() {
        synchronized (this) {
            this.field2151 = true;
            this.notifyAll();
        }
        try {
            this.field2146.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class150 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2151) {
                        return;
                    }
                    if (this.field2150 != null) {
                        var2 = this.field2150;
                        this.field2150 = this.field2150.field2280;
                        if (this.field2150 == null) {
                            this.field2154 = null;
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
                int var5 = var2.field2276;
                if (var5 == 1) {
                    var2.field2273 = new Socket(InetAddress.getByName((String) var2.field2275), var2.field2279);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2275);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2279);
                    var2.field2273 = var6;
                } else if (var5 == 4) {
                    var2.field2273 = new DataInputStream(((URL) var2.field2275).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2279 >> 24 & 0xFF) + "." + (var2.field2279 >> 16 & 0xFF) + "." + (var2.field2279 >> 8 & 0xFF) + "." + (var2.field2279 & 0xFF);
                    var2.field2273 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2277 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2277 = 2;
            }
        }
    }

    @ObfuscatedName("ed.e(IIILjava/lang/Object;I)Lef;")
    public final class150 method2878(int arg0, int arg1, int arg2, Object arg3) {
        class150 var5 = new class150();
        var5.field2276 = arg0;
        var5.field2279 = arg1;
        var5.field2275 = arg3;
        synchronized (this) {
            if (this.field2154 == null) {
                this.field2154 = this.field2150 = var5;
            } else {
                this.field2154.field2280 = var5;
                this.field2154 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ed.h(Ljava/lang/String;IB)Lef;")
    public final class150 method2879(String arg0, int arg1) {
        return this.method2878(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.s(Ljava/lang/Runnable;II)Lef;")
    public final class150 method2880(Runnable arg0, int arg1) {
        return this.method2878(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.k(II)Lef;")
    public final class150 method2897(int arg0) {
        return this.method2878(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ed.u(Ljava/net/URL;B)Lef;")
    public final class150 method2882(URL arg0) {
        return this.method2878(4, 0, 0, arg0);
    }
}
