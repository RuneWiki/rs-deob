package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("le")
public class class332 implements Runnable {

    @ObfuscatedName("le.v")
    public Thread field3878;

    @ObfuscatedName("le.n")
    public OutputStream field3874;

    @ObfuscatedName("le.f")
    public int field3876;

    @ObfuscatedName("le.y")
    public byte[] field3877;

    @ObfuscatedName("le.p")
    public int field3879 = 0;

    @ObfuscatedName("le.j")
    public int field3875 = 0;

    @ObfuscatedName("le.r")
    public IOException field3880;

    @ObfuscatedName("le.b")
    public boolean field3881;

    public class332(OutputStream arg0, int arg1) {
        this.field3874 = arg0;
        this.field3876 = arg1 + 1;
        this.field3877 = new byte[this.field3876];
        this.field3878 = new Thread(this);
        this.field3878.setDaemon(true);
        this.field3878.start();
    }

    @ObfuscatedName("le.v(B)Z")
    public boolean method5395() {
        if (!this.field3881) {
            return false;
        }
        try {
            this.field3874.close();
            if (this.field3880 == null) {
                this.field3880 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3880 == null) {
                this.field3880 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3880 != null) {
                        return;
                    }
                    if (this.field3879 <= this.field3875) {
                        var2 = this.field3875 - this.field3879;
                    } else {
                        var2 = this.field3875 + (this.field3876 - this.field3879);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3874.flush();
                    } catch (IOException var15) {
                        this.field3880 = var15;
                        return;
                    }
                    if (this.method5395()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3879 + var2 <= this.field3876) {
                    this.field3874.write(this.field3877, this.field3879, var2);
                } else {
                    int var6 = this.field3876 - this.field3879;
                    this.field3874.write(this.field3877, this.field3879, var6);
                    this.field3874.write(this.field3877, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3880 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3879 = (this.field3879 + var2) % this.field3876;
            }
        } while (!this.method5395());
    }

    @ObfuscatedName("le.n([BIII)V")
    public void method5398(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3880 != null) {
                throw new IOException(this.field3880.toString());
            }
            int var5;
            if (this.field3879 <= this.field3875) {
                var5 = this.field3879 + (this.field3876 - this.field3875) - 1;
            } else {
                var5 = this.field3879 - this.field3875 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3875 + arg2 <= this.field3876) {
                System.arraycopy(arg0, arg1, this.field3877, this.field3875, arg2);
            } else {
                int var6 = this.field3876 - this.field3875;
                System.arraycopy(arg0, arg1, this.field3877, this.field3875, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3877, 0, arg2 - var6);
            }
            this.field3875 = (this.field3875 + arg2) % this.field3876;
            this.notifyAll();
        }
    }

    @ObfuscatedName("le.f(B)V")
    public void method5396() {
        synchronized (this) {
            this.field3881 = true;
            this.notifyAll();
        }
        try {
            this.field3878.join();
        } catch (InterruptedException var4) {
        }
    }
}
