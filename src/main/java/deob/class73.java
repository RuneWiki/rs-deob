package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("by")
public class class73 implements Runnable {

    @ObfuscatedName("by.f")
    public class42 field1315;

    @ObfuscatedName("by.y")
    public class78 field1316 = null;

    @ObfuscatedName("by.x")
    public class78 field1317 = null;

    @ObfuscatedName("by.e")
    public Thread field1318;

    @ObfuscatedName("by.m")
    public boolean field1319 = false;

    @ObfuscatedName("by.s")
    public EventQueue field1314;

    public class73() {
        Statics.field1320 = "Unknown";
        Statics.field1324 = "1.1";
        try {
            Statics.field1320 = System.getProperty("java.vendor");
            Statics.field1324 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1314 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1319 = false;
        this.field1318 = new Thread(this);
        this.field1318.setPriority(10);
        this.field1318.setDaemon(true);
        this.field1318.start();
    }

    @ObfuscatedName("by.f(I)V")
    public final void method1435() {
        synchronized (this) {
            this.field1319 = true;
            this.notifyAll();
        }
        try {
            this.field1318.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class78 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1319) {
                        return;
                    }
                    if (this.field1316 != null) {
                        var2 = this.field1316;
                        this.field1316 = this.field1316.field1381;
                        if (this.field1316 == null) {
                            this.field1317 = null;
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
                int var5 = var2.field1382;
                if (var5 == 1) {
                    var2.field1384 = new Socket(InetAddress.getByName((String) var2.field1377), var2.field1383);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1377);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1383);
                    var2.field1384 = var6;
                } else if (var5 == 4) {
                    var2.field1384 = new DataInputStream(((URL) var2.field1377).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1383 >> 24 & 0xFF) + "." + (var2.field1383 >> 16 & 0xFF) + "." + (var2.field1383 >> 8 & 0xFF) + "." + (var2.field1383 & 0xFF);
                    var2.field1384 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1385 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1385 = 2;
            }
        }
    }

    @ObfuscatedName("by.y(IIILjava/lang/Object;B)Lbf;")
    public final class78 method1436(int arg0, int arg1, int arg2, Object arg3) {
        class78 var5 = new class78();
        var5.field1382 = arg0;
        var5.field1383 = arg1;
        var5.field1377 = arg3;
        synchronized (this) {
            if (this.field1317 == null) {
                this.field1317 = this.field1316 = var5;
            } else {
                this.field1317.field1381 = var5;
                this.field1317 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("by.x(Ljava/lang/String;II)Lbf;")
    public final class78 method1437(String arg0, int arg1) {
        return this.method1436(1, arg1, 0, arg0);
    }

    @ObfuscatedName("by.e(Ljava/lang/Runnable;IB)Lbf;")
    public final class78 method1438(Runnable arg0, int arg1) {
        return this.method1436(2, arg1, 0, arg0);
    }

    @ObfuscatedName("by.m(II)Lbf;")
    public final class78 method1439(int arg0) {
        return this.method1436(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("by.s(Ljava/net/URL;B)Lbf;")
    public final class78 method1434(URL arg0) {
        return this.method1436(4, 0, 0, arg0);
    }

    @ObfuscatedName("by.p(I)Lab;")
    public final class42 method1443() {
        return this.field1315;
    }
}
