package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ep")
public class class156 implements Runnable {

    @ObfuscatedName("ep.f")
    public class155 field2242 = null;

    @ObfuscatedName("ep.p")
    public class155 field2239 = null;

    @ObfuscatedName("ep.x")
    public Thread field2244;

    @ObfuscatedName("ep.g")
    public boolean field2241 = false;

    public class156() {
        Statics.field2237 = "Unknown";
        Statics.field2236 = "1.6";
        try {
            Statics.field2237 = System.getProperty("java.vendor");
            Statics.field2236 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2241 = false;
        this.field2244 = new Thread(this);
        this.field2244.setPriority(10);
        this.field2244.setDaemon(true);
        this.field2244.start();
    }

    @ObfuscatedName("ep.j(I)V")
    public final void method2724() {
        synchronized (this) {
            this.field2241 = true;
            this.notifyAll();
        }
        try {
            this.field2244.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class155 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2241) {
                        return;
                    }
                    if (this.field2242 != null) {
                        var2 = this.field2242;
                        this.field2242 = this.field2242.field2230;
                        if (this.field2242 == null) {
                            this.field2239 = null;
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
                int var5 = var2.field2229;
                if (var5 == 1) {
                    var2.field2235 = new Socket(InetAddress.getByName((String) var2.field2234), var2.field2233);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2234);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2233);
                    var2.field2235 = var6;
                } else if (var5 == 4) {
                    var2.field2235 = new DataInputStream(((URL) var2.field2234).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2233 >> 24 & 0xFF) + "." + (var2.field2233 >> 16 & 0xFF) + "." + (var2.field2233 >> 8 & 0xFF) + "." + (var2.field2233 & 0xFF);
                    var2.field2235 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2231 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2231 = 2;
            }
        }
    }

    @ObfuscatedName("ep.h(IIILjava/lang/Object;I)Lea;")
    public final class155 method2705(int arg0, int arg1, int arg2, Object arg3) {
        class155 var5 = new class155();
        var5.field2229 = arg0;
        var5.field2233 = arg1;
        var5.field2234 = arg3;
        synchronized (this) {
            if (this.field2239 == null) {
                this.field2239 = this.field2242 = var5;
            } else {
                this.field2239.field2230 = var5;
                this.field2239 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ep.f(Ljava/lang/String;II)Lea;")
    public final class155 method2706(String arg0, int arg1) {
        return this.method2705(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ep.p(Ljava/lang/Runnable;II)Lea;")
    public final class155 method2704(Runnable arg0, int arg1) {
        return this.method2705(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ep.x(II)Lea;")
    public final class155 method2708(int arg0) {
        return this.method2705(3, arg0, 0, (Object) null);
    }
}
