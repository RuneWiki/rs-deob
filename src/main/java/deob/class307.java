package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("kn")
public class class307 implements Runnable {

    @ObfuscatedName("kn.a")
    public Thread field3759;

    @ObfuscatedName("kn.t")
    public OutputStream field3764;

    @ObfuscatedName("kn.n")
    public int field3760;

    @ObfuscatedName("kn.q")
    public byte[] field3762;

    @ObfuscatedName("kn.v")
    public int field3763 = 0;

    @ObfuscatedName("kn.l")
    public int field3761 = 0;

    @ObfuscatedName("kn.c")
    public IOException field3765;

    @ObfuscatedName("kn.o")
    public boolean field3766;

    public class307(OutputStream arg0, int arg1) {
        this.field3764 = arg0;
        this.field3760 = arg1 + 1;
        this.field3762 = new byte[this.field3760];
        this.field3759 = new Thread(this);
        this.field3759.setDaemon(true);
        this.field3759.start();
    }

    @ObfuscatedName("kn.a(I)Z")
    public boolean method5429() {
        if (!this.field3766) {
            return false;
        }
        try {
            this.field3764.close();
            if (this.field3765 == null) {
                this.field3765 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3765 == null) {
                this.field3765 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3765 != null) {
                        return;
                    }
                    if (this.field3763 <= this.field3761) {
                        var2 = this.field3761 - this.field3763;
                    } else {
                        var2 = this.field3761 + (this.field3760 - this.field3763);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3764.flush();
                    } catch (IOException var15) {
                        this.field3765 = var15;
                        return;
                    }
                    if (this.method5429()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3763 + var2 <= this.field3760) {
                    this.field3764.write(this.field3762, this.field3763, var2);
                } else {
                    int var6 = this.field3760 - this.field3763;
                    this.field3764.write(this.field3762, this.field3763, var6);
                    this.field3764.write(this.field3762, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3765 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3763 = (this.field3763 + var2) % this.field3760;
            }
        } while (!this.method5429());
    }

    @ObfuscatedName("kn.t([BIII)V")
    public void method5431(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3765 != null) {
                throw new IOException(this.field3765.toString());
            }
            int var5;
            if (this.field3763 <= this.field3761) {
                var5 = this.field3763 + (this.field3760 - this.field3761) - 1;
            } else {
                var5 = this.field3763 - this.field3761 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3761 + arg2 <= this.field3760) {
                System.arraycopy(arg0, arg1, this.field3762, this.field3761, arg2);
            } else {
                int var6 = this.field3760 - this.field3761;
                System.arraycopy(arg0, arg1, this.field3762, this.field3761, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3762, 0, arg2 - var6);
            }
            this.field3761 = (this.field3761 + arg2) % this.field3760;
            this.notifyAll();
        }
    }

    @ObfuscatedName("kn.n(I)V")
    public void method5432() {
        synchronized (this) {
            this.field3766 = true;
            this.notifyAll();
        }
        try {
            this.field3759.join();
        } catch (InterruptedException var4) {
        }
    }
}
