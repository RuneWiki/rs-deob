package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fe")
public class class167 implements Runnable {

    @ObfuscatedName("fe.t")
    public class166 field2217 = null;

    @ObfuscatedName("fe.d")
    public class166 field2212 = null;

    @ObfuscatedName("fe.h")
    public Thread field2213;

    @ObfuscatedName("fe.m")
    public boolean field2214 = false;

    public class167() {
        Statics.field2215 = "Unknown";
        Statics.field2210 = "1.6";
        try {
            Statics.field2215 = System.getProperty("java.vendor");
            Statics.field2210 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2214 = false;
        this.field2213 = new Thread(this);
        this.field2213.setPriority(10);
        this.field2213.setDaemon(true);
        this.field2213.start();
    }

    @ObfuscatedName("fe.o(I)V")
    public final void method2969() {
        synchronized (this) {
            this.field2214 = true;
            this.notifyAll();
        }
        try {
            this.field2213.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2214) {
                        return;
                    }
                    if (this.field2217 != null) {
                        var2 = this.field2217;
                        this.field2217 = this.field2217.field2201;
                        if (this.field2217 == null) {
                            this.field2212 = null;
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
                int var5 = var2.field2205;
                if (var5 == 1) {
                    var2.field2206 = new Socket(InetAddress.getByName((String) var2.field2207), var2.field2203);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2207);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2203);
                    var2.field2206 = var6;
                } else if (var5 == 4) {
                    var2.field2206 = new DataInputStream(((URL) var2.field2207).openStream());
                }
                var2.field2204 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2204 = 2;
            }
        }
    }

    @ObfuscatedName("fe.k(IIILjava/lang/Object;I)Lfo;")
    public final class166 method2970(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2205 = arg0;
        var5.field2203 = arg1;
        var5.field2207 = arg3;
        synchronized (this) {
            if (this.field2212 == null) {
                this.field2212 = this.field2217 = var5;
            } else {
                this.field2212.field2201 = var5;
                this.field2212 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fe.t(Ljava/lang/String;II)Lfo;")
    public final class166 method2982(String arg0, int arg1) {
        return this.method2970(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fe.d(Ljava/lang/Runnable;IB)Lfo;")
    public final class166 method2972(Runnable arg0, int arg1) {
        return this.method2970(2, arg1, 0, arg0);
    }
}
