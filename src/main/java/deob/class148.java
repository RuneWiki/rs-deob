package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ef")
public class class148 implements Runnable {

    @ObfuscatedName("ef.c")
    public final Thread field2117 = new Thread(this);

    @ObfuscatedName("ef.i")
    public volatile boolean field2113;

    @ObfuscatedName("ef.o")
    public Queue field2115 = new LinkedList();

    public class148() {
        this.field2117.setPriority(1);
        this.field2117.start();
    }

    public void run() {
        while (!this.field2113) {
            try {
                class149 var2;
                synchronized (this) {
                    var2 = (class149) this.field2115.poll();
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
                    var6 = var2.field2120.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field2122 = var8;
                    }
                    var2.field2121 = true;
                } catch (IOException var18) {
                    var2.field2121 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class165.method2883((String) null, var21);
            }
        }
    }

    @ObfuscatedName("ef.c(Ljava/net/URL;S)Les;")
    public class149 method2871(URL arg0) {
        class149 var2 = new class149(arg0);
        synchronized (this) {
            this.field2115.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ef.i(I)V")
    public void method2872() {
        this.field2113 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field2117.join();
        } catch (InterruptedException var5) {
        }
    }
}
