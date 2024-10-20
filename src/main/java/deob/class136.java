package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("er")
public class class136 implements Runnable {

    @ObfuscatedName("er.o")
    public class54 field2051;

    @ObfuscatedName("er.z")
    public class146 field2052 = null;

    @ObfuscatedName("er.c")
    public class146 field2055 = null;

    @ObfuscatedName("er.d")
    public Thread field2049;

    @ObfuscatedName("er.l")
    public boolean field2050 = false;

    @ObfuscatedName("er.b")
    public EventQueue field2056;

    public class136() {
        Statics.field2053 = "Unknown";
        Statics.field2054 = "1.1";
        try {
            Statics.field2053 = System.getProperty("java.vendor");
            Statics.field2054 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2056 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2050 = false;
        this.field2049 = new Thread(this);
        this.field2049.setPriority(10);
        this.field2049.setDaemon(true);
        this.field2049.start();
    }

    @ObfuscatedName("er.o(B)V")
    public final void method2698() {
        synchronized (this) {
            this.field2050 = true;
            this.notifyAll();
        }
        try {
            this.field2049.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2050) {
                        return;
                    }
                    if (this.field2052 != null) {
                        var2 = this.field2052;
                        this.field2052 = this.field2052.field2192;
                        if (this.field2052 == null) {
                            this.field2055 = null;
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
                int var5 = var2.field2194;
                if (var5 == 1) {
                    var2.field2197 = new Socket(InetAddress.getByName((String) var2.field2196), var2.field2193);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2196);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2193);
                    var2.field2197 = var6;
                } else if (var5 == 4) {
                    var2.field2197 = new DataInputStream(((URL) var2.field2196).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2193 >> 24 & 0xFF) + "." + (var2.field2193 >> 16 & 0xFF) + "." + (var2.field2193 >> 8 & 0xFF) + "." + (var2.field2193 & 0xFF);
                    var2.field2197 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2195 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2195 = 2;
            }
        }
    }

    @ObfuscatedName("er.z(IIILjava/lang/Object;B)Leb;")
    public final class146 method2719(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2194 = arg0;
        var5.field2193 = arg1;
        var5.field2196 = arg3;
        synchronized (this) {
            if (this.field2055 == null) {
                this.field2055 = this.field2052 = var5;
            } else {
                this.field2055.field2192 = var5;
                this.field2055 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("er.c(Ljava/lang/String;II)Leb;")
    public final class146 method2701(String arg0, int arg1) {
        return this.method2719(1, arg1, 0, arg0);
    }

    @ObfuscatedName("er.d(Ljava/lang/Runnable;IS)Leb;")
    public final class146 method2702(Runnable arg0, int arg1) {
        return this.method2719(2, arg1, 0, arg0);
    }

    @ObfuscatedName("er.l(II)Leb;")
    public final class146 method2716(int arg0) {
        return this.method2719(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("er.b(Ljava/net/URL;I)Leb;")
    public final class146 method2704(URL arg0) {
        return this.method2719(4, 0, 0, arg0);
    }

    @ObfuscatedName("er.j(B)Lbf;")
    public final class54 method2705() {
        return this.field2051;
    }
}
