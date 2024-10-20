package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ea")
public class class155 implements Runnable {

    @ObfuscatedName("ea.q")
    public class154 field1974 = null;

    @ObfuscatedName("ea.b")
    public class154 field1975 = null;

    @ObfuscatedName("ea.f")
    public Thread field1976;

    @ObfuscatedName("ea.n")
    public boolean field1977 = false;

    public class155() {
        Statics.field1973 = "Unknown";
        Statics.field1972 = "1.6";
        try {
            Statics.field1973 = System.getProperty("java.vendor");
            Statics.field1972 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1977 = false;
        this.field1976 = new Thread(this);
        this.field1976.setPriority(10);
        this.field1976.setDaemon(true);
        this.field1976.start();
    }

    @ObfuscatedName("ea.w(I)V")
    public final void method3000() {
        synchronized (this) {
            this.field1977 = true;
            this.notifyAll();
        }
        try {
            this.field1976.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1977) {
                        return;
                    }
                    if (this.field1974 != null) {
                        var2 = this.field1974;
                        this.field1974 = this.field1974.field1966;
                        if (this.field1974 == null) {
                            this.field1975 = null;
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
                int var5 = var2.field1968;
                if (var5 == 1) {
                    var2.field1971 = new Socket(InetAddress.getByName((String) var2.field1970), var2.field1963);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1970);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1963);
                    var2.field1971 = var6;
                } else if (var5 == 4) {
                    var2.field1971 = new DataInputStream(((URL) var2.field1970).openStream());
                }
                var2.field1967 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1967 = 2;
            }
        }
    }

    @ObfuscatedName("ea.m(IIILjava/lang/Object;B)Led;")
    public final class154 method3002(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field1968 = arg0;
        var5.field1963 = arg1;
        var5.field1970 = arg3;
        synchronized (this) {
            if (this.field1975 == null) {
                this.field1975 = this.field1974 = var5;
            } else {
                this.field1975.field1966 = var5;
                this.field1975 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ea.q(Ljava/lang/String;II)Led;")
    public final class154 method3004(String arg0, int arg1) {
        return this.method3002(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ea.x(Ljava/lang/Runnable;IB)Led;")
    public final class154 method3011(Runnable arg0, int arg1) {
        return this.method3002(2, arg1, 0, arg0);
    }
}
