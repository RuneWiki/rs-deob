package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fm")
public class class167 implements Runnable {

    @ObfuscatedName("fm.v")
    public class166 field2012 = null;

    @ObfuscatedName("fm.u")
    public class166 field2013 = null;

    @ObfuscatedName("fm.r")
    public Thread field2018;

    @ObfuscatedName("fm.p")
    public boolean field2017 = false;

    public class167() {
        Statics.field2019 = "Unknown";
        Statics.field2011 = "1.6";
        try {
            Statics.field2019 = System.getProperty("java.vendor");
            Statics.field2011 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2017 = false;
        this.field2018 = new Thread(this);
        this.field2018.setPriority(10);
        this.field2018.setDaemon(true);
        this.field2018.start();
    }

    @ObfuscatedName("fm.z(I)V")
    public final void method3120() {
        synchronized (this) {
            this.field2017 = true;
            this.notifyAll();
        }
        try {
            this.field2018.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2017) {
                        return;
                    }
                    if (this.field2012 != null) {
                        var2 = this.field2012;
                        this.field2012 = this.field2012.field2009;
                        if (this.field2012 == null) {
                            this.field2013 = null;
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
                int var5 = var2.field2006;
                if (var5 == 1) {
                    var2.field2001 = new Socket(InetAddress.getByName((String) var2.field2008), var2.field2007);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2008);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2007);
                    var2.field2001 = var6;
                } else if (var5 == 4) {
                    var2.field2001 = new DataInputStream(((URL) var2.field2008).openStream());
                }
                var2.field2005 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2005 = 2;
            }
        }
    }

    @ObfuscatedName("fm.n(IIILjava/lang/Object;S)Lfv;")
    public final class166 method3121(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2006 = arg0;
        var5.field2007 = arg1;
        var5.field2008 = arg3;
        synchronized (this) {
            if (this.field2013 == null) {
                this.field2013 = this.field2012 = var5;
            } else {
                this.field2013.field2009 = var5;
                this.field2013 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fm.v(Ljava/lang/String;II)Lfv;")
    public final class166 method3122(String arg0, int arg1) {
        return this.method3121(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fm.u(Ljava/lang/Runnable;II)Lfv;")
    public final class166 method3131(Runnable arg0, int arg1) {
        return this.method3121(2, arg1, 0, arg0);
    }
}
