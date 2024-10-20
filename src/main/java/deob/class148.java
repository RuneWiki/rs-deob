package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ec")
public class class148 implements Runnable {

    @ObfuscatedName("ec.t")
    public final Thread field2091 = new Thread(this);

    @ObfuscatedName("ec.q")
    public volatile boolean field2089;

    @ObfuscatedName("ec.i")
    public Queue field2090 = new LinkedList();

    public class148() {
        this.field2091.setPriority(1);
        this.field2091.start();
    }

    public void run() {
        while (!this.field2089) {
            try {
                class149 var2;
                synchronized (this) {
                    var2 = (class149) this.field2090.poll();
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
                    var6 = var2.field2094.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field2095 = var8;
                    }
                    var2.field2096 = true;
                } catch (IOException var18) {
                    var2.field2096 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class165.method2453((String) null, var21);
            }
        }
    }

    @ObfuscatedName("ec.t(Ljava/net/URL;I)Lep;")
    public class149 method2834(URL arg0) {
        class149 var2 = new class149(arg0);
        synchronized (this) {
            this.field2090.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ec.q(I)V")
    public void method2843() {
        this.field2089 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field2091.join();
        } catch (InterruptedException var5) {
        }
    }
}
