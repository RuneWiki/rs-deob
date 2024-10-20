package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fo")
public class class162 implements Runnable {

    @ObfuscatedName("fo.g")
    public class161 field2036 = null;

    @ObfuscatedName("fo.x")
    public class161 field2037 = null;

    @ObfuscatedName("fo.h")
    public Thread field2038;

    @ObfuscatedName("fo.f")
    public boolean field2034 = false;

    public class162() {
        Statics.field2035 = "Unknown";
        Statics.field2039 = "1.6";
        try {
            Statics.field2035 = System.getProperty("java.vendor");
            Statics.field2039 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2034 = false;
        this.field2038 = new Thread(this);
        this.field2038.setPriority(10);
        this.field2038.setDaemon(true);
        this.field2038.start();
    }

    @ObfuscatedName("fo.a(I)V")
    public final void method3214() {
        synchronized (this) {
            this.field2034 = true;
            this.notifyAll();
        }
        try {
            this.field2038.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class161 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2034) {
                        return;
                    }
                    if (this.field2036 != null) {
                        var2 = this.field2036;
                        this.field2036 = this.field2036.field2028;
                        if (this.field2036 == null) {
                            this.field2037 = null;
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
                int var5 = var2.field2031;
                if (var5 == 1) {
                    var2.field2033 = new Socket(InetAddress.getByName((String) var2.field2032), var2.field2029);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2032);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2029);
                    var2.field2033 = var6;
                } else if (var5 == 4) {
                    var2.field2033 = new DataInputStream(((URL) var2.field2032).openStream());
                }
                var2.field2030 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2030 = 2;
            }
        }
    }

    @ObfuscatedName("fo.s(IIILjava/lang/Object;I)Lfn;")
    public final class161 method3216(int arg0, int arg1, int arg2, Object arg3) {
        class161 var5 = new class161();
        var5.field2031 = arg0;
        var5.field2029 = arg1;
        var5.field2032 = arg3;
        synchronized (this) {
            if (this.field2037 == null) {
                this.field2037 = this.field2036 = var5;
            } else {
                this.field2037.field2028 = var5;
                this.field2037 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fo.g(Ljava/lang/String;II)Lfn;")
    public final class161 method3217(String arg0, int arg1) {
        return this.method3216(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fo.x(Ljava/lang/Runnable;IS)Lfn;")
    public final class161 method3221(Runnable arg0, int arg1) {
        return this.method3216(2, arg1, 0, arg0);
    }
}
