package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bb")
public class class73 implements Runnable {

    @ObfuscatedName("bb.c")
    public class42 field1330;

    @ObfuscatedName("bb.p")
    public class78 field1331 = null;

    @ObfuscatedName("bb.i")
    public class78 field1332 = null;

    @ObfuscatedName("bb.v")
    public Thread field1333;

    @ObfuscatedName("bb.l")
    public boolean field1337 = false;

    @ObfuscatedName("bb.m")
    public EventQueue field1329;

    public class73() {
        Statics.field2638 = "Unknown";
        Statics.field1334 = "1.1";
        try {
            Statics.field2638 = System.getProperty("java.vendor");
            Statics.field1334 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1329 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1337 = false;
        this.field1333 = new Thread(this);
        this.field1333.setPriority(10);
        this.field1333.setDaemon(true);
        this.field1333.start();
    }

    @ObfuscatedName("bb.l(I)V")
    public final void method1473() {
        synchronized (this) {
            this.field1337 = true;
            this.notifyAll();
        }
        try {
            this.field1333.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class78 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1337) {
                        return;
                    }
                    if (this.field1331 != null) {
                        var2 = this.field1331;
                        this.field1331 = this.field1331.field1404;
                        if (this.field1331 == null) {
                            this.field1332 = null;
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
                int var5 = var2.field1403;
                if (var5 == 1) {
                    var2.field1411 = new Socket(InetAddress.getByName((String) var2.field1410), var2.field1409);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1410);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1409);
                    var2.field1411 = var6;
                } else if (var5 == 4) {
                    var2.field1411 = new DataInputStream(((URL) var2.field1410).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1409 >> 24 & 0xFF) + "." + (var2.field1409 >> 16 & 0xFF) + "." + (var2.field1409 >> 8 & 0xFF) + "." + (var2.field1409 & 0xFF);
                    var2.field1411 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1408 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1408 = 2;
            }
        }
    }

    @ObfuscatedName("bb.m(IIILjava/lang/Object;B)Lbk;")
    public final class78 method1491(int arg0, int arg1, int arg2, Object arg3) {
        class78 var5 = new class78();
        var5.field1403 = arg0;
        var5.field1409 = arg1;
        var5.field1410 = arg3;
        synchronized (this) {
            if (this.field1332 == null) {
                this.field1332 = this.field1331 = var5;
            } else {
                this.field1332.field1404 = var5;
                this.field1332 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bb.g(Ljava/lang/String;II)Lbk;")
    public final class78 method1477(String arg0, int arg1) {
        return this.method1491(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bb.t(Ljava/lang/Runnable;II)Lbk;")
    public final class78 method1475(Runnable arg0, int arg1) {
        return this.method1491(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bb.o(IB)Lbk;")
    public final class78 method1479(int arg0) {
        return this.method1491(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bb.b(Ljava/net/URL;I)Lbk;")
    public final class78 method1474(URL arg0) {
        return this.method1491(4, 0, 0, arg0);
    }

    @ObfuscatedName("bb.d(B)Lai;")
    public final class42 method1506() {
        return this.field1330;
    }
}
