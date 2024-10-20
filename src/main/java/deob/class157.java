package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fu")
public class class157 implements Runnable {

    @ObfuscatedName("fu.w")
    public class165 field1718 = null;

    @ObfuscatedName("fu.v")
    public class165 field1720 = null;

    @ObfuscatedName("fu.c")
    public Thread field1721;

    @ObfuscatedName("fu.q")
    public boolean field1722 = false;

    public class157() {
        Statics.field1717 = "Unknown";
        Statics.field1724 = "1.6";
        try {
            Statics.field1717 = System.getProperty("java.vendor");
            Statics.field1724 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1722 = false;
        this.field1721 = new Thread(this);
        this.field1721.setPriority(10);
        this.field1721.setDaemon(true);
        this.field1721.start();
    }

    @ObfuscatedName("fu.s(I)V")
    public final void method2883() {
        synchronized (this) {
            this.field1722 = true;
            this.notifyAll();
        }
        try {
            this.field1721.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class165 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1722) {
                        return;
                    }
                    if (this.field1718 != null) {
                        var2 = this.field1718;
                        this.field1718 = this.field1718.field1780;
                        if (this.field1718 == null) {
                            this.field1720 = null;
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
                int var5 = var2.field1783;
                if (var5 == 1) {
                    var2.field1778 = new Socket(InetAddress.getByName((String) var2.field1782), var2.field1781);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1782);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1781);
                    var2.field1778 = var6;
                } else if (var5 == 4) {
                    var2.field1778 = new DataInputStream(((URL) var2.field1782).openStream());
                }
                var2.field1779 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1779 = 2;
            }
        }
    }

    @ObfuscatedName("fu.h(IIILjava/lang/Object;B)Lfq;")
    public final class165 method2886(int arg0, int arg1, int arg2, Object arg3) {
        class165 var5 = new class165();
        var5.field1783 = arg0;
        var5.field1781 = arg1;
        var5.field1782 = arg3;
        synchronized (this) {
            if (this.field1720 == null) {
                this.field1720 = this.field1718 = var5;
            } else {
                this.field1720.field1780 = var5;
                this.field1720 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fu.w(Ljava/lang/String;II)Lfq;")
    public final class165 method2876(String arg0, int arg1) {
        return this.method2886(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fu.v(Ljava/lang/Runnable;II)Lfq;")
    public final class165 method2877(Runnable arg0, int arg1) {
        return this.method2886(2, arg1, 0, arg0);
    }
}
