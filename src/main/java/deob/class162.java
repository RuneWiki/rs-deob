package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fi")
public class class162 implements Runnable {

    @ObfuscatedName("fi.l")
    public class161 field2036 = null;

    @ObfuscatedName("fi.g")
    public class161 field2037 = null;

    @ObfuscatedName("fi.b")
    public Thread field2034;

    @ObfuscatedName("fi.a")
    public boolean field2039 = false;

    public class162() {
        Statics.field2038 = "Unknown";
        Statics.field2035 = "1.6";
        try {
            Statics.field2038 = System.getProperty("java.vendor");
            Statics.field2035 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2039 = false;
        this.field2034 = new Thread(this);
        this.field2034.setPriority(10);
        this.field2034.setDaemon(true);
        this.field2034.start();
    }

    @ObfuscatedName("fi.n(B)V")
    public final void method3249() {
        synchronized (this) {
            this.field2039 = true;
            this.notifyAll();
        }
        try {
            this.field2034.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class161 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2039) {
                        return;
                    }
                    if (this.field2036 != null) {
                        var2 = this.field2036;
                        this.field2036 = this.field2036.field2029;
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
                int var5 = var2.field2030;
                if (var5 == 1) {
                    var2.field2033 = new Socket(InetAddress.getByName((String) var2.field2031), var2.field2032);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2031);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2032);
                    var2.field2033 = var6;
                } else if (var5 == 4) {
                    var2.field2033 = new DataInputStream(((URL) var2.field2031).openStream());
                }
                var2.field2026 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2026 = 2;
            }
        }
    }

    @ObfuscatedName("fi.h(IIILjava/lang/Object;I)Lfe;")
    public final class161 method3250(int arg0, int arg1, int arg2, Object arg3) {
        class161 var5 = new class161();
        var5.field2030 = arg0;
        var5.field2032 = arg1;
        var5.field2031 = arg3;
        synchronized (this) {
            if (this.field2037 == null) {
                this.field2037 = this.field2036 = var5;
            } else {
                this.field2037.field2029 = var5;
                this.field2037 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fi.l(Ljava/lang/String;II)Lfe;")
    public final class161 method3251(String arg0, int arg1) {
        return this.method3250(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fi.g(Ljava/lang/Runnable;II)Lfe;")
    public final class161 method3254(Runnable arg0, int arg1) {
        return this.method3250(2, arg1, 0, arg0);
    }
}
