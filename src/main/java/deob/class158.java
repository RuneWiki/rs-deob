package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fr")
public class class158 implements Runnable {

    @ObfuscatedName("fr.f")
    public class166 field1755 = null;

    @ObfuscatedName("fr.n")
    public class166 field1756 = null;

    @ObfuscatedName("fr.k")
    public Thread field1757;

    @ObfuscatedName("fr.w")
    public boolean field1758 = false;

    public class158() {
        Statics.field1760 = "Unknown";
        Statics.field1753 = "1.6";
        try {
            Statics.field1760 = System.getProperty("java.vendor");
            Statics.field1753 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1758 = false;
        this.field1757 = new Thread(this);
        this.field1757.setPriority(10);
        this.field1757.setDaemon(true);
        this.field1757.start();
    }

    @ObfuscatedName("fr.c(I)V")
    public final void method3089() {
        synchronized (this) {
            this.field1758 = true;
            this.notifyAll();
        }
        try {
            this.field1757.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1758) {
                        return;
                    }
                    if (this.field1755 != null) {
                        var2 = this.field1755;
                        this.field1755 = this.field1755.field1813;
                        if (this.field1755 == null) {
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
                int var5 = var2.field1812;
                if (var5 == 1) {
                    var2.field1816 = new Socket(InetAddress.getByName((String) var2.field1819), var2.field1818);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1819);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1818);
                    var2.field1816 = var6;
                } else if (var5 == 4) {
                    var2.field1816 = new DataInputStream(((URL) var2.field1819).openStream());
                }
                var2.field1815 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1815 = 2;
            }
        }
    }

    @ObfuscatedName("fr.p(IIILjava/lang/Object;I)Lfk;")
    public final class166 method3104(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field1812 = arg0;
        var5.field1818 = arg1;
        var5.field1819 = arg3;
        synchronized (this) {
            if (this.field1756 == null) {
                this.field1756 = this.field1755 = var5;
            } else {
                this.field1756.field1813 = var5;
                this.field1756 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fr.f(Ljava/lang/String;IB)Lfk;")
    public final class166 method3092(String arg0, int arg1) {
        return this.method3104(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fr.n(Ljava/lang/Runnable;II)Lfk;")
    public final class166 method3093(Runnable arg0, int arg1) {
        return this.method3104(2, arg1, 0, arg0);
    }
}
