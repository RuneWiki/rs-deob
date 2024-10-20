package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eb")
public class class155 implements Runnable {

    @ObfuscatedName("eb.e")
    public class154 field2252 = null;

    @ObfuscatedName("eb.v")
    public class154 field2253 = null;

    @ObfuscatedName("eb.b")
    public Thread field2250;

    @ObfuscatedName("eb.y")
    public boolean field2257 = false;

    public class155() {
        Statics.field2255 = "Unknown";
        Statics.field2251 = "1.6";
        try {
            Statics.field2255 = System.getProperty("java.vendor");
            Statics.field2251 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2257 = false;
        this.field2250 = new Thread(this);
        this.field2250.setPriority(10);
        this.field2250.setDaemon(true);
        this.field2250.start();
    }

    @ObfuscatedName("eb.i(I)V")
    public final void method2680() {
        synchronized (this) {
            this.field2257 = true;
            this.notifyAll();
        }
        try {
            this.field2250.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2257) {
                        return;
                    }
                    if (this.field2252 != null) {
                        var2 = this.field2252;
                        this.field2252 = this.field2252.field2246;
                        if (this.field2252 == null) {
                            this.field2253 = null;
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
                int var5 = var2.field2241;
                if (var5 == 1) {
                    var2.field2249 = new Socket(InetAddress.getByName((String) var2.field2243), var2.field2247);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2243);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2247);
                    var2.field2249 = var6;
                } else if (var5 == 4) {
                    var2.field2249 = new DataInputStream(((URL) var2.field2243).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2247 >> 24 & 0xFF) + "." + (var2.field2247 >> 16 & 0xFF) + "." + (var2.field2247 >> 8 & 0xFF) + "." + (var2.field2247 & 0xFF);
                    var2.field2249 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2245 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2245 = 2;
            }
        }
    }

    @ObfuscatedName("eb.c(IIILjava/lang/Object;I)Lel;")
    public final class154 method2686(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field2241 = arg0;
        var5.field2247 = arg1;
        var5.field2243 = arg3;
        synchronized (this) {
            if (this.field2253 == null) {
                this.field2253 = this.field2252 = var5;
            } else {
                this.field2253.field2246 = var5;
                this.field2253 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eb.e(Ljava/lang/String;IB)Lel;")
    public final class154 method2682(String arg0, int arg1) {
        return this.method2686(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eb.v(Ljava/lang/Runnable;IB)Lel;")
    public final class154 method2683(Runnable arg0, int arg1) {
        return this.method2686(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eb.b(II)Lel;")
    public final class154 method2684(int arg0) {
        return this.method2686(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("eb.y(Ljava/net/URL;B)Lel;")
    public final class154 method2701(URL arg0) {
        return this.method2686(4, 0, 0, arg0);
    }
}
