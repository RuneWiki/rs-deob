package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("er")
public class class156 implements Runnable {

    @ObfuscatedName("er.i")
    public class155 field2148 = null;

    @ObfuscatedName("er.j")
    public class155 field2154 = null;

    @ObfuscatedName("er.v")
    public Thread field2152;

    @ObfuscatedName("er.x")
    public boolean field2153 = false;

    public class156() {
        Statics.field2151 = "Unknown";
        Statics.field2149 = "1.6";
        try {
            Statics.field2151 = System.getProperty("java.vendor");
            Statics.field2149 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2153 = false;
        this.field2152 = new Thread(this);
        this.field2152.setPriority(10);
        this.field2152.setDaemon(true);
        this.field2152.start();
    }

    @ObfuscatedName("er.m(I)V")
    public final void method2795() {
        synchronized (this) {
            this.field2153 = true;
            this.notifyAll();
        }
        try {
            this.field2152.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class155 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2153) {
                        return;
                    }
                    if (this.field2148 != null) {
                        var2 = this.field2148;
                        this.field2148 = this.field2148.field2144;
                        if (this.field2148 == null) {
                            this.field2154 = null;
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
                int var5 = var2.field2140;
                if (var5 == 1) {
                    var2.field2147 = new Socket(InetAddress.getByName((String) var2.field2146), var2.field2145);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2146);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2145);
                    var2.field2147 = var6;
                } else if (var5 == 4) {
                    var2.field2147 = new DataInputStream(((URL) var2.field2146).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2145 >> 24 & 0xFF) + "." + (var2.field2145 >> 16 & 0xFF) + "." + (var2.field2145 >> 8 & 0xFF) + "." + (var2.field2145 & 0xFF);
                    var2.field2147 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2141 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2141 = 2;
            }
        }
    }

    @ObfuscatedName("er.p(IIILjava/lang/Object;I)Let;")
    public final class155 method2808(int arg0, int arg1, int arg2, Object arg3) {
        class155 var5 = new class155();
        var5.field2140 = arg0;
        var5.field2145 = arg1;
        var5.field2146 = arg3;
        synchronized (this) {
            if (this.field2154 == null) {
                this.field2154 = this.field2148 = var5;
            } else {
                this.field2154.field2144 = var5;
                this.field2154 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("er.i(Ljava/lang/String;II)Let;")
    public final class155 method2796(String arg0, int arg1) {
        return this.method2808(1, arg1, 0, arg0);
    }

    @ObfuscatedName("er.j(Ljava/lang/Runnable;II)Let;")
    public final class155 method2797(Runnable arg0, int arg1) {
        return this.method2808(2, arg1, 0, arg0);
    }

    @ObfuscatedName("er.v(IB)Let;")
    public final class155 method2803(int arg0) {
        return this.method2808(3, arg0, 0, (Object) null);
    }
}
