package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("kq")
public class class307 implements Runnable {

    @ObfuscatedName("kq.c")
    public Thread field3766;

    @ObfuscatedName("kq.x")
    public OutputStream field3764;

    @ObfuscatedName("kq.t")
    public int field3763;

    @ObfuscatedName("kq.g")
    public byte[] field3765;

    @ObfuscatedName("kq.l")
    public int field3769 = 0;

    @ObfuscatedName("kq.u")
    public int field3768 = 0;

    @ObfuscatedName("kq.j")
    public IOException field3767;

    @ObfuscatedName("kq.v")
    public boolean field3770;

    public class307(OutputStream arg0, int arg1) {
        this.field3764 = arg0;
        this.field3763 = arg1 + 1;
        this.field3765 = new byte[this.field3763];
        this.field3766 = new Thread(this);
        this.field3766.setDaemon(true);
        this.field3766.start();
    }

    @ObfuscatedName("kq.c(S)Z")
    public boolean method5428() {
        if (!this.field3770) {
            return false;
        }
        try {
            this.field3764.close();
            if (this.field3767 == null) {
                this.field3767 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3767 == null) {
                this.field3767 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3767 != null) {
                        return;
                    }
                    if (this.field3769 <= this.field3768) {
                        var2 = this.field3768 - this.field3769;
                    } else {
                        var2 = this.field3768 + (this.field3763 - this.field3769);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3764.flush();
                    } catch (IOException var15) {
                        this.field3767 = var15;
                        return;
                    }
                    if (this.method5428()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3769 + var2 <= this.field3763) {
                    this.field3764.write(this.field3765, this.field3769, var2);
                } else {
                    int var6 = this.field3763 - this.field3769;
                    this.field3764.write(this.field3765, this.field3769, var6);
                    this.field3764.write(this.field3765, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3767 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3769 = (this.field3769 + var2) % this.field3763;
            }
        } while (!this.method5428());
    }

    @ObfuscatedName("kq.x([BIII)V")
    public void method5417(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3767 != null) {
                throw new IOException(this.field3767.toString());
            }
            int var5;
            if (this.field3769 <= this.field3768) {
                var5 = this.field3769 + (this.field3763 - this.field3768) - 1;
            } else {
                var5 = this.field3769 - this.field3768 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3768 + arg2 <= this.field3763) {
                System.arraycopy(arg0, arg1, this.field3765, this.field3768, arg2);
            } else {
                int var6 = this.field3763 - this.field3768;
                System.arraycopy(arg0, arg1, this.field3765, this.field3768, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3765, 0, arg2 - var6);
            }
            this.field3768 = (this.field3768 + arg2) % this.field3763;
            this.notifyAll();
        }
    }

    @ObfuscatedName("kq.t(B)V")
    public void method5419() {
        synchronized (this) {
            this.field3770 = true;
            this.notifyAll();
        }
        try {
            this.field3766.join();
        } catch (InterruptedException var4) {
        }
    }
}
