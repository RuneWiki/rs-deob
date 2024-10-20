package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fl")
public class class176 implements Runnable {

    @ObfuscatedName("fl.l")
    public class175 field2061 = null;

    @ObfuscatedName("fl.m")
    public class175 field2062 = null;

    @ObfuscatedName("fl.z")
    public Thread field2063;

    @ObfuscatedName("fl.q")
    public boolean field2064 = false;

    public class176() {
        Statics.field2059 = "Unknown";
        Statics.field2071 = "1.6";
        try {
            Statics.field2059 = System.getProperty("java.vendor");
            Statics.field2071 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2064 = false;
        this.field2063 = new Thread(this);
        this.field2063.setPriority(10);
        this.field2063.setDaemon(true);
        this.field2063.start();
    }

    @ObfuscatedName("fl.f(B)V")
    public final void method3297() {
        synchronized (this) {
            this.field2064 = true;
            this.notifyAll();
        }
        try {
            this.field2063.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class175 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2064) {
                        return;
                    }
                    if (this.field2061 != null) {
                        var2 = this.field2061;
                        this.field2061 = this.field2061.field2053;
                        if (this.field2061 == null) {
                            this.field2062 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var11) {
                    }
                }
            }
            try {
                int var5 = var2.field2055;
                if (var5 == 1) {
                    var2.field2058 = new Socket(InetAddress.getByName((String) var2.field2057), var2.field2050);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2057);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2050);
                    var2.field2058 = var6;
                } else if (var5 == 4) {
                    var2.field2058 = new DataInputStream(((URL) var2.field2057).openStream());
                }
                var2.field2054 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2054 = 2;
            }
        }
    }

    @ObfuscatedName("fl.b(IIILjava/lang/Object;B)Lfu;")
    public final class175 method3285(int arg0, int arg1, int arg2, Object arg3) {
        class175 var5 = new class175();
        var5.field2055 = arg0;
        var5.field2050 = arg1;
        var5.field2057 = arg3;
        synchronized (this) {
            if (this.field2062 == null) {
                this.field2062 = this.field2061 = var5;
            } else {
                this.field2062.field2053 = var5;
                this.field2062 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fl.l(Ljava/lang/String;II)Lfu;")
    public final class175 method3286(String arg0, int arg1) {
        return this.method3285(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fl.m(Ljava/lang/Runnable;IS)Lfu;")
    public final class175 method3287(Runnable arg0, int arg1) {
        return this.method3285(2, arg1, 0, arg0);
    }
}
