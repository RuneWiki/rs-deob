package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bg")
public class class74 implements Runnable {

    @ObfuscatedName("bg.c")
    public class43 field1373;

    @ObfuscatedName("bg.d")
    public class79 field1368 = null;

    @ObfuscatedName("bg.b")
    public class79 field1369 = null;

    @ObfuscatedName("bg.i")
    public Thread field1370;

    @ObfuscatedName("bg.p")
    public boolean field1371 = false;

    @ObfuscatedName("bg.y")
    public EventQueue field1367;

    public class74() {
        Statics.field1374 = "Unknown";
        Statics.field1366 = "1.1";
        try {
            Statics.field1374 = System.getProperty("java.vendor");
            Statics.field1366 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1367 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1371 = false;
        this.field1370 = new Thread(this);
        this.field1370.setPriority(10);
        this.field1370.setDaemon(true);
        this.field1370.start();
    }

    @ObfuscatedName("bg.c(I)V")
    public final void method1522() {
        synchronized (this) {
            this.field1371 = true;
            this.notifyAll();
        }
        try {
            this.field1370.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1371) {
                        return;
                    }
                    if (this.field1368 != null) {
                        var2 = this.field1368;
                        this.field1368 = this.field1368.field1450;
                        if (this.field1368 == null) {
                            this.field1369 = null;
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
                int var5 = var2.field1447;
                if (var5 == 1) {
                    var2.field1442 = new Socket(InetAddress.getByName((String) var2.field1449), var2.field1448);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1449);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1448);
                    var2.field1442 = var6;
                } else if (var5 == 4) {
                    var2.field1442 = new DataInputStream(((URL) var2.field1449).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1448 >> 24 & 0xFF) + "." + (var2.field1448 >> 16 & 0xFF) + "." + (var2.field1448 >> 8 & 0xFF) + "." + (var2.field1448 & 0xFF);
                    var2.field1442 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1446 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1446 = 2;
            }
        }
    }

    @ObfuscatedName("bg.d(IIILjava/lang/Object;I)Lcz;")
    public final class79 method1502(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1447 = arg0;
        var5.field1448 = arg1;
        var5.field1449 = arg3;
        synchronized (this) {
            if (this.field1369 == null) {
                this.field1369 = this.field1368 = var5;
            } else {
                this.field1369.field1450 = var5;
                this.field1369 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bg.b(Ljava/lang/String;II)Lcz;")
    public final class79 method1503(String arg0, int arg1) {
        return this.method1502(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bg.i(Ljava/lang/Runnable;IB)Lcz;")
    public final class79 method1515(Runnable arg0, int arg1) {
        return this.method1502(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bg.p(IS)Lcz;")
    public final class79 method1507(int arg0) {
        return this.method1502(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bg.y(Ljava/net/URL;I)Lcz;")
    public final class79 method1506(URL arg0) {
        return this.method1502(4, 0, 0, arg0);
    }

    @ObfuscatedName("bg.u(B)Lau;")
    public final class43 method1509() {
        return this.field1373;
    }
}
