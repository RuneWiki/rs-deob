package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eh")
public class class140 implements Runnable {

    @ObfuscatedName("eh.f")
    public class150 field2146 = null;

    @ObfuscatedName("eh.c")
    public class150 field2147 = null;

    @ObfuscatedName("eh.v")
    public Thread field2148;

    @ObfuscatedName("eh.j")
    public boolean field2152 = false;

    @ObfuscatedName("eh.m")
    public EventQueue field2144;

    public class140() {
        Statics.field2145 = "Unknown";
        Statics.field2149 = "1.1";
        try {
            Statics.field2145 = System.getProperty("java.vendor");
            Statics.field2149 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2144 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2152 = false;
        this.field2148 = new Thread(this);
        this.field2148.setPriority(10);
        this.field2148.setDaemon(true);
        this.field2148.start();
    }

    @ObfuscatedName("eh.f(B)V")
    public final void method2785() {
        synchronized (this) {
            this.field2152 = true;
            this.notifyAll();
        }
        try {
            this.field2148.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class150 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2152) {
                        return;
                    }
                    if (this.field2146 != null) {
                        var2 = this.field2146;
                        this.field2146 = this.field2146.field2268;
                        if (this.field2146 == null) {
                            this.field2147 = null;
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
                int var5 = var2.field2266;
                if (var5 == 1) {
                    var2.field2263 = new Socket(InetAddress.getByName((String) var2.field2265), var2.field2261);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2265);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2261);
                    var2.field2263 = var6;
                } else if (var5 == 4) {
                    var2.field2263 = new DataInputStream(((URL) var2.field2265).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2261 >> 24 & 0xFF) + "." + (var2.field2261 >> 16 & 0xFF) + "." + (var2.field2261 >> 8 & 0xFF) + "." + (var2.field2261 & 0xFF);
                    var2.field2263 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2269 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2269 = 2;
            }
        }
    }

    @ObfuscatedName("eh.c(IIILjava/lang/Object;I)Leb;")
    public final class150 method2764(int arg0, int arg1, int arg2, Object arg3) {
        class150 var5 = new class150();
        var5.field2266 = arg0;
        var5.field2261 = arg1;
        var5.field2265 = arg3;
        synchronized (this) {
            if (this.field2147 == null) {
                this.field2147 = this.field2146 = var5;
            } else {
                this.field2147.field2268 = var5;
                this.field2147 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eh.v(Ljava/lang/String;IB)Leb;")
    public final class150 method2765(String arg0, int arg1) {
        return this.method2764(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eh.j(Ljava/lang/Runnable;II)Leb;")
    public final class150 method2766(Runnable arg0, int arg1) {
        return this.method2764(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eh.m(II)Leb;")
    public final class150 method2767(int arg0) {
        return this.method2764(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("eh.y(Ljava/net/URL;I)Leb;")
    public final class150 method2768(URL arg0) {
        return this.method2764(4, 0, 0, arg0);
    }
}
