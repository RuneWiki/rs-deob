package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("gz")
public class class177 implements Runnable {

    @ObfuscatedName("gz.aj")
    public class185 field1873 = null;

    @ObfuscatedName("gz.az")
    public class185 field1874 = null;

    @ObfuscatedName("gz.af")
    public Thread field1875;

    @ObfuscatedName("gz.aa")
    public boolean field1871 = false;

    public class177() {
        Statics.field1880 = "Unknown";
        Statics.field1872 = "1.6";
        try {
            Statics.field1880 = System.getProperty("java.vendor");
            Statics.field1872 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1871 = false;
        this.field1875 = new Thread(this);
        this.field1875.setPriority(10);
        this.field1875.setDaemon(true);
        this.field1875.start();
    }

    @ObfuscatedName("gz.ak(B)V")
    public final void method3325() {
        synchronized (this) {
            this.field1871 = true;
            this.notifyAll();
        }
        try {
            this.field1875.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class185 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1871) {
                        return;
                    }
                    if (this.field1873 != null) {
                        var2 = this.field1873;
                        this.field1873 = this.field1873.field1934;
                        if (this.field1873 == null) {
                            this.field1874 = null;
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
                int var5 = var2.field1936;
                if (var5 == 1) {
                    var2.field1929 = new Socket(InetAddress.getByName((String) var2.field1935), var2.field1933);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1935);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1933);
                    var2.field1929 = var6;
                } else if (var5 == 4) {
                    var2.field1929 = new DataInputStream(((URL) var2.field1935).openStream());
                }
                var2.field1932 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1932 = 2;
            }
        }
    }

    @ObfuscatedName("gz.al(IIILjava/lang/Object;B)Lhe;")
    public final class185 method3309(int arg0, int arg1, int arg2, Object arg3) {
        class185 var5 = new class185();
        var5.field1936 = arg0;
        var5.field1933 = arg1;
        var5.field1935 = arg3;
        synchronized (this) {
            if (this.field1874 == null) {
                this.field1874 = this.field1873 = var5;
            } else {
                this.field1874.field1934 = var5;
                this.field1874 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("gz.aj(Ljava/lang/String;II)Lhe;")
    public final class185 method3324(String arg0, int arg1) {
        return this.method3309(1, arg1, 0, arg0);
    }

    @ObfuscatedName("gz.az(Ljava/lang/Runnable;II)Lhe;")
    public final class185 method3313(Runnable arg0, int arg1) {
        return this.method3309(2, arg1, 0, arg0);
    }
}
