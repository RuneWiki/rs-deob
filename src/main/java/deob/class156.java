package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eq")
public class class156 implements Runnable {

    @ObfuscatedName("eq.r")
    public class155 field2136 = null;

    @ObfuscatedName("eq.g")
    public class155 field2142 = null;

    @ObfuscatedName("eq.x")
    public Thread field2138;

    @ObfuscatedName("eq.f")
    public boolean field2139 = false;

    public class156() {
        Statics.field2140 = "Unknown";
        Statics.field2135 = "1.6";
        try {
            Statics.field2140 = System.getProperty("java.vendor");
            Statics.field2135 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2139 = false;
        this.field2138 = new Thread(this);
        this.field2138.setPriority(10);
        this.field2138.setDaemon(true);
        this.field2138.start();
    }

    @ObfuscatedName("eq.b(B)V")
    public final void method2723() {
        synchronized (this) {
            this.field2139 = true;
            this.notifyAll();
        }
        try {
            this.field2138.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class155 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2139) {
                        return;
                    }
                    if (this.field2136 != null) {
                        var2 = this.field2136;
                        this.field2136 = this.field2136.field2126;
                        if (this.field2136 == null) {
                            this.field2142 = null;
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
                int var5 = var2.field2131;
                if (var5 == 1) {
                    var2.field2133 = new Socket(InetAddress.getByName((String) var2.field2132), var2.field2130);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2132);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2130);
                    var2.field2133 = var6;
                } else if (var5 == 4) {
                    var2.field2133 = new DataInputStream(((URL) var2.field2132).openStream());
                }
                var2.field2125 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2125 = 2;
            }
        }
    }

    @ObfuscatedName("eq.s(IIILjava/lang/Object;I)Lex;")
    public final class155 method2725(int arg0, int arg1, int arg2, Object arg3) {
        class155 var5 = new class155();
        var5.field2131 = arg0;
        var5.field2130 = arg1;
        var5.field2132 = arg3;
        synchronized (this) {
            if (this.field2142 == null) {
                this.field2142 = this.field2136 = var5;
            } else {
                this.field2142.field2126 = var5;
                this.field2142 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eq.r(Ljava/lang/String;IB)Lex;")
    public final class155 method2724(String arg0, int arg1) {
        return this.method2725(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eq.g(Ljava/lang/Runnable;II)Lex;")
    public final class155 method2739(Runnable arg0, int arg1) {
        return this.method2725(2, arg1, 0, arg0);
    }
}
