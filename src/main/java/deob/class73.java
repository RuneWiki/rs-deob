package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bz")
public class class73 implements Runnable {

    @ObfuscatedName("bz.x")
    public class42 field1322;

    @ObfuscatedName("bz.m")
    public class78 field1323 = null;

    @ObfuscatedName("bz.n")
    public class78 field1324 = null;

    @ObfuscatedName("bz.q")
    public Thread field1328;

    @ObfuscatedName("bz.a")
    public boolean field1321 = false;

    @ObfuscatedName("bz.g")
    public EventQueue field1326;

    public class73() {
        Statics.field1327 = "Unknown";
        Statics.field1258 = "1.1";
        try {
            Statics.field1327 = System.getProperty("java.vendor");
            Statics.field1258 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1326 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1321 = false;
        this.field1328 = new Thread(this);
        this.field1328.setPriority(10);
        this.field1328.setDaemon(true);
        this.field1328.start();
    }

    @ObfuscatedName("bz.m(B)V")
    public final void method1479() {
        synchronized (this) {
            this.field1321 = true;
            this.notifyAll();
        }
        try {
            this.field1328.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class78 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1321) {
                        return;
                    }
                    if (this.field1323 != null) {
                        var2 = this.field1323;
                        this.field1323 = this.field1323.field1383;
                        if (this.field1323 == null) {
                            this.field1324 = null;
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
                    var2.field1391 = new Socket(InetAddress.getByName((String) var2.field1390), var2.field1389);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1390);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1389);
                    var2.field1391 = var6;
                } else if (var5 == 4) {
                    var2.field1391 = new DataInputStream(((URL) var2.field1390).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1389 >> 24 & 0xFF) + "." + (var2.field1389 >> 16 & 0xFF) + "." + (var2.field1389 >> 8 & 0xFF) + "." + (var2.field1389 & 0xFF);
                    var2.field1391 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1386 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1386 = 2;
            }
        }
    }

    @ObfuscatedName("bz.n(IIILjava/lang/Object;I)Lbo;")
    public final class78 method1493(int arg0, int arg1, int arg2, Object arg3) {
        class78 var5 = new class78();
        var5.field1384 = arg0;
        var5.field1389 = arg1;
        var5.field1390 = arg3;
        synchronized (this) {
            if (this.field1324 == null) {
                this.field1324 = this.field1323 = var5;
            } else {
                this.field1324.field1383 = var5;
                this.field1324 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bz.q(Ljava/lang/String;IS)Lbo;")
    public final class78 method1482(String arg0, int arg1) {
        return this.method1493(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bz.a(Ljava/lang/Runnable;II)Lbo;")
    public final class78 method1483(Runnable arg0, int arg1) {
        return this.method1493(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bz.g(IB)Lbo;")
    public final class78 method1484(int arg0) {
        return this.method1493(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bz.j(Ljava/net/URL;I)Lbo;")
    public final class78 method1481(URL arg0) {
        return this.method1493(4, 0, 0, arg0);
    }

    @ObfuscatedName("bz.l(B)Las;")
    public final class42 method1486() {
        return this.field1322;
    }
}
