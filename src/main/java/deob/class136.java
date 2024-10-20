package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eq")
public class class136 implements Runnable {

    @ObfuscatedName("eq.w")
    public class54 field2089;

    @ObfuscatedName("eq.d")
    public class146 field2090 = null;

    @ObfuscatedName("eq.z")
    public class146 field2091 = null;

    @ObfuscatedName("eq.l")
    public Thread field2094;

    @ObfuscatedName("eq.m")
    public boolean field2093 = false;

    @ObfuscatedName("eq.p")
    public EventQueue field2096;

    public class136() {
        Statics.field2088 = "Unknown";
        Statics.field2098 = "1.1";
        try {
            Statics.field2088 = System.getProperty("java.vendor");
            Statics.field2098 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2096 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2093 = false;
        this.field2094 = new Thread(this);
        this.field2094.setPriority(10);
        this.field2094.setDaemon(true);
        this.field2094.start();
    }

    @ObfuscatedName("eq.b(B)V")
    public final void method2743() {
        synchronized (this) {
            this.field2093 = true;
            this.notifyAll();
        }
        try {
            this.field2094.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2093) {
                        return;
                    }
                    if (this.field2090 != null) {
                        var2 = this.field2090;
                        this.field2090 = this.field2090.field2213;
                        if (this.field2090 == null) {
                            this.field2091 = null;
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
                int var5 = var2.field2212;
                if (var5 == 1) {
                    var2.field2217 = new Socket(InetAddress.getByName((String) var2.field2214), var2.field2215);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2214);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2215);
                    var2.field2217 = var6;
                } else if (var5 == 4) {
                    var2.field2217 = new DataInputStream(((URL) var2.field2214).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2215 >> 24 & 0xFF) + "." + (var2.field2215 >> 16 & 0xFF) + "." + (var2.field2215 >> 8 & 0xFF) + "." + (var2.field2215 & 0xFF);
                    var2.field2217 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2216 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2216 = 2;
            }
        }
    }

    @ObfuscatedName("eq.w(IIILjava/lang/Object;I)Leh;")
    public final class146 method2740(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2212 = arg0;
        var5.field2215 = arg1;
        var5.field2214 = arg3;
        synchronized (this) {
            if (this.field2091 == null) {
                this.field2091 = this.field2090 = var5;
            } else {
                this.field2091.field2213 = var5;
                this.field2091 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eq.d(Ljava/lang/String;II)Leh;")
    public final class146 method2738(String arg0, int arg1) {
        return this.method2740(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eq.z(Ljava/lang/Runnable;IS)Leh;")
    public final class146 method2742(Runnable arg0, int arg1) {
        return this.method2740(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eq.l(II)Leh;")
    public final class146 method2739(int arg0) {
        return this.method2740(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("eq.m(Ljava/net/URL;S)Leh;")
    public final class146 method2744(URL arg0) {
        return this.method2740(4, 0, 0, arg0);
    }

    @ObfuscatedName("eq.p(B)Lbl;")
    public final class54 method2745() {
        return this.field2089;
    }
}
