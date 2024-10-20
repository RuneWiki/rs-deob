package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ex")
public class class153 implements Runnable {

    @ObfuscatedName("ex.s")
    public class159 field1685 = null;

    @ObfuscatedName("ex.e")
    public class159 field1688 = null;

    @ObfuscatedName("ex.r")
    public Thread field1686;

    @ObfuscatedName("ex.o")
    public boolean field1689 = false;

    public class153() {
        Statics.field1687 = "Unknown";
        Statics.field1571 = "1.6";
        try {
            Statics.field1687 = System.getProperty("java.vendor");
            Statics.field1571 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1689 = false;
        this.field1686 = new Thread(this);
        this.field1686.setPriority(10);
        this.field1686.setDaemon(true);
        this.field1686.start();
    }

    @ObfuscatedName("ex.c(B)V")
    public final void method2746() {
        synchronized (this) {
            this.field1689 = true;
            this.notifyAll();
        }
        try {
            this.field1686.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class159 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1689) {
                        return;
                    }
                    if (this.field1685 != null) {
                        var2 = this.field1685;
                        this.field1685 = this.field1685.field1736;
                        if (this.field1685 == null) {
                            this.field1688 = null;
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
                int var5 = var2.field1737;
                if (var5 == 1) {
                    var2.field1732 = new Socket(InetAddress.getByName((String) var2.field1739), var2.field1740);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1739);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1740);
                    var2.field1732 = var6;
                } else if (var5 == 4) {
                    var2.field1732 = new DataInputStream(((URL) var2.field1739).openStream());
                }
                var2.field1738 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1738 = 2;
            }
        }
    }

    @ObfuscatedName("ex.l(IIILjava/lang/Object;B)Lfw;")
    public final class159 method2747(int arg0, int arg1, int arg2, Object arg3) {
        class159 var5 = new class159();
        var5.field1737 = arg0;
        var5.field1740 = arg1;
        var5.field1739 = arg3;
        synchronized (this) {
            if (this.field1688 == null) {
                this.field1688 = this.field1685 = var5;
            } else {
                this.field1688.field1736 = var5;
                this.field1688 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ex.s(Ljava/lang/String;II)Lfw;")
    public final class159 method2748(String arg0, int arg1) {
        return this.method2747(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ex.e(Ljava/lang/Runnable;IS)Lfw;")
    public final class159 method2751(Runnable arg0, int arg1) {
        return this.method2747(2, arg1, 0, arg0);
    }
}
