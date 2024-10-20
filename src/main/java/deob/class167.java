package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ff")
public class class167 implements Runnable {

    @ObfuscatedName("ff.n")
    public class166 field2015 = null;

    @ObfuscatedName("ff.q")
    public class166 field2016 = null;

    @ObfuscatedName("ff.v")
    public Thread field2012;

    @ObfuscatedName("ff.l")
    public boolean field2014 = false;

    public class167() {
        Statics.field2017 = "Unknown";
        Statics.field2013 = "1.6";
        try {
            Statics.field2017 = System.getProperty("java.vendor");
            Statics.field2013 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2014 = false;
        this.field2012 = new Thread(this);
        this.field2012.setPriority(10);
        this.field2012.setDaemon(true);
        this.field2012.start();
    }

    @ObfuscatedName("ff.a(I)V")
    public final void method3259() {
        synchronized (this) {
            this.field2014 = true;
            this.notifyAll();
        }
        try {
            this.field2012.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2014) {
                        return;
                    }
                    if (this.field2015 != null) {
                        var2 = this.field2015;
                        this.field2015 = this.field2015.field2005;
                        if (this.field2015 == null) {
                            this.field2016 = null;
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
                int var5 = var2.field2008;
                if (var5 == 1) {
                    var2.field2011 = new Socket(InetAddress.getByName((String) var2.field2010), var2.field2009);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2010);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2009);
                    var2.field2011 = var6;
                } else if (var5 == 4) {
                    var2.field2011 = new DataInputStream(((URL) var2.field2010).openStream());
                }
                var2.field2007 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2007 = 2;
            }
        }
    }

    @ObfuscatedName("ff.t(IIILjava/lang/Object;I)Lfw;")
    public final class166 method3266(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2008 = arg0;
        var5.field2009 = arg1;
        var5.field2010 = arg3;
        synchronized (this) {
            if (this.field2016 == null) {
                this.field2016 = this.field2015 = var5;
            } else {
                this.field2016.field2005 = var5;
                this.field2016 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ff.n(Ljava/lang/String;II)Lfw;")
    public final class166 method3261(String arg0, int arg1) {
        return this.method3266(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ff.q(Ljava/lang/Runnable;II)Lfw;")
    public final class166 method3260(Runnable arg0, int arg1) {
        return this.method3266(2, arg1, 0, arg0);
    }
}
