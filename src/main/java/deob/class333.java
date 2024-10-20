package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("lv")
public class class333 implements Runnable {

    @ObfuscatedName("lv.f")
    public Thread field3872;

    @ObfuscatedName("lv.e")
    public OutputStream field3869;

    @ObfuscatedName("lv.v")
    public int field3871;

    @ObfuscatedName("lv.y")
    public byte[] field3870;

    @ObfuscatedName("lv.j")
    public int field3873 = 0;

    @ObfuscatedName("lv.o")
    public int field3874 = 0;

    @ObfuscatedName("lv.m")
    public IOException field3875;

    @ObfuscatedName("lv.r")
    public boolean field3876;

    public class333(OutputStream arg0, int arg1) {
        this.field3869 = arg0;
        this.field3871 = arg1 + 1;
        this.field3870 = new byte[this.field3871];
        this.field3872 = new Thread(this);
        this.field3872.setDaemon(true);
        this.field3872.start();
    }

    @ObfuscatedName("lv.f(I)Z")
    public boolean method5308() {
        if (!this.field3876) {
            return false;
        }
        try {
            this.field3869.close();
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
                    if (this.field3873 <= this.field3874) {
                        var2 = this.field3874 - this.field3873;
                    } else {
                        var2 = this.field3874 + (this.field3871 - this.field3873);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3869.flush();
                    } catch (IOException var15) {
                        this.field3875 = var15;
                        return;
                    }
                    if (this.method5308()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3873 + var2 <= this.field3871) {
                    this.field3869.write(this.field3870, this.field3873, var2);
                } else {
                    int var6 = this.field3871 - this.field3873;
                    this.field3869.write(this.field3870, this.field3873, var6);
                    this.field3869.write(this.field3870, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3875 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3873 = (this.field3873 + var2) % this.field3871;
            }
        } while (!this.method5308());
    }

    @ObfuscatedName("lv.e([BIII)V")
    public void method5316(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3875 != null) {
                throw new IOException(this.field3875.toString());
            }
            int var5;
            if (this.field3873 <= this.field3874) {
                var5 = this.field3873 + (this.field3871 - this.field3874) - 1;
            } else {
                var5 = this.field3873 - this.field3874 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3874 + arg2 <= this.field3871) {
                System.arraycopy(arg0, arg1, this.field3870, this.field3874, arg2);
            } else {
                int var6 = this.field3871 - this.field3874;
                System.arraycopy(arg0, arg1, this.field3870, this.field3874, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3870, 0, arg2 - var6);
            }
            this.field3874 = (this.field3874 + arg2) % this.field3871;
            this.notifyAll();
        }
    }

    @ObfuscatedName("lv.v(B)V")
    public void method5311() {
        synchronized (this) {
            this.field3876 = true;
            this.notifyAll();
        }
        try {
            this.field3872.join();
        } catch (InterruptedException var4) {
        }
    }
}
