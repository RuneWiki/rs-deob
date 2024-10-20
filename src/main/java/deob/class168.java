package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fz")
public class class168 implements Runnable {

    @ObfuscatedName("fz.q")
    public class167 field2039 = null;

    @ObfuscatedName("fz.w")
    public class167 field2034 = null;

    @ObfuscatedName("fz.o")
    public Thread field2035;

    @ObfuscatedName("fz.u")
    public boolean field2036 = false;

    public class168() {
        Statics.field2031 = "Unknown";
        Statics.field2032 = "1.6";
        try {
            Statics.field2031 = System.getProperty("java.vendor");
            Statics.field2032 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2036 = false;
        this.field2035 = new Thread(this);
        this.field2035.setPriority(10);
        this.field2035.setDaemon(true);
        this.field2035.start();
    }

    @ObfuscatedName("fz.m(I)V")
    public final void method3154() {
        synchronized (this) {
            this.field2036 = true;
            this.notifyAll();
        }
        try {
            this.field2035.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class167 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2036) {
                        return;
                    }
                    if (this.field2039 != null) {
                        var2 = this.field2039;
                        this.field2039 = this.field2039.field2022;
                        if (this.field2039 == null) {
                            this.field2034 = null;
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
                int var5 = var2.field2028;
                if (var5 == 1) {
                    var2.field2030 = new Socket(InetAddress.getByName((String) var2.field2029), var2.field2024);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2029);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2024);
                    var2.field2030 = var6;
                } else if (var5 == 4) {
                    var2.field2030 = new DataInputStream(((URL) var2.field2029).openStream());
                }
                var2.field2026 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2026 = 2;
            }
        }
    }

    @ObfuscatedName("fz.f(IIILjava/lang/Object;I)Lfm;")
    public final class167 method3145(int arg0, int arg1, int arg2, Object arg3) {
        class167 var5 = new class167();
        var5.field2028 = arg0;
        var5.field2024 = arg1;
        var5.field2029 = arg3;
        synchronized (this) {
            if (this.field2034 == null) {
                this.field2034 = this.field2039 = var5;
            } else {
                this.field2034.field2022 = var5;
                this.field2034 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fz.q(Ljava/lang/String;II)Lfm;")
    public final class167 method3146(String arg0, int arg1) {
        return this.method3145(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fz.w(Ljava/lang/Runnable;II)Lfm;")
    public final class167 method3147(Runnable arg0, int arg1) {
        return this.method3145(2, arg1, 0, arg0);
    }
}
