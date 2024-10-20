package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fr")
public class class157 implements Runnable {

    @ObfuscatedName("fr.q")
    public class165 field1741 = null;

    @ObfuscatedName("fr.f")
    public class165 field1743 = null;

    @ObfuscatedName("fr.j")
    public Thread field1744;

    @ObfuscatedName("fr.e")
    public boolean field1745 = false;

    public class157() {
        Statics.field4267 = "Unknown";
        Statics.field1752 = "1.6";
        try {
            Statics.field4267 = System.getProperty("java.vendor");
            Statics.field1752 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1745 = false;
        this.field1744 = new Thread(this);
        this.field1744.setPriority(10);
        this.field1744.setDaemon(true);
        this.field1744.start();
    }

    @ObfuscatedName("fr.c(B)V")
    public final void method2946() {
        synchronized (this) {
            this.field1745 = true;
            this.notifyAll();
        }
        try {
            this.field1744.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class165 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1745) {
                        return;
                    }
                    if (this.field1741 != null) {
                        var2 = this.field1741;
                        this.field1741 = this.field1741.field1800;
                        if (this.field1741 == null) {
                            this.field1743 = null;
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
                int var5 = var2.field1799;
                if (var5 == 1) {
                    var2.field1803 = new Socket(InetAddress.getByName((String) var2.field1802), var2.field1801);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1802);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1801);
                    var2.field1803 = var6;
                } else if (var5 == 4) {
                    var2.field1803 = new DataInputStream(((URL) var2.field1802).openStream());
                }
                var2.field1796 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1796 = 2;
            }
        }
    }

    @ObfuscatedName("fr.v(IIILjava/lang/Object;B)Lfm;")
    public final class165 method2953(int arg0, int arg1, int arg2, Object arg3) {
        class165 var5 = new class165();
        var5.field1799 = arg0;
        var5.field1801 = arg1;
        var5.field1802 = arg3;
        synchronized (this) {
            if (this.field1743 == null) {
                this.field1743 = this.field1741 = var5;
            } else {
                this.field1743.field1800 = var5;
                this.field1743 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fr.q(Ljava/lang/String;IB)Lfm;")
    public final class165 method2948(String arg0, int arg1) {
        return this.method2953(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fr.f(Ljava/lang/Runnable;II)Lfm;")
    public final class165 method2949(Runnable arg0, int arg1) {
        return this.method2953(2, arg1, 0, arg0);
    }
}
