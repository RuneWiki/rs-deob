package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("es")
public class class136 implements Runnable {

    @ObfuscatedName("es.i")
    public class54 field2083;

    @ObfuscatedName("es.h")
    public class146 field2076 = null;

    @ObfuscatedName("es.q")
    public class146 field2078 = null;

    @ObfuscatedName("es.u")
    public Thread field2079;

    @ObfuscatedName("es.m")
    public boolean field2080 = false;

    @ObfuscatedName("es.y")
    public EventQueue field2081;

    public class136() {
        Statics.field2084 = "Unknown";
        Statics.field1966 = "1.1";
        try {
            Statics.field2084 = System.getProperty("java.vendor");
            Statics.field1966 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2081 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2080 = false;
        this.field2079 = new Thread(this);
        this.field2079.setPriority(10);
        this.field2079.setDaemon(true);
        this.field2079.start();
    }

    @ObfuscatedName("es.i(B)V")
    public final void method2657() {
        synchronized (this) {
            this.field2080 = true;
            this.notifyAll();
        }
        try {
            this.field2079.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2080) {
                        return;
                    }
                    if (this.field2076 != null) {
                        var2 = this.field2076;
                        this.field2076 = this.field2076.field2207;
                        if (this.field2076 == null) {
                            this.field2078 = null;
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
                int var5 = var2.field2205;
                if (var5 == 1) {
                    var2.field2200 = new Socket(InetAddress.getByName((String) var2.field2208), var2.field2206);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2208);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2206);
                    var2.field2200 = var6;
                } else if (var5 == 4) {
                    var2.field2200 = new DataInputStream(((URL) var2.field2208).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2206 >> 24 & 0xFF) + "." + (var2.field2206 >> 16 & 0xFF) + "." + (var2.field2206 >> 8 & 0xFF) + "." + (var2.field2206 & 0xFF);
                    var2.field2200 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2204 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2204 = 2;
            }
        }
    }

    @ObfuscatedName("es.h(IIILjava/lang/Object;I)Lea;")
    public final class146 method2650(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2205 = arg0;
        var5.field2206 = arg1;
        var5.field2208 = arg3;
        synchronized (this) {
            if (this.field2078 == null) {
                this.field2078 = this.field2076 = var5;
            } else {
                this.field2078.field2207 = var5;
                this.field2078 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("es.q(Ljava/lang/String;IS)Lea;")
    public final class146 method2653(String arg0, int arg1) {
        return this.method2650(1, arg1, 0, arg0);
    }

    @ObfuscatedName("es.u(Ljava/lang/Runnable;II)Lea;")
    public final class146 method2666(Runnable arg0, int arg1) {
        return this.method2650(2, arg1, 0, arg0);
    }

    @ObfuscatedName("es.m(II)Lea;")
    public final class146 method2654(int arg0) {
        return this.method2650(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("es.y(Ljava/net/URL;I)Lea;")
    public final class146 method2665(URL arg0) {
        return this.method2650(4, 0, 0, arg0);
    }

    @ObfuscatedName("es.p(S)Lbf;")
    public final class54 method2656() {
        return this.field2083;
    }
}
