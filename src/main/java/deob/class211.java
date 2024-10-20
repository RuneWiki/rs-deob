package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ij")
public class class211 implements Runnable {

    @ObfuscatedName("ij.af")
    public class219 field2291 = null;

    @ObfuscatedName("ij.aj")
    public class219 field2292 = null;

    @ObfuscatedName("ij.aq")
    public Thread field2290;

    @ObfuscatedName("ij.ar")
    public boolean field2294 = false;

    public class211() {
        Statics.field2467 = "Unknown";
        Statics.field2293 = "1.6";
        try {
            Statics.field2467 = System.getProperty("java.vendor");
            Statics.field2293 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2294 = false;
        this.field2290 = new Thread(this);
        this.field2290.setPriority(10);
        this.field2290.setDaemon(true);
        this.field2290.start();
    }

    @ObfuscatedName("ij.am(I)V")
    public final void method3887() {
        synchronized (this) {
            this.field2294 = true;
            this.notifyAll();
        }
        try {
            this.field2290.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class219 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2294) {
                        return;
                    }
                    if (this.field2291 != null) {
                        var2 = this.field2291;
                        this.field2291 = this.field2291.field2346;
                        if (this.field2291 == null) {
                            this.field2292 = null;
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
                int var5 = var2.field2347;
                if (var5 == 1) {
                    var2.field2350 = new Socket(InetAddress.getByName((String) var2.field2349), var2.field2348);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2349);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2348);
                    var2.field2350 = var6;
                } else if (var5 == 4) {
                    var2.field2350 = new DataInputStream(((URL) var2.field2349).openStream());
                }
                var2.field2344 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2344 = 2;
            }
        }
    }

    @ObfuscatedName("ij.ap(IIILjava/lang/Object;B)Lil;")
    public final class219 method3888(int arg0, int arg1, int arg2, Object arg3) {
        class219 var5 = new class219();
        var5.field2347 = arg0;
        var5.field2348 = arg1;
        var5.field2349 = arg3;
        synchronized (this) {
            if (this.field2292 == null) {
                this.field2292 = this.field2291 = var5;
            } else {
                this.field2292.field2346 = var5;
                this.field2292 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ij.af(Ljava/lang/String;II)Lil;")
    public final class219 method3889(String arg0, int arg1) {
        return this.method3888(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ij.aj(Ljava/lang/Runnable;II)Lil;")
    public final class219 method3903(Runnable arg0, int arg1) {
        return this.method3888(2, arg1, 0, arg0);
    }
}
