package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fu")
public class class157 implements Runnable {

    @ObfuscatedName("fu.o")
    public class156 field2003 = null;

    @ObfuscatedName("fu.k")
    public class156 field1999 = null;

    @ObfuscatedName("fu.u")
    public Thread field1997;

    @ObfuscatedName("fu.i")
    public boolean field2001 = false;

    public class157() {
        Statics.field1998 = "Unknown";
        Statics.field1920 = "1.6";
        try {
            Statics.field1998 = System.getProperty("java.vendor");
            Statics.field1920 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2001 = false;
        this.field1997 = new Thread(this);
        this.field1997.setPriority(10);
        this.field1997.setDaemon(true);
        this.field1997.start();
    }

    @ObfuscatedName("fu.v(I)V")
    public final void method3000() {
        synchronized (this) {
            this.field2001 = true;
            this.notifyAll();
        }
        try {
            this.field1997.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class156 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2001) {
                        return;
                    }
                    if (this.field2003 != null) {
                        var2 = this.field2003;
                        this.field2003 = this.field2003.field1993;
                        if (this.field2003 == null) {
                            this.field1999 = null;
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
                int var5 = var2.field1990;
                if (var5 == 1) {
                    var2.field1988 = new Socket(InetAddress.getByName((String) var2.field1995), var2.field1994);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1995);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1994);
                    var2.field1988 = var6;
                } else if (var5 == 4) {
                    var2.field1988 = new DataInputStream(((URL) var2.field1995).openStream());
                }
                var2.field1992 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1992 = 2;
            }
        }
    }

    @ObfuscatedName("fu.s(IIILjava/lang/Object;B)Leg;")
    public final class156 method3002(int arg0, int arg1, int arg2, Object arg3) {
        class156 var5 = new class156();
        var5.field1990 = arg0;
        var5.field1994 = arg1;
        var5.field1995 = arg3;
        synchronized (this) {
            if (this.field1999 == null) {
                this.field1999 = this.field2003 = var5;
            } else {
                this.field1999.field1993 = var5;
                this.field1999 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fu.o(Ljava/lang/String;IB)Leg;")
    public final class156 method3003(String arg0, int arg1) {
        return this.method3002(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fu.k(Ljava/lang/Runnable;II)Leg;")
    public final class156 method3004(Runnable arg0, int arg1) {
        return this.method3002(2, arg1, 0, arg0);
    }
}
