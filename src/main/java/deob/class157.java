package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fc")
public class class157 implements Runnable {

    @ObfuscatedName("fc.e")
    public class156 field1999 = null;

    @ObfuscatedName("fc.b")
    public class156 field2000 = null;

    @ObfuscatedName("fc.l")
    public Thread field2006;

    @ObfuscatedName("fc.w")
    public boolean field2002 = false;

    public class157() {
        Statics.field2005 = "Unknown";
        Statics.field1998 = "1.6";
        try {
            Statics.field2005 = System.getProperty("java.vendor");
            Statics.field1998 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2002 = false;
        this.field2006 = new Thread(this);
        this.field2006.setPriority(10);
        this.field2006.setDaemon(true);
        this.field2006.start();
    }

    @ObfuscatedName("fc.f(B)V")
    public final void method3050() {
        synchronized (this) {
            this.field2002 = true;
            this.notifyAll();
        }
        try {
            this.field2006.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class156 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2002) {
                        return;
                    }
                    if (this.field1999 != null) {
                        var2 = this.field1999;
                        this.field1999 = this.field1999.field1991;
                        if (this.field1999 == null) {
                            this.field2000 = null;
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
                int var5 = var2.field1993;
                if (var5 == 1) {
                    var2.field1989 = new Socket(InetAddress.getByName((String) var2.field1995), var2.field1994);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1995);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1994);
                    var2.field1989 = var6;
                } else if (var5 == 4) {
                    var2.field1989 = new DataInputStream(((URL) var2.field1995).openStream());
                }
                var2.field1992 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1992 = 2;
            }
        }
    }

    @ObfuscatedName("fc.h(IIILjava/lang/Object;S)Les;")
    public final class156 method3065(int arg0, int arg1, int arg2, Object arg3) {
        class156 var5 = new class156();
        var5.field1993 = arg0;
        var5.field1994 = arg1;
        var5.field1995 = arg3;
        synchronized (this) {
            if (this.field2000 == null) {
                this.field2000 = this.field1999 = var5;
            } else {
                this.field2000.field1991 = var5;
                this.field2000 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fc.e(Ljava/lang/String;IB)Les;")
    public final class156 method3057(String arg0, int arg1) {
        return this.method3065(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fc.b(Ljava/lang/Runnable;IS)Les;")
    public final class156 method3052(Runnable arg0, int arg1) {
        return this.method3065(2, arg1, 0, arg0);
    }
}
