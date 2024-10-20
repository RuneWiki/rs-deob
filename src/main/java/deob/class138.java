package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("es")
public class class138 implements Runnable {

    @ObfuscatedName("es.f")
    public final Thread field1915 = new Thread(this);

    @ObfuscatedName("es.l")
    public volatile boolean field1913;

    @ObfuscatedName("es.w")
    public Queue field1914 = new LinkedList();

    public class138() {
        this.field1915.setPriority(1);
        this.field1915.start();
    }

    public void run() {
        while (!this.field1913) {
            try {
                class139 var2;
                synchronized (this) {
                    var2 = (class139) this.field1914.poll();
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
                    var6 = var2.field1925.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1922 = var8;
                    }
                    var2.field1921 = true;
                } catch (IOException var18) {
                    var2.field1921 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class155.method2919((String) null, var21);
            }
        }
    }

    @ObfuscatedName("es.f(Ljava/net/URL;I)Lea;")
    public class139 method2937(URL arg0) {
        class139 var2 = new class139(arg0);
        synchronized (this) {
            this.field1914.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("es.l(I)V")
    public void method2928() {
        this.field1913 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1915.join();
        } catch (InterruptedException var5) {
        }
    }
}
