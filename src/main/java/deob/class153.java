package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("eh")
public class class153 implements Runnable {

    @ObfuscatedName("eh.m")
    public final Thread field1970 = new Thread(this);

    @ObfuscatedName("eh.o")
    public volatile boolean field1968;

    @ObfuscatedName("eh.q")
    public Queue field1969 = new LinkedList();

    public class153() {
        this.field1970.setPriority(1);
        this.field1970.start();
    }

    public void run() {
        while (!this.field1968) {
            try {
                class154 var2;
                synchronized (this) {
                    var2 = (class154) this.field1969.poll();
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
                    var6 = var2.field1973.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1972 = var8;
                    }
                    var2.field1974 = true;
                } catch (IOException var18) {
                    var2.field1974 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class351.method3425((String) null, var21);
            }
        }
    }

    @ObfuscatedName("eh.m(Ljava/net/URL;I)Leb;")
    public class154 method3108(URL arg0) {
        class154 var2 = new class154(arg0);
        synchronized (this) {
            this.field1969.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("eh.o(B)V")
    public void method3113() {
        this.field1968 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1970.join();
        } catch (InterruptedException var5) {
        }
    }
}
