package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ez")
public class class155 implements Runnable {

    @ObfuscatedName("ez.e")
    public class154 field2245 = null;

    @ObfuscatedName("ez.p")
    public class154 field2243 = null;

    @ObfuscatedName("ez.q")
    public Thread field2247;

    @ObfuscatedName("ez.s")
    public boolean field2249 = false;

    public class155() {
        Statics.field2248 = "Unknown";
        Statics.field2244 = "1.6";
        try {
            Statics.field2248 = System.getProperty("java.vendor");
            Statics.field2244 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2249 = false;
        this.field2247 = new Thread(this);
        this.field2247.setPriority(10);
        this.field2247.setDaemon(true);
        this.field2247.start();
    }

    @ObfuscatedName("ez.d(I)V")
    public final void method2764() {
        synchronized (this) {
            this.field2249 = true;
            this.notifyAll();
        }
        try {
            this.field2247.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2249) {
                        return;
                    }
                    if (this.field2245 != null) {
                        var2 = this.field2245;
                        this.field2245 = this.field2245.field2238;
                        if (this.field2245 == null) {
                            this.field2243 = null;
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
                    var2.field2242 = new Socket(InetAddress.getByName((String) var2.field2235), var2.field2241);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2235);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2241);
                    var2.field2242 = var6;
                } else if (var5 == 4) {
                    var2.field2242 = new DataInputStream(((URL) var2.field2235).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2241 >> 24 & 0xFF) + "." + (var2.field2241 >> 16 & 0xFF) + "." + (var2.field2241 >> 8 & 0xFF) + "." + (var2.field2241 & 0xFF);
                    var2.field2242 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2234 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2234 = 2;
            }
        }
    }

    @ObfuscatedName("ez.k(IIILjava/lang/Object;I)Leh;")
    public final class154 method2759(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field2239 = arg0;
        var5.field2241 = arg1;
        var5.field2235 = arg3;
        synchronized (this) {
            if (this.field2243 == null) {
                this.field2243 = this.field2245 = var5;
            } else {
                this.field2243.field2238 = var5;
                this.field2243 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ez.e(Ljava/lang/String;II)Leh;")
    public final class154 method2760(String arg0, int arg1) {
        return this.method2759(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ez.p(Ljava/lang/Runnable;II)Leh;")
    public final class154 method2774(Runnable arg0, int arg1) {
        return this.method2759(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ez.q(IB)Leh;")
    public final class154 method2761(int arg0) {
        return this.method2759(3, arg0, 0, (Object) null);
    }
}
