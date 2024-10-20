package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ee")
public class class149 implements Runnable {

    @ObfuscatedName("ee.a")
    public final Thread field2078 = new Thread(this);

    @ObfuscatedName("ee.w")
    public volatile boolean field2079;

    @ObfuscatedName("ee.e")
    public Queue field2080 = new LinkedList();

    public class149() {
        this.field2078.setPriority(1);
        this.field2078.start();
    }

    public void run() {
        while (!this.field2079) {
            try {
                class150 var2;
                synchronized (this) {
                    var2 = (class150) this.field2080.poll();
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
                    var6 = var2.field2089.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field2083 = var8;
                    }
                    var2.field2087 = true;
                } catch (IOException var18) {
                    var2.field2087 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class155.method1339((String) null, var21);
            }
        }
    }

    @ObfuscatedName("ee.a(Ljava/net/URL;I)Lep;")
    public class150 method2676(URL arg0) {
        class150 var2 = new class150(arg0);
        synchronized (this) {
            this.field2080.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ee.w(I)V")
    public void method2677() {
        this.field2079 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field2078.join();
        } catch (InterruptedException var5) {
        }
    }
}
