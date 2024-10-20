package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ff")
public class class157 implements Runnable {

    @ObfuscatedName("ff.e")
    public class156 field2015 = null;

    @ObfuscatedName("ff.q")
    public class156 field2013 = null;

    @ObfuscatedName("ff.c")
    public Thread field2017;

    @ObfuscatedName("ff.l")
    public boolean field2016 = false;

    public class157() {
        Statics.field2018 = "Unknown";
        Statics.field2014 = "1.6";
        try {
            Statics.field2018 = System.getProperty("java.vendor");
            Statics.field2014 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2016 = false;
        this.field2017 = new Thread(this);
        this.field2017.setPriority(10);
        this.field2017.setDaemon(true);
        this.field2017.start();
    }

    @ObfuscatedName("ff.g(I)V")
    public final void method3190() {
        synchronized (this) {
            this.field2016 = true;
            this.notifyAll();
        }
        try {
            this.field2017.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class156 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2016) {
                        return;
                    }
                    if (this.field2015 != null) {
                        var2 = this.field2015;
                        this.field2015 = this.field2015.field2005;
                        if (this.field2015 == null) {
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
                int var5 = var2.field2009;
                if (var5 == 1) {
                    var2.field2012 = new Socket(InetAddress.getByName((String) var2.field2004), var2.field2010);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2004);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2010);
                    var2.field2012 = var6;
                } else if (var5 == 4) {
                    var2.field2012 = new DataInputStream(((URL) var2.field2004).openStream());
                }
                var2.field2008 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2008 = 2;
            }
        }
    }

    @ObfuscatedName("ff.r(IIILjava/lang/Object;I)Let;")
    public final class156 method3189(int arg0, int arg1, int arg2, Object arg3) {
        class156 var5 = new class156();
        var5.field2009 = arg0;
        var5.field2010 = arg1;
        var5.field2004 = arg3;
        synchronized (this) {
            if (this.field2013 == null) {
                this.field2013 = this.field2015 = var5;
            } else {
                this.field2013.field2005 = var5;
                this.field2013 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ff.e(Ljava/lang/String;II)Let;")
    public final class156 method3187(String arg0, int arg1) {
        return this.method3189(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ff.q(Ljava/lang/Runnable;IB)Let;")
    public final class156 method3200(Runnable arg0, int arg1) {
        return this.method3189(2, arg1, 0, arg0);
    }
}
