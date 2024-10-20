package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bc")
public class class74 implements Runnable {

    @ObfuscatedName("bc.v")
    public class43 field1323;

    @ObfuscatedName("bc.r")
    public class79 field1322 = null;

    @ObfuscatedName("bc.n")
    public class79 field1325 = null;

    @ObfuscatedName("bc.i")
    public Thread field1326;

    @ObfuscatedName("bc.s")
    public boolean field1327 = false;

    @ObfuscatedName("bc.w")
    public EventQueue field1324;

    public class74() {
        Statics.field2021 = "Unknown";
        Statics.field1332 = "1.1";
        try {
            Statics.field2021 = System.getProperty("java.vendor");
            Statics.field1332 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1324 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1327 = false;
        this.field1326 = new Thread(this);
        this.field1326.setPriority(10);
        this.field1326.setDaemon(true);
        this.field1326.start();
    }

    @ObfuscatedName("bc.v(B)V")
    public final void method1495() {
        synchronized (this) {
            this.field1327 = true;
            this.notifyAll();
        }
        try {
            this.field1326.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1327) {
                        return;
                    }
                    if (this.field1322 != null) {
                        var2 = this.field1322;
                        this.field1322 = this.field1322.field1405;
                        if (this.field1322 == null) {
                            this.field1325 = null;
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
                int var5 = var2.field1404;
                if (var5 == 1) {
                    var2.field1408 = new Socket(InetAddress.getByName((String) var2.field1407), var2.field1400);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1407);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1400);
                    var2.field1408 = var6;
                } else if (var5 == 4) {
                    var2.field1408 = new DataInputStream(((URL) var2.field1407).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1400 >> 24 & 0xFF) + "." + (var2.field1400 >> 16 & 0xFF) + "." + (var2.field1400 >> 8 & 0xFF) + "." + (var2.field1400 & 0xFF);
                    var2.field1408 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1401 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1401 = 2;
            }
        }
    }

    @ObfuscatedName("bc.r(IIILjava/lang/Object;I)Lcq;")
    public final class79 method1496(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1404 = arg0;
        var5.field1400 = arg1;
        var5.field1407 = arg3;
        synchronized (this) {
            if (this.field1325 == null) {
                this.field1325 = this.field1322 = var5;
            } else {
                this.field1325.field1405 = var5;
                this.field1325 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bc.n(Ljava/lang/String;II)Lcq;")
    public final class79 method1497(String arg0, int arg1) {
        return this.method1496(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bc.i(Ljava/lang/Runnable;II)Lcq;")
    public final class79 method1498(Runnable arg0, int arg1) {
        return this.method1496(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bc.s(II)Lcq;")
    public final class79 method1503(int arg0) {
        return this.method1496(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bc.w(Ljava/net/URL;I)Lcq;")
    public final class79 method1494(URL arg0) {
        return this.method1496(4, 0, 0, arg0);
    }

    @ObfuscatedName("bc.d(I)Lab;")
    public final class43 method1501() {
        return this.field1323;
    }
}
