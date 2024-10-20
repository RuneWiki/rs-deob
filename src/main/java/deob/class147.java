package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ey")
public class class147 implements Runnable {

    @ObfuscatedName("ey.s")
    public final Thread field2077 = new Thread(this);

    @ObfuscatedName("ey.g")
    public volatile boolean field2076;

    @ObfuscatedName("ey.m")
    public Queue field2075 = new LinkedList();

    public class147() {
        this.field2077.setPriority(1);
        this.field2077.start();
    }

    public void run() {
        while (!this.field2076) {
            try {
                class148 var2;
                synchronized (this) {
                    var2 = (class148) this.field2075.poll();
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
                    var6 = var2.field2082.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field2081 = var8;
                    }
                    var2.field2080 = true;
                } catch (IOException var18) {
                    var2.field2080 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class155.method73((String) null, var21);
            }
        }
    }

    @ObfuscatedName("ey.s(Ljava/net/URL;B)Lea;")
    public class148 method2936(URL arg0) {
        class148 var2 = new class148(arg0);
        synchronized (this) {
            this.field2075.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ey.g(I)V")
    public void method2937() {
        this.field2076 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field2077.join();
        } catch (InterruptedException var5) {
        }
    }
}
