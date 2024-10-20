package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ed")
public class class148 implements Runnable {

    @ObfuscatedName("ed.d")
    public final Thread field2099 = new Thread(this);

    @ObfuscatedName("ed.z")
    public volatile boolean field2104;

    @ObfuscatedName("ed.n")
    public Queue field2100 = new LinkedList();

    public class148() {
        this.field2099.setPriority(1);
        this.field2099.start();
    }

    public void run() {
        while (!this.field2104) {
            try {
                class149 var2;
                synchronized (this) {
                    var2 = (class149) this.field2100.poll();
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
                    var6 = var2.field2105.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field2107 = var8;
                    }
                    var2.field2106 = true;
                } catch (IOException var18) {
                    var2.field2106 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class165.method2426((String) null, var21);
            }
        }
    }

    @ObfuscatedName("ed.d(Ljava/net/URL;I)Lez;")
    public class149 method2910(URL arg0) {
        class149 var2 = new class149(arg0);
        synchronized (this) {
            this.field2100.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ed.z(B)V")
    public void method2917() {
        this.field2104 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field2099.join();
        } catch (InterruptedException var5) {
        }
    }
}
