package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fy")
public class class157 implements Runnable {

    @ObfuscatedName("fy.m")
    public class156 field2133 = null;

    @ObfuscatedName("fy.h")
    public class156 field2135 = null;

    @ObfuscatedName("fy.i")
    public Thread field2136;

    @ObfuscatedName("fy.w")
    public boolean field2137 = false;

    public class157() {
        Statics.field2534 = "Unknown";
        Statics.field2140 = "1.6";
        try {
            Statics.field2534 = System.getProperty("java.vendor");
            Statics.field2140 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2137 = false;
        this.field2136 = new Thread(this);
        this.field2136.setPriority(10);
        this.field2136.setDaemon(true);
        this.field2136.start();
    }

    @ObfuscatedName("fy.s(I)V")
    public final void method2992() {
        synchronized (this) {
            this.field2137 = true;
            this.notifyAll();
        }
        try {
            this.field2136.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class156 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2137) {
                        return;
                    }
                    if (this.field2133 != null) {
                        var2 = this.field2133;
                        this.field2133 = this.field2133.field2124;
                        if (this.field2133 == null) {
                            this.field2135 = null;
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
                int var5 = var2.field2131;
                if (var5 == 1) {
                    var2.field2130 = new Socket(InetAddress.getByName((String) var2.field2132), var2.field2129);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2132);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2129);
                    var2.field2130 = var6;
                } else if (var5 == 4) {
                    var2.field2130 = new DataInputStream(((URL) var2.field2132).openStream());
                }
                var2.field2128 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2128 = 2;
            }
        }
    }

    @ObfuscatedName("fy.g(IIILjava/lang/Object;I)Led;")
    public final class156 method3000(int arg0, int arg1, int arg2, Object arg3) {
        class156 var5 = new class156();
        var5.field2131 = arg0;
        var5.field2129 = arg1;
        var5.field2132 = arg3;
        synchronized (this) {
            if (this.field2135 == null) {
                this.field2135 = this.field2133 = var5;
            } else {
                this.field2135.field2124 = var5;
                this.field2135 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fy.m(Ljava/lang/String;II)Led;")
    public final class156 method2991(String arg0, int arg1) {
        return this.method3000(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fy.h(Ljava/lang/Runnable;II)Led;")
    public final class156 method2993(Runnable arg0, int arg1) {
        return this.method3000(2, arg1, 0, arg0);
    }
}
