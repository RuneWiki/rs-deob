package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fd")
public class class167 implements Runnable {

    @ObfuscatedName("fd.i")
    public class166 field2168 = null;

    @ObfuscatedName("fd.a")
    public class166 field2171 = null;

    @ObfuscatedName("fd.l")
    public Thread field2170;

    @ObfuscatedName("fd.b")
    public boolean field2166 = false;

    public class167() {
        Statics.field2172 = "Unknown";
        Statics.field2167 = "1.6";
        try {
            Statics.field2172 = System.getProperty("java.vendor");
            Statics.field2167 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2166 = false;
        this.field2170 = new Thread(this);
        this.field2170.setPriority(10);
        this.field2170.setDaemon(true);
        this.field2170.start();
    }

    @ObfuscatedName("fd.t(S)V")
    public final void method2995() {
        synchronized (this) {
            this.field2166 = true;
            this.notifyAll();
        }
        try {
            this.field2170.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2166) {
                        return;
                    }
                    if (this.field2168 != null) {
                        var2 = this.field2168;
                        this.field2168 = this.field2168.field2159;
                        if (this.field2168 == null) {
                            this.field2171 = null;
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
                int var5 = var2.field2162;
                if (var5 == 1) {
                    var2.field2165 = new Socket(InetAddress.getByName((String) var2.field2164), var2.field2163);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2164);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2163);
                    var2.field2165 = var6;
                } else if (var5 == 4) {
                    var2.field2165 = new DataInputStream(((URL) var2.field2164).openStream());
                }
                var2.field2161 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2161 = 2;
            }
        }
    }

    @ObfuscatedName("fd.q(IIILjava/lang/Object;I)Lfb;")
    public final class166 method2980(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2162 = arg0;
        var5.field2163 = arg1;
        var5.field2164 = arg3;
        synchronized (this) {
            if (this.field2171 == null) {
                this.field2171 = this.field2168 = var5;
            } else {
                this.field2171.field2159 = var5;
                this.field2171 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fd.i(Ljava/lang/String;II)Lfb;")
    public final class166 method2974(String arg0, int arg1) {
        return this.method2980(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fd.a(Ljava/lang/Runnable;II)Lfb;")
    public final class166 method2972(Runnable arg0, int arg1) {
        return this.method2980(2, arg1, 0, arg0);
    }
}
