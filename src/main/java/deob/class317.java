package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("lf")
public class class317 implements Runnable {

    @ObfuscatedName("lf.z")
    public Thread field3804;

    @ObfuscatedName("lf.k")
    public OutputStream field3800;

    @ObfuscatedName("lf.s")
    public int field3807;

    @ObfuscatedName("lf.t")
    public byte[] field3802;

    @ObfuscatedName("lf.i")
    public int field3799 = 0;

    @ObfuscatedName("lf.o")
    public int field3803 = 0;

    @ObfuscatedName("lf.x")
    public IOException field3805;

    @ObfuscatedName("lf.w")
    public boolean field3806;

    public class317(OutputStream arg0, int arg1) {
        this.field3800 = arg0;
        this.field3807 = arg1 + 1;
        this.field3802 = new byte[this.field3807];
        this.field3804 = new Thread(this);
        this.field3804.setDaemon(true);
        this.field3804.start();
    }

    @ObfuscatedName("lf.z(B)Z")
    public boolean method5515() {
        if (!this.field3806) {
            return false;
        }
        try {
            this.field3800.close();
            if (this.field3805 == null) {
                this.field3805 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3805 == null) {
                this.field3805 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3805 != null) {
                        return;
                    }
                    if (this.field3799 <= this.field3803) {
                        var2 = this.field3803 - this.field3799;
                    } else {
                        var2 = this.field3803 + (this.field3807 - this.field3799);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3800.flush();
                    } catch (IOException var15) {
                        this.field3805 = var15;
                        return;
                    }
                    if (this.method5515()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3799 + var2 <= this.field3807) {
                    this.field3800.write(this.field3802, this.field3799, var2);
                } else {
                    int var6 = this.field3807 - this.field3799;
                    this.field3800.write(this.field3802, this.field3799, var6);
                    this.field3800.write(this.field3802, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3805 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3799 = (this.field3799 + var2) % this.field3807;
            }
        } while (!this.method5515());
    }

    @ObfuscatedName("lf.k([BIII)V")
    public void method5513(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3805 != null) {
                throw new IOException(this.field3805.toString());
            }
            int var5;
            if (this.field3799 <= this.field3803) {
                var5 = this.field3799 + (this.field3807 - this.field3803) - 1;
            } else {
                var5 = this.field3799 - this.field3803 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3803 + arg2 <= this.field3807) {
                System.arraycopy(arg0, arg1, this.field3802, this.field3803, arg2);
            } else {
                int var6 = this.field3807 - this.field3803;
                System.arraycopy(arg0, arg1, this.field3802, this.field3803, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3802, 0, arg2 - var6);
            }
            this.field3803 = (this.field3803 + arg2) % this.field3807;
            this.notifyAll();
        }
    }

    @ObfuscatedName("lf.s(S)V")
    public void method5514() {
        synchronized (this) {
            this.field3806 = true;
            this.notifyAll();
        }
        try {
            this.field3804.join();
        } catch (InterruptedException var4) {
        }
    }
}
