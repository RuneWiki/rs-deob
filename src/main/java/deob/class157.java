package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fs")
public class class157 implements Runnable {

    @ObfuscatedName("fs.l")
    public class166 field1758 = null;

    @ObfuscatedName("fs.k")
    public class166 field1756 = null;

    @ObfuscatedName("fs.a")
    public Thread field1760;

    @ObfuscatedName("fs.m")
    public boolean field1757 = false;

    public class157() {
        Statics.field1759 = "Unknown";
        Statics.field1761 = "1.6";
        try {
            Statics.field1759 = System.getProperty("java.vendor");
            Statics.field1761 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1757 = false;
        this.field1760 = new Thread(this);
        this.field1760.setPriority(10);
        this.field1760.setDaemon(true);
        this.field1760.start();
    }

    @ObfuscatedName("fs.o(I)V")
    public final void method2867() {
        synchronized (this) {
            this.field1757 = true;
            this.notifyAll();
        }
        try {
            this.field1760.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1757) {
                        return;
                    }
                    if (this.field1758 != null) {
                        var2 = this.field1758;
                        this.field1758 = this.field1758.field1829;
                        if (this.field1758 == null) {
                            this.field1756 = null;
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
                int var5 = var2.field1827;
                if (var5 == 1) {
                    var2.field1830 = new Socket(InetAddress.getByName((String) var2.field1822), var2.field1828);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1822);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1828);
                    var2.field1830 = var6;
                } else if (var5 == 4) {
                    var2.field1830 = new DataInputStream(((URL) var2.field1822).openStream());
                }
                var2.field1826 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1826 = 2;
            }
        }
    }

    @ObfuscatedName("fs.q(IIILjava/lang/Object;I)Lfl;")
    public final class166 method2868(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field1827 = arg0;
        var5.field1828 = arg1;
        var5.field1822 = arg3;
        synchronized (this) {
            if (this.field1756 == null) {
                this.field1756 = this.field1758 = var5;
            } else {
                this.field1756.field1829 = var5;
                this.field1756 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fs.l(Ljava/lang/String;II)Lfl;")
    public final class166 method2869(String arg0, int arg1) {
        return this.method2868(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fs.k(Ljava/lang/Runnable;II)Lfl;")
    public final class166 method2882(Runnable arg0, int arg1) {
        return this.method2868(2, arg1, 0, arg0);
    }
}
