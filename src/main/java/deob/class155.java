package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ev")
public class class155 implements Runnable {

    @ObfuscatedName("ev.s")
    public class154 field1956 = null;

    @ObfuscatedName("ev.l")
    public class154 field1954 = null;

    @ObfuscatedName("ev.u")
    public Thread field1958;

    @ObfuscatedName("ev.q")
    public boolean field1959 = false;

    public class155() {
        Statics.field1961 = "Unknown";
        Statics.field1955 = "1.6";
        try {
            Statics.field1961 = System.getProperty("java.vendor");
            Statics.field1955 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1959 = false;
        this.field1958 = new Thread(this);
        this.field1958.setPriority(10);
        this.field1958.setDaemon(true);
        this.field1958.start();
    }

    @ObfuscatedName("ev.z(I)V")
    public final void method3015() {
        synchronized (this) {
            this.field1959 = true;
            this.notifyAll();
        }
        try {
            this.field1958.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class154 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1959) {
                        return;
                    }
                    if (this.field1956 != null) {
                        var2 = this.field1956;
                        this.field1956 = this.field1956.field1948;
                        if (this.field1956 == null) {
                            this.field1954 = null;
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
                int var5 = var2.field1950;
                if (var5 == 1) {
                    var2.field1945 = new Socket(InetAddress.getByName((String) var2.field1952), var2.field1951);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1952);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1951);
                    var2.field1945 = var6;
                } else if (var5 == 4) {
                    var2.field1945 = new DataInputStream(((URL) var2.field1952).openStream());
                }
                var2.field1947 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1947 = 2;
            }
        }
    }

    @ObfuscatedName("ev.w(IIILjava/lang/Object;I)Lee;")
    public final class154 method3010(int arg0, int arg1, int arg2, Object arg3) {
        class154 var5 = new class154();
        var5.field1950 = arg0;
        var5.field1951 = arg1;
        var5.field1952 = arg3;
        synchronized (this) {
            if (this.field1954 == null) {
                this.field1954 = this.field1956 = var5;
            } else {
                this.field1954.field1948 = var5;
                this.field1954 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ev.s(Ljava/lang/String;II)Lee;")
    public final class154 method3018(String arg0, int arg1) {
        return this.method3010(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ev.l(Ljava/lang/Runnable;II)Lee;")
    public final class154 method3008(Runnable arg0, int arg1) {
        return this.method3010(2, arg1, 0, arg0);
    }
}
