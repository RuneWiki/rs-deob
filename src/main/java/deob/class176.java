package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fq")
public class class176 implements Runnable {

    @ObfuscatedName("fq.o")
    public Thread field2263;

    @ObfuscatedName("fq.k")
    public OutputStream field2264;

    @ObfuscatedName("fq.t")
    public int field2261;

    @ObfuscatedName("fq.d")
    public byte[] field2262;

    @ObfuscatedName("fq.h")
    public int field2260 = 0;

    @ObfuscatedName("fq.m")
    public int field2259 = 0;

    @ObfuscatedName("fq.z")
    public IOException field2265;

    @ObfuscatedName("fq.i")
    public boolean field2266;

    public class176(OutputStream arg0, int arg1) {
        this.field2264 = arg0;
        this.field2261 = arg1 + 1;
        this.field2262 = new byte[this.field2261];
        this.field2263 = new Thread(this);
        this.field2263.setDaemon(true);
        this.field2263.start();
    }

    @ObfuscatedName("fq.o(I)Z")
    public boolean method3064() {
        if (!this.field2266) {
            return false;
        }
        try {
            this.field2264.close();
            if (this.field2265 == null) {
                this.field2265 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2265 == null) {
                this.field2265 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2265 != null) {
                        return;
                    }
                    if (this.field2260 <= this.field2259) {
                        var2 = this.field2259 - this.field2260;
                    } else {
                        var2 = this.field2259 + (this.field2261 - this.field2260);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2264.flush();
                    } catch (IOException var15) {
                        this.field2265 = var15;
                        return;
                    }
                    if (this.method3064()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2260 + var2 <= this.field2261) {
                    this.field2264.write(this.field2262, this.field2260, var2);
                } else {
                    int var6 = this.field2261 - this.field2260;
                    this.field2264.write(this.field2262, this.field2260, var6);
                    this.field2264.write(this.field2262, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2265 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2260 = (this.field2260 + var2) % this.field2261;
            }
        } while (!this.method3064());
    }

    @ObfuscatedName("fq.k([BIII)V")
    public void method3065(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2265 != null) {
                throw new IOException(this.field2265.toString());
            }
            int var5;
            if (this.field2260 <= this.field2259) {
                var5 = this.field2260 + (this.field2261 - this.field2259) - 1;
            } else {
                var5 = this.field2260 - this.field2259 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2259 + arg2 <= this.field2261) {
                System.arraycopy(arg0, arg1, this.field2262, this.field2259, arg2);
            } else {
                int var6 = this.field2261 - this.field2259;
                System.arraycopy(arg0, arg1, this.field2262, this.field2259, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2262, 0, arg2 - var6);
            }
            this.field2259 = (this.field2259 + arg2) % this.field2261;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fq.t(I)V")
    public void method3066() {
        synchronized (this) {
            this.field2266 = true;
            this.notifyAll();
        }
        try {
            this.field2263.join();
        } catch (InterruptedException var4) {
        }
    }
}
