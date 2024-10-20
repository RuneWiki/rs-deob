package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eo")
public class class155 implements Runnable {

    @ObfuscatedName("eo.a")
    public class154 field2251 = null;

    @ObfuscatedName("eo.t")
    public class154 field2252 = null;

    @ObfuscatedName("eo.s")
    public Thread field2253;

    @ObfuscatedName("eo.r")
    public boolean field2250 = false;

    public class155() {
        Statics.field2254 = "Unknown";
        Statics.field2249 = "1.6";
        try {
            Statics.field2254 = System.getProperty("java.vendor");
            Statics.field2249 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2250 = false;
        this.field2253 = new Thread(this);
        this.field2253.setPriority(10);
        this.field2253.setDaemon(true);
        this.field2253.start();
    }

    @ObfuscatedName("eo.i(B)V")
    public final void method2669() {
        synchronized (this) {
            this.field2250 = true;
            this.notifyAll();
        }
        try {
            this.field2253.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2250) {
                        return;
                    }
                    if (this.field2251 != null) {
                        var2 = this.field2251;
                        this.field2251 = this.field2251.field2243;
                        if (this.field2251 == null) {
                            this.field2252 = null;
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
                int var5 = var2.field2245;
                if (var5 == 1) {
                    var2.field2240 = new Socket(InetAddress.getByName((String) var2.field2247), var2.field2246);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2247);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2246);
                    var2.field2240 = var6;
                } else if (var5 == 4) {
                    var2.field2240 = new DataInputStream(((URL) var2.field2247).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2246 >> 24 & 0xFF) + "." + (var2.field2246 >> 16 & 0xFF) + "." + (var2.field2246 >> 8 & 0xFF) + "." + (var2.field2246 & 0xFF);
                    var2.field2240 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2244 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2244 = 2;
            }
        }
    }

    @ObfuscatedName("eo.w(IIILjava/lang/Object;I)Leh;")
    public final class154 method2671(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field2245 = arg0;
        var5.field2246 = arg1;
        var5.field2247 = arg3;
        synchronized (this) {
            if (this.field2252 == null) {
                this.field2252 = this.field2251 = var5;
            } else {
                this.field2252.field2243 = var5;
                this.field2252 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eo.a(Ljava/lang/String;II)Leh;")
    public final class154 method2672(String arg0, int arg1) {
        return this.method2671(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eo.t(Ljava/lang/Runnable;II)Leh;")
    public final class154 method2673(Runnable arg0, int arg1) {
        return this.method2671(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eo.s(II)Leh;")
    public final class154 method2676(int arg0) {
        return this.method2671(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("eo.r(Ljava/net/URL;B)Leh;")
    public final class154 method2674(URL arg0) {
        return this.method2671(4, 0, 0, arg0);
    }
}
