package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ed")
public class class140 implements Runnable {

    @ObfuscatedName("ed.e")
    public class150 field2145 = null;

    @ObfuscatedName("ed.o")
    public class150 field2146 = null;

    @ObfuscatedName("ed.g")
    public Thread field2155;

    @ObfuscatedName("ed.l")
    public boolean field2147 = false;

    @ObfuscatedName("ed.j")
    public EventQueue field2149;

    public class140() {
        Statics.field2148 = "Unknown";
        Statics.field2144 = "1.1";
        try {
            Statics.field2148 = System.getProperty("java.vendor");
            Statics.field2144 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2149 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2147 = false;
        this.field2155 = new Thread(this);
        this.field2155.setPriority(10);
        this.field2155.setDaemon(true);
        this.field2155.start();
    }

    @ObfuscatedName("ed.o(S)V")
    public final void method2779() {
        synchronized (this) {
            this.field2147 = true;
            this.notifyAll();
        }
        try {
            this.field2155.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class150 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2147) {
                        return;
                    }
                    if (this.field2145 != null) {
                        var2 = this.field2145;
                        this.field2145 = this.field2145.field2282;
                        if (this.field2145 == null) {
                            this.field2146 = null;
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
                int var5 = var2.field2280;
                if (var5 == 1) {
                    var2.field2283 = new Socket(InetAddress.getByName((String) var2.field2281), var2.field2276);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2281);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2276);
                    var2.field2283 = var6;
                } else if (var5 == 4) {
                    var2.field2283 = new DataInputStream(((URL) var2.field2281).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2276 >> 24 & 0xFF) + "." + (var2.field2276 >> 16 & 0xFF) + "." + (var2.field2276 >> 8 & 0xFF) + "." + (var2.field2276 & 0xFF);
                    var2.field2283 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2279 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2279 = 2;
            }
        }
    }

    @ObfuscatedName("ed.g(IIILjava/lang/Object;B)Lem;")
    public final class150 method2770(int arg0, int arg1, int arg2, Object arg3) {
        class150 var5 = new class150();
        var5.field2280 = arg0;
        var5.field2276 = arg1;
        var5.field2281 = arg3;
        synchronized (this) {
            if (this.field2146 == null) {
                this.field2146 = this.field2145 = var5;
            } else {
                this.field2146.field2282 = var5;
                this.field2146 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ed.l(Ljava/lang/String;II)Lem;")
    public final class150 method2771(String arg0, int arg1) {
        return this.method2770(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.j(Ljava/lang/Runnable;II)Lem;")
    public final class150 method2772(Runnable arg0, int arg1) {
        return this.method2770(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.r(II)Lem;")
    public final class150 method2782(int arg0) {
        return this.method2770(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ed.x(Ljava/net/URL;I)Lem;")
    public final class150 method2792(URL arg0) {
        return this.method2770(4, 0, 0, arg0);
    }
}
