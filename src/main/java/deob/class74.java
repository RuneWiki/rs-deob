package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bl")
public class class74 implements Runnable {

    @ObfuscatedName("bl.a")
    public class43 field1349;

    @ObfuscatedName("bl.l")
    public class79 field1350 = null;

    @ObfuscatedName("bl.q")
    public class79 field1351 = null;

    @ObfuscatedName("bl.b")
    public Thread field1356;

    @ObfuscatedName("bl.u")
    public boolean field1361 = false;

    @ObfuscatedName("bl.d")
    public EventQueue field1354;

    public class74() {
        Statics.field1762 = "Unknown";
        Statics.field1352 = "1.1";
        try {
            Statics.field1762 = System.getProperty("java.vendor");
            Statics.field1352 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1354 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1361 = false;
        this.field1356 = new Thread(this);
        this.field1356.setPriority(10);
        this.field1356.setDaemon(true);
        this.field1356.start();
    }

    @ObfuscatedName("bl.a(B)V")
    public final void method1446() {
        synchronized (this) {
            this.field1361 = true;
            this.notifyAll();
        }
        try {
            this.field1356.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1361) {
                        return;
                    }
                    if (this.field1350 != null) {
                        var2 = this.field1350;
                        this.field1350 = this.field1350.field1430;
                        if (this.field1350 == null) {
                            this.field1351 = null;
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
                int var5 = var2.field1429;
                if (var5 == 1) {
                    var2.field1432 = new Socket(InetAddress.getByName((String) var2.field1431), var2.field1426);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1431);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1426);
                    var2.field1432 = var6;
                } else if (var5 == 4) {
                    var2.field1432 = new DataInputStream(((URL) var2.field1431).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1426 >> 24 & 0xFF) + "." + (var2.field1426 >> 16 & 0xFF) + "." + (var2.field1426 >> 8 & 0xFF) + "." + (var2.field1426 & 0xFF);
                    var2.field1432 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1428 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1428 = 2;
            }
        }
    }

    @ObfuscatedName("bl.l(IIILjava/lang/Object;I)Lci;")
    public final class79 method1454(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1429 = arg0;
        var5.field1426 = arg1;
        var5.field1431 = arg3;
        synchronized (this) {
            if (this.field1351 == null) {
                this.field1351 = this.field1350 = var5;
            } else {
                this.field1351.field1430 = var5;
                this.field1351 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bl.q(Ljava/lang/String;II)Lci;")
    public final class79 method1439(String arg0, int arg1) {
        return this.method1454(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bl.b(Ljava/lang/Runnable;II)Lci;")
    public final class79 method1455(Runnable arg0, int arg1) {
        return this.method1454(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bl.u(II)Lci;")
    public final class79 method1441(int arg0) {
        return this.method1454(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bl.d(Ljava/net/URL;I)Lci;")
    public final class79 method1436(URL arg0) {
        return this.method1454(4, 0, 0, arg0);
    }

    @ObfuscatedName("bl.m(I)Lau;")
    public final class43 method1438() {
        return this.field1349;
    }
}
