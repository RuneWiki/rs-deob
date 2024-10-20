package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eh")
public class class136 implements Runnable {

    @ObfuscatedName("eh.y")
    public class54 field2067;

    @ObfuscatedName("eh.u")
    public class146 field2064 = null;

    @ObfuscatedName("eh.k")
    public class146 field2066 = null;

    @ObfuscatedName("eh.j")
    public Thread field2070;

    @ObfuscatedName("eh.i")
    public boolean field2065 = false;

    @ObfuscatedName("eh.x")
    public EventQueue field2068;

    public class136() {
        Statics.field2069 = "Unknown";
        Statics.field2062 = "1.1";
        try {
            Statics.field2069 = System.getProperty("java.vendor");
            Statics.field2062 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2068 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2065 = false;
        this.field2070 = new Thread(this);
        this.field2070.setPriority(10);
        this.field2070.setDaemon(true);
        this.field2070.start();
    }

    @ObfuscatedName("eh.k(I)V")
    public final void method2755() {
        synchronized (this) {
            this.field2065 = true;
            this.notifyAll();
        }
        try {
            this.field2070.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class146 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2065) {
                        return;
                    }
                    if (this.field2064 != null) {
                        var2 = this.field2064;
                        this.field2064 = this.field2064.field2184;
                        if (this.field2064 == null) {
                            this.field2066 = null;
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
                int var5 = var2.field2188;
                if (var5 == 1) {
                    var2.field2183 = new Socket(InetAddress.getByName((String) var2.field2187), var2.field2189);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2187);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2189);
                    var2.field2183 = var6;
                } else if (var5 == 4) {
                    var2.field2183 = new DataInputStream(((URL) var2.field2187).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2189 >> 24 & 0xFF) + "." + (var2.field2189 >> 16 & 0xFF) + "." + (var2.field2189 >> 8 & 0xFF) + "." + (var2.field2189 & 0xFF);
                    var2.field2183 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2191 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2191 = 2;
            }
        }
    }

    @ObfuscatedName("eh.j(IIILjava/lang/Object;I)Lex;")
    public final class146 method2775(int arg0, int arg1, int arg2, Object arg3) {
        class146 var5 = new class146();
        var5.field2188 = arg0;
        var5.field2189 = arg1;
        var5.field2187 = arg3;
        synchronized (this) {
            if (this.field2066 == null) {
                this.field2066 = this.field2064 = var5;
            } else {
                this.field2066.field2184 = var5;
                this.field2066 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eh.i(Ljava/lang/String;II)Lex;")
    public final class146 method2757(String arg0, int arg1) {
        return this.method2775(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eh.x(Ljava/lang/Runnable;IB)Lex;")
    public final class146 method2756(Runnable arg0, int arg1) {
        return this.method2775(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eh.g(II)Lex;")
    public final class146 method2759(int arg0) {
        return this.method2775(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("eh.e(Ljava/net/URL;I)Lex;")
    public final class146 method2776(URL arg0) {
        return this.method2775(4, 0, 0, arg0);
    }

    @ObfuscatedName("eh.p(S)Lbx;")
    public final class54 method2761() {
        return this.field2067;
    }
}
