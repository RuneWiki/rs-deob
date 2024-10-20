package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("mb")
public class class347 implements Runnable {

    @ObfuscatedName("mb.i")
    public Thread field3988;

    @ObfuscatedName("mb.w")
    public OutputStream field3989;

    @ObfuscatedName("mb.s")
    public int field3992;

    @ObfuscatedName("mb.a")
    public byte[] field3991;

    @ObfuscatedName("mb.o")
    public int field3993 = 0;

    @ObfuscatedName("mb.g")
    public int field3990 = 0;

    @ObfuscatedName("mb.e")
    public IOException field3994;

    @ObfuscatedName("mb.p")
    public boolean field3995;

    public class347(OutputStream arg0, int arg1) {
        this.field3989 = arg0;
        this.field3992 = arg1 + 1;
        this.field3991 = new byte[this.field3992];
        this.field3988 = new Thread(this);
        this.field3988.setDaemon(true);
        this.field3988.start();
    }

    @ObfuscatedName("mb.i(I)Z")
    public boolean method5626() {
        if (!this.field3995) {
            return false;
        }
        try {
            this.field3989.close();
            if (this.field3994 == null) {
                this.field3994 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3994 == null) {
                this.field3994 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3994 != null) {
                        return;
                    }
                    if (this.field3993 <= this.field3990) {
                        var2 = this.field3990 - this.field3993;
                    } else {
                        var2 = this.field3990 + (this.field3992 - this.field3993);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3989.flush();
                    } catch (IOException var15) {
                        this.field3994 = var15;
                        return;
                    }
                    if (this.method5626()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3993 + var2 <= this.field3992) {
                    this.field3989.write(this.field3991, this.field3993, var2);
                } else {
                    int var6 = this.field3992 - this.field3993;
                    this.field3989.write(this.field3991, this.field3993, var6);
                    this.field3989.write(this.field3991, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3994 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3993 = (this.field3993 + var2) % this.field3992;
            }
        } while (!this.method5626());
    }

    @ObfuscatedName("mb.w([BIIB)V")
    public void method5624(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3994 != null) {
                throw new IOException(this.field3994.toString());
            }
            int var5;
            if (this.field3993 <= this.field3990) {
                var5 = this.field3993 + (this.field3992 - this.field3990) - 1;
            } else {
                var5 = this.field3993 - this.field3990 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3990 + arg2 <= this.field3992) {
                System.arraycopy(arg0, arg1, this.field3991, this.field3990, arg2);
            } else {
                int var6 = this.field3992 - this.field3990;
                System.arraycopy(arg0, arg1, this.field3991, this.field3990, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3991, 0, arg2 - var6);
            }
            this.field3990 = (this.field3990 + arg2) % this.field3992;
            this.notifyAll();
        }
    }

    @ObfuscatedName("mb.s(I)V")
    public void method5625() {
        synchronized (this) {
            this.field3995 = true;
            this.notifyAll();
        }
        try {
            this.field3988.join();
        } catch (InterruptedException var4) {
        }
    }
}
