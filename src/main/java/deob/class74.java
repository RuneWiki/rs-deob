package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bw")
public class class74 implements Runnable {

    @ObfuscatedName("bw.v")
    public class43 field1321;

    @ObfuscatedName("bw.p")
    public class79 field1317 = null;

    @ObfuscatedName("bw.e")
    public class79 field1318 = null;

    @ObfuscatedName("bw.d")
    public Thread field1319;

    @ObfuscatedName("bw.y")
    public boolean field1320 = false;

    @ObfuscatedName("bw.x")
    public EventQueue field1323;

    public class74() {
        Statics.field1314 = "Unknown";
        Statics.field1315 = "1.1";
        try {
            Statics.field1314 = System.getProperty("java.vendor");
            Statics.field1315 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1323 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1320 = false;
        this.field1319 = new Thread(this);
        this.field1319.setPriority(10);
        this.field1319.setDaemon(true);
        this.field1319.start();
    }

    @ObfuscatedName("bw.v(I)V")
    public final void method1495() {
        synchronized (this) {
            this.field1320 = true;
            this.notifyAll();
        }
        try {
            this.field1319.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1320) {
                        return;
                    }
                    if (this.field1317 != null) {
                        var2 = this.field1317;
                        this.field1317 = this.field1317.field1395;
                        if (this.field1317 == null) {
                            this.field1318 = null;
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
                int var5 = var2.field1387;
                if (var5 == 1) {
                    var2.field1391 = new Socket(InetAddress.getByName((String) var2.field1392), var2.field1393);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1392);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1393);
                    var2.field1391 = var6;
                } else if (var5 == 4) {
                    var2.field1391 = new DataInputStream(((URL) var2.field1392).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1393 >> 24 & 0xFF) + "." + (var2.field1393 >> 16 & 0xFF) + "." + (var2.field1393 >> 8 & 0xFF) + "." + (var2.field1393 & 0xFF);
                    var2.field1391 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1394 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1394 = 2;
            }
        }
    }

    @ObfuscatedName("bw.p(IIILjava/lang/Object;I)Lcw;")
    public final class79 method1477(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1387 = arg0;
        var5.field1393 = arg1;
        var5.field1392 = arg3;
        synchronized (this) {
            if (this.field1318 == null) {
                this.field1318 = this.field1317 = var5;
            } else {
                this.field1318.field1395 = var5;
                this.field1318 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bw.e(Ljava/lang/String;IB)Lcw;")
    public final class79 method1475(String arg0, int arg1) {
        return this.method1477(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bw.d(Ljava/lang/Runnable;II)Lcw;")
    public final class79 method1479(Runnable arg0, int arg1) {
        return this.method1477(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bw.y(II)Lcw;")
    public final class79 method1480(int arg0) {
        return this.method1477(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bw.x(Ljava/net/URL;B)Lcw;")
    public final class79 method1486(URL arg0) {
        return this.method1477(4, 0, 0, arg0);
    }

    @ObfuscatedName("bw.t(I)Lah;")
    public final class43 method1482() {
        return this.field1321;
    }
}
