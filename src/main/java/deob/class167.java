package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fv")
public class class167 implements Runnable {

    @ObfuscatedName("fv.n")
    public class166 field2186 = null;

    @ObfuscatedName("fv.r")
    public class166 field2187 = null;

    @ObfuscatedName("fv.e")
    public Thread field2188;

    @ObfuscatedName("fv.y")
    public boolean field2191 = false;

    public class167() {
        Statics.field2189 = "Unknown";
        Statics.field2184 = "1.6";
        try {
            Statics.field2189 = System.getProperty("java.vendor");
            Statics.field2184 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2191 = false;
        this.field2188 = new Thread(this);
        this.field2188.setPriority(10);
        this.field2188.setDaemon(true);
        this.field2188.start();
    }

    @ObfuscatedName("fv.d(B)V")
    public final void method3019() {
        synchronized (this) {
            this.field2191 = true;
            this.notifyAll();
        }
        try {
            this.field2188.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2191) {
                        return;
                    }
                    if (this.field2186 != null) {
                        var2 = this.field2186;
                        this.field2186 = this.field2186.field2183;
                        if (this.field2186 == null) {
                            this.field2187 = null;
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
                int var5 = var2.field2180;
                if (var5 == 1) {
                    var2.field2176 = new Socket(InetAddress.getByName((String) var2.field2182), var2.field2175);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2182);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2175);
                    var2.field2176 = var6;
                } else if (var5 == 4) {
                    var2.field2176 = new DataInputStream(((URL) var2.field2182).openStream());
                }
                var2.field2179 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2179 = 2;
            }
        }
    }

    @ObfuscatedName("fv.z(IIILjava/lang/Object;B)Lfa;")
    public final class166 method3020(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2180 = arg0;
        var5.field2175 = arg1;
        var5.field2182 = arg3;
        synchronized (this) {
            if (this.field2187 == null) {
                this.field2187 = this.field2186 = var5;
            } else {
                this.field2187.field2183 = var5;
                this.field2187 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fv.n(Ljava/lang/String;II)Lfa;")
    public final class166 method3034(String arg0, int arg1) {
        return this.method3020(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fv.r(Ljava/lang/Runnable;II)Lfa;")
    public final class166 method3022(Runnable arg0, int arg1) {
        return this.method3020(2, arg1, 0, arg0);
    }
}
