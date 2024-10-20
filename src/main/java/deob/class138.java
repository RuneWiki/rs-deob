package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ec")
public class class138 implements Runnable {

    @ObfuscatedName("ec.g")
    public final Thread field1916 = new Thread(this);

    @ObfuscatedName("ec.r")
    public volatile boolean field1910;

    @ObfuscatedName("ec.e")
    public Queue field1909 = new LinkedList();

    public class138() {
        this.field1916.setPriority(1);
        this.field1916.start();
    }

    public void run() {
        while (!this.field1910) {
            try {
                class139 var2;
                synchronized (this) {
                    var2 = (class139) this.field1909.poll();
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
                    var6 = var2.field1921.openConnection();
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
                    var2.field1923 = true;
                } catch (IOException var18) {
                    var2.field1923 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class155.method1917((String) null, var21);
            }
        }
    }

    @ObfuscatedName("ec.g(Ljava/net/URL;I)Leg;")
    public class139 method3054(URL arg0) {
        class139 var2 = new class139(arg0);
        synchronized (this) {
            this.field1909.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ec.r(I)V")
    public void method3050() {
        this.field1910 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1916.join();
        } catch (InterruptedException var5) {
        }
    }
}
