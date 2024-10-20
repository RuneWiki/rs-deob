package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fa")
public class class176 implements Runnable {

    @ObfuscatedName("fa.x")
    public class175 field2051 = null;

    @ObfuscatedName("fa.w")
    public class175 field2050 = null;

    @ObfuscatedName("fa.t")
    public Thread field2049;

    @ObfuscatedName("fa.j")
    public boolean field2054 = false;

    public class176() {
        Statics.field2053 = "Unknown";
        Statics.field2052 = "1.6";
        try {
            Statics.field2053 = System.getProperty("java.vendor");
            Statics.field2052 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2054 = false;
        this.field2049 = new Thread(this);
        this.field2049.setPriority(10);
        this.field2049.setDaemon(true);
        this.field2049.start();
    }

    @ObfuscatedName("fa.h(I)V")
    public final void method3264() {
        synchronized (this) {
            this.field2054 = true;
            this.notifyAll();
        }
        try {
            this.field2049.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class175 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2054) {
                        return;
                    }
                    if (this.field2051 != null) {
                        var2 = this.field2051;
                        this.field2051 = this.field2051.field2040;
                        if (this.field2051 == null) {
                            this.field2050 = null;
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
                int var5 = var2.field2045;
                if (var5 == 1) {
                    var2.field2048 = new Socket(InetAddress.getByName((String) var2.field2047), var2.field2044);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2047);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2044);
                    var2.field2048 = var6;
                } else if (var5 == 4) {
                    var2.field2048 = new DataInputStream(((URL) var2.field2047).openStream());
                }
                var2.field2046 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2046 = 2;
            }
        }
    }

    @ObfuscatedName("fa.v(IIILjava/lang/Object;I)Lfd;")
    public final class175 method3276(int arg0, int arg1, int arg2, Object arg3) {
        class175 var5 = new class175();
        var5.field2045 = arg0;
        var5.field2044 = arg1;
        var5.field2047 = arg3;
        synchronized (this) {
            if (this.field2050 == null) {
                this.field2050 = this.field2051 = var5;
            } else {
                this.field2050.field2040 = var5;
                this.field2050 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fa.x(Ljava/lang/String;IB)Lfd;")
    public final class175 method3266(String arg0, int arg1) {
        return this.method3276(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fa.w(Ljava/lang/Runnable;II)Lfd;")
    public final class175 method3265(Runnable arg0, int arg1) {
        return this.method3276(2, arg1, 0, arg0);
    }
}
