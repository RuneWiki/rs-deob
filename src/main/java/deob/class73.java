package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bg")
public class class73 implements Runnable {

    @ObfuscatedName("bg.n")
    public class42 field1326;

    @ObfuscatedName("bg.j")
    public class78 field1323 = null;

    @ObfuscatedName("bg.i")
    public class78 field1324 = null;

    @ObfuscatedName("bg.o")
    public Thread field1320;

    @ObfuscatedName("bg.l")
    public boolean field1325 = false;

    @ObfuscatedName("bg.p")
    public EventQueue field1330;

    public class73() {
        Statics.field1335 = "Unknown";
        Statics.field1321 = "1.1";
        try {
            Statics.field1335 = System.getProperty("java.vendor");
            Statics.field1321 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1330 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1325 = false;
        this.field1320 = new Thread(this);
        this.field1320.setPriority(10);
        this.field1320.setDaemon(true);
        this.field1320.start();
    }

    @ObfuscatedName("bg.n(B)V")
    public final void method1482() {
        synchronized (this) {
            this.field1325 = true;
            this.notifyAll();
        }
        try {
            this.field1320.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class78 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1325) {
                        return;
                    }
                    if (this.field1323 != null) {
                        var2 = this.field1323;
                        this.field1323 = this.field1323.field1394;
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
                int var5 = var2.field1399;
                if (var5 == 1) {
                    var2.field1402 = new Socket(InetAddress.getByName((String) var2.field1396), var2.field1400);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1396);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1400);
                    var2.field1402 = var6;
                } else if (var5 == 4) {
                    var2.field1402 = new DataInputStream(((URL) var2.field1396).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1400 >> 24 & 0xFF) + "." + (var2.field1400 >> 16 & 0xFF) + "." + (var2.field1400 >> 8 & 0xFF) + "." + (var2.field1400 & 0xFF);
                    var2.field1402 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1398 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1398 = 2;
            }
        }
    }

    @ObfuscatedName("bg.j(IIILjava/lang/Object;I)Lbd;")
    public final class78 method1483(int arg0, int arg1, int arg2, Object arg3) {
        class78 var5 = new class78();
        var5.field1399 = arg0;
        var5.field1400 = arg1;
        var5.field1396 = arg3;
        synchronized (this) {
            if (this.field1324 == null) {
                this.field1324 = this.field1323 = var5;
            } else {
                this.field1324.field1394 = var5;
                this.field1324 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("bg.i(Ljava/lang/String;II)Lbd;")
    public final class78 method1505(String arg0, int arg1) {
        return this.method1483(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bg.o(Ljava/lang/Runnable;IB)Lbd;")
    public final class78 method1485(Runnable arg0, int arg1) {
        return this.method1483(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bg.l(II)Lbd;")
    public final class78 method1486(int arg0) {
        return this.method1483(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bg.p(Ljava/net/URL;I)Lbd;")
    public final class78 method1484(URL arg0) {
        return this.method1483(4, 0, 0, arg0);
    }

    @ObfuscatedName("bg.t(I)Lay;")
    public final class42 method1488() {
        return this.field1326;
    }
}
