package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bg")
public class class74 implements Runnable {

    @ObfuscatedName("bg.j")
    public class43 field1359;

    @ObfuscatedName("bg.i")
    public class79 field1369 = null;

    @ObfuscatedName("bg.k")
    public class79 field1361 = null;

    @ObfuscatedName("bg.q")
    public Thread field1362;

    @ObfuscatedName("bg.t")
    public boolean field1371 = false;

    @ObfuscatedName("bg.v")
    public EventQueue field1363;

    public class74() {
        Statics.field1365 = "Unknown";
        Statics.field1358 = "1.1";
        try {
            Statics.field1365 = System.getProperty("java.vendor");
            Statics.field1358 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1363 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1371 = false;
        this.field1362 = new Thread(this);
        this.field1362.setPriority(10);
        this.field1362.setDaemon(true);
        this.field1362.start();
    }

    @ObfuscatedName("bg.i(I)V")
    public final void method1462() {
        synchronized (this) {
            this.field1371 = true;
            this.notifyAll();
        }
        try {
            this.field1362.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1371) {
                        return;
                    }
                    if (this.field1369 != null) {
                        var2 = this.field1369;
                        this.field1369 = this.field1369.field1427;
                        if (this.field1369 == null) {
                            this.field1361 = null;
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
                int var5 = var2.field1432;
                if (var5 == 1) {
                    var2.field1435 = new Socket(InetAddress.getByName((String) var2.field1434), var2.field1429);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1434);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1429);
                    var2.field1435 = var6;
                } else if (var5 == 4) {
                    var2.field1435 = new DataInputStream(((URL) var2.field1434).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1429 >> 24 & 0xFF) + "." + (var2.field1429 >> 16 & 0xFF) + "." + (var2.field1429 >> 8 & 0xFF) + "." + (var2.field1429 & 0xFF);
                    var2.field1435 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1433 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1433 = 2;
            }
        }
    }

    @ObfuscatedName("bg.k(IIILjava/lang/Object;I)Lcc;")
    public final class79 method1476(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1432 = arg0;
        var5.field1429 = arg1;
        var5.field1434 = arg3;
        synchronized (this) {
            if (this.field1361 == null) {
                this.field1361 = this.field1369 = var5;
            } else {
                this.field1361.field1427 = var5;
                this.field1361 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bg.q(Ljava/lang/String;II)Lcc;")
    public final class79 method1464(String arg0, int arg1) {
        return this.method1476(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bg.t(Ljava/lang/Runnable;II)Lcc;")
    public final class79 method1463(Runnable arg0, int arg1) {
        return this.method1476(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bg.v(IS)Lcc;")
    public final class79 method1459(int arg0) {
        return this.method1476(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bg.y(Ljava/net/URL;I)Lcc;")
    public final class79 method1465(URL arg0) {
        return this.method1476(4, 0, 0, arg0);
    }

    @ObfuscatedName("bg.w(B)Las;")
    public final class43 method1466() {
        return this.field1359;
    }
}
