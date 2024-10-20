package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ei")
public class class155 implements Runnable {

    @ObfuscatedName("ei.m")
    public class154 field2223 = null;

    @ObfuscatedName("ei.g")
    public class154 field2219 = null;

    @ObfuscatedName("ei.d")
    public Thread field2228;

    @ObfuscatedName("ei.b")
    public boolean field2224 = false;

    public class155() {
        Statics.field2222 = "Unknown";
        Statics.field2220 = "1.6";
        try {
            Statics.field2222 = System.getProperty("java.vendor");
            Statics.field2220 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2224 = false;
        this.field2228 = new Thread(this);
        this.field2228.setPriority(10);
        this.field2228.setDaemon(true);
        this.field2228.start();
    }

    @ObfuscatedName("ei.e(I)V")
    public final void method2701() {
        synchronized (this) {
            this.field2224 = true;
            this.notifyAll();
        }
        try {
            this.field2228.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2224) {
                        return;
                    }
                    if (this.field2223 != null) {
                        var2 = this.field2223;
                        this.field2223 = this.field2223.field2218;
                        if (this.field2223 == null) {
                            this.field2219 = null;
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
                int var5 = var2.field2215;
                if (var5 == 1) {
                    var2.field2214 = new Socket(InetAddress.getByName((String) var2.field2217), var2.field2216);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2217);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2216);
                    var2.field2214 = var6;
                } else if (var5 == 4) {
                    var2.field2214 = new DataInputStream(((URL) var2.field2217).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2216 >> 24 & 0xFF) + "." + (var2.field2216 >> 16 & 0xFF) + "." + (var2.field2216 >> 8 & 0xFF) + "." + (var2.field2216 & 0xFF);
                    var2.field2214 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2213 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2213 = 2;
            }
        }
    }

    @ObfuscatedName("ei.o(IIILjava/lang/Object;I)Let;")
    public final class154 method2680(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field2215 = arg0;
        var5.field2216 = arg1;
        var5.field2217 = arg3;
        synchronized (this) {
            if (this.field2219 == null) {
                this.field2219 = this.field2223 = var5;
            } else {
                this.field2219.field2218 = var5;
                this.field2219 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ei.m(Ljava/lang/String;IB)Let;")
    public final class154 method2681(String arg0, int arg1) {
        return this.method2680(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ei.g(Ljava/lang/Runnable;IS)Let;")
    public final class154 method2682(Runnable arg0, int arg1) {
        return this.method2680(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ei.d(II)Let;")
    public final class154 method2683(int arg0) {
        return this.method2680(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ei.b(Ljava/net/URL;B)Let;")
    public final class154 method2702(URL arg0) {
        return this.method2680(4, 0, 0, arg0);
    }
}
