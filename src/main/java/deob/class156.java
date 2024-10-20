package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eo")
public class class156 implements Runnable {

    @ObfuscatedName("eo.a")
    public class155 field2244 = null;

    @ObfuscatedName("eo.r")
    public class155 field2247 = null;

    @ObfuscatedName("eo.o")
    public Thread field2246;

    @ObfuscatedName("eo.n")
    public boolean field2245 = false;

    public class156() {
        Statics.field2243 = "Unknown";
        Statics.field2343 = "1.6";
        try {
            Statics.field2243 = System.getProperty("java.vendor");
            Statics.field2343 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2245 = false;
        this.field2246 = new Thread(this);
        this.field2246.setPriority(10);
        this.field2246.setDaemon(true);
        this.field2246.start();
    }

    @ObfuscatedName("eo.i(I)V")
    public final void method2772() {
        synchronized (this) {
            this.field2245 = true;
            this.notifyAll();
        }
        try {
            this.field2246.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class155 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2245) {
                        return;
                    }
                    if (this.field2244 != null) {
                        var2 = this.field2244;
                        this.field2244 = this.field2244.field2238;
                        if (this.field2244 == null) {
                            this.field2247 = null;
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
                int var5 = var2.field2237;
                if (var5 == 1) {
                    var2.field2240 = new Socket(InetAddress.getByName((String) var2.field2235), var2.field2239);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2235);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2239);
                    var2.field2240 = var6;
                } else if (var5 == 4) {
                    var2.field2240 = new DataInputStream(((URL) var2.field2235).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2239 >> 24 & 0xFF) + "." + (var2.field2239 >> 16 & 0xFF) + "." + (var2.field2239 >> 8 & 0xFF) + "." + (var2.field2239 & 0xFF);
                    var2.field2240 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2236 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2236 = 2;
            }
        }
    }

    @ObfuscatedName("eo.j(IIILjava/lang/Object;I)Lez;")
    public final class155 method2769(int arg0, int arg1, int arg2, Object arg3) {
        class155 var5 = new class155();
        var5.field2237 = arg0;
        var5.field2239 = arg1;
        var5.field2235 = arg3;
        synchronized (this) {
            if (this.field2247 == null) {
                this.field2247 = this.field2244 = var5;
            } else {
                this.field2247.field2238 = var5;
                this.field2247 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eo.a(Ljava/lang/String;IB)Lez;")
    public final class155 method2788(String arg0, int arg1) {
        return this.method2769(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eo.r(Ljava/lang/Runnable;II)Lez;")
    public final class155 method2770(Runnable arg0, int arg1) {
        return this.method2769(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eo.o(II)Lez;")
    public final class155 method2771(int arg0) {
        return this.method2769(3, arg0, 0, (Object) null);
    }
}
