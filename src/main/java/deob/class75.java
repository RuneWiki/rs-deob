package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bf")
public class class75 implements Runnable {

    @ObfuscatedName("bf.k")
    public class44 field1347;

    @ObfuscatedName("bf.q")
    public class80 field1348 = null;

    @ObfuscatedName("bf.j")
    public class80 field1346 = null;

    @ObfuscatedName("bf.z")
    public Thread field1350;

    @ObfuscatedName("bf.m")
    public boolean field1358 = false;

    @ObfuscatedName("bf.w")
    public EventQueue field1355;

    public class75() {
        Statics.field1349 = "Unknown";
        Statics.field1351 = "1.1";
        try {
            Statics.field1349 = System.getProperty("java.vendor");
            Statics.field1351 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1355 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1358 = false;
        this.field1350 = new Thread(this);
        this.field1350.setPriority(10);
        this.field1350.setDaemon(true);
        this.field1350.start();
    }

    @ObfuscatedName("bf.q(I)V")
    public final void method1542() {
        synchronized (this) {
            this.field1358 = true;
            this.notifyAll();
        }
        try {
            this.field1350.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class80 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1358) {
                        return;
                    }
                    if (this.field1348 != null) {
                        var2 = this.field1348;
                        this.field1348 = this.field1348.field1416;
                        if (this.field1348 == null) {
                            this.field1346 = null;
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
                    var2.field1417 = new Socket(InetAddress.getByName((String) var2.field1412), var2.field1415);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1412);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1415);
                    var2.field1417 = var6;
                } else if (var5 == 4) {
                    var2.field1417 = new DataInputStream(((URL) var2.field1412).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1415 >> 24 & 0xFF) + "." + (var2.field1415 >> 16 & 0xFF) + "." + (var2.field1415 >> 8 & 0xFF) + "." + (var2.field1415 & 0xFF);
                    var2.field1417 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1413 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1413 = 2;
            }
        }
    }

    @ObfuscatedName("bf.j(IIILjava/lang/Object;I)Lcm;")
    public final class80 method1568(int arg0, int arg1, int arg2, Object arg3) {
        class80 var5 = new class80();
        var5.field1414 = arg0;
        var5.field1415 = arg1;
        var5.field1412 = arg3;
        synchronized (this) {
            if (this.field1346 == null) {
                this.field1346 = this.field1348 = var5;
            } else {
                this.field1346.field1416 = var5;
                this.field1346 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bf.z(Ljava/lang/String;II)Lcm;")
    public final class80 method1555(String arg0, int arg1) {
        return this.method1568(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bf.m(Ljava/lang/Runnable;II)Lcm;")
    public final class80 method1546(Runnable arg0, int arg1) {
        return this.method1568(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bf.w(II)Lcm;")
    public final class80 method1547(int arg0) {
        return this.method1568(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bf.a(Ljava/net/URL;I)Lcm;")
    public final class80 method1548(URL arg0) {
        return this.method1568(4, 0, 0, arg0);
    }

    @ObfuscatedName("bf.d(B)Lat;")
    public final class44 method1543() {
        return this.field1347;
    }
}
