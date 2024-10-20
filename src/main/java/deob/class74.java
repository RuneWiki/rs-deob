package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bl")
public class class74 implements Runnable {

    @ObfuscatedName("bl.o")
    public class43 field1336;

    @ObfuscatedName("bl.n")
    public class79 field1347 = null;

    @ObfuscatedName("bl.l")
    public class79 field1338 = null;

    @ObfuscatedName("bl.v")
    public Thread field1339;

    @ObfuscatedName("bl.g")
    public boolean field1337 = false;

    @ObfuscatedName("bl.x")
    public EventQueue field1334;

    public class74() {
        Statics.field1340 = "Unknown";
        Statics.field1335 = "1.1";
        try {
            Statics.field1340 = System.getProperty("java.vendor");
            Statics.field1335 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1334 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1337 = false;
        this.field1339 = new Thread(this);
        this.field1339.setPriority(10);
        this.field1339.setDaemon(true);
        this.field1339.start();
    }

    @ObfuscatedName("bl.o(I)V")
    public final void method1531() {
        synchronized (this) {
            this.field1337 = true;
            this.notifyAll();
        }
        try {
            this.field1339.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1337) {
                        return;
                    }
                    if (this.field1347 != null) {
                        var2 = this.field1347;
                        this.field1347 = this.field1347.field1411;
                        if (this.field1347 == null) {
                            this.field1338 = null;
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
                int var5 = var2.field1414;
                if (var5 == 1) {
                    var2.field1412 = new Socket(InetAddress.getByName((String) var2.field1416), var2.field1415);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1416);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1415);
                    var2.field1412 = var6;
                } else if (var5 == 4) {
                    var2.field1412 = new DataInputStream(((URL) var2.field1416).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1415 >> 24 & 0xFF) + "." + (var2.field1415 >> 16 & 0xFF) + "." + (var2.field1415 >> 8 & 0xFF) + "." + (var2.field1415 & 0xFF);
                    var2.field1412 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1413 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1413 = 2;
            }
        }
    }

    @ObfuscatedName("bl.n(IIILjava/lang/Object;S)Lce;")
    public final class79 method1533(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1414 = arg0;
        var5.field1415 = arg1;
        var5.field1416 = arg3;
        synchronized (this) {
            if (this.field1338 == null) {
                this.field1338 = this.field1347 = var5;
            } else {
                this.field1338.field1411 = var5;
                this.field1338 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bl.l(Ljava/lang/String;II)Lce;")
    public final class79 method1519(String arg0, int arg1) {
        return this.method1533(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bl.v(Ljava/lang/Runnable;II)Lce;")
    public final class79 method1521(Runnable arg0, int arg1) {
        return this.method1533(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bl.g(IB)Lce;")
    public final class79 method1522(int arg0) {
        return this.method1533(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bl.x(Ljava/net/URL;B)Lce;")
    public final class79 method1545(URL arg0) {
        return this.method1533(4, 0, 0, arg0);
    }

    @ObfuscatedName("bl.c(I)Lau;")
    public final class43 method1524() {
        return this.field1336;
    }
}
