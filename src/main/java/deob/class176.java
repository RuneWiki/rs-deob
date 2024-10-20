package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fm")
public class class176 implements Runnable {

    @ObfuscatedName("fm.q")
    public class175 field2059 = null;

    @ObfuscatedName("fm.j")
    public class175 field2060 = null;

    @ObfuscatedName("fm.p")
    public Thread field2061;

    @ObfuscatedName("fm.g")
    public boolean field2062 = false;

    public class176() {
        Statics.field2066 = "Unknown";
        Statics.field2057 = "1.6";
        try {
            Statics.field2066 = System.getProperty("java.vendor");
            Statics.field2057 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2062 = false;
        this.field2061 = new Thread(this);
        this.field2061.setPriority(10);
        this.field2061.setDaemon(true);
        this.field2061.start();
    }

    @ObfuscatedName("fm.m(I)V")
    public final void method3256() {
        synchronized (this) {
            this.field2062 = true;
            this.notifyAll();
        }
        try {
            this.field2061.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class175 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2062) {
                        return;
                    }
                    if (this.field2059 != null) {
                        var2 = this.field2059;
                        this.field2059 = this.field2059.field2054;
                        if (this.field2059 == null) {
                            this.field2060 = null;
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
                int var5 = var2.field2053;
                if (var5 == 1) {
                    var2.field2056 = new Socket(InetAddress.getByName((String) var2.field2050), var2.field2055);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2050);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2055);
                    var2.field2056 = var6;
                } else if (var5 == 4) {
                    var2.field2056 = new DataInputStream(((URL) var2.field2050).openStream());
                }
                var2.field2051 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2051 = 2;
            }
        }
    }

    @ObfuscatedName("fm.o(IIILjava/lang/Object;I)Lfa;")
    public final class175 method3255(int arg0, int arg1, int arg2, Object arg3) {
        class175 var5 = new class175();
        var5.field2053 = arg0;
        var5.field2055 = arg1;
        var5.field2050 = arg3;
        synchronized (this) {
            if (this.field2060 == null) {
                this.field2060 = this.field2059 = var5;
            } else {
                this.field2060.field2054 = var5;
                this.field2060 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fm.q(Ljava/lang/String;II)Lfa;")
    public final class175 method3258(String arg0, int arg1) {
        return this.method3255(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fm.j(Ljava/lang/Runnable;II)Lfa;")
    public final class175 method3274(Runnable arg0, int arg1) {
        return this.method3255(2, arg1, 0, arg0);
    }
}
