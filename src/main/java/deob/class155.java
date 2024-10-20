package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ew")
public class class155 implements Runnable {

    @ObfuscatedName("ew.i")
    public class154 field2246 = null;

    @ObfuscatedName("ew.j")
    public class154 field2245 = null;

    @ObfuscatedName("ew.f")
    public Thread field2252;

    @ObfuscatedName("ew.m")
    public boolean field2247 = false;

    public class155() {
        Statics.field2242 = "Unknown";
        Statics.field2243 = "1.6";
        try {
            Statics.field2242 = System.getProperty("java.vendor");
            Statics.field2243 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2247 = false;
        this.field2252 = new Thread(this);
        this.field2252.setPriority(10);
        this.field2252.setDaemon(true);
        this.field2252.start();
    }

    @ObfuscatedName("ew.n(I)V")
    public final void method2712() {
        synchronized (this) {
            this.field2247 = true;
            this.notifyAll();
        }
        try {
            this.field2252.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2247) {
                        return;
                    }
                    if (this.field2246 != null) {
                        var2 = this.field2246;
                        this.field2246 = this.field2246.field2238;
                        if (this.field2246 == null) {
                            this.field2245 = null;
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
                int var5 = var2.field2239;
                if (var5 == 1) {
                    var2.field2241 = new Socket(InetAddress.getByName((String) var2.field2240), var2.field2233);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2240);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2233);
                    var2.field2241 = var6;
                } else if (var5 == 4) {
                    var2.field2241 = new DataInputStream(((URL) var2.field2240).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2233 >> 24 & 0xFF) + "." + (var2.field2233 >> 16 & 0xFF) + "." + (var2.field2233 >> 8 & 0xFF) + "." + (var2.field2233 & 0xFF);
                    var2.field2241 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2237 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2237 = 2;
            }
        }
    }

    @ObfuscatedName("ew.p(IIILjava/lang/Object;I)Lev;")
    public final class154 method2713(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field2239 = arg0;
        var5.field2233 = arg1;
        var5.field2240 = arg3;
        synchronized (this) {
            if (this.field2245 == null) {
                this.field2245 = this.field2246 = var5;
            } else {
                this.field2245.field2238 = var5;
                this.field2245 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ew.i(Ljava/lang/String;II)Lev;")
    public final class154 method2714(String arg0, int arg1) {
        return this.method2713(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ew.j(Ljava/lang/Runnable;IB)Lev;")
    public final class154 method2715(Runnable arg0, int arg1) {
        return this.method2713(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ew.f(II)Lev;")
    public final class154 method2716(int arg0) {
        return this.method2713(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ew.m(Ljava/net/URL;I)Lev;")
    public final class154 method2724(URL arg0) {
        return this.method2713(4, 0, 0, arg0);
    }
}
