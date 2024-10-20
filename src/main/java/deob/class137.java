package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ek")
public class class137 implements Runnable {

    @ObfuscatedName("ek.d")
    public class54 field2094;

    @ObfuscatedName("ek.c")
    public class147 field2095 = null;

    @ObfuscatedName("ek.y")
    public class147 field2096 = null;

    @ObfuscatedName("ek.k")
    public Thread field2092;

    @ObfuscatedName("ek.r")
    public boolean field2102 = false;

    @ObfuscatedName("ek.p")
    public EventQueue field2099;

    public class137() {
        Statics.field2097 = "Unknown";
        Statics.field2093 = "1.1";
        try {
            Statics.field2097 = System.getProperty("java.vendor");
            Statics.field2093 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2099 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2102 = false;
        this.field2092 = new Thread(this);
        this.field2092.setPriority(10);
        this.field2092.setDaemon(true);
        this.field2092.start();
    }

    @ObfuscatedName("ek.w(I)V")
    public final void method2847() {
        synchronized (this) {
            this.field2102 = true;
            this.notifyAll();
        }
        try {
            this.field2092.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class147 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2102) {
                        return;
                    }
                    if (this.field2095 != null) {
                        var2 = this.field2095;
                        this.field2095 = this.field2095.field2207;
                        if (this.field2095 == null) {
                            this.field2096 = null;
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
                    var2.field2212 = new Socket(InetAddress.getByName((String) var2.field2214), var2.field2213);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2214);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2213);
                    var2.field2212 = var6;
                } else if (var5 == 4) {
                    var2.field2212 = new DataInputStream(((URL) var2.field2214).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2213 >> 24 & 0xFF) + "." + (var2.field2213 >> 16 & 0xFF) + "." + (var2.field2213 >> 8 & 0xFF) + "." + (var2.field2213 & 0xFF);
                    var2.field2212 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2211 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2211 = 2;
            }
        }
    }

    @ObfuscatedName("ek.d(IIILjava/lang/Object;I)Lej;")
    public final class147 method2829(int arg0, int arg1, int arg2, Object arg3) {
        class147 var5 = new class147();
        var5.field2209 = arg0;
        var5.field2213 = arg1;
        var5.field2214 = arg3;
        synchronized (this) {
            if (this.field2096 == null) {
                this.field2096 = this.field2095 = var5;
            } else {
                this.field2096.field2207 = var5;
                this.field2096 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ek.c(Ljava/lang/String;II)Lej;")
    public final class147 method2830(String arg0, int arg1) {
        return this.method2829(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ek.y(Ljava/lang/Runnable;II)Lej;")
    public final class147 method2831(Runnable arg0, int arg1) {
        return this.method2829(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ek.k(IS)Lej;")
    public final class147 method2848(int arg0) {
        return this.method2829(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ek.r(Ljava/net/URL;S)Lej;")
    public final class147 method2851(URL arg0) {
        return this.method2829(4, 0, 0, arg0);
    }

    @ObfuscatedName("ek.p(I)Lbh;")
    public final class54 method2834() {
        return this.field2094;
    }
}
