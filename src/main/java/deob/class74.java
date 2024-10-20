package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bb")
public class class74 implements Runnable {

    @ObfuscatedName("bb.a")
    public class43 field1346;

    @ObfuscatedName("bb.h")
    public class79 field1344 = null;

    @ObfuscatedName("bb.y")
    public class79 field1345 = null;

    @ObfuscatedName("bb.j")
    public Thread field1348;

    @ObfuscatedName("bb.l")
    public boolean field1341 = false;

    @ObfuscatedName("bb.f")
    public EventQueue field1343;

    public class74() {
        Statics.field1347 = "Unknown";
        Statics.field1342 = "1.1";
        try {
            Statics.field1347 = System.getProperty("java.vendor");
            Statics.field1342 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1343 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1341 = false;
        this.field1348 = new Thread(this);
        this.field1348.setPriority(10);
        this.field1348.setDaemon(true);
        this.field1348.start();
    }

    @ObfuscatedName("bb.h(B)V")
    public final void method1533() {
        synchronized (this) {
            this.field1341 = true;
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
                    if (this.field1341) {
                        return;
                    }
                    if (this.field1344 != null) {
                        var2 = this.field1344;
                        this.field1344 = this.field1344.field1411;
                        if (this.field1344 == null) {
                            this.field1345 = null;
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
                int var5 = var2.field1419;
                if (var5 == 1) {
                    var2.field1418 = new Socket(InetAddress.getByName((String) var2.field1417), var2.field1416);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1417);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1416);
                    var2.field1418 = var6;
                } else if (var5 == 4) {
                    var2.field1418 = new DataInputStream(((URL) var2.field1417).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1416 >> 24 & 0xFF) + "." + (var2.field1416 >> 16 & 0xFF) + "." + (var2.field1416 >> 8 & 0xFF) + "." + (var2.field1416 & 0xFF);
                    var2.field1418 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1415 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1415 = 2;
            }
        }
    }

    @ObfuscatedName("bb.y(IIILjava/lang/Object;I)Lcy;")
    public final class79 method1515(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1419 = arg0;
        var5.field1416 = arg1;
        var5.field1417 = arg3;
        synchronized (this) {
            if (this.field1345 == null) {
                this.field1345 = this.field1344 = var5;
            } else {
                this.field1345.field1411 = var5;
                this.field1345 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bb.j(Ljava/lang/String;II)Lcy;")
    public final class79 method1516(String arg0, int arg1) {
        return this.method1515(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bb.l(Ljava/lang/Runnable;IB)Lcy;")
    public final class79 method1517(Runnable arg0, int arg1) {
        return this.method1515(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bb.f(II)Lcy;")
    public final class79 method1518(int arg0) {
        return this.method1515(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bb.n(Ljava/net/URL;I)Lcy;")
    public final class79 method1519(URL arg0) {
        return this.method1515(4, 0, 0, arg0);
    }

    @ObfuscatedName("bb.k(I)Lad;")
    public final class43 method1520() {
        return this.field1346;
    }
}
