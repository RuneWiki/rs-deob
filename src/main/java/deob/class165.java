package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fp")
public class class165 implements Runnable {

    @ObfuscatedName("fp.v")
    public class173 field1852 = null;

    @ObfuscatedName("fp.x")
    public class173 field1847 = null;

    @ObfuscatedName("fp.m")
    public Thread field1849;

    @ObfuscatedName("fp.q")
    public boolean field1851 = false;

    public class165() {
        Statics.field1848 = "Unknown";
        Statics.field1845 = "1.6";
        try {
            Statics.field1848 = System.getProperty("java.vendor");
            Statics.field1845 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1851 = false;
        this.field1849 = new Thread(this);
        this.field1849.setPriority(10);
        this.field1849.setDaemon(true);
        this.field1849.start();
    }

    @ObfuscatedName("fp.h(I)V")
    public final void method3116() {
        synchronized (this) {
            this.field1851 = true;
            this.notifyAll();
        }
        try {
            this.field1849.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class173 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1851) {
                        return;
                    }
                    if (this.field1852 != null) {
                        var2 = this.field1852;
                        this.field1852 = this.field1852.field1896;
                        if (this.field1852 == null) {
                            this.field1847 = null;
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
                int var5 = var2.field1892;
                if (var5 == 1) {
                    var2.field1899 = new Socket(InetAddress.getByName((String) var2.field1898), var2.field1897);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1898);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1897);
                    var2.field1899 = var6;
                } else if (var5 == 4) {
                    var2.field1899 = new DataInputStream(((URL) var2.field1898).openStream());
                }
                var2.field1895 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1895 = 2;
            }
        }
    }

    @ObfuscatedName("fp.e(IIILjava/lang/Object;B)Lfl;")
    public final class173 method3124(int arg0, int arg1, int arg2, Object arg3) {
        class173 var5 = new class173();
        var5.field1892 = arg0;
        var5.field1897 = arg1;
        var5.field1898 = arg3;
        synchronized (this) {
            if (this.field1847 == null) {
                this.field1847 = this.field1852 = var5;
            } else {
                this.field1847.field1896 = var5;
                this.field1847 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fp.v(Ljava/lang/String;IB)Lfl;")
    public final class173 method3119(String arg0, int arg1) {
        return this.method3124(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fp.x(Ljava/lang/Runnable;IS)Lfl;")
    public final class173 method3120(Runnable arg0, int arg1) {
        return this.method3124(2, arg1, 0, arg0);
    }
}
