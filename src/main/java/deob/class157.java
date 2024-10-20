package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ft")
public class class157 implements Runnable {

    @ObfuscatedName("ft.n")
    public class156 field1993 = null;

    @ObfuscatedName("ft.u")
    public class156 field2000 = null;

    @ObfuscatedName("ft.i")
    public Thread field1997;

    @ObfuscatedName("ft.r")
    public boolean field1998 = false;

    public class157() {
        Statics.field1995 = "Unknown";
        Statics.field1994 = "1.6";
        try {
            Statics.field1995 = System.getProperty("java.vendor");
            Statics.field1994 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1998 = false;
        this.field1997 = new Thread(this);
        this.field1997.setPriority(10);
        this.field1997.setDaemon(true);
        this.field1997.start();
    }

    @ObfuscatedName("ft.y(I)V")
    public final void method3002() {
        synchronized (this) {
            this.field1998 = true;
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
                    if (this.field1998) {
                        return;
                    }
                    if (this.field1993 != null) {
                        var2 = this.field1993;
                        this.field1993 = this.field1993.field1988;
                        if (this.field1993 == null) {
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
                int var5 = var2.field1985;
                if (var5 == 1) {
                    var2.field1992 = new Socket(InetAddress.getByName((String) var2.field1991), var2.field1989);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1991);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1989);
                    var2.field1992 = var6;
                } else if (var5 == 4) {
                    var2.field1992 = new DataInputStream(((URL) var2.field1991).openStream());
                }
                var2.field1987 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1987 = 2;
            }
        }
    }

    @ObfuscatedName("ft.c(IIILjava/lang/Object;I)Lez;")
    public final class156 method2998(int arg0, int arg1, int arg2, Object arg3) {
        class156 var5 = new class156();
        var5.field1985 = arg0;
        var5.field1989 = arg1;
        var5.field1991 = arg3;
        synchronized (this) {
            if (this.field2000 == null) {
                this.field2000 = this.field1993 = var5;
            } else {
                this.field2000.field1988 = var5;
                this.field2000 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ft.n(Ljava/lang/String;IB)Lez;")
    public final class156 method2994(String arg0, int arg1) {
        return this.method2998(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ft.u(Ljava/lang/Runnable;II)Lez;")
    public final class156 method2995(Runnable arg0, int arg1) {
        return this.method2998(2, arg1, 0, arg0);
    }
}
