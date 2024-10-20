package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ff")
public class class157 implements Runnable {

    @ObfuscatedName("ff.i")
    public class166 field1714 = null;

    @ObfuscatedName("ff.f")
    public class166 field1712 = null;

    @ObfuscatedName("ff.b")
    public Thread field1716;

    @ObfuscatedName("ff.n")
    public boolean field1717 = false;

    public class157() {
        Statics.field1718 = "Unknown";
        Statics.field1713 = "1.6";
        try {
            Statics.field1718 = System.getProperty("java.vendor");
            Statics.field1713 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1717 = false;
        this.field1716 = new Thread(this);
        this.field1716.setPriority(10);
        this.field1716.setDaemon(true);
        this.field1716.start();
    }

    @ObfuscatedName("ff.v(I)V")
    public final void method2948() {
        synchronized (this) {
            this.field1717 = true;
            this.notifyAll();
        }
        try {
            this.field1716.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1717) {
                        return;
                    }
                    if (this.field1714 != null) {
                        var2 = this.field1714;
                        this.field1714 = this.field1714.field1777;
                        if (this.field1714 == null) {
                            this.field1712 = null;
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
                int var5 = var2.field1775;
                if (var5 == 1) {
                    var2.field1774 = new Socket(InetAddress.getByName((String) var2.field1781), var2.field1780);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1781);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1780);
                    var2.field1774 = var6;
                } else if (var5 == 4) {
                    var2.field1774 = new DataInputStream(((URL) var2.field1781).openStream());
                }
                var2.field1779 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1779 = 2;
            }
        }
    }

    @ObfuscatedName("ff.c(IIILjava/lang/Object;I)Lfx;")
    public final class166 method2947(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field1775 = arg0;
        var5.field1780 = arg1;
        var5.field1781 = arg3;
        synchronized (this) {
            if (this.field1712 == null) {
                this.field1712 = this.field1714 = var5;
            } else {
                this.field1712.field1777 = var5;
                this.field1712 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ff.i(Ljava/lang/String;II)Lfx;")
    public final class166 method2946(String arg0, int arg1) {
        return this.method2947(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ff.f(Ljava/lang/Runnable;II)Lfx;")
    public final class166 method2941(Runnable arg0, int arg1) {
        return this.method2947(2, arg1, 0, arg0);
    }
}
