package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("eo")
public class class147 implements Runnable {

    @ObfuscatedName("eo.b")
    public final Thread field2068 = new Thread(this);

    @ObfuscatedName("eo.q")
    public volatile boolean field2067;

    @ObfuscatedName("eo.o")
    public Queue field2069 = new LinkedList();

    public class147() {
        this.field2068.setPriority(1);
        this.field2068.start();
    }

    public void run() {
        while (!this.field2067) {
            try {
                class148 var2;
                synchronized (this) {
                    var2 = (class148) this.field2069.poll();
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
                    var6 = var2.field2074.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field2071 = var8;
                    }
                    var2.field2073 = true;
                } catch (IOException var18) {
                    var2.field2073 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class164.method482((String) null, var21);
            }
        }
    }

    @ObfuscatedName("eo.b(Ljava/net/URL;B)Lec;")
    public class148 method2846(URL arg0) {
        class148 var2 = new class148(arg0);
        synchronized (this) {
            this.field2069.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("eo.q(B)V")
    public void method2844() {
        this.field2067 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field2068.join();
        } catch (InterruptedException var5) {
        }
    }
}
