package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("es")
public class class137 implements Runnable {

    @ObfuscatedName("es.f")
    public class54 field2083;

    @ObfuscatedName("es.s")
    public class147 field2082 = null;

    @ObfuscatedName("es.p")
    public class147 field2091 = null;

    @ObfuscatedName("es.h")
    public Thread field2092;

    @ObfuscatedName("es.g")
    public boolean field2087 = false;

    @ObfuscatedName("es.a")
    public EventQueue field2088;

    public class137() {
        Statics.field3213 = "Unknown";
        Statics.field2093 = "1.1";
        try {
            Statics.field3213 = System.getProperty("java.vendor");
            Statics.field2093 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2088 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2087 = false;
        this.field2092 = new Thread(this);
        this.field2092.setPriority(10);
        this.field2092.setDaemon(true);
        this.field2092.start();
    }

    @ObfuscatedName("es.w(B)V")
    public final void method2712() {
        synchronized (this) {
            this.field2087 = true;
            this.notifyAll();
        }
        try {
            this.field2092.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class147 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2087) {
                        return;
                    }
                    if (this.field2082 != null) {
                        var2 = this.field2082;
                        this.field2082 = this.field2082.field2209;
                        if (this.field2082 == null) {
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
                    var2.field2217 = new Socket(InetAddress.getByName((String) var2.field2216), var2.field2215);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2216);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2215);
                    var2.field2217 = var6;
                } else if (var5 == 4) {
                    var2.field2217 = new DataInputStream(((URL) var2.field2216).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2215 >> 24 & 0xFF) + "." + (var2.field2215 >> 16 & 0xFF) + "." + (var2.field2215 >> 8 & 0xFF) + "." + (var2.field2215 & 0xFF);
                    var2.field2217 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2214 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2214 = 2;
            }
        }
    }

    @ObfuscatedName("es.f(IIILjava/lang/Object;S)Lez;")
    public final class147 method2714(int arg0, int arg1, int arg2, Object arg3) {
        class147 var5 = new class147();
        var5.field2212 = arg0;
        var5.field2215 = arg1;
        var5.field2216 = arg3;
        synchronized (this) {
            if (this.field2091 == null) {
                this.field2091 = this.field2082 = var5;
            } else {
                this.field2091.field2209 = var5;
                this.field2091 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("es.s(Ljava/lang/String;II)Lez;")
    public final class147 method2701(String arg0, int arg1) {
        return this.method2714(1, arg1, 0, arg0);
    }

    @ObfuscatedName("es.p(Ljava/lang/Runnable;II)Lez;")
    public final class147 method2715(Runnable arg0, int arg1) {
        return this.method2714(2, arg1, 0, arg0);
    }

    @ObfuscatedName("es.h(II)Lez;")
    public final class147 method2700(int arg0) {
        return this.method2714(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("es.g(Ljava/net/URL;I)Lez;")
    public final class147 method2704(URL arg0) {
        return this.method2714(4, 0, 0, arg0);
    }

    @ObfuscatedName("es.a(B)Lbq;")
    public final class54 method2705() {
        return this.field2083;
    }
}
