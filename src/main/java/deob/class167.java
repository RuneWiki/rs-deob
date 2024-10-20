package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fl")
public class class167 implements Runnable {

    @ObfuscatedName("fl.y")
    public class166 field2018 = null;

    @ObfuscatedName("fl.w")
    public class166 field2016 = null;

    @ObfuscatedName("fl.p")
    public Thread field2020;

    @ObfuscatedName("fl.b")
    public boolean field2021 = false;

    public class167() {
        Statics.field2019 = "Unknown";
        Statics.field2017 = "1.6";
        try {
            Statics.field2019 = System.getProperty("java.vendor");
            Statics.field2017 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2021 = false;
        this.field2020 = new Thread(this);
        this.field2020.setPriority(10);
        this.field2020.setDaemon(true);
        this.field2020.start();
    }

    @ObfuscatedName("fl.f(I)V")
    public final void method3161() {
        synchronized (this) {
            this.field2021 = true;
            this.notifyAll();
        }
        try {
            this.field2020.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2021) {
                        return;
                    }
                    if (this.field2018 != null) {
                        var2 = this.field2018;
                        this.field2018 = this.field2018.field2013;
                        if (this.field2018 == null) {
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
                int var5 = var2.field2011;
                if (var5 == 1) {
                    var2.field2015 = new Socket(InetAddress.getByName((String) var2.field2014), var2.field2012);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2014);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2012);
                    var2.field2015 = var6;
                } else if (var5 == 4) {
                    var2.field2015 = new DataInputStream(((URL) var2.field2014).openStream());
                }
                var2.field2010 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2010 = 2;
            }
        }
    }

    @ObfuscatedName("fl.i(IIILjava/lang/Object;B)Lfu;")
    public final class166 method3157(int arg0, int arg1, int arg2, Object arg3) {
        class166 var5 = new class166();
        var5.field2011 = arg0;
        var5.field2012 = arg1;
        var5.field2014 = arg3;
        synchronized (this) {
            if (this.field2016 == null) {
                this.field2016 = this.field2018 = var5;
            } else {
                this.field2016.field2013 = var5;
                this.field2016 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fl.y(Ljava/lang/String;II)Lfu;")
    public final class166 method3158(String arg0, int arg1) {
        return this.method3157(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fl.w(Ljava/lang/Runnable;II)Lfu;")
    public final class166 method3159(Runnable arg0, int arg1) {
        return this.method3157(2, arg1, 0, arg0);
    }
}
