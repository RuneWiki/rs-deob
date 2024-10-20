package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bp")
public class class74 implements Runnable {

    @ObfuscatedName("bp.k")
    public class43 field1303;

    @ObfuscatedName("bp.a")
    public class79 field1302 = null;

    @ObfuscatedName("bp.q")
    public class79 field1314 = null;

    @ObfuscatedName("bp.j")
    public Thread field1306;

    @ObfuscatedName("bp.v")
    public boolean field1307 = false;

    @ObfuscatedName("bp.w")
    public EventQueue field1308;

    public class74() {
        Statics.field1311 = "Unknown";
        Statics.field2299 = "1.1";
        try {
            Statics.field1311 = System.getProperty("java.vendor");
            Statics.field2299 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1308 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1307 = false;
        this.field1306 = new Thread(this);
        this.field1306.setPriority(10);
        this.field1306.setDaemon(true);
        this.field1306.start();
    }

    @ObfuscatedName("bp.k(I)V")
    public final void method1459() {
        synchronized (this) {
            this.field1307 = true;
            this.notifyAll();
        }
        try {
            this.field1306.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1307) {
                        return;
                    }
                    if (this.field1302 != null) {
                        var2 = this.field1302;
                        this.field1302 = this.field1302.field1386;
                        if (this.field1302 == null) {
                            this.field1314 = null;
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
                int var5 = var2.field1384;
                if (var5 == 1) {
                    var2.field1387 = new Socket(InetAddress.getByName((String) var2.field1380), var2.field1385);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1380);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1385);
                    var2.field1387 = var6;
                } else if (var5 == 4) {
                    var2.field1387 = new DataInputStream(((URL) var2.field1380).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1385 >> 24 & 0xFF) + "." + (var2.field1385 >> 16 & 0xFF) + "." + (var2.field1385 >> 8 & 0xFF) + "." + (var2.field1385 & 0xFF);
                    var2.field1387 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1379 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1379 = 2;
            }
        }
    }

    @ObfuscatedName("bp.a(IIILjava/lang/Object;S)Lcr;")
    public final class79 method1467(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1384 = arg0;
        var5.field1385 = arg1;
        var5.field1380 = arg3;
        synchronized (this) {
            if (this.field1314 == null) {
                this.field1314 = this.field1302 = var5;
            } else {
                this.field1314.field1386 = var5;
                this.field1314 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bp.q(Ljava/lang/String;II)Lcr;")
    public final class79 method1479(String arg0, int arg1) {
        return this.method1467(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bp.j(Ljava/lang/Runnable;II)Lcr;")
    public final class79 method1458(Runnable arg0, int arg1) {
        return this.method1467(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bp.v(IB)Lcr;")
    public final class79 method1463(int arg0) {
        return this.method1467(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bp.w(Ljava/net/URL;S)Lcr;")
    public final class79 method1464(URL arg0) {
        return this.method1467(4, 0, 0, arg0);
    }

    @ObfuscatedName("bp.l(I)Laq;")
    public final class43 method1465() {
        return this.field1303;
    }
}
