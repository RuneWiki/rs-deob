package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("lf")
public class class318 implements Runnable {

    @ObfuscatedName("lf.h")
    public Thread field3816;

    @ObfuscatedName("lf.v")
    public OutputStream field3814;

    @ObfuscatedName("lf.x")
    public int field3813;

    @ObfuscatedName("lf.w")
    public byte[] field3815;

    @ObfuscatedName("lf.t")
    public int field3817 = 0;

    @ObfuscatedName("lf.j")
    public int field3818 = 0;

    @ObfuscatedName("lf.n")
    public IOException field3819;

    @ObfuscatedName("lf.p")
    public boolean field3820;

    public class318(OutputStream arg0, int arg1) {
        this.field3814 = arg0;
        this.field3813 = arg1 + 1;
        this.field3815 = new byte[this.field3813];
        this.field3816 = new Thread(this);
        this.field3816.setDaemon(true);
        this.field3816.start();
    }

    @ObfuscatedName("lf.h(I)Z")
    public boolean method5423() {
        if (!this.field3820) {
            return false;
        }
        try {
            this.field3814.close();
            if (this.field3819 == null) {
                this.field3819 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3819 == null) {
                this.field3819 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3819 != null) {
                        return;
                    }
                    if (this.field3817 <= this.field3818) {
                        var2 = this.field3818 - this.field3817;
                    } else {
                        var2 = this.field3818 + (this.field3813 - this.field3817);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3814.flush();
                    } catch (IOException var15) {
                        this.field3819 = var15;
                        return;
                    }
                    if (this.method5423()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3817 + var2 <= this.field3813) {
                    this.field3814.write(this.field3815, this.field3817, var2);
                } else {
                    int var6 = this.field3813 - this.field3817;
                    this.field3814.write(this.field3815, this.field3817, var6);
                    this.field3814.write(this.field3815, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3819 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3817 = (this.field3817 + var2) % this.field3813;
            }
        } while (!this.method5423());
    }

    @ObfuscatedName("lf.v([BIII)V")
    public void method5425(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3819 != null) {
                throw new IOException(this.field3819.toString());
            }
            int var5;
            if (this.field3817 <= this.field3818) {
                var5 = this.field3817 + (this.field3813 - this.field3818) - 1;
            } else {
                var5 = this.field3817 - this.field3818 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3818 + arg2 <= this.field3813) {
                System.arraycopy(arg0, arg1, this.field3815, this.field3818, arg2);
            } else {
                int var6 = this.field3813 - this.field3818;
                System.arraycopy(arg0, arg1, this.field3815, this.field3818, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3815, 0, arg2 - var6);
            }
            this.field3818 = (this.field3818 + arg2) % this.field3813;
            this.notifyAll();
        }
    }

    @ObfuscatedName("lf.x(B)V")
    public void method5433() {
        synchronized (this) {
            this.field3820 = true;
            this.notifyAll();
        }
        try {
            this.field3816.join();
        } catch (InterruptedException var4) {
        }
    }
}
