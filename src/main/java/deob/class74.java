package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("by")
public class class74 implements Runnable {

    @ObfuscatedName("by.m")
    public class43 field1328;

    @ObfuscatedName("by.j")
    public class79 field1326 = null;

    @ObfuscatedName("by.o")
    public class79 field1329 = null;

    @ObfuscatedName("by.l")
    public Thread field1330;

    @ObfuscatedName("by.g")
    public boolean field1333 = false;

    @ObfuscatedName("by.w")
    public EventQueue field1332;

    public class74() {
        Statics.field1338 = "Unknown";
        Statics.field1331 = "1.1";
        try {
            Statics.field1338 = System.getProperty("java.vendor");
            Statics.field1331 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1332 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1333 = false;
        this.field1330 = new Thread(this);
        this.field1330.setPriority(10);
        this.field1330.setDaemon(true);
        this.field1330.start();
    }

    @ObfuscatedName("by.m(I)V")
    public final void method1506() {
        synchronized (this) {
            this.field1333 = true;
            this.notifyAll();
        }
        try {
            this.field1330.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1333) {
                        return;
                    }
                    if (this.field1326 != null) {
                        var2 = this.field1326;
                        this.field1326 = this.field1326.field1409;
                        if (this.field1326 == null) {
                            this.field1329 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var5 = var2.field1411;
                if (var5 == 1) {
                    var2.field1410 = new Socket(InetAddress.getByName((String) var2.field1414), var2.field1413);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1414);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1413);
                    var2.field1410 = var6;
                } else if (var5 == 4) {
                    var2.field1410 = new DataInputStream(((URL) var2.field1414).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1413 >> 24 & 0xFF) + "." + (var2.field1413 >> 16 & 0xFF) + "." + (var2.field1413 >> 8 & 0xFF) + "." + (var2.field1413 & 0xFF);
                    var2.field1410 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1415 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1415 = 2;
            }
        }
    }

    @ObfuscatedName("by.j(IIILjava/lang/Object;I)Lca;")
    public final class79 method1507(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1411 = arg0;
        var5.field1413 = arg1;
        var5.field1414 = arg3;
        synchronized (this) {
            if (this.field1329 == null) {
                this.field1329 = this.field1326 = var5;
            } else {
                this.field1329.field1409 = var5;
                this.field1329 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("by.o(Ljava/lang/String;IB)Lca;")
    public final class79 method1508(String arg0, int arg1) {
        return this.method1507(1, arg1, 0, arg0);
    }

    @ObfuscatedName("by.l(Ljava/lang/Runnable;II)Lca;")
    public final class79 method1525(Runnable arg0, int arg1) {
        return this.method1507(2, arg1, 0, arg0);
    }

    @ObfuscatedName("by.g(II)Lca;")
    public final class79 method1524(int arg0) {
        return this.method1507(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("by.w(Ljava/net/URL;I)Lca;")
    public final class79 method1505(URL arg0) {
        return this.method1507(4, 0, 0, arg0);
    }

    @ObfuscatedName("by.c(I)Lax;")
    public final class43 method1512() {
        return this.field1328;
    }
}
