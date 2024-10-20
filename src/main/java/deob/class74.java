package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bh")
public class class74 implements Runnable {

    @ObfuscatedName("bh.e")
    public class43 field1337;

    @ObfuscatedName("bh.r")
    public class79 field1338 = null;

    @ObfuscatedName("bh.p")
    public class79 field1339 = null;

    @ObfuscatedName("bh.n")
    public Thread field1340;

    @ObfuscatedName("bh.o")
    public boolean field1335 = false;

    @ObfuscatedName("bh.l")
    public EventQueue field1342;

    public class74() {
        Statics.field1351 = "Unknown";
        Statics.field1336 = "1.1";
        try {
            Statics.field1351 = System.getProperty("java.vendor");
            Statics.field1336 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1342 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1335 = false;
        this.field1340 = new Thread(this);
        this.field1340.setPriority(10);
        this.field1340.setDaemon(true);
        this.field1340.start();
    }

    @ObfuscatedName("bh.r(B)V")
    public final void method1453() {
        synchronized (this) {
            this.field1335 = true;
            this.notifyAll();
        }
        try {
            this.field1340.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1335) {
                        return;
                    }
                    if (this.field1338 != null) {
                        var2 = this.field1338;
                        this.field1338 = this.field1338.field1417;
                        if (this.field1338 == null) {
                            this.field1339 = null;
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
                int var5 = var2.field1416;
                if (var5 == 1) {
                    var2.field1420 = new Socket(InetAddress.getByName((String) var2.field1419), var2.field1418);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1419);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1418);
                    var2.field1420 = var6;
                } else if (var5 == 4) {
                    var2.field1420 = new DataInputStream(((URL) var2.field1419).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1418 >> 24 & 0xFF) + "." + (var2.field1418 >> 16 & 0xFF) + "." + (var2.field1418 >> 8 & 0xFF) + "." + (var2.field1418 & 0xFF);
                    var2.field1420 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1414 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1414 = 2;
            }
        }
    }

    @ObfuscatedName("bh.p(IIILjava/lang/Object;B)Lcw;")
    public final class79 method1451(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1416 = arg0;
        var5.field1418 = arg1;
        var5.field1419 = arg3;
        synchronized (this) {
            if (this.field1339 == null) {
                this.field1339 = this.field1338 = var5;
            } else {
                this.field1339.field1417 = var5;
                this.field1339 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bh.n(Ljava/lang/String;II)Lcw;")
    public final class79 method1452(String arg0, int arg1) {
        return this.method1451(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bh.o(Ljava/lang/Runnable;II)Lcw;")
    public final class79 method1454(Runnable arg0, int arg1) {
        return this.method1451(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bh.l(II)Lcw;")
    public final class79 method1455(int arg0) {
        return this.method1451(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bh.t(Ljava/net/URL;I)Lcw;")
    public final class79 method1456(URL arg0) {
        return this.method1451(4, 0, 0, arg0);
    }

    @ObfuscatedName("bh.q(I)Laz;")
    public final class43 method1457() {
        return this.field1337;
    }
}
