package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bz")
public class class74 implements Runnable {

    @ObfuscatedName("bz.y")
    public class43 field1345;

    @ObfuscatedName("bz.v")
    public class79 field1349 = null;

    @ObfuscatedName("bz.g")
    public class79 field1347 = null;

    @ObfuscatedName("bz.x")
    public Thread field1348;

    @ObfuscatedName("bz.u")
    public boolean field1350 = false;

    @ObfuscatedName("bz.l")
    public EventQueue field1343;

    public class74() {
        Statics.field1355 = "Unknown";
        Statics.field1344 = "1.1";
        try {
            Statics.field1355 = System.getProperty("java.vendor");
            Statics.field1344 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1343 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1350 = false;
        this.field1348 = new Thread(this);
        this.field1348.setPriority(10);
        this.field1348.setDaemon(true);
        this.field1348.start();
    }

    @ObfuscatedName("bz.q(B)V")
    public final void method1424() {
        synchronized (this) {
            this.field1350 = true;
            this.notifyAll();
        }
        try {
            this.field1348.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1350) {
                        return;
                    }
                    if (this.field1349 != null) {
                        var2 = this.field1349;
                        this.field1349 = this.field1349.field1426;
                        if (this.field1349 == null) {
                            this.field1347 = null;
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
                int var5 = var2.field1424;
                if (var5 == 1) {
                    var2.field1427 = new Socket(InetAddress.getByName((String) var2.field1419), var2.field1425);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1419);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1425);
                    var2.field1427 = var6;
                } else if (var5 == 4) {
                    var2.field1427 = new DataInputStream(((URL) var2.field1419).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1425 >> 24 & 0xFF) + "." + (var2.field1425 >> 16 & 0xFF) + "." + (var2.field1425 >> 8 & 0xFF) + "." + (var2.field1425 & 0xFF);
                    var2.field1427 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1423 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1423 = 2;
            }
        }
    }

    @ObfuscatedName("bz.y(IIILjava/lang/Object;I)Lco;")
    public final class79 method1426(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1424 = arg0;
        var5.field1425 = arg1;
        var5.field1419 = arg3;
        synchronized (this) {
            if (this.field1347 == null) {
                this.field1347 = this.field1349 = var5;
            } else {
                this.field1347.field1426 = var5;
                this.field1347 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bz.v(Ljava/lang/String;II)Lco;")
    public final class79 method1428(String arg0, int arg1) {
        return this.method1426(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bz.g(Ljava/lang/Runnable;II)Lco;")
    public final class79 method1433(Runnable arg0, int arg1) {
        return this.method1426(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bz.x(IB)Lco;")
    public final class79 method1429(int arg0) {
        return this.method1426(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bz.u(Ljava/net/URL;I)Lco;")
    public final class79 method1430(URL arg0) {
        return this.method1426(4, 0, 0, arg0);
    }

    @ObfuscatedName("bz.l(I)Lao;")
    public final class43 method1431() {
        return this.field1345;
    }
}
