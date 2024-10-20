package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bc")
public class class74 implements Runnable {

    @ObfuscatedName("bc.d")
    public class43 field1322;

    @ObfuscatedName("bc.x")
    public class79 field1323 = null;

    @ObfuscatedName("bc.o")
    public class79 field1324 = null;

    @ObfuscatedName("bc.a")
    public Thread field1331;

    @ObfuscatedName("bc.w")
    public boolean field1326 = false;

    @ObfuscatedName("bc.i")
    public EventQueue field1329;

    public class74() {
        Statics.field1330 = "Unknown";
        Statics.field1321 = "1.1";
        try {
            Statics.field1330 = System.getProperty("java.vendor");
            Statics.field1321 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1329 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1326 = false;
        this.field1331 = new Thread(this);
        this.field1331.setPriority(10);
        this.field1331.setDaemon(true);
        this.field1331.start();
    }

    @ObfuscatedName("bc.o(S)V")
    public final void method1546() {
        synchronized (this) {
            this.field1326 = true;
            this.notifyAll();
        }
        try {
            this.field1331.join();
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
                    if (this.field1323 != null) {
                        var2 = this.field1323;
                        this.field1323 = this.field1323.field1400;
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
                int var5 = var2.field1392;
                if (var5 == 1) {
                    var2.field1398 = new Socket(InetAddress.getByName((String) var2.field1399), var2.field1397);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1399);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1397);
                    var2.field1398 = var6;
                } else if (var5 == 4) {
                    var2.field1398 = new DataInputStream(((URL) var2.field1399).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1397 >> 24 & 0xFF) + "." + (var2.field1397 >> 16 & 0xFF) + "." + (var2.field1397 >> 8 & 0xFF) + "." + (var2.field1397 & 0xFF);
                    var2.field1398 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1396 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1396 = 2;
            }
        }
    }

    @ObfuscatedName("bc.a(IIILjava/lang/Object;I)Lco;")
    public final class79 method1558(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1392 = arg0;
        var5.field1397 = arg1;
        var5.field1399 = arg3;
        synchronized (this) {
            if (this.field1324 == null) {
                this.field1324 = this.field1323 = var5;
            } else {
                this.field1324.field1400 = var5;
                this.field1324 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bc.w(Ljava/lang/String;II)Lco;")
    public final class79 method1552(String arg0, int arg1) {
        return this.method1558(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bc.i(Ljava/lang/Runnable;IS)Lco;")
    public final class79 method1549(Runnable arg0, int arg1) {
        return this.method1558(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bc.y(II)Lco;")
    public final class79 method1550(int arg0) {
        return this.method1558(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bc.m(Ljava/net/URL;B)Lco;")
    public final class79 method1551(URL arg0) {
        return this.method1558(4, 0, 0, arg0);
    }

    @ObfuscatedName("bc.u(I)Lag;")
    public final class43 method1545() {
        return this.field1322;
    }
}
