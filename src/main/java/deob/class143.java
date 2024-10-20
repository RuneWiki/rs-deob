package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ex")
public class class143 implements Runnable {

    @ObfuscatedName("ex.a")
    public final Thread field1937 = new Thread(this);

    @ObfuscatedName("ex.s")
    public volatile boolean field1936;

    @ObfuscatedName("ex.g")
    public Queue field1938 = new LinkedList();

    public class143() {
        this.field1937.setPriority(1);
        this.field1937.start();
    }

    public void run() {
        while (!this.field1936) {
            try {
                class144 var2;
                synchronized (this) {
                    var2 = (class144) this.field1938.poll();
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
                    var6 = var2.field1944.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1945 = var8;
                    }
                    var2.field1946 = true;
                } catch (IOException var18) {
                    var2.field1946 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class160.method2786((String) null, var21);
            }
        }
    }

    @ObfuscatedName("ex.a(Ljava/net/URL;I)Lez;")
    public class144 method3086(URL arg0) {
        class144 var2 = new class144(arg0);
        synchronized (this) {
            this.field1938.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ex.s(B)V")
    public void method3084() {
        this.field1936 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1937.join();
        } catch (InterruptedException var5) {
        }
    }
}
