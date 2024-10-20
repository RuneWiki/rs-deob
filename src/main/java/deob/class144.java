package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("en")
public class class144 implements Runnable {

    @ObfuscatedName("en.z")
    public final Thread field1921 = new Thread(this);

    @ObfuscatedName("en.n")
    public volatile boolean field1920;

    @ObfuscatedName("en.v")
    public Queue field1922 = new LinkedList();

    public class144() {
        this.field1921.setPriority(1);
        this.field1921.start();
    }

    public void run() {
        while (!this.field1920) {
            try {
                class145 var2;
                synchronized (this) {
                    var2 = (class145) this.field1922.poll();
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
                    var6 = var2.field1931.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1929 = var8;
                    }
                    var2.field1928 = true;
                } catch (IOException var18) {
                    var2.field1928 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class341.method511((String) null, var21);
            }
        }
    }

    @ObfuscatedName("en.z(Ljava/net/URL;I)Leh;")
    public class145 method2968(URL arg0) {
        class145 var2 = new class145(arg0);
        synchronized (this) {
            this.field1922.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("en.n(I)V")
    public void method2969() {
        this.field1920 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1921.join();
        } catch (InterruptedException var5) {
        }
    }
}
