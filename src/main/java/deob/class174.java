package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("gw")
public class class174 implements Runnable {

    @ObfuscatedName("gw.ak")
    public class183 field1825 = null;

    @ObfuscatedName("gw.ax")
    public class183 field1826 = null;

    @ObfuscatedName("gw.ao")
    public Thread field1827;

    @ObfuscatedName("gw.ah")
    public boolean field1831 = false;

    public class174() {
        Statics.field1828 = "Unknown";
        Statics.field1823 = "1.6";
        try {
            Statics.field1828 = System.getProperty("java.vendor");
            Statics.field1823 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1831 = false;
        this.field1827 = new Thread(this);
        this.field1827.setPriority(10);
        this.field1827.setDaemon(true);
        this.field1827.start();
    }

    @ObfuscatedName("gw.ac(B)V")
    public final void method3224() {
        synchronized (this) {
            this.field1831 = true;
            this.notifyAll();
        }
        try {
            this.field1827.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class183 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1831) {
                        return;
                    }
                    if (this.field1825 != null) {
                        var2 = this.field1825;
                        this.field1825 = this.field1825.field1884;
                        if (this.field1825 == null) {
                            this.field1826 = null;
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
                int var5 = var2.field1878;
                if (var5 == 1) {
                    var2.field1882 = new Socket(InetAddress.getByName((String) var2.field1885), var2.field1883);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1885);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1883);
                    var2.field1882 = var6;
                } else if (var5 == 4) {
                    var2.field1882 = new DataInputStream(((URL) var2.field1885).openStream());
                }
                var2.field1881 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1881 = 2;
            }
        }
    }

    @ObfuscatedName("gw.al(IIILjava/lang/Object;B)Lhi;")
    public final class183 method3219(int arg0, int arg1, int arg2, Object arg3) {
        class183 var5 = new class183();
        var5.field1878 = arg0;
        var5.field1883 = arg1;
        var5.field1885 = arg3;
        synchronized (this) {
            if (this.field1826 == null) {
                this.field1826 = this.field1825 = var5;
            } else {
                this.field1826.field1884 = var5;
                this.field1826 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("gw.ak(Ljava/lang/String;IS)Lhi;")
    public final class183 method3220(String arg0, int arg1) {
        return this.method3219(1, arg1, 0, arg0);
    }

    @ObfuscatedName("gw.ax(Ljava/lang/Runnable;II)Lhi;")
    public final class183 method3218(Runnable arg0, int arg1) {
        return this.method3219(2, arg1, 0, arg0);
    }
}
