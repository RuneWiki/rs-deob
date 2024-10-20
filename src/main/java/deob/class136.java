package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ey")
public class class136 implements Runnable {

    @ObfuscatedName("ey.k")
    public class54 field2099;

    @ObfuscatedName("ey.f")
    public class146 field2085 = null;

    @ObfuscatedName("ey.d")
    public class146 field2089 = null;

    @ObfuscatedName("ey.l")
    public Thread field2084;

    @ObfuscatedName("ey.r")
    public boolean field2090 = false;

    @ObfuscatedName("ey.g")
    public EventQueue field2091;

    public class136() {
        Statics.field2087 = "Unknown";
        Statics.field2086 = "1.1";
        try {
            Statics.field2087 = System.getProperty("java.vendor");
            Statics.field2086 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2091 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2090 = false;
        this.field2084 = new Thread(this);
        this.field2084.setPriority(10);
        this.field2084.setDaemon(true);
        this.field2084.start();
    }

    @ObfuscatedName("ey.q(I)V")
    public final void method2671() {
        synchronized (this) {
            this.field2090 = true;
            this.notifyAll();
        }
        try {
            this.field2084.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2090) {
                        return;
                    }
                    if (this.field2085 != null) {
                        var2 = this.field2085;
                        this.field2085 = this.field2085.field2225;
                        if (this.field2085 == null) {
                            this.field2089 = null;
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
                int var5 = var2.field2221;
                if (var5 == 1) {
                    var2.field2222 = new Socket(InetAddress.getByName((String) var2.field2217), var2.field2223);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2217);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2223);
                    var2.field2222 = var6;
                } else if (var5 == 4) {
                    var2.field2222 = new DataInputStream(((URL) var2.field2217).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2223 >> 24 & 0xFF) + "." + (var2.field2223 >> 16 & 0xFF) + "." + (var2.field2223 >> 8 & 0xFF) + "." + (var2.field2223 & 0xFF);
                    var2.field2222 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2224 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2224 = 2;
            }
        }
    }

    @ObfuscatedName("ey.k(IIILjava/lang/Object;I)Lef;")
    public final class146 method2673(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2221 = arg0;
        var5.field2223 = arg1;
        var5.field2217 = arg3;
        synchronized (this) {
            if (this.field2089 == null) {
                this.field2089 = this.field2085 = var5;
            } else {
                this.field2089.field2225 = var5;
                this.field2089 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ey.f(Ljava/lang/String;IB)Lef;")
    public final class146 method2674(String arg0, int arg1) {
        return this.method2673(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ey.d(Ljava/lang/Runnable;II)Lef;")
    public final class146 method2675(Runnable arg0, int arg1) {
        return this.method2673(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ey.l(II)Lef;")
    public final class146 method2683(int arg0) {
        return this.method2673(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ey.r(Ljava/net/URL;B)Lef;")
    public final class146 method2677(URL arg0) {
        return this.method2673(4, 0, 0, arg0);
    }

    @ObfuscatedName("ey.g(I)Lbu;")
    public final class54 method2678() {
        return this.field2099;
    }
}
