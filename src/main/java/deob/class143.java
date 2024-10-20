package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ew")
public class class143 implements Runnable {

    @ObfuscatedName("ew.f")
    public class149 field1548 = null;

    @ObfuscatedName("ew.j")
    public class149 field1552 = null;

    @ObfuscatedName("ew.m")
    public Thread field1550;

    @ObfuscatedName("ew.k")
    public boolean field1549 = false;

    public class143() {
        Statics.field1555 = "Unknown";
        Statics.field1547 = "1.6";
        try {
            Statics.field1555 = System.getProperty("java.vendor");
            Statics.field1547 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1549 = false;
        this.field1550 = new Thread(this);
        this.field1550.setPriority(10);
        this.field1550.setDaemon(true);
        this.field1550.start();
    }

    @ObfuscatedName("ew.l(I)V")
    public final void method2550() {
        synchronized (this) {
            this.field1549 = true;
            this.notifyAll();
        }
        try {
            this.field1550.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class149 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1549) {
                        return;
                    }
                    if (this.field1548 != null) {
                        var2 = this.field1548;
                        this.field1548 = this.field1548.field1598;
                        if (this.field1548 == null) {
                            this.field1552 = null;
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
                int var5 = var2.field1600;
                if (var5 == 1) {
                    var2.field1603 = new Socket(InetAddress.getByName((String) var2.field1601), var2.field1602);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1601);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1602);
                    var2.field1603 = var6;
                } else if (var5 == 4) {
                    var2.field1603 = new DataInputStream(((URL) var2.field1601).openStream());
                }
                var2.field1595 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1595 = 2;
            }
        }
    }

    @ObfuscatedName("ew.q(IIILjava/lang/Object;S)Lep;")
    public final class149 method2551(int arg0, int arg1, int arg2, Object arg3) {
        class149 var5 = new class149();
        var5.field1600 = arg0;
        var5.field1602 = arg1;
        var5.field1601 = arg3;
        synchronized (this) {
            if (this.field1552 == null) {
                this.field1552 = this.field1548 = var5;
            } else {
                this.field1552.field1598 = var5;
                this.field1552 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ew.f(Ljava/lang/String;II)Lep;")
    public final class149 method2552(String arg0, int arg1) {
        return this.method2551(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ew.j(Ljava/lang/Runnable;II)Lep;")
    public final class149 method2553(Runnable arg0, int arg1) {
        return this.method2551(2, arg1, 0, arg0);
    }
}
