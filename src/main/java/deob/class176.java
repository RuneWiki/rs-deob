package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fu")
public class class176 implements Runnable {

    @ObfuscatedName("fu.d")
    public class175 field2044 = null;

    @ObfuscatedName("fu.c")
    public class175 field2047 = null;

    @ObfuscatedName("fu.y")
    public Thread field2045;

    @ObfuscatedName("fu.h")
    public boolean field2049 = false;

    public class176() {
        Statics.field2048 = "Unknown";
        Statics.field2050 = "1.6";
        try {
            Statics.field2048 = System.getProperty("java.vendor");
            Statics.field2050 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2049 = false;
        this.field2045 = new Thread(this);
        this.field2045.setPriority(10);
        this.field2045.setDaemon(true);
        this.field2045.start();
    }

    @ObfuscatedName("fu.n(I)V")
    public final void method3379() {
        synchronized (this) {
            this.field2049 = true;
            this.notifyAll();
        }
        try {
            this.field2045.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class175 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2049) {
                        return;
                    }
                    if (this.field2044 != null) {
                        var2 = this.field2044;
                        this.field2044 = this.field2044.field2040;
                        if (this.field2044 == null) {
                            this.field2047 = null;
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
                int var5 = var2.field2042;
                if (var5 == 1) {
                    var2.field2043 = new Socket(InetAddress.getByName((String) var2.field2041), var2.field2038);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2041);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2038);
                    var2.field2043 = var6;
                } else if (var5 == 4) {
                    var2.field2043 = new DataInputStream(((URL) var2.field2041).openStream());
                }
                var2.field2039 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2039 = 2;
            }
        }
    }

    @ObfuscatedName("fu.v(IIILjava/lang/Object;I)Lfl;")
    public final class175 method3374(int arg0, int arg1, int arg2, Object arg3) {
        class175 var5 = new class175();
        var5.field2042 = arg0;
        var5.field2038 = arg1;
        var5.field2041 = arg3;
        synchronized (this) {
            if (this.field2047 == null) {
                this.field2047 = this.field2044 = var5;
            } else {
                this.field2047.field2040 = var5;
                this.field2047 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fu.d(Ljava/lang/String;II)Lfl;")
    public final class175 method3375(String arg0, int arg1) {
        return this.method3374(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fu.c(Ljava/lang/Runnable;II)Lfl;")
    public final class175 method3387(Runnable arg0, int arg1) {
        return this.method3374(2, arg1, 0, arg0);
    }
}
