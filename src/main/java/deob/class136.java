package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ep")
public class class136 implements Runnable {

    @ObfuscatedName("ep.w")
    public final Thread field1877 = new Thread(this);

    @ObfuscatedName("ep.m")
    public volatile boolean field1880;

    @ObfuscatedName("ep.q")
    public Queue field1878 = new LinkedList();

    public class136() {
        this.field1877.setPriority(1);
        this.field1877.start();
    }

    public void run() {
        while (!this.field1880) {
            try {
                class137 var2;
                synchronized (this) {
                    var2 = (class137) this.field1878.poll();
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
                    var6 = var2.field1887.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1884 = var8;
                    }
                    var2.field1883 = true;
                } catch (IOException var18) {
                    var2.field1883 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class153.method695((String) null, var21);
            }
        }
    }

    @ObfuscatedName("ep.w(Ljava/net/URL;I)Ler;")
    public class137 method2884(URL arg0) {
        class137 var2 = new class137(arg0);
        synchronized (this) {
            this.field1878.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ep.m(I)V")
    public void method2887() {
        this.field1880 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1877.join();
        } catch (InterruptedException var5) {
        }
    }
}
