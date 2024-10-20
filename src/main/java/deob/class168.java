package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("gd")
public class class168 implements Runnable {

    @ObfuscatedName("gd.aw")
    public class177 field1819 = null;

    @ObfuscatedName("gd.ac")
    public class177 field1821 = null;

    @ObfuscatedName("gd.au")
    public Thread field1822;

    @ObfuscatedName("gd.ab")
    public boolean field1820 = false;

    public class168() {
        Statics.field1817 = "Unknown";
        Statics.field1818 = "1.6";
        try {
            Statics.field1817 = System.getProperty("java.vendor");
            Statics.field1818 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1820 = false;
        this.field1822 = new Thread(this);
        this.field1822.setPriority(10);
        this.field1822.setDaemon(true);
        this.field1822.start();
    }

    @ObfuscatedName("gd.af(I)V")
    public final void method3271() {
        synchronized (this) {
            this.field1820 = true;
            this.notifyAll();
        }
        try {
            this.field1822.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class177 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1820) {
                        return;
                    }
                    if (this.field1819 != null) {
                        var2 = this.field1819;
                        this.field1819 = this.field1819.field1882;
                        if (this.field1819 == null) {
                            this.field1821 = null;
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
                int var5 = var2.field1885;
                if (var5 == 1) {
                    var2.field1888 = new Socket(InetAddress.getByName((String) var2.field1887), var2.field1881);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1887);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1881);
                    var2.field1888 = var6;
                } else if (var5 == 4) {
                    var2.field1888 = new DataInputStream(((URL) var2.field1887).openStream());
                }
                var2.field1884 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1884 = 2;
            }
        }
    }

    @ObfuscatedName("gd.an(IIILjava/lang/Object;I)Lgp;")
    public final class177 method3276(int arg0, int arg1, int arg2, Object arg3) {
        class177 var5 = new class177();
        var5.field1885 = arg0;
        var5.field1881 = arg1;
        var5.field1887 = arg3;
        synchronized (this) {
            if (this.field1821 == null) {
                this.field1821 = this.field1819 = var5;
            } else {
                this.field1821.field1882 = var5;
                this.field1821 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("gd.aw(Ljava/lang/String;II)Lgp;")
    public final class177 method3273(String arg0, int arg1) {
        return this.method3276(1, arg1, 0, arg0);
    }

    @ObfuscatedName("gd.ac(Ljava/lang/Runnable;IB)Lgp;")
    public final class177 method3274(Runnable arg0, int arg1) {
        return this.method3276(2, arg1, 0, arg0);
    }
}
