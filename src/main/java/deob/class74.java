package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bs")
public class class74 implements Runnable {

    @ObfuscatedName("bs.g")
    public class43 field1327;

    @ObfuscatedName("bs.o")
    public class79 field1336 = null;

    @ObfuscatedName("bs.a")
    public class79 field1324 = null;

    @ObfuscatedName("bs.h")
    public Thread field1330;

    @ObfuscatedName("bs.j")
    public boolean field1329 = false;

    @ObfuscatedName("bs.f")
    public EventQueue field1331;

    public class74() {
        Statics.field1326 = "Unknown";
        Statics.field1325 = "1.1";
        try {
            Statics.field1326 = System.getProperty("java.vendor");
            Statics.field1325 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1331 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1329 = false;
        this.field1330 = new Thread(this);
        this.field1330.setPriority(10);
        this.field1330.setDaemon(true);
        this.field1330.start();
    }

    @ObfuscatedName("bs.a(I)V")
    public final void method1464() {
        synchronized (this) {
            this.field1329 = true;
            this.notifyAll();
        }
        try {
            this.field1330.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1329) {
                        return;
                    }
                    if (this.field1336 != null) {
                        var2 = this.field1336;
                        this.field1336 = this.field1336.field1399;
                        if (this.field1336 == null) {
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
                int var5 = var2.field1398;
                if (var5 == 1) {
                    var2.field1397 = new Socket(InetAddress.getByName((String) var2.field1400), var2.field1394);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1400);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1394);
                    var2.field1397 = var6;
                } else if (var5 == 4) {
                    var2.field1397 = new DataInputStream(((URL) var2.field1400).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1394 >> 24 & 0xFF) + "." + (var2.field1394 >> 16 & 0xFF) + "." + (var2.field1394 >> 8 & 0xFF) + "." + (var2.field1394 & 0xFF);
                    var2.field1397 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1393 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1393 = 2;
            }
        }
    }

    @ObfuscatedName("bs.h(IIILjava/lang/Object;B)Lcp;")
    public final class79 method1465(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1398 = arg0;
        var5.field1394 = arg1;
        var5.field1400 = arg3;
        synchronized (this) {
            if (this.field1324 == null) {
                this.field1324 = this.field1336 = var5;
            } else {
                this.field1324.field1399 = var5;
                this.field1324 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bs.j(Ljava/lang/String;II)Lcp;")
    public final class79 method1467(String arg0, int arg1) {
        return this.method1465(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bs.f(Ljava/lang/Runnable;IB)Lcp;")
    public final class79 method1480(Runnable arg0, int arg1) {
        return this.method1465(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bs.q(IB)Lcp;")
    public final class79 method1466(int arg0) {
        return this.method1465(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bs.l(Ljava/net/URL;I)Lcp;")
    public final class79 method1487(URL arg0) {
        return this.method1465(4, 0, 0, arg0);
    }

    @ObfuscatedName("bs.d(I)Lau;")
    public final class43 method1470() {
        return this.field1327;
    }
}
