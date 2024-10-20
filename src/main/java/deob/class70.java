package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("bt")
public class class70 implements Runnable {

    @ObfuscatedName("bt.j")
    public final Thread field849 = new Thread(this);

    @ObfuscatedName("bt.h")
    public volatile boolean field850;

    @ObfuscatedName("bt.f")
    public Queue field853 = new LinkedList();

    public class70() {
        this.field849.setPriority(1);
        this.field849.start();
    }

    public void run() {
        while (!this.field850) {
            try {
                class84 var2;
                synchronized (this) {
                    var2 = (class84) this.field853.poll();
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
                    var6 = var2.field1334.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1336 = var8;
                    }
                    var2.field1337 = true;
                } catch (IOException var18) {
                    var2.field1337 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                Statics.method1698((String) null, var21);
            }
        }
    }

    @ObfuscatedName("bt.j(Ljava/net/URL;B)Lcm;")
    public class84 method1040(URL arg0) {
        class84 var2 = new class84(arg0);
        synchronized (this) {
            this.field853.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("bt.h(B)V")
    public void method1039() {
        this.field850 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field849.join();
        } catch (InterruptedException var5) {
        }
    }
}
