package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ee")
public class class136 implements Runnable {

    @ObfuscatedName("ee.r")
    public class54 field2086;

    @ObfuscatedName("ee.n")
    public class146 field2085 = null;

    @ObfuscatedName("ee.x")
    public class146 field2087 = null;

    @ObfuscatedName("ee.q")
    public Thread field2089;

    @ObfuscatedName("ee.h")
    public boolean field2090 = false;

    @ObfuscatedName("ee.d")
    public EventQueue field2095;

    public class136() {
        Statics.field2091 = "Unknown";
        Statics.field2093 = "1.1";
        try {
            Statics.field2091 = System.getProperty("java.vendor");
            Statics.field2093 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2095 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2090 = false;
        this.field2089 = new Thread(this);
        this.field2089.setPriority(10);
        this.field2089.setDaemon(true);
        this.field2089.start();
    }

    @ObfuscatedName("ee.x(B)V")
    public final void method2693() {
        synchronized (this) {
            this.field2090 = true;
            this.notifyAll();
        }
        try {
            this.field2089.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2090) {
                        return;
                    }
                    if (this.field2085 != null) {
                        var2 = this.field2085;
                        this.field2085 = this.field2085.field2196;
                        if (this.field2085 == null) {
                            this.field2087 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var5 = var2.field2198;
                if (var5 == 1) {
                    var2.field2197 = new Socket(InetAddress.getByName((String) var2.field2200), var2.field2199);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2200);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2199);
                    var2.field2197 = var6;
                } else if (var5 == 4) {
                    var2.field2197 = new DataInputStream(((URL) var2.field2200).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2199 >> 24 & 0xFF) + "." + (var2.field2199 >> 16 & 0xFF) + "." + (var2.field2199 >> 8 & 0xFF) + "." + (var2.field2199 & 0xFF);
                    var2.field2197 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2194 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2194 = 2;
            }
        }
    }

    @ObfuscatedName("ee.q(IIILjava/lang/Object;I)Leg;")
    public final class146 method2695(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2198 = arg0;
        var5.field2199 = arg1;
        var5.field2200 = arg3;
        synchronized (this) {
            if (this.field2087 == null) {
                this.field2087 = this.field2085 = var5;
            } else {
                this.field2087.field2196 = var5;
                this.field2087 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ee.h(Ljava/lang/String;II)Leg;")
    public final class146 method2696(String arg0, int arg1) {
        return this.method2695(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ee.d(Ljava/lang/Runnable;II)Leg;")
    public final class146 method2697(Runnable arg0, int arg1) {
        return this.method2695(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ee.c(IB)Leg;")
    public final class146 method2698(int arg0) {
        return this.method2695(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ee.y(Ljava/net/URL;I)Leg;")
    public final class146 method2699(URL arg0) {
        return this.method2695(4, 0, 0, arg0);
    }

    @ObfuscatedName("ee.m(I)Lbq;")
    public final class54 method2717() {
        return this.field2086;
    }
}
