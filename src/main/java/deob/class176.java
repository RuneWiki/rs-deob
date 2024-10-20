package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fs")
public class class176 implements Runnable {

    @ObfuscatedName("fs.k")
    public class175 field2041 = null;

    @ObfuscatedName("fs.d")
    public class175 field2039 = null;

    @ObfuscatedName("fs.w")
    public Thread field2043;

    @ObfuscatedName("fs.v")
    public boolean field2044 = false;

    public class176() {
        Statics.field2040 = "Unknown";
        Statics.field2042 = "1.6";
        try {
            Statics.field2040 = System.getProperty("java.vendor");
            Statics.field2042 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2044 = false;
        this.field2043 = new Thread(this);
        this.field2043.setPriority(10);
        this.field2043.setDaemon(true);
        this.field2043.start();
    }

    @ObfuscatedName("fs.x(B)V")
    public final void method3254() {
        synchronized (this) {
            this.field2044 = true;
            this.notifyAll();
        }
        try {
            this.field2043.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class175 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2044) {
                        return;
                    }
                    if (this.field2041 != null) {
                        var2 = this.field2041;
                        this.field2041 = this.field2041.field2038;
                        if (this.field2041 == null) {
                            this.field2039 = null;
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
                int var5 = var2.field2035;
                if (var5 == 1) {
                    var2.field2031 = new Socket(InetAddress.getByName((String) var2.field2037), var2.field2036);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2037);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2036);
                    var2.field2031 = var6;
                } else if (var5 == 4) {
                    var2.field2031 = new DataInputStream(((URL) var2.field2037).openStream());
                }
                var2.field2034 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2034 = 2;
            }
        }
    }

    @ObfuscatedName("fs.m(IIILjava/lang/Object;I)Lfr;")
    public final class175 method3255(int arg0, int arg1, int arg2, Object arg3) {
        class175 var5 = new class175();
        var5.field2035 = arg0;
        var5.field2036 = arg1;
        var5.field2037 = arg3;
        synchronized (this) {
            if (this.field2039 == null) {
                this.field2039 = this.field2041 = var5;
            } else {
                this.field2039.field2038 = var5;
                this.field2039 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fs.k(Ljava/lang/String;IB)Lfr;")
    public final class175 method3256(String arg0, int arg1) {
        return this.method3255(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fs.d(Ljava/lang/Runnable;IB)Lfr;")
    public final class175 method3257(Runnable arg0, int arg1) {
        return this.method3255(2, arg1, 0, arg0);
    }
}
