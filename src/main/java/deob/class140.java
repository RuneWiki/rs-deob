package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("en")
public class class140 implements Runnable {

    @ObfuscatedName("en.v")
    public class150 field2161 = null;

    @ObfuscatedName("en.r")
    public class150 field2164 = null;

    @ObfuscatedName("en.z")
    public Thread field2165;

    @ObfuscatedName("en.t")
    public boolean field2166 = false;

    @ObfuscatedName("en.n")
    public EventQueue field2167;

    public class140() {
        Statics.field2163 = "Unknown";
        Statics.field2162 = "1.1";
        try {
            Statics.field2163 = System.getProperty("java.vendor");
            Statics.field2162 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2167 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2166 = false;
        this.field2165 = new Thread(this);
        this.field2165.setPriority(10);
        this.field2165.setDaemon(true);
        this.field2165.start();
    }

    @ObfuscatedName("en.d(I)V")
    public final void method2776() {
        synchronized (this) {
            this.field2166 = true;
            this.notifyAll();
        }
        try {
            this.field2165.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class150 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2166) {
                        return;
                    }
                    if (this.field2161 != null) {
                        var2 = this.field2161;
                        this.field2161 = this.field2161.field2284;
                        if (this.field2161 == null) {
                            this.field2164 = null;
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
                int var5 = var2.field2282;
                if (var5 == 1) {
                    var2.field2288 = new Socket(InetAddress.getByName((String) var2.field2280), var2.field2286);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2280);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2286);
                    var2.field2288 = var6;
                } else if (var5 == 4) {
                    var2.field2288 = new DataInputStream(((URL) var2.field2280).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2286 >> 24 & 0xFF) + "." + (var2.field2286 >> 16 & 0xFF) + "." + (var2.field2286 >> 8 & 0xFF) + "." + (var2.field2286 & 0xFF);
                    var2.field2288 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2285 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2285 = 2;
            }
        }
    }

    @ObfuscatedName("en.v(IIILjava/lang/Object;I)Lec;")
    public final class150 method2789(int arg0, int arg1, int arg2, Object arg3) {
        class150 var5 = new class150();
        var5.field2282 = arg0;
        var5.field2286 = arg1;
        var5.field2280 = arg3;
        synchronized (this) {
            if (this.field2164 == null) {
                this.field2164 = this.field2161 = var5;
            } else {
                this.field2164.field2284 = var5;
                this.field2164 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("en.r(Ljava/lang/String;IB)Lec;")
    public final class150 method2788(String arg0, int arg1) {
        return this.method2789(1, arg1, 0, arg0);
    }

    @ObfuscatedName("en.z(Ljava/lang/Runnable;II)Lec;")
    public final class150 method2794(Runnable arg0, int arg1) {
        return this.method2789(2, arg1, 0, arg0);
    }

    @ObfuscatedName("en.t(II)Lec;")
    public final class150 method2779(int arg0) {
        return this.method2789(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("en.n(Ljava/net/URL;B)Lec;")
    public final class150 method2775(URL arg0) {
        return this.method2789(4, 0, 0, arg0);
    }
}
