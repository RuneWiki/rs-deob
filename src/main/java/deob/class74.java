package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("by")
public class class74 implements Runnable {

    @ObfuscatedName("by.a")
    public class43 field1329;

    @ObfuscatedName("by.t")
    public class79 field1328 = null;

    @ObfuscatedName("by.f")
    public class79 field1343 = null;

    @ObfuscatedName("by.c")
    public Thread field1331;

    @ObfuscatedName("by.p")
    public boolean field1330 = false;

    @ObfuscatedName("by.s")
    public EventQueue field1333;

    public class74() {
        Statics.field1332 = "Unknown";
        Statics.field2472 = "1.1";
        try {
            Statics.field1332 = System.getProperty("java.vendor");
            Statics.field2472 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1333 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1330 = false;
        this.field1331 = new Thread(this);
        this.field1331.setPriority(10);
        this.field1331.setDaemon(true);
        this.field1331.start();
    }

    @ObfuscatedName("by.a(I)V")
    public final void method1467() {
        synchronized (this) {
            this.field1330 = true;
            this.notifyAll();
        }
        try {
            this.field1331.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1330) {
                        return;
                    }
                    if (this.field1328 != null) {
                        var2 = this.field1328;
                        this.field1328 = this.field1328.field1409;
                        if (this.field1328 == null) {
                            this.field1343 = null;
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
                    var2.field1416 = new Socket(InetAddress.getByName((String) var2.field1415), var2.field1413);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1415);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1413);
                    var2.field1416 = var6;
                } else if (var5 == 4) {
                    var2.field1416 = new DataInputStream(((URL) var2.field1415).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1413 >> 24 & 0xFF) + "." + (var2.field1413 >> 16 & 0xFF) + "." + (var2.field1413 >> 8 & 0xFF) + "." + (var2.field1413 & 0xFF);
                    var2.field1416 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1412 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1412 = 2;
            }
        }
    }

    @ObfuscatedName("by.t(IIILjava/lang/Object;I)Lca;")
    public final class79 method1458(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1411 = arg0;
        var5.field1413 = arg1;
        var5.field1415 = arg3;
        synchronized (this) {
            if (this.field1343 == null) {
                this.field1343 = this.field1328 = var5;
            } else {
                this.field1343.field1409 = var5;
                this.field1343 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("by.f(Ljava/lang/String;IB)Lca;")
    public final class79 method1465(String arg0, int arg1) {
        return this.method1458(1, arg1, 0, arg0);
    }

    @ObfuscatedName("by.c(Ljava/lang/Runnable;II)Lca;")
    public final class79 method1460(Runnable arg0, int arg1) {
        return this.method1458(2, arg1, 0, arg0);
    }

    @ObfuscatedName("by.p(IB)Lca;")
    public final class79 method1476(int arg0) {
        return this.method1458(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("by.s(Ljava/net/URL;I)Lca;")
    public final class79 method1475(URL arg0) {
        return this.method1458(4, 0, 0, arg0);
    }

    @ObfuscatedName("by.k(B)Laf;")
    public final class43 method1463() {
        return this.field1329;
    }
}
