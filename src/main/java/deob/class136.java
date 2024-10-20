package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ex")
public class class136 implements Runnable {

    @ObfuscatedName("ex.k")
    public class54 field2060;

    @ObfuscatedName("ex.t")
    public class146 field2067 = null;

    @ObfuscatedName("ex.g")
    public class146 field2062 = null;

    @ObfuscatedName("ex.o")
    public Thread field2063;

    @ObfuscatedName("ex.i")
    public boolean field2064 = false;

    @ObfuscatedName("ex.w")
    public EventQueue field2065;

    public class136() {
        Statics.field2066 = "Unknown";
        Statics.field2068 = "1.1";
        try {
            Statics.field2066 = System.getProperty("java.vendor");
            Statics.field2068 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2065 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2064 = false;
        this.field2063 = new Thread(this);
        this.field2063.setPriority(10);
        this.field2063.setDaemon(true);
        this.field2063.start();
    }

    @ObfuscatedName("ex.h(B)V")
    public final void method2659() {
        synchronized (this) {
            this.field2064 = true;
            this.notifyAll();
        }
        try {
            this.field2063.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2064) {
                        return;
                    }
                    if (this.field2067 != null) {
                        var2 = this.field2067;
                        this.field2067 = this.field2067.field2181;
                        if (this.field2067 == null) {
                            this.field2062 = null;
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
                int var5 = var2.field2180;
                if (var5 == 1) {
                    var2.field2188 = new Socket(InetAddress.getByName((String) var2.field2187), var2.field2185);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2187);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2185);
                    var2.field2188 = var6;
                } else if (var5 == 4) {
                    var2.field2188 = new DataInputStream(((URL) var2.field2187).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2185 >> 24 & 0xFF) + "." + (var2.field2185 >> 16 & 0xFF) + "." + (var2.field2185 >> 8 & 0xFF) + "." + (var2.field2185 & 0xFF);
                    var2.field2188 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2184 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2184 = 2;
            }
        }
    }

    @ObfuscatedName("ex.k(IIILjava/lang/Object;I)Lez;")
    public final class146 method2664(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2180 = arg0;
        var5.field2185 = arg1;
        var5.field2187 = arg3;
        synchronized (this) {
            if (this.field2062 == null) {
                this.field2062 = this.field2067 = var5;
            } else {
                this.field2062.field2181 = var5;
                this.field2062 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ex.t(Ljava/lang/String;II)Lez;")
    public final class146 method2660(String arg0, int arg1) {
        return this.method2664(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ex.g(Ljava/lang/Runnable;II)Lez;")
    public final class146 method2680(Runnable arg0, int arg1) {
        return this.method2664(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ex.o(II)Lez;")
    public final class146 method2663(int arg0) {
        return this.method2664(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ex.i(Ljava/net/URL;I)Lez;")
    public final class146 method2675(URL arg0) {
        return this.method2664(4, 0, 0, arg0);
    }

    @ObfuscatedName("ex.w(I)Lbb;")
    public final class54 method2679() {
        return this.field2060;
    }
}
