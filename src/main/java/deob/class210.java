package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ih")
public class class210 implements Runnable {

    @ObfuscatedName("ih.ar")
    public class219 field2270 = null;

    @ObfuscatedName("ih.ao")
    public class219 field2272 = null;

    @ObfuscatedName("ih.ab")
    public Thread field2268;

    @ObfuscatedName("ih.au")
    public boolean field2273 = false;

    public class210() {
        Statics.field2269 = "Unknown";
        Statics.field2271 = "1.6";
        try {
            Statics.field2269 = System.getProperty("java.vendor");
            Statics.field2271 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2273 = false;
        this.field2268 = new Thread(this);
        this.field2268.setPriority(10);
        this.field2268.setDaemon(true);
        this.field2268.start();
    }

    @ObfuscatedName("ih.at(I)V")
    public final void method3871() {
        synchronized (this) {
            this.field2273 = true;
            this.notifyAll();
        }
        try {
            this.field2268.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class219 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2273) {
                        return;
                    }
                    if (this.field2270 != null) {
                        var2 = this.field2270;
                        this.field2270 = this.field2270.field2323;
                        if (this.field2270 == null) {
                            this.field2272 = null;
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
                int var5 = var2.field2327;
                if (var5 == 1) {
                    var2.field2325 = new Socket(InetAddress.getByName((String) var2.field2329), var2.field2328);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2329);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2328);
                    var2.field2325 = var6;
                } else if (var5 == 4) {
                    var2.field2325 = new DataInputStream(((URL) var2.field2329).openStream());
                }
                var2.field2326 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2326 = 2;
            }
        }
    }

    @ObfuscatedName("ih.ah(IIILjava/lang/Object;I)Liq;")
    public final class219 method3873(int arg0, int arg1, int arg2, Object arg3) {
        class219 var5 = new class219();
        var5.field2327 = arg0;
        var5.field2328 = arg1;
        var5.field2329 = arg3;
        synchronized (this) {
            if (this.field2272 == null) {
                this.field2272 = this.field2270 = var5;
            } else {
                this.field2272.field2323 = var5;
                this.field2272 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ih.ar(Ljava/lang/String;II)Liq;")
    public final class219 method3870(String arg0, int arg1) {
        return this.method3873(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ih.ao(Ljava/lang/Runnable;II)Liq;")
    public final class219 method3875(Runnable arg0, int arg1) {
        return this.method3873(2, arg1, 0, arg0);
    }
}
