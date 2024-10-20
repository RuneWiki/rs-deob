package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("bf")
public class class70 implements Runnable {

    @ObfuscatedName("bf.e")
    public final Thread field834 = new Thread(this);

    @ObfuscatedName("bf.n")
    public volatile boolean field830;

    @ObfuscatedName("bf.g")
    public Queue field831 = new LinkedList();

    public class70() {
        this.field834.setPriority(1);
        this.field834.start();
    }

    public void run() {
        while (!this.field830) {
            try {
                class84 var2;
                synchronized (this) {
                    var2 = (class84) this.field831.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                        continue;
                    }
                }
                try {
                    URLConnection var5 = var2.field1324.openConnection();
                    var5.setConnectTimeout(30000);
                    int var6 = var5.getContentLength();
                    if (var6 >= 0) {
                        byte[] var7 = new byte[var6];
                        (new DataInputStream(var5.getInputStream())).readFully(var7);
                        var2.field1321 = var7;
                    }
                    var2.field1322 = true;
                } catch (IOException var11) {
                    var2.field1322 = true;
                }
            } catch (Exception var13) {
                class154.method1592((String) null, var13);
            }
        }
    }

    @ObfuscatedName("bf.e(Ljava/net/URL;I)Lcu;")
    public class84 method1004(URL arg0) {
        class84 var2 = new class84(arg0);
        synchronized (this) {
            this.field831.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("bf.n(I)V")
    public void method1005() {
        this.field830 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field834.join();
        } catch (InterruptedException var5) {
        }
    }
}
