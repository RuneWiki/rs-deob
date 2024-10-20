package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eg")
public class class155 implements Runnable {

    @ObfuscatedName("eg.x")
    public class154 field2207 = null;

    @ObfuscatedName("eg.y")
    public class154 field2209 = null;

    @ObfuscatedName("eg.e")
    public Thread field2206;

    @ObfuscatedName("eg.f")
    public boolean field2211 = false;

    public class155() {
        Statics.field2208 = "Unknown";
        Statics.field2210 = "1.6";
        try {
            Statics.field2208 = System.getProperty("java.vendor");
            Statics.field2210 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2211 = false;
        this.field2206 = new Thread(this);
        this.field2206.setPriority(10);
        this.field2206.setDaemon(true);
        this.field2206.start();
    }

    @ObfuscatedName("eg.d(S)V")
    public final void method2683() {
        synchronized (this) {
            this.field2211 = true;
            this.notifyAll();
        }
        try {
            this.field2206.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2211) {
                        return;
                    }
                    if (this.field2207 != null) {
                        var2 = this.field2207;
                        this.field2207 = this.field2207.field2198;
                        if (this.field2207 == null) {
                            this.field2209 = null;
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
                int var5 = var2.field2202;
                if (var5 == 1) {
                    var2.field2205 = new Socket(InetAddress.getByName((String) var2.field2201), var2.field2203);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2201);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2203);
                    var2.field2205 = var6;
                } else if (var5 == 4) {
                    var2.field2205 = new DataInputStream(((URL) var2.field2201).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2203 >> 24 & 0xFF) + "." + (var2.field2203 >> 16 & 0xFF) + "." + (var2.field2203 >> 8 & 0xFF) + "." + (var2.field2203 & 0xFF);
                    var2.field2205 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2197 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2197 = 2;
            }
        }
    }

    @ObfuscatedName("eg.q(IIILjava/lang/Object;I)Ley;")
    public final class154 method2685(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field2202 = arg0;
        var5.field2203 = arg1;
        var5.field2201 = arg3;
        synchronized (this) {
            if (this.field2209 == null) {
                this.field2209 = this.field2207 = var5;
            } else {
                this.field2209.field2198 = var5;
                this.field2209 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eg.x(Ljava/lang/String;II)Ley;")
    public final class154 method2698(String arg0, int arg1) {
        return this.method2685(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eg.y(Ljava/lang/Runnable;II)Ley;")
    public final class154 method2686(Runnable arg0, int arg1) {
        return this.method2685(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eg.e(II)Ley;")
    public final class154 method2705(int arg0) {
        return this.method2685(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("eg.f(Ljava/net/URL;B)Ley;")
    public final class154 method2684(URL arg0) {
        return this.method2685(4, 0, 0, arg0);
    }
}
