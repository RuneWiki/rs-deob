package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ed")
public class class136 implements Runnable {

    @ObfuscatedName("ed.i")
    public class54 field2094;

    @ObfuscatedName("ed.d")
    public class146 field2095 = null;

    @ObfuscatedName("ed.o")
    public class146 field2103 = null;

    @ObfuscatedName("ed.c")
    public Thread field2102;

    @ObfuscatedName("ed.p")
    public boolean field2092 = false;

    @ObfuscatedName("ed.j")
    public EventQueue field2099;

    public class136() {
        Statics.field2096 = "Unknown";
        Statics.field2093 = "1.1";
        try {
            Statics.field2096 = System.getProperty("java.vendor");
            Statics.field2093 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2099 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2092 = false;
        this.field2102 = new Thread(this);
        this.field2102.setPriority(10);
        this.field2102.setDaemon(true);
        this.field2102.start();
    }

    @ObfuscatedName("ed.d(B)V")
    public final void method2715() {
        synchronized (this) {
            this.field2092 = true;
            this.notifyAll();
        }
        try {
            this.field2102.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2092) {
                        return;
                    }
                    if (this.field2095 != null) {
                        var2 = this.field2095;
                        this.field2095 = this.field2095.field2220;
                        if (this.field2095 == null) {
                            this.field2103 = null;
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
                int var5 = var2.field2218;
                if (var5 == 1) {
                    var2.field2226 = new Socket(InetAddress.getByName((String) var2.field2225), var2.field2219);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2225);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2219);
                    var2.field2226 = var6;
                } else if (var5 == 4) {
                    var2.field2226 = new DataInputStream(((URL) var2.field2225).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2219 >> 24 & 0xFF) + "." + (var2.field2219 >> 16 & 0xFF) + "." + (var2.field2219 >> 8 & 0xFF) + "." + (var2.field2219 & 0xFF);
                    var2.field2226 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2222 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2222 = 2;
            }
        }
    }

    @ObfuscatedName("ed.o(IIILjava/lang/Object;B)Lee;")
    public final class146 method2717(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2218 = arg0;
        var5.field2219 = arg1;
        var5.field2225 = arg3;
        synchronized (this) {
            if (this.field2103 == null) {
                this.field2103 = this.field2095 = var5;
            } else {
                this.field2103.field2220 = var5;
                this.field2103 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ed.c(Ljava/lang/String;II)Lee;")
    public final class146 method2728(String arg0, int arg1) {
        return this.method2717(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.p(Ljava/lang/Runnable;II)Lee;")
    public final class146 method2718(Runnable arg0, int arg1) {
        return this.method2717(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ed.j(II)Lee;")
    public final class146 method2719(int arg0) {
        return this.method2717(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ed.a(Ljava/net/URL;I)Lee;")
    public final class146 method2738(URL arg0) {
        return this.method2717(4, 0, 0, arg0);
    }

    @ObfuscatedName("ed.y(B)Lbt;")
    public final class54 method2721() {
        return this.field2094;
    }
}
