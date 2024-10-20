package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ew")
public class class155 implements Runnable {

    @ObfuscatedName("ew.e")
    public class154 field2247 = null;

    @ObfuscatedName("ew.t")
    public class154 field2245 = null;

    @ObfuscatedName("ew.w")
    public Thread field2246;

    @ObfuscatedName("ew.z")
    public boolean field2248 = false;

    public class155() {
        Statics.field2243 = "Unknown";
        Statics.field2244 = "1.6";
        try {
            Statics.field2243 = System.getProperty("java.vendor");
            Statics.field2244 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2248 = false;
        this.field2246 = new Thread(this);
        this.field2246.setPriority(10);
        this.field2246.setDaemon(true);
        this.field2246.start();
    }

    @ObfuscatedName("ew.p(I)V")
    public final void method2627() {
        synchronized (this) {
            this.field2248 = true;
            this.notifyAll();
        }
        try {
            this.field2246.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2248) {
                        return;
                    }
                    if (this.field2247 != null) {
                        var2 = this.field2247;
                        this.field2247 = this.field2247.field2234;
                        if (this.field2247 == null) {
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
                int var5 = var2.field2237;
                if (var5 == 1) {
                    var2.field2242 = new Socket(InetAddress.getByName((String) var2.field2241), var2.field2239);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2241);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2239);
                    var2.field2242 = var6;
                } else if (var5 == 4) {
                    var2.field2242 = new DataInputStream(((URL) var2.field2241).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2239 >> 24 & 0xFF) + "." + (var2.field2239 >> 16 & 0xFF) + "." + (var2.field2239 >> 8 & 0xFF) + "." + (var2.field2239 & 0xFF);
                    var2.field2242 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2238 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2238 = 2;
            }
        }
    }

    @ObfuscatedName("ew.m(IIILjava/lang/Object;I)Len;")
    public final class154 method2632(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field2237 = arg0;
        var5.field2239 = arg1;
        var5.field2241 = arg3;
        synchronized (this) {
            if (this.field2245 == null) {
                this.field2245 = this.field2247 = var5;
            } else {
                this.field2245.field2234 = var5;
                this.field2245 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ew.e(Ljava/lang/String;IB)Len;")
    public final class154 method2637(String arg0, int arg1) {
        return this.method2632(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ew.t(Ljava/lang/Runnable;IB)Len;")
    public final class154 method2617(Runnable arg0, int arg1) {
        return this.method2632(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ew.w(II)Len;")
    public final class154 method2633(int arg0) {
        return this.method2632(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ew.z(Ljava/net/URL;I)Len;")
    public final class154 method2630(URL arg0) {
        return this.method2632(4, 0, 0, arg0);
    }
}
