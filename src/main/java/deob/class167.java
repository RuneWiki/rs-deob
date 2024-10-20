package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fq")
public class class167 implements Runnable {

    @ObfuscatedName("fq.t")
    public class166 field2010 = null;

    @ObfuscatedName("fq.g")
    public class166 field2006 = null;

    @ObfuscatedName("fq.l")
    public Thread field2003;

    @ObfuscatedName("fq.u")
    public boolean field2008 = false;

    public class167() {
        Statics.field2005 = "Unknown";
        Statics.field2004 = "1.6";
        try {
            Statics.field2005 = System.getProperty("java.vendor");
            Statics.field2004 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2008 = false;
        this.field2003 = new Thread(this);
        this.field2003.setPriority(10);
        this.field2003.setDaemon(true);
        this.field2003.start();
    }

    @ObfuscatedName("fq.c(B)V")
    public final void method3192() {
        synchronized (this) {
            this.field2008 = true;
            this.notifyAll();
        }
        try {
            this.field2003.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2008) {
                        return;
                    }
                    if (this.field2010 != null) {
                        var2 = this.field2010;
                        this.field2010 = this.field2010.field1994;
                        if (this.field2010 == null) {
                            this.field2006 = null;
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
                int var5 = var2.field1999;
                if (var5 == 1) {
                    var2.field2002 = new Socket(InetAddress.getByName((String) var2.field2001), var2.field2000);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2001);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2000);
                    var2.field2002 = var6;
                } else if (var5 == 4) {
                    var2.field2002 = new DataInputStream(((URL) var2.field2001).openStream());
                }
                var2.field1998 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1998 = 2;
            }
        }
    }

    @ObfuscatedName("fq.x(IIILjava/lang/Object;I)Lfc;")
    public final class166 method3193(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field1999 = arg0;
        var5.field2000 = arg1;
        var5.field2001 = arg3;
        synchronized (this) {
            if (this.field2006 == null) {
                this.field2006 = this.field2010 = var5;
            } else {
                this.field2006.field1994 = var5;
                this.field2006 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fq.t(Ljava/lang/String;IS)Lfc;")
    public final class166 method3213(String arg0, int arg1) {
        return this.method3193(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fq.g(Ljava/lang/Runnable;II)Lfc;")
    public final class166 method3195(Runnable arg0, int arg1) {
        return this.method3193(2, arg1, 0, arg0);
    }
}
