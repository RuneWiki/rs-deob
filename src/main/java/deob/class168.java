package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fg")
public class class168 implements Runnable {

    @ObfuscatedName("fg.v")
    public class177 field1841 = null;

    @ObfuscatedName("fg.s")
    public class177 field1839 = null;

    @ObfuscatedName("fg.z")
    public Thread field1836;

    @ObfuscatedName("fg.j")
    public boolean field1842 = false;

    public class168() {
        Statics.field1838 = "Unknown";
        Statics.field1837 = "1.6";
        try {
            Statics.field1838 = System.getProperty("java.vendor");
            Statics.field1837 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1842 = false;
        this.field1836 = new Thread(this);
        this.field1836.setPriority(10);
        this.field1836.setDaemon(true);
        this.field1836.start();
    }

    @ObfuscatedName("fg.f(B)V")
    public final void method3217() {
        synchronized (this) {
            this.field1842 = true;
            this.notifyAll();
        }
        try {
            this.field1836.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class177 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1842) {
                        return;
                    }
                    if (this.field1841 != null) {
                        var2 = this.field1841;
                        this.field1841 = this.field1841.field1897;
                        if (this.field1841 == null) {
                            this.field1839 = null;
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
                int var5 = var2.field1896;
                if (var5 == 1) {
                    var2.field1901 = new Socket(InetAddress.getByName((String) var2.field1900), var2.field1899);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1900);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1899);
                    var2.field1901 = var6;
                } else if (var5 == 4) {
                    var2.field1901 = new DataInputStream(((URL) var2.field1900).openStream());
                }
                var2.field1898 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1898 = 2;
            }
        }
    }

    @ObfuscatedName("fg.w(IIILjava/lang/Object;B)Lff;")
    public final class177 method3218(int arg0, int arg1, int arg2, Object arg3) {
        class177 var5 = new class177();
        var5.field1896 = arg0;
        var5.field1899 = arg1;
        var5.field1900 = arg3;
        synchronized (this) {
            if (this.field1839 == null) {
                this.field1839 = this.field1841 = var5;
            } else {
                this.field1839.field1897 = var5;
                this.field1839 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fg.v(Ljava/lang/String;IB)Lff;")
    public final class177 method3219(String arg0, int arg1) {
        return this.method3218(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fg.s(Ljava/lang/Runnable;II)Lff;")
    public final class177 method3226(Runnable arg0, int arg1) {
        return this.method3218(2, arg1, 0, arg0);
    }
}
