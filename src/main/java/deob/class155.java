package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ev")
public class class155 implements Runnable {

    @ObfuscatedName("ev.u")
    public class154 field2215 = null;

    @ObfuscatedName("ev.q")
    public class154 field2218 = null;

    @ObfuscatedName("ev.g")
    public Thread field2220;

    @ObfuscatedName("ev.v")
    public boolean field2213 = false;

    public class155() {
        Statics.field2216 = "Unknown";
        Statics.field2214 = "1.6";
        try {
            Statics.field2216 = System.getProperty("java.vendor");
            Statics.field2214 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2213 = false;
        this.field2220 = new Thread(this);
        this.field2220.setPriority(10);
        this.field2220.setDaemon(true);
        this.field2220.start();
    }

    @ObfuscatedName("ev.i(I)V")
    public final void method2736() {
        synchronized (this) {
            this.field2213 = true;
            this.notifyAll();
        }
        try {
            this.field2220.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2213) {
                        return;
                    }
                    if (this.field2215 != null) {
                        var2 = this.field2215;
                        this.field2215 = this.field2215.field2208;
                        if (this.field2215 == null) {
                            this.field2218 = null;
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
                int var5 = var2.field2209;
                if (var5 == 1) {
                    var2.field2212 = new Socket(InetAddress.getByName((String) var2.field2211), var2.field2206);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2211);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2206);
                    var2.field2212 = var6;
                } else if (var5 == 4) {
                    var2.field2212 = new DataInputStream(((URL) var2.field2211).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2206 >> 24 & 0xFF) + "." + (var2.field2206 >> 16 & 0xFF) + "." + (var2.field2206 >> 8 & 0xFF) + "." + (var2.field2206 & 0xFF);
                    var2.field2212 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2210 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2210 = 2;
            }
        }
    }

    @ObfuscatedName("ev.h(IIILjava/lang/Object;I)Led;")
    public final class154 method2712(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field2209 = arg0;
        var5.field2206 = arg1;
        var5.field2211 = arg3;
        synchronized (this) {
            if (this.field2218 == null) {
                this.field2218 = this.field2215 = var5;
            } else {
                this.field2218.field2208 = var5;
                this.field2218 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ev.u(Ljava/lang/String;IB)Led;")
    public final class154 method2714(String arg0, int arg1) {
        return this.method2712(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ev.q(Ljava/lang/Runnable;IB)Led;")
    public final class154 method2715(Runnable arg0, int arg1) {
        return this.method2712(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ev.g(II)Led;")
    public final class154 method2716(int arg0) {
        return this.method2712(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ev.v(Ljava/net/URL;I)Led;")
    public final class154 method2717(URL arg0) {
        return this.method2712(4, 0, 0, arg0);
    }
}
