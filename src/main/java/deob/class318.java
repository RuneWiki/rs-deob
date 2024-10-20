package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("lt")
public class class318 implements Runnable {

    @ObfuscatedName("lt.n")
    public Thread field3813;

    @ObfuscatedName("lt.v")
    public OutputStream field3811;

    @ObfuscatedName("lt.d")
    public int field3812;

    @ObfuscatedName("lt.c")
    public byte[] field3814;

    @ObfuscatedName("lt.y")
    public int field3815 = 0;

    @ObfuscatedName("lt.h")
    public int field3810 = 0;

    @ObfuscatedName("lt.z")
    public IOException field3816;

    @ObfuscatedName("lt.e")
    public boolean field3817;

    public class318(OutputStream arg0, int arg1) {
        this.field3811 = arg0;
        this.field3812 = arg1 + 1;
        this.field3814 = new byte[this.field3812];
        this.field3813 = new Thread(this);
        this.field3813.setDaemon(true);
        this.field3813.start();
    }

    @ObfuscatedName("lt.n(I)Z")
    public boolean method5572() {
        if (!this.field3817) {
            return false;
        }
        try {
            this.field3811.close();
            if (this.field3816 == null) {
                this.field3816 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3816 == null) {
                this.field3816 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3816 != null) {
                        return;
                    }
                    if (this.field3815 <= this.field3810) {
                        var2 = this.field3810 - this.field3815;
                    } else {
                        var2 = this.field3810 + (this.field3812 - this.field3815);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3811.flush();
                    } catch (IOException var15) {
                        this.field3816 = var15;
                        return;
                    }
                    if (this.method5572()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3815 + var2 <= this.field3812) {
                    this.field3811.write(this.field3814, this.field3815, var2);
                } else {
                    int var6 = this.field3812 - this.field3815;
                    this.field3811.write(this.field3814, this.field3815, var6);
                    this.field3811.write(this.field3814, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3816 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3815 = (this.field3815 + var2) % this.field3812;
            }
        } while (!this.method5572());
    }

    @ObfuscatedName("lt.v([BIIB)V")
    public void method5581(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3816 != null) {
                throw new IOException(this.field3816.toString());
            }
            int var5;
            if (this.field3815 <= this.field3810) {
                var5 = this.field3815 + (this.field3812 - this.field3810) - 1;
            } else {
                var5 = this.field3815 - this.field3810 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3810 + arg2 <= this.field3812) {
                System.arraycopy(arg0, arg1, this.field3814, this.field3810, arg2);
            } else {
                int var6 = this.field3812 - this.field3810;
                System.arraycopy(arg0, arg1, this.field3814, this.field3810, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3814, 0, arg2 - var6);
            }
            this.field3810 = (this.field3810 + arg2) % this.field3812;
            this.notifyAll();
        }
    }

    @ObfuscatedName("lt.d(I)V")
    public void method5574() {
        synchronized (this) {
            this.field3817 = true;
            this.notifyAll();
        }
        try {
            this.field3813.join();
        } catch (InterruptedException var4) {
        }
    }
}
