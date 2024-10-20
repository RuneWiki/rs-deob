package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ef")
public class class140 implements Runnable {

    @ObfuscatedName("ef.e")
    public class150 field2142 = null;

    @ObfuscatedName("ef.g")
    public class150 field2143 = null;

    @ObfuscatedName("ef.n")
    public Thread field2145;

    @ObfuscatedName("ef.u")
    public boolean field2144 = false;

    @ObfuscatedName("ef.d")
    public EventQueue field2149;

    public class140() {
        Statics.field1615 = "Unknown";
        Statics.field2141 = "1.1";
        try {
            Statics.field1615 = System.getProperty("java.vendor");
            Statics.field2141 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2149 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2144 = false;
        this.field2145 = new Thread(this);
        this.field2145.setPriority(10);
        this.field2145.setDaemon(true);
        this.field2145.start();
    }

    @ObfuscatedName("ef.e(I)V")
    public final void method2770() {
        synchronized (this) {
            this.field2144 = true;
            this.notifyAll();
        }
        try {
            this.field2145.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class150 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2144) {
                        return;
                    }
                    if (this.field2142 != null) {
                        var2 = this.field2142;
                        this.field2142 = this.field2142.field2268;
                        if (this.field2142 == null) {
                            this.field2143 = null;
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
                int var5 = var2.field2267;
                if (var5 == 1) {
                    var2.field2271 = new Socket(InetAddress.getByName((String) var2.field2270), var2.field2269);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2270);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2269);
                    var2.field2271 = var6;
                } else if (var5 == 4) {
                    var2.field2271 = new DataInputStream(((URL) var2.field2270).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2269 >> 24 & 0xFF) + "." + (var2.field2269 >> 16 & 0xFF) + "." + (var2.field2269 >> 8 & 0xFF) + "." + (var2.field2269 & 0xFF);
                    var2.field2271 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2266 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2266 = 2;
            }
        }
    }

    @ObfuscatedName("ef.g(IIILjava/lang/Object;I)Lew;")
    public final class150 method2771(int arg0, int arg1, int arg2, Object arg3) {
        class150 var5 = new class150();
        var5.field2267 = arg0;
        var5.field2269 = arg1;
        var5.field2270 = arg3;
        synchronized (this) {
            if (this.field2143 == null) {
                this.field2143 = this.field2142 = var5;
            } else {
                this.field2143.field2268 = var5;
                this.field2143 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ef.n(Ljava/lang/String;IB)Lew;")
    public final class150 method2772(String arg0, int arg1) {
        return this.method2771(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ef.u(Ljava/lang/Runnable;II)Lew;")
    public final class150 method2773(Runnable arg0, int arg1) {
        return this.method2771(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ef.d(II)Lew;")
    public final class150 method2793(int arg0) {
        return this.method2771(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ef.l(Ljava/net/URL;B)Lew;")
    public final class150 method2775(URL arg0) {
        return this.method2771(4, 0, 0, arg0);
    }
}
