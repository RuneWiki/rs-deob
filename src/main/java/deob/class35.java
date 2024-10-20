package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("an")
public class class35 implements Runnable {

    @ObfuscatedName("an.a")
    public class15 field380;

    @ObfuscatedName("an.o")
    public class38 field381 = null;

    @ObfuscatedName("an.c")
    public class38 field382 = null;

    @ObfuscatedName("an.h")
    public Thread field384;

    @ObfuscatedName("an.r")
    public boolean field386 = false;

    @ObfuscatedName("an.d")
    public EventQueue field385;

    public class35() {
        Statics.field387 = "Unknown";
        Statics.field379 = "1.1";
        try {
            Statics.field387 = System.getProperty("java.vendor");
            Statics.field379 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field385 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field386 = false;
        this.field384 = new Thread(this);
        this.field384.setPriority(10);
        this.field384.setDaemon(true);
        this.field384.start();
    }

    @ObfuscatedName("an.a(I)V")
    public final void method405() {
        synchronized (this) {
            this.field386 = true;
            this.notifyAll();
        }
        try {
            this.field384.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class38 var2;
            synchronized (this) {
                while (true) {
                    if (this.field386) {
                        return;
                    }
                    if (this.field381 != null) {
                        var2 = this.field381;
                        this.field381 = this.field381.field516;
                        if (this.field381 == null) {
                            this.field382 = null;
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
                int var5 = var2.field512;
                if (var5 == 1) {
                    var2.field514 = new Socket(InetAddress.getByName((String) var2.field515), var2.field513);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field515);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field513);
                    var2.field514 = var6;
                } else if (var5 == 4) {
                    var2.field514 = new DataInputStream(((URL) var2.field515).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field513 >> 24 & 0xFF) + "." + (var2.field513 >> 16 & 0xFF) + "." + (var2.field513 >> 8 & 0xFF) + "." + (var2.field513 & 0xFF);
                    var2.field514 = InetAddress.getByName(var7).getHostName();
                }
                var2.field508 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field508 = 2;
            }
        }
    }

    @ObfuscatedName("an.o(IIILjava/lang/Object;B)Lap;")
    public final class38 method407(int arg0, int arg1, int arg2, Object arg3) {
        class38 var5 = new class38();
        var5.field512 = arg0;
        var5.field513 = arg1;
        var5.field515 = arg3;
        synchronized (this) {
            if (this.field382 == null) {
                this.field382 = this.field381 = var5;
            } else {
                this.field382.field516 = var5;
                this.field382 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("an.c(Ljava/lang/String;II)Lap;")
    public final class38 method408(String arg0, int arg1) {
        return this.method407(1, arg1, 0, arg0);
    }

    @ObfuscatedName("an.h(Ljava/lang/Runnable;II)Lap;")
    public final class38 method426(Runnable arg0, int arg1) {
        return this.method407(2, arg1, 0, arg0);
    }

    @ObfuscatedName("an.r(II)Lap;")
    public final class38 method412(int arg0) {
        return this.method407(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("an.d(Ljava/net/URL;I)Lap;")
    public final class38 method411(URL arg0) {
        return this.method407(4, 0, 0, arg0);
    }

    @ObfuscatedName("an.k(I)Le;")
    public final class15 method423() {
        return this.field380;
    }
}
