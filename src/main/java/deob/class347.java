package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("mz")
public class class347 implements Runnable {

    @ObfuscatedName("mz.l")
    public Thread field3995;

    @ObfuscatedName("mz.q")
    public OutputStream field3996;

    @ObfuscatedName("mz.f")
    public int field4000;

    @ObfuscatedName("mz.j")
    public byte[] field3998;

    @ObfuscatedName("mz.m")
    public int field3999 = 0;

    @ObfuscatedName("mz.k")
    public int field4002 = 0;

    @ObfuscatedName("mz.t")
    public IOException field4001;

    @ObfuscatedName("mz.a")
    public boolean field3997;

    public class347(OutputStream arg0, int arg1) {
        this.field3996 = arg0;
        this.field4000 = arg1 + 1;
        this.field3998 = new byte[this.field4000];
        this.field3995 = new Thread(this);
        this.field3995.setDaemon(true);
        this.field3995.start();
    }

    @ObfuscatedName("mz.l(I)Z")
    public boolean method5646() {
        if (!this.field3997) {
            return false;
        }
        try {
            this.field3996.close();
            if (this.field4001 == null) {
                this.field4001 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4001 == null) {
                this.field4001 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4001 != null) {
                        return;
                    }
                    if (this.field3999 <= this.field4002) {
                        var2 = this.field4002 - this.field3999;
                    } else {
                        var2 = this.field4002 + (this.field4000 - this.field3999);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3996.flush();
                    } catch (IOException var15) {
                        this.field4001 = var15;
                        return;
                    }
                    if (this.method5646()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3999 + var2 <= this.field4000) {
                    this.field3996.write(this.field3998, this.field3999, var2);
                } else {
                    int var6 = this.field4000 - this.field3999;
                    this.field3996.write(this.field3998, this.field3999, var6);
                    this.field3996.write(this.field3998, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4001 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3999 = (this.field3999 + var2) % this.field4000;
            }
        } while (!this.method5646());
    }

    @ObfuscatedName("mz.q([BIII)V")
    public void method5647(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4001 != null) {
                throw new IOException(this.field4001.toString());
            }
            int var5;
            if (this.field3999 <= this.field4002) {
                var5 = this.field3999 + (this.field4000 - this.field4002) - 1;
            } else {
                var5 = this.field3999 - this.field4002 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4002 + arg2 <= this.field4000) {
                System.arraycopy(arg0, arg1, this.field3998, this.field4002, arg2);
            } else {
                int var6 = this.field4000 - this.field4002;
                System.arraycopy(arg0, arg1, this.field3998, this.field4002, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3998, 0, arg2 - var6);
            }
            this.field4002 = (this.field4002 + arg2) % this.field4000;
            this.notifyAll();
        }
    }

    @ObfuscatedName("mz.f(I)V")
    public void method5648() {
        synchronized (this) {
            this.field3997 = true;
            this.notifyAll();
        }
        try {
            this.field3995.join();
        } catch (InterruptedException var4) {
        }
    }
}
