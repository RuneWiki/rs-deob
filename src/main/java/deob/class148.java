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

    @ObfuscatedName("eq.g")
    public final Thread field2098 = new Thread(this);

    @ObfuscatedName("eq.e")
    public volatile boolean field2096;

    @ObfuscatedName("eq.b")
    public Queue field2095 = new LinkedList();

    public class148() {
        this.field2098.setPriority(1);
        this.field2098.start();
    }

    public void run() {
        while (!this.field2096) {
            try {
                class149 var2;
                synchronized (this) {
                    var2 = (class149) this.field2095.poll();
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
                    var6 = var2.field2102.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field2103 = var8;
                    }
                    var2.field2101 = true;
                } catch (IOException var18) {
                    var2.field2101 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class165.method4257((String) null, var21);
            }
        }
    }

    @ObfuscatedName("eq.g(Ljava/net/URL;I)Lek;")
    public class149 method2942(URL arg0) {
        class149 var2 = new class149(arg0);
        synchronized (this) {
            this.field2095.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("eq.e(B)V")
    public void method2944() {
        this.field2096 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field2098.join();
        } catch (InterruptedException var5) {
        }
    }
}
