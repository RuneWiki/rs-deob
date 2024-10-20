package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ew")
public class class143 implements Runnable {

    @ObfuscatedName("ew.s")
    public class149 field1545 = null;

    @ObfuscatedName("ew.a")
    public class149 field1541 = null;

    @ObfuscatedName("ew.o")
    public Thread field1542;

    @ObfuscatedName("ew.g")
    public boolean field1540 = false;

    public class143() {
        Statics.field1544 = "Unknown";
        Statics.field3735 = "1.6";
        try {
            Statics.field1544 = System.getProperty("java.vendor");
            Statics.field3735 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1540 = false;
        this.field1542 = new Thread(this);
        this.field1542.setPriority(10);
        this.field1542.setDaemon(true);
        this.field1542.start();
    }

    @ObfuscatedName("ew.i(I)V")
    public final void method2567() {
        synchronized (this) {
            this.field1540 = true;
            this.notifyAll();
        }
        try {
            this.field1542.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class149 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1540) {
                        return;
                    }
                    if (this.field1545 != null) {
                        var2 = this.field1545;
                        this.field1545 = this.field1545.field1593;
                        if (this.field1545 == null) {
                            this.field1541 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var11) {
                    }
                }
            }
            try {
                int var5 = var2.field1594;
                if (var5 == 1) {
                    var2.field1597 = new Socket(InetAddress.getByName((String) var2.field1589), var2.field1595);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1589);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1595);
                    var2.field1597 = var6;
                } else if (var5 == 4) {
                    var2.field1597 = new DataInputStream(((URL) var2.field1589).openStream());
                }
                var2.field1596 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1596 = 2;
            }
        }
    }

    @ObfuscatedName("ew.w(IIILjava/lang/Object;I)Lev;")
    public final class149 method2568(int arg0, int arg1, int arg2, Object arg3) {
        class149 var5 = new class149();
        var5.field1594 = arg0;
        var5.field1595 = arg1;
        var5.field1589 = arg3;
        synchronized (this) {
            if (this.field1541 == null) {
                this.field1541 = this.field1545 = var5;
            } else {
                this.field1541.field1593 = var5;
                this.field1541 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ew.s(Ljava/lang/String;II)Lev;")
    public final class149 method2569(String arg0, int arg1) {
        return this.method2568(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ew.a(Ljava/lang/Runnable;II)Lev;")
    public final class149 method2570(Runnable arg0, int arg1) {
        return this.method2568(2, arg1, 0, arg0);
    }
}
