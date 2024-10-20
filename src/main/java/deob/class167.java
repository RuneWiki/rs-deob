package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fu")
public class class167 implements Runnable {

    @ObfuscatedName("fu.b")
    public class166 field2038 = null;

    @ObfuscatedName("fu.g")
    public class166 field2040 = null;

    @ObfuscatedName("fu.z")
    public Thread field2036;

    @ObfuscatedName("fu.p")
    public boolean field2039 = false;

    public class167() {
        Statics.field2042 = "Unknown";
        Statics.field2037 = "1.6";
        try {
            Statics.field2042 = System.getProperty("java.vendor");
            Statics.field2037 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2039 = false;
        this.field2036 = new Thread(this);
        this.field2036.setPriority(10);
        this.field2036.setDaemon(true);
        this.field2036.start();
    }

    @ObfuscatedName("fu.u(I)V")
    public final void method3203() {
        synchronized (this) {
            this.field2039 = true;
            this.notifyAll();
        }
        try {
            this.field2036.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2039) {
                        return;
                    }
                    if (this.field2038 != null) {
                        var2 = this.field2038;
                        this.field2038 = this.field2038.field2031;
                        if (this.field2038 == null) {
                            this.field2040 = null;
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
                int var5 = var2.field2032;
                if (var5 == 1) {
                    var2.field2029 = new Socket(InetAddress.getByName((String) var2.field2034), var2.field2033);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2034);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2033);
                    var2.field2029 = var6;
                } else if (var5 == 4) {
                    var2.field2029 = new DataInputStream(((URL) var2.field2034).openStream());
                }
                var2.field2027 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2027 = 2;
            }
        }
    }

    @ObfuscatedName("fu.f(IIILjava/lang/Object;B)Lfo;")
    public final class166 method3204(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2032 = arg0;
        var5.field2033 = arg1;
        var5.field2034 = arg3;
        synchronized (this) {
            if (this.field2040 == null) {
                this.field2040 = this.field2038 = var5;
            } else {
                this.field2040.field2031 = var5;
                this.field2040 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fu.b(Ljava/lang/String;II)Lfo;")
    public final class166 method3205(String arg0, int arg1) {
        return this.method3204(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fu.g(Ljava/lang/Runnable;II)Lfo;")
    public final class166 method3206(Runnable arg0, int arg1) {
        return this.method3204(2, arg1, 0, arg0);
    }
}
