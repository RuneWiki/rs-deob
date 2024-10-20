package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("eq")
public class class148 implements Runnable {

    @ObfuscatedName("eq.o")
    public final Thread field2126 = new Thread(this);

    @ObfuscatedName("eq.k")
    public volatile boolean field2125;

    @ObfuscatedName("eq.t")
    public Queue field2124 = new LinkedList();

    public class148() {
        this.field2126.setPriority(1);
        this.field2126.start();
    }

    public void run() {
        while (!this.field2125) {
            try {
                class149 var2;
                synchronized (this) {
                    var2 = (class149) this.field2124.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var17) {
                        }
                        continue;
                    }
                }
                DataInputStream var5 = null;
                URLConnection var6 = null;
                try {
                    var6 = var2.field2133.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field2135 = var8;
                    }
                    var2.field2134 = true;
                } catch (IOException var18) {
                    var2.field2134 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class165.method1744((String) null, var21);
            }
        }
    }

    @ObfuscatedName("eq.o(Ljava/net/URL;I)Lev;")
    public class149 method2841(URL arg0) {
        class149 var2 = new class149(arg0);
        synchronized (this) {
            this.field2124.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("eq.k(I)V")
    public void method2837() {
        this.field2125 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field2126.join();
        } catch (InterruptedException var5) {
        }
    }
}
