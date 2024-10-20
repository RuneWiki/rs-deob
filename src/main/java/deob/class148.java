package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ex")
public class class148 implements Runnable {

    @ObfuscatedName("ex.d")
    public final Thread field2198 = new Thread(this);

    @ObfuscatedName("ex.k")
    public volatile boolean field2194;

    @ObfuscatedName("ex.e")
    public Queue field2196 = new LinkedList();

    public class148() {
        this.field2198.setPriority(1);
        this.field2198.start();
    }

    public void run() {
        while (!this.field2194) {
            try {
                class149 var2;
                synchronized (this) {
                    var2 = (class149) this.field2196.poll();
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
                    var6 = var2.field2202.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field2205 = var8;
                    }
                    var2.field2200 = true;
                } catch (IOException var18) {
                    var2.field2200 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class153.method1775((String) null, var21);
            }
        }
    }

    @ObfuscatedName("ex.d(Ljava/net/URL;B)Len;")
    public class149 method2715(URL arg0) {
        class149 var2 = new class149(arg0);
        synchronized (this) {
            this.field2196.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ex.k(B)V")
    public void method2716() {
        this.field2194 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field2198.join();
        } catch (InterruptedException var5) {
        }
    }
}
