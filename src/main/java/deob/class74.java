package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bn")
public class class74 implements Runnable {

    @ObfuscatedName("bn.o")
    public class43 field1356;

    @ObfuscatedName("bn.h")
    public class79 field1350 = null;

    @ObfuscatedName("bn.u")
    public class79 field1349 = null;

    @ObfuscatedName("bn.a")
    public Thread field1352;

    @ObfuscatedName("bn.q")
    public boolean field1353 = false;

    @ObfuscatedName("bn.t")
    public EventQueue field1351;

    public class74() {
        Statics.field1347 = "Unknown";
        Statics.field1348 = "1.1";
        try {
            Statics.field1347 = System.getProperty("java.vendor");
            Statics.field1348 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1351 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1353 = false;
        this.field1352 = new Thread(this);
        this.field1352.setPriority(10);
        this.field1352.setDaemon(true);
        this.field1352.start();
    }

    @ObfuscatedName("bn.o(B)V")
    public final void method1488() {
        synchronized (this) {
            this.field1353 = true;
            this.notifyAll();
        }
        try {
            this.field1352.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class79 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1353) {
                        return;
                    }
                    if (this.field1350 != null) {
                        var2 = this.field1350;
                        this.field1350 = this.field1350.field1422;
                        if (this.field1350 == null) {
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
                int var5 = var2.field1414;
                if (var5 == 1) {
                    var2.field1416 = new Socket(InetAddress.getByName((String) var2.field1421), var2.field1420);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1421);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1420);
                    var2.field1416 = var6;
                } else if (var5 == 4) {
                    var2.field1416 = new DataInputStream(((URL) var2.field1421).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1420 >> 24 & 0xFF) + "." + (var2.field1420 >> 16 & 0xFF) + "." + (var2.field1420 >> 8 & 0xFF) + "." + (var2.field1420 & 0xFF);
                    var2.field1416 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1419 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1419 = 2;
            }
        }
    }

    @ObfuscatedName("bn.h(IIILjava/lang/Object;I)Lcq;")
    public final class79 method1489(int arg0, int arg1, int arg2, Object arg3) {
        class79 var5 = new class79();
        var5.field1414 = arg0;
        var5.field1420 = arg1;
        var5.field1421 = arg3;
        synchronized (this) {
            if (this.field1349 == null) {
                this.field1349 = this.field1350 = var5;
            } else {
                this.field1349.field1422 = var5;
                this.field1349 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bn.u(Ljava/lang/String;II)Lcq;")
    public final class79 method1491(String arg0, int arg1) {
        return this.method1489(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bn.a(Ljava/lang/Runnable;II)Lcq;")
    public final class79 method1512(Runnable arg0, int arg1) {
        return this.method1489(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bn.q(II)Lcq;")
    public final class79 method1492(int arg0) {
        return this.method1489(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bn.t(Ljava/net/URL;I)Lcq;")
    public final class79 method1490(URL arg0) {
        return this.method1489(4, 0, 0, arg0);
    }

    @ObfuscatedName("bn.n(B)Lae;")
    public final class43 method1501() {
        return this.field1356;
    }
}
