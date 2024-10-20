package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("cn")
public class class87 implements Runnable {

    @ObfuscatedName("cn.s")
    public final Thread field1217 = new Thread(this);

    @ObfuscatedName("cn.t")
    public volatile boolean field1218;

    @ObfuscatedName("cn.v")
    public Queue field1220 = new LinkedList();

    public class87() {
        this.field1217.setPriority(1);
        this.field1217.start();
    }

    public void run() {
        while (!this.field1218) {
            try {
                class88 var2;
                synchronized (this) {
                    var2 = (class88) this.field1220.poll();
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
                    var6 = var2.field1222.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1224 = var8;
                    }
                    var2.field1223 = true;
                } catch (IOException var18) {
                    var2.field1223 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class409.method5337((String) null, var21);
            }
        }
    }

    @ObfuscatedName("cn.s(Ljava/net/URL;I)Lcd;")
    public class88 method2007(URL arg0) {
        class88 var2 = new class88(arg0);
        synchronized (this) {
            this.field1220.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("cn.t(B)V")
    public void method2008() {
        this.field1218 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1217.join();
        } catch (InterruptedException var5) {
        }
    }
}
