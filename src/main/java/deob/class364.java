package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("mj")
public class class364 implements Runnable {

    @ObfuscatedName("mj.c")
    public Thread field4198;

    @ObfuscatedName("mj.l")
    public OutputStream field4195;

    @ObfuscatedName("mj.s")
    public int field4193;

    @ObfuscatedName("mj.e")
    public byte[] field4196;

    @ObfuscatedName("mj.r")
    public int field4197 = 0;

    @ObfuscatedName("mj.o")
    public int field4194 = 0;

    @ObfuscatedName("mj.i")
    public IOException field4199;

    @ObfuscatedName("mj.w")
    public boolean field4200;

    public class364(OutputStream arg0, int arg1) {
        this.field4195 = arg0;
        this.field4193 = arg1 + 1;
        this.field4196 = new byte[this.field4193];
        this.field4198 = new Thread(this);
        this.field4198.setDaemon(true);
        this.field4198.start();
    }

    @ObfuscatedName("mj.c(I)Z")
    public boolean method5904() {
        if (!this.field4200) {
            return false;
        }
        try {
            this.field4195.close();
            if (this.field4199 == null) {
                this.field4199 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4199 == null) {
                this.field4199 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4199 != null) {
                        return;
                    }
                    if (this.field4197 <= this.field4194) {
                        var2 = this.field4194 - this.field4197;
                    } else {
                        var2 = this.field4194 + (this.field4193 - this.field4197);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4195.flush();
                    } catch (IOException var15) {
                        this.field4199 = var15;
                        return;
                    }
                    if (this.method5904()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4197 + var2 <= this.field4193) {
                    this.field4195.write(this.field4196, this.field4197, var2);
                } else {
                    int var6 = this.field4193 - this.field4197;
                    this.field4195.write(this.field4196, this.field4197, var6);
                    this.field4195.write(this.field4196, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4199 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4197 = (this.field4197 + var2) % this.field4193;
            }
        } while (!this.method5904());
    }

    @ObfuscatedName("mj.l([BIII)V")
    public void method5905(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4199 != null) {
                throw new IOException(this.field4199.toString());
            }
            int var5;
            if (this.field4197 <= this.field4194) {
                var5 = this.field4197 + (this.field4193 - this.field4194) - 1;
            } else {
                var5 = this.field4197 - this.field4194 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4194 + arg2 <= this.field4193) {
                System.arraycopy(arg0, arg1, this.field4196, this.field4194, arg2);
            } else {
                int var6 = this.field4193 - this.field4194;
                System.arraycopy(arg0, arg1, this.field4196, this.field4194, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4196, 0, arg2 - var6);
            }
            this.field4194 = (this.field4194 + arg2) % this.field4193;
            this.notifyAll();
        }
    }

    @ObfuscatedName("mj.s(I)V")
    public void method5906() {
        synchronized (this) {
            this.field4200 = true;
            this.notifyAll();
        }
        try {
            this.field4198.join();
        } catch (InterruptedException var4) {
        }
    }
}
