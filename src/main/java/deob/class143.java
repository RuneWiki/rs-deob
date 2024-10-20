package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ei")
public class class143 implements Runnable {

    @ObfuscatedName("ei.m")
    public class149 field1543 = null;

    @ObfuscatedName("ei.k")
    public class149 field1541 = null;

    @ObfuscatedName("ei.o")
    public Thread field1544;

    @ObfuscatedName("ei.g")
    public boolean field1545 = false;

    public class143() {
        Statics.field1546 = "Unknown";
        Statics.field1542 = "1.6";
        try {
            Statics.field1546 = System.getProperty("java.vendor");
            Statics.field1542 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1545 = false;
        this.field1544 = new Thread(this);
        this.field1544.setPriority(10);
        this.field1544.setDaemon(true);
        this.field1544.start();
    }

    @ObfuscatedName("ei.n(B)V")
    public final void method2515() {
        synchronized (this) {
            this.field1545 = true;
            this.notifyAll();
        }
        try {
            this.field1544.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class149 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1545) {
                        return;
                    }
                    if (this.field1543 != null) {
                        var2 = this.field1543;
                        this.field1543 = this.field1543.field1593;
                        if (this.field1543 == null) {
                            this.field1541 = null;
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
                int var5 = var2.field1587;
                if (var5 == 1) {
                    var2.field1595 = new Socket(InetAddress.getByName((String) var2.field1594), var2.field1592);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1594);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1592);
                    var2.field1595 = var6;
                } else if (var5 == 4) {
                    var2.field1595 = new DataInputStream(((URL) var2.field1594).openStream());
                }
                var2.field1591 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1591 = 2;
            }
        }
    }

    @ObfuscatedName("ei.c(IIILjava/lang/Object;I)Led;")
    public final class149 method2512(int arg0, int arg1, int arg2, Object arg3) {
        class149 var5 = new class149();
        var5.field1587 = arg0;
        var5.field1592 = arg1;
        var5.field1594 = arg3;
        synchronized (this) {
            if (this.field1541 == null) {
                this.field1541 = this.field1543 = var5;
            } else {
                this.field1541.field1593 = var5;
                this.field1541 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ei.m(Ljava/lang/String;II)Led;")
    public final class149 method2521(String arg0, int arg1) {
        return this.method2512(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ei.k(Ljava/lang/Runnable;II)Led;")
    public final class149 method2514(Runnable arg0, int arg1) {
        return this.method2512(2, arg1, 0, arg0);
    }
}
