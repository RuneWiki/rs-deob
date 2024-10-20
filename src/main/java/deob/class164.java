package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fp")
public class class164 implements Runnable {

    @ObfuscatedName("fp.c")
    public class172 field1786 = null;

    @ObfuscatedName("fp.x")
    public class172 field1784 = null;

    @ObfuscatedName("fp.h")
    public Thread field1785;

    @ObfuscatedName("fp.j")
    public boolean field1787 = false;

    public class164() {
        Statics.field1789 = "Unknown";
        Statics.field1782 = "1.6";
        try {
            Statics.field1789 = System.getProperty("java.vendor");
            Statics.field1782 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1787 = false;
        this.field1785 = new Thread(this);
        this.field1785.setPriority(10);
        this.field1785.setDaemon(true);
        this.field1785.start();
    }

    @ObfuscatedName("fp.a(B)V")
    public final void method3054() {
        synchronized (this) {
            this.field1787 = true;
            this.notifyAll();
        }
        try {
            this.field1785.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class172 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1787) {
                        return;
                    }
                    if (this.field1786 != null) {
                        var2 = this.field1786;
                        this.field1786 = this.field1786.field1844;
                        if (this.field1786 == null) {
                            this.field1784 = null;
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
                int var5 = var2.field1846;
                if (var5 == 1) {
                    var2.field1840 = new Socket(InetAddress.getByName((String) var2.field1845), var2.field1839);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1845);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1839);
                    var2.field1840 = var6;
                } else if (var5 == 4) {
                    var2.field1840 = new DataInputStream(((URL) var2.field1845).openStream());
                }
                var2.field1842 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1842 = 2;
            }
        }
    }

    @ObfuscatedName("fp.f(IIILjava/lang/Object;I)Lfy;")
    public final class172 method3055(int arg0, int arg1, int arg2, Object arg3) {
        class172 var5 = new class172();
        var5.field1846 = arg0;
        var5.field1839 = arg1;
        var5.field1845 = arg3;
        synchronized (this) {
            if (this.field1784 == null) {
                this.field1784 = this.field1786 = var5;
            } else {
                this.field1784.field1844 = var5;
                this.field1784 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fp.c(Ljava/lang/String;IB)Lfy;")
    public final class172 method3056(String arg0, int arg1) {
        return this.method3055(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fp.x(Ljava/lang/Runnable;II)Lfy;")
    public final class172 method3064(Runnable arg0, int arg1) {
        return this.method3055(2, arg1, 0, arg0);
    }
}
