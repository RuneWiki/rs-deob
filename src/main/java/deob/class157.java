package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ff")
public class class157 implements Runnable {

    @ObfuscatedName("ff.y")
    public class156 field2152 = null;

    @ObfuscatedName("ff.r")
    public class156 field2155 = null;

    @ObfuscatedName("ff.h")
    public Thread field2156;

    @ObfuscatedName("ff.d")
    public boolean field2157 = false;

    public class157() {
        Statics.field2158 = "Unknown";
        Statics.field2153 = "1.6";
        try {
            Statics.field2158 = System.getProperty("java.vendor");
            Statics.field2153 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field2157 = false;
        this.field2156 = new Thread(this);
        this.field2156.setPriority(10);
        this.field2156.setDaemon(true);
        this.field2156.start();
    }

    @ObfuscatedName("ff.n(I)V")
    public final void method2778() {
        synchronized (this) {
            this.field2157 = true;
            this.notifyAll();
        }
        try {
            this.field2156.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class156 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2157) {
                        return;
                    }
                    if (this.field2152 != null) {
                        var2 = this.field2152;
                        this.field2152 = this.field2152.field2149;
                        if (this.field2152 == null) {
                            this.field2155 = null;
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
                int var5 = var2.field2148;
                if (var5 == 1) {
                    var2.field2151 = new Socket(InetAddress.getByName((String) var2.field2143), var2.field2146);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2143);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2146);
                    var2.field2151 = var6;
                } else if (var5 == 4) {
                    var2.field2151 = new DataInputStream(((URL) var2.field2143).openStream());
                }
                var2.field2145 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field2145 = 2;
            }
        }
    }

    @ObfuscatedName("ff.v(IIILjava/lang/Object;I)Let;")
    public final class156 method2780(int arg0, int arg1, int arg2, Object arg3) {
        class156 var5 = new class156();
        var5.field2148 = arg0;
        var5.field2146 = arg1;
        var5.field2143 = arg3;
        synchronized (this) {
            if (this.field2155 == null) {
                this.field2155 = this.field2152 = var5;
            } else {
                this.field2155.field2149 = var5;
                this.field2155 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ff.y(Ljava/lang/String;II)Let;")
    public final class156 method2781(String arg0, int arg1) {
        return this.method2780(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ff.r(Ljava/lang/Runnable;II)Let;")
    public final class156 method2782(Runnable arg0, int arg1) {
        return this.method2780(2, arg1, 0, arg0);
    }
}
