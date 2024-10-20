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

    @ObfuscatedName("ed.w")
    public final Thread field2183 = new Thread(this);

    @ObfuscatedName("ed.s")
    public volatile boolean field2182;

    @ObfuscatedName("ed.q")
    public Queue field2184 = new LinkedList();

    public class148() {
        this.field2183.setPriority(1);
        this.field2183.start();
    }

    public void run() {
        while (!this.field2182) {
            try {
                class149 var2;
                synchronized (this) {
                    var2 = (class149) this.field2184.poll();
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
                    var6 = var2.field2189.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field2191 = var8;
                    }
                    var2.field2193 = true;
                } catch (IOException var18) {
                    var2.field2193 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class153.method611((String) null, var21);
            }
        }
    }

    @ObfuscatedName("ed.w(Ljava/net/URL;I)Lex;")
    public class149 method2710(URL arg0) {
        class149 var2 = new class149(arg0);
        synchronized (this) {
            this.field2184.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ed.s(I)V")
    public void method2705() {
        this.field2182 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field2183.join();
        } catch (InterruptedException var5) {
        }
    }
}
