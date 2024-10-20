package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("lo")
public class class317 implements Runnable {

    @ObfuscatedName("lo.x")
    public Thread field3780;

    @ObfuscatedName("lo.m")
    public OutputStream field3777;

    @ObfuscatedName("lo.k")
    public int field3778;

    @ObfuscatedName("lo.d")
    public byte[] field3779;

    @ObfuscatedName("lo.w")
    public int field3776 = 0;

    @ObfuscatedName("lo.v")
    public int field3781 = 0;

    @ObfuscatedName("lo.q")
    public IOException field3782;

    @ObfuscatedName("lo.z")
    public boolean field3783;

    public class317(OutputStream arg0, int arg1) {
        this.field3777 = arg0;
        this.field3778 = arg1 + 1;
        this.field3779 = new byte[this.field3778];
        this.field3780 = new Thread(this);
        this.field3780.setDaemon(true);
        this.field3780.start();
    }

    @ObfuscatedName("lo.x(B)Z")
    public boolean method5434() {
        if (!this.field3783) {
            return false;
        }
        try {
            this.field3777.close();
            if (this.field3782 == null) {
                this.field3782 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3782 == null) {
                this.field3782 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3782 != null) {
                        return;
                    }
                    if (this.field3776 <= this.field3781) {
                        var2 = this.field3781 - this.field3776;
                    } else {
                        var2 = this.field3781 + (this.field3778 - this.field3776);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3777.flush();
                    } catch (IOException var15) {
                        this.field3782 = var15;
                        return;
                    }
                    if (this.method5434()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3776 + var2 <= this.field3778) {
                    this.field3777.write(this.field3779, this.field3776, var2);
                } else {
                    int var6 = this.field3778 - this.field3776;
                    this.field3777.write(this.field3779, this.field3776, var6);
                    this.field3777.write(this.field3779, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3782 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3776 = (this.field3776 + var2) % this.field3778;
            }
        } while (!this.method5434());
    }

    @ObfuscatedName("lo.m([BIIS)V")
    public void method5433(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3782 != null) {
                throw new IOException(this.field3782.toString());
            }
            int var5;
            if (this.field3776 <= this.field3781) {
                var5 = this.field3776 + (this.field3778 - this.field3781) - 1;
            } else {
                var5 = this.field3776 - this.field3781 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3781 + arg2 <= this.field3778) {
                System.arraycopy(arg0, arg1, this.field3779, this.field3781, arg2);
            } else {
                int var6 = this.field3778 - this.field3781;
                System.arraycopy(arg0, arg1, this.field3779, this.field3781, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3779, 0, arg2 - var6);
            }
            this.field3781 = (this.field3781 + arg2) % this.field3778;
            this.notifyAll();
        }
    }

    @ObfuscatedName("lo.k(I)V")
    public void method5440() {
        synchronized (this) {
            this.field3783 = true;
            this.notifyAll();
        }
        try {
            this.field3780.join();
        } catch (InterruptedException var4) {
        }
    }
}
