package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("mj")
public class class346 implements Runnable {

    @ObfuscatedName("mj.n")
    public Thread field3985;

    @ObfuscatedName("mj.c")
    public OutputStream field3982;

    @ObfuscatedName("mj.m")
    public int field3983;

    @ObfuscatedName("mj.k")
    public byte[] field3981;

    @ObfuscatedName("mj.o")
    public int field3988 = 0;

    @ObfuscatedName("mj.g")
    public int field3984 = 0;

    @ObfuscatedName("mj.z")
    public IOException field3987;

    @ObfuscatedName("mj.a")
    public boolean field3989;

    public class346(OutputStream arg0, int arg1) {
        this.field3982 = arg0;
        this.field3983 = arg1 + 1;
        this.field3981 = new byte[this.field3983];
        this.field3985 = new Thread(this);
        this.field3985.setDaemon(true);
        this.field3985.start();
    }

    @ObfuscatedName("mj.n(I)Z")
    public boolean method5612() {
        if (!this.field3989) {
            return false;
        }
        try {
            this.field3982.close();
            if (this.field3987 == null) {
                this.field3987 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3987 == null) {
                this.field3987 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3987 != null) {
                        return;
                    }
                    if (this.field3988 <= this.field3984) {
                        var2 = this.field3984 - this.field3988;
                    } else {
                        var2 = this.field3984 + (this.field3983 - this.field3988);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3982.flush();
                    } catch (IOException var15) {
                        this.field3987 = var15;
                        return;
                    }
                    if (this.method5612()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3988 + var2 <= this.field3983) {
                    this.field3982.write(this.field3981, this.field3988, var2);
                } else {
                    int var6 = this.field3983 - this.field3988;
                    this.field3982.write(this.field3981, this.field3988, var6);
                    this.field3982.write(this.field3981, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3987 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3988 = (this.field3988 + var2) % this.field3983;
            }
        } while (!this.method5612());
    }

    @ObfuscatedName("mj.c([BIII)V")
    public void method5602(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3987 != null) {
                throw new IOException(this.field3987.toString());
            }
            int var5;
            if (this.field3988 <= this.field3984) {
                var5 = this.field3988 + (this.field3983 - this.field3984) - 1;
            } else {
                var5 = this.field3988 - this.field3984 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3984 + arg2 <= this.field3983) {
                System.arraycopy(arg0, arg1, this.field3981, this.field3984, arg2);
            } else {
                int var6 = this.field3983 - this.field3984;
                System.arraycopy(arg0, arg1, this.field3981, this.field3984, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3981, 0, arg2 - var6);
            }
            this.field3984 = (this.field3984 + arg2) % this.field3983;
            this.notifyAll();
        }
    }

    @ObfuscatedName("mj.m(B)V")
    public void method5603() {
        synchronized (this) {
            this.field3989 = true;
            this.notifyAll();
        }
        try {
            this.field3985.join();
        } catch (InterruptedException var4) {
        }
    }
}
