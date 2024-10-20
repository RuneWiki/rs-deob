package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("fo")
public class class157 implements Runnable {

    @ObfuscatedName("fo.m")
    public class156 field2012 = null;

    @ObfuscatedName("fo.j")
    public class156 field2007 = null;

    @ObfuscatedName("fo.g")
    public Thread field2009;

    @ObfuscatedName("fo.i")
    public boolean field2010 = false;

    public class157() {
        Statics.field3766 = "Unknown";
        Statics.field483 = "1.6";
        try {
            Statics.field3766 = System.getProperty("java.vendor");
            Statics.field483 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2010 = false;
        this.field2009 = new Thread(this);
        this.field2009.setPriority(10);
        this.field2009.setDaemon(true);
        this.field2009.start();
    }

    @ObfuscatedName("fo.c(I)V")
    public final void method2983() {
        synchronized (this) {
            this.field2010 = true;
            this.notifyAll();
        }
        try {
            this.field2009.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class156 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2010) {
                        return;
                    }
                    if (this.field2012 != null) {
                        var2 = this.field2012;
                        this.field2012 = this.field2012.field2000;
                        if (this.field2012 == null) {
                            this.field2007 = null;
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
                int var5 = var2.field2003;
                if (var5 == 1) {
                    var2.field1998 = new Socket(InetAddress.getByName((String) var2.field2005), var2.field2002);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2005);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2002);
                    var2.field1998 = var6;
                } else if (var5 == 4) {
                    var2.field1998 = new DataInputStream(((URL) var2.field2005).openStream());
                }
                var2.field2004 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2004 = 2;
            }
        }
    }

    @ObfuscatedName("fo.q(IIILjava/lang/Object;I)Lel;")
    public final class156 method2995(int arg0, int arg1, int arg2, Object arg3) {
        class156 var5 = new class156();
        var5.field2003 = arg0;
        var5.field2002 = arg1;
        var5.field2005 = arg3;
        synchronized (this) {
            if (this.field2007 == null) {
                this.field2007 = this.field2012 = var5;
            } else {
                this.field2007.field2000 = var5;
                this.field2007 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("fo.m(Ljava/lang/String;II)Lel;")
    public final class156 method2985(String arg0, int arg1) {
        return this.method2995(1, arg1, 0, arg0);
    }

    @ObfuscatedName("fo.j(Ljava/lang/Runnable;II)Lel;")
    public final class156 method2986(Runnable arg0, int arg1) {
        return this.method2995(2, arg1, 0, arg0);
    }
}
