package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ba")
public class class74 implements Runnable {

    @ObfuscatedName("ba.d")
    public class43 field1334;

    @ObfuscatedName("ba.k")
    public class79 field1329 = null;

    @ObfuscatedName("ba.n")
    public class79 field1328 = null;

    @ObfuscatedName("ba.s")
    public Thread field1331;

    @ObfuscatedName("ba.x")
    public boolean field1332 = false;

    @ObfuscatedName("ba.b")
    public EventQueue field1333;

    public class74() {
        Statics.field1339 = "Unknown";
        Statics.field1326 = "1.1";
        try {
            Statics.field1339 = System.getProperty("java.vendor");
            Statics.field1326 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1333 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1332 = false;
        this.field1331 = new Thread(this);
        this.field1331.setPriority(10);
        this.field1331.setDaemon(true);
        this.field1331.start();
    }

    @ObfuscatedName("ba.k(B)V")
    public final void method1492() {
        synchronized (this) {
            this.field1332 = true;
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
                    if (this.field1332) {
                        return;
                    }
                    if (this.field1329 != null) {
                        var2 = this.field1329;
                        this.field1329 = this.field1329.field1412;
                        if (this.field1329 == null) {
                            this.field1328 = null;
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
                int var5 = var2.field1410;
                if (var5 == 1) {
                    var2.field1413 = new Socket(InetAddress.getByName((String) var2.field1405), var2.field1411);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1405);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1411);
                    var2.field1413 = var6;
                } else if (var5 == 4) {
                    var2.field1413 = new DataInputStream(((URL) var2.field1405).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1411 >> 24 & 0xFF) + "." + (var2.field1411 >> 16 & 0xFF) + "." + (var2.field1411 >> 8 & 0xFF) + "." + (var2.field1411 & 0xFF);
                    var2.field1413 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1409 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1409 = 2;
            }
        }
    }

    @ObfuscatedName("ba.n(IIILjava/lang/Object;I)Lco;")
    public final class79 method1491(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1410 = arg0;
        var5.field1411 = arg1;
        var5.field1405 = arg3;
        synchronized (this) {
            if (this.field1328 == null) {
                this.field1328 = this.field1329 = var5;
            } else {
                this.field1328.field1412 = var5;
                this.field1328 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ba.s(Ljava/lang/String;IS)Lco;")
    public final class79 method1499(String arg0, int arg1) {
        return this.method1491(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ba.x(Ljava/lang/Runnable;II)Lco;")
    public final class79 method1495(Runnable arg0, int arg1) {
        return this.method1491(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ba.b(II)Lco;")
    public final class79 method1494(int arg0) {
        return this.method1491(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ba.j(Ljava/net/URL;I)Lco;")
    public final class79 method1497(URL arg0) {
        return this.method1491(4, 0, 0, arg0);
    }

    @ObfuscatedName("ba.p(B)Law;")
    public final class43 method1498() {
        return this.field1334;
    }
}
