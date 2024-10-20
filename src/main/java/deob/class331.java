package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("ld")
public class class331 implements Runnable {

    @ObfuscatedName("ld.f")
    public Thread field3881;

    @ObfuscatedName("ld.o")
    public OutputStream field3876;

    @ObfuscatedName("ld.u")
    public int field3877;

    @ObfuscatedName("ld.p")
    public byte[] field3882;

    @ObfuscatedName("ld.b")
    public int field3878 = 0;

    @ObfuscatedName("ld.e")
    public int field3880 = 0;

    @ObfuscatedName("ld.k")
    public IOException field3875;

    @ObfuscatedName("ld.g")
    public boolean field3879;

    public class331(OutputStream arg0, int arg1) {
        this.field3876 = arg0;
        this.field3877 = arg1 + 1;
        this.field3882 = new byte[this.field3877];
        this.field3881 = new Thread(this);
        this.field3881.setDaemon(true);
        this.field3881.start();
    }

    @ObfuscatedName("ld.f(I)Z")
    public boolean method5255() {
        if (!this.field3879) {
            return false;
        }
        try {
            this.field3876.close();
            if (this.field3875 == null) {
                this.field3875 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3875 == null) {
                this.field3875 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3875 != null) {
                        return;
                    }
                    if (this.field3878 <= this.field3880) {
                        var2 = this.field3880 - this.field3878;
                    } else {
                        var2 = this.field3880 + (this.field3877 - this.field3878);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3876.flush();
                    } catch (IOException var15) {
                        this.field3875 = var15;
                        return;
                    }
                    if (this.method5255()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3878 + var2 <= this.field3877) {
                    this.field3876.write(this.field3882, this.field3878, var2);
                } else {
                    int var6 = this.field3877 - this.field3878;
                    this.field3876.write(this.field3882, this.field3878, var6);
                    this.field3876.write(this.field3882, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3875 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3878 = (this.field3878 + var2) % this.field3877;
            }
        } while (!this.method5255());
    }

    @ObfuscatedName("ld.o([BIII)V")
    public void method5268(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3875 != null) {
                throw new IOException(this.field3875.toString());
            }
            int var5;
            if (this.field3878 <= this.field3880) {
                var5 = this.field3878 + (this.field3877 - this.field3880) - 1;
            } else {
                var5 = this.field3878 - this.field3880 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3880 + arg2 <= this.field3877) {
                System.arraycopy(arg0, arg1, this.field3882, this.field3880, arg2);
            } else {
                int var6 = this.field3877 - this.field3880;
                System.arraycopy(arg0, arg1, this.field3882, this.field3880, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3882, 0, arg2 - var6);
            }
            this.field3880 = (this.field3880 + arg2) % this.field3877;
            this.notifyAll();
        }
    }

    @ObfuscatedName("ld.u(I)V")
    public void method5254() {
        synchronized (this) {
            this.field3879 = true;
            this.notifyAll();
        }
        try {
            this.field3881.join();
        } catch (InterruptedException var4) {
        }
    }
}
