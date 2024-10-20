package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("io")
public class class219 implements Runnable {

    @ObfuscatedName("io.ak")
    public class227 field2373 = null;

    @ObfuscatedName("io.aj")
    public class227 field2371 = null;

    @ObfuscatedName("io.ai")
    public Thread field2379;

    @ObfuscatedName("io.ay")
    public boolean field2376 = false;

    public class219() {
        Statics.field2375 = "Unknown";
        Statics.field2372 = "1.6";
        try {
            Statics.field2375 = System.getProperty("java.vendor");
            Statics.field2372 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2376 = false;
        this.field2379 = new Thread(this);
        this.field2379.setPriority(10);
        this.field2379.setDaemon(true);
        this.field2379.start();
    }

    @ObfuscatedName("io.ap(B)V")
    public final void method4221() {
        synchronized (this) {
            this.field2376 = true;
            this.notifyAll();
        }
        try {
            this.field2379.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class227 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2376) {
                        return;
                    }
                    if (this.field2373 != null) {
                        var2 = this.field2373;
                        this.field2373 = this.field2373.field2429;
                        if (this.field2373 == null) {
                            this.field2371 = null;
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
                int var5 = var2.field2436;
                if (var5 == 1) {
                    var2.field2435 = new Socket(InetAddress.getByName((String) var2.field2431), var2.field2434);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2431);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2434);
                    var2.field2435 = var6;
                } else if (var5 == 4) {
                    var2.field2435 = new DataInputStream(((URL) var2.field2431).openStream());
                }
                var2.field2432 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2432 = 2;
            }
        }
    }

    @ObfuscatedName("io.aw(IIILjava/lang/Object;I)Liz;")
    public final class227 method4222(int arg0, int arg1, int arg2, Object arg3) {
        class227 var5 = new class227();
        var5.field2436 = arg0;
        var5.field2434 = arg1;
        var5.field2431 = arg3;
        synchronized (this) {
            if (this.field2371 == null) {
                this.field2371 = this.field2373 = var5;
            } else {
                this.field2371.field2429 = var5;
                this.field2371 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("io.ak(Ljava/lang/String;II)Liz;")
    public final class227 method4223(String arg0, int arg1) {
        return this.method4222(1, arg1, 0, arg0);
    }

    @ObfuscatedName("io.aj(Ljava/lang/Runnable;II)Liz;")
    public final class227 method4224(Runnable arg0, int arg1) {
        return this.method4222(2, arg1, 0, arg0);
    }
}
