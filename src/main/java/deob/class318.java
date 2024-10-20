package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("ld")
public class class318 implements Runnable {

    @ObfuscatedName("ld.f")
    public Thread field3809;

    @ObfuscatedName("ld.b")
    public OutputStream field3806;

    @ObfuscatedName("ld.l")
    public int field3807;

    @ObfuscatedName("ld.m")
    public byte[] field3812;

    @ObfuscatedName("ld.z")
    public int field3808 = 0;

    @ObfuscatedName("ld.q")
    public int field3810 = 0;

    @ObfuscatedName("ld.k")
    public IOException field3811;

    @ObfuscatedName("ld.c")
    public boolean field3805;

    public class318(OutputStream arg0, int arg1) {
        this.field3806 = arg0;
        this.field3807 = arg1 + 1;
        this.field3812 = new byte[this.field3807];
        this.field3809 = new Thread(this);
        this.field3809.setDaemon(true);
        this.field3809.start();
    }

    @ObfuscatedName("ld.f(B)Z")
    public boolean method5488() {
        if (!this.field3805) {
            return false;
        }
        try {
            this.field3806.close();
            if (this.field3811 == null) {
                this.field3811 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3811 == null) {
                this.field3811 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3811 != null) {
                        return;
                    }
                    if (this.field3808 <= this.field3810) {
                        var2 = this.field3810 - this.field3808;
                    } else {
                        var2 = this.field3810 + (this.field3807 - this.field3808);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3806.flush();
                    } catch (IOException var15) {
                        this.field3811 = var15;
                        return;
                    }
                    if (this.method5488()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3808 + var2 <= this.field3807) {
                    this.field3806.write(this.field3812, this.field3808, var2);
                } else {
                    int var6 = this.field3807 - this.field3808;
                    this.field3806.write(this.field3812, this.field3808, var6);
                    this.field3806.write(this.field3812, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3811 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3808 = (this.field3808 + var2) % this.field3807;
            }
        } while (!this.method5488());
    }

    @ObfuscatedName("ld.b([BIIB)V")
    public void method5490(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3811 != null) {
                throw new IOException(this.field3811.toString());
            }
            int var5;
            if (this.field3808 <= this.field3810) {
                var5 = this.field3808 + (this.field3807 - this.field3810) - 1;
            } else {
                var5 = this.field3808 - this.field3810 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3810 + arg2 <= this.field3807) {
                System.arraycopy(arg0, arg1, this.field3812, this.field3810, arg2);
            } else {
                int var6 = this.field3807 - this.field3810;
                System.arraycopy(arg0, arg1, this.field3812, this.field3810, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3812, 0, arg2 - var6);
            }
            this.field3810 = (this.field3810 + arg2) % this.field3807;
            this.notifyAll();
        }
    }

    @ObfuscatedName("ld.l(I)V")
    public void method5491() {
        synchronized (this) {
            this.field3805 = true;
            this.notifyAll();
        }
        try {
            this.field3809.join();
        } catch (InterruptedException var4) {
        }
    }
}
