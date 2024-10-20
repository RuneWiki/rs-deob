package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bn")
public class class74 implements Runnable {

    @ObfuscatedName("bn.u")
    public class43 field1308;

    @ObfuscatedName("bn.t")
    public class79 field1311 = null;

    @ObfuscatedName("bn.k")
    public class79 field1312 = null;

    @ObfuscatedName("bn.x")
    public Thread field1313;

    @ObfuscatedName("bn.v")
    public boolean field1318 = false;

    @ObfuscatedName("bn.g")
    public EventQueue field1315;

    public class74() {
        Statics.field1317 = "Unknown";
        Statics.field1309 = "1.1";
        try {
            Statics.field1317 = System.getProperty("java.vendor");
            Statics.field1309 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1315 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1318 = false;
        this.field1313 = new Thread(this);
        this.field1313.setPriority(10);
        this.field1313.setDaemon(true);
        this.field1313.start();
    }

    @ObfuscatedName("bn.r(I)V")
    public final void method1418() {
        synchronized (this) {
            this.field1318 = true;
            this.notifyAll();
        }
        try {
            this.field1313.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1318) {
                        return;
                    }
                    if (this.field1311 != null) {
                        var2 = this.field1311;
                        this.field1311 = this.field1311.field1385;
                        if (this.field1311 == null) {
                            this.field1312 = null;
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
                    var2.field1381 = new Socket(InetAddress.getByName((String) var2.field1386), var2.field1387);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1386);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1387);
                    var2.field1381 = var6;
                } else if (var5 == 4) {
                    var2.field1381 = new DataInputStream(((URL) var2.field1386).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1387 >> 24 & 0xFF) + "." + (var2.field1387 >> 16 & 0xFF) + "." + (var2.field1387 >> 8 & 0xFF) + "." + (var2.field1387 & 0xFF);
                    var2.field1381 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1383 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1383 = 2;
            }
        }
    }

    @ObfuscatedName("bn.u(IIILjava/lang/Object;I)Lcl;")
    public final class79 method1439(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1384 = arg0;
        var5.field1387 = arg1;
        var5.field1386 = arg3;
        synchronized (this) {
            if (this.field1312 == null) {
                this.field1312 = this.field1311 = var5;
            } else {
                this.field1312.field1385 = var5;
                this.field1312 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bn.t(Ljava/lang/String;IB)Lcl;")
    public final class79 method1423(String arg0, int arg1) {
        return this.method1439(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bn.k(Ljava/lang/Runnable;II)Lcl;")
    public final class79 method1424(Runnable arg0, int arg1) {
        return this.method1439(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bn.x(IB)Lcl;")
    public final class79 method1422(int arg0) {
        return this.method1439(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bn.v(Ljava/net/URL;I)Lcl;")
    public final class79 method1438(URL arg0) {
        return this.method1439(4, 0, 0, arg0);
    }

    @ObfuscatedName("bn.g(I)Lan;")
    public final class43 method1420() {
        return this.field1308;
    }
}
