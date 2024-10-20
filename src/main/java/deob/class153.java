package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eb")
public class class153 implements Runnable {

    @ObfuscatedName("eb.p")
    public class159 field1679 = null;

    @ObfuscatedName("eb.m")
    public class159 field1674 = null;

    @ObfuscatedName("eb.t")
    public Thread field1675;

    @ObfuscatedName("eb.s")
    public boolean field1677 = false;

    public class153() {
        Statics.field1673 = "Unknown";
        Statics.field1212 = "1.6";
        try {
            Statics.field1673 = System.getProperty("java.vendor");
            Statics.field1212 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1677 = false;
        this.field1675 = new Thread(this);
        this.field1675.setPriority(10);
        this.field1675.setDaemon(true);
        this.field1675.start();
    }

    @ObfuscatedName("eb.c(S)V")
    public final void method2772() {
        synchronized (this) {
            this.field1677 = true;
            this.notifyAll();
        }
        try {
            this.field1675.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class159 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1677) {
                        return;
                    }
                    if (this.field1679 != null) {
                        var2 = this.field1679;
                        this.field1679 = this.field1679.field1728;
                        if (this.field1679 == null) {
                            this.field1674 = null;
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
                int var5 = var2.field1727;
                if (var5 == 1) {
                    var2.field1730 = new Socket(InetAddress.getByName((String) var2.field1729), var2.field1723);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1729);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1723);
                    var2.field1730 = var6;
                } else if (var5 == 4) {
                    var2.field1730 = new DataInputStream(((URL) var2.field1729).openStream());
                }
                var2.field1726 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1726 = 2;
            }
        }
    }

    @ObfuscatedName("eb.b(IIILjava/lang/Object;I)Lfk;")
    public final class159 method2780(int arg0, int arg1, int arg2, Object arg3) {
        class159 var5 = new class159();
        var5.field1727 = arg0;
        var5.field1723 = arg1;
        var5.field1729 = arg3;
        synchronized (this) {
            if (this.field1674 == null) {
                this.field1674 = this.field1679 = var5;
            } else {
                this.field1674.field1728 = var5;
                this.field1674 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eb.p(Ljava/lang/String;II)Lfk;")
    public final class159 method2775(String arg0, int arg1) {
        return this.method2780(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eb.m(Ljava/lang/Runnable;II)Lfk;")
    public final class159 method2776(Runnable arg0, int arg1) {
        return this.method2780(2, arg1, 0, arg0);
    }
}
