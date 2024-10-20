package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fs")
public class class157 implements Runnable {

    @ObfuscatedName("fs.e")
    public class156 field2128 = null;

    @ObfuscatedName("fs.k")
    public class156 field2131 = null;

    @ObfuscatedName("fs.u")
    public Thread field2132;

    @ObfuscatedName("fs.z")
    public boolean field2133 = false;

    public class157() {
        Statics.field2130 = "Unknown";
        Statics.field2129 = "1.6";
        try {
            Statics.field2130 = System.getProperty("java.vendor");
            Statics.field2129 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2133 = false;
        this.field2132 = new Thread(this);
        this.field2132.setPriority(10);
        this.field2132.setDaemon(true);
        this.field2132.start();
    }

    @ObfuscatedName("fs.a(I)V")
    public final void method2730() {
        synchronized (this) {
            this.field2133 = true;
            this.notifyAll();
        }
        try {
            this.field2132.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class156 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2133) {
                        return;
                    }
                    if (this.field2128 != null) {
                        var2 = this.field2128;
                        this.field2128 = this.field2128.field2119;
                        if (this.field2128 == null) {
                            this.field2131 = null;
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
                int var5 = var2.field2125;
                if (var5 == 1) {
                    var2.field2127 = new Socket(InetAddress.getByName((String) var2.field2126), var2.field2122);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2126);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2122);
                    var2.field2127 = var6;
                } else if (var5 == 4) {
                    var2.field2127 = new DataInputStream(((URL) var2.field2126).openStream());
                }
                var2.field2123 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2123 = 2;
            }
        }
    }

    @ObfuscatedName("fs.w(IIILjava/lang/Object;B)Lev;")
    public final class156 method2731(int arg0, int arg1, int arg2, Object arg3) {
        class156 var5 = new class156();
        var5.field2125 = arg0;
        var5.field2122 = arg1;
        var5.field2126 = arg3;
        synchronized (this) {
            if (this.field2131 == null) {
                this.field2131 = this.field2128 = var5;
            } else {
                this.field2131.field2119 = var5;
                this.field2131 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fs.e(Ljava/lang/String;II)Lev;")
    public final class156 method2737(String arg0, int arg1) {
        return this.method2731(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fs.k(Ljava/lang/Runnable;II)Lev;")
    public final class156 method2733(Runnable arg0, int arg1) {
        return this.method2731(2, arg1, 0, arg0);
    }
}
