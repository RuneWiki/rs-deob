package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("gd")
public class class174 implements Runnable {

    @ObfuscatedName("gd.af")
    public class182 field1865 = null;

    @ObfuscatedName("gd.at")
    public class182 field1866 = null;

    @ObfuscatedName("gd.an")
    public Thread field1871;

    @ObfuscatedName("gd.ao")
    public boolean field1868 = false;

    public class174() {
        Statics.field1872 = "Unknown";
        Statics.field1867 = "1.6";
        try {
            Statics.field1872 = System.getProperty("java.vendor");
            Statics.field1867 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1868 = false;
        this.field1871 = new Thread(this);
        this.field1871.setPriority(10);
        this.field1871.setDaemon(true);
        this.field1871.start();
    }

    @ObfuscatedName("gd.az(I)V")
    public final void method3209() {
        synchronized (this) {
            this.field1868 = true;
            this.notifyAll();
        }
        try {
            this.field1871.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class182 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1868) {
                        return;
                    }
                    if (this.field1865 != null) {
                        var2 = this.field1865;
                        this.field1865 = this.field1865.field1922;
                        if (this.field1865 == null) {
                            this.field1866 = null;
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
                int var5 = var2.field1925;
                if (var5 == 1) {
                    var2.field1927 = new Socket(InetAddress.getByName((String) var2.field1926), var2.field1920);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1926);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1920);
                    var2.field1927 = var6;
                } else if (var5 == 4) {
                    var2.field1927 = new DataInputStream(((URL) var2.field1926).openStream());
                }
                var2.field1923 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1923 = 2;
            }
        }
    }

    @ObfuscatedName("gd.ah(IIILjava/lang/Object;I)Lgu;")
    public final class182 method3206(int arg0, int arg1, int arg2, Object arg3) {
        class182 var5 = new class182();
        var5.field1925 = arg0;
        var5.field1920 = arg1;
        var5.field1926 = arg3;
        synchronized (this) {
            if (this.field1866 == null) {
                this.field1866 = this.field1865 = var5;
            } else {
                this.field1866.field1922 = var5;
                this.field1866 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("gd.af(Ljava/lang/String;IB)Lgu;")
    public final class182 method3205(String arg0, int arg1) {
        return this.method3206(1, arg1, 0, arg0);
    }

    @ObfuscatedName("gd.at(Ljava/lang/Runnable;II)Lgu;")
    public final class182 method3208(Runnable arg0, int arg1) {
        return this.method3206(2, arg1, 0, arg0);
    }
}
