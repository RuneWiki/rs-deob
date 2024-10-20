package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("au")
public class class34 implements Runnable {

    @ObfuscatedName("au.q")
    public class15 field374;

    @ObfuscatedName("au.h")
    public class37 field372 = null;

    @ObfuscatedName("au.k")
    public class37 field379 = null;

    @ObfuscatedName("au.r")
    public Thread field375;

    @ObfuscatedName("au.l")
    public boolean field376 = false;

    @ObfuscatedName("au.i")
    public EventQueue field377;

    public class34() {
        Statics.field2494 = "Unknown";
        Statics.field1453 = "1.1";
        try {
            Statics.field2494 = System.getProperty("java.vendor");
            Statics.field1453 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field377 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field376 = false;
        this.field375 = new Thread(this);
        this.field375.setPriority(10);
        this.field375.setDaemon(true);
        this.field375.start();
    }

    @ObfuscatedName("au.h(I)V")
    public final void method430() {
        synchronized (this) {
            this.field376 = true;
            this.notifyAll();
        }
        try {
            this.field375.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class37 var2;
            synchronized (this) {
                while (true) {
                    if (this.field376) {
                        return;
                    }
                    if (this.field372 != null) {
                        var2 = this.field372;
                        this.field372 = this.field372.field502;
                        if (this.field372 == null) {
                            this.field379 = null;
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
                int var5 = var2.field496;
                if (var5 == 1) {
                    var2.field501 = new Socket(InetAddress.getByName((String) var2.field503), var2.field504);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field503);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field504);
                    var2.field501 = var6;
                } else if (var5 == 4) {
                    var2.field501 = new DataInputStream(((URL) var2.field503).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field504 >> 24 & 0xFF) + "." + (var2.field504 >> 16 & 0xFF) + "." + (var2.field504 >> 8 & 0xFF) + "." + (var2.field504 & 0xFF);
                    var2.field501 = InetAddress.getByName(var7).getHostName();
                }
                var2.field500 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field500 = 2;
            }
        }
    }

    @ObfuscatedName("au.k(IIILjava/lang/Object;I)Laq;")
    public final class37 method418(int arg0, int arg1, int arg2, Object arg3) {
        class37 var5 = new class37();
        var5.field496 = arg0;
        var5.field504 = arg1;
        var5.field503 = arg3;
        synchronized (this) {
            if (this.field379 == null) {
                this.field379 = this.field372 = var5;
            } else {
                this.field379.field502 = var5;
                this.field379 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("au.r(Ljava/lang/String;II)Laq;")
    public final class37 method419(String arg0, int arg1) {
        return this.method418(1, arg1, 0, arg0);
    }

    @ObfuscatedName("au.l(Ljava/lang/Runnable;IB)Laq;")
    public final class37 method420(Runnable arg0, int arg1) {
        return this.method418(2, arg1, 0, arg0);
    }

    @ObfuscatedName("au.i(IB)Laq;")
    public final class37 method421(int arg0) {
        return this.method418(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("au.e(Ljava/net/URL;I)Laq;")
    public final class37 method434(URL arg0) {
        return this.method418(4, 0, 0, arg0);
    }

    @ObfuscatedName("au.a(I)Lm;")
    public final class15 method423() {
        return this.field374;
    }
}
