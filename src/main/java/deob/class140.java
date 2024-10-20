package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eu")
public class class140 implements Runnable {

    @ObfuscatedName("eu.j")
    public class150 field2143 = null;

    @ObfuscatedName("eu.z")
    public class150 field2145 = null;

    @ObfuscatedName("eu.i")
    public Thread field2140;

    @ObfuscatedName("eu.b")
    public boolean field2148 = false;

    @ObfuscatedName("eu.l")
    public EventQueue field2138;

    public class140() {
        Statics.field2142 = "Unknown";
        Statics.field2139 = "1.1";
        try {
            Statics.field2142 = System.getProperty("java.vendor");
            Statics.field2139 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2138 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2148 = false;
        this.field2140 = new Thread(this);
        this.field2140.setPriority(10);
        this.field2140.setDaemon(true);
        this.field2140.start();
    }

    @ObfuscatedName("eu.j(B)V")
    public final void method2768() {
        synchronized (this) {
            this.field2148 = true;
            this.notifyAll();
        }
        try {
            this.field2140.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class150 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2148) {
                        return;
                    }
                    if (this.field2143 != null) {
                        var2 = this.field2143;
                        this.field2143 = this.field2143.field2268;
                        if (this.field2143 == null) {
                            this.field2145 = null;
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
                int var5 = var2.field2272;
                if (var5 == 1) {
                    var2.field2271 = new Socket(InetAddress.getByName((String) var2.field2274), var2.field2273);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2274);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2273);
                    var2.field2271 = var6;
                } else if (var5 == 4) {
                    var2.field2271 = new DataInputStream(((URL) var2.field2274).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2273 >> 24 & 0xFF) + "." + (var2.field2273 >> 16 & 0xFF) + "." + (var2.field2273 >> 8 & 0xFF) + "." + (var2.field2273 & 0xFF);
                    var2.field2271 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2267 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2267 = 2;
            }
        }
    }

    @ObfuscatedName("eu.z(IIILjava/lang/Object;I)Ley;")
    public final class150 method2779(int arg0, int arg1, int arg2, Object arg3) {
        class150 var5 = new class150();
        var5.field2272 = arg0;
        var5.field2273 = arg1;
        var5.field2274 = arg3;
        synchronized (this) {
            if (this.field2145 == null) {
                this.field2145 = this.field2143 = var5;
            } else {
                this.field2145.field2268 = var5;
                this.field2145 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eu.i(Ljava/lang/String;II)Ley;")
    public final class150 method2771(String arg0, int arg1) {
        return this.method2779(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eu.b(Ljava/lang/Runnable;II)Ley;")
    public final class150 method2772(Runnable arg0, int arg1) {
        return this.method2779(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eu.l(II)Ley;")
    public final class150 method2773(int arg0) {
        return this.method2779(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("eu.m(Ljava/net/URL;I)Ley;")
    public final class150 method2774(URL arg0) {
        return this.method2779(4, 0, 0, arg0);
    }
}
