package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eb")
public class class156 implements Runnable {

    @ObfuscatedName("eb.g")
    public class155 field2217 = null;

    @ObfuscatedName("eb.y")
    public class155 field2221 = null;

    @ObfuscatedName("eb.w")
    public Thread field2223;

    @ObfuscatedName("eb.k")
    public boolean field2218 = false;

    public class156() {
        Statics.field2225 = "Unknown";
        Statics.field3711 = "1.6";
        try {
            Statics.field2225 = System.getProperty("java.vendor");
            Statics.field3711 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2218 = false;
        this.field2223 = new Thread(this);
        this.field2223.setPriority(10);
        this.field2223.setDaemon(true);
        this.field2223.start();
    }

    @ObfuscatedName("eb.e(I)V")
    public final void method2738() {
        synchronized (this) {
            this.field2218 = true;
            this.notifyAll();
        }
        try {
            this.field2223.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class155 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2218) {
                        return;
                    }
                    if (this.field2217 != null) {
                        var2 = this.field2217;
                        this.field2217 = this.field2217.field2214;
                        if (this.field2217 == null) {
                            this.field2221 = null;
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
                int var5 = var2.field2212;
                if (var5 == 1) {
                    var2.field2215 = new Socket(InetAddress.getByName((String) var2.field2210), var2.field2213);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2210);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2213);
                    var2.field2215 = var6;
                } else if (var5 == 4) {
                    var2.field2215 = new DataInputStream(((URL) var2.field2210).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2213 >> 24 & 0xFF) + "." + (var2.field2213 >> 16 & 0xFF) + "." + (var2.field2213 >> 8 & 0xFF) + "." + (var2.field2213 & 0xFF);
                    var2.field2215 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2211 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2211 = 2;
            }
        }
    }

    @ObfuscatedName("eb.n(IIILjava/lang/Object;I)Ley;")
    public final class155 method2745(int arg0, int arg1, int arg2, Object arg3) {
        class155 var5 = new class155();
        var5.field2212 = arg0;
        var5.field2213 = arg1;
        var5.field2210 = arg3;
        synchronized (this) {
            if (this.field2221 == null) {
                this.field2221 = this.field2217 = var5;
            } else {
                this.field2221.field2214 = var5;
                this.field2221 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eb.g(Ljava/lang/String;II)Ley;")
    public final class155 method2732(String arg0, int arg1) {
        return this.method2745(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eb.y(Ljava/lang/Runnable;II)Ley;")
    public final class155 method2731(Runnable arg0, int arg1) {
        return this.method2745(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eb.w(IB)Ley;")
    public final class155 method2747(int arg0) {
        return this.method2745(3, arg0, 0, (Object) null);
    }
}
