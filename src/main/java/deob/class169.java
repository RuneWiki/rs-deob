package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ge")
public class class169 implements Runnable {

    @ObfuscatedName("ge.ac")
    public class178 field1803 = null;

    @ObfuscatedName("ge.ab")
    public class178 field1806 = null;

    @ObfuscatedName("ge.an")
    public Thread field1807;

    @ObfuscatedName("ge.ao")
    public boolean field1808 = false;

    public class169() {
        Statics.field1809 = "Unknown";
        Statics.field1804 = "1.6";
        try {
            Statics.field1809 = System.getProperty("java.vendor");
            Statics.field1804 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1808 = false;
        this.field1807 = new Thread(this);
        this.field1807.setPriority(10);
        this.field1807.setDaemon(true);
        this.field1807.start();
    }

    @ObfuscatedName("ge.aj(B)V")
    public final void method3175() {
        synchronized (this) {
            this.field1808 = true;
            this.notifyAll();
        }
        try {
            this.field1807.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class178 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1808) {
                        return;
                    }
                    if (this.field1803 != null) {
                        var2 = this.field1803;
                        this.field1803 = this.field1803.field1858;
                        if (this.field1803 == null) {
                            this.field1806 = null;
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
                int var5 = var2.field1859;
                if (var5 == 1) {
                    var2.field1853 = new Socket(InetAddress.getByName((String) var2.field1855), var2.field1857);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1855);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1857);
                    var2.field1853 = var6;
                } else if (var5 == 4) {
                    var2.field1853 = new DataInputStream(((URL) var2.field1855).openStream());
                }
                var2.field1856 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1856 = 2;
            }
        }
    }

    @ObfuscatedName("ge.al(IIILjava/lang/Object;I)Lgf;")
    public final class178 method3168(int arg0, int arg1, int arg2, Object arg3) {
        class178 var5 = new class178();
        var5.field1859 = arg0;
        var5.field1857 = arg1;
        var5.field1855 = arg3;
        synchronized (this) {
            if (this.field1806 == null) {
                this.field1806 = this.field1803 = var5;
            } else {
                this.field1806.field1858 = var5;
                this.field1806 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ge.ac(Ljava/lang/String;IB)Lgf;")
    public final class178 method3169(String arg0, int arg1) {
        return this.method3168(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ge.ab(Ljava/lang/Runnable;II)Lgf;")
    public final class178 method3170(Runnable arg0, int arg1) {
        return this.method3168(2, arg1, 0, arg0);
    }
}
