package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bo")
public class class73 implements Runnable {

    @ObfuscatedName("bo.x")
    public class42 field1331;

    @ObfuscatedName("bo.z")
    public class78 field1332 = null;

    @ObfuscatedName("bo.c")
    public class78 field1323 = null;

    @ObfuscatedName("bo.e")
    public Thread field1324;

    @ObfuscatedName("bo.s")
    public boolean field1325 = false;

    @ObfuscatedName("bo.i")
    public EventQueue field1321;

    public class73() {
        Statics.field1326 = "Unknown";
        Statics.field1319 = "1.1";
        try {
            Statics.field1326 = System.getProperty("java.vendor");
            Statics.field1319 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1321 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1325 = false;
        this.field1324 = new Thread(this);
        this.field1324.setPriority(10);
        this.field1324.setDaemon(true);
        this.field1324.start();
    }

    @ObfuscatedName("bo.z(I)V")
    public final void method1475() {
        synchronized (this) {
            this.field1325 = true;
            this.notifyAll();
        }
        try {
            this.field1324.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class78 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1325) {
                        return;
                    }
                    if (this.field1332 != null) {
                        var2 = this.field1332;
                        this.field1332 = this.field1332.field1400;
                        if (this.field1332 == null) {
                            this.field1323 = null;
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
                int var5 = var2.field1402;
                if (var5 == 1) {
                    var2.field1398 = new Socket(InetAddress.getByName((String) var2.field1395), var2.field1401);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1395);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1401);
                    var2.field1398 = var6;
                } else if (var5 == 4) {
                    var2.field1398 = new DataInputStream(((URL) var2.field1395).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1401 >> 24 & 0xFF) + "." + (var2.field1401 >> 16 & 0xFF) + "." + (var2.field1401 >> 8 & 0xFF) + "." + (var2.field1401 & 0xFF);
                    var2.field1398 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1399 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1399 = 2;
            }
        }
    }

    @ObfuscatedName("bo.c(IIILjava/lang/Object;B)Lbf;")
    public final class78 method1453(int arg0, int arg1, int arg2, Object arg3) {
        class78 var5 = new class78();
        var5.field1402 = arg0;
        var5.field1401 = arg1;
        var5.field1395 = arg3;
        synchronized (this) {
            if (this.field1323 == null) {
                this.field1323 = this.field1332 = var5;
            } else {
                this.field1323.field1400 = var5;
                this.field1323 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bo.e(Ljava/lang/String;II)Lbf;")
    public final class78 method1469(String arg0, int arg1) {
        return this.method1453(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bo.s(Ljava/lang/Runnable;IB)Lbf;")
    public final class78 method1455(Runnable arg0, int arg1) {
        return this.method1453(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bo.i(II)Lbf;")
    public final class78 method1484(int arg0) {
        return this.method1453(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bo.g(Ljava/net/URL;B)Lbf;")
    public final class78 method1477(URL arg0) {
        return this.method1453(4, 0, 0, arg0);
    }

    @ObfuscatedName("bo.q(I)Lar;")
    public final class42 method1458() {
        return this.field1331;
    }
}
