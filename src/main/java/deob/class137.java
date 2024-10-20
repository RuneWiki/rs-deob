package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ei")
public class class137 implements Runnable {

    @ObfuscatedName("ei.m")
    public class54 field2074;

    @ObfuscatedName("ei.z")
    public class147 field2079 = null;

    @ObfuscatedName("ei.x")
    public class147 field2075 = null;

    @ObfuscatedName("ei.e")
    public Thread field2076;

    @ObfuscatedName("ei.i")
    public boolean field2073 = false;

    @ObfuscatedName("ei.c")
    public EventQueue field2078;

    public class137() {
        Statics.field2077 = "Unknown";
        Statics.field2072 = "1.1";
        try {
            Statics.field2077 = System.getProperty("java.vendor");
            Statics.field2072 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2078 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2073 = false;
        this.field2076 = new Thread(this);
        this.field2076.setPriority(10);
        this.field2076.setDaemon(true);
        this.field2076.start();
    }

    @ObfuscatedName("ei.m(I)V")
    public final void method2703() {
        synchronized (this) {
            this.field2073 = true;
            this.notifyAll();
        }
        try {
            this.field2076.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class147 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2073) {
                        return;
                    }
                    if (this.field2079 != null) {
                        var2 = this.field2079;
                        this.field2079 = this.field2079.field2200;
                        if (this.field2079 == null) {
                            this.field2075 = null;
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
                int var5 = var2.field2197;
                if (var5 == 1) {
                    var2.field2195 = new Socket(InetAddress.getByName((String) var2.field2199), var2.field2198);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2199);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2198);
                    var2.field2195 = var6;
                } else if (var5 == 4) {
                    var2.field2195 = new DataInputStream(((URL) var2.field2199).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2198 >> 24 & 0xFF) + "." + (var2.field2198 >> 16 & 0xFF) + "." + (var2.field2198 >> 8 & 0xFF) + "." + (var2.field2198 & 0xFF);
                    var2.field2195 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2196 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2196 = 2;
            }
        }
    }

    @ObfuscatedName("ei.z(IIILjava/lang/Object;B)Lej;")
    public final class147 method2704(int arg0, int arg1, int arg2, Object arg3) {
        class147 var5 = new class147();
        var5.field2197 = arg0;
        var5.field2198 = arg1;
        var5.field2199 = arg3;
        synchronized (this) {
            if (this.field2075 == null) {
                this.field2075 = this.field2079 = var5;
            } else {
                this.field2075.field2200 = var5;
                this.field2075 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ei.x(Ljava/lang/String;II)Lej;")
    public final class147 method2705(String arg0, int arg1) {
        return this.method2704(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ei.e(Ljava/lang/Runnable;II)Lej;")
    public final class147 method2706(Runnable arg0, int arg1) {
        return this.method2704(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ei.i(II)Lej;")
    public final class147 method2727(int arg0) {
        return this.method2704(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ei.c(Ljava/net/URL;I)Lej;")
    public final class147 method2708(URL arg0) {
        return this.method2704(4, 0, 0, arg0);
    }

    @ObfuscatedName("ei.n(B)Lbt;")
    public final class54 method2709() {
        return this.field2074;
    }
}
