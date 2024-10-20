package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("gh")
public class class172 implements Runnable {

    @ObfuscatedName("gh.ao")
    public class181 field1849 = null;

    @ObfuscatedName("gh.at")
    public class181 field1850 = null;

    @ObfuscatedName("gh.ac")
    public Thread field1851;

    @ObfuscatedName("gh.ai")
    public boolean field1852 = false;

    public class172() {
        Statics.field1854 = "Unknown";
        Statics.field1370 = "1.6";
        try {
            Statics.field1854 = System.getProperty("java.vendor");
            Statics.field1370 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1852 = false;
        this.field1851 = new Thread(this);
        this.field1851.setPriority(10);
        this.field1851.setDaemon(true);
        this.field1851.start();
    }

    @ObfuscatedName("gh.au(I)V")
    public final void method3208() {
        synchronized (this) {
            this.field1852 = true;
            this.notifyAll();
        }
        try {
            this.field1851.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class181 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1852) {
                        return;
                    }
                    if (this.field1849 != null) {
                        var2 = this.field1849;
                        this.field1849 = this.field1849.field1908;
                        if (this.field1849 == null) {
                            this.field1850 = null;
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
                int var5 = var2.field1907;
                if (var5 == 1) {
                    var2.field1906 = new Socket(InetAddress.getByName((String) var2.field1909), var2.field1910);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1909);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1910);
                    var2.field1906 = var6;
                } else if (var5 == 4) {
                    var2.field1906 = new DataInputStream(((URL) var2.field1909).openStream());
                }
                var2.field1905 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1905 = 2;
            }
        }
    }

    @ObfuscatedName("gh.ae(IIILjava/lang/Object;B)Lgz;")
    public final class181 method3206(int arg0, int arg1, int arg2, Object arg3) {
        class181 var5 = new class181();
        var5.field1907 = arg0;
        var5.field1910 = arg1;
        var5.field1909 = arg3;
        synchronized (this) {
            if (this.field1850 == null) {
                this.field1850 = this.field1849 = var5;
            } else {
                this.field1850.field1908 = var5;
                this.field1850 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("gh.ao(Ljava/lang/String;II)Lgz;")
    public final class181 method3204(String arg0, int arg1) {
        return this.method3206(1, arg1, 0, arg0);
    }

    @ObfuscatedName("gh.at(Ljava/lang/Runnable;II)Lgz;")
    public final class181 method3205(Runnable arg0, int arg1) {
        return this.method3206(2, arg1, 0, arg0);
    }
}
