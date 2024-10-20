package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bm")
public class class75 implements Runnable {

    @ObfuscatedName("bm.r")
    public class44 field1348;

    @ObfuscatedName("bm.l")
    public class80 field1358 = null;

    @ObfuscatedName("bm.s")
    public class80 field1349 = null;

    @ObfuscatedName("bm.d")
    public Thread field1356;

    @ObfuscatedName("bm.e")
    public boolean field1352 = false;

    @ObfuscatedName("bm.u")
    public EventQueue field1353;

    public class75() {
        Statics.field1360 = "Unknown";
        Statics.field1347 = "1.1";
        try {
            Statics.field1360 = System.getProperty("java.vendor");
            Statics.field1347 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1353 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1352 = false;
        this.field1356 = new Thread(this);
        this.field1356.setPriority(10);
        this.field1356.setDaemon(true);
        this.field1356.start();
    }

    @ObfuscatedName("bm.s(I)V")
    public final void method1492() {
        synchronized (this) {
            this.field1352 = true;
            this.notifyAll();
        }
        try {
            this.field1356.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class80 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1352) {
                        return;
                    }
                    if (this.field1358 != null) {
                        var2 = this.field1358;
                        this.field1358 = this.field1358.field1431;
                        if (this.field1358 == null) {
                            this.field1349 = null;
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
                int var5 = var2.field1427;
                if (var5 == 1) {
                    var2.field1429 = new Socket(InetAddress.getByName((String) var2.field1432), var2.field1433);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1432);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1433);
                    var2.field1429 = var6;
                } else if (var5 == 4) {
                    var2.field1429 = new DataInputStream(((URL) var2.field1432).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1433 >> 24 & 0xFF) + "." + (var2.field1433 >> 16 & 0xFF) + "." + (var2.field1433 >> 8 & 0xFF) + "." + (var2.field1433 & 0xFF);
                    var2.field1429 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1430 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1430 = 2;
            }
        }
    }

    @ObfuscatedName("bm.d(IIILjava/lang/Object;B)Lcm;")
    public final class80 method1493(int arg0, int arg1, int arg2, Object arg3) {
        class80 var5 = new class80();
        var5.field1427 = arg0;
        var5.field1433 = arg1;
        var5.field1432 = arg3;
        synchronized (this) {
            if (this.field1349 == null) {
                this.field1349 = this.field1358 = var5;
            } else {
                this.field1349.field1431 = var5;
                this.field1349 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bm.e(Ljava/lang/String;IB)Lcm;")
    public final class80 method1512(String arg0, int arg1) {
        return this.method1493(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bm.u(Ljava/lang/Runnable;II)Lcm;")
    public final class80 method1495(Runnable arg0, int arg1) {
        return this.method1493(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bm.q(II)Lcm;")
    public final class80 method1496(int arg0) {
        return this.method1493(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bm.o(Ljava/net/URL;S)Lcm;")
    public final class80 method1497(URL arg0) {
        return this.method1493(4, 0, 0, arg0);
    }

    @ObfuscatedName("bm.v(I)Lad;")
    public final class44 method1494() {
        return this.field1348;
    }
}
