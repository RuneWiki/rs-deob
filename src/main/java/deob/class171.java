package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("gr")
public class class171 implements Runnable {

    @ObfuscatedName("gr.av")
    public class180 field1815 = null;

    @ObfuscatedName("gr.as")
    public class180 field1817 = null;

    @ObfuscatedName("gr.ax")
    public Thread field1818;

    @ObfuscatedName("gr.ap")
    public boolean field1820 = false;

    public class171() {
        Statics.field1819 = "Unknown";
        Statics.field1816 = "1.6";
        try {
            Statics.field1819 = System.getProperty("java.vendor");
            Statics.field1816 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1820 = false;
        this.field1818 = new Thread(this);
        this.field1818.setPriority(10);
        this.field1818.setDaemon(true);
        this.field1818.start();
    }

    @ObfuscatedName("gr.at(I)V")
    public final void method3178() {
        synchronized (this) {
            this.field1820 = true;
            this.notifyAll();
        }
        try {
            this.field1818.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class180 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1820) {
                        return;
                    }
                    if (this.field1815 != null) {
                        var2 = this.field1815;
                        this.field1815 = this.field1815.field1873;
                        if (this.field1815 == null) {
                            this.field1817 = null;
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
                int var5 = var2.field1870;
                if (var5 == 1) {
                    var2.field1866 = new Socket(InetAddress.getByName((String) var2.field1868), var2.field1871);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1868);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1871);
                    var2.field1866 = var6;
                } else if (var5 == 4) {
                    var2.field1866 = new DataInputStream(((URL) var2.field1868).openStream());
                }
                var2.field1869 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1869 = 2;
            }
        }
    }

    @ObfuscatedName("gr.an(IIILjava/lang/Object;I)Lgu;")
    public final class180 method3177(int arg0, int arg1, int arg2, Object arg3) {
        class180 var5 = new class180();
        var5.field1870 = arg0;
        var5.field1871 = arg1;
        var5.field1868 = arg3;
        synchronized (this) {
            if (this.field1817 == null) {
                this.field1817 = this.field1815 = var5;
            } else {
                this.field1817.field1873 = var5;
                this.field1817 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("gr.av(Ljava/lang/String;II)Lgu;")
    public final class180 method3179(String arg0, int arg1) {
        return this.method3177(1, arg1, 0, arg0);
    }

    @ObfuscatedName("gr.as(Ljava/lang/Runnable;II)Lgu;")
    public final class180 method3180(Runnable arg0, int arg1) {
        return this.method3177(2, arg1, 0, arg0);
    }
}
