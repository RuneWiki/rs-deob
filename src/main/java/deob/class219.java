package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ir")
public class class219 implements Runnable {

    @ObfuscatedName("ir.ag")
    public class227 field2376 = null;

    @ObfuscatedName("ir.am")
    public class227 field2374 = null;

    @ObfuscatedName("ir.ax")
    public Thread field2375;

    @ObfuscatedName("ir.aq")
    public boolean field2373 = false;

    public class219() {
        Statics.field2378 = "Unknown";
        Statics.field2372 = "1.6";
        try {
            Statics.field2378 = System.getProperty("java.vendor");
            Statics.field2372 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2373 = false;
        this.field2375 = new Thread(this);
        this.field2375.setPriority(10);
        this.field2375.setDaemon(true);
        this.field2375.start();
    }

    @ObfuscatedName("ir.ac(I)V")
    public final void method4098() {
        synchronized (this) {
            this.field2373 = true;
            this.notifyAll();
        }
        try {
            this.field2375.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class227 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2373) {
                        return;
                    }
                    if (this.field2376 != null) {
                        var2 = this.field2376;
                        this.field2376 = this.field2376.field2436;
                        if (this.field2376 == null) {
                            this.field2374 = null;
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
                int var5 = var2.field2434;
                if (var5 == 1) {
                    var2.field2437 = new Socket(InetAddress.getByName((String) var2.field2433), var2.field2435);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2433);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2435);
                    var2.field2437 = var6;
                } else if (var5 == 4) {
                    var2.field2437 = new DataInputStream(((URL) var2.field2433).openStream());
                }
                var2.field2430 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2430 = 2;
            }
        }
    }

    @ObfuscatedName("ir.ae(IIILjava/lang/Object;I)Lig;")
    public final class227 method4087(int arg0, int arg1, int arg2, Object arg3) {
        class227 var5 = new class227();
        var5.field2434 = arg0;
        var5.field2435 = arg1;
        var5.field2433 = arg3;
        synchronized (this) {
            if (this.field2374 == null) {
                this.field2374 = this.field2376 = var5;
            } else {
                this.field2374.field2436 = var5;
                this.field2374 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ir.ag(Ljava/lang/String;IB)Lig;")
    public final class227 method4088(String arg0, int arg1) {
        return this.method4087(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ir.am(Ljava/lang/Runnable;II)Lig;")
    public final class227 method4099(Runnable arg0, int arg1) {
        return this.method4087(2, arg1, 0, arg0);
    }
}
