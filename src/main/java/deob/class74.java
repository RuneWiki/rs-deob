package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bx")
public class class74 implements Runnable {

    @ObfuscatedName("bx.f")
    public class43 field1327;

    @ObfuscatedName("bx.e")
    public class79 field1326 = null;

    @ObfuscatedName("bx.t")
    public class79 field1328 = null;

    @ObfuscatedName("bx.d")
    public Thread field1330;

    @ObfuscatedName("bx.p")
    public boolean field1331 = false;

    @ObfuscatedName("bx.k")
    public EventQueue field1333;

    public class74() {
        Statics.field1335 = "Unknown";
        Statics.field1338 = "1.1";
        try {
            Statics.field1335 = System.getProperty("java.vendor");
            Statics.field1338 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1333 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1331 = false;
        this.field1330 = new Thread(this);
        this.field1330.setPriority(10);
        this.field1330.setDaemon(true);
        this.field1330.start();
    }

    @ObfuscatedName("bx.e(I)V")
    public final void method1500() {
        synchronized (this) {
            this.field1331 = true;
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
                    if (this.field1331) {
                        return;
                    }
                    if (this.field1326 != null) {
                        var2 = this.field1326;
                        this.field1326 = this.field1326.field1405;
                        if (this.field1326 == null) {
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
                    var2.field1411 = new Socket(InetAddress.getByName((String) var2.field1412), var2.field1413);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1412);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1413);
                    var2.field1411 = var6;
                } else if (var5 == 4) {
                    var2.field1411 = new DataInputStream(((URL) var2.field1412).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1413 >> 24 & 0xFF) + "." + (var2.field1413 >> 16 & 0xFF) + "." + (var2.field1413 >> 8 & 0xFF) + "." + (var2.field1413 & 0xFF);
                    var2.field1411 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1409 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1409 = 2;
            }
        }
    }

    @ObfuscatedName("bx.t(IIILjava/lang/Object;I)Lcd;")
    public final class79 method1486(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1410 = arg0;
        var5.field1413 = arg1;
        var5.field1412 = arg3;
        synchronized (this) {
            if (this.field1328 == null) {
                this.field1328 = this.field1326 = var5;
            } else {
                this.field1328.field1405 = var5;
                this.field1328 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bx.d(Ljava/lang/String;II)Lcd;")
    public final class79 method1488(String arg0, int arg1) {
        return this.method1486(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bx.p(Ljava/lang/Runnable;II)Lcd;")
    public final class79 method1475(Runnable arg0, int arg1) {
        return this.method1486(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bx.k(IS)Lcd;")
    public final class79 method1481(int arg0) {
        return this.method1486(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bx.r(Ljava/net/URL;I)Lcd;")
    public final class79 method1477(URL arg0) {
        return this.method1486(4, 0, 0, arg0);
    }

    @ObfuscatedName("bx.l(I)Lag;")
    public final class43 method1478() {
        return this.field1327;
    }
}
