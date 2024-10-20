package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fo")
public class class176 implements Runnable {

    @ObfuscatedName("fo.s")
    public class175 field2072 = null;

    @ObfuscatedName("fo.t")
    public class175 field2073 = null;

    @ObfuscatedName("fo.i")
    public Thread field2070;

    @ObfuscatedName("fo.o")
    public boolean field2075 = false;

    public class176() {
        Statics.field2071 = "Unknown";
        Statics.field2082 = "1.6";
        try {
            Statics.field2071 = System.getProperty("java.vendor");
            Statics.field2082 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2075 = false;
        this.field2070 = new Thread(this);
        this.field2070.setPriority(10);
        this.field2070.setDaemon(true);
        this.field2070.start();
    }

    @ObfuscatedName("fo.z(I)V")
    public final void method3274() {
        synchronized (this) {
            this.field2075 = true;
            this.notifyAll();
        }
        try {
            this.field2070.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class175 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2075) {
                        return;
                    }
                    if (this.field2072 != null) {
                        var2 = this.field2072;
                        this.field2072 = this.field2072.field2067;
                        if (this.field2072 == null) {
                            this.field2073 = null;
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
                int var5 = var2.field2066;
                if (var5 == 1) {
                    var2.field2068 = new Socket(InetAddress.getByName((String) var2.field2061), var2.field2063);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2061);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2063);
                    var2.field2068 = var6;
                } else if (var5 == 4) {
                    var2.field2068 = new DataInputStream(((URL) var2.field2061).openStream());
                }
                var2.field2065 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2065 = 2;
            }
        }
    }

    @ObfuscatedName("fo.k(IIILjava/lang/Object;B)Lfl;")
    public final class175 method3276(int arg0, int arg1, int arg2, Object arg3) {
        class175 var5 = new class175();
        var5.field2066 = arg0;
        var5.field2063 = arg1;
        var5.field2061 = arg3;
        synchronized (this) {
            if (this.field2073 == null) {
                this.field2073 = this.field2072 = var5;
            } else {
                this.field2073.field2067 = var5;
                this.field2073 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fo.s(Ljava/lang/String;II)Lfl;")
    public final class175 method3277(String arg0, int arg1) {
        return this.method3276(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fo.t(Ljava/lang/Runnable;II)Lfl;")
    public final class175 method3280(Runnable arg0, int arg1) {
        return this.method3276(2, arg1, 0, arg0);
    }
}
