package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("el")
public class class156 implements Runnable {

    @ObfuscatedName("el.k")
    public class155 field2150 = null;

    @ObfuscatedName("el.z")
    public class155 field2145 = null;

    @ObfuscatedName("el.v")
    public Thread field2142;

    @ObfuscatedName("el.m")
    public boolean field2147 = false;

    public class156() {
        Statics.field2149 = "Unknown";
        Statics.field2143 = "1.6";
        try {
            Statics.field2149 = System.getProperty("java.vendor");
            Statics.field2143 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2147 = false;
        this.field2142 = new Thread(this);
        this.field2142.setPriority(10);
        this.field2142.setDaemon(true);
        this.field2142.start();
    }

    @ObfuscatedName("el.d(B)V")
    public final void method2818() {
        synchronized (this) {
            this.field2147 = true;
            this.notifyAll();
        }
        try {
            this.field2142.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class155 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2147) {
                        return;
                    }
                    if (this.field2150 != null) {
                        var2 = this.field2150;
                        this.field2150 = this.field2150.field2137;
                        if (this.field2150 == null) {
                            this.field2145 = null;
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
                int var5 = var2.field2138;
                if (var5 == 1) {
                    var2.field2141 = new Socket(InetAddress.getByName((String) var2.field2140), var2.field2139);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2140);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2139);
                    var2.field2141 = var6;
                } else if (var5 == 4) {
                    var2.field2141 = new DataInputStream(((URL) var2.field2140).openStream());
                }
                var2.field2133 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2133 = 2;
            }
        }
    }

    @ObfuscatedName("el.x(IIILjava/lang/Object;S)Lex;")
    public final class155 method2819(int arg0, int arg1, int arg2, Object arg3) {
        class155 var5 = new class155();
        var5.field2138 = arg0;
        var5.field2139 = arg1;
        var5.field2140 = arg3;
        synchronized (this) {
            if (this.field2145 == null) {
                this.field2145 = this.field2150 = var5;
            } else {
                this.field2145.field2137 = var5;
                this.field2145 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("el.k(Ljava/lang/String;II)Lex;")
    public final class155 method2820(String arg0, int arg1) {
        return this.method2819(1, arg1, 0, arg0);
    }

    @ObfuscatedName("el.z(Ljava/lang/Runnable;II)Lex;")
    public final class155 method2824(Runnable arg0, int arg1) {
        return this.method2819(2, arg1, 0, arg0);
    }
}
