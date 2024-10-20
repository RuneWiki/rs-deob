package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ba")
public class class74 implements Runnable {

    @ObfuscatedName("ba.p")
    public class43 field1335;

    @ObfuscatedName("ba.z")
    public class79 field1336 = null;

    @ObfuscatedName("ba.m")
    public class79 field1333 = null;

    @ObfuscatedName("ba.k")
    public Thread field1338;

    @ObfuscatedName("ba.v")
    public boolean field1339 = false;

    @ObfuscatedName("ba.y")
    public EventQueue field1344;

    public class74() {
        Statics.field1340 = "Unknown";
        Statics.field1334 = "1.1";
        try {
            Statics.field1340 = System.getProperty("java.vendor");
            Statics.field1334 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1344 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1339 = false;
        this.field1338 = new Thread(this);
        this.field1338.setPriority(10);
        this.field1338.setDaemon(true);
        this.field1338.start();
    }

    @ObfuscatedName("ba.m(I)V")
    public final void method1506() {
        synchronized (this) {
            this.field1339 = true;
            this.notifyAll();
        }
        try {
            this.field1338.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1339) {
                        return;
                    }
                    if (this.field1336 != null) {
                        var2 = this.field1336;
                        this.field1336 = this.field1336.field1415;
                        if (this.field1336 == null) {
                            this.field1333 = null;
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
                    var2.field1419 = new Socket(InetAddress.getByName((String) var2.field1418), var2.field1411);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1418);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1411);
                    var2.field1419 = var6;
                } else if (var5 == 4) {
                    var2.field1419 = new DataInputStream(((URL) var2.field1418).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1411 >> 24 & 0xFF) + "." + (var2.field1411 >> 16 & 0xFF) + "." + (var2.field1411 >> 8 & 0xFF) + "." + (var2.field1411 & 0xFF);
                    var2.field1419 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1417 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1417 = 2;
            }
        }
    }

    @ObfuscatedName("ba.k(IIILjava/lang/Object;I)Lcg;")
    public final class79 method1508(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1416 = arg0;
        var5.field1411 = arg1;
        var5.field1418 = arg3;
        synchronized (this) {
            if (this.field1333 == null) {
                this.field1333 = this.field1336 = var5;
            } else {
                this.field1333.field1415 = var5;
                this.field1333 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ba.v(Ljava/lang/String;IB)Lcg;")
    public final class79 method1509(String arg0, int arg1) {
        return this.method1508(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ba.y(Ljava/lang/Runnable;IB)Lcg;")
    public final class79 method1512(Runnable arg0, int arg1) {
        return this.method1508(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ba.d(II)Lcg;")
    public final class79 method1511(int arg0) {
        return this.method1508(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ba.l(Ljava/net/URL;I)Lcg;")
    public final class79 method1519(URL arg0) {
        return this.method1508(4, 0, 0, arg0);
    }

    @ObfuscatedName("ba.h(I)Lad;")
    public final class43 method1513() {
        return this.field1335;
    }
}
