package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("eo")
public class class144 implements Runnable {

    @ObfuscatedName("eo.f")
    public final Thread field1920 = new Thread(this);

    @ObfuscatedName("eo.i")
    public volatile boolean field1921;

    @ObfuscatedName("eo.y")
    public Queue field1918 = new LinkedList();

    public class144() {
        this.field1920.setPriority(1);
        this.field1920.start();
    }

    public void run() {
        while (!this.field1921) {
            try {
                class145 var2;
                synchronized (this) {
                    var2 = (class145) this.field1918.poll();
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
                        var2.field1924 = var8;
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
                class341.method5815((String) null, var21);
            }
        }
    }

    @ObfuscatedName("eo.f(Ljava/net/URL;I)Lex;")
    public class145 method3027(URL arg0) {
        class145 var2 = new class145(arg0);
        synchronized (this) {
            this.field1918.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("eo.i(I)V")
    public void method3028() {
        this.field1921 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1920.join();
        } catch (InterruptedException var5) {
        }
    }
}
