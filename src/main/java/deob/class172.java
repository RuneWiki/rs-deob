package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("gv")
public class class172 implements Runnable {

    @ObfuscatedName("gv.ar")
    public class181 field1822 = null;

    @ObfuscatedName("gv.am")
    public class181 field1820 = null;

    @ObfuscatedName("gv.as")
    public Thread field1824;

    @ObfuscatedName("gv.aj")
    public boolean field1825 = false;

    public class172() {
        Statics.field1826 = "Unknown";
        Statics.field1823 = "1.6";
        try {
            Statics.field1826 = System.getProperty("java.vendor");
            Statics.field1823 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1825 = false;
        this.field1824 = new Thread(this);
        this.field1824.setPriority(10);
        this.field1824.setDaemon(true);
        this.field1824.start();
    }

    @ObfuscatedName("gv.aw(I)V")
    public final void method3203() {
        synchronized (this) {
            this.field1825 = true;
            this.notifyAll();
        }
        try {
            this.field1824.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class181 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1825) {
                        return;
                    }
                    if (this.field1822 != null) {
                        var2 = this.field1822;
                        this.field1822 = this.field1822.field1879;
                        if (this.field1822 == null) {
                            this.field1820 = null;
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
                    var2.field1881 = new Socket(InetAddress.getByName((String) var2.field1880), var2.field1877);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1880);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1877);
                    var2.field1881 = var6;
                } else if (var5 == 4) {
                    var2.field1881 = new DataInputStream(((URL) var2.field1880).openStream());
                }
                var2.field1876 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1876 = 2;
            }
        }
    }

    @ObfuscatedName("gv.ay(IIILjava/lang/Object;I)Lgu;")
    public final class181 method3210(int arg0, int arg1, int arg2, Object arg3) {
        class181 var5 = new class181();
        var5.field1878 = arg0;
        var5.field1877 = arg1;
        var5.field1880 = arg3;
        synchronized (this) {
            if (this.field1820 == null) {
                this.field1820 = this.field1822 = var5;
            } else {
                this.field1820.field1879 = var5;
                this.field1820 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("gv.ar(Ljava/lang/String;II)Lgu;")
    public final class181 method3209(String arg0, int arg1) {
        return this.method3210(1, arg1, 0, arg0);
    }

    @ObfuscatedName("gv.am(Ljava/lang/Runnable;II)Lgu;")
    public final class181 method3205(Runnable arg0, int arg1) {
        return this.method3210(2, arg1, 0, arg0);
    }
}
