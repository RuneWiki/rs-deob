package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("ow")
public class class400 implements Runnable {

    @ObfuscatedName("ow.a")
    public Thread field4525;

    @ObfuscatedName("ow.f")
    public OutputStream field4518;

    @ObfuscatedName("ow.c")
    public int field4519;

    @ObfuscatedName("ow.x")
    public byte[] field4520;

    @ObfuscatedName("ow.h")
    public int field4517 = 0;

    @ObfuscatedName("ow.j")
    public int field4522 = 0;

    @ObfuscatedName("ow.y")
    public IOException field4523;

    @ObfuscatedName("ow.d")
    public boolean field4524;

    public class400(OutputStream arg0, int arg1) {
        this.field4518 = arg0;
        this.field4519 = arg1 + 1;
        this.field4520 = new byte[this.field4519];
        this.field4525 = new Thread(this);
        this.field4525.setDaemon(true);
        this.field4525.start();
    }

    @ObfuscatedName("ow.a(I)Z")
    public boolean method6893() {
        if (!this.field4524) {
            return false;
        }
        try {
            this.field4518.close();
            if (this.field4523 == null) {
                this.field4523 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4523 == null) {
                this.field4523 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4523 != null) {
                        return;
                    }
                    if (this.field4517 <= this.field4522) {
                        var2 = this.field4522 - this.field4517;
                    } else {
                        var2 = this.field4522 + (this.field4519 - this.field4517);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4518.flush();
                    } catch (IOException var15) {
                        this.field4523 = var15;
                        return;
                    }
                    if (this.method6893()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4517 + var2 <= this.field4519) {
                    this.field4518.write(this.field4520, this.field4517, var2);
                } else {
                    int var6 = this.field4519 - this.field4517;
                    this.field4518.write(this.field4520, this.field4517, var6);
                    this.field4518.write(this.field4520, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4523 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4517 = (this.field4517 + var2) % this.field4519;
            }
        } while (!this.method6893());
    }

    @ObfuscatedName("ow.f([BIII)V")
    public void method6903(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4523 != null) {
                throw new IOException(this.field4523.toString());
            }
            int var5;
            if (this.field4517 <= this.field4522) {
                var5 = this.field4517 + (this.field4519 - this.field4522) - 1;
            } else {
                var5 = this.field4517 - this.field4522 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4522 + arg2 <= this.field4519) {
                System.arraycopy(arg0, arg1, this.field4520, this.field4522, arg2);
            } else {
                int var6 = this.field4519 - this.field4522;
                System.arraycopy(arg0, arg1, this.field4520, this.field4522, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4520, 0, arg2 - var6);
            }
            this.field4522 = (this.field4522 + arg2) % this.field4519;
            this.notifyAll();
        }
    }

    @ObfuscatedName("ow.c(I)V")
    public void method6896() {
        synchronized (this) {
            this.field4524 = true;
            this.notifyAll();
        }
        try {
            this.field4525.join();
        } catch (InterruptedException var4) {
        }
    }
}
