package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("er")
public class class136 implements Runnable {

    @ObfuscatedName("er.z")
    public final Thread field1855 = new Thread(this);

    @ObfuscatedName("er.w")
    public volatile boolean field1854;

    @ObfuscatedName("er.s")
    public Queue field1859 = new LinkedList();

    public class136() {
        this.field1855.setPriority(1);
        this.field1855.start();
    }

    public void run() {
        while (!this.field1854) {
            try {
                class137 var2;
                synchronized (this) {
                    var2 = (class137) this.field1859.poll();
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
                    var6 = var2.field1868.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1862 = var8;
                    }
                    var2.field1860 = true;
                } catch (IOException var18) {
                    var2.field1860 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class153.method66((String) null, var21);
            }
        }
    }

    @ObfuscatedName("er.z(Ljava/net/URL;I)Leh;")
    public class137 method2879(URL arg0) {
        class137 var2 = new class137(arg0);
        synchronized (this) {
            this.field1859.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("er.w(I)V")
    public void method2876() {
        this.field1854 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1855.join();
        } catch (InterruptedException var5) {
        }
    }
}
