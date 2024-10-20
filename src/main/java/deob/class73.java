package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("br")
public class class73 implements Runnable {

    @ObfuscatedName("br.n")
    public class42 field1309;

    @ObfuscatedName("br.c")
    public class78 field1313 = null;

    @ObfuscatedName("br.r")
    public class78 field1311 = null;

    @ObfuscatedName("br.k")
    public Thread field1312;

    @ObfuscatedName("br.e")
    public boolean field1310 = false;

    @ObfuscatedName("br.q")
    public EventQueue field1314;

    public class73() {
        Statics.field1308 = "Unknown";
        Statics.field1307 = "1.1";
        try {
            Statics.field1308 = System.getProperty("java.vendor");
            Statics.field1307 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1314 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1310 = false;
        this.field1312 = new Thread(this);
        this.field1312.setPriority(10);
        this.field1312.setDaemon(true);
        this.field1312.start();
    }

    @ObfuscatedName("br.r(I)V")
    public final void method1510() {
        synchronized (this) {
            this.field1310 = true;
            this.notifyAll();
        }
        try {
            this.field1312.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class78 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1310) {
                        return;
                    }
                    if (this.field1313 != null) {
                        var2 = this.field1313;
                        this.field1313 = this.field1313.field1393;
                        if (this.field1313 == null) {
                            this.field1311 = null;
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
                int var5 = var2.field1390;
                if (var5 == 1) {
                    var2.field1385 = new Socket(InetAddress.getByName((String) var2.field1392), var2.field1391);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1392);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1391);
                    var2.field1385 = var6;
                } else if (var5 == 4) {
                    var2.field1385 = new DataInputStream(((URL) var2.field1392).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1391 >> 24 & 0xFF) + "." + (var2.field1391 >> 16 & 0xFF) + "." + (var2.field1391 >> 8 & 0xFF) + "." + (var2.field1391 & 0xFF);
                    var2.field1385 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1388 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1388 = 2;
            }
        }
    }

    @ObfuscatedName("br.k(IIILjava/lang/Object;B)Lbl;")
    public final class78 method1511(int arg0, int arg1, int arg2, Object arg3) {
        class78 var5 = new class78();
        var5.field1390 = arg0;
        var5.field1391 = arg1;
        var5.field1392 = arg3;
        synchronized (this) {
            if (this.field1311 == null) {
                this.field1311 = this.field1313 = var5;
            } else {
                this.field1311.field1393 = var5;
                this.field1311 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("br.e(Ljava/lang/String;II)Lbl;")
    public final class78 method1512(String arg0, int arg1) {
        return this.method1511(1, arg1, 0, arg0);
    }

    @ObfuscatedName("br.q(Ljava/lang/Runnable;II)Lbl;")
    public final class78 method1522(Runnable arg0, int arg1) {
        return this.method1511(2, arg1, 0, arg0);
    }

    @ObfuscatedName("br.u(II)Lbl;")
    public final class78 method1514(int arg0) {
        return this.method1511(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("br.s(Ljava/net/URL;I)Lbl;")
    public final class78 method1515(URL arg0) {
        return this.method1511(4, 0, 0, arg0);
    }

    @ObfuscatedName("br.l(B)Lax;")
    public final class42 method1516() {
        return this.field1309;
    }
}
