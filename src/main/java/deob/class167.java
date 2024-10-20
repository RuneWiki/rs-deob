package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fl")
public class class167 implements Runnable {

    @ObfuscatedName("fl.b")
    public class166 field2187 = null;

    @ObfuscatedName("fl.z")
    public class166 field2188 = null;

    @ObfuscatedName("fl.n")
    public Thread field2189;

    @ObfuscatedName("fl.l")
    public boolean field2185 = false;

    public class167() {
        Statics.field2190 = "Unknown";
        Statics.field2186 = "1.6";
        try {
            Statics.field2190 = System.getProperty("java.vendor");
            Statics.field2186 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2185 = false;
        this.field2189 = new Thread(this);
        this.field2189.setPriority(10);
        this.field2189.setDaemon(true);
        this.field2189.start();
    }

    @ObfuscatedName("fl.g(B)V")
    public final void method3076() {
        synchronized (this) {
            this.field2185 = true;
            this.notifyAll();
        }
        try {
            this.field2189.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2185) {
                        return;
                    }
                    if (this.field2187 != null) {
                        var2 = this.field2187;
                        this.field2187 = this.field2187.field2179;
                        if (this.field2187 == null) {
                            this.field2188 = null;
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
                int var5 = var2.field2181;
                if (var5 == 1) {
                    var2.field2182 = new Socket(InetAddress.getByName((String) var2.field2176), var2.field2180);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2176);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2180);
                    var2.field2182 = var6;
                } else if (var5 == 4) {
                    var2.field2182 = new DataInputStream(((URL) var2.field2176).openStream());
                }
                var2.field2183 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2183 = 2;
            }
        }
    }

    @ObfuscatedName("fl.e(IIILjava/lang/Object;B)Lfi;")
    public final class166 method3078(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2181 = arg0;
        var5.field2180 = arg1;
        var5.field2176 = arg3;
        synchronized (this) {
            if (this.field2188 == null) {
                this.field2188 = this.field2187 = var5;
            } else {
                this.field2188.field2179 = var5;
                this.field2188 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fl.b(Ljava/lang/String;II)Lfi;")
    public final class166 method3079(String arg0, int arg1) {
        return this.method3078(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fl.z(Ljava/lang/Runnable;II)Lfi;")
    public final class166 method3080(Runnable arg0, int arg1) {
        return this.method3078(2, arg1, 0, arg0);
    }
}
