package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ef")
public class class156 implements Runnable {

    @ObfuscatedName("ef.f")
    public class155 field2243 = null;

    @ObfuscatedName("ef.m")
    public class155 field2247 = null;

    @ObfuscatedName("ef.h")
    public Thread field2244;

    @ObfuscatedName("ef.t")
    public boolean field2245 = false;

    public class156() {
        Statics.field2246 = "Unknown";
        Statics.field3747 = "1.6";
        try {
            Statics.field2246 = System.getProperty("java.vendor");
            Statics.field3747 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2245 = false;
        this.field2244 = new Thread(this);
        this.field2244.setPriority(10);
        this.field2244.setDaemon(true);
        this.field2244.start();
    }

    @ObfuscatedName("ef.s(I)V")
    public final void method2753() {
        synchronized (this) {
            this.field2245 = true;
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
                    if (this.field2245) {
                        return;
                    }
                    if (this.field2243 != null) {
                        var2 = this.field2243;
                        this.field2243 = this.field2243.field2236;
                        if (this.field2243 == null) {
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
                    var2.field2240 = new Socket(InetAddress.getByName((String) var2.field2239), var2.field2235);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2239);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2235);
                    var2.field2240 = var6;
                } else if (var5 == 4) {
                    var2.field2240 = new DataInputStream(((URL) var2.field2239).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2235 >> 24 & 0xFF) + "." + (var2.field2235 >> 16 & 0xFF) + "." + (var2.field2235 >> 8 & 0xFF) + "." + (var2.field2235 & 0xFF);
                    var2.field2240 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2238 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2238 = 2;
            }
        }
    }

    @ObfuscatedName("ef.c(IIILjava/lang/Object;B)Lek;")
    public final class155 method2752(int arg0, int arg1, int arg2, Object arg3) {
        class155 var5 = new class155();
        var5.field2237 = arg0;
        var5.field2235 = arg1;
        var5.field2239 = arg3;
        synchronized (this) {
            if (this.field2247 == null) {
                this.field2247 = this.field2243 = var5;
            } else {
                this.field2247.field2236 = var5;
                this.field2247 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ef.f(Ljava/lang/String;II)Lek;")
    public final class155 method2755(String arg0, int arg1) {
        return this.method2752(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ef.m(Ljava/lang/Runnable;II)Lek;")
    public final class155 method2756(Runnable arg0, int arg1) {
        return this.method2752(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ef.h(IB)Lek;")
    public final class155 method2762(int arg0) {
        return this.method2752(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ef.t(Ljava/net/URL;I)Lek;")
    public final class155 method2765(URL arg0) {
        return this.method2752(4, 0, 0, arg0);
    }
}
