package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ea")
public class class153 implements Runnable {

    @ObfuscatedName("ea.h")
    public final Thread field1966 = new Thread(this);

    @ObfuscatedName("ea.v")
    public volatile boolean field1963;

    @ObfuscatedName("ea.x")
    public Queue field1962 = new LinkedList();

    public class153() {
        this.field1966.setPriority(1);
        this.field1966.start();
    }

    public void run() {
        while (!this.field1963) {
            try {
                class154 var2;
                synchronized (this) {
                    var2 = (class154) this.field1962.poll();
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
                    var6 = var2.field1969.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1973 = var8;
                    }
                    var2.field1970 = true;
                } catch (IOException var18) {
                    var2.field1970 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class352.method3694((String) null, var21);
            }
        }
    }

    @ObfuscatedName("ea.h(Ljava/net/URL;I)Lei;")
    public class154 method3125(URL arg0) {
        class154 var2 = new class154(arg0);
        synchronized (this) {
            this.field1962.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ea.v(B)V")
    public void method3127() {
        this.field1963 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1966.join();
        } catch (InterruptedException var5) {
        }
    }
}
