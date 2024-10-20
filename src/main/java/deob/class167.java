package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ff")
public class class167 implements Runnable {

    @ObfuscatedName("ff.o")
    public class166 field2030 = null;

    @ObfuscatedName("ff.e")
    public class166 field2031 = null;

    @ObfuscatedName("ff.i")
    public Thread field2032;

    @ObfuscatedName("ff.g")
    public boolean field2034 = false;

    public class167() {
        Statics.field2029 = "Unknown";
        Statics.field2556 = "1.6";
        try {
            Statics.field2029 = System.getProperty("java.vendor");
            Statics.field2556 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2034 = false;
        this.field2032 = new Thread(this);
        this.field2032.setPriority(10);
        this.field2032.setDaemon(true);
        this.field2032.start();
    }

    @ObfuscatedName("ff.c(B)V")
    public final void method3230() {
        synchronized (this) {
            this.field2034 = true;
            this.notifyAll();
        }
        try {
            this.field2032.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2034) {
                        return;
                    }
                    if (this.field2030 != null) {
                        var2 = this.field2030;
                        this.field2030 = this.field2030.field2023;
                        if (this.field2030 == null) {
                            this.field2031 = null;
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
                int var5 = var2.field2024;
                if (var5 == 1) {
                    var2.field2028 = new Socket(InetAddress.getByName((String) var2.field2027), var2.field2020);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2027);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2020);
                    var2.field2028 = var6;
                } else if (var5 == 4) {
                    var2.field2028 = new DataInputStream(((URL) var2.field2027).openStream());
                }
                var2.field2026 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2026 = 2;
            }
        }
    }

    @ObfuscatedName("ff.t(IIILjava/lang/Object;S)Lfw;")
    public final class166 method3232(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2024 = arg0;
        var5.field2020 = arg1;
        var5.field2027 = arg3;
        synchronized (this) {
            if (this.field2031 == null) {
                this.field2031 = this.field2030 = var5;
            } else {
                this.field2031.field2023 = var5;
                this.field2031 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ff.o(Ljava/lang/String;II)Lfw;")
    public final class166 method3240(String arg0, int arg1) {
        return this.method3232(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ff.e(Ljava/lang/Runnable;II)Lfw;")
    public final class166 method3238(Runnable arg0, int arg1) {
        return this.method3232(2, arg1, 0, arg0);
    }
}
