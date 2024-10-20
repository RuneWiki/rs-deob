package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bf")
public class class74 implements Runnable {

    @ObfuscatedName("bf.s")
    public class43 field1321;

    @ObfuscatedName("bf.o")
    public class79 field1323 = null;

    @ObfuscatedName("bf.p")
    public class79 field1322 = null;

    @ObfuscatedName("bf.x")
    public Thread field1324;

    @ObfuscatedName("bf.k")
    public boolean field1325 = false;

    @ObfuscatedName("bf.r")
    public EventQueue field1326;

    public class74() {
        Statics.field1330 = "Unknown";
        Statics.field2739 = "1.1";
        try {
            Statics.field1330 = System.getProperty("java.vendor");
            Statics.field2739 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1326 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1325 = false;
        this.field1324 = new Thread(this);
        this.field1324.setPriority(10);
        this.field1324.setDaemon(true);
        this.field1324.start();
    }

    @ObfuscatedName("bf.h(B)V")
    public final void method1501() {
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
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1325) {
                        return;
                    }
                    if (this.field1323 != null) {
                        var2 = this.field1323;
                        this.field1323 = this.field1323.field1393;
                        if (this.field1323 == null) {
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
                int var5 = var2.field1394;
                if (var5 == 1) {
                    var2.field1397 = new Socket(InetAddress.getByName((String) var2.field1390), var2.field1395);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1390);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1395);
                    var2.field1397 = var6;
                } else if (var5 == 4) {
                    var2.field1397 = new DataInputStream(((URL) var2.field1390).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1395 >> 24 & 0xFF) + "." + (var2.field1395 >> 16 & 0xFF) + "." + (var2.field1395 >> 8 & 0xFF) + "." + (var2.field1395 & 0xFF);
                    var2.field1397 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1392 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1392 = 2;
            }
        }
    }

    @ObfuscatedName("bf.s(IIILjava/lang/Object;I)Lcp;")
    public final class79 method1513(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1394 = arg0;
        var5.field1395 = arg1;
        var5.field1390 = arg3;
        synchronized (this) {
            if (this.field1322 == null) {
                this.field1322 = this.field1323 = var5;
            } else {
                this.field1322.field1393 = var5;
                this.field1322 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bf.o(Ljava/lang/String;II)Lcp;")
    public final class79 method1494(String arg0, int arg1) {
        return this.method1513(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bf.p(Ljava/lang/Runnable;II)Lcp;")
    public final class79 method1521(Runnable arg0, int arg1) {
        return this.method1513(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bf.x(II)Lcp;")
    public final class79 method1493(int arg0) {
        return this.method1513(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bf.k(Ljava/net/URL;B)Lcp;")
    public final class79 method1510(URL arg0) {
        return this.method1513(4, 0, 0, arg0);
    }

    @ObfuscatedName("bf.r(I)Lay;")
    public final class43 method1497() {
        return this.field1321;
    }
}
