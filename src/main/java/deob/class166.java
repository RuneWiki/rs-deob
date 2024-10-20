package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ff")
public class class166 implements Runnable {

    @ObfuscatedName("ff.o")
    public class165 field2160 = null;

    @ObfuscatedName("ff.p")
    public class165 field2161 = null;

    @ObfuscatedName("ff.a")
    public Thread field2162;

    @ObfuscatedName("ff.h")
    public boolean field2163 = false;

    public class166() {
        Statics.field2159 = "Unknown";
        Statics.field313 = "1.6";
        try {
            Statics.field2159 = System.getProperty("java.vendor");
            Statics.field313 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2163 = false;
        this.field2162 = new Thread(this);
        this.field2162.setPriority(10);
        this.field2162.setDaemon(true);
        this.field2162.start();
    }

    @ObfuscatedName("ff.b(I)V")
    public final void method3000() {
        synchronized (this) {
            this.field2163 = true;
            this.notifyAll();
        }
        try {
            this.field2162.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class165 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2163) {
                        return;
                    }
                    if (this.field2160 != null) {
                        var2 = this.field2160;
                        this.field2160 = this.field2160.field2153;
                        if (this.field2160 == null) {
                            this.field2161 = null;
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
                int var5 = var2.field2155;
                if (var5 == 1) {
                    var2.field2158 = new Socket(InetAddress.getByName((String) var2.field2157), var2.field2156);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2157);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2156);
                    var2.field2158 = var6;
                } else if (var5 == 4) {
                    var2.field2158 = new DataInputStream(((URL) var2.field2157).openStream());
                }
                var2.field2154 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2154 = 2;
            }
        }
    }

    @ObfuscatedName("ff.q(IIILjava/lang/Object;I)Lfk;")
    public final class165 method2982(int arg0, int arg1, int arg2, Object arg3) {
        class165 var5 = new class165();
        var5.field2155 = arg0;
        var5.field2156 = arg1;
        var5.field2157 = arg3;
        synchronized (this) {
            if (this.field2161 == null) {
                this.field2161 = this.field2160 = var5;
            } else {
                this.field2161.field2153 = var5;
                this.field2161 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ff.o(Ljava/lang/String;II)Lfk;")
    public final class165 method2983(String arg0, int arg1) {
        return this.method2982(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ff.p(Ljava/lang/Runnable;IB)Lfk;")
    public final class165 method2985(Runnable arg0, int arg1) {
        return this.method2982(2, arg1, 0, arg0);
    }
}
