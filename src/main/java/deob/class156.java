package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ew")
public class class156 implements Runnable {

    @ObfuscatedName("ew.x")
    public class155 field2249 = null;

    @ObfuscatedName("ew.k")
    public class155 field2250 = null;

    @ObfuscatedName("ew.f")
    public Thread field2251;

    @ObfuscatedName("ew.i")
    public boolean field2252 = false;

    public class156() {
        Statics.field2248 = "Unknown";
        Statics.field2247 = "1.6";
        try {
            Statics.field2248 = System.getProperty("java.vendor");
            Statics.field2247 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2252 = false;
        this.field2251 = new Thread(this);
        this.field2251.setPriority(10);
        this.field2251.setDaemon(true);
        this.field2251.start();
    }

    @ObfuscatedName("ew.w(I)V")
    public final void method2680() {
        synchronized (this) {
            this.field2252 = true;
            this.notifyAll();
        }
        try {
            this.field2251.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class155 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2252) {
                        return;
                    }
                    if (this.field2249 != null) {
                        var2 = this.field2249;
                        this.field2249 = this.field2249.field2239;
                        if (this.field2249 == null) {
                            this.field2250 = null;
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
                int var5 = var2.field2243;
                if (var5 == 1) {
                    var2.field2246 = new Socket(InetAddress.getByName((String) var2.field2245), var2.field2244);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2245);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2244);
                    var2.field2246 = var6;
                } else if (var5 == 4) {
                    var2.field2246 = new DataInputStream(((URL) var2.field2245).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2244 >> 24 & 0xFF) + "." + (var2.field2244 >> 16 & 0xFF) + "." + (var2.field2244 >> 8 & 0xFF) + "." + (var2.field2244 & 0xFF);
                    var2.field2246 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2240 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2240 = 2;
            }
        }
    }

    @ObfuscatedName("ew.o(IIILjava/lang/Object;B)Lec;")
    public final class155 method2687(int arg0, int arg1, int arg2, Object arg3) {
        class155 var5 = new class155();
        var5.field2243 = arg0;
        var5.field2244 = arg1;
        var5.field2245 = arg3;
        synchronized (this) {
            if (this.field2250 == null) {
                this.field2250 = this.field2249 = var5;
            } else {
                this.field2250.field2239 = var5;
                this.field2250 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ew.x(Ljava/lang/String;IB)Lec;")
    public final class155 method2669(String arg0, int arg1) {
        return this.method2687(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ew.k(Ljava/lang/Runnable;II)Lec;")
    public final class155 method2670(Runnable arg0, int arg1) {
        return this.method2687(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ew.f(II)Lec;")
    public final class155 method2671(int arg0) {
        return this.method2687(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ew.i(Ljava/net/URL;B)Lec;")
    public final class155 method2672(URL arg0) {
        return this.method2687(4, 0, 0, arg0);
    }
}
