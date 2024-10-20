package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eg")
public class class136 implements Runnable {

    @ObfuscatedName("eg.f")
    public class54 field2092;

    @ObfuscatedName("eg.h")
    public class146 field2094 = null;

    @ObfuscatedName("eg.a")
    public class146 field2084 = null;

    @ObfuscatedName("eg.s")
    public Thread field2089;

    @ObfuscatedName("eg.p")
    public boolean field2090 = false;

    @ObfuscatedName("eg.r")
    public EventQueue field2091;

    public class136() {
        Statics.field2086 = "Unknown";
        Statics.field2085 = "1.1";
        try {
            Statics.field2086 = System.getProperty("java.vendor");
            Statics.field2085 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2091 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2090 = false;
        this.field2089 = new Thread(this);
        this.field2089.setPriority(10);
        this.field2089.setDaemon(true);
        this.field2089.start();
    }

    @ObfuscatedName("eg.h(I)V")
    public final void method2685() {
        synchronized (this) {
            this.field2090 = true;
            this.notifyAll();
        }
        try {
            this.field2089.join();
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
                    if (this.field2094 != null) {
                        var2 = this.field2094;
                        this.field2094 = this.field2094.field2205;
                        if (this.field2094 == null) {
                            this.field2084 = null;
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
                int var5 = var2.field2208;
                if (var5 == 1) {
                    var2.field2212 = new Socket(InetAddress.getByName((String) var2.field2211), var2.field2210);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2211);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2210);
                    var2.field2212 = var6;
                } else if (var5 == 4) {
                    var2.field2212 = new DataInputStream(((URL) var2.field2211).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2210 >> 24 & 0xFF) + "." + (var2.field2210 >> 16 & 0xFF) + "." + (var2.field2210 >> 8 & 0xFF) + "." + (var2.field2210 & 0xFF);
                    var2.field2212 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2204 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2204 = 2;
            }
        }
    }

    @ObfuscatedName("eg.a(IIILjava/lang/Object;B)Lek;")
    public final class146 method2671(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2208 = arg0;
        var5.field2210 = arg1;
        var5.field2211 = arg3;
        synchronized (this) {
            if (this.field2084 == null) {
                this.field2084 = this.field2094 = var5;
            } else {
                this.field2084.field2205 = var5;
                this.field2084 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eg.s(Ljava/lang/String;II)Lek;")
    public final class146 method2679(String arg0, int arg1) {
        return this.method2671(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eg.p(Ljava/lang/Runnable;II)Lek;")
    public final class146 method2683(Runnable arg0, int arg1) {
        return this.method2671(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eg.r(IB)Lek;")
    public final class146 method2672(int arg0) {
        return this.method2671(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("eg.k(Ljava/net/URL;B)Lek;")
    public final class146 method2675(URL arg0) {
        return this.method2671(4, 0, 0, arg0);
    }

    @ObfuscatedName("eg.d(I)Lbb;")
    public final class54 method2676() {
        return this.field2092;
    }
}
