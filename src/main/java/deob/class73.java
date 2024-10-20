package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bt")
public class class73 implements Runnable {

    @ObfuscatedName("bt.w")
    public class42 field1323;

    @ObfuscatedName("bt.h")
    public class78 field1324 = null;

    @ObfuscatedName("bt.v")
    public class78 field1325 = null;

    @ObfuscatedName("bt.k")
    public Thread field1326;

    @ObfuscatedName("bt.g")
    public boolean field1327 = false;

    @ObfuscatedName("bt.n")
    public EventQueue field1328;

    public class73() {
        Statics.field1331 = "Unknown";
        Statics.field1322 = "1.1";
        try {
            Statics.field1331 = System.getProperty("java.vendor");
            Statics.field1322 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1328 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1327 = false;
        this.field1326 = new Thread(this);
        this.field1326.setPriority(10);
        this.field1326.setDaemon(true);
        this.field1326.start();
    }

    @ObfuscatedName("bt.h(B)V")
    public final void method1455() {
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
            class78 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1327) {
                        return;
                    }
                    if (this.field1324 != null) {
                        var2 = this.field1324;
                        this.field1324 = this.field1324.field1413;
                        if (this.field1324 == null) {
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
                int var5 = var2.field1411;
                if (var5 == 1) {
                    var2.field1414 = new Socket(InetAddress.getByName((String) var2.field1406), var2.field1412);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1406);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1412);
                    var2.field1414 = var6;
                } else if (var5 == 4) {
                    var2.field1414 = new DataInputStream(((URL) var2.field1406).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1412 >> 24 & 0xFF) + "." + (var2.field1412 >> 16 & 0xFF) + "." + (var2.field1412 >> 8 & 0xFF) + "." + (var2.field1412 & 0xFF);
                    var2.field1414 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1410 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1410 = 2;
            }
        }
    }

    @ObfuscatedName("bt.v(IIILjava/lang/Object;I)Lbw;")
    public final class78 method1456(int arg0, int arg1, int arg2, Object arg3) {
        class78 var5 = new class78();
        var5.field1411 = arg0;
        var5.field1412 = arg1;
        var5.field1406 = arg3;
        synchronized (this) {
            if (this.field1325 == null) {
                this.field1325 = this.field1324 = var5;
            } else {
                this.field1325.field1413 = var5;
                this.field1325 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bt.k(Ljava/lang/String;II)Lbw;")
    public final class78 method1454(String arg0, int arg1) {
        return this.method1456(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bt.g(Ljava/lang/Runnable;IB)Lbw;")
    public final class78 method1458(Runnable arg0, int arg1) {
        return this.method1456(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bt.n(II)Lbw;")
    public final class78 method1468(int arg0) {
        return this.method1456(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bt.c(Ljava/net/URL;I)Lbw;")
    public final class78 method1476(URL arg0) {
        return this.method1456(4, 0, 0, arg0);
    }

    @ObfuscatedName("bt.o(I)Lav;")
    public final class42 method1465() {
        return this.field1323;
    }
}
