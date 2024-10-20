package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ef")
public class class136 implements Runnable {

    @ObfuscatedName("ef.v")
    public class54 field2064;

    @ObfuscatedName("ef.l")
    public class146 field2067 = null;

    @ObfuscatedName("ef.y")
    public class146 field2070 = null;

    @ObfuscatedName("ef.w")
    public Thread field2066;

    @ObfuscatedName("ef.u")
    public boolean field2068 = false;

    @ObfuscatedName("ef.a")
    public EventQueue field2071;

    public class136() {
        Statics.field2069 = "Unknown";
        Statics.field2065 = "1.1";
        try {
            Statics.field2069 = System.getProperty("java.vendor");
            Statics.field2065 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2071 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2068 = false;
        this.field2066 = new Thread(this);
        this.field2066.setPriority(10);
        this.field2066.setDaemon(true);
        this.field2066.start();
    }

    @ObfuscatedName("ef.l(B)V")
    public final void method2760() {
        synchronized (this) {
            this.field2068 = true;
            this.notifyAll();
        }
        try {
            this.field2066.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2068) {
                        return;
                    }
                    if (this.field2067 != null) {
                        var2 = this.field2067;
                        this.field2067 = this.field2067.field2189;
                        if (this.field2067 == null) {
                            this.field2070 = null;
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
                int var5 = var2.field2187;
                if (var5 == 1) {
                    var2.field2195 = new Socket(InetAddress.getByName((String) var2.field2194), var2.field2193);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2194);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2193);
                    var2.field2195 = var6;
                } else if (var5 == 4) {
                    var2.field2195 = new DataInputStream(((URL) var2.field2194).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2193 >> 24 & 0xFF) + "." + (var2.field2193 >> 16 & 0xFF) + "." + (var2.field2193 >> 8 & 0xFF) + "." + (var2.field2193 & 0xFF);
                    var2.field2195 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2192 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2192 = 2;
            }
        }
    }

    @ObfuscatedName("ef.y(IIILjava/lang/Object;B)Lec;")
    public final class146 method2743(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2187 = arg0;
        var5.field2193 = arg1;
        var5.field2194 = arg3;
        synchronized (this) {
            if (this.field2070 == null) {
                this.field2070 = this.field2067 = var5;
            } else {
                this.field2070.field2189 = var5;
                this.field2070 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ef.w(Ljava/lang/String;IB)Lec;")
    public final class146 method2753(String arg0, int arg1) {
        return this.method2743(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ef.u(Ljava/lang/Runnable;II)Lec;")
    public final class146 method2762(Runnable arg0, int arg1) {
        return this.method2743(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ef.a(II)Lec;")
    public final class146 method2746(int arg0) {
        return this.method2743(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ef.e(Ljava/net/URL;B)Lec;")
    public final class146 method2747(URL arg0) {
        return this.method2743(4, 0, 0, arg0);
    }

    @ObfuscatedName("ef.b(B)Lbl;")
    public final class54 method2748() {
        return this.field2064;
    }
}
