package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fu")
public class class167 implements Runnable {

    @ObfuscatedName("fu.i")
    public class166 field2017 = null;

    @ObfuscatedName("fu.k")
    public class166 field2018 = null;

    @ObfuscatedName("fu.u")
    public Thread field2019;

    @ObfuscatedName("fu.n")
    public boolean field2020 = false;

    public class167() {
        Statics.field2021 = "Unknown";
        Statics.field2015 = "1.6";
        try {
            Statics.field2021 = System.getProperty("java.vendor");
            Statics.field2015 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2020 = false;
        this.field2019 = new Thread(this);
        this.field2019.setPriority(10);
        this.field2019.setDaemon(true);
        this.field2019.start();
    }

    @ObfuscatedName("fu.s(I)V")
    public final void method3190() {
        synchronized (this) {
            this.field2020 = true;
            this.notifyAll();
        }
        try {
            this.field2019.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2020) {
                        return;
                    }
                    if (this.field2017 != null) {
                        var2 = this.field2017;
                        this.field2017 = this.field2017.field2006;
                        if (this.field2017 == null) {
                            this.field2018 = null;
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
                    var2.field2014 = new Socket(InetAddress.getByName((String) var2.field2013), var2.field2012);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2013);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2012);
                    var2.field2014 = var6;
                } else if (var5 == 4) {
                    var2.field2014 = new DataInputStream(((URL) var2.field2013).openStream());
                }
                var2.field2010 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2010 = 2;
            }
        }
    }

    @ObfuscatedName("fu.j(IIILjava/lang/Object;I)Lft;")
    public final class166 method3182(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2009 = arg0;
        var5.field2012 = arg1;
        var5.field2013 = arg3;
        synchronized (this) {
            if (this.field2018 == null) {
                this.field2018 = this.field2017 = var5;
            } else {
                this.field2018.field2006 = var5;
                this.field2018 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fu.i(Ljava/lang/String;IB)Lft;")
    public final class166 method3180(String arg0, int arg1) {
        return this.method3182(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fu.k(Ljava/lang/Runnable;IB)Lft;")
    public final class166 method3192(Runnable arg0, int arg1) {
        return this.method3182(2, arg1, 0, arg0);
    }
}
