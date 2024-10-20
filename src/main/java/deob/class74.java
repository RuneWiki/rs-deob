package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bj")
public class class74 implements Runnable {

    @ObfuscatedName("bj.n")
    public class43 field1320;

    @ObfuscatedName("bj.e")
    public class79 field1321 = null;

    @ObfuscatedName("bj.l")
    public class79 field1322 = null;

    @ObfuscatedName("bj.d")
    public Thread field1323;

    @ObfuscatedName("bj.r")
    public boolean field1326 = false;

    @ObfuscatedName("bj.k")
    public EventQueue field1324;

    public class74() {
        Statics.field2458 = "Unknown";
        Statics.field1328 = "1.1";
        try {
            Statics.field2458 = System.getProperty("java.vendor");
            Statics.field1328 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1324 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1326 = false;
        this.field1323 = new Thread(this);
        this.field1323.setPriority(10);
        this.field1323.setDaemon(true);
        this.field1323.start();
    }

    @ObfuscatedName("bj.l(B)V")
    public final void method1504() {
        synchronized (this) {
            this.field1326 = true;
            this.notifyAll();
        }
        try {
            this.field1323.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1326) {
                        return;
                    }
                    if (this.field1321 != null) {
                        var2 = this.field1321;
                        this.field1321 = this.field1321.field1395;
                        if (this.field1321 == null) {
                            this.field1322 = null;
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
                int var5 = var2.field1396;
                if (var5 == 1) {
                    var2.field1399 = new Socket(InetAddress.getByName((String) var2.field1398), var2.field1397);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1398);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1397);
                    var2.field1399 = var6;
                } else if (var5 == 4) {
                    var2.field1399 = new DataInputStream(((URL) var2.field1398).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1397 >> 24 & 0xFF) + "." + (var2.field1397 >> 16 & 0xFF) + "." + (var2.field1397 >> 8 & 0xFF) + "." + (var2.field1397 & 0xFF);
                    var2.field1399 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1392 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1392 = 2;
            }
        }
    }

    @ObfuscatedName("bj.d(IIILjava/lang/Object;I)Lcf;")
    public final class79 method1505(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1396 = arg0;
        var5.field1397 = arg1;
        var5.field1398 = arg3;
        synchronized (this) {
            if (this.field1322 == null) {
                this.field1322 = this.field1321 = var5;
            } else {
                this.field1322.field1395 = var5;
                this.field1322 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bj.r(Ljava/lang/String;IS)Lcf;")
    public final class79 method1506(String arg0, int arg1) {
        return this.method1505(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bj.k(Ljava/lang/Runnable;II)Lcf;")
    public final class79 method1507(Runnable arg0, int arg1) {
        return this.method1505(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bj.u(IS)Lcf;")
    public final class79 method1532(int arg0) {
        return this.method1505(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bj.o(Ljava/net/URL;I)Lcf;")
    public final class79 method1509(URL arg0) {
        return this.method1505(4, 0, 0, arg0);
    }

    @ObfuscatedName("bj.g(B)Las;")
    public final class43 method1510() {
        return this.field1320;
    }
}
