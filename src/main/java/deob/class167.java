package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fs")
public class class167 implements Runnable {

    @ObfuscatedName("fs.e")
    public class166 field2028 = null;

    @ObfuscatedName("fs.p")
    public class166 field2031 = null;

    @ObfuscatedName("fs.k")
    public Thread field2032;

    @ObfuscatedName("fs.l")
    public boolean field2033 = false;

    public class167() {
        Statics.field2030 = "Unknown";
        Statics.field2029 = "1.6";
        try {
            Statics.field2030 = System.getProperty("java.vendor");
            Statics.field2029 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2033 = false;
        this.field2032 = new Thread(this);
        this.field2032.setPriority(10);
        this.field2032.setDaemon(true);
        this.field2032.start();
    }

    @ObfuscatedName("fs.q(I)V")
    public final void method3167() {
        synchronized (this) {
            this.field2033 = true;
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
                    if (this.field2033) {
                        return;
                    }
                    if (this.field2028 != null) {
                        var2 = this.field2028;
                        this.field2028 = this.field2028.field2021;
                        if (this.field2028 == null) {
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
                    var2.field2026 = new Socket(InetAddress.getByName((String) var2.field2019), var2.field2025);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2019);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2025);
                    var2.field2026 = var6;
                } else if (var5 == 4) {
                    var2.field2026 = new DataInputStream(((URL) var2.field2019).openStream());
                }
                var2.field2023 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2023 = 2;
            }
        }
    }

    @ObfuscatedName("fs.w(IIILjava/lang/Object;B)Lfa;")
    public final class166 method3169(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2024 = arg0;
        var5.field2025 = arg1;
        var5.field2019 = arg3;
        synchronized (this) {
            if (this.field2031 == null) {
                this.field2031 = this.field2028 = var5;
            } else {
                this.field2031.field2021 = var5;
                this.field2031 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fs.e(Ljava/lang/String;II)Lfa;")
    public final class166 method3176(String arg0, int arg1) {
        return this.method3169(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fs.p(Ljava/lang/Runnable;II)Lfa;")
    public final class166 method3170(Runnable arg0, int arg1) {
        return this.method3169(2, arg1, 0, arg0);
    }
}
