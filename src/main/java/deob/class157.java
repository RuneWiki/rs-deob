package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fd")
public class class157 implements Runnable {

    @ObfuscatedName("fd.w")
    public class156 field2015 = null;

    @ObfuscatedName("fd.s")
    public class156 field2017 = null;

    @ObfuscatedName("fd.e")
    public Thread field2018;

    @ObfuscatedName("fd.a")
    public boolean field2019 = false;

    public class157() {
        Statics.field4012 = "Unknown";
        Statics.field2020 = "1.6";
        try {
            Statics.field4012 = System.getProperty("java.vendor");
            Statics.field2020 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2019 = false;
        this.field2018 = new Thread(this);
        this.field2018.setPriority(10);
        this.field2018.setDaemon(true);
        this.field2018.start();
    }

    @ObfuscatedName("fd.f(I)V")
    public final void method3074() {
        synchronized (this) {
            this.field2019 = true;
            this.notifyAll();
        }
        try {
            this.field2018.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class156 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2019) {
                        return;
                    }
                    if (this.field2015 != null) {
                        var2 = this.field2015;
                        this.field2015 = this.field2015.field2009;
                        if (this.field2015 == null) {
                            this.field2017 = null;
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
                int var5 = var2.field2011;
                if (var5 == 1) {
                    var2.field2012 = new Socket(InetAddress.getByName((String) var2.field2013), var2.field2006);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2013);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2006);
                    var2.field2012 = var6;
                } else if (var5 == 4) {
                    var2.field2012 = new DataInputStream(((URL) var2.field2013).openStream());
                }
                var2.field2010 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2010 = 2;
            }
        }
    }

    @ObfuscatedName("fd.l(IIILjava/lang/Object;S)Led;")
    public final class156 method3069(int arg0, int arg1, int arg2, Object arg3) {
        class156 var5 = new class156();
        var5.field2011 = arg0;
        var5.field2006 = arg1;
        var5.field2013 = arg3;
        synchronized (this) {
            if (this.field2017 == null) {
                this.field2017 = this.field2015 = var5;
            } else {
                this.field2017.field2009 = var5;
                this.field2017 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fd.w(Ljava/lang/String;IB)Led;")
    public final class156 method3086(String arg0, int arg1) {
        return this.method3069(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fd.s(Ljava/lang/Runnable;IB)Led;")
    public final class156 method3077(Runnable arg0, int arg1) {
        return this.method3069(2, arg1, 0, arg0);
    }
}
