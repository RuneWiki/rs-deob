package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ei")
public class class137 implements Runnable {

    @ObfuscatedName("ei.x")
    public class54 field2096;

    @ObfuscatedName("ei.b")
    public class147 field2093 = null;

    @ObfuscatedName("ei.l")
    public class147 field2094 = null;

    @ObfuscatedName("ei.d")
    public Thread field2100;

    @ObfuscatedName("ei.n")
    public boolean field2095 = false;

    @ObfuscatedName("ei.m")
    public EventQueue field2097;

    public class137() {
        Statics.field2090 = "Unknown";
        Statics.field2091 = "1.1";
        try {
            Statics.field2090 = System.getProperty("java.vendor");
            Statics.field2091 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2097 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2095 = false;
        this.field2100 = new Thread(this);
        this.field2100.setPriority(10);
        this.field2100.setDaemon(true);
        this.field2100.start();
    }

    @ObfuscatedName("ei.d(S)V")
    public final void method2725() {
        synchronized (this) {
            this.field2095 = true;
            this.notifyAll();
        }
        try {
            this.field2100.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class147 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2095) {
                        return;
                    }
                    if (this.field2093 != null) {
                        var2 = this.field2093;
                        this.field2093 = this.field2093.field2212;
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
                int var5 = var2.field2216;
                if (var5 == 1) {
                    var2.field2217 = new Socket(InetAddress.getByName((String) var2.field2218), var2.field2211);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2218);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2211);
                    var2.field2217 = var6;
                } else if (var5 == 4) {
                    var2.field2217 = new DataInputStream(((URL) var2.field2218).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2211 >> 24 & 0xFF) + "." + (var2.field2211 >> 16 & 0xFF) + "." + (var2.field2211 >> 8 & 0xFF) + "." + (var2.field2211 & 0xFF);
                    var2.field2217 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2215 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2215 = 2;
            }
        }
    }

    @ObfuscatedName("ei.n(IIILjava/lang/Object;S)Lev;")
    public final class147 method2727(int arg0, int arg1, int arg2, Object arg3) {
        class147 var5 = new class147();
        var5.field2216 = arg0;
        var5.field2211 = arg1;
        var5.field2218 = arg3;
        synchronized (this) {
            if (this.field2094 == null) {
                this.field2094 = this.field2093 = var5;
            } else {
                this.field2094.field2212 = var5;
                this.field2094 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ei.m(Ljava/lang/String;II)Lev;")
    public final class147 method2728(String arg0, int arg1) {
        return this.method2727(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ei.g(Ljava/lang/Runnable;II)Lev;")
    public final class147 method2729(Runnable arg0, int arg1) {
        return this.method2727(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ei.s(IB)Lev;")
    public final class147 method2744(int arg0) {
        return this.method2727(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ei.r(Ljava/net/URL;I)Lev;")
    public final class147 method2731(URL arg0) {
        return this.method2727(4, 0, 0, arg0);
    }

    @ObfuscatedName("ei.k(I)Lbo;")
    public final class54 method2732() {
        return this.field2096;
    }
}
