package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ew")
public class class155 implements Runnable {

    @ObfuscatedName("ew.i")
    public class154 field2195 = null;

    @ObfuscatedName("ew.u")
    public class154 field2196 = null;

    @ObfuscatedName("ew.g")
    public Thread field2197;

    @ObfuscatedName("ew.m")
    public boolean field2199 = false;

    public class155() {
        Statics.field2198 = "Unknown";
        Statics.field2104 = "1.6";
        try {
            Statics.field2198 = System.getProperty("java.vendor");
            Statics.field2104 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2199 = false;
        this.field2197 = new Thread(this);
        this.field2197.setPriority(10);
        this.field2197.setDaemon(true);
        this.field2197.start();
    }

    @ObfuscatedName("ew.c(B)V")
    public final void method2658() {
        synchronized (this) {
            this.field2199 = true;
            this.notifyAll();
        }
        try {
            this.field2197.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2199) {
                        return;
                    }
                    if (this.field2195 != null) {
                        var2 = this.field2195;
                        this.field2195 = this.field2195.field2192;
                        if (this.field2195 == null) {
                            this.field2196 = null;
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
                int var5 = var2.field2190;
                if (var5 == 1) {
                    var2.field2193 = new Socket(InetAddress.getByName((String) var2.field2185), var2.field2191);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2185);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2191);
                    var2.field2193 = var6;
                } else if (var5 == 4) {
                    var2.field2193 = new DataInputStream(((URL) var2.field2185).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2191 >> 24 & 0xFF) + "." + (var2.field2191 >> 16 & 0xFF) + "." + (var2.field2191 >> 8 & 0xFF) + "." + (var2.field2191 & 0xFF);
                    var2.field2193 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2189 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2189 = 2;
            }
        }
    }

    @ObfuscatedName("ew.o(IIILjava/lang/Object;I)Ler;")
    public final class154 method2638(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field2190 = arg0;
        var5.field2191 = arg1;
        var5.field2185 = arg3;
        synchronized (this) {
            if (this.field2196 == null) {
                this.field2196 = this.field2195 = var5;
            } else {
                this.field2196.field2192 = var5;
                this.field2196 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ew.i(Ljava/lang/String;IB)Ler;")
    public final class154 method2639(String arg0, int arg1) {
        return this.method2638(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ew.u(Ljava/lang/Runnable;II)Ler;")
    public final class154 method2645(Runnable arg0, int arg1) {
        return this.method2638(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ew.g(IB)Ler;")
    public final class154 method2641(int arg0) {
        return this.method2638(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ew.m(Ljava/net/URL;I)Ler;")
    public final class154 method2637(URL arg0) {
        return this.method2638(4, 0, 0, arg0);
    }
}
